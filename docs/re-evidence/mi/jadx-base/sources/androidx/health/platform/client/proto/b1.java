package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends GeneratedMessageLite<b1, a> implements zrf {
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final b1 DEFAULT_INSTANCE;
    private static volatile tkh<b1> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private f0.i<q> dataType_ = GeneratedMessageLite.t();
    private a2 timeSpec_;

    public static final class a extends GeneratedMessageLite.a<b1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(q qVar) {
            n();
            ((b1) this.f2461b).R(qVar);
            return this;
        }

        public a z(a2 a2Var) {
            n();
            ((b1) this.f2461b).V(a2Var);
            return this;
        }

        public a() {
            super(b1.DEFAULT_INSTANCE);
        }
    }

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        GeneratedMessageLite.K(b1.class, b1Var);
    }

    public static a T() {
        return DEFAULT_INSTANCE.p();
    }

    public static b1 U(byte[] bArr) throws InvalidProtocolBufferException {
        return (b1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(a2 a2Var) {
        a2Var.getClass();
        this.timeSpec_ = a2Var;
        this.bitField0_ |= 1;
    }

    public final void R(q qVar) {
        qVar.getClass();
        S();
        this.dataType_.add(qVar);
    }

    public final void S() {
        f0.i<q> iVar = this.dataType_;
        if (iVar.c()) {
            return;
        }
        this.dataType_ = GeneratedMessageLite.D(iVar);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new b1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "timeSpec_", "dataType_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<b1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (b1.class) {
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
