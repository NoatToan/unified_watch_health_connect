package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends GeneratedMessageLite<p1, a> implements zrf {
    public static final int CHANGES_FIELD_NUMBER = 1;
    public static final int CHANGES_TOKEN_EXPIRED_FIELD_NUMBER = 4;
    private static final p1 DEFAULT_INSTANCE;
    public static final int HAS_MORE_FIELD_NUMBER = 2;
    public static final int NEXT_CHANGES_TOKEN_FIELD_NUMBER = 3;
    private static volatile tkh<p1> PARSER;
    private int bitField0_;
    private boolean changesTokenExpired_;
    private boolean hasMore_;
    private f0.i<ChangeProto$DataChange> changes_ = GeneratedMessageLite.t();
    private String nextChangesToken_ = "";

    public static final class a extends GeneratedMessageLite.a<p1, a> implements zrf {
        public /* synthetic */ a(n1 n1Var) {
            this();
        }

        public a() {
            super(p1.DEFAULT_INSTANCE);
        }
    }

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        GeneratedMessageLite.K(p1.class, p1Var);
    }

    public static p1 T(byte[] bArr) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public List<ChangeProto$DataChange> O() {
        return this.changes_;
    }

    public boolean Q() {
        return this.changesTokenExpired_;
    }

    public boolean R() {
        return this.hasMore_;
    }

    public String S() {
        return this.nextChangesToken_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        n1 n1Var = null;
        switch (n1.f2519a[methodToInvoke.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new a(n1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "changes_", ChangeProto$DataChange.class, "hasMore_", "nextChangesToken_", "changesTokenExpired_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<p1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (p1.class) {
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
