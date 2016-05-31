package camel.woes

import org.apache.camel.builder.RouteBuilder;

public class RouteService extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer://foo?delay=1").to("log:bar?level=ERROR");
    }
}
