package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidget f1906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintWidget f1907b;
    public ConstraintWidget c;
    public ConstraintWidget d;
    public ConstraintWidget e;
    public ConstraintWidget f;
    public ConstraintWidget g;
    public ArrayList<ConstraintWidget> h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1908k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1909r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f1906a = constraintWidget;
        this.p = i;
        this.q = z;
    }

    public static boolean c(ConstraintWidget constraintWidget, int i) {
        int i2;
        return constraintWidget.X() != 8 && constraintWidget.b0[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i2 = constraintWidget.y[i]) == 0 || i2 == 3);
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        ConstraintWidget constraintWidget = this.f1906a;
        this.o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z = false;
        while (!z) {
            this.i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.P0;
            int i2 = this.p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.O0[i2] = null;
            if (constraintWidget.X() != 8) {
                this.l++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget.w(this.p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourW != dimensionBehaviour) {
                    this.m += constraintWidget.G(this.p);
                }
                int iF = this.m + constraintWidget.Y[i].f();
                this.m = iF;
                int i3 = i + 1;
                this.m = iF + constraintWidget.Y[i3].f();
                int iF2 = this.n + constraintWidget.Y[i].f();
                this.n = iF2;
                this.n = iF2 + constraintWidget.Y[i3].f();
                if (this.f1907b == null) {
                    this.f1907b = constraintWidget;
                }
                this.d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
                int i4 = this.p;
                if (dimensionBehaviourArr[i4] == dimensionBehaviour) {
                    int i5 = constraintWidget.y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f = constraintWidget.N0[i4];
                        if (f > 0.0f) {
                            this.f1908k += f;
                        }
                        if (c(constraintWidget, i4)) {
                            if (f < 0.0f) {
                                this.f1909r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(constraintWidget);
                        }
                        if (this.f == null) {
                            this.f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.O0[this.p] = constraintWidget;
                        }
                        this.g = constraintWidget;
                    }
                    if (this.p == 0) {
                        if (constraintWidget.w != 0 || constraintWidget.z != 0 || constraintWidget.A != 0) {
                            this.o = false;
                        }
                    } else if (constraintWidget.x != 0 || constraintWidget.C != 0 || constraintWidget.D != 0) {
                        this.o = false;
                    }
                    if (constraintWidget.f0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.P0[this.p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.Y[i + 1].f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.Y[i].f;
                if (constraintAnchor2 != null && constraintAnchor2.d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f1907b;
        if (constraintWidget6 != null) {
            this.m -= constraintWidget6.Y[i].f();
        }
        ConstraintWidget constraintWidget7 = this.d;
        if (constraintWidget7 != null) {
            this.m -= constraintWidget7.Y[i + 1].f();
        }
        this.c = constraintWidget;
        if (this.p == 0 && this.q) {
            this.e = constraintWidget;
        } else {
            this.e = this.f1906a;
        }
        this.t = this.s && this.f1909r;
    }
}
