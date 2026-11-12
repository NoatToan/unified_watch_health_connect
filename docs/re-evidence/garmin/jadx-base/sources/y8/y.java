package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/y;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "", "heartRateVariabilityMillis", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;DLz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f195062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f195063d;

    static {
        new a(null);
    }

    public y(Instant instant, ZoneOffset zoneOffset, double d14, z8.c cVar) {
        instant.getClass();
        cVar.getClass();
        this.f195060a = instant;
        this.f195061b = zoneOffset;
        this.f195062c = d14;
        this.f195063d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.b(Double.valueOf(d14), Double.valueOf(1.0d), Double.valueOf(200.0d), "heartRateVariabilityMillis");
        }
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195061b() {
        return this.f195061b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f195062c == yVar.f195062c && this.f195060a.equals(yVar.f195060a) && p005kotlin.jvm.internal.s.g(this.f195061b, yVar.f195061b) && this.f195063d.equals(yVar.f195063d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195063d() {
        return this.f195063d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195060a() {
        return this.f195060a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f195060a, Double.hashCode(this.f195062c) * 31, 31);
        ZoneOffset zoneOffset = this.f195061b;
        return this.f195063d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeartRateVariabilityRmssdRecord(time=");
        sb3.append(this.f195060a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f195061b);
        sb3.append(", heartRateVariabilityMillis=");
        sb3.append(this.f195062c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195063d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ly8/y$a;", "", "<init>", "()V", "", "MIN_HRV_RMSSD", "D", "MAX_HRV_RMSSD", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
