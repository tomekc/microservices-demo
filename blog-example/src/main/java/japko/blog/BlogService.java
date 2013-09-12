package japko.blog;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class BlogService extends Service<BlogConfiguration> {

    public static void main(String[] args) throws Exception {
        new BlogService().run(args);
    }

	@Override
	public void initialize(Bootstrap<BlogConfiguration> bootstrap) {
	    bootstrap.setName("Blog");
	}

    @Override
    public void run(BlogConfiguration configuration, Environment environment) {
        // TODO: implement service, add resources, healthchecks etc...
    }

}
