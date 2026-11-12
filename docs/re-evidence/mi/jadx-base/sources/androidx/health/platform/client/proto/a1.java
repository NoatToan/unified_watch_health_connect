package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends GeneratedMessageLite<a1, a> implements zrf {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final a1 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile tkh<a1> PARSER;
    private int bitField0_;
    private q dataType_;
    private String id_ = "";

    public static final class a extends GeneratedMessageLite.a<a1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(q qVar) {
            n();
            ((a1) this.f2461b).S(qVar);
            return this;
        }

        public a z(String str) {
            n();
            ((a1) this.f2461b).T(str);
            return this;
        }

        public a() {
            super(a1.DEFAULT_INSTANCE);
        }
    }

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        GeneratedMessageLite.K(a1.class, a1Var);
    }

    public static a R() {
        return DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(q qVar) {
        qVar.getClass();
        this.dataType_ = qVar;
        this.bitField0_ |= 1;
    }

    public final void T(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.id_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new a1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "dataType_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<a1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a1.class) {
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
