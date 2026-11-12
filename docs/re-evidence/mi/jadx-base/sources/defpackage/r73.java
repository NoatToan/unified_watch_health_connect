package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r73 f32276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a> f32277b;
    public final int c;
    public boolean d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32278k;
    public String[] l;
    public int m;
    public int n;
    public transient boolean o;
    public boolean p;

    public r73(int i, boolean z, int i2, boolean z2) {
        this.f32276a = null;
        this.c = i2;
        this.d = z;
        this.e = z2;
        int i3 = 16;
        if (i < 16) {
            i = i3;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.f32277b = new AtomicReference<>(a.a(i));
    }

    public static r73 A() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return B((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static r73 B(int i) {
        return new r73(64, true, i, true);
    }

    public static int c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    public String C(int i) {
        int iB = b(w(i));
        int[] iArr = this.f;
        int i2 = iArr[iB + 3];
        if (i2 == 1) {
            if (iArr[iB] == i) {
                return this.l[iB >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.h + ((iB >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.l[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return e(iB, i);
    }

    public String D(int i, int i2) {
        int iB = b(x(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[iB + 3];
        if (i3 == 2) {
            if (i == iArr[iB] && i2 == iArr[iB + 1]) {
                return this.l[iB >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((iB >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return f(iB, i, i2);
    }

    public String E(int i, int i2, int i3) {
        int iB = b(y(i, i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[iB + 3];
        if (i4 == 3) {
            if (i == iArr[iB] && iArr[iB + 1] == i2 && iArr[iB + 2] == i3) {
                return this.l[iB >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((iB >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return g(iB, i, i2, i3);
    }

    public String F(int[] iArr, int i) {
        if (i < 4) {
            if (i == 1) {
                return C(iArr[0]);
            }
            if (i != 2) {
                return i != 3 ? "" : E(iArr[0], iArr[1], iArr[2]);
            }
            return D(iArr[0], iArr[1]);
        }
        int iZ = z(iArr, i);
        int iB = b(iZ);
        int[] iArr2 = this.f;
        int i2 = iArr2[iB + 3];
        if (iZ == iArr2[iB] && i2 == i && k(iArr, i, iArr2[iB + 1])) {
            return this.l[iB >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.h + ((iB >> 3) << 2);
        return (iZ == iArr2[i3] && iArr2[i3 + 3] == i && k(iArr, i, iArr2[i3 + 1])) ? this.l[i3 >> 2] : h(iB, iZ, iArr, i);
    }

    public r73 G(int i) {
        return new r73(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this.c, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), this.f32277b.get());
    }

    public boolean H() {
        return !this.p;
    }

    public final void I(a aVar) {
        int i = aVar.f32280b;
        a aVar2 = this.f32277b.get();
        if (i == aVar2.f32280b) {
            return;
        }
        if (i > 6000) {
            aVar = a.a(64);
        }
        d8i.a(this.f32277b, aVar2, aVar);
    }

    public final void J(boolean z) {
        this.f32278k = 0;
        this.m = j();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    public int K() {
        int i = this.h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public final void L() {
        this.o = false;
        this.p = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i = this.g;
        int i2 = this.f32278k;
        int i3 = i + i;
        int i4 = this.m;
        if (i3 > 65536) {
            J(true);
            return;
        }
        this.f = new int[iArr.length + (i << 3)];
        this.g = i3;
        int i5 = i3 << 2;
        this.h = i5;
        this.i = i5 + (i5 >> 1);
        this.j = c(i3);
        this.l = new String[strArr.length << 1];
        J(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    v(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    v(str, iArr2, 2);
                } else if (i8 != 3) {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    v(str, iArr2, i8);
                } else {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    v(str, iArr2, 3);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    public void M() {
        if (this.f32276a == null || !H()) {
            return;
        }
        this.f32276a.I(new a(this));
        this.p = true;
    }

    public int N() {
        int i = this.i;
        int i2 = 0;
        for (int i3 = this.h + 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int O() {
        return (this.m - j()) >> 2;
    }

    public int P() {
        int i = this.i + 3;
        int i2 = this.g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    public int Q() {
        int i = this.g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public final int a(int[] iArr, int i) {
        int i2 = this.n;
        int i3 = i2 + i;
        int[] iArr2 = this.f;
        if (i3 > iArr2.length) {
            this.f = Arrays.copyOf(this.f, this.f.length + Math.max(i3 - iArr2.length, Math.min(4096, this.g)));
        }
        System.arraycopy(iArr, 0, this.f, i2, i);
        this.n += i;
        return i2;
    }

    public final int b(int i) {
        return (i & (this.g - 1)) << 2;
    }

    public final int d(int i) {
        int iB = b(i);
        int[] iArr = this.f;
        if (iArr[iB + 3] == 0) {
            return iB;
        }
        int i2 = this.h + ((iB >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.i;
        int i4 = this.j;
        int i5 = i3 + ((iB >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.m;
        int i8 = i7 + 4;
        this.m = i8;
        if (i8 >= (this.g << 3)) {
            if (this.e) {
                i();
            }
            this.o = true;
        }
        return i7;
    }

    public final String e(int i, int i2) {
        int i3 = this.i;
        int i4 = this.j;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f;
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            int i7 = iArr[i5 + 3];
            if (i2 == iArr[i5] && 1 == i7) {
                return this.l[i5 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
            i5 += 4;
        }
        for (int iJ = j(); iJ < this.m; iJ += 4) {
            if (i2 == iArr[iJ] && 1 == iArr[iJ + 3]) {
                return this.l[iJ >> 2];
            }
        }
        return null;
    }

    public final String f(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i2 == iArr[i6] && i3 == iArr[i6 + 1] && 2 == i8) {
                return this.l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int iJ = j(); iJ < this.m; iJ += 4) {
            if (i2 == iArr[iJ] && i3 == iArr[iJ + 1] && 2 == iArr[iJ + 3]) {
                return this.l[iJ >> 2];
            }
        }
        return null;
    }

    public final String g(int i, int i2, int i3, int i4) {
        int i5 = this.i;
        int i6 = this.j;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && i4 == iArr[i7 + 2] && 3 == i9) {
                return this.l[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int iJ = j(); iJ < this.m; iJ += 4) {
            if (i2 == iArr[iJ] && i3 == iArr[iJ + 1] && i4 == iArr[iJ + 2] && 3 == iArr[iJ + 3]) {
                return this.l[iJ >> 2];
            }
        }
        return null;
    }

    public final String h(int i, int i2, int[] iArr, int i3) {
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr2[i6 + 3];
            if (i2 == iArr2[i6] && i3 == i8 && k(iArr, i3, iArr2[i6 + 1])) {
                return this.l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int iJ = j(); iJ < this.m; iJ += 4) {
            if (i2 == iArr2[iJ] && i3 == iArr2[iJ + 3] && k(iArr, i3, iArr2[iJ + 1])) {
                return this.l[iJ >> 2];
            }
        }
        return null;
    }

    public void i() {
        if (this.g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f32278k + " entries, hash area of " + this.g + " slots is now full (all " + (this.g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public final int j() {
        int i = this.g;
        return (i << 3) - i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    public final boolean k(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr2 = this.f;
        switch (i) {
            case 4:
                i3 = 0;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                return iArr[i9] != iArr2[i10] && iArr[i3 + 3] == iArr2[i2 + 3];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                i13 = i2 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 8:
                int i14 = i2 + 1;
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i6 = 1;
                i2 = i14;
                i5 = i6 + 1;
                i13 = i2 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            default:
                return l(iArr, i, i2);
        }
    }

    public final boolean l(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (iArr[i3] != this.f[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    public final void m() {
        if (this.f32278k > (this.g >> 1)) {
            int iJ = (this.m - j()) >> 2;
            int i = this.f32278k;
            if (iJ > ((i + 1) >> 7) || i > ((double) this.g) * 0.8d) {
                this.o = true;
            }
        }
    }

    public final void n() {
        if (this.p) {
            int[] iArr = this.f;
            this.f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.p = false;
            m();
        }
        if (this.o) {
            L();
        }
    }

    public String toString() {
        int iK = K();
        int iN = N();
        int iP = P();
        int iO = O();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", r73.class.getName(), Integer.valueOf(this.f32278k), Integer.valueOf(this.g), Integer.valueOf(iK), Integer.valueOf(iN), Integer.valueOf(iP), Integer.valueOf(iO), Integer.valueOf(iK + iN + iP + iO), Integer.valueOf(Q()));
    }

    public String v(String str, int[] iArr, int i) {
        int iD;
        n();
        if (this.d) {
            str = InternCache.instance.intern(str);
        }
        if (i == 1) {
            iD = d(w(iArr[0]));
            int[] iArr2 = this.f;
            iArr2[iD] = iArr[0];
            iArr2[iD + 3] = 1;
        } else if (i == 2) {
            iD = d(x(iArr[0], iArr[1]));
            int[] iArr3 = this.f;
            iArr3[iD] = iArr[0];
            iArr3[iD + 1] = iArr[1];
            iArr3[iD + 3] = 2;
        } else if (i != 3) {
            int iZ = z(iArr, i);
            iD = d(iZ);
            this.f[iD] = iZ;
            int iA = a(iArr, i);
            int[] iArr4 = this.f;
            iArr4[iD + 1] = iA;
            iArr4[iD + 3] = i;
        } else {
            int iD2 = d(y(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f;
            iArr5[iD2] = iArr[0];
            iArr5[iD2 + 1] = iArr[1];
            iArr5[iD2 + 2] = iArr[2];
            iArr5[iD2 + 3] = 3;
            iD = iD2;
        }
        this.l[iD >> 2] = str;
        this.f32278k++;
        m();
        return str;
    }

    public int w(int i) {
        int i2 = i ^ this.c;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    public int x(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.c;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public int y(int i, int i2, int i3) {
        int i4 = i ^ this.c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public int z(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.c;
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

    public r73(r73 r73Var, boolean z, int i, boolean z2, a aVar) {
        this.f32276a = r73Var;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f32277b = null;
        this.f32278k = aVar.f32280b;
        int i2 = aVar.f32279a;
        this.g = i2;
        int i3 = i2 << 2;
        this.h = i3;
        this.i = i3 + (i3 >> 1);
        this.j = aVar.c;
        this.f = aVar.d;
        this.l = aVar.e;
        this.m = aVar.f;
        this.n = aVar.g;
        this.o = false;
        this.p = true;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32280b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f32279a = i;
            this.f32280b = i2;
            this.c = i3;
            this.d = iArr;
            this.e = strArr;
            this.f = i4;
            this.g = i5;
        }

        public static a a(int i) {
            int i2 = i << 3;
            return new a(i, 0, r73.c(i), new int[i2], new String[i << 1], i2 - i, i2);
        }

        public a(r73 r73Var) {
            this.f32279a = r73Var.g;
            this.f32280b = r73Var.f32278k;
            this.c = r73Var.j;
            this.d = r73Var.f;
            this.e = r73Var.l;
            this.f = r73Var.m;
            this.g = r73Var.n;
        }
    }
}
