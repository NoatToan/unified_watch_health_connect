package b21;

import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import java.util.Set;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.o2 f15336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity.g f15338e;

    public /* synthetic */ w0(lc.v vVar, r53.o2 o2Var, lc.m0 m0Var, NutritionActivity.g gVar) {
        this.f15334a = 1;
        this.f15335b = vVar;
        this.f15336c = o2Var;
        this.f15337d = m0Var;
        this.f15338e = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0219  */
    /* JADX WARN: Code duplicated, block: B:60:0x0242  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x030e  */
    /* JADX WARN: Code duplicated, block: B:81:0x032d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0355  */
    /* JADX WARN: Code duplicated, block: B:8:0x0054  */
    /* JADX WARN: Code duplicated, block: B:91:0x0374  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        g21.h hVar;
        int i14 = this.f15334a;
        lc.m0 m0Var = this.f15337d;
        final NutritionActivity.g gVar = this.f15338e;
        p3.m.a aVar = p3.m.f135153a;
        r53.o2 o2Var = this.f15336c;
        lc.v vVar = this.f15335b;
        final int i15 = 0;
        switch (i14) {
            case 0:
                final i21.d dVar = (i21.d) obj;
                fe feVar = (fe) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                dVar.getClass();
                feVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                l4.l lVar = (l4.l) lc.w.a(vVar, t0Var.b(l4.l.class));
                l11.t.b.c cVar = new l11.t.b.c(lVar.f14920d);
                boolean zR = mVar.r(lVar) | mVar.B(cVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new ao1.i(9, lVar, cVar);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ao1.i(9, lVar, cVar);
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
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(l11.t.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar2);
                mVar.R();
                l11.t tVar = (l11.t) u1VarResolveViewModel;
                final p3.p1 p1VarC = s9.c.c(o2Var, mVar);
                boolean zR2 = mVar.r(lVar) | mVar.r(dVar) | mVar.B(gVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new a3.e(lVar, 14, dVar, gVar);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a3.e(lVar, 14, dVar, gVar);
                        mVar.K(objQ2);
                    }
                }
                e23.p pVar = (e23.p) objQ2;
                boolean zR3 = mVar.r(m0Var);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new j0(m0Var, 4);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j0(m0Var, 4);
                        mVar.K(objQ3);
                    }
                }
                e23.p pVar2 = (e23.p) objQ3;
                boolean zR4 = mVar.r(dVar) | mVar.B(p1VarC) | mVar.B(gVar);
                Object objQ4 = mVar.q();
                if (zR4) {
                    final int i16 = 1;
                    objQ4 = new e23.p() { // from class: b21.i0
                        @Override // e23.p
                        public final Object invoke(Object obj5, Object obj6) {
                            b63.o oVar = (b63.o) obj5;
                            b11.i iVar = (b11.i) obj6;
                            switch (i16) {
                                case 0:
                                    oVar.getClass();
                                    iVar.getClass();
                                    boolean z14 = ((x01.j) p1VarC.getF182175a()).f188286e.f188256e;
                                    i21.d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.R4(z14, oVar, p13.w.c(iVar));
                                    dVar2.Q4(p13.w.c(oVar));
                                    gVar.invoke();
                                    break;
                                default:
                                    oVar.getClass();
                                    iVar.getClass();
                                    boolean z15 = ((x01.j) p1VarC.getF182175a()).f188286e.f188256e;
                                    i21.d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.R4(z15, oVar, p13.w.c(iVar));
                                    dVar3.Q4(p13.w.c(oVar));
                                    gVar.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        final int i17 = 1;
                        objQ4 = new e23.p() { // from class: b21.i0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                b63.o oVar = (b63.o) obj5;
                                b11.i iVar = (b11.i) obj6;
                                switch (i17) {
                                    case 0:
                                        oVar.getClass();
                                        iVar.getClass();
                                        boolean z14 = ((x01.j) p1VarC.getF182175a()).f188286e.f188256e;
                                        i21.d dVar2 = dVar;
                                        dVar2.getClass();
                                        dVar2.R4(z14, oVar, p13.w.c(iVar));
                                        dVar2.Q4(p13.w.c(oVar));
                                        gVar.invoke();
                                        break;
                                    default:
                                        oVar.getClass();
                                        iVar.getClass();
                                        boolean z15 = ((x01.j) p1VarC.getF182175a()).f188286e.f188256e;
                                        i21.d dVar3 = dVar;
                                        dVar3.getClass();
                                        dVar3.R4(z15, oVar, p13.w.c(iVar));
                                        dVar3.Q4(p13.w.c(oVar));
                                        gVar.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ4);
                    }
                }
                e23.p pVar3 = (e23.p) objQ4;
                boolean zB = mVar.B(gVar);
                Object objQ5 = mVar.q();
                if (zB) {
                    objQ5 = new k0(gVar, 3);
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new k0(gVar, 3);
                        mVar.K(objQ5);
                    }
                }
                k11.a0.c(tVar, null, feVar, pVar, null, pVar2, pVar3, null, (e23.a) objQ5, mVar, (iIntValue << 3) & 896, 146);
                return Unit.INSTANCE;
            case 1:
                i21.d dVar2 = (i21.d) obj;
                fe feVar2 = (fe) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                dVar2.getClass();
                feVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                l4.v0 v0Var = (l4.v0) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(l4.v0.class));
                u82.a aVar3 = dVar2.f87289w;
                v0Var.getClass();
                b63.o.Companion companion = b63.o.INSTANCE;
                String str = v0Var.f14978c;
                g21.i iVar = (g21.i) ((u82.f) aVar3.c(new o82.a(b63.o.Companion.b(companion, str), null, 2, null), mVar2).getF182175a()).a();
                i53.c<g21.p> cVar2 = (iVar == null || (hVar = iVar.f75433a) == null) ? null : hVar.f75430g;
                p3.p1 p1VarC2 = s9.c.c(dVar2.f87288v, mVar2);
                NutritionActivity.g gVar2 = this.f15338e;
                if (cVar2 == null || cVar2.isEmpty()) {
                    mVar2.C(1666054165);
                    mVar2.f();
                    gVar2.invoke();
                } else {
                    mVar2.C(1663006865);
                    q11.a aVarB = v0Var.b();
                    p3.p1 p1VarC3 = s9.c.c(o2Var, mVar2);
                    q11.a aVarB2 = v0Var.b();
                    b63.o oVarB = b63.o.Companion.b(companion, str);
                    Set set = (Set) p1VarC2.getF182175a();
                    boolean zR5 = mVar2.r(dVar2);
                    Object objQ6 = mVar2.q();
                    if (zR5) {
                        objQ6 = new a61.d(dVar2, 10);
                        mVar2.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a61.d(dVar2, 10);
                            mVar2.K(objQ6);
                        }
                    }
                    e23.p pVar4 = (e23.p) objQ6;
                    boolean zR6 = mVar2.r(cVar2) | mVar2.r(dVar2) | mVar2.k(aVarB.ordinal()) | mVar2.r(v0Var);
                    lc.m0 m0Var2 = this.f15337d;
                    boolean zR7 = zR6 | mVar2.r(m0Var2) | mVar2.B(p1VarC3) | mVar2.B(gVar2);
                    Object objQ7 = mVar2.q();
                    if (zR7) {
                        a11.p pVar5 = new a11.p(cVar2, dVar2, aVarB, v0Var, m0Var2, gVar2, p1VarC3, 1);
                        mVar2.K(pVar5);
                        objQ7 = pVar5;
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            a11.p pVar6 = new a11.p(cVar2, dVar2, aVarB, v0Var, m0Var2, gVar2, p1VarC3, 1);
                            mVar2.K(pVar6);
                            objQ7 = pVar6;
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ7;
                    boolean zR8 = mVar2.r(dVar2) | mVar2.B(gVar2);
                    Object objQ8 = mVar2.q();
                    if (zR8) {
                        objQ8 = new ao1.i(14, dVar2, gVar2);
                        mVar2.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new ao1.i(14, dVar2, gVar2);
                            mVar2.K(objQ8);
                        }
                    }
                    r11.m.a(null, feVar2, aVarB2, oVarB, cVar2, set, pVar4, aVar4, (e23.a) objQ8, mVar2, iIntValue2 & 112);
                    mVar2.f();
                }
                return Unit.INSTANCE;
            default:
                final i21.d dVar3 = (i21.d) obj;
                fe feVar3 = (fe) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                dVar3.getClass();
                feVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                l4.k kVar = (l4.k) lc.w.a(vVar, t0Var2.b(l4.k.class));
                boolean zR9 = mVar3.r(kVar);
                Object objQ9 = mVar3.q();
                if (zR9) {
                    objQ9 = new a03.e(kVar, 29);
                    mVar3.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new a03.e(kVar, 29);
                        mVar3.K(objQ9);
                    }
                }
                e23.a aVar5 = (e23.a) objQ9;
                mVar3.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar3);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(l11.a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar5);
                mVar3.R();
                l11.a aVar6 = (l11.a) u1VarResolveViewModel2;
                final p3.p1 p1VarC4 = s9.c.c(o2Var, mVar3);
                boolean zR10 = mVar3.r(kVar) | mVar3.r(dVar3) | mVar3.B(gVar);
                Object objQ10 = mVar3.q();
                if (zR10) {
                    objQ10 = new a3.e(kVar, 16, dVar3, gVar);
                    mVar3.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new a3.e(kVar, 16, dVar3, gVar);
                        mVar3.K(objQ10);
                    }
                }
                e23.p pVar7 = (e23.p) objQ10;
                boolean zR11 = mVar3.r(dVar3) | mVar3.B(p1VarC4) | mVar3.B(gVar);
                Object objQ11 = mVar3.q();
                if (zR11) {
                    objQ11 = new e23.p() { // from class: b21.i0
                        @Override // e23.p
                        public final Object invoke(Object obj5, Object obj6) {
                            b63.o oVar = (b63.o) obj5;
                            b11.i iVar2 = (b11.i) obj6;
                            switch (i15) {
                                case 0:
                                    oVar.getClass();
                                    iVar2.getClass();
                                    boolean z14 = ((x01.j) p1VarC4.getF182175a()).f188286e.f188256e;
                                    i21.d dVar4 = dVar3;
                                    dVar4.getClass();
                                    dVar4.R4(z14, oVar, p13.w.c(iVar2));
                                    dVar4.Q4(p13.w.c(oVar));
                                    gVar.invoke();
                                    break;
                                default:
                                    oVar.getClass();
                                    iVar2.getClass();
                                    boolean z15 = ((x01.j) p1VarC4.getF182175a()).f188286e.f188256e;
                                    i21.d dVar5 = dVar3;
                                    dVar5.getClass();
                                    dVar5.R4(z15, oVar, p13.w.c(iVar2));
                                    dVar5.Q4(p13.w.c(oVar));
                                    gVar.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar3.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new e23.p() { // from class: b21.i0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                b63.o oVar = (b63.o) obj5;
                                b11.i iVar2 = (b11.i) obj6;
                                switch (i15) {
                                    case 0:
                                        oVar.getClass();
                                        iVar2.getClass();
                                        boolean z14 = ((x01.j) p1VarC4.getF182175a()).f188286e.f188256e;
                                        i21.d dVar4 = dVar3;
                                        dVar4.getClass();
                                        dVar4.R4(z14, oVar, p13.w.c(iVar2));
                                        dVar4.Q4(p13.w.c(oVar));
                                        gVar.invoke();
                                        break;
                                    default:
                                        oVar.getClass();
                                        iVar2.getClass();
                                        boolean z15 = ((x01.j) p1VarC4.getF182175a()).f188286e.f188256e;
                                        i21.d dVar5 = dVar3;
                                        dVar5.getClass();
                                        dVar5.R4(z15, oVar, p13.w.c(iVar2));
                                        dVar5.Q4(p13.w.c(oVar));
                                        gVar.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ11);
                    }
                }
                e23.p pVar8 = (e23.p) objQ11;
                boolean zR12 = mVar3.r(m0Var);
                Object objQ12 = mVar3.q();
                if (zR12) {
                    objQ12 = new j0(m0Var, 0);
                    mVar3.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new j0(m0Var, 0);
                        mVar3.K(objQ12);
                    }
                }
                e23.p pVar9 = (e23.p) objQ12;
                boolean zB2 = mVar3.B(gVar);
                Object objQ13 = mVar3.q();
                if (zB2) {
                    objQ13 = new k0(gVar, 0);
                    mVar3.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new k0(gVar, 0);
                        mVar3.K(objQ13);
                    }
                }
                k11.m.a(aVar6, null, null, feVar3, pVar7, pVar8, pVar9, null, null, (e23.a) objQ13, mVar3, (iIntValue3 << 6) & 7168, 390);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w0(lc.v vVar, r53.o2 o2Var, NutritionActivity.g gVar, lc.m0 m0Var, int i14) {
        this.f15334a = i14;
        this.f15335b = vVar;
        this.f15336c = o2Var;
        this.f15338e = gVar;
        this.f15337d = m0Var;
    }
}
