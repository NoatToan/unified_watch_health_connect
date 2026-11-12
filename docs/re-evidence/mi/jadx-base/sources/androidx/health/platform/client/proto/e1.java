package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends GeneratedMessageLite<e1, a> implements zrf {
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final e1 DEFAULT_INSTANCE;
    private static volatile tkh<e1> PARSER;
    private f0.i<q> dataType_ = GeneratedMessageLite.t();
    private f0.i<n> dataOriginFilters_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<e1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(Iterable<? extends n> iterable) {
            n();
            ((e1) this.f2461b).R(iterable);
            return this;
        }

        public a z(Iterable<? extends q> iterable) {
            n();
            ((e1) this.f2461b).S(iterable);
            return this;
        }

        public a() {
            super(e1.DEFAULT_INSTANCE);
        }
    }

    static {
        e1 e1Var = new e1();
        DEFAULT_INSTANCE = e1Var;
        GeneratedMessageLite.K(e1.class, e1Var);
    }

    private void U() {
        f0.i<q> iVar = this.dataType_;
        if (iVar.c()) {
            return;
        }
        this.dataType_ = GeneratedMessageLite.D(iVar);
    }

    public static a V() {
        return DEFAULT_INSTANCE.p();
    }

    public static e1 W(byte[] bArr) throws InvalidProtocolBufferException {
        return (e1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void R(Iterable<? extends n> iterable) {
        T();
        androidx.health.platform.client.proto.a.c(iterable, this.dataOriginFilters_);
    }

    public final void S(Iterable<? extends q> iterable) {
        U();
        androidx.health.platform.client.proto.a.c(iterable, this.dataType_);
    }

    public final void T() {
        f0.i<n> iVar = this.dataOriginFilters_;
        if (iVar.c()) {
            return;
        }
        this.dataOriginFilters_ = GeneratedMessageLite.D(iVar);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new e1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dataType_", q.class, "dataOriginFilters_", n.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<e1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (e1.class) {
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
