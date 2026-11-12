package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class r extends j0<r, a> implements d1 {
    private static final r DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MANUFACTURER_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 3;
    private static volatile l1<r> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String identifier_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String type_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        j0.r(r.class, rVar);
    }

    private r() {
    }

    public static void t(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 2;
        rVar.manufacturer_ = str;
    }

    public static void u(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 4;
        rVar.model_ = str;
    }

    public static void v(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 8;
        rVar.type_ = str;
    }

    public static a w() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "identifier_", "manufacturer_", "model_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<r> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (r.class) {
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

    public static final class a extends j0.a<r, a> implements d1 {
        private a() {
            super(r.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
