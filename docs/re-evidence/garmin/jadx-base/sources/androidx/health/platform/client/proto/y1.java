package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends j0<y1, a> implements d1 {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final y1 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile l1<y1> PARSER;
    private int bitField0_;
    private q dataType_;
    private String id_ = "";

    static {
        y1 y1Var = new y1();
        DEFAULT_INSTANCE = y1Var;
        j0.r(y1.class, y1Var);
    }

    private y1() {
    }

    public static void t(y1 y1Var, q qVar) {
        y1Var.getClass();
        y1Var.dataType_ = qVar;
        y1Var.bitField0_ |= 1;
    }

    public static void u(y1 y1Var, String str) {
        y1Var.getClass();
        str.getClass();
        y1Var.bitField0_ |= 2;
        y1Var.id_ = str;
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new y1();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "dataType_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<y1> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (y1.class) {
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

    public static final class a extends j0.a<y1, a> implements d1 {
        private a() {
            super(y1.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
