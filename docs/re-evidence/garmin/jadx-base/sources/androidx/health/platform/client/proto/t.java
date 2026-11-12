package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class t extends j0<t, a> implements d1 {
    private static final t DEFAULT_INSTANCE;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 3;
    private static volatile l1<t> PARSER = null;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeMillis_;
    private long startTimeMillis_;
    private w0<String, u> values_ = w0.f7805b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<String, u> f7782a = v0.b(b3.f7548k, b3.f7550m, u.y());

        private b() {
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        j0.r(t.class, tVar);
    }

    private t() {
    }

    public static w0 t(t tVar) {
        w0<String, u> w0Var = tVar.values_;
        if (!w0Var.f7806a) {
            tVar.values_ = w0Var.c();
        }
        return tVar.values_;
    }

    public static void u(t tVar, long j8) {
        tVar.bitField0_ |= 1;
        tVar.startTimeMillis_ = j8;
    }

    public static void v(t tVar, long j8) {
        tVar.bitField0_ |= 2;
        tVar.endTimeMillis_ = j8;
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
                return new t();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "values_", b.f7782a, "startTimeMillis_", "endTimeMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<t> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (t.class) {
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

    public static final class a extends j0.a<t, a> implements d1 {
        private a() {
            super(t.DEFAULT_INSTANCE);
        }

        public final void j(u uVar, String str) {
            g();
            t.t((t) this.f7677b).put(str, uVar);
        }

        public final void k(long j8) {
            g();
            t.v((t) this.f7677b, j8);
        }

        public final void l(long j8) {
            g();
            t.u((t) this.f7677b, j8);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
