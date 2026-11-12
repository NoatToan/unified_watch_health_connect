package r70;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkProductImprovementConsent$1", f = "DashboardActivity.kt", l = {360}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151077c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls92/g;", "consentText", "", "<anonymous>", "(Ls92/g;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkProductImprovementConsent$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<s92.g, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DashboardActivity f151079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f151080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DashboardActivity dashboardActivity, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151079b = dashboardActivity;
            this.f151080c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f151079b, this.f151080c, dVar);
            aVar.f151078a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(s92.g gVar, t13.d<? super Unit> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Dialog dialog;
            s92.g gVar = (s92.g) this.f151078a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (gVar != null) {
                v2.a aVar2 = v2.f201275c;
                DashboardActivity dashboardActivity = this.f151079b;
                androidx.fragment.app.v supportFragmentManager = dashboardActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                aVar2.getClass();
                Fragment fragmentG = supportFragmentManager.G("ProductImprovementConsentDialog");
                if ((!(fragmentG instanceof v2) || (dialog = ((v2) fragmentG).getDialog()) == null || !dialog.isShowing()) && dashboardActivity.getF158016a().getF7973d().a(androidx.lifecycle.b0.b.STARTED)) {
                    androidx.fragment.app.v supportFragmentManager2 = dashboardActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    v2 v2Var = new v2();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("EXTRA_CONSENT_TEXT", gVar);
                    v2Var.setArguments(bundle);
                    v2Var.setCancelable(false);
                    v2Var.show(supportFragmentManager2, "ProductImprovementConsentDialog");
                }
            } else {
                this.f151080c.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DashboardActivity dashboardActivity, e23.a<Unit> aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f151076b = dashboardActivity;
        this.f151077c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f151076b, this.f151077c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151075a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = DashboardActivity.f33444q;
            DashboardActivity dashboardActivity = this.f151076b;
            r53.b bVarA = androidx.lifecycle.u.a(dashboardActivity.na().f33566y, dashboardActivity.getF158016a(), androidx.lifecycle.b0.b.CREATED);
            a aVar2 = new a(dashboardActivity, this.f151077c, null);
            this.f151075a = 1;
            if (r53.s.k(bVarA, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
