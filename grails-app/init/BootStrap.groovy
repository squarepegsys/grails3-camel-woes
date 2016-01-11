class BootStrap {

    def init = { servletContext ->

        new Foo(bar:"42").save(failOnError:true)
    }
    def destroy = {
    }
}
