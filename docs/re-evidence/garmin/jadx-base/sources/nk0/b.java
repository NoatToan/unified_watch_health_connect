package nk0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b21.j0;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import e23.p;
import e23.r;
import java.util.ArrayList;
import java.util.List;
import jk0.x;
import lc.m0;
import lc.v;
import lc.w;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.y;
import p3.n;
import p3.p1;
import p3.x1;
import sk0.l0;
import sk0.l1;
import sk0.n1;
import sk0.p0;
import sk0.s1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GearActivity f126377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GearActivity.w f126378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f126379d;

    public /* synthetic */ b(GearActivity gearActivity, GearActivity.w wVar, m0 m0Var) {
        this.f126376a = 1;
        this.f126377b = gearActivity;
        this.f126378c = wVar;
        this.f126379d = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0411  */
    /* JADX WARN: Code duplicated, block: B:15:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:22:0x0101  */
    /* JADX WARN: Code duplicated, block: B:27:0x011d  */
    /* JADX WARN: Code duplicated, block: B:32:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0202  */
    /* JADX WARN: Code duplicated, block: B:57:0x0226  */
    /* JADX WARN: Code duplicated, block: B:62:0x0249  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0387  */
    /* JADX WARN: Code duplicated, block: B:88:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x005e  */
    /* JADX WARN: Code duplicated, block: B:93:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x03ec  */
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
        n1 n1Var;
        Object obj5;
        m0 m0Var;
        int i14 = this.f126376a;
        GearActivity.w wVar = this.f126378c;
        m0 m0Var2 = this.f126379d;
        GearActivity gearActivity = this.f126377b;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                v vVar = (v) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar2 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var = n.f135158a;
                gearActivity.ea("Gear_EditCollection", mVar, 6);
                t0 t0Var = s0.f105811a;
                GearRoute.g gVar = (GearRoute.g) w.a(vVar, t0Var.b(GearRoute.g.class));
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(p0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
                mVar.R();
                p0 p0Var = (p0) u1VarResolveViewModel;
                p1 p1VarN = n23.j.n(vVar, "MultiActivitySelectionScreen_Selected", null, mVar);
                p1 p1VarN2 = n23.j.n(vVar, "ManageCollectionGearScreen_SelectedGear", null, mVar);
                l0 l0Var = gVar.f35639a;
                List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list = gVar.f35640b;
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                for (com.garmin.android.apps.connectmobile.gear.presentation.navigation.a aVar3 : list) {
                    aVar3.getClass();
                    arrayList.add(new jk0.n(aVar3.f35687a, aVar3.f35688b, aVar3.f35689c, aVar3.f35690d, aVar3.f35691e, aVar3.f35692f));
                    l0Var = l0Var;
                }
                l0 l0Var2 = l0Var;
                boolean zR = mVar.r(m0Var2);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new ky0.w(m0Var2, 2);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ky0.w(m0Var2, 2);
                        mVar.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zB = mVar.B(p1VarN2) | mVar.r(vVar);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new d(p1VarN2, vVar, 0);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d(p1VarN2, vVar, 0);
                        mVar.K(objQ2);
                    }
                }
                e23.l lVar2 = (e23.l) objQ2;
                boolean zR2 = mVar.r(m0Var2);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new j0(m0Var2, 15);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j0(m0Var2, 15);
                        mVar.K(objQ3);
                    }
                }
                p pVar = (p) objQ3;
                boolean zB2 = mVar.B(p1VarN) | mVar.r(vVar);
                Object objQ4 = mVar.q();
                if (zB2) {
                    objQ4 = new d(p1VarN, vVar, 1);
                    mVar.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new d(p1VarN, vVar, 1);
                        mVar.K(objQ4);
                    }
                }
                e23.l lVar3 = (e23.l) objQ4;
                boolean zR3 = mVar.r(m0Var2);
                GearActivity.w wVar2 = this.f126378c;
                boolean zB3 = zR3 | mVar.B(wVar2);
                Object objQ5 = mVar.q();
                if (zB3) {
                    objQ5 = new e(m0Var2, wVar2, 0);
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new e(m0Var2, wVar2, 0);
                        mVar.K(objQ5);
                    }
                }
                sk0.g.c(l0Var2, arrayList, p0Var, lVar, lVar2, pVar, lVar3, (e23.a) objQ5, wVar2, mVar, 0);
                x1 x1Var2 = n.f135158a;
                return Unit.INSTANCE;
            case 1:
                v vVar2 = (v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar4 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar2.getClass();
                x1 x1Var3 = n.f135158a;
                gearActivity.ea("Gear_SelectGearType", mVar2, 6);
                GearRoute.r rVar = (GearRoute.r) w.a(vVar2, s0.f105811a.b(GearRoute.r.class));
                boolean zR4 = mVar2.r(m0Var2) | mVar2.r(rVar);
                Object objQ6 = mVar2.q();
                if (zR4) {
                    objQ6 = new ml0.e(25, m0Var2, rVar);
                    mVar2.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new ml0.e(25, m0Var2, rVar);
                        mVar2.K(objQ6);
                    }
                }
                s1.b(wVar, (e23.l) objQ6, mVar2, 0);
                return Unit.INSTANCE;
            case 2:
                r1.l lVar4 = (r1.l) obj;
                v vVar3 = (v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar5 = GearActivity.f35500b;
                lVar4.getClass();
                vVar3.getClass();
                x1 x1Var4 = n.f135158a;
                gearActivity.ea("Gear_AddCollection", mVar3, 6);
                mVar3.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar3);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(sk0.i.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar3, 0), null);
                mVar3.R();
                sk0.i iVar = (sk0.i) u1VarResolveViewModel2;
                p1 p1VarN3 = n23.j.n(vVar3, "MultiActivitySelectionScreen_Selected", null, mVar3);
                p1 p1VarN4 = n23.j.n(vVar3, "ManageCollectionGearScreen_SelectedGear", null, mVar3);
                boolean zR5 = mVar3.r(m0Var2);
                Object objQ7 = mVar3.q();
                if (zR5) {
                    objQ7 = new ky0.w(m0Var2, 4);
                    mVar3.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new ky0.w(m0Var2, 4);
                        mVar3.K(objQ7);
                    }
                }
                e23.l lVar5 = (e23.l) objQ7;
                boolean zB4 = mVar3.B(p1VarN4) | mVar3.r(vVar3);
                Object objQ8 = mVar3.q();
                if (zB4) {
                    objQ8 = new d(p1VarN4, vVar3, 6);
                    mVar3.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new d(p1VarN4, vVar3, 6);
                        mVar3.K(objQ8);
                    }
                }
                e23.l lVar6 = (e23.l) objQ8;
                boolean zR6 = mVar3.r(m0Var2);
                Object objQ9 = mVar3.q();
                if (zR6) {
                    objQ9 = new j0(m0Var2, 18);
                    mVar3.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new j0(m0Var2, 18);
                        mVar3.K(objQ9);
                    }
                }
                p pVar2 = (p) objQ9;
                boolean zB5 = mVar3.B(p1VarN3) | mVar3.r(vVar3);
                Object objQ10 = mVar3.q();
                if (zB5) {
                    objQ10 = new d(p1VarN3, vVar3, 7);
                    mVar3.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new d(p1VarN3, vVar3, 7);
                        mVar3.K(objQ10);
                    }
                }
                e23.l lVar7 = (e23.l) objQ10;
                boolean zR7 = mVar3.r(m0Var2) | mVar3.r(lVar4);
                Object objQ11 = mVar3.q();
                if (zR7) {
                    objQ11 = new ml0.e(19, m0Var2, lVar4);
                    mVar3.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new ml0.e(19, m0Var2, lVar4);
                        mVar3.K(objQ11);
                    }
                }
                sk0.g.a(iVar, lVar5, lVar6, pVar2, lVar7, (e23.l) objQ11, this.f126378c, mVar3, 0);
                return Unit.INSTANCE;
            default:
                v vVar4 = (v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar6 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar4.getClass();
                x1 x1Var5 = n.f135158a;
                GearActivity gearActivity2 = this.f126377b;
                gearActivity2.ea("Gear_ManageCollectionGear", mVar4, 6);
                t0 t0Var2 = s0.f105811a;
                Object obj6 = (GearRoute.l) w.a(vVar4, t0Var2.b(GearRoute.l.class));
                boolean zR8 = mVar4.r(obj6);
                Object objQ12 = mVar4.q();
                if (zR8) {
                    objQ12 = new n82.i(obj6, 6);
                    mVar4.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new n82.i(obj6, 6);
                        mVar4.K(objQ12);
                    }
                }
                e23.a aVar7 = (e23.a) objQ12;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar4);
                if (viewModelStoreOwnerA3 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var2.b(n1.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar7);
                mVar4.R();
                n1 n1Var2 = (n1) u1VarResolveViewModel3;
                p1 p1VarN5 = n23.j.n(vVar4, "AddGearScreen_Created", null, mVar4);
                x xVar = (x) p1VarN5.getF182175a();
                boolean zB6 = mVar4.B(p1VarN5) | mVar4.r(n1Var2) | mVar4.r(gearActivity2);
                m0 m0Var3 = this.f126379d;
                boolean zR9 = zB6 | mVar4.r(m0Var3) | mVar4.r(vVar4);
                Object objQ13 = mVar4.q();
                if (zR9) {
                    n1Var = n1Var2;
                    Object kVar = new GearActivity.k(p1VarN5, n1Var, gearActivity2, m0Var3, vVar4, null);
                    obj5 = gearActivity2;
                    m0Var = m0Var3;
                    mVar4.K(kVar);
                    objQ13 = kVar;
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        n1Var = n1Var2;
                        Object kVar2 = new GearActivity.k(p1VarN5, n1Var, gearActivity2, m0Var3, vVar4, null);
                        obj5 = gearActivity2;
                        m0Var = m0Var3;
                        mVar4.K(kVar2);
                        objQ13 = kVar2;
                    } else {
                        obj5 = gearActivity2;
                        m0Var = m0Var3;
                        n1Var = n1Var2;
                    }
                }
                p3.l0.e((p) objQ13, xVar, mVar4);
                boolean zR10 = mVar4.r(m0Var) | mVar4.B(wVar);
                Object objQ14 = mVar4.q();
                if (zR10) {
                    objQ14 = new g(m0Var, wVar, 0);
                    mVar4.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new g(m0Var, wVar, 0);
                        mVar4.K(objQ14);
                    }
                }
                e23.l lVar8 = (e23.l) objQ14;
                boolean zR11 = mVar4.r(m0Var);
                Object objQ15 = mVar4.q();
                if (zR11) {
                    objQ15 = new k62.j(m0Var, 23);
                    mVar4.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new k62.j(m0Var, 23);
                        mVar4.K(objQ15);
                    }
                }
                e23.a aVar8 = (e23.a) objQ15;
                boolean zR12 = mVar4.r(obj5);
                Object objQ16 = mVar4.q();
                if (zR12) {
                    objQ16 = new GearActivity.l(obj5);
                    mVar4.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new GearActivity.l(obj5);
                        mVar4.K(objQ16);
                    }
                }
                l1.a(n1Var, lVar8, aVar8, (e23.a) ((k23.g) objQ16), mVar4, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(GearActivity gearActivity, m0 m0Var, GearActivity.w wVar, int i14) {
        this.f126376a = i14;
        this.f126377b = gearActivity;
        this.f126379d = m0Var;
        this.f126378c = wVar;
    }
}
