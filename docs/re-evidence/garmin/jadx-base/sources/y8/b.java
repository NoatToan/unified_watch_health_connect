package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/b;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "activityIntensityType", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;I)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f194719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinkedHashMap f194720h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f194726f;

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.DURATION;
        bVar.getClass();
        l8.a.b.c("ActivityIntensity", enumC2129a, "moderateDuration");
        l8.a.b.c("ActivityIntensity", enumC2129a, "vigorousDuration");
        l8.a.b.c("ActivityIntensity", enumC2129a, "duration");
        l8.a.b.c("ActivityIntensity", enumC2129a, "intensityMinutes");
        Map mapE = p13.u0.e(new o13.p("moderate", 0), new o13.p("vigorous", 1));
        f194719g = mapE;
        f194720h = b1.f(mapE);
    }

    public b(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f194721a = instant;
        this.f194722b = zoneOffset;
        this.f194723c = instant2;
        this.f194724d = zoneOffset2;
        this.f194725e = cVar;
        this.f194726f = i14;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            if (instant.isBefore(instant2)) {
                return;
            }
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194724d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194722b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f194726f == bVar.f194726f && this.f194721a.equals(bVar.f194721a) && p005kotlin.jvm.internal.s.g(this.f194722b, bVar.f194722b) && this.f194723c.equals(bVar.f194723c) && p005kotlin.jvm.internal.s.g(this.f194724d, bVar.f194724d) && this.f194725e.equals(bVar.f194725e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194723c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194725e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194721a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194721a, Integer.hashCode(this.f194726f) * 31, 31);
        ZoneOffset zoneOffset = this.f194722b;
        int iK2 = wr.g.k(this.f194723c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194724d;
        return this.f194725e.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityIntensityRecord(startTime=");
        sb3.append(this.f194721a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194722b);
        sb3.append(", endTime=");
        sb3.append(this.f194723c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194724d);
        sb3.append(", activityIntensityType=");
        sb3.append(this.f194726f);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194725e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Ly8/b$a;", "", "<init>", "()V", "Ll8/a;", "Ljava/time/Duration;", "MODERATE_DURATION_TOTAL", "Ll8/a;", "VIGOROUS_DURATION_TOTAL", "DURATION_TOTAL", "INTENSITY_MINUTES_TOTAL", "", "ACTIVITY_INTENSITY_TYPE_MODERATE", "I", "ACTIVITY_INTENSITY_TYPE_VIGOROUS", "", "", "ACTIVITY_INTENSITY_TYPE_STRING_TO_INT_MAP", "Ljava/util/Map;", "ACTIVITY_INTENSITY_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
