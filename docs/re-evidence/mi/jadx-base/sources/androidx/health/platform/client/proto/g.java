package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends GeneratedMessageLite<g, a> implements zrf {
    public static final int CHANGES_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int NEXT_CHANGES_TOKEN_FIELD_NUMBER = 1;
    private static volatile tkh<g> PARSER;
    private int bitField0_;
    private String nextChangesToken_ = "";
    private f0.i<ChangeProto$DataChange> changes_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<g, a> implements zrf {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.K(g.class, gVar);
    }

    public static g R(byte[] bArr) throws InvalidProtocolBufferException {
        return (g) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public List<ChangeProto$DataChange> O() {
        return this.changes_;
    }

    public String Q() {
        return this.nextChangesToken_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        f fVar = null;
        switch (f.f2488a[methodToInvoke.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(fVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "nextChangesToken_", "changes_", ChangeProto$DataChange.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
