package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes46.dex */
public class yth {

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f53853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53854c;
        public double d;
        public int e;
    }

    public static int c(double d2, double d3, double d4, double d5, double d6, double d7, int i) {
        if (d2 < d5 && d3 < d4) {
            return 2;
        }
        if ((d2 < d4 && d3 < d5) || d7 < d6) {
            return 2;
        }
        if (-1 == i) {
            return 6;
        }
        if (d2 <= d5 && (d3 >= d5 * 8.0d || d3 / d2 > 8.0d)) {
            return 9;
        }
        if ((d3 > d5 || (d2 < d5 * 8.0d && d2 / d3 <= 8.0d)) && d2 / d3 <= 10.0d && d3 / d2 <= 10.0d) {
            return (d2 <= d4 || d3 <= d4) ? 8 : 4;
        }
        return 9;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f53850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f53851b;

        public b(int i) {
            this.f53850a = new double[i];
            this.f53851b = new double[i];
        }
    }

    public static double[] d(double[] dArr, double[] dArr2, double[] dArr3) {
        int length = dArr.length;
        int length2 = dArr2.length;
        int length3 = dArr3.length;
        double[] dArr4 = new double[length3];
        for (int i = 0; i < length3; i++) {
            double d2 = 0.0d;
            for (int i2 = 0; i2 <= length - 1 && i2 <= i; i2++) {
                d2 += dArr[i2] * dArr3[i - i2];
            }
            double d3 = 0.0d;
            for (int i3 = 1; i3 <= length2 - 1 && i3 <= i; i3++) {
                d3 += dArr2[i3] * dArr4[i - i3];
            }
            if (Math.abs(dArr2[0] - 0.0d) > 1.0E-5d) {
                dArr4[i] = (d2 - d3) / dArr2[0];
            }
        }
        return dArr4;
    }

    public static ytd[] a(double[] dArr, double d2, double d3, double d4) {
        double[] dArr2 = new double[dArr.length];
        double[] dArr3 = new double[dArr.length];
        double[] dArr4 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            if (Math.abs(d3 - 0.0d) > 1.0E-5d) {
                dArr2[i] = ((double) i) / d3;
            }
            double d5 = 6.283185307179586d * d2;
            dArr3[i] = dArr[i] * Math.cos(dArr2[i] * d5);
            dArr4[i] = dArr[i] * Math.sin(d5 * dArr2[i]);
        }
        ytl ytlVar = new ytl();
        ytlVar.b(6, d3, d4, true);
        double[] dArrC = ytlVar.c();
        double[] dArrD = ytlVar.d();
        double[] dArrD2 = d(dArrD, dArrC, dArr3);
        double[] dArrD3 = d(dArrD, dArrC, dArr4);
        ytd[] ytdVarArr = new ytd[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            ytdVarArr[i2] = new ytd(dArrD2[i2], dArrD3[i2]);
        }
        return ytdVarArr;
    }

    public static ytd[] c(double[] dArr, double[] dArr2) {
        int length = dArr.length;
        ytd[] ytdVarArr = new ytd[length];
        for (int i = 0; i < length; i++) {
            ytdVarArr[i] = new ytd(dArr[i], dArr2[i]);
        }
        return ytdVarArr;
    }

    public static b e(double[] dArr, int i) {
        int length = dArr.length / 2;
        b bVar = new b(length);
        for (int i2 = 0; i2 < length; i2++) {
            if (i == 0) {
                int i3 = i2 * 2;
                bVar.f53850a[i2] = dArr[i3];
                bVar.f53851b[i2] = dArr[i3 + 1];
            } else if (1 == i) {
                int i4 = i2 * 2;
                bVar.f53850a[i2] = dArr[i4 + 1];
                bVar.f53851b[i2] = dArr[i4];
            }
        }
        return bVar;
    }

    public static ytp.e a(int i, int i2, int i3, ytp.e eVar, double[] dArr, double[] dArr2, int i4) {
        ytp.e eVar2 = new ytp.e();
        eVar2.d = eVar.d;
        eVar2.e = eVar.e;
        double d2 = i4 >= 14000 ? 0.8d : 0.6d;
        int i5 = 0;
        if (i4 >= 14000) {
            while (i5 < i - i2) {
                if (dArr[i5] > eVar.d * d2 && i5 > (eVar.e - i3) - i3) {
                    eVar2.e = i5;
                    eVar2.d = dArr[i5];
                    return eVar2;
                }
                i5++;
            }
        } else {
            while (i5 < i - i2) {
                if (dArr2[i5] > eVar.d * d2 && i5 > (eVar.e - i3) - i3) {
                    eVar2.e = i5;
                    eVar2.d = dArr2[i5];
                    return eVar2;
                }
                i5++;
            }
        }
        return eVar2;
    }

    public static int b(int i, int i2, ytp.b bVar, int i3, int i4, int i5, int i6) {
        int i7 = bVar.d;
        if (i == 1) {
            return i2 == 0 ? bVar.e : i4 + i6;
        }
        return i2 == 1 ? i3 + i5 : i7;
    }

    public static d d(int i, int i2, double d2, double d3, double d4, double d5) {
        d dVar = new d();
        dVar.f53852a = i;
        dVar.f53854c = i2;
        if ((i < i2 && d2 + d3 > (d4 + d5) * 0.5d) || (i >= i2 && d2 + d3 >= (d4 + d5) * 2.0d)) {
            dVar.e = 0;
            dVar.f53854c = i;
            dVar.f53853b = d2;
            dVar.d = d3;
            Log.e("getFlagIndexRssi: ", "startIdxTag: left");
            return dVar;
        }
        dVar.e = 1;
        dVar.f53852a = i2;
        dVar.f53853b = d4;
        dVar.d = d5;
        Log.e("getFlagIndexRssi: ", "startIdxTag: right");
        return dVar;
    }
}
