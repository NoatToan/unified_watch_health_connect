package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.vm5;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends GeneratedMessageLite<s, a> implements vm5 {
    private static final s DEFAULT_INSTANCE;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile tkh<s> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long instantTimeMillis_;
    private MapFieldLite<String, DataProto$Value> values_ = MapFieldLite.emptyMapField();

    public static final class a extends GeneratedMessageLite.a<s, a> implements vm5 {
        public /* synthetic */ a(k kVar) {
            this();
        }

        @Override // defpackage.vm5
        public Map<String, DataProto$Value> a() {
            return Collections.unmodifiableMap(((s) this.f2461b).a());
        }

        public a y(String str, DataProto$Value dataProto$Value) {
            str.getClass();
            dataProto$Value.getClass();
            n();
            ((s) this.f2461b).S().put(str, dataProto$Value);
            return this;
        }

        public a z(long j) {
            n();
            ((s) this.f2461b).W(j);
            return this;
        }

        public a() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, DataProto$Value> f2530a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, DataProto$Value.V());
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        GeneratedMessageLite.K(s.class, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, DataProto$Value> S() {
        return T();
    }

    private MapFieldLite<String, DataProto$Value> T() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite<String, DataProto$Value> U() {
        return this.values_;
    }

    public static a V() {
        return DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(long j) {
        this.bitField0_ |= 1;
        this.instantTimeMillis_ = j;
    }

    public long R() {
        return this.instantTimeMillis_;
    }

    @Override // defpackage.vm5
    public Map<String, DataProto$Value> a() {
        return Collections.unmodifiableMap(U());
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"bitField0_", "values_", b.f2530a, "instantTimeMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<s> bVar = PARSER;
                if (bVar == null) {
                    synchronized (s.class) {
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
