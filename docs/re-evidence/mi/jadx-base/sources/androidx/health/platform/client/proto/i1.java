package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends GeneratedMessageLite<i1, a> implements zrf {
    public static final int DATA_TYPES_FIELD_NUMBER = 2;
    private static final i1 DEFAULT_INSTANCE;
    public static final int NOTIFICATIONINTENTACTION_FIELD_NUMBER = 1;
    private static volatile tkh<i1> PARSER;
    private int bitField0_;
    private String notificationIntentAction_ = "";
    private f0.i<q> dataTypes_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<i1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a() {
            super(i1.DEFAULT_INSTANCE);
        }
    }

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        GeneratedMessageLite.K(i1.class, i1Var);
    }

    public static i1 O(byte[] bArr) throws InvalidProtocolBufferException {
        return (i1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new i1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "notificationIntentAction_", "dataTypes_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<i1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (i1.class) {
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
