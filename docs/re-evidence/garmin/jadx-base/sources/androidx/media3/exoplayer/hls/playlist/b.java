package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.l;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends na.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f9099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImmutableList f9100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImmutableList f9101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImmutableMap f9102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f9103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f9104v;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.b$b, reason: collision with other inner class name */
    public static final class C0125b extends e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f9105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f9106m;

        public C0125b(String str, d dVar, long j8, int i14, long j14, l lVar, String str2, String str3, long j15, long j16, boolean z14, boolean z15, boolean z16) {
            super(str, dVar, j8, i14, j14, lVar, str2, str3, j15, j16, z14);
            this.f9105l = z15;
            this.f9106m = z16;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9109c;

        public c(Uri uri, long j8, int i14) {
            this.f9107a = uri;
            this.f9108b = j8;
            this.f9109c = i14;
        }
    }

    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f9113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l f9117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f9118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f9119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f9120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f9121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f9122k;

        private e(String str, d dVar, long j8, int i14, long j14, l lVar, String str2, String str3, long j15, long j16, boolean z14) {
            this.f9112a = str;
            this.f9113b = dVar;
            this.f9114c = j8;
            this.f9115d = i14;
            this.f9116e = j14;
            this.f9117f = lVar;
            this.f9118g = str2;
            this.f9119h = str3;
            this.f9120i = j15;
            this.f9121j = j16;
            this.f9122k = z14;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l14) {
            Long l15 = l14;
            long jLongValue = l15.longValue();
            long j8 = this.f9116e;
            if (j8 > jLongValue) {
                return 1;
            }
            return j8 < l15.longValue() ? -1 : 0;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9127e;

        public f(long j8, boolean z14, long j14, long j15, boolean z15) {
            this.f9123a = j8;
            this.f9124b = z14;
            this.f9125c = j14;
            this.f9126d = j15;
            this.f9127e = z15;
        }
    }

    public b(int i14, String str, List<String> list, long j8, boolean z14, long j14, boolean z15, int i15, long j15, int i16, long j16, long j17, boolean z16, boolean z17, boolean z18, l lVar, List<d> list2, List<C0125b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z16);
        this.f9086d = i14;
        this.f9090h = j14;
        this.f9089g = z14;
        this.f9091i = z15;
        this.f9092j = i15;
        this.f9093k = j15;
        this.f9094l = i16;
        this.f9095m = j16;
        this.f9096n = j17;
        this.f9097o = z17;
        this.f9098p = z18;
        this.f9099q = lVar;
        this.f9100r = ImmutableList.copyOf((Collection) list2);
        this.f9101s = ImmutableList.copyOf((Collection) list3);
        this.f9102t = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            C0125b c0125b = (C0125b) Iterables.getLast(list3);
            this.f9103u = c0125b.f9116e + c0125b.f9114c;
        } else if (list2.isEmpty()) {
            this.f9103u = 0L;
        } else {
            d dVar = (d) Iterables.getLast(list2);
            this.f9103u = dVar.f9116e + dVar.f9114c;
        }
        long jMin = C.TIME_UNSET;
        if (j8 != C.TIME_UNSET) {
            long j18 = this.f9103u;
            jMin = j8 >= 0 ? Math.min(j18, j8) : Math.max(0L, j18 + j8);
        }
        this.f9087e = jMin;
        this.f9088f = j8 >= 0;
        this.f9104v = fVar;
    }

    @Override // na.c
    public final Object a(List list) {
        return this;
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f9110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImmutableList f9111m;

        public d(String str, d dVar, String str2, long j8, int i14, long j14, l lVar, String str3, String str4, long j15, long j16, boolean z14, List<C0125b> list) {
            super(str, dVar, j8, i14, j14, lVar, str3, str4, j15, j16, z14);
            this.f9110l = str2;
            this.f9111m = ImmutableList.copyOf((Collection) list);
        }

        public d(String str, long j8, long j14, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j8, j14, false, ImmutableList.of());
        }
    }
}
