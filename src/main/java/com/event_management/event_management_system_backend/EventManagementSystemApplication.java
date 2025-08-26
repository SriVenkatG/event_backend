@SpringBootApplication
public class EventManagementSystemApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EventManagementSystemApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EventManagementSystemApplication.class, args);
    }
}
