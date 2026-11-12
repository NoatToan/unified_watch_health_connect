package sz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$updateNotificationDismissStatus$1", f = "NotificationsViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f161489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f161490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f161491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(i0 i0Var, long j8, boolean z14, t13.d<? super q0> dVar) {
        super(1, dVar);
        this.f161489b = i0Var;
        this.f161490c = j8;
        this.f161491d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q0(this.f161489b, this.f161490c, this.f161491d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((q0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161488a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = i0.f161413r;
        a0 a0Var = (a0) this.f161489b.f161417e.getValue();
        this.f161488a = 1;
        a0Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(a0Var, new g0(a0Var, this.f161490c, this.f161491d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
