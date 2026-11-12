package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends j0<e2, a> implements d1 {
    public static final int DATA_TYPE_ID_PAIR_FIELD_NUMBER = 1;
    private static final e2 DEFAULT_INSTANCE;
    private static volatile l1<e2> PARSER;
    private int bitField0_;
    private y1 dataTypeIdPair_;

    static {
        e2 e2Var = new e2();
        DEFAULT_INSTANCE = e2Var;
        j0.r(e2.class, e2Var);
    }

    private e2() {
    }

    public static e2 t(byte[] bArr) {
        return (e2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new e2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "dataTypeIdPair_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<e2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (e2.class) {
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

    public static final class a extends j0.a<e2, a> implements d1 {
        private a() {
            super(e2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
