package defpackage;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f669a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final btk i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<z51> f670b = new ArrayList(5);
    public final int[] h = new int[3];

    public a61(cp2 cp2Var, int i, int i2, int i3, int i4, float f, btk btkVar) {
        this.f669a = cp2Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = btkVar;
    }

    public static float a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int i, int i2, int i3, int i4) {
        cp2 cp2Var = this.f669a;
        int iH = cp2Var.h();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && cp2Var.e(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !cp2Var.e(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < iH && cp2Var.e(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != iH && iArr[1] <= i3) {
                while (i8 < iH && !cp2Var.e(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && d(iArr)) {
                    return a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    public z51 c() throws NotFoundException {
        z51 z51VarE;
        z51 z51VarE2;
        int i = this.c;
        int i2 = this.f;
        int i3 = this.e + i;
        int i4 = this.d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f669a.e(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f669a.e(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else {
                    if (d(iArr) && (z51VarE2 = e(iArr, i6, i7)) != null) {
                        return z51VarE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (d(iArr) && (z51VarE = e(iArr, i6, i3)) != null) {
                return z51VarE;
            }
        }
        if (this.f670b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.f670b.get(0);
    }

    public final boolean d(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final z51 e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i2);
        float fB = b(i, (int) fA, iArr[1] * 2, i3);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (z51 z51Var : this.f670b) {
            if (z51Var.f(f, fB, fA)) {
                return z51Var.g(fB, fA, f);
            }
        }
        z51 z51Var2 = new z51(fA, fB, f);
        this.f670b.add(z51Var2);
        btk btkVar = this.i;
        if (btkVar == null) {
            return null;
        }
        btkVar.a(z51Var2);
        return null;
    }
}
