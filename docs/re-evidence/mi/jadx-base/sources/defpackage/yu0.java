package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class yu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40544a = new hv0().c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40545b = new aw0().c();
    public static final String c = new ew0().c();
    public static final String d = new qv0().c();
    public static final String e = new p1e().c();
    public static final String f = new v1e().c();
    public static final String g = new zs3().c();
    public static final String h = new orr().c();

    @Deprecated
    public static final ddk i;

    @Deprecated
    public static final ddk j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ddk f40546k;

    static {
        ddk ddkVarD = ddk.D();
        i = ddkVarD;
        j = ddkVarD;
        f40546k = ddkVarD;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        b();
    }

    public static void b() throws GeneralSecurityException {
        bze.b();
        hv0.l(true);
        qv0.l(true);
        aw0.n(true);
        ew0.m(true);
        zs3.l(true);
        p1e.l(true);
        v1e.l(true);
        orr.l(true);
        zu0.e();
    }
}
