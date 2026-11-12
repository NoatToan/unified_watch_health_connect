package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class sac extends njr {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f33454k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33455a;

        static {
            int[] iArr = new int[njr.b.values().length];
            f33455a = iArr;
            try {
                iArr[njr.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33455a[njr.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33455a[njr.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public sac(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = iz5.a.LEFT;
        this.i.e = iz5.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ee  */
    @Override // defpackage.njr, defpackage.fz5
    public void a(fz5 fz5Var) {
        int iG;
        int i;
        int iG2;
        float f;
        float fX;
        float fX2;
        int i2;
        int i3 = a.f33455a[this.j.ordinal()];
        if (i3 == 1) {
            p(fz5Var);
        } else if (i3 == 2) {
            o(fz5Var);
        } else if (i3 == 3) {
            ConstraintWidget constraintWidget = this.f27993b;
            n(fz5Var, constraintWidget.Q, constraintWidget.S, 0);
            return;
        }
        if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f27993b;
            int i4 = constraintWidget2.w;
            if (i4 == 2) {
                ConstraintWidget constraintWidgetM = constraintWidget2.M();
                if (constraintWidgetM != null) {
                    ex6 ex6Var = constraintWidgetM.e.e;
                    if (ex6Var.j) {
                        this.e.d((int) ((ex6Var.g * this.f27993b.B) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = constraintWidget2.x;
                if (i5 == 0 || i5 == 3) {
                    mpq mpqVar = constraintWidget2.f;
                    iz5 iz5Var = mpqVar.h;
                    iz5 iz5Var2 = mpqVar.i;
                    boolean z = constraintWidget2.Q.f != null;
                    boolean z2 = constraintWidget2.R.f != null;
                    boolean z3 = constraintWidget2.S.f != null;
                    boolean z4 = constraintWidget2.T.f != null;
                    int iY = constraintWidget2.y();
                    if (z && z2 && z3 && z4) {
                        float fX3 = this.f27993b.x();
                        if (iz5Var.j && iz5Var2.j) {
                            iz5 iz5Var3 = this.h;
                            if (iz5Var3.c && this.i.c) {
                                q(f33454k, iz5Var3.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, iz5Var.g + iz5Var.f, iz5Var2.g - iz5Var2.f, fX3, iY);
                                this.e.d(f33454k[0]);
                                this.f27993b.f.e.d(f33454k[1]);
                                return;
                            }
                            return;
                        }
                        iz5 iz5Var4 = this.h;
                        if (iz5Var4.j) {
                            iz5 iz5Var5 = this.i;
                            if (iz5Var5.j) {
                                if (!iz5Var.c || !iz5Var2.c) {
                                    return;
                                }
                                q(f33454k, iz5Var4.g + iz5Var4.f, iz5Var5.g - iz5Var5.f, iz5Var.l.get(0).g + iz5Var.f, iz5Var2.l.get(0).g - iz5Var2.f, fX3, iY);
                                this.e.d(f33454k[0]);
                                this.f27993b.f.e.d(f33454k[1]);
                            }
                        }
                        iz5 iz5Var6 = this.h;
                        if (!iz5Var6.c || !this.i.c || !iz5Var.c || !iz5Var2.c) {
                            return;
                        }
                        q(f33454k, iz5Var6.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, iz5Var.l.get(0).g + iz5Var.f, iz5Var2.l.get(0).g - iz5Var2.f, fX3, iY);
                        this.e.d(f33454k[0]);
                        this.f27993b.f.e.d(f33454k[1]);
                    } else if (z && z3) {
                        if (!this.h.c || !this.i.c) {
                            return;
                        }
                        float fX4 = this.f27993b.x();
                        int i6 = this.h.l.get(0).g + this.h.f;
                        int i7 = this.i.l.get(0).g - this.i.f;
                        if (iY == -1 || iY == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * fX4) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / fX4) + 0.5f);
                            }
                            this.e.d(iG3);
                            this.f27993b.f.e.d(iG4);
                        } else if (iY == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / fX4) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * fX4) + 0.5f);
                            }
                            this.e.d(iG5);
                            this.f27993b.f.e.d(iG6);
                        }
                    } else if (z2 && z4) {
                        if (!iz5Var.c || !iz5Var2.c) {
                            return;
                        }
                        float fX5 = this.f27993b.x();
                        int i10 = iz5Var.l.get(0).g + iz5Var.f;
                        int i11 = iz5Var2.l.get(0).g - iz5Var2.f;
                        if (iY == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.e.d(iG2);
                            this.f27993b.f.e.d(iG);
                        } else if (iY == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * fX5) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / fX5) + 0.5f);
                            }
                            this.e.d(iG8);
                            this.f27993b.f.e.d(iG7);
                        } else if (iY == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.e.d(iG2);
                            this.f27993b.f.e.d(iG);
                        }
                    }
                } else {
                    int iY2 = constraintWidget2.y();
                    if (iY2 != -1) {
                        if (iY2 == 0) {
                            ConstraintWidget constraintWidget3 = this.f27993b;
                            fX2 = constraintWidget3.f.e.g / constraintWidget3.x();
                            i2 = (int) (fX2 + 0.5f);
                        } else if (iY2 != 1) {
                            i2 = 0;
                        } else {
                            ConstraintWidget constraintWidget4 = this.f27993b;
                            f = constraintWidget4.f.e.g;
                            fX = constraintWidget4.x();
                        }
                        this.e.d(i2);
                    } else {
                        ConstraintWidget constraintWidget5 = this.f27993b;
                        f = constraintWidget5.f.e.g;
                        fX = constraintWidget5.x();
                    }
                    fX2 = f * fX;
                    i2 = (int) (fX2 + 0.5f);
                    this.e.d(i2);
                }
            }
        }
        iz5 iz5Var7 = this.h;
        if (iz5Var7.c) {
            iz5 iz5Var8 = this.i;
            if (iz5Var8.c) {
                if (iz5Var7.j && iz5Var8.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f27993b;
                    if (constraintWidget6.w == 0 && !constraintWidget6.k0()) {
                        iz5 iz5Var9 = this.h.l.get(0);
                        iz5 iz5Var10 = this.i.l.get(0);
                        int i13 = iz5Var9.g;
                        iz5 iz5Var11 = this.h;
                        int i14 = i13 + iz5Var11.f;
                        int i15 = iz5Var10.g + this.i.f;
                        iz5Var11.d(i14);
                        this.i.d(i15);
                        this.e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f27992a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int iMin = Math.min((this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f), this.e.m);
                    ConstraintWidget constraintWidget7 = this.f27993b;
                    int i16 = constraintWidget7.A;
                    int iMax = Math.max(constraintWidget7.z, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    this.e.d(iMax);
                }
                if (this.e.j) {
                    iz5 iz5Var12 = this.h.l.get(0);
                    iz5 iz5Var13 = this.i.l.get(0);
                    int i17 = iz5Var12.g + this.h.f;
                    int i18 = iz5Var13.g + this.i.f;
                    float fA = this.f27993b.A();
                    if (iz5Var12 == iz5Var13) {
                        i17 = iz5Var12.g;
                        i18 = iz5Var13.g;
                        fA = 0.5f;
                    }
                    this.h.d((int) (i17 + 0.5f + (((i18 - i17) - this.e.g) * fA)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // defpackage.njr
    public void d() {
        ConstraintWidget constraintWidgetM;
        ConstraintWidget constraintWidgetM2;
        ConstraintWidget constraintWidget = this.f27993b;
        if (constraintWidget.f1900a) {
            this.e.d(constraintWidget.Y());
        }
        if (this.e.j) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetM = this.f27993b.M()) != null && (constraintWidgetM.C() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetM.C() == dimensionBehaviour2)) {
                b(this.h, constraintWidgetM.e.h, this.f27993b.Q.f());
                b(this.i, constraintWidgetM.e.i, -this.f27993b.S.f());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourC = this.f27993b.C();
            this.d = dimensionBehaviourC;
            if (dimensionBehaviourC != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourC == dimensionBehaviour3 && (constraintWidgetM2 = this.f27993b.M()) != null && (constraintWidgetM2.C() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetM2.C() == dimensionBehaviour3)) {
                    int iY = (constraintWidgetM2.Y() - this.f27993b.Q.f()) - this.f27993b.S.f();
                    b(this.h, constraintWidgetM2.e.h, this.f27993b.Q.f());
                    b(this.i, constraintWidgetM2.e.i, -this.f27993b.S.f());
                    this.e.d(iY);
                    return;
                }
                if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.d(this.f27993b.Y());
                }
            }
        }
        ex6 ex6Var = this.e;
        if (ex6Var.j) {
            ConstraintWidget constraintWidget2 = this.f27993b;
            if (constraintWidget2.f1900a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f != null) {
                    if (constraintWidget2.k0()) {
                        this.h.f = this.f27993b.Y[0].f();
                        this.i.f = -this.f27993b.Y[1].f();
                        return;
                    }
                    iz5 iz5VarH = h(this.f27993b.Y[0]);
                    if (iz5VarH != null) {
                        b(this.h, iz5VarH, this.f27993b.Y[0].f());
                    }
                    iz5 iz5VarH2 = h(this.f27993b.Y[1]);
                    if (iz5VarH2 != null) {
                        b(this.i, iz5VarH2, -this.f27993b.Y[1].f());
                    }
                    this.h.f22241b = true;
                    this.i.f22241b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    iz5 iz5VarH3 = h(constraintAnchor);
                    if (iz5VarH3 != null) {
                        b(this.h, iz5VarH3, this.f27993b.Y[0].f());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f != null) {
                    iz5 iz5VarH4 = h(constraintAnchor3);
                    if (iz5VarH4 != null) {
                        b(this.i, iz5VarH4, -this.f27993b.Y[1].f());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof d7c) || constraintWidget2.M() == null || this.f27993b.q(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                b(this.h, this.f27993b.M().e.h, this.f27993b.Z());
                b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f27993b;
            int i = constraintWidget3.w;
            if (i == 2) {
                ConstraintWidget constraintWidgetM3 = constraintWidget3.M();
                if (constraintWidgetM3 != null) {
                    ex6 ex6Var2 = constraintWidgetM3.f.e;
                    this.e.l.add(ex6Var2);
                    ex6Var2.f22242k.add(this.e);
                    ex6 ex6Var3 = this.e;
                    ex6Var3.f22241b = true;
                    ex6Var3.f22242k.add(this.h);
                    this.e.f22242k.add(this.i);
                }
            } else if (i == 3) {
                if (constraintWidget3.x == 3) {
                    this.h.f22240a = this;
                    this.i.f22240a = this;
                    mpq mpqVar = constraintWidget3.f;
                    mpqVar.h.f22240a = this;
                    mpqVar.i.f22240a = this;
                    ex6Var.f22240a = this;
                    if (constraintWidget3.m0()) {
                        this.e.l.add(this.f27993b.f.e);
                        this.f27993b.f.e.f22242k.add(this.e);
                        mpq mpqVar2 = this.f27993b.f;
                        mpqVar2.e.f22240a = this;
                        this.e.l.add(mpqVar2.h);
                        this.e.l.add(this.f27993b.f.i);
                        this.f27993b.f.h.f22242k.add(this.e);
                        this.f27993b.f.i.f22242k.add(this.e);
                    } else if (this.f27993b.k0()) {
                        this.f27993b.f.e.l.add(this.e);
                        this.e.f22242k.add(this.f27993b.f.e);
                    } else {
                        this.f27993b.f.e.l.add(this.e);
                    }
                } else {
                    ex6 ex6Var4 = constraintWidget3.f.e;
                    ex6Var.l.add(ex6Var4);
                    ex6Var4.f22242k.add(this.e);
                    this.f27993b.f.h.f22242k.add(this.e);
                    this.f27993b.f.i.f22242k.add(this.e);
                    ex6 ex6Var5 = this.e;
                    ex6Var5.f22241b = true;
                    ex6Var5.f22242k.add(this.h);
                    this.e.f22242k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f27993b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.Y;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f != null) {
            if (constraintWidget4.k0()) {
                this.h.f = this.f27993b.Y[0].f();
                this.i.f = -this.f27993b.Y[1].f();
                return;
            }
            iz5 iz5VarH5 = h(this.f27993b.Y[0]);
            iz5 iz5VarH6 = h(this.f27993b.Y[1]);
            if (iz5VarH5 != null) {
                iz5VarH5.b(this);
            }
            if (iz5VarH6 != null) {
                iz5VarH6.b(this);
            }
            this.j = njr.b.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            iz5 iz5VarH7 = h(constraintAnchor4);
            if (iz5VarH7 != null) {
                b(this.h, iz5VarH7, this.f27993b.Y[0].f());
                c(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f != null) {
            iz5 iz5VarH8 = h(constraintAnchor6);
            if (iz5VarH8 != null) {
                b(this.i, iz5VarH8, -this.f27993b.Y[1].f());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof d7c) || constraintWidget4.M() == null) {
            return;
        }
        b(this.h, this.f27993b.M().e.h, this.f27993b.Z());
        c(this.i, this.h, 1, this.e);
    }

    @Override // defpackage.njr
    public void e() {
        iz5 iz5Var = this.h;
        if (iz5Var.j) {
            this.f27993b.q1(iz5Var.g);
        }
    }

    @Override // defpackage.njr
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.njr
    public boolean m() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f27993b.w == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f27993b.v();
    }
}
