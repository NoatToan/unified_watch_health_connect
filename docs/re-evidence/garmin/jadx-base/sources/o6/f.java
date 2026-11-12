package o6;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f129468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f129469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129470c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f129471d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f129472e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f129473f = new ArrayList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f129474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f129475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double[] f129476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f129477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f129478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f129479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o6.b f129480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double[] f129481h;

        public a(int i14, String str, int i15, int i16) {
            i iVar = new i();
            this.f129474a = iVar;
            iVar.f129500e = i14;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int iIndexOf = str.indexOf(40) + 1;
                int iIndexOf2 = str.indexOf(44, iIndexOf);
                char c14 = 0;
                int i17 = 0;
                while (iIndexOf2 != -1) {
                    dArr[i17] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                    iIndexOf = iIndexOf2 + 1;
                    iIndexOf2 = str.indexOf(44, iIndexOf);
                    i17++;
                }
                dArr[i17] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                double[] dArrCopyOf = Arrays.copyOf(dArr, i17 + 1);
                int length = (dArrCopyOf.length * 3) - 2;
                int length2 = dArrCopyOf.length - 1;
                double d14 = 1.0d;
                double d15 = 1.0d / ((double) length2);
                double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i18 = 0;
                while (i18 < dArrCopyOf.length) {
                    double d16 = dArrCopyOf[i18];
                    int i19 = i18 + length2;
                    dArr2[i19][c14] = d16;
                    char c15 = c14;
                    double d17 = d14;
                    double d18 = ((double) i18) * d15;
                    dArr3[i19] = d18;
                    if (i18 > 0) {
                        int i24 = (length2 * 2) + i18;
                        dArr2[i24][c15] = d16 + d17;
                        dArr3[i24] = d18 + d17;
                        int i25 = i18 - 1;
                        dArr2[i25][c15] = (d16 - d17) - d15;
                        dArr3[i25] = (d18 - 1.0d) - d15;
                    }
                    i18++;
                    c14 = c15;
                    d14 = d17;
                }
                iVar.f129499d = new h(dArr3, dArr2);
            }
            this.f129475b = new float[i16];
            this.f129476c = new double[i16];
            this.f129477d = new float[i16];
            this.f129478e = new float[i16];
            this.f129479f = new float[i16];
            float[] fArr = new float[i16];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f129482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f129483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f129484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f129485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f129486e;

        public b(int i14, float f14, float f15, float f16, float f17) {
            this.f129482a = i14;
            this.f129483b = f17;
            this.f129484c = f15;
            this.f129485d = f14;
            this.f129486e = f16;
        }
    }

    public final float a(float f14) {
        double dSignum;
        double dAbs;
        a aVar = this.f129468a;
        o6.b bVar = aVar.f129480g;
        double[] dArr = aVar.f129481h;
        if (bVar != null) {
            bVar.c(f14, dArr);
        } else {
            dArr[0] = aVar.f129478e[0];
            dArr[1] = aVar.f129479f[0];
            dArr[2] = aVar.f129475b[0];
        }
        double[] dArr2 = aVar.f129481h;
        double d14 = dArr2[0];
        double d15 = dArr2[1];
        i iVar = aVar.f129474a;
        double d16 = f14;
        iVar.getClass();
        double dB = 0.0d;
        if (d16 > 0.0d) {
            if (d16 >= 1.0d) {
                dB = 1.0d;
            } else {
                int iBinarySearch = Arrays.binarySearch(iVar.f129497b, d16);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = iVar.f129496a;
                float f15 = fArr[iBinarySearch];
                int i14 = iBinarySearch - 1;
                float f16 = fArr[i14];
                double d17 = f15 - f16;
                double[] dArr3 = iVar.f129497b;
                double d18 = dArr3[iBinarySearch];
                double d19 = dArr3[i14];
                double d24 = d17 / (d18 - d19);
                dB = ((((d16 * d16) - (d19 * d19)) * d24) / 2.0d) + o2.c.b(d16, d19, ((double) f16) - (d24 * d19), iVar.f129498c[i14]);
            }
        }
        double d25 = dB + d15;
        switch (iVar.f129500e) {
            case 1:
                dSignum = Math.signum(0.5d - (d25 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d25 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d25 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d25 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d15 + d25) * 6.283185307179586d);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d25 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = iVar.f129499d.b(d25 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d25);
                break;
        }
        return (float) ((dSignum * aVar.f129481h[2]) + d14);
    }

    public void b(androidx.constraintlayout.widget.a aVar) {
    }

    public final void c() {
        int i14;
        ArrayList<b> arrayList = this.f129473f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new e(this));
        double[] dArr = new double[size];
        int i15 = 2;
        int i16 = 1;
        int i17 = 3;
        int i18 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        this.f129468a = new a(this.f129470c, this.f129471d, this.f129472e, size);
        int i19 = 0;
        for (b bVar : arrayList) {
            float f14 = bVar.f129485d;
            dArr[i19] = ((double) f14) * 0.01d;
            double[] dArr3 = dArr2[i19];
            float f15 = bVar.f129483b;
            dArr3[i18] = f15;
            float f16 = bVar.f129484c;
            int i24 = i17;
            int i25 = i18;
            dArr3[i16] = f16;
            float f17 = bVar.f129486e;
            int i26 = i15;
            dArr3[i26] = f17;
            a aVar = this.f129468a;
            int i27 = i16;
            aVar.f129476c[i19] = ((double) bVar.f129482a) / 100.0d;
            aVar.f129477d[i19] = f14;
            aVar.f129478e[i19] = f16;
            aVar.f129479f[i19] = f17;
            aVar.f129475b[i19] = f15;
            i19 += i27;
            i15 = i26;
            i16 = i27;
            i17 = i24;
            i18 = i25;
            dArr2 = dArr2;
        }
        double[][] dArr4 = dArr2;
        int i28 = i16;
        int i29 = i17;
        int i30 = i18;
        int i34 = i15;
        a aVar2 = this.f129468a;
        float[] fArr = aVar2.f129477d;
        i iVar = aVar2.f129474a;
        double[] dArr5 = aVar2.f129476c;
        int length = dArr5.length;
        int[] iArr = new int[i34];
        iArr[i28] = i29;
        iArr[i30] = length;
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr2 = aVar2.f129475b;
        aVar2.f129481h = new double[fArr2.length + i34];
        double[] dArr7 = new double[fArr2.length + i34];
        double d14 = 0.0d;
        if (dArr5[i30] > 0.0d) {
            iVar.a(0.0d, fArr[i30]);
        }
        int length2 = dArr5.length - i28;
        if (dArr5[length2] < 1.0d) {
            iVar.a(1.0d, fArr[length2]);
        }
        for (int i35 = i30; i35 < dArr6.length; i35++) {
            double[] dArr8 = dArr6[i35];
            dArr8[i30] = aVar2.f129478e[i35];
            dArr8[i28] = aVar2.f129479f[i35];
            dArr8[2] = fArr2[i35];
            iVar.a(dArr5[i35], fArr[i35]);
        }
        double d15 = 0.0d;
        int i36 = i30;
        while (true) {
            float[] fArr3 = iVar.f129496a;
            if (i36 >= fArr3.length) {
                break;
            }
            d15 += (double) fArr3[i36];
            i36++;
        }
        int i37 = i28;
        double d16 = 0.0d;
        while (true) {
            float[] fArr4 = iVar.f129496a;
            if (i37 >= fArr4.length) {
                break;
            }
            int i38 = i37 - 1;
            float f18 = (fArr4[i38] + fArr4[i37]) / 2.0f;
            double[] dArr9 = iVar.f129497b;
            d16 = ((dArr9[i37] - dArr9[i38]) * ((double) f18)) + d16;
            i37++;
        }
        int i39 = i30;
        while (true) {
            float[] fArr5 = iVar.f129496a;
            if (i39 >= fArr5.length) {
                break;
            }
            fArr5[i39] = fArr5[i39] * ((float) (d15 / d16));
            i39++;
            d14 = d14;
        }
        iVar.f129498c[i30] = d14;
        int i44 = 1;
        while (true) {
            float[] fArr6 = iVar.f129496a;
            if (i44 >= fArr6.length) {
                break;
            }
            int i45 = i44 - 1;
            float f19 = (fArr6[i45] + fArr6[i44]) / 2.0f;
            double[] dArr10 = iVar.f129497b;
            double d17 = dArr10[i44] - dArr10[i45];
            double[] dArr11 = iVar.f129498c;
            dArr11[i44] = (d17 * ((double) f19)) + dArr11[i45];
            i44++;
        }
        if (dArr5.length > 1) {
            i14 = i30;
            aVar2.f129480g = o6.b.a(i14, dArr5, dArr6);
        } else {
            i14 = i30;
            aVar2.f129480g = null;
        }
        o6.b.a(i14, dArr, dArr4);
    }

    public final String toString() {
        String string = this.f129469b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (b bVar : this.f129473f) {
            StringBuilder sbI = sn.a.i(string, "[");
            sbI.append(bVar.f129482a);
            sbI.append(" , ");
            sbI.append(decimalFormat.format(bVar.f129483b));
            sbI.append("] ");
            string = sbI.toString();
        }
        return string;
    }
}
