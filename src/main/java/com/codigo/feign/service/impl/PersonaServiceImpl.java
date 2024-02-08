package com.codigo.feign.service.impl;


import com.codigo.feign.aggregates.request.PersonaRequest;
import com.codigo.feign.aggregates.response.BaseResponse;
import com.codigo.feign.feignclient.ReniecClient;
import com.codigo.feign.repository.PersonaRepository;
import com.codigo.feign.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private  PersonaRepository personaRepository;

    private final   ReniecClient reniecClient;

    public PersonaServiceImpl(ReniecClient reniecClient) {
        this.reniecClient = reniecClient;
    }

    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        return null;
    }
}
