package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends GeneratedMessageLite<t1, a> implements zrf {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final t1 DEFAULT_INSTANCE;
    private static volatile tkh<t1> PARSER;
    private int bitField0_;
    private o dataPoint_;

    public static final class a extends GeneratedMessageLite.a<t1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(t1.DEFAULT_INSTANCE);
        }
    }

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        GeneratedMessageLite.K(t1.class, t1Var);
    }

    public static t1 Q(byte[] bArr) throws InvalidProtocolBufferException {
        return (t1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public o O() {
        o oVar = this.dataPoint_;
        return oVar == null ? o.m0() : oVar;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "dataPoint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<t1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (t1.class) {
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
