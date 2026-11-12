package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class r extends GeneratedMessageLite<r, a> implements zrf {
    private static final r DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MANUFACTURER_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 3;
    private static volatile tkh<r> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String identifier_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String type_ = "";

    public static final class a extends GeneratedMessageLite.a<r, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a A(String str) {
            n();
            ((r) this.f2461b).b0(str);
            return this;
        }

        public a y(String str) {
            n();
            ((r) this.f2461b).Z(str);
            return this;
        }

        public a z(String str) {
            n();
            ((r) this.f2461b).a0(str);
            return this;
        }

        public a() {
            super(r.DEFAULT_INSTANCE);
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        GeneratedMessageLite.K(r.class, rVar);
    }

    public static r S() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return DEFAULT_INSTANCE.p();
    }

    public String T() {
        return this.manufacturer_;
    }

    public String U() {
        return this.model_;
    }

    public String V() {
        return this.type_;
    }

    public boolean W() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean X() {
        return (this.bitField0_ & 4) != 0;
    }

    public final void Z(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.manufacturer_ = str;
    }

    public final void a0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.model_ = str;
    }

    public final void b0(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.type_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "identifier_", "manufacturer_", "model_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<r> bVar = PARSER;
                if (bVar == null) {
                    synchronized (r.class) {
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
