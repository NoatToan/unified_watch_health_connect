package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t extends GeneratedMessageLite<t, a> implements zrf {
    private static final t DEFAULT_INSTANCE;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 3;
    private static volatile tkh<t> PARSER = null;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeMillis_;
    private long startTimeMillis_;
    private MapFieldLite<String, DataProto$Value> values_ = MapFieldLite.emptyMapField();

    public static final class a extends GeneratedMessageLite.a<t, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a A(long j) {
            n();
            ((t) this.f2461b).Z(j);
            return this;
        }

        public a y(String str, DataProto$Value dataProto$Value) {
            str.getClass();
            dataProto$Value.getClass();
            n();
            ((t) this.f2461b).T().put(str, dataProto$Value);
            return this;
        }

        public a z(long j) {
            n();
            ((t) this.f2461b).Y(j);
            return this;
        }

        public a() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, DataProto$Value> f2534a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, DataProto$Value.V());
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        GeneratedMessageLite.K(t.class, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, DataProto$Value> T() {
        return V();
    }

    private MapFieldLite<String, DataProto$Value> V() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite<String, DataProto$Value> W() {
        return this.values_;
    }

    public static a X() {
        return DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(long j) {
        this.bitField0_ |= 2;
        this.endTimeMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(long j) {
        this.bitField0_ |= 1;
        this.startTimeMillis_ = j;
    }

    public long S() {
        return this.endTimeMillis_;
    }

    public long U() {
        return this.startTimeMillis_;
    }

    public Map<String, DataProto$Value> a() {
        return Collections.unmodifiableMap(W());
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "values_", b.f2534a, "startTimeMillis_", "endTimeMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<t> bVar = PARSER;
                if (bVar == null) {
                    synchronized (t.class) {
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
