package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends j0<a2, a> implements d1 {
    public static final int CLIENT_IDS_FIELD_NUMBER = 2;
    private static final a2 DEFAULT_INSTANCE;
    private static volatile l1<a2> PARSER = null;
    public static final int UIDS_FIELD_NUMBER = 1;
    private l0.d<y1> clientIds_;
    private l0.d<y1> uids_;

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        j0.r(a2.class, a2Var);
    }

    private a2() {
        s1<Object> s1Var = s1.f7778d;
        this.uids_ = s1Var;
        this.clientIds_ = s1Var;
    }

    public static void t(a2 a2Var, Iterable iterable) {
        l0.d<y1> dVar = a2Var.uids_;
        if (!dVar.isModifiable()) {
            a2Var.uids_ = j0.o(dVar);
        }
        androidx.health.platform.client.proto.a.c(iterable, a2Var.uids_);
    }

    public static void u(a2 a2Var, Iterable iterable) {
        l0.d<y1> dVar = a2Var.clientIds_;
        if (!dVar.isModifiable()) {
            a2Var.clientIds_ = j0.o(dVar);
        }
        androidx.health.platform.client.proto.a.c(iterable, a2Var.clientIds_);
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    public static a2 y(byte[] bArr) {
        return (a2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new a2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"uids_", y1.class, "clientIds_", y1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<a2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (a2.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new j0.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                com.google.protobuf.a.m();
                return null;
        }
    }

    public final l0.d v() {
        return this.clientIds_;
    }

    public final l0.d w() {
        return this.uids_;
    }

    public static final class a extends j0.a<a2, a> implements d1 {
        private a() {
            super(a2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
