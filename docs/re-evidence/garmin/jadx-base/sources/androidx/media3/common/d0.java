package androidx.media3.common;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8186a = new a();

    public class a extends d0 {
        @Override // androidx.media3.common.d0
        public final int b(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.d0
        public final b f(int i14, b bVar, boolean z14) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.d0
        public final int h() {
            return 0;
        }

        @Override // androidx.media3.common.d0
        public final Object l(int i14) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.d0
        public final c m(int i14, c cVar, long j8) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.d0
        public final int o() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f8190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f8191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public androidx.media3.common.b f8193g = androidx.media3.common.b.f8153g;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
        }

        public final long a(int i14, int i15) {
            androidx.media3.common.b.C0118b c0118bA = this.f8193g.a(i14);
            return c0118bA.f8162b != -1 ? c0118bA.f8167g[i15] : C.TIME_UNSET;
        }

        public final int b(long j8) {
            androidx.media3.common.b.C0118b c0118bA;
            int i14;
            androidx.media3.common.b bVar = this.f8193g;
            long j14 = this.f8190d;
            int i15 = bVar.f8156b;
            if (j8 != Long.MIN_VALUE && (j14 == C.TIME_UNSET || j8 < j14)) {
                int i16 = bVar.f8159e;
                while (i16 < i15 && ((bVar.a(i16).f8161a != Long.MIN_VALUE && bVar.a(i16).f8161a <= j8) || ((i14 = (c0118bA = bVar.a(i16)).f8162b) != -1 && c0118bA.a(-1) >= i14))) {
                    i16++;
                }
                if (i16 < i15) {
                    return i16;
                }
            }
            return -1;
        }

        public final int c(long j8) {
            androidx.media3.common.b bVar = this.f8193g;
            long j14 = this.f8190d;
            int i14 = bVar.f8156b - 1;
            int i15 = i14 - (bVar.b(i14) ? 1 : 0);
            while (i15 >= 0 && j8 != Long.MIN_VALUE) {
                androidx.media3.common.b.C0118b c0118bA = bVar.a(i15);
                long j15 = c0118bA.f8161a;
                if (j15 != Long.MIN_VALUE) {
                    if (j8 >= j15) {
                        break;
                    }
                    i15--;
                } else {
                    if (j14 != C.TIME_UNSET && ((!c0118bA.f8169i || c0118bA.f8162b != -1) && j8 >= j14)) {
                        break;
                    }
                    i15--;
                }
            }
            if (i15 >= 0) {
                androidx.media3.common.b.C0118b c0118bA2 = bVar.a(i15);
                int i16 = c0118bA2.f8162b;
                if (i16 != -1) {
                    for (int i17 = 0; i17 < i16; i17++) {
                        int i18 = c0118bA2.f8166f[i17];
                        if (i18 != 0 && i18 != 1) {
                        }
                    }
                }
                return i15;
            }
            return -1;
        }

        public final long d(int i14) {
            return this.f8193g.a(i14).f8161a;
        }

        public final int e(int i14, int i15) {
            androidx.media3.common.b.C0118b c0118bA = this.f8193g.a(i14);
            if (c0118bA.f8162b != -1) {
                return c0118bA.f8166f[i15];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            Object obj2 = this.f8187a;
            Object obj3 = bVar.f8187a;
            int i14 = fa.z.f70071a;
            return Objects.equals(obj2, obj3) && Objects.equals(this.f8188b, bVar.f8188b) && this.f8189c == bVar.f8189c && this.f8190d == bVar.f8190d && this.f8191e == bVar.f8191e && this.f8192f == bVar.f8192f && Objects.equals(this.f8193g, bVar.f8193g);
        }

        public final int f(int i14) {
            return this.f8193g.a(i14).a(-1);
        }

        public final boolean g(int i14) {
            androidx.media3.common.b bVar = this.f8193g;
            return i14 == bVar.f8156b - 1 && bVar.b(i14);
        }

        public final boolean h(int i14) {
            return this.f8193g.a(i14).f8169i;
        }

        public final int hashCode() {
            Object obj = this.f8187a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f8188b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f8189c) * 31;
            long j8 = this.f8190d;
            int i14 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j14 = this.f8191e;
            return this.f8193g.hashCode() + ((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f8192f ? 1 : 0)) * 31);
        }

        @CanIgnoreReturnValue
        public final void i(Object obj, Object obj2, int i14, long j8, long j14, androidx.media3.common.b bVar, boolean z14) {
            this.f8187a = obj;
            this.f8188b = obj2;
            this.f8189c = i14;
            this.f8190d = j8;
            this.f8191e = j14;
            this.f8193g = bVar;
            this.f8192f = z14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f8194q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final t f8195r;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f8197b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f8200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f8201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f8202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f8203h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f8204i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public t.g f8205j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8206k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f8207l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f8208m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8209n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8210o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f8211p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8196a = f8194q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t f8198c = f8195r;

        static {
            t.c cVar = new t.c();
            cVar.f8446a = "androidx.media3.common.Timeline";
            cVar.f8447b = Uri.EMPTY;
            f8195r = cVar.a();
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
            fa.z.H(7);
            fa.z.H(8);
            fa.z.H(9);
            fa.z.H(10);
            fa.z.H(11);
            fa.z.H(12);
            fa.z.H(13);
        }

        public final boolean a() {
            return this.f8205j != null;
        }

        @CanIgnoreReturnValue
        public final void b(t tVar, Object obj, long j8, long j14, long j15, boolean z14, boolean z15, t.g gVar, long j16, long j17, long j18) {
            t.h hVar;
            this.f8196a = f8194q;
            this.f8198c = tVar != null ? tVar : f8195r;
            this.f8197b = (tVar == null || (hVar = tVar.f8439b) == null) ? null : hVar.f8489h;
            this.f8199d = obj;
            this.f8200e = j8;
            this.f8201f = j14;
            this.f8202g = j15;
            this.f8203h = z14;
            this.f8204i = z15;
            this.f8205j = gVar;
            this.f8207l = j16;
            this.f8208m = j17;
            this.f8209n = 0;
            this.f8210o = 0;
            this.f8211p = j18;
            this.f8206k = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f8196a, cVar.f8196a) && Objects.equals(this.f8198c, cVar.f8198c) && Objects.equals(this.f8199d, cVar.f8199d) && Objects.equals(this.f8205j, cVar.f8205j) && this.f8200e == cVar.f8200e && this.f8201f == cVar.f8201f && this.f8202g == cVar.f8202g && this.f8203h == cVar.f8203h && this.f8204i == cVar.f8204i && this.f8206k == cVar.f8206k && this.f8207l == cVar.f8207l && this.f8208m == cVar.f8208m && this.f8209n == cVar.f8209n && this.f8210o == cVar.f8210o && this.f8211p == cVar.f8211p;
        }

        public final int hashCode() {
            int iHashCode = (this.f8198c.hashCode() + ((this.f8196a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f8199d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            t.g gVar = this.f8205j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j8 = this.f8200e;
            int i14 = (iHashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j14 = this.f8201f;
            int i15 = (i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f8202g;
            int i16 = (((((((i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f8203h ? 1 : 0)) * 31) + (this.f8204i ? 1 : 0)) * 31) + (this.f8206k ? 1 : 0)) * 31;
            long j16 = this.f8207l;
            int i17 = (i16 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.f8208m;
            int i18 = (((((i17 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + this.f8209n) * 31) + this.f8210o) * 31;
            long j18 = this.f8211p;
            return i18 + ((int) (j18 ^ (j18 >>> 32)));
        }
    }

    static {
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
    }

    public int a(boolean z14) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z14) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i14, b bVar, c cVar, int i15, boolean z14) {
        int i16 = f(i14, bVar, false).f8189c;
        if (m(i16, cVar, 0L).f8210o != i14) {
            return i14 + 1;
        }
        int iE = e(i16, i15, z14);
        if (iE == -1) {
            return -1;
        }
        return m(iE, cVar, 0L).f8209n;
    }

    public int e(int i14, int i15, boolean z14) {
        if (i15 == 0) {
            if (i14 == c(z14)) {
                return -1;
            }
            return i14 + 1;
        }
        if (i15 == 1) {
            return i14;
        }
        if (i15 == 2) {
            return i14 == c(z14) ? a(z14) : i14 + 1;
        }
        j20.x.h();
        return 0;
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                if (d0Var.o() == o() && d0Var.h() == h()) {
                    c cVar = new c();
                    b bVar = new b();
                    c cVar2 = new c();
                    b bVar2 = new b();
                    for (int i14 = 0; i14 < o(); i14++) {
                        if (m(i14, cVar, 0L).equals(d0Var.m(i14, cVar2, 0L))) {
                        }
                    }
                    for (int i15 = 0; i15 < h(); i15++) {
                        if (f(i15, bVar, true).equals(d0Var.f(i15, bVar2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == d0Var.a(true) && (iC = c(true)) == d0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == d0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract b f(int i14, b bVar, boolean z14);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iO = o() + 217;
        for (int i14 = 0; i14 < o(); i14++) {
            iO = (iO * 31) + m(i14, cVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i15 = 0; i15 < h(); i15++) {
            iH = (iH * 31) + f(i15, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i14, long j8) {
        Pair<Object, Long> pairJ = j(cVar, bVar, i14, j8, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i14, long j8, long j14) {
        fa.a.c(i14, o());
        m(i14, cVar, j14);
        if (j8 == C.TIME_UNSET) {
            j8 = cVar.f8207l;
            if (j8 == C.TIME_UNSET) {
                return null;
            }
        }
        int i15 = cVar.f8209n;
        f(i15, bVar, false);
        while (i15 < cVar.f8210o && bVar.f8191e != j8) {
            int i16 = i15 + 1;
            if (f(i16, bVar, false).f8191e > j8) {
                break;
            }
            i15 = i16;
        }
        f(i15, bVar, true);
        long jMin = j8 - bVar.f8191e;
        long j15 = bVar.f8190d;
        if (j15 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j15 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f8188b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i14, int i15, boolean z14) {
        if (i15 == 0) {
            if (i14 == a(z14)) {
                return -1;
            }
            return i14 - 1;
        }
        if (i15 == 1) {
            return i14;
        }
        if (i15 == 2) {
            return i14 == a(z14) ? c(z14) : i14 - 1;
        }
        j20.x.h();
        return 0;
    }

    public abstract Object l(int i14);

    public abstract c m(int i14, c cVar, long j8);

    public final void n(int i14, c cVar) {
        m(i14, cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
