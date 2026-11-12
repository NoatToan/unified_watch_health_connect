package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class hz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f20614a;
    public d d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20615b = true;
    public boolean c = true;
    public ArrayList<njr> e = new ArrayList<>();
    public ArrayList<c1l> f = new ArrayList<>();
    public mg2.b g = null;
    public mg2.a h = new mg2.a();
    public ArrayList<c1l> i = new ArrayList<>();

    public hz5(d dVar) {
        this.f20614a = dVar;
        this.d = dVar;
    }

    public final void a(iz5 iz5Var, int i, int i2, iz5 iz5Var2, ArrayList<c1l> arrayList, c1l c1lVar) {
        njr njrVar = iz5Var.d;
        if (njrVar.c == null) {
            d dVar = this.f20614a;
            if (njrVar == dVar.e || njrVar == dVar.f) {
                return;
            }
            if (c1lVar == null) {
                c1lVar = new c1l(njrVar, i2);
                arrayList.add(c1lVar);
            }
            njrVar.c = c1lVar;
            c1lVar.a(njrVar);
            for (fz5 fz5Var : njrVar.h.f22242k) {
                if (fz5Var instanceof iz5) {
                    a((iz5) fz5Var, i, 0, iz5Var2, arrayList, c1lVar);
                }
            }
            for (fz5 fz5Var2 : njrVar.i.f22242k) {
                if (fz5Var2 instanceof iz5) {
                    a((iz5) fz5Var2, i, 1, iz5Var2, arrayList, c1lVar);
                }
            }
            if (i == 1 && (njrVar instanceof mpq)) {
                for (fz5 fz5Var3 : ((mpq) njrVar).f27079k.f22242k) {
                    if (fz5Var3 instanceof iz5) {
                        a((iz5) fz5Var3, i, 2, iz5Var2, arrayList, c1lVar);
                    }
                }
            }
            for (iz5 iz5Var3 : njrVar.h.l) {
                if (iz5Var3 == iz5Var2) {
                    c1lVar.f4834b = true;
                }
                a(iz5Var3, i, 0, iz5Var2, arrayList, c1lVar);
            }
            for (iz5 iz5Var4 : njrVar.i.l) {
                if (iz5Var4 == iz5Var2) {
                    c1lVar.f4834b = true;
                }
                a(iz5Var4, i, 1, iz5Var2, arrayList, c1lVar);
            }
            if (i == 1 && (njrVar instanceof mpq)) {
                Iterator<iz5> it = ((mpq) njrVar).f27079k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i, 2, iz5Var2, arrayList, c1lVar);
                }
            }
        }
    }

    public final boolean b(d dVar) {
        int iY;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int iZ;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        for (ConstraintWidget constraintWidget : dVar.V0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (constraintWidget.X() == 8) {
                constraintWidget.f1900a = true;
            } else {
                if (constraintWidget.B < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.w = 2;
                }
                if (constraintWidget.E < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.x = 2;
                }
                if (constraintWidget.x() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.w = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.x = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (constraintWidget.w == 0) {
                            constraintWidget.w = 3;
                        }
                        if (constraintWidget.x == 0) {
                            constraintWidget.x = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && constraintWidget.w == 1 && (constraintWidget.Q.f == null || constraintWidget.S.f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && constraintWidget.x == 1 && (constraintWidget.R.f == null || constraintWidget.T.f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                sac sacVar = constraintWidget.e;
                sacVar.d = dimensionBehaviour9;
                int i = constraintWidget.w;
                sacVar.f27992a = i;
                mpq mpqVar = constraintWidget.f;
                mpqVar.d = dimensionBehaviour10;
                int i2 = constraintWidget.x;
                mpqVar.f27992a = i2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 == dimensionBehaviour11 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour10 == dimensionBehaviour11 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int iY2 = constraintWidget.Y();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        iY = (dVar.Y() - constraintWidget.Q.g) - constraintWidget.S.g;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        iY = iY2;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int iZ2 = constraintWidget.z();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        iZ = (dVar.z() - constraintWidget.R.g) - constraintWidget.T.g;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        iZ = iZ2;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    l(constraintWidget, dimensionBehaviour, iY, dimensionBehaviour2, iZ);
                    constraintWidget.e.e.d(constraintWidget.Y());
                    constraintWidget.f.e.d(constraintWidget.z());
                    constraintWidget.f1900a = true;
                } else {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int iZ3 = constraintWidget.z();
                            int i3 = (int) ((iZ3 * constraintWidget.f0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour12, i3, dimensionBehaviour12, iZ3);
                            constraintWidget.e.e.d(constraintWidget.Y());
                            constraintWidget.f.e.d(constraintWidget.z());
                            constraintWidget.f1900a = true;
                        } else if (i == 1) {
                            l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            constraintWidget.e.e.m = constraintWidget.Y();
                        } else if (i == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dVar.b0[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                l(constraintWidget, dimensionBehaviour14, (int) ((constraintWidget.B * dVar.Y()) + 0.5f), dimensionBehaviour10, constraintWidget.z());
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.z());
                                constraintWidget.f1900a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.Y;
                            if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                                l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.z());
                                constraintWidget.f1900a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i2 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                l(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int iY3 = constraintWidget.Y();
                            float f = constraintWidget.f0;
                            if (constraintWidget.y() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour15, iY3, dimensionBehaviour15, (int) ((iY3 * f) + 0.5f));
                            constraintWidget.e.e.d(constraintWidget.Y());
                            constraintWidget.f.e.d(constraintWidget.z());
                            constraintWidget.f1900a = true;
                        } else if (i2 == 1) {
                            l(constraintWidget, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            constraintWidget.f.e.m = constraintWidget.z();
                        } else if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.b0[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                l(constraintWidget, dimensionBehaviour9, constraintWidget.Y(), dimensionBehaviour17, (int) ((constraintWidget.E * dVar.z()) + 0.5f));
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.z());
                                constraintWidget.f1900a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.Y;
                            if (constraintAnchorArr2[2].f == null || constraintAnchorArr2[3].f == null) {
                                l(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.z());
                                constraintWidget.f1900a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i == 1 || i2 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            l(constraintWidget, dimensionBehaviour18, 0, dimensionBehaviour18, 0);
                            constraintWidget.e.e.m = constraintWidget.Y();
                            constraintWidget.f.e.m = constraintWidget.z();
                        } else if (i2 == 2 && i == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.b0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour19 == dimensionBehaviour20 && dimensionBehaviourArr2[1] == dimensionBehaviour20) {
                                l(constraintWidget, dimensionBehaviour20, (int) ((constraintWidget.B * dVar.Y()) + 0.5f), dimensionBehaviour20, (int) ((constraintWidget.E * dVar.z()) + 0.5f));
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.z());
                                constraintWidget.f1900a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.e);
        this.i.clear();
        c1l.h = 0;
        i(this.f20614a.e, 0, this.i);
        i(this.f20614a.f, 1, this.i);
        this.f20615b = false;
    }

    public void d(ArrayList<njr> arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.d.V0) {
            if (constraintWidget instanceof f) {
                arrayList.add(new hab(constraintWidget));
            } else {
                if (constraintWidget.k0()) {
                    if (constraintWidget.c == null) {
                        constraintWidget.c = new at3(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.c);
                } else {
                    arrayList.add(constraintWidget.e);
                }
                if (constraintWidget.m0()) {
                    if (constraintWidget.d == null) {
                        constraintWidget.d = new at3(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.d);
                } else {
                    arrayList.add(constraintWidget.f);
                }
                if (constraintWidget instanceof f7c) {
                    arrayList.add(new e7c(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<njr> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (njr njrVar : arrayList) {
            if (njrVar.f27993b != this.d) {
                njrVar.d();
            }
        }
    }

    public final int e(d dVar, int i) {
        int size = this.i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.i.get(i2).b(dVar, i));
        }
        return (int) jMax;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f20615b || this.c) {
            for (ConstraintWidget constraintWidget : this.f20614a.V0) {
                constraintWidget.p();
                constraintWidget.f1900a = false;
                constraintWidget.e.r();
                constraintWidget.f.q();
            }
            this.f20614a.p();
            d dVar = this.f20614a;
            dVar.f1900a = false;
            dVar.e.r();
            this.f20614a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.f20614a.q1(0);
        this.f20614a.r1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW = this.f20614a.w(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = this.f20614a.w(1);
        if (this.f20615b) {
            c();
        }
        int iZ = this.f20614a.Z();
        int iA0 = this.f20614a.a0();
        this.f20614a.e.h.d(iZ);
        this.f20614a.f.h.d(iA0);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourW == dimensionBehaviour || dimensionBehaviourW2 == dimensionBehaviour) {
            if (z4) {
                Iterator<njr> it = this.e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && dimensionBehaviourW == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f20614a.T0(ConstraintWidget.DimensionBehaviour.FIXED);
                d dVar2 = this.f20614a;
                dVar2.o1(e(dVar2, 0));
                d dVar3 = this.f20614a;
                dVar3.e.e.d(dVar3.Y());
            }
            if (z4 && dimensionBehaviourW2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f20614a.k1(ConstraintWidget.DimensionBehaviour.FIXED);
                d dVar4 = this.f20614a;
                dVar4.P0(e(dVar4, 1));
                d dVar5 = this.f20614a;
                dVar5.f.e.d(dVar5.z());
            }
        }
        d dVar6 = this.f20614a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iY = dVar6.Y() + iZ;
            this.f20614a.e.i.d(iY);
            this.f20614a.e.e.d(iY - iZ);
            m();
            d dVar7 = this.f20614a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.b0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iZ2 = dVar7.z() + iA0;
                this.f20614a.f.i.d(iZ2);
                this.f20614a.f.e.d(iZ2 - iA0);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (njr njrVar : this.e) {
            if (njrVar.f27993b != this.f20614a || njrVar.g) {
                njrVar.e();
            }
        }
        for (njr njrVar2 : this.e) {
            if (z2 || njrVar2.f27993b != this.f20614a) {
                if (!njrVar2.h.j || ((!njrVar2.i.j && !(njrVar2 instanceof hab)) || (!njrVar2.e.j && !(njrVar2 instanceof at3) && !(njrVar2 instanceof hab)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f20614a.T0(dimensionBehaviourW);
        this.f20614a.k1(dimensionBehaviourW2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f20615b) {
            for (ConstraintWidget constraintWidget : this.f20614a.V0) {
                constraintWidget.p();
                constraintWidget.f1900a = false;
                sac sacVar = constraintWidget.e;
                sacVar.e.j = false;
                sacVar.g = false;
                sacVar.r();
                mpq mpqVar = constraintWidget.f;
                mpqVar.e.j = false;
                mpqVar.g = false;
                mpqVar.q();
            }
            this.f20614a.p();
            d dVar = this.f20614a;
            dVar.f1900a = false;
            sac sacVar2 = dVar.e;
            sacVar2.e.j = false;
            sacVar2.g = false;
            sacVar2.r();
            mpq mpqVar2 = this.f20614a.f;
            mpqVar2.e.j = false;
            mpqVar2.g = false;
            mpqVar2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.f20614a.q1(0);
        this.f20614a.r1(0);
        this.f20614a.e.h.d(0);
        this.f20614a.f.h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    public boolean h(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW = this.f20614a.w(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = this.f20614a.w(1);
        int iZ = this.f20614a.Z();
        int iA0 = this.f20614a.a0();
        if (z4 && (dimensionBehaviourW == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourW2 == dimensionBehaviour)) {
            for (njr njrVar : this.e) {
                if (njrVar.f == i && !njrVar.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && dimensionBehaviourW == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f20614a.T0(ConstraintWidget.DimensionBehaviour.FIXED);
                    d dVar = this.f20614a;
                    dVar.o1(e(dVar, 0));
                    d dVar2 = this.f20614a;
                    dVar2.e.e.d(dVar2.Y());
                }
            } else if (z4 && dimensionBehaviourW2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f20614a.k1(ConstraintWidget.DimensionBehaviour.FIXED);
                d dVar3 = this.f20614a;
                dVar3.P0(e(dVar3, 1));
                d dVar4 = this.f20614a;
                dVar4.f.e.d(dVar4.z());
            }
        }
        if (i == 0) {
            d dVar5 = this.f20614a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.b0[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iY = dVar5.Y() + iZ;
                this.f20614a.e.i.d(iY);
                this.f20614a.e.e.d(iY - iZ);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            d dVar6 = this.f20614a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.b0[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iZ2 = dVar6.z() + iA0;
                this.f20614a.f.i.d(iZ2);
                this.f20614a.f.e.d(iZ2 - iA0);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m();
        for (njr njrVar2 : this.e) {
            if (njrVar2.f == i && (njrVar2.f27993b != this.f20614a || njrVar2.g)) {
                njrVar2.e();
            }
        }
        for (njr njrVar3 : this.e) {
            if (njrVar3.f == i && (z2 || njrVar3.f27993b != this.f20614a)) {
                if (!njrVar3.h.j || !njrVar3.i.j || (!(njrVar3 instanceof at3) && !njrVar3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f20614a.T0(dimensionBehaviourW);
        this.f20614a.k1(dimensionBehaviourW2);
        return z3;
    }

    public final void i(njr njrVar, int i, ArrayList<c1l> arrayList) {
        for (fz5 fz5Var : njrVar.h.f22242k) {
            if (fz5Var instanceof iz5) {
                a((iz5) fz5Var, i, 0, njrVar.i, arrayList, null);
            } else if (fz5Var instanceof njr) {
                a(((njr) fz5Var).h, i, 0, njrVar.i, arrayList, null);
            }
        }
        for (fz5 fz5Var2 : njrVar.i.f22242k) {
            if (fz5Var2 instanceof iz5) {
                a((iz5) fz5Var2, i, 1, njrVar.h, arrayList, null);
            } else if (fz5Var2 instanceof njr) {
                a(((njr) fz5Var2).i, i, 1, njrVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (fz5 fz5Var3 : ((mpq) njrVar).f27079k.f22242k) {
                if (fz5Var3 instanceof iz5) {
                    a((iz5) fz5Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.f20615b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        mg2.a aVar = this.h;
        aVar.f26125a = dimensionBehaviour;
        aVar.f26126b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.g.a(constraintWidget, aVar);
        constraintWidget.o1(this.h.e);
        constraintWidget.P0(this.h.f);
        constraintWidget.O0(this.h.h);
        constraintWidget.E0(this.h.g);
    }

    public void m() {
        ex6 ex6Var;
        for (ConstraintWidget constraintWidget : this.f20614a.V0) {
            if (!constraintWidget.f1900a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.w;
                int i2 = constraintWidget.x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                ex6 ex6Var2 = constraintWidget.e.e;
                boolean z3 = ex6Var2.j;
                ex6 ex6Var3 = constraintWidget.f.e;
                boolean z4 = ex6Var3.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(constraintWidget, dimensionBehaviour4, ex6Var2.g, dimensionBehaviour4, ex6Var3.g);
                    constraintWidget.f1900a = true;
                } else if (z3 && z) {
                    l(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, ex6Var2.g, dimensionBehaviour3, ex6Var3.g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f.e.m = constraintWidget.z();
                    } else {
                        constraintWidget.f.e.d(constraintWidget.z());
                        constraintWidget.f1900a = true;
                    }
                } else if (z4 && z2) {
                    l(constraintWidget, dimensionBehaviour3, ex6Var2.g, ConstraintWidget.DimensionBehaviour.FIXED, ex6Var3.g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.e.e.m = constraintWidget.Y();
                    } else {
                        constraintWidget.e.e.d(constraintWidget.Y());
                        constraintWidget.f1900a = true;
                    }
                }
                if (constraintWidget.f1900a && (ex6Var = constraintWidget.f.l) != null) {
                    ex6Var.d(constraintWidget.r());
                }
            }
        }
    }

    public void n(mg2.b bVar) {
        this.g = bVar;
    }
}
