package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes21.dex */
public class xy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final ThreadLocal<SoftReference<xw>> f53311b;
    private static final yg d;

    static {
        d = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? yg.d() : null;
        f53311b = new ThreadLocal<>();
    }

    public static xw a() {
        SoftReference<xw> softReference;
        ThreadLocal<SoftReference<xw>> threadLocal = f53311b;
        SoftReference<xw> softReference2 = threadLocal.get();
        xw xwVar = softReference2 == null ? null : softReference2.get();
        if (xwVar == null) {
            xwVar = new xw();
            yg ygVar = d;
            if (ygVar != null) {
                softReference = ygVar.b(xwVar);
            } else {
                softReference = new SoftReference<>(xwVar);
            }
            threadLocal.set(softReference);
        }
        return xwVar;
    }
}
