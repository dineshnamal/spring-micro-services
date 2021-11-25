package com.customerservice.api;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-25T12:54:58.297684+11:00[Australia/Sydney]")
@Controller
@RequestMapping("${openapi.customer.base-path:}")
public class CustomerApiController implements CustomerApi {

    private final CustomerApiDelegate delegate;

    public CustomerApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CustomerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CustomerApiDelegate() {});
    }

    @Override
    public CustomerApiDelegate getDelegate() {
        return delegate;
    }

}
