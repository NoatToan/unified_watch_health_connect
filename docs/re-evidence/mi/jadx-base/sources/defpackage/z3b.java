package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z3b {
    public static bir a(ConstraintWidget constraintWidget, int i, ArrayList<bir> arrayList, bir birVar) {
        int iW1;
        int i2 = i == 0 ? constraintWidget.S0 : constraintWidget.T0;
        if (i2 != -1 && (birVar == null || i2 != birVar.f4269b)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                bir birVar2 = arrayList.get(i3);
                if (birVar2.c() == i2) {
                    if (birVar != null) {
                        birVar.g(i, birVar2);
                        arrayList.remove(birVar);
                    }
                    birVar = birVar2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return birVar;
        }
        if (birVar == null) {
            if ((constraintWidget instanceof f7c) && (iW1 = ((f7c) constraintWidget).w1(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    bir birVar3 = arrayList.get(i4);
                    if (birVar3.c() == iW1) {
                        birVar = birVar3;
                        break;
                    }
                }
            }
            if (birVar == null) {
                birVar = new bir(i);
            }
            arrayList.add(birVar);
        }
        if (birVar.a(constraintWidget)) {
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                fVar.v1().c(fVar.w1() == 0 ? 1 : 0, arrayList, birVar);
            }
            if (i == 0) {
                constraintWidget.S0 = birVar.c();
                constraintWidget.Q.c(i, arrayList, birVar);
                constraintWidget.S.c(i, arrayList, birVar);
            } else {
                constraintWidget.T0 = birVar.c();
                constraintWidget.R.c(i, arrayList, birVar);
                constraintWidget.U.c(i, arrayList, birVar);
                constraintWidget.T.c(i, arrayList, birVar);
            }
            constraintWidget.X.c(i, arrayList, birVar);
        }
        return birVar;
    }

    public static bir b(ArrayList<bir> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bir birVar = arrayList.get(i2);
            if (i == birVar.f4269b) {
                return birVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0348  */
    public static boolean c(d dVar, mg2.b bVar) {
        bir birVar;
        boolean z;
        boolean z2;
        bir birVar2;
        ArrayList<ConstraintWidget> arrayListV1 = dVar.v1();
        int size = arrayListV1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListV1.get(i2);
            if (!d(dVar.C(), dVar.V(), constraintWidget.C(), constraintWidget.V()) || (constraintWidget instanceof e)) {
                return false;
            }
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList<f7c> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<f7c> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            ConstraintWidget constraintWidget2 = arrayListV1.get(i3);
            if (!d(dVar.C(), dVar.V(), constraintWidget2.C(), constraintWidget2.V())) {
                d.X1(i, constraintWidget2, bVar, dVar.z1, mg2.a.f26124k);
            }
            boolean z3 = constraintWidget2 instanceof f;
            if (z3) {
                f fVar = (f) constraintWidget2;
                if (fVar.w1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(fVar);
                }
                if (fVar.w1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fVar);
                }
            }
            if (constraintWidget2 instanceof f7c) {
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    if (aVar.B1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.B1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    f7c f7cVar = (f7c) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(f7cVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(f7cVar);
                }
            }
            if (constraintWidget2.Q.f == null && constraintWidget2.S.f == null && !z3 && !(constraintWidget2 instanceof a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.R.f == null && constraintWidget2.T.f == null && constraintWidget2.U.f == null && !z3 && !(constraintWidget2 instanceof a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i3++;
            i = 0;
        }
        ArrayList<bir> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((f) it.next(), 0, arrayList7, null);
            }
        }
        int i4 = 0;
        bir birVar3 = null;
        if (arrayList2 != null) {
            for (f7c f7cVar2 : arrayList2) {
                bir birVarA = a(f7cVar2, i4, arrayList7, birVar3);
                f7cVar2.v1(arrayList7, i4, birVarA);
                birVarA.b(arrayList7);
                i4 = 0;
                birVar3 = null;
            }
        }
        ConstraintAnchor constraintAnchorQ = dVar.q(ConstraintAnchor.Type.LEFT);
        if (constraintAnchorQ.d() != null) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ.d().iterator();
            while (it2.hasNext()) {
                a(it2.next().d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ2 = dVar.q(ConstraintAnchor.Type.RIGHT);
        if (constraintAnchorQ2.d() != null) {
            Iterator<ConstraintAnchor> it3 = constraintAnchorQ2.d().iterator();
            while (it3.hasNext()) {
                a(it3.next().d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ3 = dVar.q(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorQ3.d() != null) {
            Iterator<ConstraintAnchor> it4 = constraintAnchorQ3.d().iterator();
            while (it4.hasNext()) {
                a(it4.next().d, 0, arrayList7, null);
            }
        }
        bir birVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((f) it6.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            for (f7c f7cVar3 : arrayList4) {
                bir birVarA2 = a(f7cVar3, i5, arrayList7, birVar4);
                f7cVar3.v1(arrayList7, i5, birVarA2);
                birVarA2.b(arrayList7);
                i5 = 1;
                birVar4 = null;
            }
        }
        ConstraintAnchor constraintAnchorQ4 = dVar.q(ConstraintAnchor.Type.TOP);
        if (constraintAnchorQ4.d() != null) {
            Iterator<ConstraintAnchor> it7 = constraintAnchorQ4.d().iterator();
            while (it7.hasNext()) {
                a(it7.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ5 = dVar.q(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorQ5.d() != null) {
            Iterator<ConstraintAnchor> it8 = constraintAnchorQ5.d().iterator();
            while (it8.hasNext()) {
                a(it8.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ6 = dVar.q(ConstraintAnchor.Type.BOTTOM);
        if (constraintAnchorQ6.d() != null) {
            Iterator<ConstraintAnchor> it9 = constraintAnchorQ6.d().iterator();
            while (it9.hasNext()) {
                a(it9.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ7 = dVar.q(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorQ7.d() != null) {
            Iterator<ConstraintAnchor> it10 = constraintAnchorQ7.d().iterator();
            while (it10.hasNext()) {
                a(it10.next().d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget3 = arrayListV1.get(i6);
            if (constraintWidget3.u0()) {
                bir birVarB = b(arrayList7, constraintWidget3.S0);
                bir birVarB2 = b(arrayList7, constraintWidget3.T0);
                if (birVarB != null && birVarB2 != null) {
                    birVarB.g(0, birVarB2);
                    birVarB2.i(2);
                    arrayList7.remove(birVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (dVar.C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            birVar = null;
            int i7 = 0;
            for (bir birVar5 : arrayList7) {
                if (birVar5.d() != 1) {
                    birVar5.h(false);
                    int iF = birVar5.f(dVar.P1(), 0);
                    if (iF > i7) {
                        birVar = birVar5;
                        i7 = iF;
                    }
                }
            }
            if (birVar != null) {
                dVar.T0(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.o1(i7);
                birVar.h(true);
            } else {
                birVar = null;
            }
        } else {
            birVar = null;
        }
        if (dVar.V() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            bir birVar6 = null;
            int i8 = 0;
            for (bir birVar7 : arrayList7) {
                if (birVar7.d() != 0) {
                    birVar7.h(false);
                    int iF2 = birVar7.f(dVar.P1(), 1);
                    if (iF2 > i8) {
                        birVar6 = birVar7;
                        i8 = iF2;
                    }
                }
            }
            z = false;
            z2 = true;
            if (birVar6 != null) {
                dVar.k1(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.P0(i8);
                birVar6.h(true);
                birVar2 = birVar6;
            }
            return (birVar == null || birVar2 != null) ? z2 : z;
        }
        z = false;
        z2 = true;
        birVar2 = null;
        if (birVar == null) {
        }
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
