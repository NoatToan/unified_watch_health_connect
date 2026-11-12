package androidx.health.platform.client.proto;

import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p extends j0<p, a> implements d1 {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    private static volatile l1<p> PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    private n avg_;
    private int bitField0_;
    private String clientId_;
    private long clientVersion_;
    private o dataOrigin_;
    private q dataType_;
    private r device_;
    private long endTimeMillis_;
    private int endZoneOffsetSeconds_;
    private long instantTimeMillis_;
    private n max_;
    private n min_;
    private String originSampleUid_;
    private String originSeriesUid_;
    private int recordingMethod_;
    private l0.d<s> seriesValues_;
    private long startTimeMillis_;
    private int startZoneOffsetSeconds_;
    private w0<String, b> subTypeDataLists_;
    private String uid_;
    private long updateTimeMillis_;
    private w0<String, u> values_;
    private int zoneOffsetSeconds_;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<String, b> f7742a = v0.b(b3.f7548k, b3.f7550m, b.u());

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<String, u> f7743a = v0.b(b3.f7548k, b3.f7550m, u.y());

        private d() {
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        j0.r(p.class, pVar);
    }

    private p() {
        w0 w0Var = w0.f7805b;
        this.values_ = w0Var;
        this.subTypeDataLists_ = w0Var;
        this.uid_ = "";
        this.originSeriesUid_ = "";
        this.clientId_ = "";
        this.originSampleUid_ = "";
        this.seriesValues_ = s1.f7778d;
    }

    public static void A(p pVar, o oVar) {
        pVar.getClass();
        pVar.dataOrigin_ = oVar;
        pVar.bitField0_ |= 8;
    }

    public static void B(p pVar, int i14) {
        pVar.bitField0_ |= 16;
        pVar.zoneOffsetSeconds_ = i14;
    }

    public static void C(p pVar, long j8) {
        pVar.bitField0_ |= 32;
        pVar.updateTimeMillis_ = j8;
    }

    public static void D(p pVar, long j8) {
        pVar.bitField0_ |= 64;
        pVar.instantTimeMillis_ = j8;
    }

    public static void E(p pVar, long j8) {
        pVar.bitField0_ |= 128;
        pVar.startTimeMillis_ = j8;
    }

    public static void F(p pVar, long j8) {
        pVar.bitField0_ |= 256;
        pVar.endTimeMillis_ = j8;
    }

    public static void G(String str, p pVar) {
        pVar.getClass();
        str.getClass();
        pVar.bitField0_ |= 512;
        pVar.clientId_ = str;
    }

    public static void H(p pVar, long j8) {
        pVar.bitField0_ |= 1024;
        pVar.clientVersion_ = j8;
    }

    public static void I(p pVar, r rVar) {
        pVar.getClass();
        pVar.device_ = rVar;
        pVar.bitField0_ |= 2048;
    }

    public static void J(p pVar, s sVar) {
        pVar.getClass();
        sVar.getClass();
        l0.d<s> dVar = pVar.seriesValues_;
        if (!dVar.isModifiable()) {
            pVar.seriesValues_ = j0.o(dVar);
        }
        pVar.seriesValues_.add(sVar);
    }

    public static p K() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return DEFAULT_INSTANCE.h();
    }

    public static void s(p pVar, int i14) {
        pVar.bitField0_ |= 65536;
        pVar.startZoneOffsetSeconds_ = i14;
    }

    public static void t(p pVar, int i14) {
        pVar.bitField0_ |= 131072;
        pVar.endZoneOffsetSeconds_ = i14;
    }

    public static w0 u(p pVar) {
        w0<String, b> w0Var = pVar.subTypeDataLists_;
        if (!w0Var.f7806a) {
            pVar.subTypeDataLists_ = w0Var.c();
        }
        return pVar.subTypeDataLists_;
    }

    public static void v(p pVar, int i14) {
        pVar.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        pVar.recordingMethod_ = i14;
    }

    public static void x(p pVar, q qVar) {
        pVar.getClass();
        pVar.dataType_ = qVar;
        pVar.bitField0_ |= 1;
    }

    public static w0 y(p pVar) {
        w0<String, u> w0Var = pVar.values_;
        if (!w0Var.f7806a) {
            pVar.values_ = w0Var.c();
        }
        return pVar.values_;
    }

    public static void z(String str, p pVar) {
        pVar.getClass();
        str.getClass();
        pVar.bitField0_ |= 2;
        pVar.uid_ = str;
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        m mVar = null;
        switch (m.f7711a[fVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new a(mVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001ဉ\u0000\u00022\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bဈ\t\fဂ\n\rဉ\u000b\u000eဈ\f\u000f\u001b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014င\u0011\u00162\u0017င\u0012", new Object[]{"bitField0_", "dataType_", "values_", d.f7743a, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", s.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", c.f7742a, "recordingMethod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<p> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (p.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new j0.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                com.google.protobuf.a.m();
                return null;
        }
    }

    public static final class b extends j0<b, a> implements d1 {
        private static final b DEFAULT_INSTANCE;
        private static volatile l1<b> PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private l0.d<t> values_ = s1.f7778d;

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            j0.r(b.class, bVar);
        }

        private b() {
        }

        public static void t(b bVar, ArrayList arrayList) {
            l0.d<t> dVar = bVar.values_;
            if (!dVar.isModifiable()) {
                bVar.values_ = j0.o(dVar);
            }
            androidx.health.platform.client.proto.a.c(arrayList, bVar.values_);
        }

        public static b u() {
            return DEFAULT_INSTANCE;
        }

        public static a v() {
            return DEFAULT_INSTANCE.h();
        }

        @Override // androidx.health.platform.client.proto.j0
        public final Object i(j0.f fVar) {
            l1 bVar;
            m mVar = null;
            switch (m.f7711a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(mVar);
                case 3:
                    return new t1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", t.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    l1<b> l1Var = PARSER;
                    if (l1Var != null) {
                        return l1Var;
                    }
                    synchronized (b.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new j0.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    com.google.protobuf.a.m();
                    return null;
            }
        }

        public static final class a extends j0.a<b, a> implements d1 {
            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            public final void j(ArrayList arrayList) {
                g();
                b.t((b) this.f7677b, arrayList);
            }

            public /* synthetic */ a(m mVar) {
                this();
            }
        }
    }

    public static final class a extends j0.a<p, a> implements d1 {
        private a() {
            super(p.DEFAULT_INSTANCE);
        }

        public final void j(String str, b bVar) {
            g();
            p.u((p) this.f7677b).put(str, bVar);
        }

        public final void k(u uVar, String str) {
            g();
            p.y((p) this.f7677b).put(str, uVar);
        }

        public final void l(q qVar) {
            g();
            p.x((p) this.f7677b, qVar);
        }

        public /* synthetic */ a(m mVar) {
            this();
        }
    }
}
