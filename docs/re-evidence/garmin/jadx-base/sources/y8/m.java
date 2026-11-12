package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ly8/m;", "Ly8/t0;", "Ly8/m$b;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "samples", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Lz8/c;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements t0<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f194885g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f194890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194891f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/m$b;", "", "Ljava/time/Instant;", "time", "", "revolutionsPerMinute", "<init>", "(Ljava/time/Instant;D)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f194892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f194893b;

        public b(Instant instant, double d14) {
            instant.getClass();
            this.f194892a = instant;
            this.f194893b = d14;
            b1.c(d14, "revolutionsPerMinute");
            b1.e(Double.valueOf(d14), Double.valueOf(m.f194885g), "revolutionsPerMinute");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f194892a.equals(bVar.f194892a) && this.f194893b == bVar.f194893b;
        }

        public final int hashCode() {
            return Double.hashCode(this.f194893b) + (this.f194892a.hashCode() * 31);
        }

        public final String toString() {
            return "Sample(time=" + this.f194892a + ", revolutionsPerMinute=" + this.f194893b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        new a(null);
        f194885g = 10000.0d;
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        bVar.getClass();
        l8.a.b.a("CyclingPedalingCadenceSeries", enumC2129a, "rpm");
        l8.a.b.a("CyclingPedalingCadenceSeries", l8.a.EnumC2129a.MINIMUM, "rpm");
        l8.a.b.a("CyclingPedalingCadenceSeries", l8.a.EnumC2129a.MAXIMUM, "rpm");
    }

    public m(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<b> list, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        cVar.getClass();
        this.f194886a = instant;
        this.f194887b = zoneOffset;
        this.f194888c = instant2;
        this.f194889d = zoneOffset2;
        this.f194890e = list;
        this.f194891f = cVar;
        if (instant.isAfter(instant2)) {
            vb.h.s("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF194889d() {
        return this.f194889d;
    }

    @Override // y8.t0
    public final List<b> b() {
        return this.f194890e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF194887b() {
        return this.f194887b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f194886a.equals(mVar.f194886a) && p005kotlin.jvm.internal.s.g(this.f194887b, mVar.f194887b) && this.f194888c.equals(mVar.f194888c) && p005kotlin.jvm.internal.s.g(this.f194889d, mVar.f194889d) && this.f194890e.equals(mVar.f194890e) && this.f194891f.equals(mVar.f194891f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF194888c() {
        return this.f194888c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194891f() {
        return this.f194891f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF194886a() {
        return this.f194886a;
    }

    public final int hashCode() {
        int iHashCode = this.f194886a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194887b;
        int iK = wr.g.k(this.f194888c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194889d;
        return this.f194891f.hashCode() + lc.u0.b((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f194890e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CyclingPedalingCadenceRecord(startTime=");
        sb3.append(this.f194886a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194887b);
        sb3.append(", endTime=");
        sb3.append(this.f194888c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194889d);
        sb3.append(", samples=");
        sb3.append(this.f194890e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194891f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ly8/m$a;", "", "<init>", "()V", "", "TYPE", "Ljava/lang/String;", "RPM_FIELD", "", "MAX_RPM", "D", "Ll8/a;", "RPM_AVG", "Ll8/a;", "RPM_MIN", "RPM_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
