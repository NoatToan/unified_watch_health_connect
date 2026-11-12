package wk2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015Be\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\b\u0012\u00060\u0002j\u0002`\f\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0010\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lwk2/f;", "", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "", "Lcom/garmin/device/filetransfer/DataType;", "dataType", "Lwk2/h;", "direction", "", "mutableTotalSize", "", "Lcom/garmin/device/filetransfer/ArchiveFlag;", "flags", "", "properties", "", "creationId", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lwk2/h;JLjava/util/Set;Ljava/util/Map;Ljava/lang/Integer;)V", "(Ljava/lang/String;Lwk2/h;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f185841i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f185842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f185844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f185845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<UUID> f185846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f185847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f185848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f185849h;

    public f(UUID uuid, String str, h hVar, long j8, Set<UUID> set, Map<String, String> map, Integer num) {
        uuid.getClass();
        str.getClass();
        hVar.getClass();
        map.getClass();
        this.f185842a = uuid;
        this.f185843b = str;
        this.f185844c = hVar;
        this.f185845d = j8;
        this.f185846e = set;
        this.f185847f = map;
        this.f185848g = num;
        this.f185849h = o13.m.b(new wd.c(this, 6));
    }

    public final boolean a() {
        return this.f185847f.containsKey("AD_HOC_LATENCY_PROPERTY_KEY");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f185842a, fVar.f185842a) && s.g(this.f185843b, fVar.f185843b) && this.f185844c == fVar.f185844c && this.f185845d == fVar.f185845d && s.g(this.f185846e, fVar.f185846e) && s.g(this.f185847f, fVar.f185847f) && s.g(this.f185848g, fVar.f185848g);
    }

    public final int hashCode() {
        int iE = q6.f.e((this.f185844c.hashCode() + wr.g.j(this.f185842a.hashCode() * 31, 31, this.f185843b)) * 31, 31, this.f185845d);
        Set<UUID> set = this.f185846e;
        int iB = am.j.b(this.f185847f, (iE + (set == null ? 0 : set.hashCode())) * 31, 31);
        Integer num = this.f185848g;
        return iB + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FileMetadata(id=" + this.f185842a + ", dataType=" + this.f185843b + ", direction=" + this.f185844c + ", mutableTotalSize=" + this.f185845d + ", flags=" + this.f185846e + ", properties=" + this.f185847f + ", creationId=" + this.f185848g + ")";
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lwk2/f$a;", "", "<init>", "()V", "", "Lcom/garmin/device/filetransfer/DataType;", "SOFTWARE_UPDATE_DATA_TYPE", "Ljava/lang/String;", "GARMIN_DEVICE_XML_FILE_DATA_TYPE", "PATH_ON_DEVICE_PROPERTY_KEY", "ASSOCIATED_DATA_TYPES_PROPERTY_KEY", "AD_HOC_LATENCY_PROPERTY_KEY", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(UUID uuid, String str, long j8, Map map) {
            uuid.getClass();
            str.getClass();
            map.getClass();
            return new f(uuid, str, h.PHONE_TO_DEVICE, j8, null, map, null, 80, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
        public static f b(f fVar, Set set, Map map) {
            fVar.getClass();
            if (s.g(fVar.f185846e, set) && map == null) {
                return fVar;
            }
            ?? N = fVar.f185847f;
            if (map != null) {
                N = u0.n(N);
                for (Map.Entry entry : map.entrySet()) {
                    if (!s.g(entry.getKey(), "ASSOCIATED_DATA_TYPES_PROPERTY_KEY") || N.get(entry.getKey()) == null) {
                        N.put(entry.getKey(), entry.getValue());
                    } else {
                        N.put(entry.getKey(), N.get(entry.getKey()) + "," + entry.getValue());
                    }
                }
            }
            return new f(fVar.f185842a, fVar.f185843b, fVar.f185844c, fVar.f185845d, set, N, fVar.f185848g);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, h hVar) {
        this(new UUID(0L, 0L), str, hVar, 0L, null, null, null, 112, null);
        str.getClass();
        hVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(UUID uuid, String str, h hVar, long j8, Set set, Map map, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        set = (i14 & 16) != 0 ? null : set;
        if ((i14 & 32) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(uuid, str, hVar, j8, set, map, (i14 & 64) != 0 ? null : num);
    }
}
