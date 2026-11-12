package o6;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f129532a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f129536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f129537f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f129540i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f129533b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f129534c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[][] f129535d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f129538g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f129539h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f129541j = Float.NaN;

    public final float a(float f14) {
        float fAbs;
        switch (this.f129533b) {
            case 1:
                return Math.signum(f14 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f14);
                break;
            case 3:
                return (((f14 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f14 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f14 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f14 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f14 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void b(float f14, float f15, float f16, int i14, int i15) {
        int i16 = this.f129536e;
        this.f129534c[i16] = i14;
        float[] fArr = this.f129535d[i16];
        fArr[0] = f14;
        fArr[1] = f15;
        fArr[2] = f16;
        this.f129533b = Math.max(this.f129533b, i15);
        this.f129536e++;
    }

    public void c(int i14) {
        float[][] fArr;
        int i15 = this.f129536e;
        if (i15 == 0) {
            System.err.println("Error no points added to " + this.f129537f);
            return;
        }
        int[] iArr = this.f129534c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i15 - 1;
        iArr2[1] = 0;
        int i16 = 2;
        while (true) {
            fArr = this.f129535d;
            if (i16 <= 0) {
                break;
            }
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
                        float[] fArr2 = fArr[i27];
                        fArr[i27] = fArr[i26];
                        fArr[i26] = fArr2;
                        i27++;
                    }
                    i26++;
                }
                int i30 = iArr[i27];
                iArr[i27] = iArr[i24];
                iArr[i24] = i30;
                float[] fArr3 = fArr[i27];
                fArr[i27] = fArr[i24];
                fArr[i24] = fArr3;
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
        int i35 = 0;
        for (int i36 = 1; i36 < iArr.length; i36++) {
            if (iArr[i36] != iArr[i36 - 1]) {
                i35++;
            }
        }
        if (i35 == 0) {
            i35 = 1;
        }
        double[] dArr = new double[i35];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i35, 3);
        int i37 = 0;
        for (int i38 = 0; i38 < this.f129536e; i38++) {
            if (i38 <= 0 || iArr[i38] != iArr[i38 - 1]) {
                dArr[i37] = ((double) iArr[i38]) * 0.01d;
                double[] dArr3 = dArr2[i37];
                float[] fArr4 = fArr[i38];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i37++;
            }
        }
        this.f129532a = b.a(i14, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f129537f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i14 = 0; i14 < this.f129536e; i14++) {
            StringBuilder sbI = sn.a.i(string, "[");
            sbI.append(this.f129534c[i14]);
            sbI.append(" , ");
            sbI.append(decimalFormat.format(this.f129535d[i14]));
            sbI.append("] ");
            string = sbI.toString();
        }
        return string;
    }
}
