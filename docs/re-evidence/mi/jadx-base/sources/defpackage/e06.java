package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f16115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public btk f16116b;

    public e06(cp2 cp2Var) {
        this.f16115a = cp2Var;
    }

    public static int c(atk atkVar, atk atkVar2, atk atkVar3, float f) throws NotFoundException {
        int iC = (q8f.c(atk.b(atkVar, atkVar2) / f) + q8f.c(atk.b(atkVar, atkVar3) / f)) / 2;
        int i = iC + 7;
        int i2 = i & 3;
        if (i2 == 0) {
            return iC + 8;
        }
        if (i2 == 2) {
            return iC + 6;
        }
        if (i2 != 3) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static ath d(atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4, int i) {
        float fC;
        float fD;
        float f;
        float f2 = i - 3.5f;
        if (atkVar4 != null) {
            fC = atkVar4.c();
            fD = atkVar4.d();
            f = f2 - 3.0f;
        } else {
            fC = (atkVar2.c() - atkVar.c()) + atkVar3.c();
            fD = (atkVar2.d() - atkVar.d()) + atkVar3.d();
            f = f2;
        }
        return ath.b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, atkVar.c(), atkVar.d(), atkVar2.c(), atkVar2.d(), fC, fD, atkVar3.c(), atkVar3.d());
    }

    public static cp2 h(cp2 cp2Var, ath athVar, int i) throws NotFoundException {
        return t3b.b().d(cp2Var, i, i, athVar);
    }

    public final float a(atk atkVar, atk atkVar2, atk atkVar3) {
        return (b(atkVar, atkVar2) + b(atkVar, atkVar3)) / 2.0f;
    }

    public final float b(atk atkVar, atk atkVar2) {
        float fJ = j((int) atkVar.c(), (int) atkVar.d(), (int) atkVar2.c(), (int) atkVar2.d());
        float fJ2 = j((int) atkVar2.c(), (int) atkVar2.d(), (int) atkVar.c(), (int) atkVar.d());
        if (Float.isNaN(fJ)) {
            return fJ2 / 7.0f;
        }
        return Float.isNaN(fJ2) ? fJ / 7.0f : (fJ + fJ2) / 14.0f;
    }

    public final f06 e(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        btk btkVar = map == null ? null : (btk) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f16116b = btkVar;
        return g(new tn9(this.f16115a, btkVar).f(map));
    }

    public final z51 f(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.f16115a.k() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(this.f16115a.h() - 1, i2 + i3) - iMax2;
        if (iMin2 >= f3) {
            return new a61(this.f16115a, iMax, iMax2, iMin, iMin2, f, this.f16116b).c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final f06 g(un9 un9Var) throws NotFoundException, FormatException {
        z51 z51VarF;
        rn9 rn9VarB = un9Var.b();
        rn9 rn9VarC = un9Var.c();
        rn9 rn9VarA = un9Var.a();
        float fA = a(rn9VarB, rn9VarC, rn9VarA);
        if (fA < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iC = c(rn9VarB, rn9VarC, rn9VarA, fA);
        bpq bpqVarG = bpq.g(iC);
        int iE = bpqVarG.e() - 7;
        if (bpqVarG.d().length <= 0) {
            z51VarF = null;
            break;
        }
        float fC = (rn9VarC.c() - rn9VarB.c()) + rn9VarA.c();
        float fD = (rn9VarC.d() - rn9VarB.d()) + rn9VarA.d();
        float f = 1.0f - (3.0f / iE);
        int iC2 = (int) (rn9VarB.c() + ((fC - rn9VarB.c()) * f));
        int iD = (int) (rn9VarB.d() + (f * (fD - rn9VarB.d())));
        int i = 4;
        while (true) {
            if (i > 16) {
                z51VarF = null;
                break;
            }
            try {
                z51VarF = f(fA, iC2, iD, i);
                break;
            } catch (NotFoundException unused) {
                i <<= 1;
            }
        }
        return new f06(h(this.f16115a, d(rn9VarB, rn9VarC, rn9VarA, z51VarF, iC), iC), z51VarF == null ? new atk[]{rn9VarA, rn9VarB, rn9VarC} : new atk[]{rn9VarA, rn9VarB, rn9VarC, z51VarF});
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[RETURN] */
    public final float i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-iAbs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (i16 != i15) {
            if ((i18 == i10 ? i10 : 0) == this.f16115a.e(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return q8f.b(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return q8f.b(i15, i8, i5, i6);
                    }
                    return Float.NaN;
                }
                i17 += i14;
                i12 -= iAbs;
            }
            i16 += i13;
            i15 = i15;
            z = z;
            i10 = 1;
            i11 = 2;
        }
        i15 = i15;
        i9 = i11;
        if (i18 == i9) {
            return q8f.b(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float j(int i, int i2, int i3, int i4) {
        float fK;
        float fH;
        float fI = i(i, i2, i3, i4);
        int iK = i - (i3 - i);
        int iH = 0;
        if (iK < 0) {
            fK = i / (i - iK);
            iK = 0;
        } else if (iK >= this.f16115a.k()) {
            fK = ((this.f16115a.k() - 1) - i) / (iK - i);
            iK = this.f16115a.k() - 1;
        } else {
            fK = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * fK));
        if (i5 < 0) {
            fH = f / (i2 - i5);
        } else if (i5 >= this.f16115a.h()) {
            fH = ((this.f16115a.h() - 1) - i2) / (i5 - i2);
            iH = this.f16115a.h() - 1;
        } else {
            iH = i5;
            fH = 1.0f;
        }
        return (fI + i(i, i2, (int) (i + ((iK - i) * fH)), iH)) - 1.0f;
    }
}
