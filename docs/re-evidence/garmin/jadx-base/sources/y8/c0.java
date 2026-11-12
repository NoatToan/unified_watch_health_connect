package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly8/c0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194736c;

    public c0(Instant instant, ZoneOffset zoneOffset, z8.c cVar) {
        instant.getClass();
        cVar.getClass();
        this.f194734a = instant;
        this.f194735b = zoneOffset;
        this.f194736c = cVar;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194735b() {
        return this.f194735b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f194734a.equals(c0Var.f194734a) && p005kotlin.jvm.internal.s.g(this.f194735b, c0Var.f194735b) && this.f194736c.equals(c0Var.f194736c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194736c() {
        return this.f194736c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194734a() {
        return this.f194734a;
    }

    public final int hashCode() {
        int iHashCode = this.f194734a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194735b;
        return this.f194736c.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntermenstrualBleedingRecord(time=");
        sb3.append(this.f194734a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194735b);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194736c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
