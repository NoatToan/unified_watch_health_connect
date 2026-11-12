package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/s0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "", "beatsPerMinute", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;JLz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f194972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194973d;

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        bVar.getClass();
        l8.a.b.d("RestingHeartRate", enumC2129a, "bpm");
        l8.a.b.d("RestingHeartRate", l8.a.EnumC2129a.MINIMUM, "bpm");
        l8.a.b.d("RestingHeartRate", l8.a.EnumC2129a.MAXIMUM, "bpm");
    }

    public s0(Instant instant, ZoneOffset zoneOffset, long j8, z8.c cVar) {
        instant.getClass();
        cVar.getClass();
        this.f194970a = instant;
        this.f194971b = zoneOffset;
        this.f194972c = j8;
        this.f194973d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else if (j8 >= 0) {
            b1.e(Long.valueOf(j8), 300L, "beatsPerMinute");
        } else {
            vb.h.x("beatsPerMinute".concat(" must not be negative"));
            throw null;
        }
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194971b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f194972c == s0Var.f194972c && this.f194970a.equals(s0Var.f194970a) && p005kotlin.jvm.internal.s.g(this.f194971b, s0Var.f194971b) && this.f194973d.equals(s0Var.f194973d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194973d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194970a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194970a, Long.hashCode(this.f194972c) * 31, 31);
        ZoneOffset zoneOffset = this.f194971b;
        return this.f194973d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RestingHeartRateRecord(time=");
        sb3.append(this.f194970a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194971b);
        sb3.append(", beatsPerMinute=");
        sb3.append(this.f194972c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194973d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Ly8/s0$a;", "", "<init>", "()V", "", "REST_HEART_RATE_TYPE_NAME", "Ljava/lang/String;", "BPM_FIELD_NAME", "Ll8/a;", "", "BPM_AVG", "Ll8/a;", "BPM_MIN", "BPM_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
