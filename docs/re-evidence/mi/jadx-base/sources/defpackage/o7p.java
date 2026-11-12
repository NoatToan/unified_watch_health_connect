package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class o7p {
    public static final char[] l = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x53 f28829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f28830b;
    public int c;
    public int d;
    public ArrayList<char[]> e;
    public boolean f;
    public int g;
    public char[] h;
    public int i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f28831k;

    public o7p(x53 x53Var) {
        this.f28829a = x53Var;
    }

    public void A(char[] cArr, int i, int i2) {
        this.j = null;
        this.f28831k = null;
        this.f28830b = cArr;
        this.c = i;
        this.d = i2;
        if (this.f) {
            f();
        }
    }

    public void B(String str) {
        this.f28830b = null;
        this.c = -1;
        this.d = 0;
        this.j = str;
        this.f28831k = null;
        if (this.f) {
            f();
        }
        this.i = 0;
    }

    public final char[] C() {
        int i;
        String str = this.j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.c;
        if (i2 >= 0) {
            int i3 = this.d;
            if (i3 < 1) {
                return l;
            }
            return i2 == 0 ? Arrays.copyOf(this.f28830b, i3) : Arrays.copyOfRange(this.f28830b, i2, i3 + i2);
        }
        int iF = F();
        if (iF < 1) {
            return l;
        }
        char[] cArrE = e(iF);
        ArrayList<char[]> arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrE, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.h, 0, cArrE, i, this.i);
        return cArrE;
    }

    public String D(int i) {
        this.i = i;
        if (this.g > 0) {
            return l();
        }
        String str = i == 0 ? "" : new String(this.h, 0, i);
        this.j = str;
        return str;
    }

    public void E(int i) {
        this.i = i;
    }

    public int F() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.f28831k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final void G(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.f28830b;
        this.f28830b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = d(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public void a(char c) {
        if (this.c >= 0) {
            G(16);
        }
        this.j = null;
        this.f28831k = null;
        char[] cArr = this.h;
        if (this.i >= cArr.length) {
            n(1);
            cArr = this.h;
        }
        int i = this.i;
        this.i = i + 1;
        cArr[i] = c;
    }

    public void b(String str, int i, int i2) {
        if (this.c >= 0) {
            G(i2);
        }
        this.j = null;
        this.f28831k = null;
        char[] cArr = this.h;
        int length = cArr.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            n(i2);
            int iMin = Math.min(this.h.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.h, 0);
            this.i += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public void c(char[] cArr, int i, int i2) {
        if (this.c >= 0) {
            G(i2);
        }
        this.j = null;
        this.f28831k = null;
        char[] cArr2 = this.h;
        int length = cArr2.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            n(i2);
            int iMin = Math.min(this.h.length, i2);
            System.arraycopy(cArr, i, this.h, 0, iMin);
            this.i += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final char[] d(int i) {
        x53 x53Var = this.f28829a;
        return x53Var != null ? x53Var.d(2, i) : new char[Math.max(i, 1000)];
    }

    public final char[] e(int i) {
        return new char[i];
    }

    public final void f() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    public char[] g() {
        char[] cArr = this.f28831k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrC = C();
        this.f28831k = cArrC;
        return cArrC;
    }

    public BigDecimal h() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f28831k;
        if (cArr3 != null) {
            return n2h.g(cArr3);
        }
        int i = this.c;
        if (i < 0 || (cArr2 = this.f28830b) == null) {
            return (this.g != 0 || (cArr = this.h) == null) ? n2h.g(g()) : n2h.h(cArr, 0, this.i);
        }
        return n2h.h(cArr2, i, this.d);
    }

    public double i() throws NumberFormatException {
        return n2h.i(l());
    }

    public int j(boolean z) {
        char[] cArr;
        int i = this.c;
        if (i < 0 || (cArr = this.f28830b) == null) {
            return z ? -n2h.k(this.h, 1, this.i - 1) : n2h.k(this.h, 0, this.i);
        }
        return z ? -n2h.k(cArr, i + 1, this.d - 1) : n2h.k(cArr, i, this.d);
    }

    public long k(boolean z) {
        char[] cArr;
        int i = this.c;
        if (i < 0 || (cArr = this.f28830b) == null) {
            return z ? -n2h.m(this.h, 1, this.i - 1) : n2h.m(this.h, 0, this.i);
        }
        return z ? -n2h.m(cArr, i + 1, this.d - 1) : n2h.m(cArr, i, this.d);
    }

    public String l() {
        if (this.j == null) {
            char[] cArr = this.f28831k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else {
                int i = this.c;
                if (i >= 0) {
                    int i2 = this.d;
                    if (i2 < 1) {
                        this.j = "";
                        return "";
                    }
                    this.j = new String(this.f28830b, i, i2);
                } else {
                    int i3 = this.g;
                    int i4 = this.i;
                    if (i3 == 0) {
                        this.j = i4 != 0 ? new String(this.h, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.h, 0, this.i);
                        this.j = sb.toString();
                    }
                }
            }
        }
        return this.j;
    }

    public char[] m() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.f28830b = null;
        this.j = null;
        this.f28831k = null;
        if (this.f) {
            f();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrD = d(0);
        this.h = cArrD;
        return cArrD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r0
      0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n(int i) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        char[] cArr = this.h;
        this.f = true;
        this.e.add(cArr);
        this.g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        int i3 = 1000;
        if (i2 < 1000) {
            i2 = i3;
        } else {
            i3 = 262144;
            if (i2 > 262144) {
                i2 = i3;
            }
        }
        this.h = e(i2);
    }

    public char[] o() {
        char[] cArr = this.h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 262144) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        this.h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] p() {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.f = true;
        this.e.add(this.h);
        int length = this.h.length;
        this.g += length;
        this.i = 0;
        int i = length + (length >> 1);
        int i2 = 1000;
        if (i < 1000) {
            i = i2;
        } else {
            i2 = 262144;
            if (i > 262144) {
                i = i2;
            }
        }
        char[] cArrE = e(i);
        this.h = cArrE;
        return cArrE;
    }

    public char[] q() {
        return this.h;
    }

    public char[] r() {
        if (this.c >= 0) {
            G(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = d(0);
            } else if (this.i >= cArr.length) {
                n(1);
            }
        }
        return this.h;
    }

    public int s() {
        return this.i;
    }

    public char[] t() {
        if (this.c >= 0) {
            return this.f28830b;
        }
        char[] cArr = this.f28831k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f28831k = charArray;
            return charArray;
        }
        if (this.f) {
            return g();
        }
        char[] cArr2 = this.h;
        return cArr2 == null ? l : cArr2;
    }

    public String toString() {
        return l();
    }

    public int u() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public boolean v() {
        return this.c >= 0 || this.f28831k != null || this.j == null;
    }

    public void w() {
        if (this.f28829a == null) {
            z();
        } else if (this.h != null) {
            z();
            char[] cArr = this.h;
            this.h = null;
            this.f28829a.j(2, cArr);
        }
    }

    public void x(String str, int i, int i2) {
        this.f28830b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.f28831k = null;
        if (this.f) {
            f();
        } else if (this.h == null) {
            this.h = d(i2);
        }
        this.g = 0;
        this.i = 0;
        b(str, i, i2);
    }

    public void y(char[] cArr, int i, int i2) {
        this.f28830b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.f28831k = null;
        if (this.f) {
            f();
        } else if (this.h == null) {
            this.h = d(i2);
        }
        this.g = 0;
        this.i = 0;
        c(cArr, i, i2);
    }

    public void z() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.f28830b = null;
        this.j = null;
        this.f28831k = null;
        if (this.f) {
            f();
        }
    }
}
