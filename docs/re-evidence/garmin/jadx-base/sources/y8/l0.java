package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly8/l0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lc9/e;", "percentage", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/e;Lz8/c;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f194883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194884d;

    public l0(Instant instant, ZoneOffset zoneOffset, c9.e eVar, z8.c cVar) {
        instant.getClass();
        eVar.getClass();
        double d14 = eVar.f25985a;
        cVar.getClass();
        this.f194881a = instant;
        this.f194882b = zoneOffset;
        this.f194883c = eVar;
        this.f194884d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.c(d14, "percentage");
            b1.e(Double.valueOf(d14), Double.valueOf(100.0d), "percentage");
        }
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194882b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f194883c.equals(l0Var.f194883c) && this.f194881a.equals(l0Var.f194881a) && p005kotlin.jvm.internal.s.g(this.f194882b, l0Var.f194882b) && this.f194884d.equals(l0Var.f194884d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194884d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194881a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194881a, Double.hashCode(this.f194883c.f25985a) * 31, 31);
        ZoneOffset zoneOffset = this.f194882b;
        return this.f194884d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OxygenSaturationRecord(time=");
        sb3.append(this.f194881a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194882b);
        sb3.append(", percentage=");
        sb3.append(this.f194883c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194884d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
