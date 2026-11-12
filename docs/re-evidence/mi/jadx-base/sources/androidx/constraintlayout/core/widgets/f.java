package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class f extends ConstraintWidget {
    public float V0 = -1.0f;
    public int W0 = -1;
    public int X0 = -1;
    public boolean Y0 = true;
    public ConstraintAnchor Z0 = this.R;
    public int a1 = 0;
    public int b1 = 0;
    public boolean c1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1914a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f1914a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1914a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1914a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1914a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1914a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1914a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1914a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1914a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1914a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.Z.clear();
        this.Z.add(this.Z0);
        int length = this.Y.length;
        for (int i = 0; i < length; i++) {
            this.Y[i] = this.Z0;
        }
    }

    public void A1(int i) {
        this.Z0.t(i);
        this.c1 = true;
    }

    public void B1(int i) {
        if (i > -1) {
            this.V0 = -1.0f;
            this.W0 = i;
            this.X0 = -1;
        }
    }

    public void C1(int i) {
        if (i > -1) {
            this.V0 = -1.0f;
            this.W0 = -1;
            this.X0 = i;
        }
    }

    public void D1(float f) {
        if (f > -1.0f) {
            this.V0 = f;
            this.W0 = -1;
            this.X0 = -1;
        }
    }

    public void E1(int i) {
        if (this.a1 == i) {
            return;
        }
        this.a1 = i;
        this.Z.clear();
        if (this.a1 == 1) {
            this.Z0 = this.Q;
        } else {
            this.Z0 = this.R;
        }
        this.Z.add(this.Z0);
        int length = this.Y.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.Y[i2] = this.Z0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.c cVar, boolean z) {
        d dVar = (d) M();
        if (dVar == null) {
            return;
        }
        ConstraintAnchor constraintAnchorQ = dVar.q(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorQ2 = dVar.q(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.c0;
        boolean z2 = constraintWidget != null && constraintWidget.b0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.a1 == 0) {
            constraintAnchorQ = dVar.q(ConstraintAnchor.Type.TOP);
            constraintAnchorQ2 = dVar.q(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.c0;
            z2 = constraintWidget2 != null && constraintWidget2.b0[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.c1 && this.Z0.n()) {
            SolverVariable solverVariableQ = cVar.q(this.Z0);
            cVar.f(solverVariableQ, this.Z0.e());
            if (this.W0 != -1) {
                if (z2) {
                    cVar.h(cVar.q(constraintAnchorQ2), solverVariableQ, 0, 5);
                }
            } else if (this.X0 != -1 && z2) {
                SolverVariable solverVariableQ2 = cVar.q(constraintAnchorQ2);
                cVar.h(solverVariableQ, cVar.q(constraintAnchorQ), 0, 5);
                cVar.h(solverVariableQ2, solverVariableQ, 0, 5);
            }
            this.c1 = false;
            return;
        }
        if (this.W0 != -1) {
            SolverVariable solverVariableQ3 = cVar.q(this.Z0);
            cVar.e(solverVariableQ3, cVar.q(constraintAnchorQ), this.W0, 8);
            if (z2) {
                cVar.h(cVar.q(constraintAnchorQ2), solverVariableQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.X0 == -1) {
            if (this.V0 != -1.0f) {
                cVar.d(androidx.constraintlayout.core.c.s(cVar, cVar.q(this.Z0), cVar.q(constraintAnchorQ2), this.V0));
                return;
            }
            return;
        }
        SolverVariable solverVariableQ4 = cVar.q(this.Z0);
        SolverVariable solverVariableQ5 = cVar.q(constraintAnchorQ2);
        cVar.e(solverVariableQ4, solverVariableQ5, -this.X0, 8);
        if (z2) {
            cVar.h(solverVariableQ4, cVar.q(constraintAnchorQ), 0, 5);
            cVar.h(solverVariableQ5, solverVariableQ4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.V0 = fVar.V0;
        this.W0 = fVar.W0;
        this.X0 = fVar.X0;
        this.Y0 = fVar.Y0;
        E1(fVar.a1);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean p0() {
        return this.c1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor q(ConstraintAnchor.Type type) {
        int i = a.f1914a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.a1 == 1) {
                return this.Z0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.a1 == 0) {
            return this.Z0;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean q0() {
        return this.c1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void u1(androidx.constraintlayout.core.c cVar, boolean z) {
        if (M() == null) {
            return;
        }
        int iY = cVar.y(this.Z0);
        if (this.a1 == 1) {
            q1(iY);
            r1(0);
            P0(M().z());
            o1(0);
            return;
        }
        q1(0);
        r1(iY);
        o1(M().Y());
        P0(0);
    }

    public ConstraintAnchor v1() {
        return this.Z0;
    }

    public int w1() {
        return this.a1;
    }

    public int x1() {
        return this.W0;
    }

    public int y1() {
        return this.X0;
    }

    public float z1() {
        return this.V0;
    }
}
