package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class bze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4746a = new dac().c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ddk f4747b;

    @Deprecated
    public static final ddk c;

    @Deprecated
    public static final ddk d;

    static {
        ddk ddkVarD = ddk.D();
        f4747b = ddkVarD;
        c = ddkVarD;
        d = ddkVarD;
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
        dac.m(true);
        dv0.n(true);
        eze.e();
    }
}
