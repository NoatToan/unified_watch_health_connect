package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends GeneratedMessageLite<l, a> implements zrf {
    public static final int DATA_ORIGINS_FIELD_NUMBER = 8;
    private static final l DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUES_FIELD_NUMBER = 6;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    public static final int LONG_VALUES_FIELD_NUMBER = 7;
    private static volatile tkh<l> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private int zoneOffsetSeconds_;
    private MapFieldLite<String, Double> doubleValues_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Long> longValues_ = MapFieldLite.emptyMapField();
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";
    private f0.i<n> dataOrigins_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<l, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
            super(l.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, Double> f2512a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.DOUBLE, Double.valueOf(0.0d));
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, Long> f2513a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        GeneratedMessageLite.K(l.class, lVar);
    }

    public List<n> O() {
        return this.dataOrigins_;
    }

    public Map<String, Double> Q() {
        return Collections.unmodifiableMap(b0());
    }

    public String R() {
        return this.endLocalDateTime_;
    }

    public long S() {
        return this.endTimeEpochMs_;
    }

    public Map<String, Long> T() {
        return Collections.unmodifiableMap(c0());
    }

    public String U() {
        return this.startLocalDateTime_;
    }

    public long V() {
        return this.startTimeEpochMs_;
    }

    public int W() {
        return this.zoneOffsetSeconds_;
    }

    public boolean X() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean Y() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean Z() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean a0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final MapFieldLite<String, Double> b0() {
        return this.doubleValues_;
    }

    public final MapFieldLite<String, Long> c0() {
        return this.longValues_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u00062\u00072\b\u001b", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_", "zoneOffsetSeconds_", "doubleValues_", b.f2512a, "longValues_", c.f2513a, "dataOrigins_", n.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<l> bVar = PARSER;
                if (bVar == null) {
                    synchronized (l.class) {
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
