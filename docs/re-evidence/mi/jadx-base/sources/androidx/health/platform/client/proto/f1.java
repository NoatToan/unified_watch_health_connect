package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends GeneratedMessageLite<f1, a> implements zrf {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final f1 DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    private static volatile tkh<f1> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private q dataType_;
    private int limit_;
    private int pageSize_;
    private a2 timeSpec_;
    private f0.i<n> dataOriginFilters_ = GeneratedMessageLite.t();
    private boolean ascOrdering_ = true;
    private String pageToken_ = "";

    public static final class a extends GeneratedMessageLite.a<f1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a A(q qVar) {
            n();
            ((f1) this.f2461b).a0(qVar);
            return this;
        }

        public a B(int i) {
            n();
            ((f1) this.f2461b).b0(i);
            return this;
        }

        public a C(String str) {
            n();
            ((f1) this.f2461b).c0(str);
            return this;
        }

        public a D(a2 a2Var) {
            n();
            ((f1) this.f2461b).d0(a2Var);
            return this;
        }

        public a y(Iterable<? extends n> iterable) {
            n();
            ((f1) this.f2461b).V(iterable);
            return this;
        }

        public a z(boolean z) {
            n();
            ((f1) this.f2461b).Z(z);
            return this;
        }

        public a() {
            super(f1.DEFAULT_INSTANCE);
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        GeneratedMessageLite.K(f1.class, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(Iterable<? extends n> iterable) {
        W();
        androidx.health.platform.client.proto.a.c(iterable, this.dataOriginFilters_);
    }

    private void W() {
        f0.i<n> iVar = this.dataOriginFilters_;
        if (iVar.c()) {
            return;
        }
        this.dataOriginFilters_ = GeneratedMessageLite.D(iVar);
    }

    public static a X() {
        return DEFAULT_INSTANCE.p();
    }

    public static f1 Y(byte[] bArr) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(q qVar) {
        qVar.getClass();
        this.dataType_ = qVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(a2 a2Var) {
        a2Var.getClass();
        this.timeSpec_ = a2Var;
        this.bitField0_ |= 1;
    }

    public final void Z(boolean z) {
        this.bitField0_ |= 4;
        this.ascOrdering_ = z;
    }

    public final void b0(int i) {
        this.bitField0_ |= 16;
        this.pageSize_ = i;
    }

    public final void c0(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.pageToken_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", n.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<f1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f1.class) {
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
