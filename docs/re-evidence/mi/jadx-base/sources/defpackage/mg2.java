package defpackage;

import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class mg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f26122a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f26123b = new a();
    public d c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f26124k = 0;
        public static int l = 1;
        public static int m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f26125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f26126b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public interface b {
        void a(ConstraintWidget constraintWidget, a aVar);

        void b();
    }

    public mg2(d dVar) {
        this.c = dVar;
    }

    public final boolean a(b bVar, ConstraintWidget constraintWidget, int i) {
        this.f26123b.f26125a = constraintWidget.C();
        this.f26123b.f26126b = constraintWidget.V();
        this.f26123b.c = constraintWidget.Y();
        this.f26123b.d = constraintWidget.z();
        a aVar = this.f26123b;
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f26125a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.f26126b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f0 > 0.0f;
        boolean z4 = z2 && constraintWidget.f0 > 0.0f;
        if (z3 && constraintWidget.y[0] == 4) {
            aVar.f26125a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.y[1] == 4) {
            aVar.f26126b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.a(constraintWidget, aVar);
        constraintWidget.o1(this.f26123b.e);
        constraintWidget.P0(this.f26123b.f);
        constraintWidget.O0(this.f26123b.h);
        constraintWidget.E0(this.f26123b.g);
        a aVar2 = this.f26123b;
        aVar2.j = a.f26124k;
        return aVar2.i;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:71:0x00a2 A[SYNTHETIC] */
    public final void b(d dVar) {
        sac sacVar;
        mpq mpqVar;
        int size = dVar.V0.size();
        boolean zY1 = dVar.Y1(64);
        b bVarN1 = dVar.N1();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.V0.get(i);
            if (!(constraintWidget instanceof f) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && !constraintWidget.n0() && (!zY1 || (sacVar = constraintWidget.e) == null || (mpqVar = constraintWidget.f) == null || !sacVar.e.j || !mpqVar.e.j)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget.w(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = constraintWidget.w(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z = dimensionBehaviourW == dimensionBehaviour && constraintWidget.w != 1 && dimensionBehaviourW2 == dimensionBehaviour && constraintWidget.x != 1;
                if (!z && dVar.Y1(1) && !(constraintWidget instanceof i)) {
                    if (dimensionBehaviourW == dimensionBehaviour && constraintWidget.w == 0 && dimensionBehaviourW2 != dimensionBehaviour && !constraintWidget.k0()) {
                        z = true;
                    }
                    boolean z2 = (dimensionBehaviourW2 != dimensionBehaviour || constraintWidget.x != 0 || dimensionBehaviourW == dimensionBehaviour || constraintWidget.k0()) ? z : true;
                    if ((dimensionBehaviourW != dimensionBehaviour && dimensionBehaviourW2 != dimensionBehaviour) || constraintWidget.f0 <= 0.0f) {
                        z = z2;
                        if (z) {
                            a(bVarN1, constraintWidget, a.f26124k);
                        }
                    }
                } else if (z) {
                    a(bVarN1, constraintWidget, a.f26124k);
                }
            }
        }
        bVarN1.b();
    }

    public final void c(d dVar, String str, int i, int i2, int i3) {
        int iK = dVar.K();
        int iJ = dVar.J();
        dVar.e1(0);
        dVar.d1(0);
        dVar.o1(i2);
        dVar.P0(i3);
        dVar.e1(iK);
        dVar.d1(iJ);
        this.c.c2(i);
        this.c.w1();
    }

    public long d(d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zL1;
        int i10;
        int i11;
        boolean z;
        int i12;
        boolean z2;
        mg2 mg2Var = this;
        b bVarN1 = dVar.N1();
        int size = dVar.V0.size();
        int iY = dVar.Y();
        int iZ = dVar.z();
        boolean zB = g.b(i, 128);
        boolean z3 = zB || g.b(i, 64);
        if (z3) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget = dVar.V0.get(i13);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z4 = (dimensionBehaviourC == dimensionBehaviour) && (constraintWidget.V() == dimensionBehaviour) && constraintWidget.x() > 0.0f;
                if ((constraintWidget.k0() && z4) || ((constraintWidget.m0() && z4) || (constraintWidget instanceof i) || constraintWidget.k0() || constraintWidget.m0())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            boolean z5 = c.f1886r;
        }
        boolean z6 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zB);
        int i14 = 2;
        if (z6) {
            int iMin = Math.min(dVar.I(), i5);
            int iMin2 = Math.min(dVar.H(), i7);
            if (i4 == 1073741824 && dVar.Y() != iMin) {
                dVar.o1(iMin);
                dVar.R1();
            }
            if (i6 == 1073741824 && dVar.z() != iMin2) {
                dVar.P0(iMin2);
                dVar.R1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zL1 = dVar.J1(zB);
                i10 = 2;
            } else {
                boolean zK1 = dVar.K1(zB);
                if (i4 == 1073741824) {
                    zK1 &= dVar.L1(zB, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zL1 = dVar.L1(zB, 1) & zK1;
                    i10++;
                } else {
                    zL1 = zK1;
                }
            }
            if (zL1) {
                dVar.t1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zL1 = false;
            i10 = 0;
        }
        if (zL1 && i10 == 2) {
            return 0L;
        }
        int iO1 = dVar.O1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = mg2Var.f26122a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, iY, iZ);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourC2 = dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z7 = dimensionBehaviourC2 == dimensionBehaviour2;
            boolean z8 = dVar.V() == dimensionBehaviour2;
            int iMax = Math.max(dVar.Y(), mg2Var.c.K());
            int iMax2 = Math.max(dVar.z(), mg2Var.c.J());
            int i15 = 0;
            boolean zJ1 = false;
            while (i15 < size2) {
                ConstraintWidget constraintWidget2 = mg2Var.f26122a.get(i15);
                if (constraintWidget2 instanceof i) {
                    int iY2 = constraintWidget2.Y();
                    int iZ2 = constraintWidget2.z();
                    boolean zA = mg2Var.a(bVarN1, constraintWidget2, a.l) | zJ1;
                    int iY3 = constraintWidget2.Y();
                    int iZ3 = constraintWidget2.z();
                    if (iY3 != iY2) {
                        constraintWidget2.o1(iY3);
                        if (z7 && constraintWidget2.O() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.O() + constraintWidget2.q(ConstraintAnchor.Type.RIGHT).f());
                        }
                        z2 = true;
                    } else {
                        z2 = zA;
                    }
                    if (iZ3 != iZ2) {
                        constraintWidget2.P0(iZ3);
                        if (z8 && constraintWidget2.t() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.t() + constraintWidget2.q(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        z2 = true;
                    }
                    zJ1 = z2 | ((i) constraintWidget2).J1();
                }
                i15++;
                iO1 = iO1;
                i14 = 2;
            }
            int i16 = iO1;
            int i17 = i14;
            int i18 = 0;
            while (i18 < i17) {
                int i19 = 0;
                while (i19 < size2) {
                    ConstraintWidget constraintWidget3 = mg2Var.f26122a.get(i19);
                    if (((constraintWidget3 instanceof d7c) && !(constraintWidget3 instanceof i)) || (constraintWidget3 instanceof f) || constraintWidget3.X() == 8 || ((z6 && constraintWidget3.e.e.j && constraintWidget3.f.e.j) || (constraintWidget3 instanceof i))) {
                        z = z6;
                        i12 = size2;
                    } else {
                        int iY4 = constraintWidget3.Y();
                        int iZ4 = constraintWidget3.z();
                        z = z6;
                        int iR = constraintWidget3.r();
                        int i20 = a.l;
                        i12 = size2;
                        if (i18 == 1) {
                            i20 = a.m;
                        }
                        boolean zA2 = mg2Var.a(bVarN1, constraintWidget3, i20) | zJ1;
                        int iY5 = constraintWidget3.Y();
                        int iZ5 = constraintWidget3.z();
                        if (iY5 != iY4) {
                            constraintWidget3.o1(iY5);
                            if (z7 && constraintWidget3.O() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.O() + constraintWidget3.q(ConstraintAnchor.Type.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iZ5 != iZ4) {
                            constraintWidget3.P0(iZ5);
                            if (z8 && constraintWidget3.t() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.t() + constraintWidget3.q(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zJ1 = (!constraintWidget3.b0() || iR == constraintWidget3.r()) ? zA2 : true;
                    }
                    i19++;
                    mg2Var = this;
                    z6 = z;
                    size2 = i12;
                }
                boolean z9 = z6;
                int i21 = size2;
                if (!zJ1) {
                    break;
                }
                i18++;
                c(dVar, "intermediate pass", i18, iY, iZ);
                mg2Var = this;
                z6 = z9;
                size2 = i21;
                i17 = 2;
                zJ1 = false;
            }
            i11 = i16;
        } else {
            i11 = iO1;
        }
        dVar.b2(i11);
        return 0L;
    }

    public void e(d dVar) {
        this.f26122a.clear();
        int size = dVar.V0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.V0.get(i);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourC == dimensionBehaviour || constraintWidget.V() == dimensionBehaviour) {
                this.f26122a.add(constraintWidget);
            }
        }
        dVar.R1();
    }
}
