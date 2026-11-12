package ut2;

import java.util.EnumSet;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ int[] f172604a;

    public enum b {
        NONE,
        FLOYD_STEINBERG;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f172612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f172613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f172614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f172615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[][] f172616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][] f172617f;

        public c(int i14, int i15, int i16, int i17, int[][] iArr, int[][] iArr2) {
            this.f172612a = i14;
            this.f172613b = i15;
            this.f172614c = i16;
            this.f172615d = i17;
            this.f172616e = iArr;
            this.f172617f = iArr2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3225a f172618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f172619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C3225a f172620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f172621d;

        public d(C3225a c3225a, int i14, C3225a c3225a2, int i15) {
            this.f172618a = c3225a;
            this.f172619b = i14;
            this.f172620c = c3225a2;
            this.f172621d = i15;
        }

        public final String toString() {
            return String.valueOf(this.f172619b) + StringUtils.SPACE + this.f172618a.toString() + StringUtils.SPACE + this.f172621d + StringUtils.SPACE + this.f172620c.toString();
        }
    }

    public enum e {
        DISABLE_TRANSPARENCY,
        COMPRESS;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumSet<e> f172624c;

        static {
            EnumSet.allOf(e.class);
            f172624c = EnumSet.noneOf(e.class);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArrValuesCustom = values();
            int length = eVarArrValuesCustom.length;
            e[] eVarArr = new e[length];
            System.arraycopy(eVarArrValuesCustom, 0, eVarArr, 0, length);
            return eVarArr;
        }
    }

    static {
        b bVar = b.NONE;
        bj2.b.d dVar = bj2.b.d.GFX_ORNTN_0;
    }

    public static int a(C3225a c3225a, d[] dVarArr, int i14) {
        int i15 = 0;
        C3225a c3225a2 = dVarArr[0].f172618a;
        int i16 = 0;
        for (d dVar : dVarArr) {
            C3225a c3225a3 = dVar.f172618a;
            if (!c3225a3.e(i14) && c3225a3.c(c3225a) < c3225a2.c(c3225a)) {
                i16 = i15;
                c3225a2 = c3225a3;
            }
            i15++;
        }
        return dVarArr[i16].f172619b;
    }

    public static C3225a[] b(C3225a[] c3225aArr) {
        if (c3225aArr == null) {
            return null;
        }
        C3225a[] c3225aArr2 = new C3225a[c3225aArr.length];
        for (int i14 = 0; i14 < c3225aArr.length; i14++) {
            C3225a c3225a = c3225aArr[i14];
            c3225aArr2[i14] = new C3225a((int) (((double) c3225a.f172605a) * 1.0d), (int) (((double) c3225a.f172606b) * 1.0d), (int) (((double) c3225a.f172607c) * 1.0d), c3225a.f172608d);
        }
        return c3225aArr2;
    }

    /* JADX INFO: renamed from: ut2.a$a, reason: collision with other inner class name */
    public static class C3225a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f172605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f172606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f172607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f172608d;

        public C3225a(String str) {
            str = (str.startsWith("0x") || str.startsWith("0X")) ? str.substring(2) : str;
            int i14 = Integer.parseInt(str, 16);
            this.f172605a = (i14 >> 16) & 255;
            this.f172606b = (i14 >> 8) & 255;
            this.f172607c = i14 & 255;
            if (str.length() == 6) {
                this.f172608d = 255;
            } else {
                this.f172608d = (i14 >> 24) & 255;
            }
        }

        public final C3225a a(C3225a c3225a) {
            return new C3225a(this.f172605a + c3225a.f172605a, this.f172606b + c3225a.f172606b, this.f172607c + c3225a.f172607c, this.f172608d + c3225a.f172608d);
        }

        public final C3225a b(int i14) throws Exception {
            if (i14 == 16) {
                return new C3225a(this.f172605a & 248, this.f172606b & 252, this.f172607c & 248, this.f172608d);
            }
            if (i14 == 24) {
                return this;
            }
            throw new Exception(String.valueOf(i14) + "bpp devices not supported!");
        }

        public final int c(C3225a c3225a) {
            int i14 = c3225a.f172605a - this.f172605a;
            int i15 = c3225a.f172606b - this.f172606b;
            int i16 = c3225a.f172607c - this.f172607c;
            return (i16 * i16) + (i15 * i15) + (i14 * i14);
        }

        public final int d() {
            return (this.f172608d * 128) / 255;
        }

        public final boolean e(int i14) {
            int i15 = this.f172608d;
            if (i14 < 16) {
                return i15 < 128;
            }
            return i15 < 1;
        }

        public final C3225a f(float f14) {
            return new C3225a((int) (this.f172605a * f14), (int) (this.f172606b * f14), (int) (this.f172607c * f14), (int) (f14 * this.f172608d));
        }

        public final int g(int i14, boolean z14) throws Exception {
            int iD = this.f172607c;
            int iD2 = this.f172606b;
            int iD3 = this.f172605a;
            if (i14 != 16) {
                if (i14 != 24) {
                    throw new Exception(String.valueOf(i14) + "bpp devices not supported!");
                }
                if (z14) {
                    iD3 = (d() * iD3) >> 7;
                    iD2 = (d() * iD2) >> 7;
                    iD = (d() * iD) >> 7;
                }
                return ((iD3 & 255) << 16) | ((iD2 & 255) << 8) | (iD & 255);
            }
            if (iD3 > 254) {
                iD3 = 254;
            }
            if (iD2 > 254) {
                iD2 = 254;
            }
            if (iD > 254) {
                iD = 254;
            }
            if (iD3 < 0) {
                iD3 = 0;
            }
            if (iD2 < 0) {
                iD2 = 0;
            }
            if (iD < 0) {
                iD = 0;
            }
            if (z14) {
                iD3 = (d() * iD3) >> 7;
                iD2 = (d() * iD2) >> 7;
                iD = (d() * iD) >> 7;
            }
            int i15 = ((iD3 & 248) << 8) | ((iD2 & 252) << 3) | ((iD & 248) >> 3);
            return i15 == 65535 ? i15 & (-33) : i15;
        }

        public final String toString() {
            return String.format("0x%02x%02x%02x", Integer.valueOf(this.f172605a), Integer.valueOf(this.f172606b), Integer.valueOf(this.f172607c));
        }

        public C3225a(long j8) {
            this.f172605a = ((int) (j8 >> 16)) & 255;
            this.f172606b = ((int) (j8 >> 8)) & 255;
            this.f172607c = ((int) j8) & 255;
            this.f172608d = ((int) (j8 >> 24)) & 255;
        }

        public C3225a(int i14, int i15, int i16, int i17) {
            this.f172605a = i14;
            this.f172606b = i15;
            this.f172607c = i16;
            this.f172608d = i17;
        }

        public C3225a(int i14) {
            this.f172605a = (i14 >> 16) & 255;
            this.f172606b = (i14 >> 8) & 255;
            this.f172607c = i14 & 255;
            this.f172608d = (i14 >> 24) & 255;
        }
    }
}
