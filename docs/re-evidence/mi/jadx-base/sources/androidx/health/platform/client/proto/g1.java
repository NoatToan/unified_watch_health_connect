package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends GeneratedMessageLite<g1, a> implements zrf {
    public static final int DATA_TYPE_ID_PAIR_FIELD_NUMBER = 1;
    private static final g1 DEFAULT_INSTANCE;
    private static volatile tkh<g1> PARSER;
    private int bitField0_;
    private a1 dataTypeIdPair_;

    public static final class a extends GeneratedMessageLite.a<g1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(a1 a1Var) {
            n();
            ((g1) this.f2461b).S(a1Var);
            return this;
        }

        public a() {
            super(g1.DEFAULT_INSTANCE);
        }
    }

    static {
        g1 g1Var = new g1();
        DEFAULT_INSTANCE = g1Var;
        GeneratedMessageLite.K(g1.class, g1Var);
    }

    public static a Q() {
        return DEFAULT_INSTANCE.p();
    }

    public static g1 R(byte[] bArr) throws InvalidProtocolBufferException {
        return (g1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void S(a1 a1Var) {
        a1Var.getClass();
        this.dataTypeIdPair_ = a1Var;
        this.bitField0_ |= 1;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new g1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "dataTypeIdPair_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<g1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g1.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
