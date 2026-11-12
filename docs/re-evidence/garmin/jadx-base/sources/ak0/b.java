package ak0;

import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCPlusHomeActivity f3585b;

    public /* synthetic */ b(GCPlusHomeActivity gCPlusHomeActivity, int i14) {
        this.f3584a = i14;
        this.f3585b = gCPlusHomeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:18:0x007d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3584a;
        GCPlusHomeActivity gCPlusHomeActivity = this.f3585b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GCPlusHomeActivity.a aVar = GCPlusHomeActivity.f35323e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(722790489, new b(gCPlusHomeActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GCPlusHomeActivity.a aVar2 = GCPlusHomeActivity.f35323e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p3.v.a(g02.d.f74342a.c(gCPlusHomeActivity.getOnBackPressedDispatcher()), z3.f.c(825474329, new b(gCPlusHomeActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GCPlusHomeActivity.a aVar3 = GCPlusHomeActivity.f35323e;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVarCa = gCPlusHomeActivity.ca();
                    Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(gCPlusHomeActivity);
                    t0 t0Var = s0.f105811a;
                    a aVar4 = (a) koinScope.get((k23.d<?>) t0Var.b(a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                    ub1.i iVar = (ub1.i) AndroidKoinScopeExtKt.getKoinScope(gCPlusHomeActivity).get((k23.d<?>) t0Var.b(ub1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                    boolean zR = mVar3.r(gCPlusHomeActivity);
                    Object objQ = mVar3.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zR) {
                        objQ = new GCPlusHomeActivity.d(gCPlusHomeActivity);
                        mVar3.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new GCPlusHomeActivity.d(gCPlusHomeActivity);
                            mVar3.K(objQ);
                        }
                    }
                    e23.p pVar = (e23.p) ((k23.g) objQ);
                    boolean zR2 = mVar3.r(gCPlusHomeActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new GCPlusHomeActivity.e(gCPlusHomeActivity);
                        mVar3.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new GCPlusHomeActivity.e(gCPlusHomeActivity);
                            mVar3.K(objQ2);
                        }
                    }
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVarCa, aVar4, iVar, pVar, (e23.a) ((k23.g) objQ2), mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
