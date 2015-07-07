package com.cxf.spring.services;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService(serviceName = "customerServices")
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public interface CustomerService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/customer1")
    public String getCustomer1();

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/customer2")
    public String getCustomer2();

}
