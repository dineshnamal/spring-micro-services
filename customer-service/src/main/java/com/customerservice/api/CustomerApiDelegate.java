package com.customerservice.api;

import com.customerservice.model.Customer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-25T12:54:58.297684+11:00[Australia/Sydney]")
public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customer : Add a new customer
     *
     * @param customer customer object that needs to be added (required)
     * @return Invalid input (status code 400)
     * @see CustomerApi#addCustomer
     */
    default ResponseEntity<Void> addCustomer(Customer customer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customer/getAll : Retreiece all customers
     *
     * @return successful operation (status code 200)
     * @see CustomerApi#getAllCustomers
     */
    default ResponseEntity<List<Customer>> getAllCustomers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"customerId\" : 6, \"id\" : 0, \"type\" : \"Corporate\", \"joinedDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Customer> <id>123456789</id> <customerId>123456789</customerId> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <joinedDate>2000-01-23T04:56:07.000Z</joinedDate> <type>aeiou</type> </Customer>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
