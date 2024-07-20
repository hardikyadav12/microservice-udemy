package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    @Schema(
            example = "Hardik Yadav",
            description = "Schema to hold customer name"
    )
    private String name;

    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(
            example = "hardik.ind12@gmail.com",
            description = "Schema to hold customer email address"
    )
    private String email;

    @Pattern(regexp = "(^$|\\d{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Accounts Details for the customer"
    )
    private AccountsDto accountsDto;

}
