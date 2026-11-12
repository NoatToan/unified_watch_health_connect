package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends j0<w1, a> implements d1 {
    public static final int DATA_ORIGIN_FIELD_NUMBER = 3;
    private static final w1 DEFAULT_INSTANCE;
    public static final int METRIC_SPEC_FIELD_NUMBER = 2;
    private static volatile l1<w1> PARSER = null;
    public static final int SLICE_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int SLICE_PERIOD_FIELD_NUMBER = 5;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private l0.d<o> dataOrigin_;
    private l0.d<x1> metricSpec_;
    private long sliceDurationMillis_;
    private String slicePeriod_;
    private u2 timeSpec_;

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        j0.r(w1.class, w1Var);
    }

    private w1() {
        s1<Object> s1Var = s1.f7778d;
        this.metricSpec_ = s1Var;
        this.dataOrigin_ = s1Var;
        this.slicePeriod_ = "";
    }

    public static w1 t(byte[] bArr) {
        return (w1) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new w1();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဈ\u0002", new Object[]{"bitField0_", "timeSpec_", "metricSpec_", x1.class, "dataOrigin_", o.class, "sliceDurationMillis_", "slicePeriod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<w1> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (w1.class) {
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

    public static final class a extends j0.a<w1, a> implements d1 {
        private a() {
            super(w1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
