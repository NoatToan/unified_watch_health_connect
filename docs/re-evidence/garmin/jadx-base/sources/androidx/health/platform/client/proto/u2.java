package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends j0<u2, a> implements d1 {
    private static final u2 DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    private static volatile l1<u2> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";

    static {
        u2 u2Var = new u2();
        DEFAULT_INSTANCE = u2Var;
        j0.r(u2.class, u2Var);
    }

    private u2() {
    }

    public static void t(u2 u2Var, long j8) {
        u2Var.bitField0_ |= 1;
        u2Var.startTimeEpochMs_ = j8;
    }

    public static void u(u2 u2Var, long j8) {
        u2Var.bitField0_ |= 2;
        u2Var.endTimeEpochMs_ = j8;
    }

    public static void v(u2 u2Var, String str) {
        u2Var.getClass();
        str.getClass();
        u2Var.bitField0_ |= 4;
        u2Var.startLocalDateTime_ = str;
    }

    public static void w(u2 u2Var, String str) {
        u2Var.getClass();
        str.getClass();
        u2Var.bitField0_ |= 8;
        u2Var.endLocalDateTime_ = str;
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        t2 t2Var = null;
        switch (t2.f7789a[fVar.ordinal()]) {
            case 1:
                return new u2();
            case 2:
                return new a(t2Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<u2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (u2.class) {
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

    public static final class a extends j0.a<u2, a> implements d1 {
        private a() {
            super(u2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(t2 t2Var) {
            this();
        }
    }
}
