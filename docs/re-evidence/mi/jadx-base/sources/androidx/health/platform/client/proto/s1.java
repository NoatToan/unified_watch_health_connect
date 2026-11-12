package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends GeneratedMessageLite<s1, a> implements zrf {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final s1 DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile tkh<s1> PARSER;
    private int bitField0_;
    private f0.i<o> dataPoint_ = GeneratedMessageLite.t();
    private String pageToken_ = "";

    public static final class a extends GeneratedMessageLite.a<s1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(s1.DEFAULT_INSTANCE);
        }
    }

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        GeneratedMessageLite.K(s1.class, s1Var);
    }

    public static s1 R(byte[] bArr) throws InvalidProtocolBufferException {
        return (s1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public List<o> O() {
        return this.dataPoint_;
    }

    public String Q() {
        return this.pageToken_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "dataPoint_", o.class, "pageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<s1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (s1.class) {
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
