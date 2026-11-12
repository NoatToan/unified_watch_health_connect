package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class s extends j0<s, a> implements d1 {
    private static final s DEFAULT_INSTANCE;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile l1<s> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long instantTimeMillis_;
    private w0<String, u> values_ = w0.f7805b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<String, u> f7775a = v0.b(b3.f7548k, b3.f7550m, u.y());

        private b() {
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        j0.r(s.class, sVar);
    }

    private s() {
    }

    public static w0 t(s sVar) {
        w0<String, u> w0Var = sVar.values_;
        if (!w0Var.f7806a) {
            sVar.values_ = w0Var.c();
        }
        return sVar.values_;
    }

    public static void u(s sVar, long j8) {
        sVar.bitField0_ |= 1;
        sVar.instantTimeMillis_ = j8;
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"bitField0_", "values_", b.f7775a, "instantTimeMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<s> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (s.class) {
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

    public static final class a extends j0.a<s, a> implements d1 {
        private a() {
            super(s.DEFAULT_INSTANCE);
        }

        public final void j(u uVar, String str) {
            g();
            s.t((s) this.f7677b).put(str, uVar);
        }

        public final void k(long j8) {
            g();
            s.u((s) this.f7677b, j8);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
