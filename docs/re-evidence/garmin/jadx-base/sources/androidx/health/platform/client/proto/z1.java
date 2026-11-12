package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends j0<z1, a> implements d1 {
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final z1 DEFAULT_INSTANCE;
    private static volatile l1<z1> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private l0.d<q> dataType_ = s1.f7778d;
    private u2 timeSpec_;

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        j0.r(z1.class, z1Var);
    }

    private z1() {
    }

    public static void t(z1 z1Var, u2 u2Var) {
        z1Var.getClass();
        z1Var.timeSpec_ = u2Var;
        z1Var.bitField0_ |= 1;
    }

    public static void u(z1 z1Var, q qVar) {
        z1Var.getClass();
        l0.d<q> dVar = z1Var.dataType_;
        if (!dVar.isModifiable()) {
            z1Var.dataType_ = j0.o(dVar);
        }
        z1Var.dataType_.add(qVar);
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    public static z1 w(byte[] bArr) {
        return (z1) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "timeSpec_", "dataType_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<z1> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (z1.class) {
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

    public static final class a extends j0.a<z1, a> implements d1 {
        private a() {
            super(z1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
