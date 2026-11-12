package androidx.media3.exoplayer;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f9163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f9165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9166s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9167a = fa.z.O(20);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9168b = fa.z.O(500);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f9169c = 0.999f;
    }

    private i(float f14, float f15, long j8, float f16, long j14, long j15, float f17) {
        this.f9148a = f14;
        this.f9149b = f15;
        this.f9150c = j8;
        this.f9151d = f16;
        this.f9152e = j14;
        this.f9153f = j15;
        this.f9154g = f17;
        this.f9155h = C.TIME_UNSET;
        this.f9156i = C.TIME_UNSET;
        this.f9158k = C.TIME_UNSET;
        this.f9159l = C.TIME_UNSET;
        this.f9162o = f14;
        this.f9161n = f15;
        this.f9163p = 1.0f;
        this.f9164q = C.TIME_UNSET;
        this.f9157j = C.TIME_UNSET;
        this.f9160m = C.TIME_UNSET;
        this.f9165r = C.TIME_UNSET;
        this.f9166s = C.TIME_UNSET;
    }

    public final void a() {
        long j8;
        long j14 = this.f9155h;
        if (j14 != C.TIME_UNSET) {
            j8 = this.f9156i;
            if (j8 == C.TIME_UNSET) {
                long j15 = this.f9158k;
                if (j15 != C.TIME_UNSET && j14 < j15) {
                    j14 = j15;
                }
                j8 = this.f9159l;
                if (j8 == C.TIME_UNSET || j14 <= j8) {
                    j8 = j14;
                }
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f9157j == j8) {
            return;
        }
        this.f9157j = j8;
        this.f9160m = j8;
        this.f9165r = C.TIME_UNSET;
        this.f9166s = C.TIME_UNSET;
        this.f9164q = C.TIME_UNSET;
    }
}
