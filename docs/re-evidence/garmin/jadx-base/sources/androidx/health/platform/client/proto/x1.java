package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends j0<x1, a> implements d1 {
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_NAME_FIELD_NUMBER = 1;
    private static final x1 DEFAULT_INSTANCE;
    public static final int FIELD_NAME_FIELD_NUMBER = 3;
    private static volatile l1<x1> PARSER;
    private int bitField0_;
    private String dataTypeName_ = "";
    private String aggregationType_ = "";
    private String fieldName_ = "";

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        j0.r(x1.class, x1Var);
    }

    private x1() {
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataTypeName_", "aggregationType_", "fieldName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<x1> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (x1.class) {
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

    public static final class a extends j0.a<x1, a> implements d1 {
        private a() {
            super(x1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
