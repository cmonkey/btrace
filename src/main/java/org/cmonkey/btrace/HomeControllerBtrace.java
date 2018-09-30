package org.cmonkey.btrace;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;

import static com.sun.btrace.BTraceUtils.Threads.jstackAll;

@BTrace
public class HomeControllerBtrace {

    @OnMethod(
            clazz = "com.haibeiteam.restful.controller.HomeController",
            method = "home",
            location = @Location(Kind.ENTRY)
    )
    public static void funcHome(){
        jstackAll();
    }
}
