package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends j0<g2, a> implements d1 {
    public static final int DATA_TYPES_FIELD_NUMBER = 2;
    private static final g2 DEFAULT_INSTANCE;
    public static final int NOTIFICATIONINTENTACTION_FIELD_NUMBER = 1;
    private static volatile l1<g2> PARSER;
    private int bitField0_;
    private String notificationIntentAction_ = "";
    private l0.d<q> dataTypes_ = s1.f7778d;

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        j0.r(g2.class, g2Var);
    }

    private g2() {
    }

    public static g2 t(byte[] bArr) {
        return (g2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new g2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "notificationIntentAction_", "dataTypes_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<g2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (g2.class) {
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

    public static final class a extends j0.a<g2, a> implements d1 {
        private a() {
            super(g2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
