package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends GeneratedMessageLite<d1, a> implements zrf {
    public static final int CHANGES_TOKEN_FIELD_NUMBER = 1;
    private static final d1 DEFAULT_INSTANCE;
    private static volatile tkh<d1> PARSER;
    private int bitField0_;
    private String changesToken_ = "";

    public static final class a extends GeneratedMessageLite.a<d1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(String str) {
            n();
            ((d1) this.f2461b).S(str);
            return this;
        }

        public a() {
            super(d1.DEFAULT_INSTANCE);
        }
    }

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        GeneratedMessageLite.K(d1.class, d1Var);
    }

    public static a Q() {
        return DEFAULT_INSTANCE.p();
    }

    public static d1 R(byte[] bArr) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void S(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.changesToken_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new d1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "changesToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<d1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (d1.class) {
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
