package r70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$observeWheelchairMode$1", f = "DashboardActivity.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151082b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DashboardActivity f151083a;

        public a(DashboardActivity dashboardActivity) {
            this.f151083a = dashboardActivity;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((Boolean) obj).booleanValue();
            DashboardActivity dashboardActivity = this.f151083a;
            dashboardActivity.ja(dashboardActivity.fa());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DashboardActivity dashboardActivity, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f151082b = dashboardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f151082b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151081a;
        if (i14 == 0) {
            o13.r.b(obj);
            f12.l.f68084a.getClass();
            e2 f68089c = f12.l.a.a().getF68089c();
            a aVar2 = new a(this.f151082b);
            this.f151081a = 1;
            f68089c.getClass();
            if (e2.m(f68089c, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
