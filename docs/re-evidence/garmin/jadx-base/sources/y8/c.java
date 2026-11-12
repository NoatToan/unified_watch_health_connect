package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/c;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "Lc9/h;", "temperature", "", "measurementLocation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Lc9/h;I)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c9.h f194727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.h f194728g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.h f194732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f194733e;

    static {
        new a(null);
        f194727f = c9.j.a(0);
        f194728g = c9.j.a(100);
    }

    public c(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.h hVar, int i14) {
        instant.getClass();
        cVar.getClass();
        hVar.getClass();
        this.f194729a = instant;
        this.f194730b = zoneOffset;
        this.f194731c = cVar;
        this.f194732d = hVar;
        this.f194733e = i14;
        b1.d(hVar, f194727f, "temperature");
        b1.e(hVar, f194728g, "temperature");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194730b() {
        return this.f194730b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f194732d, cVar.f194732d) && this.f194733e == cVar.f194733e && p005kotlin.jvm.internal.s.g(this.f194729a, cVar.f194729a) && p005kotlin.jvm.internal.s.g(this.f194730b, cVar.f194730b) && p005kotlin.jvm.internal.s.g(this.f194731c, cVar.f194731c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194731c() {
        return this.f194731c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194729a() {
        return this.f194729a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194729a, ((this.f194732d.hashCode() * 31) + this.f194733e) * 31, 31);
        ZoneOffset zoneOffset = this.f194730b;
        return this.f194731c.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BasalBodyTemperatureRecord(time=");
        sb3.append(this.f194729a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194730b);
        sb3.append(", temperature=");
        sb3.append(this.f194732d);
        sb3.append(", measurementLocation=");
        sb3.append(this.f194733e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194731c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ly8/c$a;", "", "<init>", "()V", "Lc9/h;", "MIN_TEMPERATURE", "Lc9/h;", "MAX_TEMPERATURE", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Instant instant, ZoneOffset zoneOffset, z8.c cVar, c9.h hVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, hVar, (i15 & 16) != 0 ? 0 : i14);
    }
}
