package k.susa.web.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/user")
@Consumes({MediaType.APPLICATION_JSON})
//@Produces({MediaType.APPLICATION_XML})
public class User {

    @GET
    public String m(@QueryParam("name") String name, @QueryParam("age") int age) {
        return "Name : " +name;
    }



}
