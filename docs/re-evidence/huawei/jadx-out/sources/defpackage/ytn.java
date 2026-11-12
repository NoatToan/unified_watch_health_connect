package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes46.dex */
public class ytn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f53865a;

    public static ytd[] e(ytd[] ytdVarArr) {
        f53865a++;
        int length = ytdVarArr.length;
        if (length == 1) {
            return new ytd[]{ytdVarArr[0]};
        }
        if (((length - 1) & length) != 0) {
            Log.e("UltraAlg", "FFT: num is not a power of 2");
            return new ytd[]{ytdVarArr[0]};
        }
        int i = length / 2;
        ytd[] ytdVarArr2 = new ytd[i];
        for (int i2 = 0; i2 < i; i2++) {
            ytdVarArr2[i2] = ytdVarArr[i2 * 2];
        }
        ytd[] ytdVarArrE = e(ytdVarArr2);
        for (int i3 = 0; i3 < i; i3++) {
            ytdVarArr2[i3] = ytdVarArr[(i3 * 2) + 1];
        }
        ytd[] ytdVarArrE2 = e(ytdVarArr2);
        ytd[] ytdVarArr3 = new ytd[length];
        double d = (-6.283185307179586d) / ((double) length);
        for (int i4 = 0; i4 < i; i4++) {
            double d2 = ((double) i4) * d;
            ytd ytdVar = new ytd(Math.cos(d2), Math.sin(d2));
            ytdVarArr3[i4] = ytdVarArrE[i4].b(ytdVar.d(ytdVarArrE2[i4]));
            ytdVarArr3[i4 + i] = ytdVarArrE[i4].a(ytdVar.d(ytdVarArrE2[i4]));
        }
        return ytdVarArr3;
    }

    public static ytd[] c(ytd[] ytdVarArr) {
        int length = ytdVarArr.length;
        ytd[] ytdVarArr2 = new ytd[length];
        for (int i = 0; i < length; i++) {
            ytdVarArr2[i] = ytdVarArr[i].d();
        }
        ytd[] ytdVarArrE = e(ytdVarArr2);
        for (int i2 = 0; i2 < length; i2++) {
            ytdVarArrE[i2] = ytdVarArrE[i2].d();
        }
        for (int i3 = 0; i3 < length; i3++) {
            ytdVarArrE[i3] = ytdVarArrE[i3].a(1.0d / ((double) length));
        }
        return ytdVarArrE;
    }

    public static double[] d(ytd[] ytdVarArr, ytd[] ytdVarArr2, int i, int i2, double d) {
        ytd[] ytdVarArr3 = ytdVarArr2;
        int i3 = i;
        int i4 = 0;
        if (ytdVarArr.length != ytdVarArr3.length) {
            Log.i("UltraAlg", "length of x and y are not the same");
            return new double[]{ytdVarArr[0].e()};
        }
        int length = ytdVarArr3.length;
        ytd[] ytdVarArrE = e(ytdVarArr2);
        ytd[] ytdVarArr4 = new ytd[length];
        for (int i5 = 0; i5 < length; i5++) {
            ytdVarArr4[i5] = ytdVarArr[i5].d().d(ytdVarArrE[i5]);
        }
        ytd[] ytdVarArrC = c(ytdVarArr4);
        int i6 = i2 - i3;
        double[] dArr = new double[i6];
        int i7 = 0;
        double d2 = 0.0d;
        double dC = 0.0d;
        double d3 = 0.0d;
        while (i7 < i6) {
            if (i7 == 0) {
                for (int i8 = i4; i8 < i3; i8++) {
                    int i9 = i8 + i7;
                    if (i9 < ytdVarArr3.length) {
                        ytd ytdVar = ytdVarArr3[i9];
                        double dC2 = ytdVar.c(ytdVar);
                        d3 += dC2;
                        if (dC2 > d2) {
                            d2 = dC2;
                        }
                    }
                }
                ytd ytdVar2 = ytdVarArr3[i7];
                dC = ytdVar2.c(ytdVar2);
            } else {
                int i10 = (i3 - 1) + i7;
                if (i10 < ytdVarArr3.length) {
                    ytd ytdVar3 = ytdVarArr3[i10];
                    double dC3 = ytdVar3.c(ytdVar3);
                    if (dC3 > d2) {
                        d2 = dC3;
                    }
                    d3 = (d3 - dC) + dC3;
                    ytd ytdVar4 = ytdVarArr3[i7];
                    dC = ytdVar4.c(ytdVar4);
                }
            }
            double dMax = i3 != 0 ? Math.max(d3 / ((double) i3), d2 * 0.125d) : 0.0d;
            ytd ytdVar5 = ytdVarArrC[i7];
            dArr[i7] = ytdVar5.c(ytdVar5) / Math.max(dMax, d * 3.0d);
            i7++;
            ytdVarArr3 = ytdVarArr2;
            i3 = i;
            d2 = d2;
            i4 = 0;
        }
        return dArr;
    }

    public static ytd[] b(ytd[] ytdVarArr, ytd[] ytdVarArr2, int i, int i2, double d) {
        ytd[] ytdVarArr3 = ytdVarArr2;
        int i3 = i;
        int i4 = 0;
        if (ytdVarArr.length != ytdVarArr3.length) {
            Log.i("UltraAlg", "length of x and y are not the same");
            return new ytd[]{ytdVarArr[0]};
        }
        int length = ytdVarArr3.length;
        ytd[] ytdVarArrE = e(ytdVarArr2);
        ytd[] ytdVarArr4 = new ytd[length];
        for (int i5 = 0; i5 < length; i5++) {
            ytdVarArr4[i5] = ytdVarArr[i5].d().d(ytdVarArrE[i5]);
        }
        ytd[] ytdVarArrC = c(ytdVarArr4);
        int i6 = i2 - i3;
        ytd[] ytdVarArr5 = new ytd[i6];
        int i7 = 0;
        double d2 = 0.0d;
        double dC = 0.0d;
        double d3 = 0.0d;
        while (i7 < i6) {
            if (i7 == 0) {
                for (int i8 = i4; i8 < i3; i8++) {
                    int i9 = i8 + i7;
                    if (i9 < ytdVarArr3.length) {
                        ytd ytdVar = ytdVarArr3[i9];
                        double dC2 = ytdVar.c(ytdVar);
                        d3 += dC2;
                        if (dC2 > d2) {
                            d2 = dC2;
                        }
                    }
                }
                ytd ytdVar2 = ytdVarArr3[i7];
                dC = ytdVar2.c(ytdVar2);
            } else {
                int i10 = (i3 - 1) + i7;
                if (i10 < ytdVarArr3.length) {
                    ytd ytdVar3 = ytdVarArr3[i10];
                    double dC3 = ytdVar3.c(ytdVar3);
                    if (dC3 > d2) {
                        d2 = dC3;
                    }
                    d3 = (d3 - dC) + dC3;
                    ytd ytdVar4 = ytdVarArr3[i7];
                    dC = ytdVar4.c(ytdVar4);
                }
            }
            ytdVarArr5[i7] = ytdVarArrC[i7].d(Math.max(i3 != 0 ? Math.max(d3 / ((double) i3), d2 * 0.125d) : 0.0d, 3.0d));
            i7++;
            ytdVarArr3 = ytdVarArr2;
            i3 = i;
            i4 = 0;
        }
        return ytdVarArr5;
    }
}
