package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public class y53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tcp f39798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<x53>> f39799b;
    public static final ThreadLocal<SoftReference<gud>> c;

    static {
        f39798a = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? tcp.a() : null;
        f39799b = new ThreadLocal<>();
        c = new ThreadLocal<>();
    }

    public static byte[] a(String str) {
        return c().f(str);
    }

    public static x53 b() {
        ThreadLocal<SoftReference<x53>> threadLocal = f39799b;
        SoftReference<x53> softReference = threadLocal.get();
        x53 x53Var = softReference == null ? null : softReference.get();
        if (x53Var == null) {
            x53Var = new x53();
            tcp tcpVar = f39798a;
            threadLocal.set(tcpVar != null ? tcpVar.c(x53Var) : new SoftReference<>(x53Var));
        }
        return x53Var;
    }

    public static gud c() {
        ThreadLocal<SoftReference<gud>> threadLocal = c;
        SoftReference<gud> softReference = threadLocal.get();
        gud gudVar = softReference == null ? null : softReference.get();
        if (gudVar != null) {
            return gudVar;
        }
        gud gudVar2 = new gud();
        threadLocal.set(new SoftReference<>(gudVar2));
        return gudVar2;
    }

    public static char[] d(String str) {
        return c().g(str);
    }

    public static byte[] e(String str) {
        return c().h(str);
    }
}
