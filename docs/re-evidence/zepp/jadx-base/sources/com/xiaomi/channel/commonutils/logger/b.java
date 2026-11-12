package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.channel.commonutils.android.f;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public abstract class b {
    private static int a = 2;
    private static Context b = null;
    private static boolean c = false;
    private static boolean d = false;
    private static String e = "XMPush-" + Process.myPid();
    private static LoggerInterface f = new a();
    private static final HashMap<Integer, Long> g = new HashMap<>();
    private static final HashMap<Integer, String> h = new HashMap<>();
    private static final Integer i = -1;
    private static AtomicInteger j = new AtomicInteger(1);

    public static class a implements LoggerInterface {
        private String a = b.e;

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Log.v(this.a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
            Log.v(this.a, str, th);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.a = str;
        }
    }

    public static int a() {
        return a;
    }

    public static Integer a(String str) {
        if (a > 1) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(j.incrementAndGet());
        g.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        h.put(numValueOf, str);
        f.log(str + " starts");
        return numValueOf;
    }

    public static String a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    public static void a(int i2) {
        if (i2 < 0 || i2 > 5) {
            a(2, "set log level as " + i2);
        }
        a = i2;
    }

    public static void a(int i2, String str) {
        if (i2 >= a) {
            f.log(str);
        }
    }

    public static void a(int i2, String str, Throwable th) {
        if (i2 >= a) {
            f.log(str, th);
        }
    }

    public static void a(int i2, Throwable th) {
        if (i2 >= a) {
            f.log("", th);
        }
    }

    public static void a(Context context) {
        b = context;
        if (f.m3427a(context)) {
            c = true;
        }
        if (f.m3426a()) {
            d = true;
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f = loggerInterface;
    }

    public static void a(Integer num) {
        if (a <= 1) {
            HashMap<Integer, Long> map = g;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = h.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f.log(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3434a(String str) {
        a(2, f(str));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3435a(String str, String str2) {
        a(2, h(str, str2));
    }

    public static void a(String str, Throwable th) {
        a(4, f(str), th);
    }

    public static void a(Throwable th) {
        a(4, th);
    }

    public static void b(String str) {
        a(0, f(str));
    }

    public static void c(String str) {
        a(1, f(str));
    }

    public static void d(String str) {
        a(4, f(str));
    }

    public static void e(String str) {
        if (!c) {
            Log.w(e, f(str));
            if (d) {
                return;
            }
        }
        m3434a(str);
    }

    private static String f(String str) {
        return g() + str;
    }

    private static String g() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    private static String h(String str, String str2) {
        return g() + a(str, str2);
    }
}
