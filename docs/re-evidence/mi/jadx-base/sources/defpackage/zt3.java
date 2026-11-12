package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt3 f41648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f41649b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public a[] g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41650k;
    public boolean l;
    public BitSet m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f41652b;
        public final int c;

        public a(String str, a aVar) {
            this.f41651a = str;
            this.f41652b = aVar;
            this.c = aVar != null ? 1 + aVar.c : 1;
        }

        public String a(char[] cArr, int i, int i2) {
            if (this.f41651a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f41651a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f41651a;
                }
            }
            return null;
        }
    }

    public zt3(int i) {
        this.f41648a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.f41650k = 0;
        this.f41649b = new AtomicReference<>(b.a(64));
    }

    public static int e(int i) {
        return i - (i >> 2);
    }

    public static zt3 m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return n((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static zt3 n(int i) {
        return new zt3(i);
    }

    public final String a(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.l) {
            l();
            this.l = false;
        } else if (this.h >= this.i) {
            t();
            i4 = d(k(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.d)) {
            str = InternCache.instance.intern(str);
        }
        this.h++;
        String[] strArr = this.f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            a aVar = new a(str, this.g[i5]);
            int i6 = aVar.c;
            if (i6 > 100) {
                c(i5, aVar);
            } else {
                this.g[i5] = aVar;
                this.f41650k = Math.max(i6, this.f41650k);
            }
        }
        return str;
    }

    public final String b(char[] cArr, int i, int i2, a aVar) {
        while (aVar != null) {
            String strA = aVar.a(cArr, i, i2);
            if (strA != null) {
                return strA;
            }
            aVar = aVar.f41652b;
        }
        return null;
    }

    public final void c(int i, a aVar) {
        BitSet bitSet = this.m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.d)) {
                v(100);
            }
            this.e = false;
        } else {
            this.m.set(i);
        }
        this.f[i + i] = aVar.f41651a;
        this.g[i] = null;
        this.h -= aVar.c;
        this.f41650k = -1;
    }

    public int d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.j;
    }

    public int j(String str) {
        int length = str.length();
        int iCharAt = this.c;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int k(char[] cArr, int i, int i2) {
        int i3 = this.c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final void l() {
        String[] strArr = this.f;
        this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.g;
        this.g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public String o(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.e) {
            return new String(cArr, i, i2);
        }
        int iD = d(i3);
        String str = this.f[iD];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            a aVar = this.g[iD >> 1];
            if (aVar != null) {
                String strA = aVar.a(cArr, i, i2);
                if (strA != null) {
                    return strA;
                }
                String strB = b(cArr, i, i2, aVar.f41652b);
                if (strB != null) {
                    return strB;
                }
            }
        }
        return a(cArr, i, i2, i3, iD);
    }

    public int p() {
        return this.c;
    }

    public zt3 q(int i) {
        return new zt3(this, i, this.c, this.f41649b.get());
    }

    public boolean r() {
        return !this.l;
    }

    public final void s(b bVar) {
        int i = bVar.f41653a;
        b bVar2 = this.f41649b.get();
        if (i == bVar2.f41653a) {
            return;
        }
        if (i > 12000) {
            bVar = b.a(64);
        }
        d8i.a(this.f41649b, bVar2, bVar);
    }

    public final void t() {
        String[] strArr = this.f;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.h = 0;
            this.e = false;
            this.f = new String[64];
            this.g = new a[32];
            this.j = 63;
            this.l = false;
            return;
        }
        a[] aVarArr = this.g;
        this.f = new String[i];
        this.g = new a[i >> 1];
        this.j = i - 1;
        this.i = e(i);
        int i2 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int iD = d(j(str));
                String[] strArr2 = this.f;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i3 = iD >> 1;
                    a aVar = new a(str, this.g[i3]);
                    this.g[i3] = aVar;
                    iMax = Math.max(iMax, aVar.c);
                }
            }
        }
        int i4 = length >> 1;
        for (int i5 = 0; i5 < i4; i5++) {
            for (a aVar2 = aVarArr[i5]; aVar2 != null; aVar2 = aVar2.f41652b) {
                i2++;
                String str2 = aVar2.f41651a;
                int iD2 = d(j(str2));
                String[] strArr3 = this.f;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i6 = iD2 >> 1;
                    a aVar3 = new a(str2, this.g[i6]);
                    this.g[i6] = aVar3;
                    iMax = Math.max(iMax, aVar3.c);
                }
            }
        }
        this.f41650k = iMax;
        this.m = null;
        if (i2 != this.h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.h), Integer.valueOf(i2)));
        }
    }

    public void u() {
        zt3 zt3Var;
        if (r() && (zt3Var = this.f41648a) != null && this.e) {
            zt3Var.s(new b(this));
            this.l = true;
        }
    }

    public void v(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41654b;
        public final String[] c;
        public final a[] d;

        public b(int i, int i2, String[] strArr, a[] aVarArr) {
            this.f41653a = i;
            this.f41654b = i2;
            this.c = strArr;
            this.d = aVarArr;
        }

        public static b a(int i) {
            return new b(0, 0, new String[i], new a[i >> 1]);
        }

        public b(zt3 zt3Var) {
            this.f41653a = zt3Var.h;
            this.f41654b = zt3Var.f41650k;
            this.c = zt3Var.f;
            this.d = zt3Var.g;
        }
    }

    public zt3(zt3 zt3Var, int i, int i2, b bVar) {
        this.f41648a = zt3Var;
        this.c = i2;
        this.f41649b = null;
        this.d = i;
        this.e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = bVar.c;
        this.f = strArr;
        this.g = bVar.d;
        this.h = bVar.f41653a;
        this.f41650k = bVar.f41654b;
        int length = strArr.length;
        this.i = e(length);
        this.j = length - 1;
        this.l = true;
    }
}
