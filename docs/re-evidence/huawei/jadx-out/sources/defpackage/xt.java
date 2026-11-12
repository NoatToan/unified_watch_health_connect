package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public final class xt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f53293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f53294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f53295c;
    protected int d;
    protected int e;
    protected String[] f;
    protected boolean g;
    protected int h;
    protected final xt i;
    protected int j;
    protected final int k;
    protected final AtomicReference<b> l;
    protected int m;
    protected int n;
    protected int o;

    static int c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    private xt(int i, boolean z, int i2, boolean z2) {
        this.i = null;
        this.k = i2;
        this.g = z;
        this.f53293a = z2;
        int i3 = 16;
        if (i < 16) {
            i = i3;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.l = new AtomicReference<>(b.a(i));
    }

    private xt(xt xtVar, boolean z, int i, boolean z2, b bVar) {
        this.i = xtVar;
        this.k = i;
        this.g = z;
        this.f53293a = z2;
        this.l = null;
        this.d = bVar.f53297b;
        int i2 = bVar.f53298c;
        this.e = i2;
        int i3 = i2 << 2;
        this.j = i3;
        this.o = i3 + (i3 >> 1);
        this.n = bVar.f;
        this.f53295c = bVar.e;
        this.f = bVar.d;
        this.m = bVar.i;
        this.h = bVar.f53296a;
        this.f53294b = true;
    }

    public static xt e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return e((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static xt e(int i) {
        return new xt(64, true, i, true);
    }

    public xt d(int i) {
        return new xt(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this.k, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this.l.get());
    }

    public void d() {
        if (this.i == null || !b()) {
            return;
        }
        this.i.b(new b(this));
        this.f53294b = true;
    }

    private void b(b bVar) {
        int i = bVar.f53297b;
        b bVar2 = this.l.get();
        if (i == bVar2.f53297b) {
            return;
        }
        if (i > 6000) {
            bVar = b.a(64);
        }
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.l, bVar2, bVar);
    }

    public boolean b() {
        return !this.f53294b;
    }

    public int c() {
        int i = this.j;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f53295c[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int i() {
        int i = this.o;
        int i2 = 0;
        for (int i3 = this.j + 3; i3 < i; i3 += 4) {
            if (this.f53295c[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int j() {
        int i = this.o + 3;
        int i2 = this.e;
        int i3 = 0;
        for (int i4 = i; i4 < i2 + i; i4 += 4) {
            if (this.f53295c[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int g() {
        return (this.m - l()) >> 2;
    }

    public int h() {
        int i = this.e;
        int i2 = 0;
        for (int i3 = 3; i3 < (i << 3); i3 += 4) {
            if (this.f53295c[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int iC = c();
        int i = i();
        int iJ = j();
        int iG = g();
        int iH = h();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", getClass().getName(), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(iC), Integer.valueOf(i), Integer.valueOf(iJ), Integer.valueOf(iG), Integer.valueOf(iC + i + iJ + iG), Integer.valueOf(iH));
    }

    public String b(int i) {
        int iJ = j(a(i));
        int[] iArr = this.f53295c;
        int i2 = iArr[iJ + 3];
        if (i2 == 1) {
            if (iArr[iJ] == i) {
                return this.f[iJ >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.j + ((iJ >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.f[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return c(iJ, i);
    }

    public String d(int i, int i2) {
        int iJ = j(e(i, i2));
        int[] iArr = this.f53295c;
        int i3 = iArr[iJ + 3];
        if (i3 == 2) {
            if (i == iArr[iJ] && i2 == iArr[iJ + 1]) {
                return this.f[iJ >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.j + ((iJ >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.f[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return b(iJ, i, i2);
    }

    public String e(int i, int i2, int i3) {
        int iJ = j(a(i, i2, i3));
        int[] iArr = this.f53295c;
        int i4 = iArr[iJ + 3];
        if (i4 == 3) {
            if (i == iArr[iJ] && iArr[iJ + 1] == i2 && iArr[iJ + 2] == i3) {
                return this.f[iJ >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.j + ((iJ >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.f[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return b(iJ, i, i2, i3);
    }

    public String b(int[] iArr, int i) {
        if (i < 4) {
            if (i == 1) {
                return b(iArr[0]);
            }
            if (i == 2) {
                return d(iArr[0], iArr[1]);
            }
            if (i == 3) {
                return e(iArr[0], iArr[1], iArr[2]);
            }
            return "";
        }
        int iA = a(iArr, i);
        int iJ = j(iA);
        int[] iArr2 = this.f53295c;
        int i2 = iArr2[iJ + 3];
        if (iA == iArr2[iJ] && i2 == i && d(iArr, i, iArr2[iJ + 1])) {
            return this.f[iJ >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.j + ((iJ >> 3) << 2);
        int i4 = iArr2[i3 + 3];
        if (iA == iArr2[i3] && i4 == i && d(iArr, i, iArr2[i3 + 1])) {
            return this.f[i3 >> 2];
        }
        return d(iJ, iA, iArr, i);
    }

    private final int j(int i) {
        return (i & (this.e - 1)) << 2;
    }

    private String c(int i, int i2) {
        int i3 = this.o;
        int i4 = this.n;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f53295c;
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            int i7 = iArr[i6 + 3];
            if (i2 == iArr[i6] && 1 == i7) {
                return this.f[i6 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
        }
        for (int iL = l(); iL < this.m; iL += 4) {
            if (i2 == iArr[iL] && 1 == iArr[iL + 3]) {
                return this.f[iL >> 2];
            }
        }
        return null;
    }

    private String b(int i, int i2, int i3) {
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f53295c;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && 2 == i8) {
                return this.f[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int iL = l(); iL < this.m; iL += 4) {
            if (i2 == iArr[iL] && i3 == iArr[iL + 1] && 2 == iArr[iL + 3]) {
                return this.f[iL >> 2];
            }
        }
        return null;
    }

    private String b(int i, int i2, int i3, int i4) {
        int i5 = this.o;
        int i6 = this.n;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f53295c;
        for (int i8 = i7; i8 < (1 << i6) + i7; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i2 == iArr[i8] && i3 == iArr[i8 + 1] && i4 == iArr[i8 + 2] && 3 == i9) {
                return this.f[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int iL = l(); iL < this.m; iL += 4) {
            if (i2 == iArr[iL] && i3 == iArr[iL + 1] && i4 == iArr[iL + 2] && 3 == iArr[iL + 3]) {
                return this.f[iL >> 2];
            }
        }
        return null;
    }

    private String d(int i, int i2, int[] iArr, int i3) {
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f53295c;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr2[i7 + 3];
            if (i2 == iArr2[i7] && i3 == i8 && d(iArr, i3, iArr2[i7 + 1])) {
                return this.f[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int iL = l(); iL < this.m; iL += 4) {
            if (i2 == iArr2[iL] && i3 == iArr2[iL + 3] && d(iArr, i3, iArr2[iL + 1])) {
                return this.f[iL >> 2];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    private boolean d(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr2 = this.f53295c;
        switch (i) {
            case 4:
                i3 = 0;
                return iArr[i3] != iArr2[i2] && iArr[i3 + 1] == iArr2[i2 + 1] && iArr[i3 + 2] == iArr2[i2 + 2] && iArr[i3 + 3] == iArr2[i2 + 3];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2++;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i3 = i4 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2++;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i4 = i5 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i3 = i4 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2++;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
            case 8:
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i6 = 1;
                i5 = i6 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i4 = i5 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i3 = i4 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2++;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
            default:
                return a(iArr, i, i2);
        }
    }

    private boolean a(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (iArr[i3] != this.f53295c[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i2++;
            i3 = i4;
        }
    }

    public String b(String str, int[] iArr, int i) {
        int iF;
        m();
        if (this.g) {
            str = xv.e.c(str);
        }
        if (i == 1) {
            iF = f(a(iArr[0]));
            int[] iArr2 = this.f53295c;
            iArr2[iF] = iArr[0];
            iArr2[iF + 3] = 1;
        } else if (i == 2) {
            iF = f(e(iArr[0], iArr[1]));
            int[] iArr3 = this.f53295c;
            iArr3[iF] = iArr[0];
            iArr3[iF + 1] = iArr[1];
            iArr3[iF + 3] = 2;
        } else if (i == 3) {
            int iF2 = f(a(iArr[0], iArr[1], iArr[2]));
            int[] iArr4 = this.f53295c;
            iArr4[iF2] = iArr[0];
            iArr4[iF2 + 1] = iArr[1];
            iArr4[iF2 + 2] = iArr[2];
            iArr4[iF2 + 3] = 3;
            iF = iF2;
        } else {
            int iA = a(iArr, i);
            iF = f(iA);
            this.f53295c[iF] = iA;
            int iD = d(iArr, i);
            int[] iArr5 = this.f53295c;
            iArr5[iF + 1] = iD;
            iArr5[iF + 3] = i;
        }
        this.f[iF >> 2] = str;
        this.d++;
        return str;
    }

    private void m() {
        if (this.f53294b) {
            int[] iArr = this.f53295c;
            this.f53295c = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f;
            this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f53294b = false;
        }
    }

    private int f(int i) {
        int iJ = j(i);
        int[] iArr = this.f53295c;
        if (iArr[iJ + 3] == 0) {
            return iJ;
        }
        if (f()) {
            return i(i);
        }
        int i2 = this.j + ((iJ >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.o;
        int i4 = this.n;
        int i5 = i3 + ((iJ >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.m;
        int i8 = i7 + 4;
        this.m = i8;
        if (i8 < (this.e << 3)) {
            return i7;
        }
        if (this.f53293a) {
            a();
        }
        return i(i);
    }

    private int i(int i) {
        o();
        int iJ = j(i);
        int[] iArr = this.f53295c;
        if (iArr[iJ + 3] == 0) {
            return iJ;
        }
        int i2 = this.j + ((iJ >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.o;
        int i4 = this.n;
        int i5 = i3 + ((iJ >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.m;
        this.m = i7 + 4;
        return i7;
    }

    private boolean f() {
        if (this.d <= (this.e >> 1)) {
            return false;
        }
        int i = this.m;
        int iL = l();
        int i2 = this.d;
        return ((i - iL) >> 2) > ((i2 + 1) >> 7) || ((double) i2) > ((double) this.e) * 0.8d;
    }

    private int d(int[] iArr, int i) {
        int i2 = this.h;
        int i3 = i2 + i;
        int[] iArr2 = this.f53295c;
        if (i3 > iArr2.length) {
            int length = iArr2.length;
            this.f53295c = Arrays.copyOf(this.f53295c, this.f53295c.length + Math.max(i3 - length, Math.min(4096, this.e)));
        }
        System.arraycopy(iArr, 0, this.f53295c, i2, i);
        this.h += i;
        return i2;
    }

    public int a(int i) {
        int i2 = i ^ this.k;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    public int e(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.k;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public int a(int i, int i2, int i3) {
        int i4 = i ^ this.k;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public int a(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.k;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    private void o() {
        this.f53294b = false;
        int[] iArr = this.f53295c;
        String[] strArr = this.f;
        int i = this.e;
        int i2 = this.d;
        int i3 = i + i;
        int i4 = this.m;
        if (i3 > 65536) {
            a(true);
            return;
        }
        this.f53295c = new int[iArr.length + (i << 3)];
        this.e = i3;
        int i5 = i3 << 2;
        this.j = i5;
        this.o = i5 + (i5 >> 1);
        this.n = c(i3);
        this.f = new String[strArr.length << 1];
        a(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    b(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    b(str, iArr2, 2);
                } else if (i8 == 3) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    b(str, iArr2, 3);
                } else {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    b(str, iArr2, i8);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    private void a(boolean z) {
        this.d = 0;
        this.m = l();
        this.h = this.e << 3;
        if (z) {
            Arrays.fill(this.f53295c, 0);
            Arrays.fill(this.f, (Object) null);
        }
    }

    private final int l() {
        int i = this.e;
        return (i << 3) - i;
    }

    protected void a() {
        if (this.e <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.d + " entries, hash area of " + this.e + " slots is now full (all " + (this.e >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53298c;
        public final String[] d;
        public final int[] e;
        public final int f;
        public final int i;

        public b(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f53298c = i;
            this.f53297b = i2;
            this.f = i3;
            this.e = iArr;
            this.d = strArr;
            this.i = i4;
            this.f53296a = i5;
        }

        public b(xt xtVar) {
            this.f53298c = xtVar.e;
            this.f53297b = xtVar.d;
            this.f = xtVar.n;
            this.e = xtVar.f53295c;
            this.d = xtVar.f;
            this.i = xtVar.m;
            this.f53296a = xtVar.h;
        }

        public static b a(int i) {
            int i2 = i << 3;
            return new b(i, 0, xt.c(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }
}
