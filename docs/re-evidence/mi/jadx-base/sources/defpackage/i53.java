package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class i53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f20794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final atk f20795b;
    public final atk c;
    public final atk d;
    public final atk e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public i53(cp2 cp2Var, atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4) throws NotFoundException {
        boolean z = atkVar == null || atkVar2 == null;
        boolean z2 = atkVar3 == null || atkVar4 == null;
        if (z && z2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            atkVar = new atk(0.0f, atkVar3.d());
            atkVar2 = new atk(0.0f, atkVar4.d());
        } else if (z2) {
            atkVar3 = new atk(cp2Var.k() - 1, atkVar.d());
            atkVar4 = new atk(cp2Var.k() - 1, atkVar2.d());
        }
        this.f20794a = cp2Var;
        this.f20795b = atkVar;
        this.c = atkVar2;
        this.d = atkVar3;
        this.e = atkVar4;
        this.f = (int) Math.min(atkVar.c(), atkVar2.c());
        this.g = (int) Math.max(atkVar3.c(), atkVar4.c());
        this.h = (int) Math.min(atkVar.d(), atkVar3.d());
        this.i = (int) Math.max(atkVar2.d(), atkVar4.d());
    }

    public static i53 j(i53 i53Var, i53 i53Var2) throws NotFoundException {
        if (i53Var == null) {
            return i53Var2;
        }
        return i53Var2 == null ? i53Var : new i53(i53Var.f20794a, i53Var.f20795b, i53Var.c, i53Var2.d, i53Var2.e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public i53 a(int i, int i2, boolean z) throws NotFoundException {
        atk atkVar;
        atk atkVar2;
        atk atkVar3;
        atk atkVar4;
        atk atkVar5;
        int iD;
        atk atkVar6;
        atk atkVar7 = this.f20795b;
        atk atkVar8 = this.c;
        atk atkVar9 = this.d;
        atk atkVar10 = this.e;
        if (i > 0) {
            atk atkVar11 = z ? atkVar7 : atkVar9;
            int iD2 = ((int) atkVar11.d()) - i;
            if (iD2 < 0) {
                iD2 = 0;
            }
            atk atkVar12 = new atk(atkVar11.c(), iD2);
            if (z) {
                atkVar = atkVar12;
            } else {
                atkVar2 = atkVar12;
                atkVar = atkVar7;
            }
            if (i2 > 0) {
                if (z) {
                    atkVar5 = this.c;
                } else {
                    atkVar5 = this.e;
                }
                iD = ((int) atkVar5.d()) + i2;
                if (iD >= this.f20794a.h()) {
                    iD = this.f20794a.h() - 1;
                }
                atkVar6 = new atk(atkVar5.c(), iD);
                if (z) {
                    atkVar3 = atkVar6;
                } else {
                    atkVar4 = atkVar6;
                    atkVar3 = atkVar8;
                }
                return new i53(this.f20794a, atkVar, atkVar3, atkVar2, atkVar4);
            }
            atkVar3 = atkVar8;
            atkVar4 = atkVar10;
            return new i53(this.f20794a, atkVar, atkVar3, atkVar2, atkVar4);
        }
        atkVar = atkVar7;
        atkVar2 = atkVar9;
        if (i2 > 0) {
            if (z) {
                atkVar5 = this.c;
            } else {
                atkVar5 = this.e;
            }
            iD = ((int) atkVar5.d()) + i2;
            if (iD >= this.f20794a.h()) {
                iD = this.f20794a.h() - 1;
            }
            atkVar6 = new atk(atkVar5.c(), iD);
            if (z) {
                atkVar3 = atkVar6;
            } else {
                atkVar4 = atkVar6;
                atkVar3 = atkVar8;
            }
            return new i53(this.f20794a, atkVar, atkVar3, atkVar2, atkVar4);
        }
        atkVar3 = atkVar8;
        atkVar4 = atkVar10;
        return new i53(this.f20794a, atkVar, atkVar3, atkVar2, atkVar4);
    }

    public atk b() {
        return this.c;
    }

    public atk c() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.h;
    }

    public atk h() {
        return this.f20795b;
    }

    public atk i() {
        return this.d;
    }

    public i53(i53 i53Var) {
        this.f20794a = i53Var.f20794a;
        this.f20795b = i53Var.h();
        this.c = i53Var.b();
        this.d = i53Var.i();
        this.e = i53Var.c();
        this.f = i53Var.f();
        this.g = i53Var.d();
        this.h = i53Var.g();
        this.i = i53Var.e();
    }
}
