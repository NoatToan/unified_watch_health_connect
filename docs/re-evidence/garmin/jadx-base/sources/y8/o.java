package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.turf.TurfConstants;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/o;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lc9/c;", "elevation", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/c;Lz8/c;)V", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.c f194916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c9.c f194917h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.c f194922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194923f;

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
        f194916g = c9.c.a.a(1000000);
        aVar.getClass();
        f194917h = c9.c.a.a(-1000000);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("ElevationGained", enumC2129a, "elevation", aVar2);
    }

    public o(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c9.c cVar, z8.c cVar2) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f194918a = instant;
        this.f194919b = zoneOffset;
        this.f194920c = instant2;
        this.f194921d = zoneOffset2;
        this.f194922e = cVar;
        this.f194923f = cVar2;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.d(cVar, f194917h, "elevation");
            b1.e(cVar, f194916g, "elevation");
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194921d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194919b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f194922e.equals(oVar.f194922e) && this.f194918a.equals(oVar.f194918a) && p005kotlin.jvm.internal.s.g(this.f194919b, oVar.f194919b) && this.f194920c.equals(oVar.f194920c) && p005kotlin.jvm.internal.s.g(this.f194921d, oVar.f194921d) && this.f194923f.equals(oVar.f194923f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194920c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194923f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194918a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194918a, this.f194922e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194919b;
        int iK2 = wr.g.k(this.f194920c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194921d;
        return this.f194923f.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ElevationGainedRecord(startTime=");
        sb3.append(this.f194918a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194919b);
        sb3.append(", endTime=");
        sb3.append(this.f194920c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194921d);
        sb3.append(", elevation=");
        sb3.append(this.f194922e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194923f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly8/o$b;", "", "<init>", "()V", "Lc9/c;", "MAX_ELEVATION_GAIN", "Lc9/c;", "MIN_ELEVATION_GAIN", "Ll8/a;", "ELEVATION_GAINED_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
