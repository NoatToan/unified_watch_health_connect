package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char[] f53337a = new char[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53339c;
    private final xw d;
    private char[] e;
    private char[] f;
    private int g;
    private String h;
    private int i;
    private char[] j;
    private int k;
    private ArrayList<char[]> m;

    public yh(xw xwVar) {
        this.d = xwVar;
    }

    protected yh(xw xwVar, char[] cArr) {
        this.d = xwVar;
        this.e = cArr;
        this.f53338b = cArr.length;
        this.i = -1;
    }

    public static yh e(char[] cArr) {
        return new yh(null, cArr);
    }

    public void l() {
        char[] cArr;
        this.i = -1;
        this.f53338b = 0;
        this.g = 0;
        this.f = null;
        this.j = null;
        if (this.f53339c) {
            q();
        }
        xw xwVar = this.d;
        if (xwVar == null || (cArr = this.e) == null) {
            return;
        }
        this.e = null;
        xwVar.e(2, cArr);
    }

    public void b(char[] cArr, int i, int i2) {
        this.h = null;
        this.j = null;
        this.f = cArr;
        this.i = i;
        this.g = i2;
        if (this.f53339c) {
            q();
        }
    }

    public void a(char[] cArr, int i, int i2) {
        this.f = null;
        this.i = -1;
        this.g = 0;
        this.h = null;
        this.j = null;
        if (this.f53339c) {
            q();
        } else if (this.e == null) {
            this.e = a(i2);
        }
        this.k = 0;
        this.f53338b = 0;
        c(cArr, i, i2);
    }

    public void d(String str, int i, int i2) {
        this.f = null;
        this.i = -1;
        this.g = 0;
        this.h = null;
        this.j = null;
        if (this.f53339c) {
            q();
        } else if (this.e == null) {
            this.e = a(i2);
        }
        this.k = 0;
        this.f53338b = 0;
        e(str, i, i2);
    }

    public void d(String str) {
        this.f = null;
        this.i = -1;
        this.g = 0;
        this.h = str;
        this.j = null;
        if (this.f53339c) {
            q();
        }
        this.f53338b = 0;
    }

    public char[] g() {
        return this.e;
    }

    private char[] a(int i) {
        xw xwVar = this.d;
        if (xwVar != null) {
            return xwVar.e(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    private void q() {
        this.f53339c = false;
        this.m.clear();
        this.k = 0;
        this.f53338b = 0;
    }

    public int k() {
        if (this.i >= 0) {
            return this.g;
        }
        char[] cArr = this.j;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.h;
        if (str != null) {
            return str.length();
        }
        return this.k + this.f53338b;
    }

    public int o() {
        int i = this.i;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public boolean n() {
        return this.i >= 0 || this.j != null || this.h == null;
    }

    public char[] m() {
        if (this.i >= 0) {
            return this.f;
        }
        char[] cArr = this.j;
        if (cArr != null) {
            return cArr;
        }
        String str = this.h;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.j = charArray;
            return charArray;
        }
        if (!this.f53339c) {
            char[] cArr2 = this.e;
            return cArr2 == null ? f53337a : cArr2;
        }
        return b();
    }

    public String d() {
        if (this.h == null) {
            char[] cArr = this.j;
            if (cArr != null) {
                this.h = new String(cArr);
            } else {
                int i = this.i;
                if (i >= 0) {
                    int i2 = this.g;
                    if (i2 < 1) {
                        this.h = "";
                        return "";
                    }
                    this.h = new String(this.f, i, i2);
                } else {
                    int i3 = this.k;
                    int i4 = this.f53338b;
                    if (i3 == 0) {
                        this.h = i4 != 0 ? new String(this.e, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.m;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.m.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.e, 0, this.f53338b);
                        this.h = sb.toString();
                    }
                }
            }
        }
        return this.h;
    }

    public char[] b() {
        char[] cArr = this.j;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrT = t();
        this.j = cArrT;
        return cArrT;
    }

    public BigDecimal c() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.j;
        if (cArr3 != null) {
            return xd.a(cArr3);
        }
        int i = this.i;
        if (i >= 0 && (cArr2 = this.f) != null) {
            return xd.a(cArr2, i, this.g);
        }
        if (this.k == 0 && (cArr = this.e) != null) {
            return xd.a(cArr, 0, this.f53338b);
        }
        return xd.a(b());
    }

    public double a() throws NumberFormatException {
        return xd.e(d());
    }

    public int d(boolean z) {
        char[] cArr;
        int i = this.i;
        if (i < 0 || (cArr = this.f) == null) {
            if (z) {
                return -xd.b(this.e, 1, this.f53338b - 1);
            }
            return xd.b(this.e, 0, this.f53338b);
        }
        if (z) {
            return -xd.b(cArr, i + 1, this.g - 1);
        }
        return xd.b(cArr, i, this.g);
    }

    public long a(boolean z) {
        char[] cArr;
        int i = this.i;
        if (i < 0 || (cArr = this.f) == null) {
            if (z) {
                return -xd.c(this.e, 1, this.f53338b - 1);
            }
            return xd.c(this.e, 0, this.f53338b);
        }
        if (z) {
            return -xd.c(cArr, i + 1, this.g - 1);
        }
        return xd.c(cArr, i, this.g);
    }

    public int a(Writer writer) throws IOException {
        int i;
        char[] cArr = this.j;
        if (cArr != null) {
            writer.write(cArr);
            return this.j.length;
        }
        String str = this.h;
        if (str != null) {
            writer.write(str);
            return this.h.length();
        }
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.g;
            if (i3 > 0) {
                writer.write(this.f, i2, i3);
            }
            return i3;
        }
        ArrayList<char[]> arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr2 = this.m.get(i4);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i += length;
            }
        } else {
            i = 0;
        }
        int i5 = this.f53338b;
        if (i5 <= 0) {
            return i;
        }
        writer.write(this.e, 0, i5);
        return i + i5;
    }

    public void c(char c2) {
        if (this.i >= 0) {
            h(16);
        }
        this.h = null;
        this.j = null;
        char[] cArr = this.e;
        if (this.f53338b >= cArr.length) {
            d(1);
            cArr = this.e;
        }
        int i = this.f53338b;
        this.f53338b = i + 1;
        cArr[i] = c2;
    }

    public void c(char[] cArr, int i, int i2) {
        if (this.i >= 0) {
            h(i2);
        }
        this.h = null;
        this.j = null;
        char[] cArr2 = this.e;
        int length = cArr2.length;
        int i3 = this.f53338b;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f53338b += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            d(i2);
            int iMin = Math.min(this.e.length, i2);
            System.arraycopy(cArr, i, this.e, 0, iMin);
            this.f53338b += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public void e(String str, int i, int i2) {
        if (this.i >= 0) {
            h(i2);
        }
        this.h = null;
        this.j = null;
        char[] cArr = this.e;
        int length = cArr.length;
        int i3 = this.f53338b;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f53338b += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            d(i2);
            int iMin = Math.min(this.e.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.e, 0);
            this.f53338b += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public char[] f() {
        if (this.i >= 0) {
            h(1);
        } else {
            char[] cArr = this.e;
            if (cArr == null) {
                this.e = a(0);
            } else if (this.f53338b >= cArr.length) {
                d(1);
            }
        }
        return this.e;
    }

    public char[] e() {
        this.i = -1;
        this.f53338b = 0;
        this.g = 0;
        this.f = null;
        this.h = null;
        this.j = null;
        if (this.f53339c) {
            q();
        }
        char[] cArr = this.e;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrA = a(0);
        this.e = cArrA;
        return cArrA;
    }

    public int j() {
        return this.f53338b;
    }

    public void e(int i) {
        this.f53338b = i;
    }

    public String c(int i) {
        this.f53338b = i;
        if (this.k > 0) {
            return d();
        }
        String str = i == 0 ? "" : new String(this.e, 0, i);
        this.h = str;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] h() {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        this.f53339c = true;
        this.m.add(this.e);
        int length = this.e.length;
        this.k += length;
        this.f53338b = 0;
        int i = length + (length >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = 65536;
            if (i > 65536) {
                i = i2;
            }
        }
        char[] cArrB = b(i);
        this.e = cArrB;
        return cArrB;
    }

    public char[] i() {
        char[] cArr = this.e;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        this.e = cArrCopyOf;
        return cArrCopyOf;
    }

    public String toString() {
        return d();
    }

    private void h(int i) {
        int i2 = this.g;
        this.g = 0;
        char[] cArr = this.f;
        this.f = null;
        int i3 = this.i;
        this.i = -1;
        int i4 = i + i2;
        char[] cArr2 = this.e;
        if (cArr2 == null || i4 > cArr2.length) {
            this.e = a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.e, 0, i2);
        }
        this.k = 0;
        this.f53338b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r0
      0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    private void d(int i) {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        char[] cArr = this.e;
        this.f53339c = true;
        this.m.add(cArr);
        this.k += cArr.length;
        this.f53338b = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = 65536;
            if (i2 > 65536) {
                i2 = i3;
            }
        }
        this.e = b(i2);
    }

    private char[] t() {
        int i;
        String str = this.h;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.g;
            if (i3 < 1) {
                return f53337a;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.f, i3);
            }
            return Arrays.copyOfRange(this.f, i2, i3 + i2);
        }
        int iK = k();
        if (iK < 1) {
            return f53337a;
        }
        char[] cArrB = b(iK);
        ArrayList<char[]> arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.m.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrB, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.e, 0, cArrB, i, this.f53338b);
        return cArrB;
    }

    private char[] b(int i) {
        return new char[i];
    }
}
