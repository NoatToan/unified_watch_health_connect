package defpackage;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class sdo extends ba7 {
    public r7g d;

    public sdo(String str) {
        this.f3977a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.d = d(Arrays.copyOf(dArr, i + 1));
    }

    public static r7g d(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        r7g r7gVar = new r7g(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + r7gVar.c(0.0d, 0));
        printStream.println(" 1 " + r7gVar.c(1.0d, 0));
        return r7gVar;
    }

    @Override // defpackage.ba7
    public double a(double d) {
        return this.d.c(d, 0);
    }

    @Override // defpackage.ba7
    public double b(double d) {
        return this.d.f(d, 0);
    }
}
