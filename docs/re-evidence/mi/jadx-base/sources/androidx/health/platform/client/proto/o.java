package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o extends GeneratedMessageLite<o, a> implements p {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    private static volatile tkh<o> PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    private m avg_;
    private int bitField0_;
    private long clientVersion_;
    private n dataOrigin_;
    private q dataType_;
    private r device_;
    private long endTimeMillis_;
    private int endZoneOffsetSeconds_;
    private long instantTimeMillis_;
    private m max_;
    private m min_;
    private int recordingMethod_;
    private long startTimeMillis_;
    private int startZoneOffsetSeconds_;
    private long updateTimeMillis_;
    private int zoneOffsetSeconds_;
    private MapFieldLite<String, DataProto$Value> values_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, b> subTypeDataLists_ = MapFieldLite.emptyMapField();
    private String uid_ = "";
    private String originSeriesUid_ = "";
    private String clientId_ = "";
    private String originSampleUid_ = "";
    private f0.i<s> seriesValues_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<o, a> implements p {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a A(String str, DataProto$Value dataProto$Value) {
            str.getClass();
            dataProto$Value.getClass();
            n();
            ((o) this.f2461b).s0().put(str, dataProto$Value);
            return this;
        }

        public a B(String str) {
            n();
            ((o) this.f2461b).M0(str);
            return this;
        }

        public a C(long j) {
            n();
            ((o) this.f2461b).N0(j);
            return this;
        }

        public a D(n nVar) {
            n();
            ((o) this.f2461b).O0(nVar);
            return this;
        }

        public a F(q qVar) {
            n();
            ((o) this.f2461b).P0(qVar);
            return this;
        }

        public a G(r rVar) {
            n();
            ((o) this.f2461b).Q0(rVar);
            return this;
        }

        public a H(long j) {
            n();
            ((o) this.f2461b).R0(j);
            return this;
        }

        public a I(int i) {
            n();
            ((o) this.f2461b).S0(i);
            return this;
        }

        public a J(long j) {
            n();
            ((o) this.f2461b).T0(j);
            return this;
        }

        public a K(int i) {
            n();
            ((o) this.f2461b).U0(i);
            return this;
        }

        public a L(long j) {
            n();
            ((o) this.f2461b).V0(j);
            return this;
        }

        public a M(int i) {
            n();
            ((o) this.f2461b).W0(i);
            return this;
        }

        public a N(String str) {
            n();
            ((o) this.f2461b).X0(str);
            return this;
        }

        public a O(long j) {
            n();
            ((o) this.f2461b).Y0(j);
            return this;
        }

        public a Q(int i) {
            n();
            ((o) this.f2461b).Z0(i);
            return this;
        }

        @Override // androidx.health.platform.client.proto.p
        public Map<String, DataProto$Value> a() {
            return Collections.unmodifiableMap(((o) this.f2461b).a());
        }

        public a y(s sVar) {
            n();
            ((o) this.f2461b).g0(sVar);
            return this;
        }

        public a z(String str, b bVar) {
            str.getClass();
            bVar.getClass();
            n();
            ((o) this.f2461b).r0().put(str, bVar);
            return this;
        }

        public a() {
            super(o.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements zrf {
        private static final b DEFAULT_INSTANCE;
        private static volatile tkh<b> PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private f0.i<t> values_ = GeneratedMessageLite.t();

        public static final class a extends GeneratedMessageLite.a<b, a> implements zrf {
            public /* synthetic */ a(k kVar) {
                this();
            }

            public a y(Iterable<? extends t> iterable) {
                n();
                ((b) this.f2461b).Q(iterable);
                return this;
            }

            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.K(b.class, bVar);
        }

        public static b S() {
            return DEFAULT_INSTANCE;
        }

        public static a U() {
            return DEFAULT_INSTANCE.p();
        }

        public static b V(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
        }

        public final void Q(Iterable<? extends t> iterable) {
            R();
            androidx.health.platform.client.proto.a.c(iterable, this.values_);
        }

        public final void R() {
            f0.i<t> iVar = this.values_;
            if (iVar.c()) {
                return;
            }
            this.values_ = GeneratedMessageLite.D(iVar);
        }

        public List<t> T() {
            return this.values_;
        }

        @Override // androidx.health.platform.client.proto.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            k kVar = null;
            switch (k.f2510a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(kVar);
                case 3:
                    return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", t.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    tkh<b> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (b.class) {
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

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, b> f2520a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, b.S());
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0<String, DataProto$Value> f2521a = l0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, DataProto$Value.V());
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        GeneratedMessageLite.K(o.class, oVar);
    }

    public static a L0() {
        return DEFAULT_INSTANCE.p();
    }

    public static o m0() {
        return DEFAULT_INSTANCE;
    }

    public int A0() {
        return this.zoneOffsetSeconds_;
    }

    public boolean B0() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean C0() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean D0() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean E0() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean F0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean G0() {
        return (this.bitField0_ & 16) != 0;
    }

    public final MapFieldLite<String, b> H0() {
        if (!this.subTypeDataLists_.isMutable()) {
            this.subTypeDataLists_ = this.subTypeDataLists_.mutableCopy();
        }
        return this.subTypeDataLists_;
    }

    public final MapFieldLite<String, DataProto$Value> I0() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    public final MapFieldLite<String, b> J0() {
        return this.subTypeDataLists_;
    }

    public final MapFieldLite<String, DataProto$Value> K0() {
        return this.values_;
    }

    public final void M0(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.clientId_ = str;
    }

    public final void N0(long j) {
        this.bitField0_ |= 1024;
        this.clientVersion_ = j;
    }

    public final void O0(n nVar) {
        nVar.getClass();
        this.dataOrigin_ = nVar;
        this.bitField0_ |= 8;
    }

    public final void P0(q qVar) {
        qVar.getClass();
        this.dataType_ = qVar;
        this.bitField0_ |= 1;
    }

    public final void Q0(r rVar) {
        rVar.getClass();
        this.device_ = rVar;
        this.bitField0_ |= 2048;
    }

    public final void R0(long j) {
        this.bitField0_ |= 256;
        this.endTimeMillis_ = j;
    }

    public final void S0(int i) {
        this.bitField0_ |= 131072;
        this.endZoneOffsetSeconds_ = i;
    }

    public final void T0(long j) {
        this.bitField0_ |= 64;
        this.instantTimeMillis_ = j;
    }

    public final void U0(int i) {
        this.bitField0_ |= 262144;
        this.recordingMethod_ = i;
    }

    public final void V0(long j) {
        this.bitField0_ |= 128;
        this.startTimeMillis_ = j;
    }

    public final void W0(int i) {
        this.bitField0_ |= 65536;
        this.startZoneOffsetSeconds_ = i;
    }

    public final void X0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.uid_ = str;
    }

    public final void Y0(long j) {
        this.bitField0_ |= 32;
        this.updateTimeMillis_ = j;
    }

    public final void Z0(int i) {
        this.bitField0_ |= 16;
        this.zoneOffsetSeconds_ = i;
    }

    @Override // androidx.health.platform.client.proto.p
    public Map<String, DataProto$Value> a() {
        return Collections.unmodifiableMap(K0());
    }

    public final void g0(s sVar) {
        sVar.getClass();
        h0();
        this.seriesValues_.add(sVar);
    }

    public final void h0() {
        f0.i<s> iVar = this.seriesValues_;
        if (iVar.c()) {
            return;
        }
        this.seriesValues_ = GeneratedMessageLite.D(iVar);
    }

    public String i0() {
        return this.clientId_;
    }

    public long j0() {
        return this.clientVersion_;
    }

    public n k0() {
        n nVar = this.dataOrigin_;
        return nVar == null ? n.R() : nVar;
    }

    public q l0() {
        q qVar = this.dataType_;
        return qVar == null ? q.Q() : qVar;
    }

    public r n0() {
        r rVar = this.device_;
        return rVar == null ? r.S() : rVar;
    }

    public long o0() {
        return this.endTimeMillis_;
    }

    public int p0() {
        return this.endZoneOffsetSeconds_;
    }

    public long q0() {
        return this.instantTimeMillis_;
    }

    public final Map<String, b> r0() {
        return H0();
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001ဉ\u0000\u00022\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bဈ\t\fဂ\n\rဉ\u000b\u000eဈ\f\u000f\u001b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014င\u0011\u00162\u0017င\u0012", new Object[]{"bitField0_", "dataType_", "values_", d.f2521a, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", s.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", c.f2520a, "recordingMethod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<o> bVar = PARSER;
                if (bVar == null) {
                    synchronized (o.class) {
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

    public final Map<String, DataProto$Value> s0() {
        return I0();
    }

    public int t0() {
        return this.recordingMethod_;
    }

    public List<s> u0() {
        return this.seriesValues_;
    }

    public long v0() {
        return this.startTimeMillis_;
    }

    public int w0() {
        return this.startZoneOffsetSeconds_;
    }

    public Map<String, b> x0() {
        return Collections.unmodifiableMap(J0());
    }

    public String y0() {
        return this.uid_;
    }

    public long z0() {
        return this.updateTimeMillis_;
    }
}
