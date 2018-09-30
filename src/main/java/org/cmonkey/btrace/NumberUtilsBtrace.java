package org.cmonkey.btrace;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.jstack;
import static com.sun.btrace.BTraceUtils.println;

@BTrace
public class NumberUtilsBtrace {

    @OnMethod(
            clazz = "org.cmonkey.btrace.NumberUtils",
            method = "sum",
            location = @Location(Kind.RETURN))
    public static void func(@Return int sum) {
        println("trace ===============");
        println(BTraceUtils.Strings.strcat("result = ", BTraceUtils.Strings.str(sum)));
        jstack();
    }
}
