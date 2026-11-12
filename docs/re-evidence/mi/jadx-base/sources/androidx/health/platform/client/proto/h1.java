package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends GeneratedMessageLite<h1, a> implements zrf {
    private static final h1 DEFAULT_INSTANCE;
    private static volatile tkh<h1> PARSER = null;
    public static final int SESSIONUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionUid_ = "";

    public static final class a extends GeneratedMessageLite.a<h1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a() {
            super(h1.DEFAULT_INSTANCE);
        }
    }

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        GeneratedMessageLite.K(h1.class, h1Var);
    }

    public static h1 O(byte[] bArr) throws InvalidProtocolBufferException {
        return (h1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "sessionUid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<h1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (h1.class) {
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
