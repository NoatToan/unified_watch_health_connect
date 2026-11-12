package ha;

import android.net.Uri;
import androidx.media3.common.u;
import com.google.firebase.perf.FirebasePerformance;
import j20.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f82554k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f82555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f82558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f82559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f82560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f82561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f82563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f82564j;

    static {
        u.a("media3.datasource");
    }

    private g(Uri uri, long j8, int i14, byte[] bArr, Map<String, String> map, long j14, long j15, String str, int i15, Object obj) {
        fa.a.a(j8 + j14 >= 0);
        fa.a.a(j14 >= 0);
        fa.a.a(j15 > 0 || j15 == -1);
        uri.getClass();
        this.f82555a = uri;
        this.f82556b = j8;
        this.f82557c = i14;
        this.f82558d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f82559e = Collections.unmodifiableMap(new HashMap(map));
        this.f82560f = j14;
        this.f82561g = j15;
        this.f82562h = str;
        this.f82563i = i15;
        this.f82564j = obj;
    }

    public final g a(long j8) {
        long j14 = this.f82561g;
        long j15 = j14 != -1 ? j14 - j8 : -1L;
        if (j8 == 0 && j14 == j15) {
            return this;
        }
        return new g(this.f82555a, this.f82556b, this.f82557c, this.f82558d, this.f82559e, this.f82560f + j8, j15, this.f82562h, this.f82563i, this.f82564j);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("DataSpec[");
        int i14 = this.f82557c;
        if (i14 == 1) {
            str = FirebasePerformance.HttpMethod.GET;
        } else if (i14 == 2) {
            str = FirebasePerformance.HttpMethod.POST;
        } else {
            if (i14 != 3) {
                x.h();
                return null;
            }
            str = FirebasePerformance.HttpMethod.HEAD;
        }
        sb3.append(str);
        sb3.append(StringUtils.SPACE);
        sb3.append(this.f82555a);
        sb3.append(", ");
        sb3.append(this.f82560f);
        sb3.append(", ");
        sb3.append(this.f82561g);
        sb3.append(", ");
        sb3.append(this.f82562h);
        sb3.append(", ");
        return am.j.q(sb3, this.f82563i, "]");
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f82565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f82566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f82568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f82569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f82570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f82571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f82572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f82573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f82574j;

        private b(g gVar) {
            this.f82565a = gVar.f82555a;
            this.f82566b = gVar.f82556b;
            this.f82567c = gVar.f82557c;
            this.f82568d = gVar.f82558d;
            this.f82569e = gVar.f82559e;
            this.f82570f = gVar.f82560f;
            this.f82571g = gVar.f82561g;
            this.f82572h = gVar.f82562h;
            this.f82573i = gVar.f82563i;
            this.f82574j = gVar.f82564j;
        }

        public final g a() {
            fa.a.g(this.f82565a, "The uri must be set.");
            return new g(this.f82565a, this.f82566b, this.f82567c, this.f82568d, this.f82569e, this.f82570f, this.f82571g, this.f82572h, this.f82573i, this.f82574j);
        }

        public b() {
            this.f82567c = 1;
            this.f82569e = Collections.EMPTY_MAP;
            this.f82571g = -1L;
        }
    }

    public g(Uri uri) {
        this(uri, 0L, -1L);
    }

    public g(Uri uri, long j8, long j14) {
        this(uri, j8, j14, null);
    }

    @Deprecated
    public g(Uri uri, long j8, long j14, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j8, j14, str, 0, null);
    }
}
