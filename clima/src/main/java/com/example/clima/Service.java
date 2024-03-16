package com.example.clima;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo(){
        String dadosMeteorologicos = "";
        String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=84bc65b5a10007b04082e5adbe3b6f14";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dadosMeteorologicos = responseEntity.getBody();
            System.out.println(dadosMeteorologicos);
        } else {
            dadosMeteorologicos = "Falha ao obter dados meteorológicos. Código de status: " + responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }
}
