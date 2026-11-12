package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class bp0 {
    public static final bp0 g = new bp0(null, new long[0], null, 0, -9223372036854775807L);
    public static final j63<bp0> h = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4431b;
    public final long[] c;
    public final a[] d;
    public final long e;
    public final long f;

    public bp0(Object obj, long[] jArr, a[] aVarArr, long j, long j2) {
        rk1.a(aVarArr == null || aVarArr.length == jArr.length);
        this.f4430a = obj;
        this.c = jArr;
        this.e = j;
        this.f = j2;
        int length = jArr.length;
        this.f4431b = length;
        if (aVarArr == null) {
            aVarArr = new a[length];
            for (int i = 0; i < this.f4431b; i++) {
                aVarArr[i] = new a();
            }
        }
        this.d = aVarArr;
    }

    public int a(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.c;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if ((j3 == Long.MIN_VALUE || j3 > j) && this.d[i].c()) {
                break;
            }
            i++;
        }
        if (i < this.c.length) {
            return i;
        }
        return -1;
    }

    public int b(long j, long j2) {
        int length = this.c.length - 1;
        while (length >= 0 && c(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.d[length].c()) {
            return -1;
        }
        return length;
    }

    public final boolean c(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.c[i];
        if (j3 == Long.MIN_VALUE) {
            return j2 == -9223372036854775807L || j < j2;
        }
        return j < j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bp0.class != obj.getClass()) {
            return false;
        }
        bp0 bp0Var = (bp0) obj;
        return wlq.c(this.f4430a, bp0Var.f4430a) && this.f4431b == bp0Var.f4431b && this.e == bp0Var.e && this.f == bp0Var.f && Arrays.equals(this.c, bp0Var.c) && Arrays.equals(this.d, bp0Var.d);
    }

    public int hashCode() {
        int i = this.f4431b * 31;
        Object obj = this.f4430a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f4430a);
        sb.append(", adResumePositionUs=");
        sb.append(this.e);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.d.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.c[i]);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.d[i].c.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.d[i].c[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.d[i].d[i2]);
                sb.append(')');
                if (i2 < this.d[i].c.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.d.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public static final class a {
        public static final j63<a> e = new ph8();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri[] f4433b;
        public final int[] c;
        public final long[] d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return b(-1);
        }

        public int b(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean c() {
            return this.f4432a == -1 || a() < this.f4432a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4432a == aVar.f4432a && Arrays.equals(this.f4433b, aVar.f4433b) && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.f4432a * 31) + Arrays.hashCode(this.f4433b)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
        }

        public a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            rk1.a(iArr.length == uriArr.length);
            this.f4432a = i;
            this.c = iArr;
            this.f4433b = uriArr;
            this.d = jArr;
        }
    }
}
