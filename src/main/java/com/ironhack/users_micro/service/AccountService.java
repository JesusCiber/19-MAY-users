package com.ironhack.users_micro.service;

import com.ironhack.users_micro.dto.UserAccountDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountService {
    private final RestTemplate restTemplate;

    public AccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserAccountDTO getAccountByOwnerId(Long ownerId) {
        String url = "http://localhost:8081/api/account/" + ownerId;
        return restTemplate.getForObject(url, UserAccountDTO.class);
    }
}