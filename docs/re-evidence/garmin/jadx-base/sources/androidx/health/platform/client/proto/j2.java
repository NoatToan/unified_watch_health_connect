package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends j0<j2, a> implements d1 {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final j2 DEFAULT_INSTANCE;
    private static volatile l1<j2> PARSER;
    private l0.d<p> dataPoint_ = s1.f7778d;

    static {
        j2 j2Var = new j2();
        DEFAULT_INSTANCE = j2Var;
        j0.r(j2.class, j2Var);
    }

    private j2() {
    }

    public static void t(j2 j2Var, Iterable iterable) {
        l0.d<p> dVar = j2Var.dataPoint_;
        if (!dVar.isModifiable()) {
            j2Var.dataPoint_ = j0.o(dVar);
        }
        androidx.health.platform.client.proto.a.c(iterable, j2Var.dataPoint_);
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    public static j2 w(byte[] bArr) {
        return (j2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new j2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoint_", p.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<j2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (j2.class) {
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

    public final l0.d u() {
        return this.dataPoint_;
    }

    public static final class a extends j0.a<j2, a> implements d1 {
        private a() {
            super(j2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
