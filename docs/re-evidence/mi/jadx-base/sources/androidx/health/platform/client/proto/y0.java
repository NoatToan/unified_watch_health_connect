package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends GeneratedMessageLite<y0, a> implements zrf {
    public static final int DATA_ORIGIN_FIELD_NUMBER = 3;
    private static final y0 DEFAULT_INSTANCE;
    public static final int METRIC_SPEC_FIELD_NUMBER = 2;
    private static volatile tkh<y0> PARSER = null;
    public static final int SLICE_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int SLICE_PERIOD_FIELD_NUMBER = 5;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private long sliceDurationMillis_;
    private a2 timeSpec_;
    private f0.i<z0> metricSpec_ = GeneratedMessageLite.t();
    private f0.i<n> dataOrigin_ = GeneratedMessageLite.t();
    private String slicePeriod_ = "";

    public static final class a extends GeneratedMessageLite.a<y0, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a A(long j) {
            n();
            ((y0) this.f2461b).a0(j);
            return this;
        }

        public a B(String str) {
            n();
            ((y0) this.f2461b).b0(str);
            return this;
        }

        public a C(a2 a2Var) {
            n();
            ((y0) this.f2461b).c0(a2Var);
            return this;
        }

        public a y(Iterable<? extends n> iterable) {
            n();
            ((y0) this.f2461b).U(iterable);
            return this;
        }

        public a z(Iterable<? extends z0> iterable) {
            n();
            ((y0) this.f2461b).V(iterable);
            return this;
        }

        public a() {
            super(y0.DEFAULT_INSTANCE);
        }
    }

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        GeneratedMessageLite.K(y0.class, y0Var);
    }

    public static a Y() {
        return DEFAULT_INSTANCE.p();
    }

    public static y0 Z(byte[] bArr) throws InvalidProtocolBufferException {
        return (y0) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void U(Iterable<? extends n> iterable) {
        W();
        androidx.health.platform.client.proto.a.c(iterable, this.dataOrigin_);
    }

    public final void V(Iterable<? extends z0> iterable) {
        X();
        androidx.health.platform.client.proto.a.c(iterable, this.metricSpec_);
    }

    public final void W() {
        f0.i<n> iVar = this.dataOrigin_;
        if (iVar.c()) {
            return;
        }
        this.dataOrigin_ = GeneratedMessageLite.D(iVar);
    }

    public final void X() {
        f0.i<z0> iVar = this.metricSpec_;
        if (iVar.c()) {
            return;
        }
        this.metricSpec_ = GeneratedMessageLite.D(iVar);
    }

    public final void a0(long j) {
        this.bitField0_ |= 2;
        this.sliceDurationMillis_ = j;
    }

    public final void b0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.slicePeriod_ = str;
    }

    public final void c0(a2 a2Var) {
        a2Var.getClass();
        this.timeSpec_ = a2Var;
        this.bitField0_ |= 1;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဈ\u0002", new Object[]{"bitField0_", "timeSpec_", "metricSpec_", z0.class, "dataOrigin_", n.class, "sliceDurationMillis_", "slicePeriod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<y0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (y0.class) {
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
