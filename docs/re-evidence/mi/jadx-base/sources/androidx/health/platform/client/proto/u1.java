package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends GeneratedMessageLite<u1, a> implements zrf {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final u1 DEFAULT_INSTANCE;
    private static volatile tkh<u1> PARSER;
    private int bitField0_;
    private o dataPoint_;

    public static final class a extends GeneratedMessageLite.a<u1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(u1.DEFAULT_INSTANCE);
        }
    }

    static {
        u1 u1Var = new u1();
        DEFAULT_INSTANCE = u1Var;
        GeneratedMessageLite.K(u1.class, u1Var);
    }

    public static u1 O(byte[] bArr) throws InvalidProtocolBufferException {
        return (u1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new u1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "dataPoint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<u1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (u1.class) {
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
