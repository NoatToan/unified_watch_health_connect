package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends j0<c2, a> implements d1 {
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final c2 DEFAULT_INSTANCE;
    private static volatile l1<c2> PARSER;
    private l0.d<o> dataOriginFilters_;
    private l0.d<q> dataType_;

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        j0.r(c2.class, c2Var);
    }

    private c2() {
        s1<Object> s1Var = s1.f7778d;
        this.dataType_ = s1Var;
        this.dataOriginFilters_ = s1Var;
    }

    public static c2 t(byte[] bArr) {
        return (c2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new c2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dataType_", q.class, "dataOriginFilters_", o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<c2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (c2.class) {
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

    public static final class a extends j0.a<c2, a> implements d1 {
        private a() {
            super(c2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
