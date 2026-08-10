package k.susa.web.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;


@Path("/user")
public class User {

    public User() {
        System.out.println("User Created...");
    }


    @GET
    public String m() {
        return "user";
    }

    @POST
    public String post() {
        return "user";
    }

    @PUT
    public String put() {
        return "user";
    }


}
