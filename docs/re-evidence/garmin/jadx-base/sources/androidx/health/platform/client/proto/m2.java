package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends j0<m2, a> implements d1 {
    public static final int DATA_POINT_UID_FIELD_NUMBER = 1;
    private static final m2 DEFAULT_INSTANCE;
    private static volatile l1<m2> PARSER;
    private l0.d<String> dataPointUid_ = s1.f7778d;

    static {
        m2 m2Var = new m2();
        DEFAULT_INSTANCE = m2Var;
        j0.r(m2.class, m2Var);
    }

    private m2() {
    }

    public static void t(m2 m2Var, Iterable iterable) {
        l0.d<String> dVar = m2Var.dataPointUid_;
        if (!dVar.isModifiable()) {
            m2Var.dataPointUid_ = j0.o(dVar);
        }
        androidx.health.platform.client.proto.a.c(iterable, m2Var.dataPointUid_);
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    public static m2 w(byte[] bArr) {
        return (m2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        l2 l2Var = null;
        switch (l2.f7710a[fVar.ordinal()]) {
            case 1:
                return new m2();
            case 2:
                return new a(l2Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"dataPointUid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<m2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (m2.class) {
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

    public final l0.d u() {
        return this.dataPointUid_;
    }

    public static final class a extends j0.a<m2, a> implements d1 {
        private a() {
            super(m2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(l2 l2Var) {
            this();
        }
    }
}
