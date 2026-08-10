package k.susa.web.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/user")
@Consumes({MediaType.APPLICATION_JSON})
//@Produces({MediaType.APPLICATION_XML})
public class User {

    @GET
    public String m(@QueryParam("orderBy") List<String> orderBy, @DefaultValue("100") @QueryParam("age") int age) {
        return "OrderBy: " +orderBy.toString()+ "Age:" + age;
    }

    @POST
    public String post(@FormParam("name") String name) {
        return "Username:"+name;
    }



}
