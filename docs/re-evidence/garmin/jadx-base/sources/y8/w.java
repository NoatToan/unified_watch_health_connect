package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/w;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "floors", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;DLz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f195027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f195028f;

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        bVar.getClass();
        l8.a.b.a("FloorsClimbed", enumC2129a, "floors");
    }

    public w(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, double d14, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f195023a = instant;
        this.f195024b = zoneOffset;
        this.f195025c = instant2;
        this.f195026d = zoneOffset2;
        this.f195027e = d14;
        this.f195028f = cVar;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.c(d14, "floors");
            b1.e(Double.valueOf(d14), Double.valueOf(1000000.0d), "floors");
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f195026d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f195024b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f195027e == wVar.f195027e && this.f195023a.equals(wVar.f195023a) && p005kotlin.jvm.internal.s.g(this.f195024b, wVar.f195024b) && this.f195025c.equals(wVar.f195025c) && p005kotlin.jvm.internal.s.g(this.f195026d, wVar.f195026d) && this.f195028f.equals(wVar.f195028f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f195025c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f195028f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f195023a;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f195027e) * 31;
        ZoneOffset zoneOffset = this.f195024b;
        int iK = wr.g.k(this.f195025c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f195026d;
        return this.f195028f.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FloorsClimbedRecord(startTime=");
        sb3.append(this.f195023a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195024b);
        sb3.append(", endTime=");
        sb3.append(this.f195025c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195026d);
        sb3.append(", floors=");
        sb3.append(this.f195027e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195028f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/w$a;", "", "<init>", "()V", "Ll8/a;", "", "FLOORS_CLIMBED_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
