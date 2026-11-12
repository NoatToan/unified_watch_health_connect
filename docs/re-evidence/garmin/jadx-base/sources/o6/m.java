package o6;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f129517d;

    public m(String str) {
        this.f129462a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i14 = 0;
        while (iIndexOf2 != -1) {
            dArr[i14] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i14++;
        }
        dArr[i14] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i14 + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d14 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i15 = 0; i15 < dArrCopyOf.length; i15++) {
            double d15 = dArrCopyOf[i15];
            int i16 = i15 + length2;
            dArr2[i16][0] = d15;
            double d16 = ((double) i15) * d14;
            dArr3[i16] = d16;
            if (i15 > 0) {
                int i17 = (length2 * 2) + i15;
                dArr2[i17][0] = d15 + 1.0d;
                dArr3[i17] = d16 + 1.0d;
                int i18 = i15 - 1;
                dArr2[i18][0] = (d15 - 1.0d) - d14;
                dArr3[i18] = (d16 - 1.0d) - d14;
            }
        }
        h hVar = new h(dArr3, dArr2);
        System.out.println(" 0 " + hVar.b(0.0d));
        System.out.println(" 1 " + hVar.b(1.0d));
        this.f129517d = hVar;
    }

    @Override // o6.c
    public final double a(double d14) {
        return this.f129517d.b(d14);
    }

    @Override // o6.c
    public final double b(double d14) {
        return this.f129517d.h(d14);
    }
}
