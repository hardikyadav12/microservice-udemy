package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Accounts extends BaseEntity{

    @Column(name = "column_id")
    private Long customerId;

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
