package o6;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f129503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f129504b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f129505c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f129506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f129507e;

    public final float a(float f14) {
        return (float) this.f129503a.b(f14);
    }

    public void b(float f14, int i14) {
        int[] iArr = this.f129504b;
        if (iArr.length < this.f129506d + 1) {
            this.f129504b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f129505c;
            this.f129505c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f129504b;
        int i15 = this.f129506d;
        iArr2[i15] = i14;
        this.f129505c[i15] = f14;
        this.f129506d = i15 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void c(int i14) {
        int i15 = this.f129506d;
        if (i15 == 0) {
            return;
        }
        int[] iArr = this.f129504b;
        float[] fArr = this.f129505c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i15 - 1;
        iArr2[1] = 0;
        int i16 = 2;
        while (i16 > 0) {
            int i17 = i16 - 1;
            int i18 = iArr2[i17];
            int i19 = i16 - 2;
            int i24 = iArr2[i19];
            if (i18 < i24) {
                int i25 = iArr[i24];
                int i26 = i18;
                int i27 = i26;
                while (i26 < i24) {
                    int i28 = iArr[i26];
                    if (i28 <= i25) {
                        int i29 = iArr[i27];
                        iArr[i27] = i28;
                        iArr[i26] = i29;
                        float f14 = fArr[i27];
                        fArr[i27] = fArr[i26];
                        fArr[i26] = f14;
                        i27++;
                    }
                    i26++;
                }
                int i30 = iArr[i27];
                iArr[i27] = iArr[i24];
                iArr[i24] = i30;
                float f15 = fArr[i27];
                fArr[i27] = fArr[i24];
                fArr[i24] = f15;
                iArr2[i19] = i27 - 1;
                iArr2[i17] = i18;
                int i34 = i16 + 1;
                iArr2[i16] = i24;
                i16 += 2;
                iArr2[i34] = i27 + 1;
            } else {
                i16 = i19;
            }
        }
        int i35 = 1;
        for (int i36 = 1; i36 < this.f129506d; i36++) {
            int[] iArr3 = this.f129504b;
            if (iArr3[i36 - 1] != iArr3[i36]) {
                i35++;
            }
        }
        double[] dArr = new double[i35];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i35, 1);
        int i37 = 0;
        for (int i38 = 0; i38 < this.f129506d; i38++) {
            if (i38 > 0) {
                int[] iArr4 = this.f129504b;
                if (iArr4[i38] != iArr4[i38 - 1]) {
                    dArr[i37] = ((double) this.f129504b[i38]) * 0.01d;
                    dArr2[i37][0] = this.f129505c[i38];
                    i37++;
                }
            } else {
                dArr[i37] = ((double) this.f129504b[i38]) * 0.01d;
                dArr2[i37][0] = this.f129505c[i38];
                i37++;
            }
        }
        this.f129503a = b.a(i14, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f129507e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i14 = 0; i14 < this.f129506d; i14++) {
            StringBuilder sbI = sn.a.i(string, "[");
            sbI.append(this.f129504b[i14]);
            sbI.append(" , ");
            sbI.append(decimalFormat.format(this.f129505c[i14]));
            sbI.append("] ");
            string = sbI.toString();
        }
        return string;
    }
}
