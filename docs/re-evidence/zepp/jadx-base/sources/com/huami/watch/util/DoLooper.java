package com.huami.watch.util;

import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
public class DoLooper {
    private static final String a = "Looper";
    private static final int b = 1000;

    public interface Function<R> {
        R apply() throws Exception;
    }

    public static class Result {
        public Object data;
        public boolean finish;
        public boolean success;

        public String toString() {
            return "<Finish: " + this.finish + ", Success: " + this.success + SearchCriteria.GT;
        }
    }

    public static boolean doLoop(Function<Result> function, int i) {
        return doLoop(function, (i * 1000) / 20, i);
    }

    public static boolean doLoop(Function<Result> function, int i, int i2) {
        Result result;
        Log.t(3).d(a, "Timeout Remain : " + i2 + "s, CheckInterval : " + i + "ms", new Object[0]);
        long j = (long) (i2 * 1000);
        while (j > 0) {
            float f = j / 1000.0f;
            try {
                result = function.apply();
            } catch (Exception e) {
                e.printStackTrace();
                result = new Result();
            }
            if (result.finish) {
                Log.t(3).d(a, "Timeout Remain : " + f + "s(" + (i2 - f) + "s), Success : " + result.success, new Object[0]);
                return result.success;
            }
            Log.v(a, "Timeout Remain : " + f + SOAP.XMLNS, new Object[0]);
            long j2 = (long) i;
            j -= j2;
            try {
                Thread.sleep(j2);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        Log.t(3).w(a, "Timeout!!", new Object[0]);
        return false;
    }
}
