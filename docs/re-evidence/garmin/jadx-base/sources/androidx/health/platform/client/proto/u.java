package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class u extends j0<u, a> implements d1 {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    private static final u DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    private static volatile l1<u> PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        j0.r(u.class, uVar);
    }

    private u() {
    }

    public static void s(u uVar, String str) {
        uVar.getClass();
        uVar.valueCase_ = 3;
        uVar.value_ = str;
    }

    public static void t(u uVar, String str) {
        uVar.getClass();
        uVar.valueCase_ = 4;
        uVar.value_ = str;
    }

    public static void u(u uVar, boolean z14) {
        uVar.valueCase_ = 5;
        uVar.value_ = Boolean.valueOf(z14);
    }

    public static void w(u uVar, long j8) {
        uVar.valueCase_ = 1;
        uVar.value_ = Long.valueOf(j8);
    }

    public static void x(u uVar, double d14) {
        uVar.valueCase_ = 2;
        uVar.value_ = Double.valueOf(d14);
    }

    public static u y() {
        return DEFAULT_INSTANCE;
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000", new Object[]{"value_", "valueCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<u> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (u.class) {
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

    public static final class a extends j0.a<u, a> implements d1 {
        private a() {
            super(u.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
