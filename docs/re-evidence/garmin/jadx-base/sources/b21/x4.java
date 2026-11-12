package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x4 implements e23.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15380a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f15382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity.g f15384e;

    public /* synthetic */ x4(lc.v vVar, lc.m0 m0Var, v21.e eVar, NutritionActivity.g gVar) {
        this.f15381b = vVar;
        this.f15383d = m0Var;
        this.f15382c = eVar;
        this.f15384e = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:32:0x015f  */
    /* JADX WARN: Code duplicated, block: B:37:0x018e  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x023f  */
    /* JADX WARN: Code duplicated, block: B:62:0x02af  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0327  */
    /* JADX WARN: Code duplicated, block: B:87:0x0342  */
    /* JADX WARN: Code duplicated, block: B:8:0x005e  */
    /* JADX WARN: Code duplicated, block: B:92:0x035d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0385  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.u
    public final Object m(androidx.lifecycle.u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        Object obj5;
        int i14 = this.f15380a;
        p3.m.a aVar = p3.m.f135153a;
        lc.v vVar = this.f15381b;
        final int i15 = 0;
        switch (i14) {
            case 0:
                Object obj6 = (List) obj3;
                fe feVar = (fe) obj4;
                int iIntValue = num.intValue();
                ((List) obj).getClass();
                ((List) obj2).getClass();
                obj6.getClass();
                feVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                Object obj7 = (l4.p) lc.w.a(vVar, t0Var.b(l4.p.class));
                boolean zR = mVar.r(obj7) | mVar.r(obj6);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new ao1.i(18, obj7, obj6);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ao1.i(18, obj7, obj6);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(x11.g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar2);
                mVar.R();
                final x11.g gVar = (x11.g) u1VarResolveViewModel;
                p3.p1 p1VarC = s9.c.c(gVar.f188420h, mVar);
                Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                v11.a aVar3 = ((x11.f) p1VarC.getF182175a()).f188410f;
                boolean zB = mVar.B(p1VarC) | mVar.r(gVar);
                lc.m0 m0Var = this.f15383d;
                boolean zR2 = zB | mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new o5(gVar, m0Var, p1VarC, null);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o5(gVar, m0Var, p1VarC, null);
                        mVar.K(objQ2);
                    }
                }
                p3.l0.e((e23.p) objQ2, aVar3, mVar);
                Boolean boolValueOf = Boolean.valueOf(((x11.f) p1VarC.getF182175a()).f188411g);
                final int i16 = 1;
                boolean zB2 = mVar.B(p1VarC) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar.B(feVar)) || (iIntValue & 24576) == 16384) | mVar.r(context) | mVar.r(gVar);
                Object objQ3 = mVar.q();
                if (zB2) {
                    Object p5Var = new p5(feVar, context, gVar, p1VarC, null);
                    mVar.K(p5Var);
                    objQ3 = p5Var;
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        Object p5Var2 = new p5(feVar, context, gVar, p1VarC, null);
                        mVar.K(p5Var2);
                        objQ3 = p5Var2;
                    }
                }
                p3.l0.e((e23.p) objQ3, boolValueOf, mVar);
                x11.f fVar = (x11.f) p1VarC.getF182175a();
                boolean zR3 = mVar.r(gVar);
                Object objQ4 = mVar.q();
                if (zR3) {
                    objQ4 = new e23.l() { // from class: b21.y4
                        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                        @Override // e23.l
                        public final Object invoke(Object obj8) {
                            Object value;
                            x11.f fVar2;
                            b11.m mVar2;
                            Object value2;
                            switch (i15) {
                                case 0:
                                    b63.v vVar2 = (b63.v) obj8;
                                    vVar2.getClass();
                                    x11.g gVar2 = gVar;
                                    r53.p2 p2Var = gVar2.f188419g;
                                    do {
                                        value = p2Var.getValue();
                                        fVar2 = (x11.f) value;
                                        mVar2 = gVar2.f188414b;
                                    } while (!p2Var.b(value, !mVar2.f14338a ? x11.f.a(fVar2, vVar2, null, null, false, null, false, 254) : x11.f.a(fVar2, vVar2, zf.b.L(gVar2.f188421i, true, vVar2, mVar2.f14339b, gVar2.f188418f.a()), null, false, null, false, 252)));
                                    break;
                                default:
                                    b11.l lVar = (b11.l) obj8;
                                    lVar.getClass();
                                    r53.p2 p2Var2 = gVar.f188419g;
                                    if (!lVar.equals(((x11.f) p2Var2.getValue()).f188406b)) {
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, x11.f.a((x11.f) value2, null, lVar, null, false, null, false, 253)));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new e23.l() { // from class: b21.y4
                            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                            @Override // e23.l
                            public final Object invoke(Object obj8) {
                                Object value;
                                x11.f fVar2;
                                b11.m mVar2;
                                Object value2;
                                switch (i15) {
                                    case 0:
                                        b63.v vVar2 = (b63.v) obj8;
                                        vVar2.getClass();
                                        x11.g gVar2 = gVar;
                                        r53.p2 p2Var = gVar2.f188419g;
                                        do {
                                            value = p2Var.getValue();
                                            fVar2 = (x11.f) value;
                                            mVar2 = gVar2.f188414b;
                                        } while (!p2Var.b(value, !mVar2.f14338a ? x11.f.a(fVar2, vVar2, null, null, false, null, false, 254) : x11.f.a(fVar2, vVar2, zf.b.L(gVar2.f188421i, true, vVar2, mVar2.f14339b, gVar2.f188418f.a()), null, false, null, false, 252)));
                                        break;
                                    default:
                                        b11.l lVar = (b11.l) obj8;
                                        lVar.getClass();
                                        r53.p2 p2Var2 = gVar.f188419g;
                                        if (!lVar.equals(((x11.f) p2Var2.getValue()).f188406b)) {
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, x11.f.a((x11.f) value2, null, lVar, null, false, null, false, 253)));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ4);
                    }
                }
                e23.l lVar = (e23.l) objQ4;
                boolean zR4 = mVar.r(gVar);
                Object objQ5 = mVar.q();
                if (zR4) {
                    objQ5 = new e23.l() { // from class: b21.y4
                        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                        @Override // e23.l
                        public final Object invoke(Object obj8) {
                            Object value;
                            x11.f fVar2;
                            b11.m mVar2;
                            Object value2;
                            switch (i16) {
                                case 0:
                                    b63.v vVar2 = (b63.v) obj8;
                                    vVar2.getClass();
                                    x11.g gVar2 = gVar;
                                    r53.p2 p2Var = gVar2.f188419g;
                                    do {
                                        value = p2Var.getValue();
                                        fVar2 = (x11.f) value;
                                        mVar2 = gVar2.f188414b;
                                    } while (!p2Var.b(value, !mVar2.f14338a ? x11.f.a(fVar2, vVar2, null, null, false, null, false, 254) : x11.f.a(fVar2, vVar2, zf.b.L(gVar2.f188421i, true, vVar2, mVar2.f14339b, gVar2.f188418f.a()), null, false, null, false, 252)));
                                    break;
                                default:
                                    b11.l lVar2 = (b11.l) obj8;
                                    lVar2.getClass();
                                    r53.p2 p2Var2 = gVar.f188419g;
                                    if (!lVar2.equals(((x11.f) p2Var2.getValue()).f188406b)) {
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, x11.f.a((x11.f) value2, null, lVar2, null, false, null, false, 253)));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new e23.l() { // from class: b21.y4
                            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                            @Override // e23.l
                            public final Object invoke(Object obj8) {
                                Object value;
                                x11.f fVar2;
                                b11.m mVar2;
                                Object value2;
                                switch (i16) {
                                    case 0:
                                        b63.v vVar2 = (b63.v) obj8;
                                        vVar2.getClass();
                                        x11.g gVar2 = gVar;
                                        r53.p2 p2Var = gVar2.f188419g;
                                        do {
                                            value = p2Var.getValue();
                                            fVar2 = (x11.f) value;
                                            mVar2 = gVar2.f188414b;
                                        } while (!p2Var.b(value, !mVar2.f14338a ? x11.f.a(fVar2, vVar2, null, null, false, null, false, 254) : x11.f.a(fVar2, vVar2, zf.b.L(gVar2.f188421i, true, vVar2, mVar2.f14339b, gVar2.f188418f.a()), null, false, null, false, 252)));
                                        break;
                                    default:
                                        b11.l lVar2 = (b11.l) obj8;
                                        lVar2.getClass();
                                        r53.p2 p2Var2 = gVar.f188419g;
                                        if (!lVar2.equals(((x11.f) p2Var2.getValue()).f188406b)) {
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, x11.f.a((x11.f) value2, null, lVar2, null, false, null, false, 253)));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ5);
                    }
                }
                e23.l lVar2 = (e23.l) objQ5;
                boolean zR5 = mVar.r(gVar);
                Object objQ6 = mVar.q();
                if (zR5) {
                    objQ6 = new s4(gVar, 1);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new s4(gVar, 1);
                        mVar.K(objQ6);
                    }
                }
                e23.a aVar4 = (e23.a) objQ6;
                boolean zR6 = mVar.r(obj7) | mVar.r(m0Var);
                Object obj8 = this.f15384e;
                boolean zB3 = zR6 | mVar.B(obj8);
                Object objQ7 = mVar.q();
                if (zB3) {
                    objQ7 = new ak0.m(obj7, 7, m0Var, obj8);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new ak0.m(obj7, 7, m0Var, obj8);
                        mVar.K(objQ7);
                    }
                }
                w11.i.a(fVar, this.f15382c, feVar, lVar, lVar2, aVar4, (e23.a) objQ7, mVar, (iIntValue >> 6) & 896);
                return Unit.INSTANCE;
            default:
                m21.v vVar2 = (m21.v) u1Var;
                List list = (List) obj;
                Object obj9 = (List) obj2;
                fe feVar2 = (fe) obj4;
                int iIntValue2 = num.intValue();
                list.getClass();
                obj9.getClass();
                ((List) obj3).getClass();
                feVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                l4.q qVar = (l4.q) lc.w.a(vVar, t0Var2.b(l4.q.class));
                boolean zR7 = mVar.r(qVar) | mVar.r(obj9);
                Object objQ8 = mVar.q();
                if (zR7) {
                    objQ8 = new ao1.i(16, qVar, obj9);
                    mVar.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new ao1.i(16, qVar, obj9);
                        mVar.K(objQ8);
                    }
                }
                e23.a aVar5 = (e23.a) objQ8;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(x11.l.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar5);
                mVar.R();
                x11.l lVar3 = (x11.l) u1VarResolveViewModel2;
                p3.p1 p1VarC2 = s9.c.c(lVar3.f188443j, mVar);
                lc.m0 m0Var2 = this.f15383d;
                Object objC = e5.c(vVar, m0Var2, mVar);
                boolean zR8 = mVar.r(lVar3) | mVar.r(list) | mVar.r(vVar2);
                Object objQ9 = mVar.q();
                if (zR8) {
                    objQ9 = new m5(lVar3, list, vVar2, null);
                    mVar.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new m5(lVar3, list, vVar2, null);
                        mVar.K(objQ9);
                    }
                }
                p3.l0.e((e23.p) objQ9, list, mVar);
                p3.p1 p1VarN = n23.j.n(vVar, "standaloneConsumableFoodUpdatedResult", null, mVar);
                b11.v vVar3 = (b11.v) p1VarN.getF182175a();
                boolean zB4 = mVar.B(p1VarN) | mVar.r(lVar3) | mVar.r(vVar);
                Object objQ10 = mVar.q();
                if (zB4) {
                    objQ10 = new n5(vVar, p1VarN, lVar3, null);
                    mVar.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new n5(vVar, p1VarN, lVar3, null);
                        mVar.K(objQ10);
                    }
                }
                p3.l0.e((e23.p) objQ10, vVar3, mVar);
                x11.k kVar = (x11.k) p1VarC2.getF182175a();
                boolean z14 = qVar.f14953e;
                boolean zR9 = mVar.r(qVar) | mVar.r(vVar2) | mVar.r(lVar3) | mVar.r(m0Var2) | mVar.r(objC);
                Object objQ11 = mVar.q();
                if (zR9) {
                    Object v4Var = new v4(qVar, vVar2, lVar3, m0Var2, objC, 0);
                    obj5 = qVar;
                    vVar2 = vVar2;
                    lVar3 = lVar3;
                    mVar.K(v4Var);
                    objQ11 = v4Var;
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        Object v4Var2 = new v4(qVar, vVar2, lVar3, m0Var2, objC, 0);
                        obj5 = qVar;
                        vVar2 = vVar2;
                        lVar3 = lVar3;
                        mVar.K(v4Var2);
                        objQ11 = v4Var2;
                    } else {
                        obj5 = qVar;
                    }
                }
                e23.a aVar6 = (e23.a) objQ11;
                boolean zR10 = mVar.r(m0Var2) | mVar.r(obj5);
                Object objQ12 = mVar.q();
                if (zR10) {
                    objQ12 = new ao1.i(17, m0Var2, obj5);
                    mVar.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new ao1.i(17, m0Var2, obj5);
                        mVar.K(objQ12);
                    }
                }
                e23.a aVar7 = (e23.a) objQ12;
                boolean zR11 = mVar.r(vVar2) | mVar.r(obj5) | mVar.r(m0Var2);
                Object obj10 = this.f15384e;
                boolean zB5 = zR11 | mVar.B(obj10);
                Object objQ13 = mVar.q();
                if (zB5) {
                    objQ13 = new af0.e(vVar2, obj5, m0Var2, obj10, 4);
                    mVar.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new af0.e(vVar2, obj5, m0Var2, obj10, 4);
                        mVar.K(objQ13);
                    }
                }
                e23.a aVar8 = (e23.a) objQ13;
                boolean zR12 = mVar.r(obj5) | mVar.r(lVar3) | mVar.r(m0Var2);
                Object objQ14 = mVar.q();
                if (zR12) {
                    objQ14 = new a4.a(obj5, 13, lVar3, m0Var2);
                    mVar.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new a4.a(obj5, 13, lVar3, m0Var2);
                        mVar.K(objQ14);
                    }
                }
                e23.l lVar4 = (e23.l) objQ14;
                boolean zR13 = mVar.r(lVar3);
                Object objQ15 = mVar.q();
                if (zR13) {
                    objQ15 = new a61.d(lVar3, 11);
                    mVar.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new a61.d(lVar3, 11);
                        mVar.K(objQ15);
                    }
                }
                w11.r.a(feVar2, this.f15382c, kVar, z14, aVar6, aVar7, aVar8, lVar4, (e23.p) objQ15, mVar, (iIntValue2 >> 12) & 14);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x4(lc.v vVar, v21.e eVar, lc.m0 m0Var, NutritionActivity.g gVar) {
        this.f15381b = vVar;
        this.f15382c = eVar;
        this.f15383d = m0Var;
        this.f15384e = gVar;
    }
}
