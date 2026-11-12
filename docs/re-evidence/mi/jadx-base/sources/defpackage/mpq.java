package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class mpq extends njr {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public iz5 f27079k;
    public ex6 l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27080a;

        static {
            int[] iArr = new int[njr.b.values().length];
            f27080a = iArr;
            try {
                iArr[njr.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27080a[njr.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27080a[njr.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public mpq(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        iz5 iz5Var = new iz5(this);
        this.f27079k = iz5Var;
        this.l = null;
        this.h.e = iz5.a.TOP;
        this.i.e = iz5.a.BOTTOM;
        iz5Var.e = iz5.a.BASELINE;
        this.f = 1;
    }

    @Override // defpackage.njr, defpackage.fz5
    public void a(fz5 fz5Var) {
        float f;
        float fX;
        float fX2;
        int i;
        int i2 = a.f27080a[this.j.ordinal()];
        if (i2 == 1) {
            p(fz5Var);
        } else if (i2 == 2) {
            o(fz5Var);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.f27993b;
            n(fz5Var, constraintWidget.R, constraintWidget.T, 1);
            return;
        }
        ex6 ex6Var = this.e;
        if (ex6Var.c && !ex6Var.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f27993b;
            int i3 = constraintWidget2.x;
            if (i3 == 2) {
                ConstraintWidget constraintWidgetM = constraintWidget2.M();
                if (constraintWidgetM != null) {
                    ex6 ex6Var2 = constraintWidgetM.f.e;
                    if (ex6Var2.j) {
                        this.e.d((int) ((ex6Var2.g * this.f27993b.E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.e.e.j) {
                int iY = constraintWidget2.y();
                if (iY != -1) {
                    if (iY == 0) {
                        ConstraintWidget constraintWidget3 = this.f27993b;
                        fX2 = constraintWidget3.e.e.g * constraintWidget3.x();
                        i = (int) (fX2 + 0.5f);
                    } else if (iY != 1) {
                        i = 0;
                    } else {
                        ConstraintWidget constraintWidget4 = this.f27993b;
                        f = constraintWidget4.e.e.g;
                        fX = constraintWidget4.x();
                    }
                    this.e.d(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.f27993b;
                    f = constraintWidget5.e.e.g;
                    fX = constraintWidget5.x();
                }
                fX2 = f / fX;
                i = (int) (fX2 + 0.5f);
                this.e.d(i);
            }
        }
        iz5 iz5Var = this.h;
        if (iz5Var.c) {
            iz5 iz5Var2 = this.i;
            if (iz5Var2.c) {
                if (iz5Var.j && iz5Var2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f27993b;
                    if (constraintWidget6.w == 0 && !constraintWidget6.m0()) {
                        iz5 iz5Var3 = this.h.l.get(0);
                        iz5 iz5Var4 = this.i.l.get(0);
                        int i4 = iz5Var3.g;
                        iz5 iz5Var5 = this.h;
                        int i5 = i4 + iz5Var5.f;
                        int i6 = iz5Var4.g + this.i.f;
                        iz5Var5.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f27992a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    iz5 iz5Var6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f) - (iz5Var6.g + this.h.f);
                    ex6 ex6Var3 = this.e;
                    int i8 = ex6Var3.m;
                    if (i7 < i8) {
                        ex6Var3.d(i7);
                    } else {
                        ex6Var3.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    iz5 iz5Var7 = this.h.l.get(0);
                    iz5 iz5Var8 = this.i.l.get(0);
                    int i9 = iz5Var7.g + this.h.f;
                    int i10 = iz5Var8.g + this.i.f;
                    float fT = this.f27993b.T();
                    if (iz5Var7 == iz5Var8) {
                        i9 = iz5Var7.g;
                        i10 = iz5Var8.g;
                        fT = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * fT)));
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
            this.e.d(constraintWidget.z());
        }
        if (!this.e.j) {
            this.d = this.f27993b.V();
            if (this.f27993b.b0()) {
                this.l = new tf2(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetM2 = this.f27993b.M()) != null && constraintWidgetM2.V() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iZ = (constraintWidgetM2.z() - this.f27993b.R.f()) - this.f27993b.T.f();
                    b(this.h, constraintWidgetM2.f.h, this.f27993b.R.f());
                    b(this.i, constraintWidgetM2.f.i, -this.f27993b.T.f());
                    this.e.d(iZ);
                    return;
                }
                if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.d(this.f27993b.z());
                }
            }
        } else if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetM = this.f27993b.M()) != null && constraintWidgetM.V() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.h, constraintWidgetM.f.h, this.f27993b.R.f());
            b(this.i, constraintWidgetM.f.i, -this.f27993b.T.f());
            return;
        }
        ex6 ex6Var = this.e;
        boolean z = ex6Var.j;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f27993b;
            if (constraintWidget2.f1900a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget2.m0()) {
                        this.h.f = this.f27993b.Y[2].f();
                        this.i.f = -this.f27993b.Y[3].f();
                    } else {
                        iz5 iz5VarH = h(this.f27993b.Y[2]);
                        if (iz5VarH != null) {
                            b(this.h, iz5VarH, this.f27993b.Y[2].f());
                        }
                        iz5 iz5VarH2 = h(this.f27993b.Y[3]);
                        if (iz5VarH2 != null) {
                            b(this.i, iz5VarH2, -this.f27993b.Y[3].f());
                        }
                        this.h.f22241b = true;
                        this.i.f22241b = true;
                    }
                    if (this.f27993b.b0()) {
                        b(this.f27079k, this.h, this.f27993b.r());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    iz5 iz5VarH3 = h(constraintAnchor);
                    if (iz5VarH3 != null) {
                        b(this.h, iz5VarH3, this.f27993b.Y[2].f());
                        b(this.i, this.h, this.e.g);
                        if (this.f27993b.b0()) {
                            b(this.f27079k, this.h, this.f27993b.r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f != null) {
                    iz5 iz5VarH4 = h(constraintAnchor3);
                    if (iz5VarH4 != null) {
                        b(this.i, iz5VarH4, -this.f27993b.Y[3].f());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.f27993b.b0()) {
                        b(this.f27079k, this.h, this.f27993b.r());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f != null) {
                    iz5 iz5VarH5 = h(constraintAnchor4);
                    if (iz5VarH5 != null) {
                        b(this.f27079k, iz5VarH5, 0);
                        b(this.h, this.f27079k, -this.f27993b.r());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof d7c) || constraintWidget2.M() == null || this.f27993b.q(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                b(this.h, this.f27993b.M().f.h, this.f27993b.a0());
                b(this.i, this.h, this.e.g);
                if (this.f27993b.b0()) {
                    b(this.f27079k, this.h, this.f27993b.r());
                    return;
                }
                return;
            }
        }
        if (z || this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ex6Var.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f27993b;
            int i = constraintWidget3.x;
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
            } else if (i == 3 && !constraintWidget3.m0()) {
                ConstraintWidget constraintWidget4 = this.f27993b;
                if (constraintWidget4.w != 3) {
                    ex6 ex6Var4 = constraintWidget4.e.e;
                    this.e.l.add(ex6Var4);
                    ex6Var4.f22242k.add(this.e);
                    ex6 ex6Var5 = this.e;
                    ex6Var5.f22241b = true;
                    ex6Var5.f22242k.add(this.h);
                    this.e.f22242k.add(this.i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f27993b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.Y;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget5.m0()) {
                this.h.f = this.f27993b.Y[2].f();
                this.i.f = -this.f27993b.Y[3].f();
            } else {
                iz5 iz5VarH6 = h(this.f27993b.Y[2]);
                iz5 iz5VarH7 = h(this.f27993b.Y[3]);
                if (iz5VarH6 != null) {
                    iz5VarH6.b(this);
                }
                if (iz5VarH7 != null) {
                    iz5VarH7.b(this);
                }
                this.j = njr.b.CENTER;
            }
            if (this.f27993b.b0()) {
                c(this.f27079k, this.h, 1, this.l);
            }
        } else if (constraintAnchor6 != null) {
            iz5 iz5VarH8 = h(constraintAnchor5);
            if (iz5VarH8 != null) {
                b(this.h, iz5VarH8, this.f27993b.Y[2].f());
                c(this.i, this.h, 1, this.e);
                if (this.f27993b.b0()) {
                    c(this.f27079k, this.h, 1, this.l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f27993b.x() > 0.0f) {
                    sac sacVar = this.f27993b.e;
                    if (sacVar.d == dimensionBehaviour3) {
                        sacVar.e.f22242k.add(this.e);
                        this.e.l.add(this.f27993b.e.e);
                        this.e.f22240a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f != null) {
                iz5 iz5VarH9 = h(constraintAnchor7);
                if (iz5VarH9 != null) {
                    b(this.i, iz5VarH9, -this.f27993b.Y[3].f());
                    c(this.h, this.i, -1, this.e);
                    if (this.f27993b.b0()) {
                        c(this.f27079k, this.h, 1, this.l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f != null) {
                    iz5 iz5VarH10 = h(constraintAnchor8);
                    if (iz5VarH10 != null) {
                        b(this.f27079k, iz5VarH10, 0);
                        c(this.h, this.f27079k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(constraintWidget5 instanceof d7c) && constraintWidget5.M() != null) {
                    b(this.h, this.f27993b.M().f.h, this.f27993b.a0());
                    c(this.i, this.h, 1, this.e);
                    if (this.f27993b.b0()) {
                        c(this.f27079k, this.h, 1, this.l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f27993b.x() > 0.0f) {
                        sac sacVar2 = this.f27993b.e;
                        if (sacVar2.d == dimensionBehaviour5) {
                            sacVar2.e.f22242k.add(this.e);
                            this.e.l.add(this.f27993b.e.e);
                            this.e.f22240a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // defpackage.njr
    public void e() {
        iz5 iz5Var = this.h;
        if (iz5Var.j) {
            this.f27993b.r1(iz5Var.g);
        }
    }

    @Override // defpackage.njr
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.f27079k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.njr
    public boolean m() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f27993b.x == 0;
    }

    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.f27079k.c();
        this.f27079k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f27993b.v();
    }
}
