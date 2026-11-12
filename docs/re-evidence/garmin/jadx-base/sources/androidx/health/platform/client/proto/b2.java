package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends j0<b2, a> implements d1 {
    public static final int CHANGES_TOKEN_FIELD_NUMBER = 1;
    private static final b2 DEFAULT_INSTANCE;
    private static volatile l1<b2> PARSER;
    private int bitField0_;
    private String changesToken_ = "";

    static {
        b2 b2Var = new b2();
        DEFAULT_INSTANCE = b2Var;
        j0.r(b2.class, b2Var);
    }

    private b2() {
    }

    public static b2 t(byte[] bArr) {
        return (b2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new b2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "changesToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<b2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (b2.class) {
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

    public static final class a extends j0.a<b2, a> implements d1 {
        private a() {
            super(b2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
