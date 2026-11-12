package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class b06 {
    public static final int[] g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3637b;
    public int c;
    public int d;
    public int e;
    public int f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3639b;

        public a(int i, int i2) {
            this.f3638a = i;
            this.f3639b = i2;
        }

        public int a() {
            return this.f3638a;
        }

        public int b() {
            return this.f3639b;
        }

        public atk c() {
            return new atk(a(), b());
        }

        public String toString() {
            return "<" + this.f3638a + ' ' + this.f3639b + Typography.greater;
        }
    }

    public b06(cp2 cp2Var) {
        this.f3636a = cp2Var;
    }

    public static float b(a aVar, a aVar2) {
        return q8f.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    public static float c(atk atkVar, atk atkVar2) {
        return q8f.a(atkVar.c(), atkVar.d(), atkVar2.c(), atkVar2.d());
    }

    public static atk[] d(atk[] atkVarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float fC = atkVarArr[0].c() - atkVarArr[2].c();
        float fD = atkVarArr[0].d() - atkVarArr[2].d();
        float fC2 = (atkVarArr[0].c() + atkVarArr[2].c()) / 2.0f;
        float fD2 = (atkVarArr[0].d() + atkVarArr[2].d()) / 2.0f;
        float f2 = fC * f;
        float f3 = fD * f;
        atk atkVar = new atk(fC2 + f2, fD2 + f3);
        atk atkVar2 = new atk(fC2 - f2, fD2 - f3);
        float fC3 = atkVarArr[1].c() - atkVarArr[3].c();
        float fD3 = atkVarArr[1].d() - atkVarArr[3].d();
        float fC4 = (atkVarArr[1].c() + atkVarArr[3].c()) / 2.0f;
        float fD4 = (atkVarArr[1].d() + atkVarArr[3].d()) / 2.0f;
        float f4 = fC3 * f;
        float f5 = f * fD3;
        return new atk[]{atkVar, new atk(fC4 + f4, fD4 + f5), atkVar2, new atk(fC4 - f4, fD4 - f5)};
    }

    public static int h(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new uak(cya.f14857k).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public it1 a(boolean z) throws NotFoundException {
        atk[] atkVarArrF = f(k());
        if (z) {
            atk atkVar = atkVarArrF[0];
            atkVarArrF[0] = atkVarArrF[2];
            atkVarArrF[2] = atkVar;
        }
        e(atkVarArrF);
        cp2 cp2Var = this.f3636a;
        int i = this.f;
        return new it1(q(cp2Var, atkVarArrF[i % 4], atkVarArrF[(i + 1) % 4], atkVarArrF[(i + 2) % 4], atkVarArrF[(i + 3) % 4]), l(atkVarArrF), this.f3637b, this.d, this.c);
    }

    public final void e(atk[] atkVarArr) throws NotFoundException {
        long j;
        long j2;
        if (!o(atkVarArr[0]) || !o(atkVarArr[1]) || !o(atkVarArr[2]) || !o(atkVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = this.e * 2;
        int[] iArr = {r(atkVarArr[0], atkVarArr[1], i), r(atkVarArr[1], atkVarArr[2], i), r(atkVarArr[2], atkVarArr[3], i), r(atkVarArr[3], atkVarArr[0], i)};
        this.f = m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f + i2) % 4];
            if (this.f3637b) {
                j = j3 << 7;
                j2 = (i3 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int iH = h(j3, this.f3637b);
        if (this.f3637b) {
            this.c = (iH >> 6) + 1;
            this.d = (iH & 63) + 1;
        } else {
            this.c = (iH >> 11) + 1;
            this.d = (iH & 2047) + 1;
        }
    }

    public final atk[] f(a aVar) throws NotFoundException {
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        boolean z = true;
        while (this.e < 9) {
            a aVarJ = j(aVar, z, 1, -1);
            a aVarJ2 = j(aVar2, z, 1, 1);
            a aVarJ3 = j(aVar3, z, -1, 1);
            a aVarJ4 = j(aVar4, z, -1, -1);
            if (this.e > 2) {
                double dB = (b(aVarJ4, aVarJ) * this.e) / (b(aVar4, aVar) * (this.e + 2));
                if (dB < 0.75d || dB > 1.25d || !p(aVarJ, aVarJ2, aVarJ3, aVarJ4)) {
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar4 = aVarJ4;
            aVar = aVarJ;
            aVar2 = aVarJ2;
            aVar3 = aVarJ3;
        }
        int i = this.e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f3637b = i == 5;
        atk[] atkVarArr = {new atk(aVar.a() + 0.5f, aVar.b() - 0.5f), new atk(aVar2.a() + 0.5f, aVar2.b() + 0.5f), new atk(aVar3.a() - 0.5f, aVar3.b() + 0.5f), new atk(aVar4.a() - 0.5f, aVar4.b() - 0.5f)};
        int i2 = this.e;
        return d(atkVarArr, (i2 * 2) - 3, i2 * 2);
    }

    public final int g(a aVar, a aVar2) {
        float fB = b(aVar, aVar2);
        float fA = (aVar2.a() - aVar.a()) / fB;
        float fB2 = (aVar2.b() - aVar.b()) / fB;
        float fA2 = aVar.a();
        float fB3 = aVar.b();
        boolean zE = this.f3636a.e(aVar.a(), aVar.b());
        int iCeil = (int) Math.ceil(fB);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fA2 += fA;
            fB3 += fB2;
            if (this.f3636a.e(q8f.c(fA2), q8f.c(fB3)) != zE) {
                i++;
            }
        }
        float f = i / fB;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == zE ? 1 : -1;
        }
        return 0;
    }

    public final int i() {
        if (this.f3637b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    public final a j(a aVar, boolean z, int i, int i2) {
        int iA = aVar.a() + i;
        int iB = aVar.b();
        while (true) {
            iB += i2;
            if (!n(iA, iB) || this.f3636a.e(iA, iB) != z) {
                break;
            }
            iA += i;
        }
        int i3 = iA - i;
        int i4 = iB - i2;
        while (n(i3, i4) && this.f3636a.e(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (n(i5, i4) && this.f3636a.e(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    public final a k() {
        atk atkVarC;
        atk atkVar;
        atk atkVar2;
        atk atkVar3;
        atk atkVarC2;
        atk atkVarC3;
        atk atkVarC4;
        atk atkVarC5;
        try {
            atk[] atkVarArrC = new whr(this.f3636a).c();
            atkVar2 = atkVarArrC[0];
            atkVar3 = atkVarArrC[1];
            atkVar = atkVarArrC[2];
            atkVarC = atkVarArrC[3];
        } catch (NotFoundException unused) {
            int iK = this.f3636a.k() / 2;
            int iH = this.f3636a.h() / 2;
            int i = iK + 7;
            int i2 = iH - 7;
            atk atkVarC6 = j(new a(i, i2), false, 1, -1).c();
            int i3 = iH + 7;
            atk atkVarC7 = j(new a(i, i3), false, 1, 1).c();
            int i4 = iK - 7;
            atk atkVarC8 = j(new a(i4, i3), false, -1, 1).c();
            atkVarC = j(new a(i4, i2), false, -1, -1).c();
            atkVar = atkVarC8;
            atkVar2 = atkVarC6;
            atkVar3 = atkVarC7;
        }
        int iC = q8f.c((((atkVar2.c() + atkVarC.c()) + atkVar3.c()) + atkVar.c()) / 4.0f);
        int iC2 = q8f.c((((atkVar2.d() + atkVarC.d()) + atkVar3.d()) + atkVar.d()) / 4.0f);
        try {
            atk[] atkVarArrC2 = new whr(this.f3636a, 15, iC, iC2).c();
            atkVarC2 = atkVarArrC2[0];
            atkVarC3 = atkVarArrC2[1];
            atkVarC4 = atkVarArrC2[2];
            atkVarC5 = atkVarArrC2[3];
        } catch (NotFoundException unused2) {
            int i5 = iC + 7;
            int i6 = iC2 - 7;
            atkVarC2 = j(new a(i5, i6), false, 1, -1).c();
            int i7 = iC2 + 7;
            atkVarC3 = j(new a(i5, i7), false, 1, 1).c();
            int i8 = iC - 7;
            atkVarC4 = j(new a(i8, i7), false, -1, 1).c();
            atkVarC5 = j(new a(i8, i6), false, -1, -1).c();
        }
        return new a(q8f.c((((atkVarC2.c() + atkVarC5.c()) + atkVarC3.c()) + atkVarC4.c()) / 4.0f), q8f.c((((atkVarC2.d() + atkVarC5.d()) + atkVarC3.d()) + atkVarC4.d()) / 4.0f));
    }

    public final atk[] l(atk[] atkVarArr) {
        return d(atkVarArr, this.e * 2, i());
    }

    public final boolean n(int i, int i2) {
        return i >= 0 && i < this.f3636a.k() && i2 > 0 && i2 < this.f3636a.h();
    }

    public final boolean o(atk atkVar) {
        return n(q8f.c(atkVar.c()), q8f.c(atkVar.d()));
    }

    public final boolean p(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int iG = g(aVar8, aVar5);
        return iG != 0 && g(aVar5, aVar6) == iG && g(aVar6, aVar7) == iG && g(aVar7, aVar8) == iG;
    }

    public final cp2 q(cp2 cp2Var, atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4) throws NotFoundException {
        t3b t3bVarB = t3b.b();
        int i = i();
        float f = i / 2.0f;
        int i2 = this.e;
        float f2 = f - i2;
        float f3 = f + i2;
        return t3bVarB.c(cp2Var, i, i, f2, f2, f3, f2, f3, f3, f2, f3, atkVar.c(), atkVar.d(), atkVar2.c(), atkVar2.d(), atkVar3.c(), atkVar3.d(), atkVar4.c(), atkVar4.d());
    }

    public final int r(atk atkVar, atk atkVar2, int i) {
        float fC = c(atkVar, atkVar2);
        float f = fC / i;
        float fC2 = atkVar.c();
        float fD = atkVar.d();
        float fC3 = ((atkVar2.c() - atkVar.c()) * f) / fC;
        float fD2 = (f * (atkVar2.d() - atkVar.d())) / fC;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f3636a.e(q8f.c((f2 * fC3) + fC2), q8f.c((f2 * fD2) + fD))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
