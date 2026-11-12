package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ly8/p0;", "Ly8/t0;", "Ly8/p0$e;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "samples", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Lz8/c;)V", "d", JWKParameterNames.RSA_EXPONENT, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements t0<e> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.f f194937g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f194942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194943f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.f> {
        public a(Object obj) {
            super(1, obj, c9.f.a.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", 0);
        }

        @Override // e23.l
        public final c9.f invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.f.a) this.receiver).getClass();
            return new c9.f(dDoubleValue, c9.f.b.f25990a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.f> {
        public b(Object obj) {
            super(1, obj, c9.f.a.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", 0);
        }

        @Override // e23.l
        public final c9.f invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.f.a) this.receiver).getClass();
            return new c9.f(dDoubleValue, c9.f.b.f25990a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.f> {
        public c(Object obj) {
            super(1, obj, c9.f.a.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", 0);
        }

        @Override // e23.l
        public final c9.f invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.f.a) this.receiver).getClass();
            return new c9.f(dDoubleValue, c9.f.b.f25990a, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/p0$e;", "", "Ljava/time/Instant;", "time", "Lc9/f;", "power", "<init>", "(Ljava/time/Instant;Lc9/f;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f194944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c9.f f194945b;

        public e(Instant instant, c9.f fVar) {
            instant.getClass();
            fVar.getClass();
            this.f194944a = instant;
            this.f194945b = fVar;
            b1.d(fVar, (c9.f) p13.u0.c(fVar.f25989b, c9.f.f25987d), "power");
            b1.e(fVar, p0.f194937g, "power");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f194944a.equals(eVar.f194944a) && this.f194945b.equals(eVar.f194945b);
        }

        public final int hashCode() {
            return this.f194945b.hashCode() + (this.f194944a.hashCode() * 31);
        }

        public final String toString() {
            return "Sample(time=" + this.f194944a + ", power=" + this.f194945b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        new d(null);
        c9.f.a aVar = c9.f.f25986c;
        aVar.getClass();
        f194937g = new c9.f(100000, c9.f.b.f25990a, null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("PowerSeries", enumC2129a, "power", aVar2);
        l8.a.b.b("PowerSeries", l8.a.EnumC2129a.MINIMUM, "power", new c(aVar));
        l8.a.b.b("PowerSeries", l8.a.EnumC2129a.MAXIMUM, "power", new b(aVar));
    }

    public p0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<e> list, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        cVar.getClass();
        this.f194938a = instant;
        this.f194939b = zoneOffset;
        this.f194940c = instant2;
        this.f194941d = zoneOffset2;
        this.f194942e = list;
        this.f194943f = cVar;
        if (instant.isAfter(instant2)) {
            vb.h.s("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194941d;
    }

    @Override // y8.t0
    public final List<e> b() {
        return this.f194942e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194939b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f194938a.equals(p0Var.f194938a) && p005kotlin.jvm.internal.s.g(this.f194939b, p0Var.f194939b) && this.f194940c.equals(p0Var.f194940c) && p005kotlin.jvm.internal.s.g(this.f194941d, p0Var.f194941d) && this.f194942e.equals(p0Var.f194942e) && this.f194943f.equals(p0Var.f194943f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194940c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194943f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194938a;
    }

    public final int hashCode() {
        int iHashCode = this.f194938a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194939b;
        int iK = wr.g.k(this.f194940c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194941d;
        return this.f194943f.hashCode() + lc.u0.b((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f194942e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PowerRecord(startTime=");
        sb3.append(this.f194938a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194939b);
        sb3.append(", endTime=");
        sb3.append(this.f194940c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194941d);
        sb3.append(", samples=");
        sb3.append(this.f194942e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194943f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ly8/p0$d;", "", "<init>", "()V", "", "TYPE", "Ljava/lang/String;", "POWER_FIELD", "Lc9/f;", "MAX_POWER", "Lc9/f;", "Ll8/a;", "POWER_AVG", "Ll8/a;", "POWER_MIN", "POWER_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
