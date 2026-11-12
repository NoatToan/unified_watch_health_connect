package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class n extends GeneratedMessageLite<n, a> implements zrf {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    private static final n DEFAULT_INSTANCE;
    private static volatile tkh<n> PARSER;
    private String applicationId_ = "";
    private int bitField0_;

    public static final class a extends GeneratedMessageLite.a<n, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a y(String str) {
            n();
            ((n) this.f2461b).T(str);
            return this;
        }

        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        GeneratedMessageLite.K(n.class, nVar);
    }

    public static n R() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.p();
    }

    public String Q() {
        return this.applicationId_;
    }

    public final void T(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.applicationId_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "applicationId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<n> bVar = PARSER;
                if (bVar == null) {
                    synchronized (n.class) {
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
