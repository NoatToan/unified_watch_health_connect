package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class q extends GeneratedMessageLite<q, a> implements zrf {
    private static final q DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile tkh<q> PARSER;
    private int bitField0_;
    private String name_ = "";

    public static final class a extends GeneratedMessageLite.a<q, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a y(String str) {
            n();
            ((q) this.f2461b).U(str);
            return this;
        }

        public a() {
            super(q.DEFAULT_INSTANCE);
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        GeneratedMessageLite.K(q.class, qVar);
    }

    public static q Q() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.p();
    }

    public static q T(byte[] bArr) throws InvalidProtocolBufferException {
        return (q) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public String R() {
        return this.name_;
    }

    public final void U(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<q> bVar = PARSER;
                if (bVar == null) {
                    synchronized (q.class) {
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
