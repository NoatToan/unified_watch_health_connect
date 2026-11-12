package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public class k45 {
    public static final String[] c = {"_B-1", "_B-2", "_B-3", "_B-4", "_B-5", "_B-6", "_B-7", "_B-8"};
    public static final String[] d = {"_B+1", "_B+2", "_B+3", "_B+4", "_B+5", "_B+6", "_B+7", "_B+8"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[][] f23415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23416b = 0;

    public k45(int i, int i2) {
        this.f23415a = (String[][]) Array.newInstance((Class<?>) String.class, i, i2);
    }

    public boolean a(String str) {
        return b(str.split("\t"));
    }

    public boolean b(String[] strArr) {
        int i = this.f23416b;
        String[][] strArr2 = this.f23415a;
        if (i == strArr2.length) {
            return false;
        }
        int length = strArr.length;
        String[] strArr3 = strArr2[i];
        if (length == strArr3.length) {
            System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
            this.f23416b++;
            return true;
        }
        throw new IllegalArgumentException("tokenInfo length error, except length:" + this.f23415a[this.f23416b].length + ", but receive length:" + strArr.length);
    }

    public String c(l45 l45Var, int i) {
        int i2;
        int[][] iArrB = l45Var.b();
        String strC = l45Var.c();
        if (iArrB == null) {
            return strC;
        }
        int length = iArrB.length;
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < iArrB.length; i3++) {
            int[] iArr = iArrB[i3];
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = i4 + i;
            String[][] strArr2 = this.f23415a;
            int length2 = strArr2[0].length;
            if (i4 < -8 || i4 > 8 || i5 < 0 || i5 >= length2 || i < 0 || i >= (i2 = this.f23416b)) {
                return null;
            }
            if (i6 < 0) {
                strArr[i3] = c[(-i6) - 1];
            } else if (i6 >= i2) {
                strArr[i3] = d[i6 - i2];
            } else {
                strArr[i3] = strArr2[i6][i5];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strC);
        sb.append(":");
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(strArr[i7]);
            if (i7 < length - 1) {
                sb.append("/");
            }
        }
        return sb.toString();
    }

    public String toString() {
        String[][] strArr;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f23415a.length; i++) {
            int i2 = 0;
            while (true) {
                strArr = this.f23415a;
                String[] strArr2 = strArr[i];
                if (i2 >= strArr2.length) {
                    break;
                }
                sb.append(strArr2[i2]);
                if (i2 < this.f23415a[i].length - 1) {
                    sb.append("/");
                }
                i2++;
            }
            if (i < strArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
