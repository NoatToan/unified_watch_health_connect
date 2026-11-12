package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ly8/l;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "appearance", "sensation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;II)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f194872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f194873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f194874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f194875i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f194879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f194880e;

    static {
        new a(null);
        Map mapE = p13.u0.e(new o13.p("clear", 5), new o13.p("creamy", 3), new o13.p("dry", 1), new o13.p("sticky", 2), new o13.p("watery", 4), new o13.p("unusual", 6));
        f194872f = mapE;
        f194873g = b1.f(mapE);
        Map mapE2 = p13.u0.e(new o13.p("light", 1), new o13.p("medium", 2), new o13.p("heavy", 3));
        f194874h = mapE2;
        f194875i = b1.f(mapE2);
    }

    public /* synthetic */ l(Instant instant, ZoneOffset zoneOffset, z8.c cVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15);
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194877b() {
        return this.f194877b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f194876a, lVar.f194876a) && p005kotlin.jvm.internal.s.g(this.f194877b, lVar.f194877b) && this.f194879d == lVar.f194879d && this.f194880e == lVar.f194880e && p005kotlin.jvm.internal.s.g(this.f194878c, lVar.f194878c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194878c() {
        return this.f194878c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194876a() {
        return this.f194876a;
    }

    public final int hashCode() {
        int iHashCode = this.f194876a.hashCode() * 31;
        ZoneOffset zoneOffset = this.f194877b;
        return this.f194878c.hashCode() + ((((((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.f194879d) * 31) + this.f194880e) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CervicalMucusRecord(time=");
        sb3.append(this.f194876a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194877b);
        sb3.append(", appearance=");
        sb3.append(this.f194879d);
        sb3.append(", sensation=");
        sb3.append(this.f194880e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194878c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Ly8/l$a;", "", "<init>", "()V", "", "APPEARANCE_UNKNOWN", "I", "APPEARANCE_DRY", "APPEARANCE_STICKY", "APPEARANCE_CREAMY", "APPEARANCE_WATERY", "APPEARANCE_EGG_WHITE", "APPEARANCE_UNUSUAL", "SENSATION_UNKNOWN", "SENSATION_LIGHT", "SENSATION_MEDIUM", "SENSATION_HEAVY", "", "", "APPEARANCE_STRING_TO_INT_MAP", "Ljava/util/Map;", "APPEARANCE_INT_TO_STRING_MAP", "SENSATION_STRING_TO_INT_MAP", "SENSATION_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public l(Instant instant, ZoneOffset zoneOffset, z8.c cVar, int i14, int i15) {
        instant.getClass();
        cVar.getClass();
        this.f194876a = instant;
        this.f194877b = zoneOffset;
        this.f194878c = cVar;
        this.f194879d = i14;
        this.f194880e = i15;
    }
}
