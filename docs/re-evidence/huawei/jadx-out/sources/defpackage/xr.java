package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public final class xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f53282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f53283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f53284c;
    protected boolean d;
    protected c[] e;
    protected int f;
    protected BitSet g;
    protected final int h;
    protected int i;
    protected final xr j;
    protected int k;
    protected String[] l;
    protected final AtomicReference<a> o;

    private static int c(int i) {
        return i - (i >> 2);
    }

    private xr(int i) {
        this.j = null;
        this.h = i;
        this.f53282a = true;
        this.f53283b = -1;
        this.d = false;
        this.i = 0;
        this.o = new AtomicReference<>(a.c(64));
    }

    private xr(xr xrVar, int i, int i2, a aVar) {
        this.j = xrVar;
        this.h = i2;
        this.o = null;
        this.f53283b = i;
        this.f53282a = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        this.l = aVar.f53287c;
        this.e = aVar.f53286b;
        this.f = aVar.d;
        this.i = aVar.f53285a;
        int length = this.l.length;
        this.k = c(length);
        this.f53284c = length - 1;
        this.d = true;
    }

    public static xr a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return e((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static xr e(int i) {
        return new xr(i);
    }

    public xr a(int i) {
        return new xr(this, i, this.h, this.o.get());
    }

    public void d() {
        xr xrVar;
        if (b() && (xrVar = this.j) != null && this.f53282a) {
            xrVar.b(new a(this));
            this.d = true;
        }
    }

    private void b(a aVar) {
        int i = aVar.d;
        a aVar2 = this.o.get();
        if (i == aVar2.d) {
            return;
        }
        if (i > 12000) {
            aVar = a.c(64);
        }
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.o, aVar2, aVar);
    }

    public boolean b() {
        return !this.d;
    }

    public int e() {
        return this.h;
    }

    public String c(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f53282a) {
            return new String(cArr, i, i2);
        }
        int iD = d(i3);
        String str = this.l[iD];
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
            c cVar = this.e[iD >> 1];
            if (cVar != null) {
                String strB = cVar.b(cArr, i, i2);
                if (strB != null) {
                    return strB;
                }
                String strD = d(cArr, i, i2, cVar.f53288b);
                if (strD != null) {
                    return strD;
                }
            }
        }
        return e(cArr, i, i2, i3, iD);
    }

    private String d(char[] cArr, int i, int i2, c cVar) {
        while (cVar != null) {
            String strB = cVar.b(cArr, i, i2);
            if (strB != null) {
                return strB;
            }
            cVar = cVar.f53288b;
        }
        return null;
    }

    private String e(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.d) {
            c();
            this.d = false;
        } else if (this.f >= this.k) {
            f();
            i4 = d(a(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.f53283b)) {
            str = xv.e.c(str);
        }
        this.f++;
        String[] strArr = this.l;
        if (strArr[i4] == null) {
            strArr[i4] = str;
            return str;
        }
        int i5 = i4 >> 1;
        c cVar = new c(str, this.e[i5]);
        int i6 = cVar.e;
        if (i6 > 100) {
            e(i5, cVar, i4);
            return str;
        }
        this.e[i5] = cVar;
        this.i = Math.max(i6, this.i);
        return str;
    }

    private void e(int i, c cVar, int i2) {
        BitSet bitSet = this.g;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.g = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.f53283b)) {
                b(100);
            }
            this.f53282a = false;
        } else {
            this.g.set(i);
        }
        this.l[i2] = cVar.f53289c;
        this.e[i] = null;
        this.f -= cVar.e;
        this.i = -1;
    }

    public int d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.f53284c;
    }

    public int a(char[] cArr, int i, int i2) {
        int i3 = this.h;
        for (int i4 = i; i4 < i2 + i; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int c(String str) {
        int length = str.length();
        int iCharAt = this.h;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    private void c() {
        String[] strArr = this.l;
        this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
        c[] cVarArr = this.e;
        this.e = (c[]) Arrays.copyOf(cVarArr, cVarArr.length);
    }

    private void f() {
        String[] strArr = this.l;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.f = 0;
            this.f53282a = false;
            this.l = new String[64];
            this.e = new c[32];
            this.f53284c = 63;
            this.d = false;
            return;
        }
        c[] cVarArr = this.e;
        this.l = new String[i];
        this.e = new c[i >> 1];
        this.f53284c = i - 1;
        this.k = c(i);
        int iMax = 0;
        int i2 = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int iD = d(c(str));
                String[] strArr2 = this.l;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i3 = iD >> 1;
                    c cVar = new c(str, this.e[i3]);
                    this.e[i3] = cVar;
                    iMax = Math.max(iMax, cVar.e);
                }
            }
        }
        for (int i4 = 0; i4 < (length >> 1); i4++) {
            for (c cVar2 = cVarArr[i4]; cVar2 != null; cVar2 = cVar2.f53288b) {
                i2++;
                String str2 = cVar2.f53289c;
                int iD2 = d(c(str2));
                String[] strArr3 = this.l;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i5 = iD2 >> 1;
                    c cVar3 = new c(str2, this.e[i5]);
                    this.e[i5] = cVar3;
                    iMax = Math.max(iMax, cVar3.e);
                }
            }
        }
        this.i = iMax;
        this.g = null;
        int i6 = this.f;
        if (i2 != i6) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i6), Integer.valueOf(i2)));
        }
    }

    protected void b(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f53288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f53289c;
        public final int e;

        public c(String str, c cVar) {
            this.f53289c = str;
            this.f53288b = cVar;
            this.e = cVar != null ? 1 + cVar.e : 1;
        }

        public String b(char[] cArr, int i, int i2) {
            if (this.f53289c.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f53289c.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f53289c;
                }
            }
            return null;
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f53285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f53286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String[] f53287c;
        final int d;

        public a(int i, int i2, String[] strArr, c[] cVarArr) {
            this.d = i;
            this.f53285a = i2;
            this.f53287c = strArr;
            this.f53286b = cVarArr;
        }

        public a(xr xrVar) {
            this.d = xrVar.f;
            this.f53285a = xrVar.i;
            this.f53287c = xrVar.l;
            this.f53286b = xrVar.e;
        }

        public static a c(int i) {
            return new a(0, 0, new String[i], new c[i >> 1]);
        }
    }
}
