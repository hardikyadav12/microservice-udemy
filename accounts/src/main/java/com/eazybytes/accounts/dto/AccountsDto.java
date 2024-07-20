package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|\\d{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Schema to hold account number"
    )
    private Long accountNumber;

    @Schema(
            description = "Schema to hold account type",
            example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Schema to hold Eazy Bank branch address"
    )
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;



}
