package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ly8/x0;", "Ly8/t0;", "Ly8/x0$e;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "samples", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Lz8/c;)V", "d", JWKParameterNames.RSA_EXPONENT, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 implements t0<e> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.k f195051g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f195056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f195057f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.k> {
        public a(Object obj) {
            super(1, obj, c9.k.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0);
        }

        @Override // e23.l
        public final c9.k invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.k.a) this.receiver).getClass();
            return new c9.k(dDoubleValue, c9.k.b.f26021a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.k> {
        public b(Object obj) {
            super(1, obj, c9.k.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0);
        }

        @Override // e23.l
        public final c9.k invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.k.a) this.receiver).getClass();
            return new c9.k(dDoubleValue, c9.k.b.f26021a, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.k> {
        public c(Object obj) {
            super(1, obj, c9.k.a.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0);
        }

        @Override // e23.l
        public final c9.k invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.k.a) this.receiver).getClass();
            return new c9.k(dDoubleValue, c9.k.b.f26021a, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/x0$e;", "", "Ljava/time/Instant;", "time", "Lc9/k;", "speed", "<init>", "(Ljava/time/Instant;Lc9/k;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f195058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c9.k f195059b;

        public e(Instant instant, c9.k kVar) {
            instant.getClass();
            kVar.getClass();
            this.f195058a = instant;
            this.f195059b = kVar;
            b1.d(kVar, (c9.k) p13.u0.c(kVar.f26020b, c9.k.f26018d), "speed");
            b1.e(kVar, x0.f195051g, "speed");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f195058a.equals(eVar.f195058a) && this.f195059b.equals(eVar.f195059b);
        }

        public final int hashCode() {
            return this.f195059b.hashCode() + (this.f195058a.hashCode() * 31);
        }

        public final String toString() {
            return "Sample(time=" + this.f195058a + ", speed=" + this.f195059b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        new d(null);
        c9.k.a aVar = c9.k.f26017c;
        aVar.getClass();
        f195051g = new c9.k(1000000, c9.k.b.f26021a, null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("SpeedSeries", enumC2129a, "speed", aVar2);
        l8.a.b.b("SpeedSeries", l8.a.EnumC2129a.MINIMUM, "speed", new c(aVar));
        l8.a.b.b("SpeedSeries", l8.a.EnumC2129a.MAXIMUM, "speed", new b(aVar));
    }

    public x0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<e> list, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        cVar.getClass();
        this.f195052a = instant;
        this.f195053b = zoneOffset;
        this.f195054c = instant2;
        this.f195055d = zoneOffset2;
        this.f195056e = list;
        this.f195057f = cVar;
        if (instant.isAfter(instant2)) {
            vb.h.s("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f195055d;
    }

    @Override // y8.t0
    public final List<e> b() {
        return this.f195056e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f195053b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f195052a.equals(x0Var.f195052a) && p005kotlin.jvm.internal.s.g(this.f195053b, x0Var.f195053b) && this.f195054c.equals(x0Var.f195054c) && p005kotlin.jvm.internal.s.g(this.f195055d, x0Var.f195055d) && this.f195056e.equals(x0Var.f195056e) && this.f195057f.equals(x0Var.f195057f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f195054c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f195057f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f195052a;
    }

    public final int hashCode() {
        int iHashCode = this.f195052a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f195053b;
        int iK = wr.g.k(this.f195054c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f195055d;
        return this.f195057f.hashCode() + lc.u0.b((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f195056e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpeedRecord(startTime=");
        sb3.append(this.f195052a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195053b);
        sb3.append(", endTime=");
        sb3.append(this.f195054c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195055d);
        sb3.append(", samples=");
        sb3.append(this.f195056e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195057f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ly8/x0$d;", "", "<init>", "()V", "", "SPEED_TYPE_NAME", "Ljava/lang/String;", "SPEED_FIELD_NAME", "Lc9/k;", "MAX_SPEED", "Lc9/k;", "Ll8/a;", "SPEED_AVG", "Ll8/a;", "SPEED_MIN", "SPEED_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
