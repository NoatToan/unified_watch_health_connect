package dp1;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryActivity;
import cw1.g0;
import e23.p;
import i3.e9;
import i3.mc;
import o53.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;
import zo1.o;
import zo1.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60644a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo1.h f60645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposeView f60646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupRideSummaryActivity f60647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f60648e;

    public /* synthetic */ c(m0 m0Var, ComposeView composeView, yo1.h hVar, GroupRideSummaryActivity groupRideSummaryActivity) {
        this.f60648e = m0Var;
        this.f60646c = composeView;
        this.f60645b = hVar;
        this.f60647d = groupRideSummaryActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60644a;
        m0 m0Var = this.f60648e;
        GroupRideSummaryActivity groupRideSummaryActivity = this.f60647d;
        ComposeView composeView = this.f60646c;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = GroupRideSummaryActivity.f44755o;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (m0Var.f105804a) {
                        mVar.C(-154036763);
                        z02.b.a(false, null, null, null, false, z3.f.c(-34130900, new c(this.f60645b, composeView, groupRideSummaryActivity, m0Var), mVar), mVar, 196608, 31);
                        mVar.f();
                    } else {
                        mVar.C(-152931830);
                        mVar.f();
                        composeView.setVisibility(8);
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = GroupRideSummaryActivity.f44755o;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    mc mcVarF = e9.f(true, null, mVar2, 6, 2);
                    Object objQ = mVar2.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = l0.j(t13.h.f161748a, mVar2);
                        mVar2.K(objQ);
                    }
                    b0 b0Var = (b0) objQ;
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    o.a(this.f60645b, false, mcVarF, b0Var, (q) v9.b.a(s0.f105811a.b(q.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof y ? ((y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, mVar2), null, true, null, new g0(composeView, 4, groupRideSummaryActivity, m0Var), null, null, new dl0.g(i15, composeView, m0Var), mVar2, 14352440, 1536);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(yo1.h hVar, ComposeView composeView, GroupRideSummaryActivity groupRideSummaryActivity, m0 m0Var) {
        this.f60645b = hVar;
        this.f60646c = composeView;
        this.f60647d = groupRideSummaryActivity;
        this.f60648e = m0Var;
    }
}
