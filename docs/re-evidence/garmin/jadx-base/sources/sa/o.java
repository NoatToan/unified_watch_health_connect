package sa;

import android.net.Uri;
import androidx.media3.common.d0;
import androidx.media3.common.t;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f158132o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f158133p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f158136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f158137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f158138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f158139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f158140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f158141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f158142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f158143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f158144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f158145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t.g f158146n;

    static {
        t.c cVar = new t.c();
        cVar.f8446a = "SinglePeriodTimeline";
        cVar.f8447b = Uri.EMPTY;
        f158133p = cVar.a();
    }

    @Deprecated
    public o(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        t tVar = f158133p;
        tVar.getClass();
        t.c cVar = new t.c();
        cVar.f8455j = obj2;
        this(j8, j14, j15, j16, j17, j18, j19, z14, z15, false, obj, cVar.a(), z16 ? tVar.f8440c : null);
    }

    @Override // androidx.media3.common.d0
    public final int b(Object obj) {
        return f158132o.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.d0
    public final d0.b f(int i14, d0.b bVar, boolean z14) {
        fa.a.c(i14, 1);
        Object obj = z14 ? f158132o : null;
        long j8 = -this.f158139g;
        bVar.getClass();
        bVar.i(null, obj, 0, this.f158137e, j8, androidx.media3.common.b.f8153g, false);
        return bVar;
    }

    @Override // androidx.media3.common.d0
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.d0
    public final Object l(int i14) {
        fa.a.c(i14, 1);
        return f158132o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.d0
    public final d0.c m(int i14, d0.c cVar, long j8) {
        long j14;
        fa.a.c(i14, 1);
        long j15 = this.f158140h;
        boolean z14 = this.f158142j;
        if (!z14 || this.f158143k || j8 == 0) {
            j14 = j15;
        } else {
            long j16 = this.f158138f;
            if (j16 != C.TIME_UNSET) {
                j15 += j8;
                if (j15 <= j16) {
                    j14 = j15;
                }
            }
            j14 = -9223372036854775807L;
        }
        Object obj = d0.c.f8194q;
        cVar.b(this.f158145m, this.f158144l, this.f158134b, this.f158135c, this.f158136d, this.f158141i, z14, this.f158146n, j14, this.f158138f, this.f158139g);
        return cVar;
    }

    @Override // androidx.media3.common.d0
    public final int o() {
        return 1;
    }

    public o(long j8, boolean z14, boolean z15, boolean z16, Object obj, t tVar) {
        this(j8, j8, 0L, 0L, z14, z15, z16, obj, tVar);
    }

    @Deprecated
    public o(long j8, long j14, long j15, long j16, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j14, j15, j16, z14, z15, z16, obj, obj2);
    }

    public o(long j8, long j14, long j15, long j16, boolean z14, boolean z15, boolean z16, Object obj, t tVar) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j14, j15, j16, z14, z15, false, obj, tVar, z16 ? tVar.f8440c : null);
    }

    @Deprecated
    public o(long j8, boolean z14, boolean z15, boolean z16, Object obj, Object obj2) {
        this(j8, j8, 0L, 0L, z14, z15, z16, obj, obj2);
    }

    @Deprecated
    public o(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, Object obj, t tVar, t.g gVar) {
        this(j8, j14, j15, j16, j17, j18, j19, z14, z15, false, obj, tVar, gVar);
    }

    public o(long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14, boolean z15, boolean z16, Object obj, t tVar, t.g gVar) {
        this.f158134b = j8;
        this.f158135c = j14;
        this.f158136d = j15;
        this.f158137e = j16;
        this.f158138f = j17;
        this.f158139g = j18;
        this.f158140h = j19;
        this.f158141i = z14;
        this.f158142j = z15;
        this.f158143k = z16;
        this.f158144l = obj;
        tVar.getClass();
        this.f158145m = tVar;
        this.f158146n = gVar;
    }
}
