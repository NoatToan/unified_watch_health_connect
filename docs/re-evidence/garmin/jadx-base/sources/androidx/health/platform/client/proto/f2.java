package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends j0<f2, a> implements d1 {
    private static final f2 DEFAULT_INSTANCE;
    private static volatile l1<f2> PARSER = null;
    public static final int SESSIONUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionUid_ = "";

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        j0.r(f2.class, f2Var);
    }

    private f2() {
    }

    public static f2 t(byte[] bArr) {
        return (f2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new f2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "sessionUid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<f2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (f2.class) {
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

    public static final class a extends j0.a<f2, a> implements d1 {
        private a() {
            super(f2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
