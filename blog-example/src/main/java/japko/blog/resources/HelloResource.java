package japko.blog.resources;

import japko.blog.api.HelloMessage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;

/**
 * Created by tomek
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {


    @GET
    public HelloMessage sayHello() {
        return new HelloMessage("Hello from " + Calendar.getInstance().getTime());
    }


}
