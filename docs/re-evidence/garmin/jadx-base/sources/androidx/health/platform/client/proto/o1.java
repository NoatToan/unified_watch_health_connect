package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends j0<o1, a> implements d1 {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final o1 DEFAULT_INSTANCE;
    private static volatile l1<o1> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int accessType_;
    private int bitField0_;
    private q dataType_;
    private String permission_ = "";

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        j0.r(o1.class, o1Var);
    }

    private o1() {
    }

    public static void t(o1 o1Var, String str) {
        o1Var.getClass();
        str.getClass();
        o1Var.bitField0_ |= 4;
        o1Var.permission_ = str;
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    public static o1 w(byte[] bArr) {
        return (o1) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m1 m1Var = null;
        switch (m1.f7724a[fVar.ordinal()]) {
            case 1:
                return new o1();
            case 2:
                return new a(m1Var);
            case 3:
                n1 n1Var = n1.ACCESS_TYPE_UNKNOWN;
                return new t1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", n1.b.f7734a, "permission_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<o1> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (o1.class) {
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
            default:
                com.google.protobuf.a.m();
            case 7:
                return null;
        }
    }

    public final String u() {
        return this.permission_;
    }

    public static final class a extends j0.a<o1, a> implements d1 {
        private a() {
            super(o1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m1 m1Var) {
            this();
        }
    }
}
