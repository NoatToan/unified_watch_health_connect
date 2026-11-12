package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/e1;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "count", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f194775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194776f;

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        bVar.getClass();
        l8.a.b.d("WheelchairPushes", enumC2129a, "count");
    }

    public e1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j8, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f194771a = instant;
        this.f194772b = zoneOffset;
        this.f194773c = instant2;
        this.f194774d = zoneOffset2;
        this.f194775e = j8;
        this.f194776f = cVar;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else if (j8 >= 0) {
            b1.e(Long.valueOf(j8), 1000000L, "count");
        } else {
            vb.h.x("count".concat(" must not be negative"));
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194774d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194772b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f194775e == e1Var.f194775e && this.f194771a.equals(e1Var.f194771a) && p005kotlin.jvm.internal.s.g(this.f194772b, e1Var.f194772b) && this.f194773c.equals(e1Var.f194773c) && p005kotlin.jvm.internal.s.g(this.f194774d, e1Var.f194774d) && this.f194776f.equals(e1Var.f194776f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194773c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194776f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194771a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f194775e) * 31;
        ZoneOffset zoneOffset = this.f194772b;
        int iK = wr.g.k(this.f194773c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194774d;
        return this.f194776f.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WheelchairPushesRecord(startTime=");
        sb3.append(this.f194771a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194772b);
        sb3.append(", endTime=");
        sb3.append(this.f194773c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194774d);
        sb3.append(", count=");
        sb3.append(this.f194775e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194776f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/e1$a;", "", "<init>", "()V", "Ll8/a;", "", "COUNT_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
