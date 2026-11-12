package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends GeneratedMessageLite<o1, a> implements zrf {
    private static final o1 DEFAULT_INSTANCE;
    private static volatile tkh<o1> PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 1;
    private f0.i<l> rows_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<o1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(o1.DEFAULT_INSTANCE);
        }
    }

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        GeneratedMessageLite.K(o1.class, o1Var);
    }

    public static o1 Q(byte[] bArr) throws InvalidProtocolBufferException {
        return (o1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public List<l> O() {
        return this.rows_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new o1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rows_", l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<o1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (o1.class) {
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
