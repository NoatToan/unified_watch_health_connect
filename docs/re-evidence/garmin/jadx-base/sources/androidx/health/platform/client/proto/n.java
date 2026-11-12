package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class n extends j0<n, a> implements d1 {
    private static final n DEFAULT_INSTANCE;
    private static volatile l1<n> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private w0<String, u> values_ = w0.f7805b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<String, u> f7725a = v0.b(b3.f7548k, b3.f7550m, u.y());

        private b() {
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        j0.r(n.class, nVar);
    }

    private n() {
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", b.f7725a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<n> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (n.class) {
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

    public static final class a extends j0.a<n, a> implements d1 {
        private a() {
            super(n.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
