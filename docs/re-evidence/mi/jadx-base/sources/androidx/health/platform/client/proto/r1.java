package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends GeneratedMessageLite<r1, a> implements zrf {
    public static final int DATA_POINT_UID_FIELD_NUMBER = 1;
    private static final r1 DEFAULT_INSTANCE;
    private static volatile tkh<r1> PARSER;
    private f0.i<String> dataPointUid_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<r1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a y(Iterable<String> iterable) {
            n();
            ((r1) this.f2461b).Q(iterable);
            return this;
        }

        public a() {
            super(r1.DEFAULT_INSTANCE);
        }
    }

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        GeneratedMessageLite.K(r1.class, r1Var);
    }

    public static a T() {
        return DEFAULT_INSTANCE.p();
    }

    public static r1 U(byte[] bArr) throws InvalidProtocolBufferException {
        return (r1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final void Q(Iterable<String> iterable) {
        R();
        androidx.health.platform.client.proto.a.c(iterable, this.dataPointUid_);
    }

    public final void R() {
        f0.i<String> iVar = this.dataPointUid_;
        if (iVar.c()) {
            return;
        }
        this.dataPointUid_ = GeneratedMessageLite.D(iVar);
    }

    public List<String> S() {
        return this.dataPointUid_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new r1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"dataPointUid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<r1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (r1.class) {
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
