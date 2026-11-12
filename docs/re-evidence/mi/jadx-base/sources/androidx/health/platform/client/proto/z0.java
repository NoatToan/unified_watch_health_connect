package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends GeneratedMessageLite<z0, a> implements zrf {
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_NAME_FIELD_NUMBER = 1;
    private static final z0 DEFAULT_INSTANCE;
    public static final int FIELD_NAME_FIELD_NUMBER = 3;
    private static volatile tkh<z0> PARSER;
    private int bitField0_;
    private String dataTypeName_ = "";
    private String aggregationType_ = "";
    private String fieldName_ = "";

    public static final class a extends GeneratedMessageLite.a<z0, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a A(String str) {
            n();
            ((z0) this.f2461b).V(str);
            return this;
        }

        public a y(String str) {
            n();
            ((z0) this.f2461b).T(str);
            return this;
        }

        public a z(String str) {
            n();
            ((z0) this.f2461b).U(str);
            return this;
        }

        public a() {
            super(z0.DEFAULT_INSTANCE);
        }
    }

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        GeneratedMessageLite.K(z0.class, z0Var);
    }

    public static a S() {
        return DEFAULT_INSTANCE.p();
    }

    public final void T(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.aggregationType_ = str;
    }

    public final void U(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.dataTypeName_ = str;
    }

    public final void V(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.fieldName_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new z0();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataTypeName_", "aggregationType_", "fieldName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<z0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (z0.class) {
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
