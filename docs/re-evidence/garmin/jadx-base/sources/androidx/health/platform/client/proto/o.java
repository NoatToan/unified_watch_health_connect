package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class o extends j0<o, a> implements d1 {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    private static volatile l1<o> PARSER;
    private String applicationId_ = "";
    private int bitField0_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        j0.r(o.class, oVar);
    }

    private o() {
    }

    public static void t(o oVar, String str) {
        oVar.getClass();
        oVar.bitField0_ |= 1;
        oVar.applicationId_ = str;
    }

    public static a u() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "applicationId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<o> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (o.class) {
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

    public static final class a extends j0.a<o, a> implements d1 {
        private a() {
            super(o.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
