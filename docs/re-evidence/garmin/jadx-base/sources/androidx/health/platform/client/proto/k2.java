package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends j0<k2, a> implements d1 {
    private static final k2 DEFAULT_INSTANCE;
    public static final int EXERCISEROUTE_FIELD_NUMBER = 2;
    private static volatile l1<k2> PARSER = null;
    public static final int SESSIONUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private p exerciseRoute_;
    private String sessionUid_ = "";

    static {
        k2 k2Var = new k2();
        DEFAULT_INSTANCE = k2Var;
        j0.r(k2.class, k2Var);
    }

    private k2() {
    }

    public static void t(k2 k2Var, String str) {
        k2Var.getClass();
        str.getClass();
        k2Var.bitField0_ |= 1;
        k2Var.sessionUid_ = str;
    }

    public static void u(k2 k2Var, p pVar) {
        k2Var.getClass();
        pVar.getClass();
        k2Var.exerciseRoute_ = pVar;
        k2Var.bitField0_ |= 2;
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    public static k2 y(byte[] bArr) {
        return (k2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new k2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sessionUid_", "exerciseRoute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<k2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (k2.class) {
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

    public final p v() {
        p pVar = this.exerciseRoute_;
        return pVar == null ? p.K() : pVar;
    }

    public final String w() {
        return this.sessionUid_;
    }

    public static final class a extends j0.a<k2, a> implements d1 {
        private a() {
            super(k2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
