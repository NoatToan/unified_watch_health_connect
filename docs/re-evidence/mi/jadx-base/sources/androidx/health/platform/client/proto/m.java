package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class m extends GeneratedMessageLite<m, a> implements zrf {
    private static final m DEFAULT_INSTANCE;
    private static volatile tkh<m> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private MapFieldLite<String, DataProto$Value> values_ = MapFieldLite.emptyMapField();

    public static final class a extends GeneratedMessageLite.a<m, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, DataProto$Value> f2518a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, DataProto$Value.V());
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.K(m.class, mVar);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", b.f2518a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<m> bVar = PARSER;
                if (bVar == null) {
                    synchronized (m.class) {
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
