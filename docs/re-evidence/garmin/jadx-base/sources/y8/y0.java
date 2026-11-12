package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ly8/y0;", "Ly8/t0;", "Ly8/y0$b;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "samples", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Lz8/c;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 implements t0<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f195068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f195069f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/y0$b;", "", "Ljava/time/Instant;", "time", "", "rate", "<init>", "(Ljava/time/Instant;D)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f195070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f195071b;

        public b(Instant instant, double d14) {
            instant.getClass();
            this.f195070a = instant;
            this.f195071b = d14;
            b1.c(d14, "rate");
            b1.e(Double.valueOf(d14), Double.valueOf(10000.0d), "rate");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f195070a.equals(bVar.f195070a) && this.f195071b == bVar.f195071b;
        }

        public final int hashCode() {
            return Double.hashCode(this.f195071b) + (this.f195070a.hashCode() * 31);
        }

        public final String toString() {
            return "Sample(time=" + this.f195070a + ", rate=" + this.f195071b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        bVar.getClass();
        l8.a.b.a("StepsCadenceSeries", enumC2129a, "rate");
        l8.a.b.a("StepsCadenceSeries", l8.a.EnumC2129a.MINIMUM, "rate");
        l8.a.b.a("StepsCadenceSeries", l8.a.EnumC2129a.MAXIMUM, "rate");
    }

    public y0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<b> list, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        cVar.getClass();
        this.f195064a = instant;
        this.f195065b = zoneOffset;
        this.f195066c = instant2;
        this.f195067d = zoneOffset2;
        this.f195068e = list;
        this.f195069f = cVar;
        if (instant.isAfter(instant2)) {
            vb.h.s("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f195067d;
    }

    @Override // y8.t0
    public final List<b> b() {
        return this.f195068e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f195065b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f195064a.equals(y0Var.f195064a) && p005kotlin.jvm.internal.s.g(this.f195065b, y0Var.f195065b) && this.f195066c.equals(y0Var.f195066c) && p005kotlin.jvm.internal.s.g(this.f195067d, y0Var.f195067d) && this.f195068e.equals(y0Var.f195068e) && this.f195069f.equals(y0Var.f195069f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f195066c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195069f() {
        return this.f195069f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f195064a;
    }

    public final int hashCode() {
        int iHashCode = this.f195064a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f195065b;
        int iK = wr.g.k(this.f195066c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f195067d;
        return this.f195069f.hashCode() + lc.u0.b((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f195068e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StepsCadenceRecord(startTime=");
        sb3.append(this.f195064a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195065b);
        sb3.append(", endTime=");
        sb3.append(this.f195066c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195067d);
        sb3.append(", samples=");
        sb3.append(this.f195068e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195069f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Ly8/y0$a;", "", "<init>", "()V", "", "TYPE", "Ljava/lang/String;", "RATE_FIELD", "Ll8/a;", "", "RATE_AVG", "Ll8/a;", "RATE_MIN", "RATE_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
