package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ly8/x;", "Ly8/t0;", "Ly8/x$b;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "", "samples", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Lz8/c;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x implements t0<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f195045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f195046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f195047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f195048f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly8/x$b;", "", "Ljava/time/Instant;", "time", "", "beatsPerMinute", "<init>", "(Ljava/time/Instant;J)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f195049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f195050b;

        public b(Instant instant, long j8) {
            instant.getClass();
            this.f195049a = instant;
            this.f195050b = j8;
            b1.d(Long.valueOf(j8), 1L, "beatsPerMinute");
            b1.e(Long.valueOf(j8), 300L, "beatsPerMinute");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f195049a.equals(bVar.f195049a) && this.f195050b == bVar.f195050b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f195050b) + (this.f195049a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Sample(time=");
            sb3.append(this.f195049a);
            sb3.append(", beatsPerMinute=");
            return androidx.room.a0.l(sb3, this.f195050b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        bVar.getClass();
        l8.a.b.d("HeartRateSeries", enumC2129a, "bpm");
        l8.a.b.d("HeartRateSeries", l8.a.EnumC2129a.MINIMUM, "bpm");
        l8.a.b.d("HeartRateSeries", l8.a.EnumC2129a.MAXIMUM, "bpm");
        new l8.a(new l8.b(), "HeartRateSeries", l8.a.EnumC2129a.COUNT, null);
    }

    public x(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<b> list, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        cVar.getClass();
        this.f195043a = instant;
        this.f195044b = zoneOffset;
        this.f195045c = instant2;
        this.f195046d = zoneOffset2;
        this.f195047e = list;
        this.f195048f = cVar;
        if (instant.isAfter(instant2)) {
            vb.h.s("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195046d() {
        return this.f195046d;
    }

    @Override // y8.t0
    public final List<b> b() {
        return this.f195047e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195044b() {
        return this.f195044b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f195043a.equals(xVar.f195043a) && p005kotlin.jvm.internal.s.g(this.f195044b, xVar.f195044b) && this.f195045c.equals(xVar.f195045c) && p005kotlin.jvm.internal.s.g(this.f195046d, xVar.f195046d) && this.f195047e.equals(xVar.f195047e) && this.f195048f.equals(xVar.f195048f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195045c() {
        return this.f195045c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195048f() {
        return this.f195048f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195043a() {
        return this.f195043a;
    }

    public final int hashCode() {
        int iHashCode = this.f195043a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f195044b;
        int iK = wr.g.k(this.f195045c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f195046d;
        return this.f195048f.hashCode() + lc.u0.b((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f195047e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeartRateRecord(startTime=");
        sb3.append(this.f195043a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f195044b);
        sb3.append(", endTime=");
        sb3.append(this.f195045c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f195046d);
        sb3.append(", samples=");
        sb3.append(this.f195047e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195048f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Ly8/x$a;", "", "<init>", "()V", "", "HEART_RATE_TYPE_NAME", "Ljava/lang/String;", "BPM_FIELD_NAME", "Ll8/a;", "", "BPM_AVG", "Ll8/a;", "BPM_MIN", "BPM_MAX", "MEASUREMENTS_COUNT", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
