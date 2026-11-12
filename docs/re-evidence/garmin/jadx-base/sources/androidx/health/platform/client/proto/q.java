package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class q extends j0<q, a> implements d1 {
    private static final q DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile l1<q> PARSER;
    private int bitField0_;
    private String name_ = "";

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        j0.r(q.class, qVar);
    }

    private q() {
    }

    public static void t(q qVar, String str) {
        qVar.getClass();
        qVar.bitField0_ |= 1;
        qVar.name_ = str;
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
                return new q();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<q> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (q.class) {
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

    public static final class a extends j0.a<q, a> implements d1 {
        private a() {
            super(q.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
