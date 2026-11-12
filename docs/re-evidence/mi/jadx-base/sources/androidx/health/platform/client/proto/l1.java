package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends GeneratedMessageLite<l1, a> implements zrf {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final l1 DEFAULT_INSTANCE;
    private static volatile tkh<l1> PARSER;
    private f0.i<o> dataPoint_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<l1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(Iterable<? extends o> iterable) {
            n();
            ((l1) this.f2461b).Q(iterable);
            return this;
        }

        public a() {
            super(l1.DEFAULT_INSTANCE);
        }
    }

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        GeneratedMessageLite.K(l1.class, l1Var);
    }

    public static a T() {
        return DEFAULT_INSTANCE.p();
    }

    public static l1 U(byte[] bArr) throws InvalidProtocolBufferException {
        return (l1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void Q(Iterable<? extends o> iterable) {
        R();
        androidx.health.platform.client.proto.a.c(iterable, this.dataPoint_);
    }

    public final void R() {
        f0.i<o> iVar = this.dataPoint_;
        if (iVar.c()) {
            return;
        }
        this.dataPoint_ = GeneratedMessageLite.D(iVar);
    }

    public List<o> S() {
        return this.dataPoint_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoint_", o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<l1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (l1.class) {
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
