package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.turf.TurfConstants;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/n;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lc9/c;", "distance", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/c;Lz8/c;)V", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.c f194897g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.c f194902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194903f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.c> {
        public a(Object obj) {
            super(1, obj, c9.c.a.class, TurfConstants.UNIT_METERS, "meters(D)Landroidx/health/connect/client/units/Length;", 0);
        }

        @Override // e23.l
        public final c9.c invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.c.a) this.receiver).getClass();
            return c9.c.a.a(dDoubleValue);
        }
    }

    static {
        new b(null);
        c9.c.a aVar = c9.c.f25961c;
        aVar.getClass();
        f194897g = c9.c.a.a(1000000);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("Distance", enumC2129a, "distance", aVar2);
    }

    public n(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c9.c cVar, z8.c cVar2) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f194898a = instant;
        this.f194899b = zoneOffset;
        this.f194900c = instant2;
        this.f194901d = zoneOffset2;
        this.f194902e = cVar;
        this.f194903f = cVar2;
        b1.d(cVar, (c9.c) p13.u0.c(cVar.f25964b, c9.c.f25962d), "distance");
        b1.e(cVar, f194897g, "distance");
        if (instant.isBefore(instant2)) {
            return;
        }
        vb.h.s("startTime must be before endTime.");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194901d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194899b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        c9.c cVar = nVar.f194902e;
        c9.c cVar2 = this.f194902e;
        return cVar2.equals(cVar) && this.f194898a.equals(nVar.f194898a) && p005kotlin.jvm.internal.s.g(this.f194899b, nVar.f194899b) && this.f194900c.equals(nVar.f194900c) && p005kotlin.jvm.internal.s.g(this.f194901d, nVar.f194901d) && this.f194903f.equals(nVar.f194903f) && cVar2.a() == cVar.a();
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194900c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195069f() {
        return this.f194903f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194898a;
    }

    public final int hashCode() {
        c9.c cVar = this.f194902e;
        int iK = wr.g.k(this.f194898a, cVar.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194899b;
        int iK2 = wr.g.k(this.f194900c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194901d;
        return Double.hashCode(cVar.a()) + ((this.f194903f.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DistanceRecord(startTime=");
        sb3.append(this.f194898a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194899b);
        sb3.append(", endTime=");
        sb3.append(this.f194900c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194901d);
        sb3.append(", distance=");
        sb3.append(this.f194902e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194903f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly8/n$b;", "", "<init>", "()V", "Lc9/c;", "MAX_DISTANCE", "Lc9/c;", "Ll8/a;", "DISTANCE_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
