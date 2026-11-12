package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes46.dex */
public class ytp {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53872a;
        public int d;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53873a = 0;
        public int d = 0;
        public int e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f53874b = 0.0d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53875c = 0;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f53876a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53877c;
        public int[] d;
        public double e;
    }

    public static class d {
        public int d;
        public float e;
    }

    public static class e {
        public double d;
        public int e;
    }

    public static double[] e(byte[] bArr) {
        int length = bArr.length / 2;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            dArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
        }
        return dArr;
    }

    public static double d(double[] dArr) {
        int length = dArr.length;
        double dAbs = 0.0d;
        for (double d2 : dArr) {
            dAbs += Math.abs(d2);
        }
        return dAbs / ((double) length);
    }

    public static float c(float[] fArr) {
        int length = fArr.length;
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2 * f2;
        }
        return f / length;
    }

    public static float b(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    public static float a(float[] fArr) {
        int length = fArr.length;
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f / length;
    }

    public static d d(float[] fArr, float f) {
        d dVar = new d();
        dVar.e = 500.0f;
        dVar.d = 0;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f2 = fArr[i];
            if (f2 > f && f2 < dVar.e) {
                dVar.e = fArr[i];
                dVar.d = i;
            }
        }
        return dVar;
    }

    public static double b(double[] dArr) {
        double d2 = dArr[0];
        int length = dArr.length;
        for (int i = 1; i < length; i++) {
            double d3 = dArr[i];
            if (d3 > d2) {
                d2 = d3;
            }
        }
        return d2;
    }

    public static double[] d(double[] dArr, double[] dArr2, double d2, double[] dArr3) {
        double d3;
        double[] dArr4 = dArr;
        double[] dArr5 = dArr2;
        int length = dArr4.length;
        int length2 = dArr5.length - dArr4.length;
        double[] dArr6 = new double[length2];
        int i = 0;
        double dAbs = 0.0d;
        double d4 = 0.0d;
        while (i < length2) {
            double d5 = 0.0d;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 + i;
                if (i3 < dArr5.length) {
                    d5 += dArr4[i2] * dArr5[i3];
                }
            }
            if (i == 0) {
                d3 = 0.0d;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = i4 + i;
                    if (i5 < dArr5.length) {
                        double dAbs2 = Math.abs(dArr5[i5]);
                        d4 += dAbs2;
                        if (dAbs2 > d3) {
                            d3 = dAbs2;
                        }
                    }
                }
                dAbs = Math.abs(dArr5[i]);
            } else {
                int i6 = (length - 1) + i;
                if (i6 < dArr5.length) {
                    double dAbs3 = Math.abs(dArr5[i6]);
                    double d6 = dAbs3 > 0.0d ? dAbs3 : 0.0d;
                    d4 = (d4 - dAbs) + dAbs3;
                    dAbs = Math.abs(dArr5[i]);
                    d3 = d6;
                } else {
                    d3 = 0.0d;
                }
            }
            double dMax = Math.max(d4 / ((double) length), d3 / 8.0d);
            dArr3[i] = Math.abs(d5);
            dArr6[i] = Math.abs(d5) / Math.max(dMax, 3.0d * d2);
            i++;
            dArr4 = dArr;
            dArr5 = dArr2;
        }
        return dArr6;
    }

    public static a[] e(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = i;
        }
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = 0;
            while (i3 < (length - i2) - 1) {
                int i4 = iArr[i3];
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                if (i4 > i6) {
                    iArr[i3] = i6;
                    iArr[i5] = i4;
                    int i7 = iArr2[i3];
                    iArr2[i3] = iArr2[i5];
                    iArr2[i5] = i7;
                }
                i3 = i5;
            }
        }
        a[] aVarArr = new a[length];
        for (int i8 = 0; i8 < length; i8++) {
            aVarArr[i8] = new a();
        }
        for (int i9 = 0; i9 < length; i9++) {
            aVarArr[i9].f53872a = iArr2[i9];
            aVarArr[i9].d = iArr[i9];
        }
        return aVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    public static b a(int[] iArr, double[] dArr, double d2, int[] iArr2, double[] dArr2, double d3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int i8;
        int i9;
        double d4;
        int[] iArr4;
        b bVar;
        b bVar2;
        int[] iArr5 = iArr2;
        int length = iArr.length;
        int length2 = iArr5.length;
        double d5 = i2 == 6000 ? 110.0d : 130.0d;
        int[] iArrA = a(iArr, iArr5);
        a[] aVarArrE = e(iArrA);
        int[] iArr6 = new int[iArrA.length];
        int[] iArr7 = new int[iArrA.length];
        for (int i10 = 0; i10 < iArrA.length; i10++) {
            iArr6[i10] = aVarArrE[i10].d;
            iArr7[i10] = aVarArrE[i10].f53872a;
        }
        double[] dArrA = a(dArr, dArr2, iArr7);
        b bVar3 = new b();
        double dMax = Math.max(Math.min(d2 * 0.25d, 300.0d), d5);
        b bVar4 = bVar3;
        double dMax2 = Math.max(Math.min(d3 * 0.25d, 300.0d), d5);
        boolean z = true;
        int i11 = 0;
        while (true) {
            i3 = length + length2;
            if (i11 >= i3) {
                break;
            }
            if (iArr7[i11] < length) {
                int i12 = 0;
                while (i12 < length2) {
                    if (z && dArrA[i11] > dMax && dArr2[i12] > dMax2 && Math.abs(iArr6[i11] - iArr5[i12]) < i) {
                        d5 = d5;
                        bVar2 = bVar4;
                        bVar2.f53873a = iArr6[i11] - iArr5[i12];
                        bVar2.d = iArr6[i11];
                        bVar2.e = iArr5[i12];
                        iArr7 = iArr7;
                        bVar2.f53874b = Math.sqrt(dArrA[i11] * dArr2[i12]);
                        bVar2.f53875c = Math.max(iArr6[i11], iArr5[i12]);
                        z = false;
                    } else {
                        bVar2 = bVar4;
                        z = z;
                    }
                    i12++;
                    bVar4 = bVar2;
                    iArr7 = iArr7;
                    d5 = d5;
                }
                d4 = d5;
                iArr4 = iArr7;
                bVar = bVar4;
            } else {
                d4 = d5;
                iArr4 = iArr7;
                bVar = bVar4;
                int i13 = 0;
                while (i13 < length) {
                    if (z && dArr[i13] > dMax && dArrA[i11] > dMax2 && Math.abs(iArr[i13] - iArr6[i11]) < i) {
                        bVar.f53873a = iArr[i13] - iArr6[i11];
                        bVar.d = iArr[i13];
                        bVar.e = iArr6[i11];
                        bVar.f53874b = Math.sqrt(dArr[i13] * dArrA[i11]);
                        bVar.f53875c = Math.max(iArr[i13], iArr6[i11]);
                        z = false;
                    }
                    i13++;
                    dMax = dMax;
                }
            }
            i11++;
            iArr7 = iArr4;
            dMax = dMax;
            bVar4 = bVar;
            d5 = d4;
        }
        double d6 = d5;
        int[] iArr8 = iArr7;
        b bVar5 = bVar4;
        int i14 = 0;
        while (i14 < i3) {
            if (iArr8[i14] < length) {
                int i15 = 0;
                while (i15 < length2) {
                    if (z && Math.abs(iArr6[i14] - iArr5[i15]) < i) {
                        i9 = i3;
                        double d7 = dArrA[i14];
                        if (d7 > d2 * 0.1d) {
                            i7 = length;
                            i8 = length2;
                            double d8 = dArr2[i15];
                            if (d8 > d3 * 0.1d && Math.max(d7, d8) > d6 && Math.abs(iArr6[i14] - iArr5[i15]) < i && z) {
                                bVar5.f53873a = iArr6[i14] - iArr5[i15];
                                bVar5.d = iArr6[i14];
                                bVar5.e = iArr5[i15];
                                bVar5.f53874b = Math.sqrt(dArrA[i14] * dArr2[i15]);
                                bVar5.f53875c = Math.max(iArr6[i14], iArr5[i15]);
                                z = false;
                            }
                        } else {
                            i7 = length;
                            i8 = length2;
                        }
                    } else {
                        i7 = length;
                        i8 = length2;
                        i9 = i3;
                    }
                    i15++;
                    i3 = i9;
                    length = i7;
                    length2 = i8;
                }
                i4 = length2;
                i5 = i3;
                i6 = length;
            } else {
                i4 = length2;
                i5 = i3;
                i6 = length;
                int i16 = 0;
                while (i16 < i6) {
                    if (z && Math.abs(iArr[i16] - iArr6[i14]) < i) {
                        double d9 = dArr[i16];
                        if (d9 > d2 * 0.1d) {
                            iArr3 = iArr8;
                            double d10 = dArrA[i14];
                            if (d10 > d3 * 0.1d && Math.max(d9, d10) > d6 && Math.abs(iArr[i16] - iArr6[i14]) < i && z) {
                                bVar5.f53873a = iArr[i16] - iArr6[i14];
                                bVar5.d = iArr[i16];
                                bVar5.e = iArr6[i14];
                                bVar5.f53874b = Math.sqrt(dArr[i16] * dArrA[i14]);
                                bVar5.f53875c = Math.max(iArr[i16], iArr6[i14]);
                                z = false;
                            }
                        } else {
                            iArr3 = iArr8;
                        }
                    } else {
                        iArr3 = iArr8;
                    }
                    i16++;
                    iArr8 = iArr3;
                }
            }
            i14++;
            iArr5 = iArr2;
            length = i6;
            iArr8 = iArr8;
            i3 = i5;
            length2 = i4;
        }
        if (!z) {
            return bVar5;
        }
        bVar5.d = a(bVar5.d, iArr, dArr, d2, 0.3d);
        bVar5.e = a(bVar5.e, iArr2, dArr2, d3, 0.3d);
        bVar5.f53873a = bVar5.d - bVar5.e;
        return bVar5;
    }

    public static int a(int i, int[] iArr, double[] dArr, double d2, double d3) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (dArr[i2] >= d3 * d2) {
                return iArr[i2];
            }
        }
        return i;
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        int length = iArr.length + iArr2.length;
        int[] iArr3 = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < iArr.length) {
                iArr3[i] = iArr[i];
            } else {
                iArr3[i] = iArr2[i - iArr.length];
            }
        }
        return iArr3;
    }

    public static double[] a(double[] dArr, double[] dArr2, int[] iArr) {
        int length = dArr.length + dArr2.length;
        double[] dArr3 = new double[length];
        for (int i = 0; i < length; i++) {
            if (i < dArr.length) {
                dArr3[i] = dArr[i];
            } else {
                dArr3[i] = dArr2[i - dArr.length];
            }
        }
        double[] dArr4 = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr4[i2] = dArr3[iArr[i2]];
        }
        return dArr4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    public static c c(double[] dArr) {
        e eVarH = h(dArr);
        int[] iArr = new int[400];
        double[] dArr2 = new double[400];
        c cVar = new c();
        cVar.e = eVarH.d;
        boolean z = true;
        int i = 0;
        for (int i2 = 1; i2 < eVarH.e; i2++) {
            double d2 = dArr[i2];
            if (d2 >= dArr[i2 - 1] && d2 > dArr[i2 + 1] && z && d2 > 60.0d) {
                if (d2 < eVarH.d * 0.6d) {
                    double d3 = dArr[i2];
                    if (d3 < 400.0d) {
                        if (i < 400) {
                            iArr[i] = i2;
                            dArr2[i] = d3;
                        }
                        i++;
                    } else {
                        if (i < 400) {
                            iArr[i] = i2;
                            dArr2[i] = dArr[i2];
                        }
                        z = false;
                    }
                } else {
                    if (i < 400) {
                        iArr[i] = i2;
                        dArr2[i] = dArr[i2];
                    }
                    z = false;
                }
            }
        }
        if (z && i < 400) {
            iArr[i] = eVarH.e;
            dArr2[i] = eVarH.d;
        }
        int i3 = i + 1;
        double[] dArr3 = new double[i3];
        int[] iArr2 = new int[i3];
        if (i <= 399) {
            System.arraycopy(dArr2, 0, dArr3, 0, i3);
            System.arraycopy(iArr, 0, iArr2, 0, i3);
        }
        cVar.e = b(dArr2);
        e[] eVarArrA = a(dArr3);
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = iArr2[eVarArrA[i4].e];
        }
        int iMin = Math.min(50, i3);
        int[] iArr4 = new int[iMin];
        System.arraycopy(iArr3, 0, iArr4, 0, iMin);
        cVar.d = b(iArr4);
        cVar.f53877c = cVar.d[iMin - 1];
        for (int i5 = 1; i5 < eVarH.e; i5++) {
            double d4 = dArr[i5];
            if (d4 >= dArr[i5 - 1] && d4 > dArr[i5 + 1] && d4 >= eVarH.d * 0.6d) {
                cVar.f53877c = i5;
                return cVar;
            }
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218 A[LOOP:8: B:73:0x0216->B:74:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0234 A[LOOP:9: B:76:0x0231->B:78:0x0234, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263  */
    public static c a(ytd[] ytdVarArr, ytd[] ytdVarArr2, int i) {
        int i2;
        ytd[] ytdVarArr3;
        double[] dArr;
        int i3;
        int i4;
        double d2;
        ytd ytdVar;
        int iMin;
        ytd[] ytdVarArr4;
        ytd[] ytdVarArr5;
        int i5;
        double[] dArr2;
        int i6;
        int i7;
        double d3;
        c cVar = new c();
        ytd[] ytdVarArr6 = new ytd[ytdVarArr.length];
        System.arraycopy(ytdVarArr, 0, ytdVarArr6, 0, ytdVarArr.length);
        double[] dArr3 = new double[ytdVarArr.length];
        for (int i8 = 0; i8 < ytdVarArr.length; i8++) {
            ytd ytdVar2 = ytdVarArr[i8];
            dArr3[i8] = ytdVar2.c(ytdVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = ytdVarArr.length;
        e eVarH = h(dArr3);
        double d4 = eVarH.d;
        int i9 = eVarH.e;
        boolean z = true;
        for (int i10 = 1; i10 < i9; i10++) {
            double d5 = dArr3[i10];
            if (d5 >= dArr3[i10 - 1] && d5 > dArr3[i10 + 1] && z && d5 >= 60.0d) {
                if (d5 < 0.6d * d4 && d5 < 400.0d) {
                    arrayList.add(Integer.valueOf(i10));
                    arrayList2.add(Double.valueOf(dArr3[i10]));
                } else {
                    arrayList.add(Integer.valueOf(i10));
                    arrayList2.add(Double.valueOf(dArr3[i10]));
                    z = false;
                }
            }
        }
        if (z) {
            arrayList.add(Integer.valueOf(i9));
            arrayList2.add(Double.valueOf(d4));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        double[] dArr4 = new double[arrayList2.size()];
        double dDoubleValue = 0.0d;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            dArr4[i11] = ((Double) arrayList2.get(i11)).doubleValue();
            if (((Double) arrayList2.get(i11)).doubleValue() > dDoubleValue) {
                dDoubleValue = ((Double) arrayList2.get(i11)).doubleValue();
            }
        }
        for (int i12 = 1; i12 < i9; i12++) {
            double d6 = dArr3[i12];
            if (d6 >= dArr3[i12 - 1] && d6 > dArr3[i12 + 1]) {
                if (d6 > dDoubleValue * 0.6d) {
                    i9 = i12;
                    break;
                }
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, size);
        int length2 = iArrCopyOf.length;
        double[] dArr5 = new double[length2];
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = iArr[i13];
            dArr5[i13] = dArr3[i14];
            arrayList3.add(i13, Double.valueOf(dArr3[i14]));
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < length2) {
            int i17 = i16 + 1;
            int i18 = iArrCopyOf[i15];
            if (i18 <= 17 || dArr3[i18 - 18] <= dArr3[i18] * 0.3d) {
                i2 = i9;
                ytdVarArr3 = ytdVarArr6;
                dArr = dArr3;
                i3 = length2;
                i4 = i17;
                d2 = dDoubleValue;
            } else {
                int i19 = i + 2;
                int iMin2 = Math.min(i18, i19);
                int i20 = iArrCopyOf[i15];
                dArr = dArr3;
                i3 = length2;
                ytd[] ytdVarArr7 = (ytd[]) Arrays.copyOfRange(ytdVarArr6, (i20 - iMin2) + 1, i20 + 1);
                ytd[] ytdVarArr8 = (ytd[]) Arrays.copyOfRange(ytdVarArr2, i19 - iMin2, i19);
                i4 = i17;
                int i21 = 0;
                while (i21 < iMin2) {
                    ytdVarArr7[i21] = ytdVarArr7[i21].a(ytdVarArr6[iArrCopyOf[i15]].d(ytdVarArr8[i21]));
                    i21++;
                    iMin2 = iMin2;
                    ytdVarArr6 = ytdVarArr6;
                    i9 = i9;
                }
                i2 = i9;
                ytdVarArr3 = ytdVarArr6;
                double[] dArr6 = new double[ytdVarArr7.length];
                for (int i22 = 0; i22 < ytdVarArr7.length; i22++) {
                    ytd ytdVar3 = ytdVarArr7[i22];
                    dArr6[i22] = ytdVar3.c(ytdVar3);
                }
                double[] dArrE = e(dArr6);
                d2 = dDoubleValue;
                int i23 = (int) dArrE[0];
                int i24 = (i23 - i) + 1 + iArrCopyOf[i15];
                double d7 = dArrE[1];
                if (i24 > 0) {
                    if (i15 == 0) {
                        arrayList.add(0, Integer.valueOf(i24));
                        arrayList3.add(0, Double.valueOf(d7));
                    } else if (i24 - iArrCopyOf[i15 - 1] > 8) {
                        arrayList.add(i16, Integer.valueOf(i24));
                        arrayList3.add(i16, Double.valueOf(d7));
                    } else if (i23 > 17) {
                        ytdVar = ytdVarArr7[i23 - 18];
                        if (ytdVar.c(ytdVar) > d7 * 0.3d) {
                            int i25 = i23 + 1;
                            iMin = Math.min(i25, i19);
                            ytdVarArr4 = (ytd[]) Arrays.copyOfRange(ytdVarArr7, (i23 - iMin) + 1, i25);
                            ytdVarArr5 = (ytd[]) Arrays.copyOfRange(ytdVarArr2, i19 - iMin, i19);
                            for (i5 = 0; i5 < iMin; i5++) {
                                ytdVarArr4[i5] = ytdVarArr4[i5].a(ytdVarArr7[i23].d(ytdVarArr5[i5]));
                            }
                            dArr2 = new double[ytdVarArr4.length];
                            for (i6 = 0; i6 < ytdVarArr4.length; i6++) {
                                ytd ytdVar4 = ytdVarArr4[i6];
                                dArr2[i6] = ytdVar4.c(ytdVar4);
                            }
                            double[] dArrE2 = e(dArr2);
                            i7 = (((int) dArrE2[0]) - i) + 1 + iArrCopyOf[i15];
                            d3 = dArrE2[1];
                            if (i7 <= 0) {
                                if (i15 == 0) {
                                    arrayList.add(0, Integer.valueOf(i7));
                                    arrayList3.add(0, Double.valueOf(d3));
                                } else if (i7 - iArrCopyOf[i15 - 1] <= 8 && i24 - i7 > 8) {
                                    int i26 = i4 - 1;
                                    arrayList.add(i26, Integer.valueOf(i7));
                                    arrayList3.add(i26, Double.valueOf(d3));
                                }
                                i4++;
                            }
                        }
                    }
                    i4 = i16 + 2;
                    if (i23 > 17) {
                        ytdVar = ytdVarArr7[i23 - 18];
                        if (ytdVar.c(ytdVar) > d7 * 0.3d) {
                            int i27 = i23 + 1;
                            iMin = Math.min(i27, i19);
                            ytdVarArr4 = (ytd[]) Arrays.copyOfRange(ytdVarArr7, (i23 - iMin) + 1, i27);
                            ytdVarArr5 = (ytd[]) Arrays.copyOfRange(ytdVarArr2, i19 - iMin, i19);
                            while (i5 < iMin) {
                                ytdVarArr4[i5] = ytdVarArr4[i5].a(ytdVarArr7[i23].d(ytdVarArr5[i5]));
                            }
                            dArr2 = new double[ytdVarArr4.length];
                            while (i6 < ytdVarArr4.length) {
                                ytd ytdVar5 = ytdVarArr4[i6];
                                dArr2[i6] = ytdVar5.c(ytdVar5);
                            }
                            double[] dArrE3 = e(dArr2);
                            i7 = (((int) dArrE3[0]) - i) + 1 + iArrCopyOf[i15];
                            d3 = dArrE3[1];
                            if (i7 <= 0) {
                                if (i15 == 0) {
                                    arrayList.add(0, Integer.valueOf(i7));
                                    arrayList3.add(0, Double.valueOf(d3));
                                } else if (i7 - iArrCopyOf[i15 - 1] <= 8) {
                                }
                                i4++;
                            }
                        }
                    }
                }
                i16 = i4;
                i15++;
                length2 = i3;
                dArr3 = dArr;
                ytdVarArr6 = ytdVarArr3;
                i9 = i2;
                dDoubleValue = d2;
            }
            i16 = i4;
            i15++;
            length2 = i3;
            dArr3 = dArr;
            ytdVarArr6 = ytdVarArr3;
            i9 = i2;
            dDoubleValue = d2;
        }
        int i28 = i9;
        double d8 = dDoubleValue;
        int[] iArr2 = new int[arrayList.size()];
        double[] dArr7 = new double[arrayList3.size()];
        for (int i29 = 0; i29 < arrayList.size(); i29++) {
            iArr2[i29] = ((Integer) arrayList.get(i29)).intValue();
            dArr7[i29] = ((Double) arrayList3.get(i29)).doubleValue();
        }
        Log.i("UltraAlg", "resPeakIndex: " + Arrays.toString(iArr2));
        cVar.e = d8;
        cVar.d = iArr2;
        cVar.f53876a = dArr7;
        cVar.f53877c = i28;
        return cVar;
    }

    public static double[] e(double[] dArr) {
        double[] dArr2 = new double[2];
        boolean z = true;
        for (int length = dArr.length - 2; length >= 1; length--) {
            double d2 = dArr[length];
            if (d2 >= dArr[length - 1] && d2 > dArr[length + 1] && z && d2 > 55.0d) {
                dArr2[0] = length;
                dArr2[1] = dArr[length];
                z = false;
            }
        }
        return dArr2;
    }

    public static int[] b(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        Object[] array = hashSet.toArray();
        Arrays.sort(array);
        int[] iArr2 = new int[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            iArr2[i2] = Integer.parseInt(String.valueOf(array[i2]));
        }
        return iArr2;
    }

    public static e[] a(double[] dArr) {
        int length = dArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            int i3 = 0;
            while (i3 < (dArr.length - i2) - 1) {
                double d2 = dArr[i3];
                int i4 = i3 + 1;
                double d3 = dArr[i4];
                if (d2 < d3) {
                    dArr[i3] = d3;
                    dArr[i4] = d2;
                    int i5 = iArr[i3];
                    iArr[i3] = iArr[i4];
                    iArr[i4] = i5;
                }
                i3 = i4;
            }
        }
        e[] eVarArr = new e[length];
        for (int i6 = 0; i6 < length; i6++) {
            eVarArr[i6] = new e();
        }
        for (int i7 = 0; i7 < length; i7++) {
            eVarArr[i7].e = iArr[i7];
            eVarArr[i7].d = dArr[i7];
        }
        return eVarArr;
    }

    public static e h(double[] dArr) {
        e eVar = new e();
        int i = 0;
        double d2 = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            double d3 = dArr[i2];
            if (d3 > d2) {
                i = i2;
                d2 = d3;
            }
        }
        eVar.e = i;
        eVar.d = d2;
        return eVar;
    }

    public static int[] c(int[] iArr, int i) {
        if (iArr == null) {
            return new int[0];
        }
        int[] iArr2 = new int[iArr.length];
        if (iArr.length >= 0) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[i2] + i;
            }
        }
        return iArr2;
    }

    public static ytd[] a(int i) {
        ytd[] ytdVarArr = new ytd[i];
        for (int i2 = 0; i2 < i; i2++) {
            ytdVarArr[i2] = new ytd(0.0d, 0.0d);
        }
        return ytdVarArr;
    }
}
