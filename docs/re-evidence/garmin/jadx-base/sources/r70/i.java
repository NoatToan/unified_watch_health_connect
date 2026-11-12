package r70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkFeedbackStatus$1", f = "DashboardActivity.kt", l = {348}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151064b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo13/p;", "", "", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkFeedbackStatus$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o13.p<? extends Boolean, ? extends String>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DashboardActivity f151066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DashboardActivity dashboardActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151066b = dashboardActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f151066b, dVar);
            aVar.f151065a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o13.p<? extends Boolean, ? extends String> pVar, t13.d<? super Unit> dVar) {
            return ((a) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o13.p pVar = (o13.p) this.f151065a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
            String str = (String) pVar.f128595b;
            if (zBooleanValue) {
                DashboardActivity dashboardActivity = this.f151066b;
                n70.g gVar = dashboardActivity.f33449i;
                androidx.fragment.app.v supportFragmentManager = dashboardActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                gVar.v(dashboardActivity, supportFragmentManager, str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DashboardActivity dashboardActivity, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f151064b = dashboardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f151064b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151063a;
        if (i14 == 0) {
            o13.r.b(obj);
            DashboardActivity dashboardActivity = this.f151064b;
            r53.b bVarA = androidx.lifecycle.u.a(dashboardActivity.f33449i.x(), dashboardActivity.getF158016a(), androidx.lifecycle.b0.b.STARTED);
            a aVar2 = new a(dashboardActivity, null);
            this.f151063a = 1;
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
