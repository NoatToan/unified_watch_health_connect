package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly8/i;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "Lc9/h;", "temperature", "", "measurementLocation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Lc9/h;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.h f194816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f194817e;

    public i(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.h hVar, int i14) {
        instant.getClass();
        cVar.getClass();
        hVar.getClass();
        this.f194813a = instant;
        this.f194814b = zoneOffset;
        this.f194815c = cVar;
        this.f194816d = hVar;
        this.f194817e = i14;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194814b() {
        return this.f194814b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f194816d, iVar.f194816d) && this.f194817e == iVar.f194817e && p005kotlin.jvm.internal.s.g(this.f194813a, iVar.f194813a) && p005kotlin.jvm.internal.s.g(this.f194814b, iVar.f194814b) && p005kotlin.jvm.internal.s.g(this.f194815c, iVar.f194815c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194815c() {
        return this.f194815c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194813a() {
        return this.f194813a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194813a, ((this.f194816d.hashCode() * 31) + this.f194817e) * 31, 31);
        ZoneOffset zoneOffset = this.f194814b;
        return this.f194815c.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyTemperatureRecord(time=");
        sb3.append(this.f194813a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194814b);
        sb3.append(", temperature=");
        sb3.append(this.f194816d);
        sb3.append(", measurementLocation=");
        sb3.append(this.f194817e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194815c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ i(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.h hVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, hVar, (i15 & 16) != 0 ? 0 : i14);
    }
}
