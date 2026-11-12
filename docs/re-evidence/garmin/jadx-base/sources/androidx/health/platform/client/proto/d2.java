package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends j0<d2, a> implements d1 {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final d2 DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    private static volatile l1<d2> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private q dataType_;
    private int limit_;
    private int pageSize_;
    private u2 timeSpec_;
    private l0.d<o> dataOriginFilters_ = s1.f7778d;
    private boolean ascOrdering_ = true;
    private String pageToken_ = "";

    static {
        d2 d2Var = new d2();
        DEFAULT_INSTANCE = d2Var;
        j0.r(d2.class, d2Var);
    }

    private d2() {
    }

    public static d2 t(byte[] bArr) {
        return (d2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new d2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", o.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<d2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (d2.class) {
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

    public static final class a extends j0.a<d2, a> implements d1 {
        private a() {
            super(d2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
