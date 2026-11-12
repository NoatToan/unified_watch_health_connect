package yi0;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lyi0/d;", "", "Lyi0/b;", "ftpReportType", "", "Lyi0/a;", "Lyi0/f;", "ranges", "<init>", "(Lyi0/b;Ljava/util/Map;)V", "a", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f197344c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f197345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<yi0.a, f> f197346b;

    public d(b bVar, Map<yi0.a, f> map) {
        bVar.getClass();
        map.getClass();
        this.f197345a = bVar;
        this.f197346b = map;
    }

    public final yi0.a a(Double d14, boolean z14) {
        yi0.a key;
        if (d14 == null) {
            return null;
        }
        Map<yi0.a, f> map = this.f197346b;
        Iterator<Map.Entry<yi0.a, f>> it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<yi0.a, f> next = it.next();
            key = next.getValue().a(z14).contains(d14) ? next.getKey() : null;
        } while (key == null);
        yi0.a aVar = yi0.a.SUPERIOR;
        f fVar = map.get(aVar);
        Double d15 = fVar != null ? (Double) fVar.a(z14).c() : null;
        if (key == null) {
            return (d15 == null || d14.doubleValue() <= d15.doubleValue()) ? yi0.a.UNTRAINED : aVar;
        }
        return key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f197345a == dVar.f197345a && this.f197346b.equals(dVar.f197346b);
    }

    public final int hashCode() {
        return this.f197346b.hashCode() + (this.f197345a.hashCode() * 31);
    }

    public final String toString() {
        return "FtpSportRanges(ftpReportType=" + this.f197345a + ", ranges=" + this.f197346b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi0/d$a;", "", "<init>", "()V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: yi0.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3696a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f197347a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.ROWING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f197347a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(c cVar, boolean z14, Double d14) {
            cVar.getClass();
            if (d14 == null) {
                return null;
            }
            if (C3696a.f197347a[cVar.ordinal()] == 1) {
                return ((!z14 || d14.doubleValue() <= 75.0d) && (z14 || d14.doubleValue() <= 61.5d)) ? e.f197350c : e.f197349b;
            }
            return e.f197348a;
        }

        private a() {
        }
    }
}
