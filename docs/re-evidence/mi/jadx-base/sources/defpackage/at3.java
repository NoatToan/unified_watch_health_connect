package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class at3 extends njr {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<njr> f3428k;
    public int l;

    public at3(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f3428k = new ArrayList<>();
        this.f = i;
        q();
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    @Override // defpackage.njr, defpackage.fz5
    public void a(fz5 fz5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f2;
        if (this.h.j && this.i.j) {
            ConstraintWidget constraintWidgetM = this.f27993b.M();
            boolean zU1 = constraintWidgetM instanceof d ? ((d) constraintWidgetM).U1() : false;
            int i14 = this.i.g - this.h.g;
            int size = this.f3428k.size();
            int i15 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.f3428k.get(i15).f27993b.X() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            for (int i17 = i16; i17 >= 0; i17--) {
                if (this.f3428k.get(i17).f27993b.X() != 8) {
                    i = i17;
                    break;
                }
            }
            int i18 = 0;
            while (true) {
                if (i18 >= 2) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f = 0.0f;
                    break;
                }
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                int i20 = 0;
                f = 0.0f;
                while (i19 < size) {
                    njr njrVar = this.f3428k.get(i19);
                    if (njrVar.f27993b.X() != i2) {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i4 += njrVar.h.f;
                        }
                        ex6 ex6Var = njrVar.e;
                        int i21 = ex6Var.g;
                        boolean z2 = njrVar.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z2) {
                            int i22 = this.f;
                            if (i22 == 0 && !njrVar.f27993b.e.e.j) {
                                return;
                            }
                            if (i22 == 1 && !njrVar.f27993b.f.e.j) {
                                return;
                            } else {
                                i12 = i21;
                            }
                        } else {
                            i12 = i21;
                            if (njrVar.f27992a == 1 && i18 == 0) {
                                i13 = ex6Var.m;
                                i5++;
                            } else {
                                if (ex6Var.j) {
                                    i13 = i12;
                                }
                                if (z2) {
                                    i4 += i13;
                                } else {
                                    i5++;
                                    f2 = njrVar.f27993b.N0[this.f];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                }
                                if (i19 >= i16 && i19 < i) {
                                    i4 += -njrVar.i.f;
                                }
                            }
                            z2 = true;
                            if (z2) {
                                i5++;
                                f2 = njrVar.f27993b.N0[this.f];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i4 += i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i13 = i12;
                        if (z2) {
                            i5++;
                            f2 = njrVar.f27993b.N0[this.f];
                            if (f2 >= 0.0f) {
                                f += f2;
                            }
                        } else {
                            i4 += i13;
                        }
                        if (i19 >= i16) {
                        }
                    }
                    i19++;
                    i2 = 8;
                }
                if (i4 < i14 || i5 == 0) {
                    i3 = i20;
                    break;
                } else {
                    i18++;
                    i2 = 8;
                }
            }
            int i23 = this.h.g;
            if (zU1) {
                i23 = this.i.g;
            }
            if (i4 > i14) {
                i23 = zU1 ? i23 + ((int) (((i4 - i14) / 2.0f) + 0.5f)) : i23 - ((int) (((i4 - i14) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f3 = i14 - i4;
                int i24 = (int) ((f3 / i5) + 0.5f);
                int i25 = 0;
                int i26 = 0;
                while (i25 < size) {
                    njr njrVar2 = this.f3428k.get(i25);
                    int i27 = i24;
                    int i28 = i4;
                    if (njrVar2.f27993b.X() != 8 && njrVar2.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ex6 ex6Var2 = njrVar2.e;
                        if (ex6Var2.j) {
                            zU1 = zU1;
                            i23 = i23;
                            f3 = f3;
                        } else {
                            int i29 = f > 0.0f ? (int) (((njrVar2.f27993b.N0[this.f] * f3) / f) + 0.5f) : i27;
                            if (this.f == 0) {
                                ConstraintWidget constraintWidget = njrVar2.f27993b;
                                i11 = constraintWidget.A;
                                i10 = constraintWidget.z;
                            } else {
                                ConstraintWidget constraintWidget2 = njrVar2.f27993b;
                                int i30 = constraintWidget2.D;
                                i10 = constraintWidget2.C;
                                i11 = i30;
                            }
                            int iMax = Math.max(i10, njrVar2.f27992a == 1 ? Math.min(i29, ex6Var2.m) : i29);
                            if (i11 > 0) {
                                iMax = Math.min(i11, iMax);
                            }
                            if (iMax != i29) {
                                i26++;
                                i29 = iMax;
                            }
                            njrVar2.e.d(i29);
                        }
                    } else {
                        zU1 = zU1;
                        i23 = i23;
                        f3 = f3;
                    }
                    i25++;
                    i24 = i27;
                    i4 = i28;
                    i23 = i23;
                    f3 = f3;
                    zU1 = zU1;
                    i3 = i3;
                }
                z = zU1;
                i6 = i3;
                i7 = i23;
                int i31 = i4;
                if (i26 > 0) {
                    i5 -= i26;
                    i4 = 0;
                    for (int i32 = 0; i32 < size; i32++) {
                        njr njrVar3 = this.f3428k.get(i32);
                        if (njrVar3.f27993b.X() != 8) {
                            if (i32 > 0 && i32 >= i15) {
                                i4 += njrVar3.h.f;
                            }
                            i4 += njrVar3.e.g;
                            if (i32 < i16 && i32 < i) {
                                i4 += -njrVar3.i.f;
                            }
                        }
                    }
                } else {
                    i4 = i31;
                }
                i9 = 2;
                if (this.l == 2 && i26 == 0) {
                    i8 = 0;
                    this.l = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z = zU1;
                i6 = i3;
                i7 = i23;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i14) {
                this.l = i9;
            }
            if (i6 > 0 && i5 == 0 && i15 == i) {
                this.l = i9;
            }
            int i33 = this.l;
            if (i33 == 1) {
                int i34 = i6;
                int i35 = i34 > 1 ? (i14 - i4) / (i34 - 1) : i34 == 1 ? (i14 - i4) / 2 : i8;
                if (i5 > 0) {
                    i35 = i8;
                }
                int i36 = i7;
                for (int i37 = i8; i37 < size; i37++) {
                    njr njrVar4 = this.f3428k.get(z ? size - (i37 + 1) : i37);
                    if (njrVar4.f27993b.X() == 8) {
                        njrVar4.h.d(i36);
                        njrVar4.i.d(i36);
                    } else {
                        if (i37 > 0) {
                            i36 = z ? i36 - i35 : i36 + i35;
                        }
                        if (i37 > 0 && i37 >= i15) {
                            i36 = z ? i36 - njrVar4.h.f : i36 + njrVar4.h.f;
                        }
                        if (z) {
                            njrVar4.i.d(i36);
                        } else {
                            njrVar4.h.d(i36);
                        }
                        ex6 ex6Var3 = njrVar4.e;
                        int i38 = ex6Var3.g;
                        if (njrVar4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && njrVar4.f27992a == 1) {
                            i38 = ex6Var3.m;
                        }
                        i36 = z ? i36 - i38 : i36 + i38;
                        if (z) {
                            njrVar4.h.d(i36);
                        } else {
                            njrVar4.i.d(i36);
                        }
                        njrVar4.g = true;
                        if (i37 < i16 && i37 < i) {
                            i36 = z ? i36 - (-njrVar4.i.f) : i36 + (-njrVar4.i.f);
                        }
                    }
                }
                return;
            }
            int i39 = i6;
            if (i33 == 0) {
                int i40 = (i14 - i4) / (i39 + 1);
                if (i5 > 0) {
                    i40 = i8;
                }
                int i41 = i7;
                for (int i42 = i8; i42 < size; i42++) {
                    njr njrVar5 = this.f3428k.get(z ? size - (i42 + 1) : i42);
                    if (njrVar5.f27993b.X() == 8) {
                        njrVar5.h.d(i41);
                        njrVar5.i.d(i41);
                    } else {
                        int i43 = z ? i41 - i40 : i41 + i40;
                        if (i42 > 0 && i42 >= i15) {
                            i43 = z ? i43 - njrVar5.h.f : i43 + njrVar5.h.f;
                        }
                        if (z) {
                            njrVar5.i.d(i43);
                        } else {
                            njrVar5.h.d(i43);
                        }
                        ex6 ex6Var4 = njrVar5.e;
                        int iMin = ex6Var4.g;
                        if (njrVar5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && njrVar5.f27992a == 1) {
                            iMin = Math.min(iMin, ex6Var4.m);
                        }
                        i41 = z ? i43 - iMin : i43 + iMin;
                        if (z) {
                            njrVar5.h.d(i41);
                        } else {
                            njrVar5.i.d(i41);
                        }
                        if (i42 < i16 && i42 < i) {
                            i41 = z ? i41 - (-njrVar5.i.f) : i41 + (-njrVar5.i.f);
                        }
                    }
                }
                return;
            }
            if (i33 == 2) {
                float fA = this.f == 0 ? this.f27993b.A() : this.f27993b.T();
                if (z) {
                    fA = 1.0f - fA;
                }
                int i44 = (int) (((i14 - i4) * fA) + 0.5f);
                if (i44 < 0 || i5 > 0) {
                    i44 = i8;
                }
                int i45 = z ? i7 - i44 : i7 + i44;
                for (int i46 = i8; i46 < size; i46++) {
                    njr njrVar6 = this.f3428k.get(z ? size - (i46 + 1) : i46);
                    if (njrVar6.f27993b.X() == 8) {
                        njrVar6.h.d(i45);
                        njrVar6.i.d(i45);
                    } else {
                        if (i46 > 0 && i46 >= i15) {
                            i45 = z ? i45 - njrVar6.h.f : i45 + njrVar6.h.f;
                        }
                        if (z) {
                            njrVar6.i.d(i45);
                        } else {
                            njrVar6.h.d(i45);
                        }
                        ex6 ex6Var5 = njrVar6.e;
                        int i47 = ex6Var5.g;
                        if (njrVar6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && njrVar6.f27992a == 1) {
                            i47 = ex6Var5.m;
                        }
                        i45 = z ? i45 - i47 : i45 + i47;
                        if (z) {
                            njrVar6.h.d(i45);
                        } else {
                            njrVar6.i.d(i45);
                        }
                        if (i46 < i16 && i46 < i) {
                            i45 = z ? i45 - (-njrVar6.i.f) : i45 + (-njrVar6.i.f);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.njr
    public void d() {
        Iterator<njr> it = this.f3428k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f3428k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f3428k.get(0).f27993b;
        ConstraintWidget constraintWidget2 = this.f3428k.get(size - 1).f27993b;
        if (this.f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.Q;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.S;
            iz5 iz5VarI = i(constraintAnchor, 0);
            int iF = constraintAnchor.f();
            ConstraintWidget constraintWidgetR = r();
            if (constraintWidgetR != null) {
                iF = constraintWidgetR.Q.f();
            }
            if (iz5VarI != null) {
                b(this.h, iz5VarI, iF);
            }
            iz5 iz5VarI2 = i(constraintAnchor2, 0);
            int iF2 = constraintAnchor2.f();
            ConstraintWidget constraintWidgetS = s();
            if (constraintWidgetS != null) {
                iF2 = constraintWidgetS.S.f();
            }
            if (iz5VarI2 != null) {
                b(this.i, iz5VarI2, -iF2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.R;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.T;
            iz5 iz5VarI3 = i(constraintAnchor3, 1);
            int iF3 = constraintAnchor3.f();
            ConstraintWidget constraintWidgetR2 = r();
            if (constraintWidgetR2 != null) {
                iF3 = constraintWidgetR2.R.f();
            }
            if (iz5VarI3 != null) {
                b(this.h, iz5VarI3, iF3);
            }
            iz5 iz5VarI4 = i(constraintAnchor4, 1);
            int iF4 = constraintAnchor4.f();
            ConstraintWidget constraintWidgetS2 = s();
            if (constraintWidgetS2 != null) {
                iF4 = constraintWidgetS2.T.f();
            }
            if (iz5VarI4 != null) {
                b(this.i, iz5VarI4, -iF4);
            }
        }
        this.h.f22240a = this;
        this.i.f22240a = this;
    }

    @Override // defpackage.njr
    public void e() {
        for (int i = 0; i < this.f3428k.size(); i++) {
            this.f3428k.get(i).e();
        }
    }

    @Override // defpackage.njr
    public void f() {
        this.c = null;
        Iterator<njr> it = this.f3428k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.njr
    public long j() {
        int size = this.f3428k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            njr njrVar = this.f3428k.get(i);
            j = j + ((long) njrVar.h.f) + njrVar.j() + ((long) njrVar.i.f);
        }
        return j;
    }

    @Override // defpackage.njr
    public boolean m() {
        int size = this.f3428k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f3428k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.f27993b;
        ConstraintWidget constraintWidgetN = constraintWidget2.N(this.f);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetN;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetN = constraintWidget2.N(this.f);
            }
        }
        this.f27993b = constraintWidget;
        this.f3428k.add(constraintWidget.P(this.f));
        ConstraintWidget constraintWidgetL = constraintWidget.L(this.f);
        while (constraintWidgetL != null) {
            this.f3428k.add(constraintWidgetL.P(this.f));
            constraintWidgetL = constraintWidgetL.L(this.f);
        }
        for (njr njrVar : this.f3428k) {
            int i = this.f;
            if (i == 0) {
                njrVar.f27993b.c = this;
            } else if (i == 1) {
                njrVar.f27993b.d = this;
            }
        }
        if (this.f == 0 && ((d) this.f27993b.M()).U1() && this.f3428k.size() > 1) {
            ArrayList<njr> arrayList = this.f3428k;
            this.f27993b = arrayList.get(arrayList.size() - 1).f27993b;
        }
        this.l = this.f == 0 ? this.f27993b.B() : this.f27993b.U();
    }

    public final ConstraintWidget r() {
        for (int i = 0; i < this.f3428k.size(); i++) {
            njr njrVar = this.f3428k.get(i);
            if (njrVar.f27993b.X() != 8) {
                return njrVar.f27993b;
            }
        }
        return null;
    }

    public final ConstraintWidget s() {
        for (int size = this.f3428k.size() - 1; size >= 0; size--) {
            njr njrVar = this.f3428k.get(size);
            if (njrVar.f27993b.X() != 8) {
                return njrVar.f27993b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (njr njrVar : this.f3428k) {
            sb.append("<");
            sb.append(njrVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
