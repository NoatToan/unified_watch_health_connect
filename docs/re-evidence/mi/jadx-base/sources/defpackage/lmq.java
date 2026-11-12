package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class lmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile woe f25224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile int f25225b = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    public static volatile int c = 40;
    public static long d;
    public static long e;
    public static int f;
    public static volatile woe g;

    public static class a implements woe {
        @Override // defpackage.woe
        public void a(String str, Object... objArr) {
        }

        @Override // defpackage.woe
        public void b(String str, Object... objArr) {
        }

        @Override // defpackage.woe
        public void c(String str, Throwable th) {
        }

        @Override // defpackage.woe
        public void d(String str, Object... objArr) {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d = timeUnit.toMillis(1L);
        e = timeUnit.toMillis(10L);
        f = 0;
        g = new a();
    }

    public static int a() {
        return f25225b;
    }

    public static long b() {
        return e;
    }

    public static int c() {
        return c;
    }

    public static long d() {
        return d;
    }

    public static woe e() {
        woe woeVar = f25224a;
        return woeVar == null ? g : woeVar;
    }

    public static int f() {
        return f;
    }
}
