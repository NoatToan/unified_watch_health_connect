package l51;

import android.app.Activity;
import androidx.lifecycle.u1;
import e23.r;
import l30.i0;
import lc.v;
import lc.y;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p1;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f110157b;

    public /* synthetic */ e(y yVar, int i14) {
        this.f110156a = i14;
        this.f110157b = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:30:0x011b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x01da  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0233  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0338  */
    /* JADX WARN: Code duplicated, block: B:89:0x0354  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f110156a;
        int i15 = 4;
        p3.m.a aVar = p3.m.f135153a;
        y yVar = this.f110157b;
        final int i16 = 0;
        switch (i14) {
            case 0:
                v vVar = (v) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var = p3.n.f135158a;
                boolean zB = mVar.B(vVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                        mVar.K(objQ);
                    }
                }
                v vVar2 = (v) objQ;
                mVar.L(-1614864554);
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.b.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
                mVar.R();
                final p51.b bVar = (p51.b) u1VarResolveViewModel;
                p1 p1VarC = s9.c.c(bVar.f136137n, mVar);
                t41.f fVar = ((o51.f) p1VarC.getF182175a()).f129242g;
                t41.f fVar2 = ((o51.f) p1VarC.getF182175a()).f129242g;
                t41.f fVar3 = t41.f.OTHER;
                double dA = fVar2 != fVar3 ? ((o51.f) p1VarC.getF182175a()).f129244i.a(fVar3.f162291b) : ((o51.f) p1VarC.getF182175a()).f129243h;
                n02.g gVar = ((o51.f) p1VarC.getF182175a()).f129244i;
                boolean zR = mVar.r(yVar);
                Object objQ2 = mVar.q();
                if (zR) {
                    objQ2 = new h(yVar);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new h(yVar);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean zR2 = mVar.r(bVar);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new e23.q() { // from class: l51.d
                        @Override // e23.q
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            switch (i16) {
                                case 0:
                                    t41.f fVar4 = (t41.f) obj5;
                                    double dDoubleValue = ((Double) obj6).doubleValue();
                                    n02.g gVar2 = (n02.g) obj7;
                                    fVar4.getClass();
                                    gVar2.getClass();
                                    bVar.y4(new w41.a.o(fVar4, dDoubleValue, gVar2));
                                    break;
                                default:
                                    t41.h hVar = (t41.h) obj5;
                                    int iIntValue = ((Integer) obj6).intValue();
                                    double dDoubleValue2 = ((Double) obj7).doubleValue();
                                    hVar.getClass();
                                    bVar.y4(new w41.a.w(hVar, iIntValue, dDoubleValue2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.q() { // from class: l51.d
                            @Override // e23.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i16) {
                                    case 0:
                                        t41.f fVar4 = (t41.f) obj5;
                                        double dDoubleValue = ((Double) obj6).doubleValue();
                                        n02.g gVar2 = (n02.g) obj7;
                                        fVar4.getClass();
                                        gVar2.getClass();
                                        bVar.y4(new w41.a.o(fVar4, dDoubleValue, gVar2));
                                        break;
                                    default:
                                        t41.h hVar = (t41.h) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        double dDoubleValue2 = ((Double) obj7).doubleValue();
                                        hVar.getClass();
                                        bVar.y4(new w41.a.w(hVar, iIntValue, dDoubleValue2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    }
                }
                z41.q.a(fVar, dA, gVar, aVar2, (e23.q) objQ3, mVar, 0);
                break;
            case 1:
                v vVar3 = (v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, vVar3);
                x1 x1Var2 = p3.n.f135158a;
                boolean zB2 = mVar2.B(vVar3);
                Object objQ4 = mVar2.q();
                if (zB2) {
                    objQ4 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                        mVar2.K(objQ4);
                    }
                }
                v vVar4 = (v) objQ4;
                mVar2.L(-1614864554);
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.b.class), vVar4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar4), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                mVar2.R();
                o51.b bVar2 = ((o51.f) s9.c.c(((p51.b) u1VarResolveViewModel2).f136137n, mVar2).getF182175a()).G;
                if (bVar2 == null) {
                    mVar2.C(-768330057);
                    mVar2.f();
                } else {
                    mVar2.C(-768330056);
                    b51.c.a(bVar2, mVar2, 0);
                    mVar2.f();
                }
                break;
            case 2:
                v vVar5 = (v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar5.getClass();
                x1 x1Var3 = p3.n.f135158a;
                boolean zB3 = mVar3.B(vVar5);
                Object objQ5 = mVar3.q();
                if (zB3) {
                    objQ5 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                    mVar3.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                        mVar3.K(objQ5);
                    }
                }
                v vVar6 = (v) objQ5;
                mVar3.L(-1614864554);
                u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.b.class), vVar6.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar6), null, KoinApplicationKt.currentKoinScope(mVar3, 0), null);
                mVar3.R();
                p51.b bVar3 = (p51.b) u1VarResolveViewModel3;
                o51.e eVar = ((o51.f) s9.c.c(bVar3.f136137n, mVar3).getF182175a()).F;
                if (eVar == null) {
                    mVar3.C(1179410017);
                    mVar3.f();
                } else {
                    mVar3.C(1179410018);
                    boolean zR3 = mVar3.r(bVar3);
                    Object objQ6 = mVar3.q();
                    if (zR3) {
                        objQ6 = new a(bVar3, 2);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a(bVar3, 2);
                            mVar3.K(objQ6);
                        }
                    }
                    e23.l lVar = (e23.l) objQ6;
                    boolean zR4 = mVar3.r(bVar3);
                    Object objQ7 = mVar3.q();
                    if (zR4) {
                        objQ7 = new a(bVar3, 3);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new a(bVar3, 3);
                            mVar3.K(objQ7);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ7;
                    boolean zR5 = mVar3.r(bVar3);
                    Object objQ8 = mVar3.q();
                    if (zR5) {
                        objQ8 = new a(bVar3, 4);
                        mVar3.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new a(bVar3, 4);
                            mVar3.K(objQ8);
                        }
                    }
                    d51.c.a(eVar, lVar, lVar2, (e23.l) objQ8, mVar3, ke2.b.f104550d);
                    mVar3.f();
                }
                break;
            case 3:
                v vVar7 = (v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar7.getClass();
                x1 x1Var4 = p3.n.f135158a;
                boolean zB4 = mVar4.B(vVar7);
                Object objQ9 = mVar4.q();
                if (zB4) {
                    objQ9 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                    mVar4.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = yVar.c(s0.f105811a.b(n51.b.C2324b.class));
                        mVar4.K(objQ9);
                    }
                }
                v vVar8 = (v) objQ9;
                mVar4.L(-1614864554);
                u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.b.class), vVar8.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar8), null, KoinApplicationKt.currentKoinScope(mVar4, 0), null);
                mVar4.R();
                final p51.b bVar4 = (p51.b) u1VarResolveViewModel4;
                p1 p1VarC2 = s9.c.c(bVar4.f136137n, mVar4);
                o51.i iVar = ((o51.f) p1VarC2.getF182175a()).C;
                boolean z14 = ((o51.f) p1VarC2.getF182175a()).f129247l;
                boolean zR6 = mVar4.r(bVar4);
                Object objQ10 = mVar4.q();
                if (zR6) {
                    final int i17 = 1;
                    objQ10 = new e23.q() { // from class: l51.d
                        @Override // e23.q
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            switch (i17) {
                                case 0:
                                    t41.f fVar4 = (t41.f) obj5;
                                    double dDoubleValue = ((Double) obj6).doubleValue();
                                    n02.g gVar2 = (n02.g) obj7;
                                    fVar4.getClass();
                                    gVar2.getClass();
                                    bVar4.y4(new w41.a.o(fVar4, dDoubleValue, gVar2));
                                    break;
                                default:
                                    t41.h hVar = (t41.h) obj5;
                                    int iIntValue = ((Integer) obj6).intValue();
                                    double dDoubleValue2 = ((Double) obj7).doubleValue();
                                    hVar.getClass();
                                    bVar4.y4(new w41.a.w(hVar, iIntValue, dDoubleValue2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar4.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        final int i18 = 1;
                        objQ10 = new e23.q() { // from class: l51.d
                            @Override // e23.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i18) {
                                    case 0:
                                        t41.f fVar4 = (t41.f) obj5;
                                        double dDoubleValue = ((Double) obj6).doubleValue();
                                        n02.g gVar2 = (n02.g) obj7;
                                        fVar4.getClass();
                                        gVar2.getClass();
                                        bVar4.y4(new w41.a.o(fVar4, dDoubleValue, gVar2));
                                        break;
                                    default:
                                        t41.h hVar = (t41.h) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        double dDoubleValue2 = ((Double) obj7).doubleValue();
                                        hVar.getClass();
                                        bVar4.y4(new w41.a.w(hVar, iIntValue, dDoubleValue2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ10);
                    }
                }
                e23.q qVar = (e23.q) objQ10;
                boolean zR7 = mVar4.r(bVar4) | mVar4.r(yVar);
                Object objQ11 = mVar4.q();
                if (zR7) {
                    objQ11 = new i0(4, bVar4, yVar);
                    mVar4.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new i0(4, bVar4, yVar);
                        mVar4.K(objQ11);
                    }
                }
                e51.d.a(iVar, z14, qVar, (e23.a) objQ11, mVar4, 0);
                break;
            default:
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var5 = p3.n.f135158a;
                Activity activity = (Activity) mVar5.A(c.n.f22332a);
                boolean zR8 = mVar5.r(activity);
                Object objQ12 = mVar5.q();
                if (zR8) {
                    objQ12 = new by1.l(activity, i15);
                    mVar5.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new by1.l(activity, i15);
                        mVar5.K(objQ12);
                    }
                }
                e23.a aVar3 = (e23.a) objQ12;
                boolean zR9 = mVar5.r(yVar);
                Object objQ13 = mVar5.q();
                if (zR9) {
                    objQ13 = new gk1.b(yVar, i15);
                    mVar5.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new gk1.b(yVar, i15);
                        mVar5.K(objQ13);
                    }
                }
                i51.h.c(aVar3, (e23.a) objQ13, mVar5, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
