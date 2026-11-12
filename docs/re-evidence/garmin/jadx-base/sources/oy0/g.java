package oy0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.x2;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import e23.r;
import kb0.k;
import lc.m0;
import lc.v;
import lc.y;
import o13.l;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import ov1.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r1.q2;
import r53.o2;
import ug2.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f134409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f134410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f134411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f134412e;

    public /* synthetic */ g(WeightReportsActivity weightReportsActivity, l lVar, boolean z14, m0 m0Var) {
        this.f134408a = 1;
        this.f134410c = weightReportsActivity;
        this.f134411d = lVar;
        this.f134409b = z14;
        this.f134412e = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x014c  */
    /* JADX WARN: Code duplicated, block: B:36:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0254  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:8:0x005e  */
    /* JADX WARN: Code duplicated, block: B:98:0x035a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        u1 u1VarResolveViewModel;
        int i14 = this.f134408a;
        m.a aVar = m.f135153a;
        Object[] objArr = 0;
        Object obj5 = this.f134412e;
        Object obj6 = this.f134411d;
        Object obj7 = this.f134410c;
        switch (i14) {
            case 0:
                i iVar = (i) obj7;
                e23.l lVar = (e23.l) obj6;
                k kVar = (k) obj5;
                ((Integer) obj2).getClass();
                m mVar = (m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                    x1 x1Var = n.f135158a;
                    h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarE, j92.b.f97899b.f97920e, 0.0f, 2);
                    boolean zB = mVar.B(kVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new u(kVar, 2);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(kVar, 2);
                            mVar.K(objQ);
                        }
                    }
                    h.a(iVar, lVar, rVarA, (e23.a) objQ, this.f134409b, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                WeightReportsActivity weightReportsActivity = (WeightReportsActivity) obj7;
                m0 m0Var = (m0) obj5;
                m mVar2 = (m) obj3;
                ((Integer) obj4).getClass();
                int i15 = WeightReportsActivity.f47991a;
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var2 = n.f135158a;
                q42.i iVar2 = (q42.i) o13.m.a(o13.n.NONE, new WeightReportsActivity.d(weightReportsActivity, null, null, null)).getValue();
                boolean zR = mVar2.r(obj6);
                boolean z14 = this.f134409b;
                boolean zH = zR | mVar2.h(z14) | mVar2.r(weightReportsActivity);
                Object objQ2 = mVar2.q();
                if (zH) {
                    objQ2 = new c.e(z14, weightReportsActivity, obj6, 9);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new c.e(z14, weightReportsActivity, obj6, 9);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean zH2 = mVar2.h(z14) | mVar2.r(weightReportsActivity) | mVar2.r(m0Var);
                Object objQ3 = mVar2.q();
                if (zH2) {
                    objQ3 = new c.e(z14, weightReportsActivity, m0Var, 10);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new c.e(z14, weightReportsActivity, m0Var, 10);
                        mVar2.K(objQ3);
                    }
                }
                q42.e.a(iVar2, aVar2, (e23.a) objQ3, mVar2, 0);
                return Unit.INSTANCE;
            case 2:
                lg2.a aVar3 = (lg2.a) obj7;
                p1 p1Var = (p1) obj5;
                m mVar3 = (m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var3 = n.f135158a;
                fg2.a aVar4 = (fg2.a) ((p1) obj6).getF182175a();
                fg2.a.C1456a c1456a = aVar4 instanceof fg2.a.C1456a ? (fg2.a.C1456a) aVar4 : null;
                int i16 = c1456a != null ? c1456a.f71398a : 0;
                Object[] objArr2 = c1456a != null && c1456a.f71399b;
                zf2.d dVar = (zf2.d) p1Var.getF182175a();
                zf2.d dVar2 = zf2.d.f204609p;
                boolean z15 = dVar != dVar2 || objArr2 == true;
                boolean z16 = ((zf2.d) p1Var.getF182175a()) == dVar2 && objArr2 == true;
                boolean z17 = ((zf2.d) p1Var.getF182175a()) == zf2.d.Z0;
                boolean zR2 = mVar3.r(aVar3);
                Object objQ4 = mVar3.q();
                if (zR2) {
                    objQ4 = new ug2.r(aVar3, objArr == true ? 1 : 0);
                    mVar3.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new ug2.r(aVar3, objArr == true ? 1 : 0);
                        mVar3.K(objQ4);
                    }
                }
                wg2.d.c(this.f134409b, z15, z16, i16, z17, (e23.l) objQ4, mVar3, 0);
                return Unit.INSTANCE;
            case 3:
                x xVar = (x) obj7;
                x xVar2 = (x) obj6;
                e23.a aVar5 = (e23.a) obj5;
                m mVar4 = (m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (v) obj2);
                x1 x1Var4 = n.f135158a;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar4);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(ew0.k.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar4, 0), null);
                mVar4.R();
                ew0.h.a((ew0.k) u1VarResolveViewModel2, this.f134409b, xVar, xVar2, aVar5, mVar4, 0);
                return Unit.INSTANCE;
            case 4:
                y yVar = (y) obj7;
                e23.a aVar6 = (e23.a) obj6;
                gk1.b bVar = (gk1.b) obj5;
                v vVar = (v) obj2;
                m mVar5 = (m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var5 = n.f135158a;
                v vVarJ = og.a.J(vVar, yVar, mVar5);
                if (vVarJ == null) {
                    mVar5.C(-625910746);
                    mVar5.f();
                    u1VarResolveViewModel = null;
                } else {
                    mVar5.C(256903995);
                    mVar5.L(-1614864554);
                    u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ew0.m.class), vVarJ.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVarJ), null, KoinApplicationKt.currentKoinScope(mVar5, 0), null);
                    mVar5.R();
                    mVar5.f();
                }
                if (u1VarResolveViewModel == null) {
                    mVar5.C(256905622);
                    mVar5.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar5);
                    if (viewModelStoreOwnerA2 == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ew0.m.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar5, 0), null);
                    mVar5.R();
                } else {
                    mVar5.C(256901747);
                }
                mVar5.f();
                ew0.m mVar6 = (ew0.m) u1VarResolveViewModel;
                boolean zR3 = mVar5.r(yVar);
                Object objQ5 = mVar5.q();
                if (zR3) {
                    objQ5 = new gk1.b(yVar, 8);
                    mVar5.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new gk1.b(yVar, 8);
                        mVar5.K(objQ5);
                    }
                }
                e23.a aVar7 = (e23.a) objQ5;
                boolean zB2 = mVar5.B(bVar);
                Object objQ6 = mVar5.q();
                if (zB2) {
                    objQ6 = new vc0.v(bVar, 15);
                    mVar5.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new vc0.v(bVar, 15);
                        mVar5.K(objQ6);
                    }
                }
                ew0.d.a(mVar6, this.f134409b, aVar6, aVar7, (e23.a) objQ6, mVar5, 0);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar3 = (com.garmin.android.apps.connectmobile.userprofile.presentation.d) obj7;
                e23.l lVar2 = (e23.l) obj6;
                e23.a aVar8 = (e23.a) obj5;
                m mVar7 = (m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var6 = n.f135158a;
                o12.d dVar4 = (o12.d) s9.c.c((o2) dVar3.f47038x.getValue(), mVar7).getF182175a();
                boolean zR4 = mVar7.r(dVar3);
                Object objQ7 = mVar7.q();
                if (zR4) {
                    objQ7 = new w12.c.b(dVar3);
                    mVar7.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == m.a.f135155b) {
                        objQ7 = new w12.c.b(dVar3);
                        mVar7.K(objQ7);
                    }
                }
                e23.a aVar9 = (e23.a) ((k23.g) objQ7);
                boolean zR5 = mVar7.r(dVar3);
                Object objQ8 = mVar7.q();
                if (zR5) {
                    objQ8 = new w12.c.C3380c(dVar3);
                    mVar7.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == m.a.f135155b) {
                        objQ8 = new w12.c.C3380c(dVar3);
                        mVar7.K(objQ8);
                    }
                }
                w12.g.b(this.f134409b, dVar4, lVar2, aVar9, aVar8, (e23.a) ((k23.g) objQ8), mVar7, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(Object obj, boolean z14, o13.h hVar, e23.a aVar, int i14) {
        this.f134408a = i14;
        this.f134410c = obj;
        this.f134409b = z14;
        this.f134411d = hVar;
        this.f134412e = aVar;
    }

    public /* synthetic */ g(i iVar, e23.l lVar, k kVar, boolean z14) {
        this.f134408a = 0;
        this.f134410c = iVar;
        this.f134411d = lVar;
        this.f134412e = kVar;
        this.f134409b = z14;
    }

    public /* synthetic */ g(boolean z14, Object obj, Object obj2, Object obj3, int i14) {
        this.f134408a = i14;
        this.f134409b = z14;
        this.f134410c = obj;
        this.f134411d = obj2;
        this.f134412e = obj3;
    }
}
