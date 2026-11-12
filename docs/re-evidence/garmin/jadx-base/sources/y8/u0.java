package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/u0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "protectionUsed", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;I)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f194985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashMap f194986f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f194990d;

    static {
        new a(null);
        Map mapE = p13.u0.e(new o13.p("protected", 1), new o13.p("unprotected", 2));
        f194985e = mapE;
        f194986f = b1.f(mapE);
    }

    public u0(Instant instant, ZoneOffset zoneOffset, z8.c cVar, int i14) {
        instant.getClass();
        cVar.getClass();
        this.f194987a = instant;
        this.f194988b = zoneOffset;
        this.f194989c = cVar;
        this.f194990d = i14;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194877b() {
        return this.f194988b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f194990d == u0Var.f194990d && p005kotlin.jvm.internal.s.g(this.f194987a, u0Var.f194987a) && p005kotlin.jvm.internal.s.g(this.f194988b, u0Var.f194988b) && p005kotlin.jvm.internal.s.g(this.f194989c, u0Var.f194989c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194878c() {
        return this.f194989c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194876a() {
        return this.f194987a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194987a, this.f194990d * 31, 31);
        ZoneOffset zoneOffset = this.f194988b;
        return this.f194989c.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SexualActivityRecord(time=");
        sb3.append(this.f194987a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194988b);
        sb3.append(", protectionUsed=");
        sb3.append(this.f194990d);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194989c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Ly8/u0$a;", "", "<init>", "()V", "", "PROTECTION_USED_UNKNOWN", "I", "PROTECTION_USED_PROTECTED", "PROTECTION_USED_UNPROTECTED", "", "", "PROTECTION_USED_STRING_TO_INT_MAP", "Ljava/util/Map;", "PROTECTION_USED_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ u0(Instant instant, ZoneOffset zoneOffset, z8.c cVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, (i15 & 8) != 0 ? 0 : i14);
    }
}
