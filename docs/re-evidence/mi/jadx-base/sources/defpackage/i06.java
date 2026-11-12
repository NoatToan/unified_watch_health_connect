package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class i06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20638a = new iw0().c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ddk f20639b = ddk.D();

    @Deprecated
    public static final ddk c = ddk.D();

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        b();
    }

    public static void b() throws GeneralSecurityException {
        iw0.n(true);
        j06.e();
    }
}
