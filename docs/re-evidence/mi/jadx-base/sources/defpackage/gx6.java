package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static mg2.a f19428a = new mg2.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19429b = 0;
    public static int c = 0;

    public static boolean a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV = constraintWidget.V();
        d dVar = constraintWidget.M() != null ? (d) constraintWidget.M() : null;
        if (dVar != null) {
            dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.V();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviourC == dimensionBehaviour5 || constraintWidget.p0() || dimensionBehaviourC == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourC == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.w == 0 && constraintWidget.f0 == 0.0f && constraintWidget.c0(0)) || (dimensionBehaviourC == dimensionBehaviour2 && constraintWidget.w == 1 && constraintWidget.f0(0, constraintWidget.Y()));
        boolean z2 = dimensionBehaviourV == dimensionBehaviour5 || constraintWidget.q0() || dimensionBehaviourV == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourV == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.x == 0 && constraintWidget.f0 == 0.0f && constraintWidget.c0(1)) || (dimensionBehaviourV == dimensionBehaviour && constraintWidget.x == 1 && constraintWidget.f0(1, constraintWidget.z()));
        if (constraintWidget.f0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i, ConstraintWidget constraintWidget, mg2.b bVar, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.i0()) {
            return;
        }
        boolean z2 = true;
        f19429b++;
        if (!(constraintWidget instanceof d) && constraintWidget.o0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                d.X1(i2, constraintWidget, bVar, new mg2.a(), mg2.a.f26124k);
            }
        }
        ConstraintAnchor constraintAnchorQ = constraintWidget.q(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorQ2 = constraintWidget.q(ConstraintAnchor.Type.RIGHT);
        int iE = constraintAnchorQ.e();
        int iE2 = constraintAnchorQ2.e();
        if (constraintAnchorQ.d() != null && constraintAnchorQ.n()) {
            Iterator<ConstraintAnchor> it = constraintAnchorQ.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i3 = i + 1;
                boolean zA = a(i3, constraintWidget2);
                if (constraintWidget2.o0() && zA) {
                    d.X1(i3, constraintWidget2, bVar, new mg2.a(), mg2.a.f26124k);
                }
                boolean z3 = ((next == constraintWidget2.Q && (constraintAnchor4 = constraintWidget2.S.f) != null && constraintAnchor4.n()) || (next == constraintWidget2.S && (constraintAnchor3 = constraintWidget2.Q.f) != null && constraintAnchor3.n())) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget2.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourC != dimensionBehaviour || zA) {
                    if (!constraintWidget2.o0()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.Q;
                        if (next == constraintAnchor5 && constraintWidget2.S.f == null) {
                            int iF = constraintAnchor5.f() + iE;
                            constraintWidget2.J0(iF, constraintWidget2.Y() + iF);
                            b(i3, constraintWidget2, bVar, z);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.S;
                            if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                                int iF2 = iE - constraintAnchor6.f();
                                constraintWidget2.J0(iF2 - constraintWidget2.Y(), iF2);
                                b(i3, constraintWidget2, bVar, z);
                            } else if (z3 && !constraintWidget2.k0()) {
                                d(i3, bVar, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.C() == dimensionBehaviour && constraintWidget2.A >= 0 && constraintWidget2.z >= 0 && ((constraintWidget2.X() == 8 || (constraintWidget2.w == 0 && constraintWidget2.x() == 0.0f)) && !constraintWidget2.k0() && !constraintWidget2.n0() && z3 && !constraintWidget2.k0())) {
                    e(i3, constraintWidget, bVar, constraintWidget2, z);
                }
                z2 = true;
            }
        }
        if (constraintWidget instanceof f) {
            return;
        }
        if (constraintAnchorQ2.d() != null && constraintAnchorQ2.n()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, constraintWidget3);
                if (constraintWidget3.o0() && zA2) {
                    d.X1(i4, constraintWidget3, bVar, new mg2.a(), mg2.a.f26124k);
                }
                boolean z4 = (next2 == constraintWidget3.Q && (constraintAnchor2 = constraintWidget3.S.f) != null && constraintAnchor2.n()) || (next2 == constraintWidget3.S && (constraintAnchor = constraintWidget3.Q.f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC2 = constraintWidget3.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourC2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.o0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.Q;
                        if (next2 == constraintAnchor7 && constraintWidget3.S.f == null) {
                            int iF3 = constraintAnchor7.f() + iE2;
                            constraintWidget3.J0(iF3, constraintWidget3.Y() + iF3);
                            b(i4, constraintWidget3, bVar, z);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.S;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                                int iF4 = iE2 - constraintAnchor8.f();
                                constraintWidget3.J0(iF4 - constraintWidget3.Y(), iF4);
                                b(i4, constraintWidget3, bVar, z);
                            } else if (z4 && !constraintWidget3.k0()) {
                                d(i4, bVar, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.C() == dimensionBehaviour2 && constraintWidget3.A >= 0 && constraintWidget3.z >= 0 && (constraintWidget3.X() == 8 || (constraintWidget3.w == 0 && constraintWidget3.x() == 0.0f))) {
                    if (!constraintWidget3.k0() && !constraintWidget3.n0() && z4 && !constraintWidget3.k0()) {
                        e(i4, constraintWidget, bVar, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.s0();
    }

    public static void c(int i, a aVar, mg2.b bVar, int i2, boolean z) {
        if (aVar.x1()) {
            if (i2 == 0) {
                b(i + 1, aVar, bVar, z);
            } else {
                i(i + 1, aVar, bVar);
            }
        }
    }

    public static void d(int i, mg2.b bVar, ConstraintWidget constraintWidget, boolean z) {
        float fA = constraintWidget.A();
        int iE = constraintWidget.Q.f.e();
        int iE2 = constraintWidget.S.f.e();
        int iF = constraintWidget.Q.f() + iE;
        int iF2 = iE2 - constraintWidget.S.f();
        if (iE == iE2) {
            fA = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iY = constraintWidget.Y();
        int i2 = (iE2 - iE) - iY;
        if (iE > iE2) {
            i2 = (iE - iE2) - iY;
        }
        int i3 = ((int) (i2 > 0 ? (fA * i2) + 0.5f : fA * i2)) + iE;
        int i4 = i3 + iY;
        if (iE > iE2) {
            i4 = i3 - iY;
        }
        constraintWidget.J0(i3, i4);
        b(i + 1, constraintWidget, bVar, z);
    }

    public static void e(int i, ConstraintWidget constraintWidget, mg2.b bVar, ConstraintWidget constraintWidget2, boolean z) {
        float fA = constraintWidget2.A();
        int iE = constraintWidget2.Q.f.e() + constraintWidget2.Q.f();
        int iE2 = constraintWidget2.S.f.e() - constraintWidget2.S.f();
        if (iE2 >= iE) {
            int iY = constraintWidget2.Y();
            if (constraintWidget2.X() != 8) {
                int i2 = constraintWidget2.w;
                if (i2 == 2) {
                    iY = (int) (constraintWidget2.A() * 0.5f * (constraintWidget instanceof d ? constraintWidget.Y() : constraintWidget.M().Y()));
                } else if (i2 == 0) {
                    iY = iE2 - iE;
                }
                iY = Math.max(constraintWidget2.z, iY);
                int i3 = constraintWidget2.A;
                if (i3 > 0) {
                    iY = Math.min(i3, iY);
                }
            }
            int i4 = iE + ((int) ((fA * ((iE2 - iE) - iY)) + 0.5f));
            constraintWidget2.J0(i4, iY + i4);
            b(i + 1, constraintWidget2, bVar, z);
        }
    }

    public static void f(int i, mg2.b bVar, ConstraintWidget constraintWidget) {
        float fT = constraintWidget.T();
        int iE = constraintWidget.R.f.e();
        int iE2 = constraintWidget.T.f.e();
        int iF = constraintWidget.R.f() + iE;
        int iF2 = iE2 - constraintWidget.T.f();
        if (iE == iE2) {
            fT = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iZ = constraintWidget.z();
        int i2 = (iE2 - iE) - iZ;
        if (iE > iE2) {
            i2 = (iE - iE2) - iZ;
        }
        int i3 = (int) (i2 > 0 ? (fT * i2) + 0.5f : fT * i2);
        int i4 = iE + i3;
        int i5 = i4 + iZ;
        if (iE > iE2) {
            i4 = iE - i3;
            i5 = i4 - iZ;
        }
        constraintWidget.M0(i4, i5);
        i(i + 1, constraintWidget, bVar);
    }

    public static void g(int i, ConstraintWidget constraintWidget, mg2.b bVar, ConstraintWidget constraintWidget2) {
        float fT = constraintWidget2.T();
        int iE = constraintWidget2.R.f.e() + constraintWidget2.R.f();
        int iE2 = constraintWidget2.T.f.e() - constraintWidget2.T.f();
        if (iE2 >= iE) {
            int iZ = constraintWidget2.z();
            if (constraintWidget2.X() != 8) {
                int i2 = constraintWidget2.x;
                if (i2 == 2) {
                    iZ = (int) (fT * 0.5f * (constraintWidget instanceof d ? constraintWidget.z() : constraintWidget.M().z()));
                } else if (i2 == 0) {
                    iZ = iE2 - iE;
                }
                iZ = Math.max(constraintWidget2.C, iZ);
                int i3 = constraintWidget2.D;
                if (i3 > 0) {
                    iZ = Math.min(i3, iZ);
                }
            }
            int i4 = iE + ((int) ((fT * ((iE2 - iE) - iZ)) + 0.5f));
            constraintWidget2.M0(i4, iZ + i4);
            i(i + 1, constraintWidget2, bVar);
        }
    }

    public static void h(d dVar, mg2.b bVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = dVar.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV = dVar.V();
        f19429b = 0;
        c = 0;
        dVar.y0();
        ArrayList<ConstraintWidget> arrayListV1 = dVar.v1();
        int size = arrayListV1.size();
        for (int i = 0; i < size; i++) {
            arrayListV1.get(i).y0();
        }
        boolean zU1 = dVar.U1();
        if (dimensionBehaviourC == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.J0(0, dVar.Y());
        } else {
            dVar.K0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListV1.get(i2);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.w1() == 1) {
                    if (fVar.x1() != -1) {
                        fVar.A1(fVar.x1());
                    } else if (fVar.y1() != -1 && dVar.p0()) {
                        fVar.A1(dVar.Y() - fVar.y1());
                    } else if (dVar.p0()) {
                        fVar.A1((int) ((fVar.z1() * dVar.Y()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof a) && ((a) constraintWidget).B1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = arrayListV1.get(i3);
                if (constraintWidget2 instanceof f) {
                    f fVar2 = (f) constraintWidget2;
                    if (fVar2.w1() == 1) {
                        b(0, fVar2, bVar, zU1);
                    }
                }
            }
        }
        b(0, dVar, bVar, zU1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = arrayListV1.get(i4);
                if (constraintWidget3 instanceof a) {
                    a aVar = (a) constraintWidget3;
                    if (aVar.B1() == 0) {
                        c(0, aVar, bVar, 0, zU1);
                    }
                }
            }
        }
        if (dimensionBehaviourV == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.M0(0, dVar.z());
        } else {
            dVar.L0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = arrayListV1.get(i5);
            if (constraintWidget4 instanceof f) {
                f fVar3 = (f) constraintWidget4;
                if (fVar3.w1() == 0) {
                    if (fVar3.x1() != -1) {
                        fVar3.A1(fVar3.x1());
                    } else if (fVar3.y1() != -1 && dVar.q0()) {
                        fVar3.A1(dVar.z() - fVar3.y1());
                    } else if (dVar.q0()) {
                        fVar3.A1((int) ((fVar3.z1() * dVar.z()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).B1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = arrayListV1.get(i6);
                if (constraintWidget5 instanceof f) {
                    f fVar4 = (f) constraintWidget5;
                    if (fVar4.w1() == 0) {
                        i(1, fVar4, bVar);
                    }
                }
            }
        }
        i(0, dVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = arrayListV1.get(i7);
                if (constraintWidget6 instanceof a) {
                    a aVar2 = (a) constraintWidget6;
                    if (aVar2.B1() == 1) {
                        c(0, aVar2, bVar, 1, zU1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = arrayListV1.get(i8);
            if (constraintWidget7.o0() && a(0, constraintWidget7)) {
                d.X1(0, constraintWidget7, bVar, f19428a, mg2.a.f26124k);
                if (!(constraintWidget7 instanceof f)) {
                    b(0, constraintWidget7, bVar, zU1);
                    i(0, constraintWidget7, bVar);
                } else if (((f) constraintWidget7).w1() == 0) {
                    i(0, constraintWidget7, bVar);
                } else {
                    b(0, constraintWidget7, bVar, zU1);
                }
            }
        }
    }

    public static void i(int i, ConstraintWidget constraintWidget, mg2.b bVar) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.r0()) {
            return;
        }
        c++;
        if (!(constraintWidget instanceof d) && constraintWidget.o0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                d.X1(i2, constraintWidget, bVar, new mg2.a(), mg2.a.f26124k);
            }
        }
        ConstraintAnchor constraintAnchorQ = constraintWidget.q(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorQ2 = constraintWidget.q(ConstraintAnchor.Type.BOTTOM);
        int iE = constraintAnchorQ.e();
        int iE2 = constraintAnchorQ2.e();
        if (constraintAnchorQ.d() != null && constraintAnchorQ.n()) {
            Iterator<ConstraintAnchor> it = constraintAnchorQ.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i3 = i + 1;
                boolean zA = a(i3, constraintWidget2);
                if (constraintWidget2.o0() && zA) {
                    d.X1(i3, constraintWidget2, bVar, new mg2.a(), mg2.a.f26124k);
                }
                boolean z = (next == constraintWidget2.R && (constraintAnchor4 = constraintWidget2.T.f) != null && constraintAnchor4.n()) || (next == constraintWidget2.T && (constraintAnchor3 = constraintWidget2.R.f) != null && constraintAnchor3.n());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourV = constraintWidget2.V();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourV != dimensionBehaviour || zA) {
                    if (!constraintWidget2.o0()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.R;
                        if (next == constraintAnchor5 && constraintWidget2.T.f == null) {
                            int iF = constraintAnchor5.f() + iE;
                            constraintWidget2.M0(iF, constraintWidget2.z() + iF);
                            i(i3, constraintWidget2, bVar);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.T;
                            if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                                int iF2 = iE - constraintAnchor6.f();
                                constraintWidget2.M0(iF2 - constraintWidget2.z(), iF2);
                                i(i3, constraintWidget2, bVar);
                            } else if (z && !constraintWidget2.m0()) {
                                f(i3, bVar, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.V() == dimensionBehaviour && constraintWidget2.D >= 0 && constraintWidget2.C >= 0 && (constraintWidget2.X() == 8 || (constraintWidget2.x == 0 && constraintWidget2.x() == 0.0f))) {
                    if (!constraintWidget2.m0() && !constraintWidget2.n0() && z && !constraintWidget2.m0()) {
                        g(i3, constraintWidget, bVar, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof f) {
            return;
        }
        if (constraintAnchorQ2.d() != null && constraintAnchorQ2.n()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, constraintWidget3);
                if (constraintWidget3.o0() && zA2) {
                    d.X1(i4, constraintWidget3, bVar, new mg2.a(), mg2.a.f26124k);
                }
                boolean z2 = (next2 == constraintWidget3.R && (constraintAnchor2 = constraintWidget3.T.f) != null && constraintAnchor2.n()) || (next2 == constraintWidget3.T && (constraintAnchor = constraintWidget3.R.f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourV2 = constraintWidget3.V();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourV2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.o0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.R;
                        if (next2 == constraintAnchor7 && constraintWidget3.T.f == null) {
                            int iF3 = constraintAnchor7.f() + iE2;
                            constraintWidget3.M0(iF3, constraintWidget3.z() + iF3);
                            i(i4, constraintWidget3, bVar);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.T;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                                int iF4 = iE2 - constraintAnchor8.f();
                                constraintWidget3.M0(iF4 - constraintWidget3.z(), iF4);
                                i(i4, constraintWidget3, bVar);
                            } else if (z2 && !constraintWidget3.m0()) {
                                f(i4, bVar, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.V() == dimensionBehaviour2 && constraintWidget3.D >= 0 && constraintWidget3.C >= 0 && (constraintWidget3.X() == 8 || (constraintWidget3.x == 0 && constraintWidget3.x() == 0.0f))) {
                    if (!constraintWidget3.m0() && !constraintWidget3.n0() && z2 && !constraintWidget3.m0()) {
                        g(i4, constraintWidget, bVar, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorQ3 = constraintWidget.q(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorQ3.d() != null && constraintAnchorQ3.n()) {
            int iE3 = constraintAnchorQ3.e();
            for (ConstraintAnchor constraintAnchor9 : constraintAnchorQ3.d()) {
                ConstraintWidget constraintWidget4 = constraintAnchor9.d;
                int i5 = i + 1;
                boolean zA3 = a(i5, constraintWidget4);
                if (constraintWidget4.o0() && zA3) {
                    d.X1(i5, constraintWidget4, bVar, new mg2.a(), mg2.a.f26124k);
                }
                if (constraintWidget4.V() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zA3) {
                    if (!constraintWidget4.o0() && constraintAnchor9 == constraintWidget4.U) {
                        constraintWidget4.I0(constraintAnchor9.f() + iE3);
                        i(i5, constraintWidget4, bVar);
                    }
                }
            }
        }
        constraintWidget.t0();
    }
}
