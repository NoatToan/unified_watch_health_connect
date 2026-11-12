package defpackage;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class a3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ava f575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f576b;
    public int[] c;

    public a3i(ava avaVar, int i) {
        this.f575a = avaVar;
        this.f576b = i;
        int[] iArr = new int[i + 1];
        this.c = iArr;
        iArr[i] = 1;
    }

    public static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public static int i(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return 0;
        }
        return iArr[iC];
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        int iC = c(iArr);
        if (iC != c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= iC; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] p(int[] iArr, int i) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iC + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, iC + 1);
        return iArr2;
    }

    public static int[] q(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int i = iC + 1;
        if (iArr.length == i) {
            return icd.a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f575a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    public void b(a3i a3iVar) {
        this.c = a(this.c, a3iVar.c);
        d();
    }

    public final void d() {
        int length = this.c.length;
        do {
            this.f576b = length - 1;
            length = this.f576b;
            if (length < 0) {
                return;
            }
        } while (this.c[length] == 0);
    }

    public int e(int i) {
        int[] iArr = this.c;
        int i2 = this.f576b;
        int iH = iArr[i2];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            iH = this.f575a.h(iH, i) ^ this.c[i3];
        }
        return iH;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a3i)) {
            a3i a3iVar = (a3i) obj;
            if (this.f575a.equals(a3iVar.f575a) && this.f576b == a3iVar.f576b && j(this.c, a3iVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i) {
        if (i < 0 || i > this.f576b) {
            return 0;
        }
        return this.c[i];
    }

    public int g() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i = 8;
        int i2 = 1;
        while (this.f575a.d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.c.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = this.f575a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i];
            i++;
        }
    }

    public a3i k(a3i a3iVar) {
        return new a3i(this.f575a, l(this.c, a3iVar.c));
    }

    public final int[] l(int[] iArr, int[] iArr2) {
        int iC = c(iArr2);
        if (iC == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArrA = new int[length];
        int iF = this.f575a.f(i(iArr2));
        System.arraycopy(iArr, 0, iArrA, 0, length);
        while (iC <= c(iArrA)) {
            iArrA = a(o(p(iArr2, c(iArrA) - iC), this.f575a.h(i(iArrA), iF)), iArrA);
        }
        return iArrA;
    }

    public void m(int i) {
        if (!this.f575a.g(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.c = o(this.c, i);
        d();
    }

    public a3i n(int i) {
        if (!this.f575a.g(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new a3i(this.f575a, o(this.c, i));
    }

    public final int[] o(int[] iArr, int i) {
        int iC = c(iArr);
        if (iC == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return icd.a(iArr);
        }
        int[] iArr2 = new int[iC + 1];
        while (iC >= 0) {
            iArr2[iC] = this.f575a.h(iArr[iC], i);
            iC--;
        }
        return iArr2;
    }

    public String toString() {
        String str = " Polynomial over " + this.f575a.toString() + ": \n";
        for (int i = 0; i < this.c.length; i++) {
            str = str + this.f575a.b(this.c[i]) + "Y^" + i + Marker.ANY_NON_NULL_MARKER;
        }
        return str + ";";
    }

    public a3i(ava avaVar, byte[] bArr) {
        this.f575a = avaVar;
        int i = 8;
        int i2 = 1;
        while (avaVar.d() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                d();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.c;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.f575a.g(this.c[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public a3i(ava avaVar, int[] iArr) {
        this.f575a = avaVar;
        this.c = q(iArr);
        d();
    }

    public a3i(a3i a3iVar) {
        this.f575a = a3iVar.f575a;
        this.f576b = a3iVar.f576b;
        this.c = icd.a(a3iVar.c);
    }
}
