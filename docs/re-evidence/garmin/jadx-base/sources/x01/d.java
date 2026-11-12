package x01;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import b21.fb;
import b21.l4;
import b21.z8;
import b50.o;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import e23.p;
import gl1.y;
import lc.h0;
import lc.m0;
import lc.v0;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.l0;
import p3.n;
import p3.p1;
import p3.v;
import p3.x1;
import p3.y3;
import r1.c0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity f188245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4 f188246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f188248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f188249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DateTime f188250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o82.g f188251h;

    public /* synthetic */ d(NutritionActivity nutritionActivity, l4 l4Var, boolean z14, boolean z15, boolean z16, DateTime dateTime, o82.g gVar, int i14) {
        this.f188244a = i14;
        this.f188245b = nutritionActivity;
        this.f188246c = l4Var;
        this.f188247d = z14;
        this.f188248e = z15;
        this.f188249f = z16;
        this.f188250g = dateTime;
        this.f188251h = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zC;
        boolean z14;
        boolean zC2;
        boolean zC3;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        switch (this.f188244a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NutritionActivity.a aVar = NutritionActivity.f39581f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(2078958352, new d(this.f188245b, this.f188246c, this.f188247d, this.f188248e, this.f188249f, this.f188250g, this.f188251h, 1), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    y3 y3Var = g02.d.f74342a;
                    NutritionActivity nutritionActivity = this.f188245b;
                    v.a(y3Var.c(nutritionActivity.getOnBackPressedDispatcher()), z3.f.c(-2113325104, new d(nutritionActivity, this.f188246c, this.f188247d, this.f188248e, this.f188249f, this.f188250g, this.f188251h, 2), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                NutritionActivity.a aVar3 = NutritionActivity.f39581f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar3);
                    NutritionActivity nutritionActivity2 = this.f188245b;
                    nutritionActivity2.f39582e = m0VarI;
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        mVar3.K(objQ);
                    }
                    v21.e eVar = (v21.e) objQ;
                    l4 l4Var = this.f188246c;
                    String strValueOf = String.valueOf(l4Var);
                    boolean zB = mVar3.B(l4Var);
                    boolean z15 = this.f188247d;
                    boolean zH = zB | mVar3.h(z15);
                    Object objQ2 = mVar3.q();
                    if (zH || objQ2 == c2565a) {
                        objQ2 = new o(l4Var, z15, 17);
                        mVar3.K(objQ2);
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    mVar3.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar3);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA);
                    Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar3, 0);
                    t0 t0Var = s0.f105811a;
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(k.class), viewModelStoreOwnerA.getF189591b(), strValueOf, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, aVar4);
                    mVar3.R();
                    k kVar = (k) u1VarResolveViewModel;
                    p1 p1VarC = s9.c.c(kVar.f188298l, mVar3);
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar3.r(kVar);
                    boolean z16 = this.f188248e;
                    boolean zH2 = zR | mVar3.h(z16);
                    Object objQ3 = mVar3.q();
                    if (zH2 || objQ3 == c2565a) {
                        objQ3 = new NutritionActivity.b(kVar, z16, null);
                        mVar3.K(objQ3);
                    }
                    l0.e((p) objQ3, unit, mVar3);
                    p1 p1VarC2 = s9.c.c(kVar.f188302p, mVar3);
                    p1 p1VarC3 = s9.c.c(kVar.f188300n, mVar3);
                    m0 m0Var = nutritionActivity2.f39582e;
                    if (m0Var == null) {
                        s.m("navHostController");
                        throw null;
                    }
                    p1 p1VarL = y.l(m0Var, mVar3);
                    lc.v vVar = (lc.v) p1VarL.getF182175a();
                    if (vVar == null || (h0Var3 = vVar.f111882b) == null) {
                        zC = false;
                    } else {
                        h0.a aVar5 = h0.f111771f;
                        k23.d dVarB = t0Var.b(fb.f.class);
                        aVar5.getClass();
                        zC = h0.a.c(h0Var3, dVarB);
                    }
                    if (zC) {
                        z14 = true;
                    } else {
                        lc.v vVar2 = (lc.v) p1VarL.getF182175a();
                        if (vVar2 == null || (h0Var2 = vVar2.f111882b) == null) {
                            zC2 = false;
                        } else {
                            h0.a aVar6 = h0.f111771f;
                            k23.d dVarB2 = t0Var.b(fb.c.class);
                            aVar6.getClass();
                            zC2 = h0.a.c(h0Var2, dVarB2);
                        }
                        if (zC2) {
                            z14 = true;
                        } else {
                            lc.v vVar3 = (lc.v) p1VarL.getF182175a();
                            if (vVar3 == null || (h0Var = vVar3.f111882b) == null) {
                                zC3 = false;
                            } else {
                                h0.a aVar7 = h0.f111771f;
                                k23.d dVarB3 = t0Var.b(l4.y0.class);
                                aVar7.getClass();
                                zC3 = h0.a.c(h0Var, dVarB3);
                            }
                            if (zC3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                    }
                    nutritionActivity2.ea(z14);
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new NutritionActivity.c(null);
                        mVar3.K(objQ4);
                    }
                    l0.e((p) objQ4, unit, mVar3);
                    m0 m0Var2 = nutritionActivity2.f39582e;
                    if (m0Var2 == null) {
                        s.m("navHostController");
                        throw null;
                    }
                    fb.f fVar = fb.f.INSTANCE;
                    boolean zB2 = mVar3.B(p1VarC) | mVar3.r(nutritionActivity2) | mVar3.r(eVar);
                    boolean z17 = this.f188249f;
                    boolean zH3 = zB2 | mVar3.h(z17) | mVar3.r(kVar);
                    DateTime dateTime = this.f188250g;
                    boolean zR2 = zH3 | mVar3.r(dateTime);
                    o82.g gVar = this.f188251h;
                    boolean zK = zR2 | mVar3.k(gVar == null ? -1 : gVar.ordinal());
                    Object objQ5 = mVar3.q();
                    if (zK || objQ5 == c2565a) {
                        z8 z8Var = new z8(6, nutritionActivity2, eVar, kVar, dateTime, gVar, p1VarC, z17);
                        mVar3.K(z8Var);
                        objQ5 = z8Var;
                    }
                    nc.y.a(m0Var2, fVar, null, null, null, null, null, null, null, (e23.l) objQ5, mVar3, 48, 2044);
                    c0.e(((Boolean) p1VarC3.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(332583592, new vv0.e(18, nutritionActivity2, kVar), mVar3), mVar3, 196608, 30);
                    c0.e(((Boolean) p1VarC2.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1199489055, new t21.v0(kVar, 22), mVar3), mVar3, 196608, 30);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
