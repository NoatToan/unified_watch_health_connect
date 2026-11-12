package ca0;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f26436b;

    public /* synthetic */ r(e23.a aVar, int i14) {
        this.f26435a = i14;
        this.f26436b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c7  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26435a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f26436b;
        switch (i14) {
            case 0:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var = p3.n.f135158a;
                ka0.c.b(aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.trails_view_review_header_title);
                    h4.r rVarE = u1.n.e(c2.x2.f(h4.r.S, 1.0f), p6.b.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                    d92.b.f58625c.getClass();
                    ht1.d.c(strQ, null, c2.l.y(rVarE, j92.b.f97899b.f97920e), this.f26436b, mVar, 48);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var3 = p3.n.f135158a;
                Bundle bundleA = vVar.f111888h.a();
                il0.a aVar3 = (il0.a) GsonUtil.f47253b.fromJson(bundleA != null ? bundleA.getString("GOLF_COURSE") : null, il0.a.class);
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(kl0.d.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                mVar2.R();
                kl0.b.b(aVar3, (kl0.d) u1VarResolveViewModel, aVar2, mVar2, 0);
                return Unit.INSTANCE;
            case 3:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var4 = p3.n.f135158a;
                w52.t0.a(aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 4:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var5 = p3.n.f135158a;
                mk1.g.a(aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 5:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var6 = p3.n.f135158a;
                qn0.c.a(aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 6:
                p3.m mVar3 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var7 = p3.n.f135158a;
                boolean zB = mVar3.B(aVar2);
                Object objQ = mVar3.q();
                if (zB) {
                    objQ = new rk0.y(aVar2, 4);
                    mVar3.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new rk0.y(aVar2, 4);
                        mVar3.K(objQ);
                    }
                }
                ro0.t.a(null, (e23.a) objQ, mVar3, 0);
                return Unit.INSTANCE;
            case 7:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var8 = p3.n.f135158a;
                DashboardRoute.DeviceLink deviceLink = (DashboardRoute.DeviceLink) lc.w.a(vVar2, p005kotlin.jvm.internal.s0.f105811a.b(DashboardRoute.DeviceLink.class));
                n80.a aVar4 = new n80.a(deviceLink.f33490b, deviceLink.f33491c, deviceLink.f33492d, false, 8, null);
                e23.a aVar5 = this.f26436b;
                boolean zB2 = mVar4.B(aVar5);
                Object objQ2 = mVar4.q();
                if (zB2) {
                    objQ2 = new rx1.m(aVar5, 16);
                    mVar4.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new rx1.m(aVar5, 16);
                        mVar4.K(objQ2);
                    }
                }
                p80.c.a(aVar4, (e23.l) objQ2, aVar5, false, mVar4, n80.a.f124926e, 8);
                return Unit.INSTANCE;
            case 8:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var9 = p3.n.f135158a;
                t70.s0.d(null, aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            default:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var10 = p3.n.f135158a;
                t70.k0.a(null, aVar2, (p3.m) obj3, 0);
                return Unit.INSTANCE;
        }
    }
}
