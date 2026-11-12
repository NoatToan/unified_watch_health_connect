package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly8/r0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "", "rate", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;DLz8/c;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f194961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194962d;

    public r0(Instant instant, ZoneOffset zoneOffset, double d14, z8.c cVar) {
        instant.getClass();
        cVar.getClass();
        this.f194959a = instant;
        this.f194960b = zoneOffset;
        this.f194961c = d14;
        this.f194962d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.c(d14, "rate");
            b1.e(Double.valueOf(d14), Double.valueOf(1000.0d), "rate");
        }
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194960b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f194961c == r0Var.f194961c && this.f194959a.equals(r0Var.f194959a) && p005kotlin.jvm.internal.s.g(this.f194960b, r0Var.f194960b) && this.f194962d.equals(r0Var.f194962d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194962d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194959a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194959a, Double.hashCode(this.f194961c) * 31, 31);
        ZoneOffset zoneOffset = this.f194960b;
        return this.f194962d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RespiratoryRateRecord(time=");
        sb3.append(this.f194959a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194960b);
        sb3.append(", rate=");
        sb3.append(this.f194961c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194962d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
