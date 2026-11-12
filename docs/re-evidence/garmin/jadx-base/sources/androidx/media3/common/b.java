package androidx.media3.common;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f8153g = new b(null, new C0118b[0], 0, C.TIME_UNSET, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0118b f8154h = new C0118b(0).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0118b[] f8160f;

    static {
        fa.z.H(1);
        fa.z.H(2);
        fa.z.H(3);
        fa.z.H(4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Object obj, long... jArr) {
        int length = jArr.length;
        C0118b[] c0118bArr = new C0118b[length];
        for (int i14 = 0; i14 < length; i14++) {
            c0118bArr[i14] = new C0118b(jArr[i14]);
        }
        this(obj, c0118bArr, 0L, C.TIME_UNSET, 0);
    }

    public final C0118b a(int i14) {
        int i15 = this.f8159e;
        return i14 < i15 ? f8154h : this.f8160f[i14 - i15];
    }

    public final boolean b(int i14) {
        if (i14 != this.f8156b - 1) {
            return false;
        }
        C0118b c0118bA = a(i14);
        return c0118bA.f8169i && c0118bA.f8161a == Long.MIN_VALUE && c0118bA.f8162b == -1;
    }

    public final b c(long[][] jArr) {
        fa.a.d(this.f8159e == 0);
        C0118b[] c0118bArr = this.f8160f;
        C0118b[] c0118bArr2 = (C0118b[]) fa.z.Q(c0118bArr, c0118bArr.length);
        for (int i14 = 0; i14 < this.f8156b; i14++) {
            c0118bArr2[i14] = c0118bArr2[i14].c(jArr[i14]);
        }
        return new b(this.f8155a, c0118bArr2, this.f8157c, this.f8158d, this.f8159e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Object obj2 = bVar.f8155a;
            int i14 = fa.z.f70071a;
            if (Objects.equals(this.f8155a, obj2) && this.f8156b == bVar.f8156b && this.f8157c == bVar.f8157c && this.f8158d == bVar.f8158d && this.f8159e == bVar.f8159e && Arrays.equals(this.f8160f, bVar.f8160f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.f8156b * 31;
        Object obj = this.f8155a;
        return Arrays.hashCode(this.f8160f) + ((((((((i14 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f8157c)) * 31) + ((int) this.f8158d)) * 31) + this.f8159e) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdPlaybackState(adsId=");
        sb3.append(this.f8155a);
        sb3.append(", adResumePositionUs=");
        sb3.append(this.f8157c);
        sb3.append(", adGroups=[");
        int i14 = 0;
        while (true) {
            C0118b[] c0118bArr = this.f8160f;
            if (i14 >= c0118bArr.length) {
                sb3.append("])");
                return sb3.toString();
            }
            sb3.append("adGroup(timeUs=");
            sb3.append(c0118bArr[i14].f8161a);
            sb3.append(", ads=[");
            for (int i15 = 0; i15 < c0118bArr[i14].f8166f.length; i15++) {
                sb3.append("ad(state=");
                int i16 = c0118bArr[i14].f8166f[i15];
                if (i16 == 0) {
                    sb3.append('_');
                } else if (i16 == 1) {
                    sb3.append('R');
                } else if (i16 == 2) {
                    sb3.append('S');
                } else if (i16 == 3) {
                    sb3.append('P');
                } else if (i16 != 4) {
                    sb3.append('?');
                } else {
                    sb3.append('!');
                }
                sb3.append(", durationUs=");
                sb3.append(c0118bArr[i14].f8167g[i15]);
                sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i15 < c0118bArr[i14].f8166f.length - 1) {
                    sb3.append(", ");
                }
            }
            sb3.append("])");
            if (i14 < c0118bArr.length - 1) {
                sb3.append(", ");
            }
            i14++;
        }
    }

    private b(Object obj, C0118b[] c0118bArr, long j8, long j14, int i14) {
        this.f8155a = obj;
        this.f8157c = j8;
        this.f8158d = j14;
        this.f8156b = c0118bArr.length + i14;
        this.f8160f = c0118bArr;
        this.f8159e = i14;
    }

    /* JADX INFO: renamed from: androidx.media3.common.b$b, reason: collision with other inner class name */
    public static final class C0118b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f8164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final t[] f8165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f8166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f8167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f8168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f8169i;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
            fa.z.H(7);
            fa.z.H(8);
        }

        private C0118b(long j8, int i14, int i15, int[] iArr, t[] tVarArr, long[] jArr, long j14, boolean z14) {
            Uri uri;
            int i16 = 0;
            fa.a.a(iArr.length == tVarArr.length);
            this.f8161a = j8;
            this.f8162b = i14;
            this.f8163c = i15;
            this.f8166f = iArr;
            this.f8165e = tVarArr;
            this.f8167g = jArr;
            this.f8168h = j14;
            this.f8169i = z14;
            this.f8164d = new Uri[tVarArr.length];
            while (true) {
                Uri[] uriArr = this.f8164d;
                if (i16 >= uriArr.length) {
                    return;
                }
                t tVar = tVarArr[i16];
                if (tVar == null) {
                    uri = null;
                } else {
                    t.h hVar = tVar.f8439b;
                    hVar.getClass();
                    uri = hVar.f8482a;
                }
                uriArr[i16] = uri;
                i16++;
            }
        }

        public final int a(int i14) {
            int i15;
            int i16 = i14 + 1;
            while (true) {
                int[] iArr = this.f8166f;
                if (i16 >= iArr.length || this.f8169i || (i15 = iArr[i16]) == 0 || i15 == 1) {
                    break;
                }
                i16++;
            }
            return i16;
        }

        public final C0118b b() {
            int[] iArr = this.f8166f;
            int length = iArr.length;
            int iMax = Math.max(0, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArr = this.f8167g;
            int length2 = jArr.length;
            int iMax2 = Math.max(0, length2);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
            Arrays.fill(jArrCopyOf, length2, iMax2, C.TIME_UNSET);
            return new C0118b(this.f8161a, 0, this.f8163c, iArrCopyOf, (t[]) Arrays.copyOf(this.f8165e, 0), jArrCopyOf, this.f8168h, this.f8169i);
        }

        public final C0118b c(long[] jArr) {
            int length = jArr.length;
            t[] tVarArr = this.f8165e;
            if (length < tVarArr.length) {
                int length2 = tVarArr.length;
                int length3 = jArr.length;
                int iMax = Math.max(length2, length3);
                jArr = Arrays.copyOf(jArr, iMax);
                Arrays.fill(jArr, length3, iMax, C.TIME_UNSET);
            } else if (this.f8162b != -1 && jArr.length > tVarArr.length) {
                jArr = Arrays.copyOf(jArr, tVarArr.length);
            }
            return new C0118b(this.f8161a, this.f8162b, this.f8163c, this.f8166f, this.f8165e, jArr, this.f8168h, this.f8169i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0118b.class == obj.getClass()) {
                C0118b c0118b = (C0118b) obj;
                if (this.f8161a == c0118b.f8161a && this.f8162b == c0118b.f8162b && this.f8163c == c0118b.f8163c && Arrays.equals(this.f8165e, c0118b.f8165e) && Arrays.equals(this.f8166f, c0118b.f8166f) && Arrays.equals(this.f8167g, c0118b.f8167g) && this.f8168h == c0118b.f8168h && this.f8169i == c0118b.f8169i) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i14 = ((this.f8162b * 31) + this.f8163c) * 31;
            long j8 = this.f8161a;
            int iHashCode = (Arrays.hashCode(this.f8167g) + ((Arrays.hashCode(this.f8166f) + ((Arrays.hashCode(this.f8165e) + ((i14 + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j14 = this.f8168h;
            return ((iHashCode + ((int) ((j14 >>> 32) ^ j14))) * 31) + (this.f8169i ? 1 : 0);
        }

        public C0118b(long j8) {
            this(j8, -1, -1, new int[0], new t[0], new long[0], 0L, false);
        }
    }
}
