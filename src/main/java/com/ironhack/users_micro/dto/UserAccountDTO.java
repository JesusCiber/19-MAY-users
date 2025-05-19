package com.ironhack.users_micro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountDTO {
    private Long id;
    private Long ownerId;
    private String isbn;
    private BigDecimal balance;

}