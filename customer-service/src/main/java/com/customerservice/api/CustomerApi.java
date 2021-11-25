/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.customerservice.api;

import com.customerservice.model.Customer;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-25T12:54:58.297684+11:00[Australia/Sydney]")
@Validated
@Api(value = "customer", description = "the customer API")
public interface CustomerApi {

    default CustomerApiDelegate getDelegate() {
        return new CustomerApiDelegate() {};
    }

    /**
     * POST /customer : Add a new customer
     *
     * @param customer customer object that needs to be added (required)
     * @return Invalid input (status code 400)
     */
    @ApiOperation(value = "Add a new customer", nickname = "addCustomer", notes = "", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid input") })
    @PostMapping(
        value = "/customer",
        consumes = { "application/json", "application/xml" }
    )
    default ResponseEntity<Void> addCustomer(@ApiParam(value = "customer object that needs to be added" ,required=true )  @Valid @RequestBody Customer customer) {
        return getDelegate().addCustomer(customer);
    }


    /**
     * GET /customer/getAll : Retreiece all customers
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Retreiece all customers", nickname = "getAllCustomers", notes = "", response = Customer.class, responseContainer = "List", tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Customer.class, responseContainer = "List") })
    @GetMapping(
        value = "/customer/getAll",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Customer>> getAllCustomers() {
        return getDelegate().getAllCustomers();
    }

}
