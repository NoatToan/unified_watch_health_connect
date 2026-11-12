package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/k0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "", "result", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;ILz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f194866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashMap f194867f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194871d;

    static {
        new a(null);
        Map mapE = p13.u0.e(new o13.p("inconclusive", 0), new o13.p("positive", 1), new o13.p("high", 2), new o13.p("negative", 3));
        f194866e = mapE;
        f194867f = b1.f(mapE);
    }

    public k0(Instant instant, ZoneOffset zoneOffset, int i14, z8.c cVar) {
        instant.getClass();
        cVar.getClass();
        this.f194868a = instant;
        this.f194869b = zoneOffset;
        this.f194870c = i14;
        this.f194871d = cVar;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194877b() {
        return this.f194869b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f194870c == k0Var.f194870c && this.f194868a.equals(k0Var.f194868a) && p005kotlin.jvm.internal.s.g(this.f194869b, k0Var.f194869b) && this.f194871d.equals(k0Var.f194871d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194878c() {
        return this.f194871d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194876a() {
        return this.f194868a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194868a, Integer.hashCode(this.f194870c) * 31, 31);
        ZoneOffset zoneOffset = this.f194869b;
        return this.f194871d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OvulationTestRecord(time=");
        sb3.append(this.f194868a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194869b);
        sb3.append(", result=");
        sb3.append(this.f194870c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194871d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/k0$a;", "", "<init>", "()V", "", "RESULT_INCONCLUSIVE", "I", "RESULT_POSITIVE", "RESULT_HIGH", "RESULT_NEGATIVE", "", "", "RESULT_STRING_TO_INT_MAP", "Ljava/util/Map;", "RESULT_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
