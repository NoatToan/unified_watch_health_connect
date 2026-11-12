package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0013\u0014BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ly8/v0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "Ly8/v0$e;", "deltas", "Lc9/h;", "baseline", "", "measurementLocation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Ljava/util/List;Lc9/h;I)V", "d", JWKParameterNames.RSA_EXPONENT, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c9.h f195007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c9.h f195008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f195009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f195010l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f195015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f195016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c9.h f195017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f195018h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.i> {
        public a(Object obj) {
            super(1, obj, c9.i.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0);
        }

        @Override // e23.l
        public final c9.i invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.i.a) this.receiver).getClass();
            return new c9.i(dDoubleValue, c9.i.b.f26011a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.i> {
        public b(Object obj) {
            super(1, obj, c9.i.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0);
        }

        @Override // e23.l
        public final c9.i invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.i.a) this.receiver).getClass();
            return new c9.i(dDoubleValue, c9.i.b.f26011a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.i> {
        public c(Object obj) {
            super(1, obj, c9.i.a.class, "celsius", "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0);
        }

        @Override // e23.l
        public final c9.i invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.i.a) this.receiver).getClass();
            return new c9.i(dDoubleValue, c9.i.b.f26011a, null);
        }
    }

    static {
        new d(null);
        f195007i = c9.j.a(0);
        f195008j = c9.j.a(100);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        c9.i.a aVar = c9.i.f26008c;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("SkinTemperature", enumC2129a, "temperatureDelta", aVar2);
        l8.a.b.b("SkinTemperature", l8.a.EnumC2129a.MINIMUM, "temperatureDelta", new c(aVar));
        l8.a.b.b("SkinTemperature", l8.a.EnumC2129a.MAXIMUM, "temperatureDelta", new b(aVar));
        Map mapE = p13.u0.e(new o13.p("finger", 1), new o13.p("toe", 2), new o13.p("wrist", 3));
        f195009k = mapE;
        f195010l = b1.f(mapE);
    }

    public v0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List<e> list, c9.h hVar, int i14) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        this.f195011a = instant;
        this.f195012b = zoneOffset;
        this.f195013c = instant2;
        this.f195014d = zoneOffset2;
        this.f195015e = cVar;
        this.f195016f = list;
        this.f195017g = hVar;
        this.f195018h = i14;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (hVar != null) {
            b1.d(hVar, f195007i, "temperature");
            b1.e(hVar, f195008j, "temperature");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            throw null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant3 = ((e) next).f195021a;
            do {
                Object next2 = it.next();
                Instant instant4 = ((e) next2).f195021a;
                if (instant3.compareTo(instant4) > 0) {
                    next = next2;
                    instant3 = instant4;
                }
            } while (it.hasNext());
        }
        if (((e) next).f195021a.isBefore(this.f195011a)) {
            vb.h.s("deltas can not be out of parent time range.");
            throw null;
        }
        Iterator<T> it3 = this.f195016f.iterator();
        if (!it3.hasNext()) {
            c22.t.g();
            throw null;
        }
        Object next3 = it3.next();
        if (it3.hasNext()) {
            Instant instant5 = ((e) next3).f195021a;
            do {
                Object next4 = it3.next();
                Instant instant6 = ((e) next4).f195021a;
                if (instant5.compareTo(instant6) < 0) {
                    next3 = next4;
                    instant5 = instant6;
                }
            } while (it3.hasNext());
        }
        if (((e) next3).f195021a.isBefore(this.f195013c)) {
            return;
        }
        vb.h.s("deltas can not be out of parent time range.");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f195014d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f195012b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return p005kotlin.jvm.internal.s.g(this.f195011a, v0Var.f195011a) && p005kotlin.jvm.internal.s.g(this.f195013c, v0Var.f195013c) && p005kotlin.jvm.internal.s.g(this.f195012b, v0Var.f195012b) && p005kotlin.jvm.internal.s.g(this.f195014d, v0Var.f195014d) && p005kotlin.jvm.internal.s.g(this.f195017g, v0Var.f195017g) && this.f195018h == v0Var.f195018h && p005kotlin.jvm.internal.s.g(this.f195016f, v0Var.f195016f) && p005kotlin.jvm.internal.s.g(this.f195015e, v0Var.f195015e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f195013c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f195015e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f195011a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f195013c, this.f195011a.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f195012b;
        int iHashCode = (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset2 = this.f195014d;
        int iHashCode2 = (iHashCode + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31;
        c9.h hVar = this.f195017g;
        return this.f195015e.hashCode() + lc.u0.b(q2.d(this.f195018h, (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31, 31), 31, this.f195016f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SkinTemperatureRecord(startTime=");
        sb3.append(this.f195011a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195012b);
        sb3.append(", endTime=");
        sb3.append(this.f195013c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195014d);
        sb3.append(", deltas=");
        sb3.append(this.f195016f);
        sb3.append(", baseline=");
        sb3.append(this.f195017g);
        sb3.append(", measurementLocation=");
        sb3.append(this.f195018h);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195015e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ly8/v0$e;", "", "Ljava/time/Instant;", "time", "Lc9/i;", "delta", "<init>", "(Ljava/time/Instant;Lc9/i;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c9.i f195019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c9.i f195020d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f195021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c9.i f195022b;

        static {
            new a(null);
            c9.i.f26008c.getClass();
            c9.i.b.a aVar = c9.i.b.f26011a;
            f195019c = new c9.i(-30.0d, aVar, null);
            f195020d = new c9.i(30.0d, aVar, null);
        }

        public e(Instant instant, c9.i iVar) {
            instant.getClass();
            iVar.getClass();
            this.f195021a = instant;
            this.f195022b = iVar;
            b1.d(iVar, f195019c, "delta");
            b1.e(iVar, f195020d, "delta");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!e.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            e eVar = (e) obj;
            return this.f195021a.equals(eVar.f195021a) && this.f195022b.equals(eVar.f195022b);
        }

        public final int hashCode() {
            return this.f195022b.hashCode() + (this.f195021a.hashCode() * 31);
        }

        public final String toString() {
            return "Delta(time=" + this.f195021a + ", delta=" + this.f195022b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ly8/v0$e$a;", "", "<init>", "()V", "Lc9/i;", "MIN_DELTA_TEMPERATURE", "Lc9/i;", "MAX_DELTA_TEMPERATURE", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Ly8/v0$d;", "", "<init>", "()V", "", "SKIN_TEMPERATURE_TYPE_NAME", "Ljava/lang/String;", "TEMPERATURE_DELTA_FIELD_NAME", "Lc9/h;", "MIN_TEMPERATURE", "Lc9/h;", "MAX_TEMPERATURE", "Ll8/a;", "Lc9/i;", "TEMPERATURE_DELTA_AVG", "Ll8/a;", "TEMPERATURE_DELTA_MIN", "TEMPERATURE_DELTA_MAX", "", "MEASUREMENT_LOCATION_UNKNOWN", "I", "MEASUREMENT_LOCATION_FINGER", "MEASUREMENT_LOCATION_TOE", "MEASUREMENT_LOCATION_WRIST", "", "MEASUREMENT_LOCATION_STRING_TO_INT_MAP", "Ljava/util/Map;", "MEASUREMENT_LOCATION_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ v0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, List list, c9.h hVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, list, (i15 & 64) != 0 ? null : hVar, (i15 & 128) != 0 ? 0 : i14);
    }
}
