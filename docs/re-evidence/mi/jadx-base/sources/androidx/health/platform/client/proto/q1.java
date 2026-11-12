package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends GeneratedMessageLite<q1, a> implements zrf {
    public static final int CHANGES_TOKEN_FIELD_NUMBER = 1;
    private static final q1 DEFAULT_INSTANCE;
    private static volatile tkh<q1> PARSER;
    private int bitField0_;
    private String changesToken_ = "";

    public static final class a extends GeneratedMessageLite.a<q1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(q1.DEFAULT_INSTANCE);
        }
    }

    static {
        q1 q1Var = new q1();
        DEFAULT_INSTANCE = q1Var;
        GeneratedMessageLite.K(q1.class, q1Var);
    }

    public static q1 Q(byte[] bArr) throws InvalidProtocolBufferException {
        return (q1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public String O() {
        return this.changesToken_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new q1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "changesToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<q1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (q1.class) {
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
