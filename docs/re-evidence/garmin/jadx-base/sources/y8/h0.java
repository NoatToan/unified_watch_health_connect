package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/h0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 implements d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Duration f194807f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194812e;

    static {
        new a(null);
        f194807f = Duration.ofDays(31L);
    }

    public h0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f194808a = instant;
        this.f194809b = zoneOffset;
        this.f194810c = instant2;
        this.f194811d = zoneOffset2;
        this.f194812e = cVar;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Duration.between(instant, instant2).compareTo(f194807f) <= 0) {
            return;
        }
        vb.h.s("Period must not exceed 31 days");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF194811d() {
        return this.f194811d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF194809b() {
        return this.f194809b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f194808a.equals(h0Var.f194808a) && p005kotlin.jvm.internal.s.g(this.f194809b, h0Var.f194809b) && this.f194810c.equals(h0Var.f194810c) && p005kotlin.jvm.internal.s.g(this.f194811d, h0Var.f194811d) && this.f194812e.equals(h0Var.f194812e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF194810c() {
        return this.f194810c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194812e() {
        return this.f194812e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF194808a() {
        return this.f194808a;
    }

    public final int hashCode() {
        int iHashCode = this.f194808a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194809b;
        int iK = wr.g.k(this.f194810c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194811d;
        return this.f194812e.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MenstruationPeriodRecord(startTime=");
        sb3.append(this.f194808a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194809b);
        sb3.append(", endTime=");
        sb3.append(this.f194810c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194811d);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194812e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/h0$a;", "", "<init>", "()V", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "MAX_DURATION", "Ljava/time/Duration;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
