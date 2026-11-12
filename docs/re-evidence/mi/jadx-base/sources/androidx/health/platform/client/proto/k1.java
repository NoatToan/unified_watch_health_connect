package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends GeneratedMessageLite<k1, a> implements zrf {
    private static final k1 DEFAULT_INSTANCE;
    public static final int NOTIFICATIONINTENTACTION_FIELD_NUMBER = 1;
    private static volatile tkh<k1> PARSER;
    private int bitField0_;
    private String notificationIntentAction_ = "";

    public static final class a extends GeneratedMessageLite.a<k1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a() {
            super(k1.DEFAULT_INSTANCE);
        }
    }

    static {
        k1 k1Var = new k1();
        DEFAULT_INSTANCE = k1Var;
        GeneratedMessageLite.K(k1.class, k1Var);
    }

    public static k1 O(byte[] bArr) throws InvalidProtocolBufferException {
        return (k1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new k1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "notificationIntentAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<k1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (k1.class) {
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
