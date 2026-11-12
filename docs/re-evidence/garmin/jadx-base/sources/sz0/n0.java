package sz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lww1/i;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$checkForValidTrainingPlanId$1", f = "NotificationsViewModel.kt", l = {427}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.l<t13.d<? super v2<? extends ww1.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f161463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f161464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i0 i0Var, long j8, t13.d<? super n0> dVar) {
        super(1, dVar);
        this.f161463b = i0Var;
        this.f161464c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n0(this.f161463b, this.f161464c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ww1.i>> dVar) {
        return ((n0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161462a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ax1.i iVar = this.f161463b.f161420h;
        this.f161462a = 1;
        iVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(iVar, new ax1.k(iVar, this.f161464c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
