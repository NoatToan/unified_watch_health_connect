package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class njr implements fz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f27993b;
    public c1l c;
    public ConstraintWidget.DimensionBehaviour d;
    public ex6 e = new ex6(this);
    public int f = 0;
    public boolean g = false;
    public iz5 h = new iz5(this);
    public iz5 i = new iz5(this);
    public b j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27994a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f27994a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27994a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27994a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27994a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27994a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public njr(ConstraintWidget constraintWidget) {
        this.f27993b = constraintWidget;
    }

    @Override // defpackage.fz5
    public void a(fz5 fz5Var) {
    }

    public final void b(iz5 iz5Var, iz5 iz5Var2, int i) {
        iz5Var.l.add(iz5Var2);
        iz5Var.f = i;
        iz5Var2.f22242k.add(iz5Var);
    }

    public final void c(iz5 iz5Var, iz5 iz5Var2, int i, ex6 ex6Var) {
        iz5Var.l.add(iz5Var2);
        iz5Var.l.add(this.e);
        iz5Var.h = i;
        iz5Var.i = ex6Var;
        iz5Var2.f22242k.add(iz5Var);
        ex6Var.f22242k.add(iz5Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f27993b;
            int i3 = constraintWidget.A;
            iMax = Math.max(constraintWidget.z, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f27993b;
            int i4 = constraintWidget2.D;
            iMax = Math.max(constraintWidget2.C, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public final iz5 h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int i = a.f27994a[constraintAnchor2.e.ordinal()];
        if (i == 1) {
            return constraintWidget.e.h;
        }
        if (i == 2) {
            return constraintWidget.e.i;
        }
        if (i == 3) {
            return constraintWidget.f.h;
        }
        if (i == 4) {
            return constraintWidget.f.f27079k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f.i;
    }

    public final iz5 i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        njr njrVar = i == 0 ? constraintWidget.e : constraintWidget.f;
        int i2 = a.f27994a[constraintAnchor2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return njrVar.i;
        }
        return njrVar.h;
    }

    public long j() {
        ex6 ex6Var = this.e;
        if (ex6Var.j) {
            return ex6Var.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        int i3 = this.f27992a;
        if (i3 == 0) {
            this.e.d(g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        if (i3 == 2) {
            ConstraintWidget constraintWidgetM = this.f27993b.M();
            if (constraintWidgetM != null) {
                ex6 ex6Var = (i == 0 ? constraintWidgetM.e : constraintWidgetM.f).e;
                if (ex6Var.j) {
                    ConstraintWidget constraintWidget = this.f27993b;
                    this.e.d(g((int) ((ex6Var.g * (i == 0 ? constraintWidget.B : constraintWidget.E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        ConstraintWidget constraintWidget2 = this.f27993b;
        njr njrVar = constraintWidget2.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = njrVar.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && njrVar.f27992a == 3) {
            mpq mpqVar = constraintWidget2.f;
            if (mpqVar.d == dimensionBehaviour2 && mpqVar.f27992a == 3) {
                return;
            }
        }
        if (i == 0) {
            njrVar = constraintWidget2.f;
        }
        if (njrVar.e.j) {
            float fX = constraintWidget2.x();
            this.e.d(i == 1 ? (int) ((njrVar.e.g / fX) + 0.5f) : (int) ((fX * njrVar.e.g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(fz5 fz5Var, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        iz5 iz5VarH = h(constraintAnchor);
        iz5 iz5VarH2 = h(constraintAnchor2);
        if (iz5VarH.j && iz5VarH2.j) {
            int iF = iz5VarH.g + constraintAnchor.f();
            int iF2 = iz5VarH2.g - constraintAnchor2.f();
            int i2 = iF2 - iF;
            if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            ex6 ex6Var = this.e;
            if (ex6Var.j) {
                if (ex6Var.g == i2) {
                    this.h.d(iF);
                    this.i.d(iF2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f27993b;
                float fA = i == 0 ? constraintWidget.A() : constraintWidget.T();
                if (iz5VarH == iz5VarH2) {
                    iF = iz5VarH.g;
                    iF2 = iz5VarH2.g;
                    fA = 0.5f;
                }
                this.h.d((int) (iF + 0.5f + (((iF2 - iF) - this.e.g) * fA)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    public void o(fz5 fz5Var) {
    }

    public void p(fz5 fz5Var) {
    }
}
