package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class whr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f37989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37990b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public whr(cp2 cp2Var) throws NotFoundException {
        this(cp2Var, 10, cp2Var.k() / 2, cp2Var.h() / 2);
    }

    public final atk[] a(atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4) {
        float fC = atkVar.c();
        float fD = atkVar.d();
        float fC2 = atkVar2.c();
        float fD2 = atkVar2.d();
        float fC3 = atkVar3.c();
        float fD3 = atkVar3.d();
        float fC4 = atkVar4.c();
        float fD4 = atkVar4.d();
        return fC < ((float) this.c) / 2.0f ? new atk[]{new atk(fC4 - 1.0f, fD4 + 1.0f), new atk(fC2 + 1.0f, fD2 + 1.0f), new atk(fC3 - 1.0f, fD3 - 1.0f), new atk(fC + 1.0f, fD - 1.0f)} : new atk[]{new atk(fC4 + 1.0f, fD4 + 1.0f), new atk(fC2 + 1.0f, fD2 - 1.0f), new atk(fC3 - 1.0f, fD3 + 1.0f), new atk(fC - 1.0f, fD - 1.0f)};
    }

    public final boolean b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f37989a.e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f37989a.e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public atk[] c() throws NotFoundException {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean zB = true;
            while (true) {
                if ((!zB && z2) || i2 >= this.c) {
                    break;
                }
                zB = b(i3, i4, i2, false);
                if (zB) {
                    i2++;
                    z2 = true;
                    z8 = true;
                } else if (!z2) {
                    i2++;
                }
            }
            if (i2 < this.c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z3) || i4 >= this.f37990b) {
                        break;
                    }
                    zB2 = b(i, i2, i4, true);
                    if (zB2) {
                        i4++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i4++;
                    }
                }
                if (i4 < this.f37990b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z4) || i < 0) {
                            break;
                        }
                        zB3 = b(i3, i4, i, false);
                        if (zB3) {
                            i--;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i--;
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z6) || i3 < 0) {
                                break;
                            }
                            zB4 = b(i, i2, i3, true);
                            if (zB4) {
                                i3--;
                                z7 = true;
                                z6 = true;
                            } else if (!z6) {
                                i3--;
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        atk atkVarD = null;
        atk atkVarD2 = null;
        for (int i6 = 1; atkVarD2 == null && i6 < i5; i6++) {
            atkVarD2 = d(i, i4 - i6, i + i6, i4);
        }
        if (atkVarD2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        atk atkVarD3 = null;
        for (int i7 = 1; atkVarD3 == null && i7 < i5; i7++) {
            atkVarD3 = d(i, i3 + i7, i + i7, i3);
        }
        if (atkVarD3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        atk atkVarD4 = null;
        for (int i8 = 1; atkVarD4 == null && i8 < i5; i8++) {
            atkVarD4 = d(i2, i3 + i8, i2 - i8, i3);
        }
        if (atkVarD4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i9 = 1; atkVarD == null && i9 < i5; i9++) {
            atkVarD = d(i2, i4 - i9, i2 - i9, i4);
        }
        if (atkVarD != null) {
            return a(atkVarD, atkVarD2, atkVarD4, atkVarD3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final atk d(float f, float f2, float f3, float f4) {
        int iC = q8f.c(q8f.a(f, f2, f3, f4));
        float f5 = iC;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iC; i++) {
            float f8 = i;
            int iC2 = q8f.c((f8 * f6) + f);
            int iC3 = q8f.c((f8 * f7) + f2);
            if (this.f37989a.e(iC2, iC3)) {
                return new atk(iC2, iC3);
            }
        }
        return null;
    }

    public whr(cp2 cp2Var, int i, int i2, int i3) throws NotFoundException {
        this.f37989a = cp2Var;
        int iH = cp2Var.h();
        this.f37990b = iH;
        int iK = cp2Var.k();
        this.c = iK;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.d = i5;
        int i6 = i2 + i4;
        this.e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= iH || i6 >= iK) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
