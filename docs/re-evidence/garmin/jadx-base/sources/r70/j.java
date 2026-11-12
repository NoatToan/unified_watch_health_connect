package r70;

import android.content.DialogInterface;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkPrivacyPolicyReconsent$1", f = "DashboardActivity.kt", l = {287}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f151068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151070d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls92/g;", "consentText", "", "<anonymous>", "(Ls92/g;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkPrivacyPolicyReconsent$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<s92.g, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f151072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DashboardActivity f151073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f151074d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, DashboardActivity dashboardActivity, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151072b = b0Var;
            this.f151073c = dashboardActivity;
            this.f151074d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f151072b, this.f151073c, this.f151074d, dVar);
            aVar.f151071a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(s92.g gVar, t13.d<? super Unit> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            final s92.g gVar = (s92.g) this.f151071a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            final e23.a<Unit> aVar2 = this.f151074d;
            if (gVar != null) {
                a2 a2Var = a2.DASHBOARD;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DashboardActivity", "User's consent to privacy policy has expired, need reconsent");
                int i14 = DashboardActivity.f33444q;
                final DashboardActivity dashboardActivity = this.f151073c;
                dashboardActivity.getClass();
                final androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(dashboardActivity).setTitle(R.string.legal_privacy_policy_updates).setMessage(R.string.legal_privacy_policy_updates_message).setPositiveButton(R.string.lbl_agree, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.txt_privacy_policy, (DialogInterface.OnClickListener) null).setCancelable(false).create();
                eVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: r70.g
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        int i15 = DashboardActivity.f33444q;
                        androidx.appcompat.app.e eVar = eVarCreate;
                        Button buttonE = eVar.e(-1);
                        e23.a aVar3 = aVar2;
                        s92.g gVar2 = gVar;
                        buttonE.setOnClickListener(new bv2.j(eVar, 27, aVar3, gVar2));
                        eVar.e(-3).setOnClickListener(new pm0.h(10, gVar2, dashboardActivity));
                    }
                });
                eVarCreate.show();
            } else {
                a2 a2Var2 = a2.DASHBOARD;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "DashboardActivity", "User's consent to privacy policy has not expired");
                aVar2.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DashboardActivity dashboardActivity, e23.a<Unit> aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f151069c = dashboardActivity;
        this.f151070d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f151069c, this.f151070d, dVar);
        jVar.f151068b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f151068b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151067a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = DashboardActivity.f33444q;
            DashboardActivity dashboardActivity = this.f151069c;
            r53.b bVarA = androidx.lifecycle.u.a(dashboardActivity.na().f33565x, dashboardActivity.getF158016a(), androidx.lifecycle.b0.b.CREATED);
            a aVar2 = new a(b0Var, dashboardActivity, this.f151070d, null);
            this.f151068b = null;
            this.f151067a = 1;
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
