package nk0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b21.j0;
import c80.u;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import e23.p;
import e23.q;
import e23.r;
import java.util.ArrayList;
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
import p3.l0;
import p3.n;
import p3.p1;
import p3.x1;
import rk0.o0;
import sk0.b1;
import sk0.q0;
import sk0.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GearActivity f126372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bv.d f126373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f126374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GearActivity.w f126375e;

    public /* synthetic */ a(GearActivity gearActivity, bv.d dVar, GearActivity.w wVar, m0 m0Var) {
        this.f126371a = 4;
        this.f126372b = gearActivity;
        this.f126373c = dVar;
        this.f126375e = wVar;
        this.f126374d = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0436  */
    /* JADX WARN: Code duplicated, block: B:10:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:110:0x0464  */
    /* JADX WARN: Code duplicated, block: B:117:0x049e  */
    /* JADX WARN: Code duplicated, block: B:122:0x04de  */
    /* JADX WARN: Code duplicated, block: B:127:0x050c  */
    /* JADX WARN: Code duplicated, block: B:132:0x052a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0548  */
    /* JADX WARN: Code duplicated, block: B:142:0x056e  */
    /* JADX WARN: Code duplicated, block: B:147:0x058b  */
    /* JADX WARN: Code duplicated, block: B:152:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:15:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:170:0x0654  */
    /* JADX WARN: Code duplicated, block: B:177:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:182:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:187:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:192:0x070d  */
    /* JADX WARN: Code duplicated, block: B:197:0x072b  */
    /* JADX WARN: Code duplicated, block: B:202:0x074e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0111  */
    /* JADX WARN: Code duplicated, block: B:210:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:217:0x080b  */
    /* JADX WARN: Code duplicated, block: B:222:0x082f  */
    /* JADX WARN: Code duplicated, block: B:227:0x084e  */
    /* JADX WARN: Code duplicated, block: B:232:0x086c  */
    /* JADX WARN: Code duplicated, block: B:237:0x088f  */
    /* JADX WARN: Code duplicated, block: B:242:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:25:0x013f  */
    /* JADX WARN: Code duplicated, block: B:30:0x016d  */
    /* JADX WARN: Code duplicated, block: B:35:0x019b  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0216  */
    /* JADX WARN: Code duplicated, block: B:65:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0319  */
    /* JADX WARN: Code duplicated, block: B:85:0x0336  */
    /* JADX WARN: Code duplicated, block: B:90:0x0358  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c0  */
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
        v vVar;
        rk0.k kVar;
        m0 m0Var;
        int i14 = this.f126371a;
        int i15 = 1;
        m0 m0Var2 = this.f126374d;
        p3.m.a aVar = p3.m.f135153a;
        GearActivity gearActivity = this.f126372b;
        int i16 = 0;
        switch (i14) {
            case 0:
                v vVar2 = (v) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar2 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar2.getClass();
                x1 x1Var = n.f135158a;
                gearActivity.ea("Gear_EditGear", mVar, 6);
                t0 t0Var = s0.f105811a;
                GearRoute.h hVar = (GearRoute.h) w.a(vVar2, t0Var.b(GearRoute.h.class));
                boolean zB = mVar.B(hVar.f35642a);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = og2.k.O(hVar.f35642a);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = og2.k.O(hVar.f35642a);
                        mVar.K(objQ);
                    }
                }
                x xVar = (x) objQ;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(q0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
                mVar.R();
                q0 q0Var = (q0) u1VarResolveViewModel;
                p1 p1VarN = n23.j.n(vVar2, "MultiActivitySelectionScreen_Selected", null, mVar);
                p1 p1VarN2 = n23.j.n(vVar2, "BrandModelSelectionResult", null, mVar);
                boolean zR = mVar.r(m0Var2);
                Object objQ2 = mVar.q();
                if (zR) {
                    objQ2 = new j0(m0Var2, 19);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new j0(m0Var2, 19);
                        mVar.K(objQ2);
                    }
                }
                p pVar = (p) objQ2;
                boolean zB2 = mVar.B(p1VarN) | mVar.r(vVar2);
                Object objQ3 = mVar.q();
                if (zB2) {
                    objQ3 = new d(p1VarN, vVar2, 8);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new d(p1VarN, vVar2, 8);
                        mVar.K(objQ3);
                    }
                }
                e23.l lVar = (e23.l) objQ3;
                boolean zR2 = mVar.r(m0Var2);
                Object objQ4 = mVar.q();
                if (zR2) {
                    objQ4 = new h(m0Var2, 4);
                    mVar.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new h(m0Var2, 4);
                        mVar.K(objQ4);
                    }
                }
                q qVar = (q) objQ4;
                boolean zR3 = mVar.r(m0Var2);
                Object objQ5 = mVar.q();
                if (zR3) {
                    objQ5 = new h(m0Var2, 5);
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new h(m0Var2, 5);
                        mVar.K(objQ5);
                    }
                }
                q qVar2 = (q) objQ5;
                boolean zB3 = mVar.B(p1VarN2) | mVar.r(vVar2);
                Object objQ6 = mVar.q();
                if (zB3) {
                    objQ6 = new d(p1VarN2, vVar2, 9);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new d(p1VarN2, vVar2, 9);
                        mVar.K(objQ6);
                    }
                }
                e23.l lVar2 = (e23.l) objQ6;
                boolean zR4 = mVar.r(m0Var2);
                GearActivity.w wVar = this.f126375e;
                boolean zB4 = zR4 | mVar.B(wVar);
                Object objQ7 = mVar.q();
                if (zB4) {
                    objQ7 = new g(m0Var2, wVar, 1);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new g(m0Var2, wVar, 1);
                        mVar.K(objQ7);
                    }
                }
                sk0.p.d(xVar, q0Var, this.f126373c, pVar, lVar, qVar, qVar2, lVar2, (e23.l) objQ7, wVar, mVar, 0);
                return Unit.INSTANCE;
            case 1:
                v vVar3 = (v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar3 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar3.getClass();
                x1 x1Var2 = n.f135158a;
                gearActivity.ea("Gear_DuplicateGear", mVar2, 6);
                t0 t0Var2 = s0.f105811a;
                GearRoute.f fVar = (GearRoute.f) w.a(vVar3, t0Var2.b(GearRoute.f.class));
                boolean zB5 = mVar2.B(fVar.f35636a);
                Object objQ8 = mVar2.q();
                if (zB5) {
                    objQ8 = og2.k.O(fVar.f35636a);
                    mVar2.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = og2.k.O(fVar.f35636a);
                        mVar2.K(objQ8);
                    }
                }
                x xVar2 = (x) objQ8;
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar2);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(sk0.r.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                mVar2.R();
                sk0.r rVar = (sk0.r) u1VarResolveViewModel2;
                p1 p1VarN3 = n23.j.n(vVar3, "MultiActivitySelectionScreen_Selected", null, mVar2);
                p1 p1VarN4 = n23.j.n(vVar3, "BrandModelSelectionResult", null, mVar2);
                boolean zR5 = mVar2.r(gearActivity) | mVar2.r(m0Var2);
                Object objQ9 = mVar2.q();
                if (zR5) {
                    objQ9 = new ky0.w(gearActivity, m0Var2);
                    mVar2.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new ky0.w(gearActivity, m0Var2);
                        mVar2.K(objQ9);
                    }
                }
                e23.l lVar3 = (e23.l) objQ9;
                boolean zR6 = mVar2.r(m0Var2);
                Object objQ10 = mVar2.q();
                if (zR6) {
                    objQ10 = new j0(m0Var2, 17);
                    mVar2.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new j0(m0Var2, 17);
                        mVar2.K(objQ10);
                    }
                }
                p pVar2 = (p) objQ10;
                boolean zB6 = mVar2.B(p1VarN3) | mVar2.r(vVar3);
                Object objQ11 = mVar2.q();
                if (zB6) {
                    objQ11 = new d(p1VarN3, vVar3, 4);
                    mVar2.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new d(p1VarN3, vVar3, 4);
                        mVar2.K(objQ11);
                    }
                }
                e23.l lVar4 = (e23.l) objQ11;
                boolean zR7 = mVar2.r(m0Var2);
                Object objQ12 = mVar2.q();
                if (zR7) {
                    objQ12 = new h(m0Var2, 2);
                    mVar2.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new h(m0Var2, 2);
                        mVar2.K(objQ12);
                    }
                }
                q qVar3 = (q) objQ12;
                boolean zR8 = mVar2.r(m0Var2);
                Object objQ13 = mVar2.q();
                if (zR8) {
                    objQ13 = new h(m0Var2, 3);
                    mVar2.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new h(m0Var2, 3);
                        mVar2.K(objQ13);
                    }
                }
                q qVar4 = (q) objQ13;
                boolean zB7 = mVar2.B(p1VarN4) | mVar2.r(vVar3);
                Object objQ14 = mVar2.q();
                if (zB7) {
                    objQ14 = new d(p1VarN4, vVar3, 5);
                    mVar2.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new d(p1VarN4, vVar3, 5);
                        mVar2.K(objQ14);
                    }
                }
                sk0.p.c(xVar2, rVar, this.f126373c, lVar3, pVar2, lVar4, qVar3, qVar4, (e23.l) objQ14, this.f126375e, mVar2, 0);
                return Unit.INSTANCE;
            case 2:
                v vVar4 = (v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar4 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar4.getClass();
                x1 x1Var3 = n.f135158a;
                gearActivity.ea("Gear_CollectionDetails", mVar3, 6);
                t0 t0Var3 = s0.f105811a;
                Object obj5 = (GearRoute.d) w.a(vVar4, t0Var3.b(GearRoute.d.class));
                boolean zR9 = mVar3.r(obj5);
                Object objQ15 = mVar3.q();
                if (zR9) {
                    objQ15 = new n82.i(obj5, 9);
                    mVar3.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new n82.i(obj5, 9);
                        mVar3.K(objQ15);
                    }
                }
                e23.a aVar5 = (e23.a) objQ15;
                mVar3.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar3);
                if (viewModelStoreOwnerA3 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var3.b(rk0.k.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar5);
                mVar3.R();
                rk0.k kVar2 = (rk0.k) u1VarResolveViewModel3;
                p1 p1VarN5 = n23.j.n(vVar4, "MultiActivitySelectionScreen_Selected", null, mVar3);
                p1 p1VarN6 = n23.j.n(vVar4, "ManageCollectionGearScreen_SelectedGear", null, mVar3);
                p1 p1VarN7 = n23.j.n(vVar4, "GearDetailsScreen_Edited", null, mVar3);
                p1 p1VarN8 = n23.j.n(vVar4, "EditCollectionScreen_Edited", null, mVar3);
                p1 p1VarN9 = n23.j.n(vVar4, "ManagePhotos_Edited", null, mVar3);
                qk0.d dVar = (qk0.d) p1VarN5.getF182175a();
                boolean zB8 = mVar3.B(p1VarN5) | mVar3.r(kVar2) | mVar3.r(vVar4);
                Object objQ16 = mVar3.q();
                if (zB8) {
                    objQ16 = new GearActivity.r(p1VarN5, kVar2, vVar4, null);
                    mVar3.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new GearActivity.r(p1VarN5, kVar2, vVar4, null);
                        mVar3.K(objQ16);
                    }
                }
                l0.e((p) objQ16, dVar, mVar3);
                ArrayList arrayList = (ArrayList) p1VarN6.getF182175a();
                boolean zB9 = mVar3.B(p1VarN6) | mVar3.r(kVar2) | mVar3.r(vVar4);
                Object objQ17 = mVar3.q();
                if (zB9) {
                    objQ17 = new GearActivity.s(p1VarN6, kVar2, vVar4, null);
                    mVar3.K(objQ17);
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new GearActivity.s(p1VarN6, kVar2, vVar4, null);
                        mVar3.K(objQ17);
                    }
                }
                l0.e((p) objQ17, arrayList, mVar3);
                o0 o0Var = (o0) p1VarN7.getF182175a();
                boolean zB10 = mVar3.B(p1VarN7) | mVar3.r(kVar2);
                m0 m0Var3 = this.f126374d;
                boolean zR10 = zB10 | mVar3.r(m0Var3) | mVar3.r(vVar4);
                Object objQ18 = mVar3.q();
                if (zR10) {
                    objQ18 = new GearActivity.t(vVar4, p1VarN7, kVar2, m0Var3, null);
                    vVar = vVar4;
                    kVar = kVar2;
                    m0Var = m0Var3;
                    mVar3.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new GearActivity.t(vVar4, p1VarN7, kVar2, m0Var3, null);
                        vVar = vVar4;
                        kVar = kVar2;
                        m0Var = m0Var3;
                        mVar3.K(objQ18);
                    } else {
                        kVar = kVar2;
                        vVar = vVar4;
                        m0Var = m0Var3;
                    }
                }
                l0.e((p) objQ18, o0Var, mVar3);
                Boolean bool = (Boolean) p1VarN8.getF182175a();
                boolean zB11 = mVar3.B(p1VarN8) | mVar3.r(kVar) | mVar3.r(vVar);
                Object objQ19 = mVar3.q();
                if (zB11) {
                    objQ19 = new GearActivity.u(kVar, vVar, p1VarN8, null);
                    mVar3.K(objQ19);
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new GearActivity.u(kVar, vVar, p1VarN8, null);
                        mVar3.K(objQ19);
                    }
                }
                l0.e((p) objQ19, bool, mVar3);
                Boolean bool2 = (Boolean) p1VarN9.getF182175a();
                boolean zB12 = mVar3.B(p1VarN9) | mVar3.r(kVar) | mVar3.r(vVar);
                Object objQ20 = mVar3.q();
                if (zB12) {
                    objQ20 = new GearActivity.v(kVar, vVar, p1VarN9, null);
                    mVar3.K(objQ20);
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new GearActivity.v(kVar, vVar, p1VarN9, null);
                        mVar3.K(objQ20);
                    }
                }
                l0.e((p) objQ20, bool2, mVar3);
                boolean zR11 = mVar3.r(m0Var);
                Object objQ21 = mVar3.q();
                if (zR11) {
                    objQ21 = new ky0.w(m0Var, 7);
                    mVar3.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new ky0.w(m0Var, 7);
                        mVar3.K(objQ21);
                    }
                }
                e23.l lVar5 = (e23.l) objQ21;
                boolean zR12 = mVar3.r(m0Var);
                Object objQ22 = mVar3.q();
                if (zR12) {
                    objQ22 = new k62.j(m0Var, 26);
                    mVar3.K(objQ22);
                } else {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new k62.j(m0Var, 26);
                        mVar3.K(objQ22);
                    }
                }
                e23.a aVar6 = (e23.a) objQ22;
                boolean zR13 = mVar3.r(m0Var);
                GearActivity.w wVar2 = this.f126375e;
                boolean zB13 = zR13 | mVar3.B(wVar2);
                Object objQ23 = mVar3.q();
                if (zB13) {
                    objQ23 = new e(m0Var, wVar2, 1);
                    mVar3.K(objQ23);
                } else {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new e(m0Var, wVar2, 1);
                        mVar3.K(objQ23);
                    }
                }
                e23.a aVar7 = (e23.a) objQ23;
                boolean zR14 = mVar3.r(m0Var);
                Object objQ24 = mVar3.q();
                if (zR14) {
                    objQ24 = new ky0.w(m0Var, 8);
                    mVar3.K(objQ24);
                } else {
                    aVar.getClass();
                    if (objQ24 == p3.m.a.f135155b) {
                        objQ24 = new ky0.w(m0Var, 8);
                        mVar3.K(objQ24);
                    }
                }
                e23.l lVar6 = (e23.l) objQ24;
                boolean zR15 = mVar3.r(m0Var);
                Object objQ25 = mVar3.q();
                if (zR15) {
                    objQ25 = new ky0.w(m0Var, 9);
                    mVar3.K(objQ25);
                } else {
                    aVar.getClass();
                    if (objQ25 == p3.m.a.f135155b) {
                        objQ25 = new ky0.w(m0Var, 9);
                        mVar3.K(objQ25);
                    }
                }
                e23.l lVar7 = (e23.l) objQ25;
                boolean zR16 = mVar3.r(m0Var);
                Object objQ26 = mVar3.q();
                if (zR16) {
                    objQ26 = new j0(m0Var, 22);
                    mVar3.K(objQ26);
                } else {
                    aVar.getClass();
                    if (objQ26 == p3.m.a.f135155b) {
                        objQ26 = new j0(m0Var, 22);
                        mVar3.K(objQ26);
                    }
                }
                p pVar3 = (p) objQ26;
                boolean zR17 = mVar3.r(m0Var) | mVar3.r(obj5);
                Object objQ27 = mVar3.q();
                if (zR17) {
                    objQ27 = new ml0.e(23, m0Var, obj5);
                    mVar3.K(objQ27);
                } else {
                    aVar.getClass();
                    if (objQ27 == p3.m.a.f135155b) {
                        objQ27 = new ml0.e(23, m0Var, obj5);
                        mVar3.K(objQ27);
                    }
                }
                rk0.k kVar3 = kVar;
                rk0.h.b(kVar3, this.f126373c, wVar2, lVar5, aVar6, aVar7, lVar6, lVar7, pVar3, (e23.l) objQ27, mVar3, 0);
                return Unit.INSTANCE;
            case 3:
                v vVar5 = (v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar8 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar5.getClass();
                x1 x1Var4 = n.f135158a;
                gearActivity.ea("Gear_AddGear", mVar4, 6);
                t0 t0Var4 = s0.f105811a;
                GearRoute.b bVar = (GearRoute.b) w.a(vVar5, t0Var4.b(GearRoute.b.class));
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA4 = v9.a.a(mVar4);
                if (viewModelStoreOwnerA4 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel4 = GetViewModelKt.resolveViewModel(t0Var4.b(sk0.r.class), viewModelStoreOwnerA4.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA4), null, KoinApplicationKt.currentKoinScope(mVar4, 0), null);
                mVar4.R();
                sk0.r rVar2 = (sk0.r) u1VarResolveViewModel4;
                p1 p1VarN10 = n23.j.n(vVar5, "MultiActivitySelectionScreen_Selected", null, mVar4);
                p1 p1VarN11 = n23.j.n(vVar5, "BrandModelSelectionResult", null, mVar4);
                u uVar = bVar.f35625b;
                boolean zR18 = mVar4.r(m0Var2) | mVar4.r(bVar);
                Object objQ28 = mVar4.q();
                if (zR18) {
                    objQ28 = new ml0.e(18, m0Var2, bVar);
                    mVar4.K(objQ28);
                } else {
                    aVar.getClass();
                    if (objQ28 == p3.m.a.f135155b) {
                        objQ28 = new ml0.e(18, m0Var2, bVar);
                        mVar4.K(objQ28);
                    }
                }
                e23.l lVar8 = (e23.l) objQ28;
                boolean zR19 = mVar4.r(m0Var2);
                Object objQ29 = mVar4.q();
                if (zR19) {
                    objQ29 = new j0(m0Var2, 16);
                    mVar4.K(objQ29);
                } else {
                    aVar.getClass();
                    if (objQ29 == p3.m.a.f135155b) {
                        objQ29 = new j0(m0Var2, 16);
                        mVar4.K(objQ29);
                    }
                }
                p pVar4 = (p) objQ29;
                boolean zB14 = mVar4.B(p1VarN10) | mVar4.r(vVar5);
                Object objQ30 = mVar4.q();
                if (zB14) {
                    objQ30 = new d(p1VarN10, vVar5, 2);
                    mVar4.K(objQ30);
                } else {
                    aVar.getClass();
                    if (objQ30 == p3.m.a.f135155b) {
                        objQ30 = new d(p1VarN10, vVar5, 2);
                        mVar4.K(objQ30);
                    }
                }
                e23.l lVar9 = (e23.l) objQ30;
                boolean zR20 = mVar4.r(m0Var2);
                Object objQ31 = mVar4.q();
                if (zR20) {
                    objQ31 = new h(m0Var2, i16);
                    mVar4.K(objQ31);
                } else {
                    aVar.getClass();
                    if (objQ31 == p3.m.a.f135155b) {
                        objQ31 = new h(m0Var2, i16);
                        mVar4.K(objQ31);
                    }
                }
                q qVar5 = (q) objQ31;
                boolean zR21 = mVar4.r(m0Var2);
                Object objQ32 = mVar4.q();
                if (zR21) {
                    objQ32 = new h(m0Var2, i15);
                    mVar4.K(objQ32);
                } else {
                    aVar.getClass();
                    if (objQ32 == p3.m.a.f135155b) {
                        objQ32 = new h(m0Var2, i15);
                        mVar4.K(objQ32);
                    }
                }
                q qVar6 = (q) objQ32;
                boolean zB15 = mVar4.B(p1VarN11) | mVar4.r(vVar5);
                Object objQ33 = mVar4.q();
                if (zB15) {
                    objQ33 = new d(p1VarN11, vVar5, 3);
                    mVar4.K(objQ33);
                } else {
                    aVar.getClass();
                    if (objQ33 == p3.m.a.f135155b) {
                        objQ33 = new d(p1VarN11, vVar5, 3);
                        mVar4.K(objQ33);
                    }
                }
                sk0.p.a(uVar, rVar2, this.f126373c, lVar8, pVar4, lVar9, qVar5, qVar6, (e23.l) objQ33, this.f126375e, mVar4, 0);
                return Unit.INSTANCE;
            default:
                v vVar6 = (v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                GearActivity.a aVar9 = GearActivity.f35500b;
                ((r1.l) obj).getClass();
                vVar6.getClass();
                x1 x1Var5 = n.f135158a;
                gearActivity.ea("Gear_GearList", mVar5, 6);
                mVar5.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA5 = v9.a.a(mVar5);
                if (viewModelStoreOwnerA5 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel5 = GetViewModelKt.resolveViewModel(s0.f105811a.b(b1.class), viewModelStoreOwnerA5.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA5), null, KoinApplicationKt.currentKoinScope(mVar5, 0), null);
                mVar5.R();
                b1 b1Var = (b1) u1VarResolveViewModel5;
                p1 p1VarN12 = n23.j.n(vVar6, "AddGearScreen_Created", null, mVar5);
                p1 p1VarN13 = n23.j.n(vVar6, "AddCollectionScreen_Created", null, mVar5);
                p1 p1VarN14 = n23.j.n(vVar6, "ManageCollectionGearScreen_GearCreated", null, mVar5);
                p1 p1VarN15 = n23.j.n(vVar6, "GearDetailsScreen_Edited", null, mVar5);
                p1 p1VarN16 = n23.j.n(vVar6, "CollectionDetailsScreen_Edited", null, mVar5);
                p1 p1VarN17 = n23.j.n(vVar6, "CollectionDetailsScreen_GearEdited", null, mVar5);
                x xVar3 = (x) p1VarN12.getF182175a();
                boolean zB16 = mVar5.B(p1VarN12) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ34 = mVar5.q();
                if (zB16) {
                    objQ34 = new GearActivity.c(p1VarN12, b1Var, vVar6, null);
                    mVar5.K(objQ34);
                } else {
                    aVar.getClass();
                    if (objQ34 == p3.m.a.f135155b) {
                        objQ34 = new GearActivity.c(p1VarN12, b1Var, vVar6, null);
                        mVar5.K(objQ34);
                    }
                }
                l0.e((p) objQ34, xVar3, mVar5);
                Boolean bool3 = (Boolean) p1VarN13.getF182175a();
                boolean zB17 = mVar5.B(p1VarN13) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ35 = mVar5.q();
                if (zB17) {
                    objQ35 = new GearActivity.d(b1Var, vVar6, p1VarN13, null);
                    mVar5.K(objQ35);
                } else {
                    aVar.getClass();
                    if (objQ35 == p3.m.a.f135155b) {
                        objQ35 = new GearActivity.d(b1Var, vVar6, p1VarN13, null);
                        mVar5.K(objQ35);
                    }
                }
                l0.e((p) objQ35, bool3, mVar5);
                o0 o0Var2 = (o0) p1VarN15.getF182175a();
                boolean zB18 = mVar5.B(p1VarN15) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ36 = mVar5.q();
                if (zB18) {
                    objQ36 = new GearActivity.e(p1VarN15, b1Var, vVar6, null);
                    mVar5.K(objQ36);
                } else {
                    aVar.getClass();
                    if (objQ36 == p3.m.a.f135155b) {
                        objQ36 = new GearActivity.e(p1VarN15, b1Var, vVar6, null);
                        mVar5.K(objQ36);
                    }
                }
                l0.e((p) objQ36, o0Var2, mVar5);
                Boolean bool4 = (Boolean) p1VarN16.getF182175a();
                boolean zB19 = mVar5.B(p1VarN16) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ37 = mVar5.q();
                if (zB19) {
                    objQ37 = new GearActivity.f(b1Var, vVar6, p1VarN16, null);
                    mVar5.K(objQ37);
                } else {
                    aVar.getClass();
                    if (objQ37 == p3.m.a.f135155b) {
                        objQ37 = new GearActivity.f(b1Var, vVar6, p1VarN16, null);
                        mVar5.K(objQ37);
                    }
                }
                l0.e((p) objQ37, bool4, mVar5);
                Boolean bool5 = (Boolean) p1VarN14.getF182175a();
                boolean zB20 = mVar5.B(p1VarN14) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ38 = mVar5.q();
                if (zB20) {
                    objQ38 = new GearActivity.g(b1Var, vVar6, p1VarN14, null);
                    mVar5.K(objQ38);
                } else {
                    aVar.getClass();
                    if (objQ38 == p3.m.a.f135155b) {
                        objQ38 = new GearActivity.g(b1Var, vVar6, p1VarN14, null);
                        mVar5.K(objQ38);
                    }
                }
                l0.e((p) objQ38, bool5, mVar5);
                Boolean bool6 = (Boolean) p1VarN17.getF182175a();
                boolean zB21 = mVar5.B(p1VarN17) | mVar5.r(b1Var) | mVar5.r(vVar6);
                Object objQ39 = mVar5.q();
                if (zB21) {
                    objQ39 = new GearActivity.h(b1Var, vVar6, p1VarN17, null);
                    mVar5.K(objQ39);
                } else {
                    aVar.getClass();
                    if (objQ39 == p3.m.a.f135155b) {
                        objQ39 = new GearActivity.h(b1Var, vVar6, p1VarN17, null);
                        mVar5.K(objQ39);
                    }
                }
                l0.e((p) objQ39, bool6, mVar5);
                boolean zR22 = mVar5.r(m0Var2);
                Object objQ40 = mVar5.q();
                if (zR22) {
                    objQ40 = new ky0.w(m0Var2, 10);
                    mVar5.K(objQ40);
                } else {
                    aVar.getClass();
                    if (objQ40 == p3.m.a.f135155b) {
                        objQ40 = new ky0.w(m0Var2, 10);
                        mVar5.K(objQ40);
                    }
                }
                e23.l lVar10 = (e23.l) objQ40;
                boolean zR23 = mVar5.r(m0Var2);
                Object objQ41 = mVar5.q();
                if (zR23) {
                    objQ41 = new ky0.w(m0Var2, 11);
                    mVar5.K(objQ41);
                } else {
                    aVar.getClass();
                    if (objQ41 == p3.m.a.f135155b) {
                        objQ41 = new ky0.w(m0Var2, 11);
                        mVar5.K(objQ41);
                    }
                }
                e23.l lVar11 = (e23.l) objQ41;
                boolean zR24 = mVar5.r(m0Var2);
                Object objQ42 = mVar5.q();
                if (zR24) {
                    objQ42 = new k62.j(m0Var2, 28);
                    mVar5.K(objQ42);
                } else {
                    aVar.getClass();
                    if (objQ42 == p3.m.a.f135155b) {
                        objQ42 = new k62.j(m0Var2, 28);
                        mVar5.K(objQ42);
                    }
                }
                e23.a aVar10 = (e23.a) objQ42;
                boolean zR25 = mVar5.r(m0Var2);
                Object objQ43 = mVar5.q();
                if (zR25) {
                    objQ43 = new k62.j(m0Var2, 29);
                    mVar5.K(objQ43);
                } else {
                    aVar.getClass();
                    if (objQ43 == p3.m.a.f135155b) {
                        objQ43 = new k62.j(m0Var2, 29);
                        mVar5.K(objQ43);
                    }
                }
                y0.c(b1Var, this.f126373c, this.f126375e, lVar10, lVar11, aVar10, (e23.a) objQ43, mVar5, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(GearActivity gearActivity, bv.d dVar, m0 m0Var, GearActivity.w wVar, int i14) {
        this.f126371a = i14;
        this.f126372b = gearActivity;
        this.f126373c = dVar;
        this.f126374d = m0Var;
        this.f126375e = wVar;
    }

    public /* synthetic */ a(GearActivity gearActivity, m0 m0Var, bv.d dVar, GearActivity.w wVar) {
        this.f126371a = 2;
        this.f126372b = gearActivity;
        this.f126374d = m0Var;
        this.f126373c = dVar;
        this.f126375e = wVar;
    }
}
