package sz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$declineGroupInvitation$1", f = "NotificationsViewModel.kt", l = {281}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f161472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f161473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f161474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(i0 i0Var, long j8, Long l14, t13.d<? super o0> dVar) {
        super(1, dVar);
        this.f161472b = i0Var;
        this.f161473c = j8;
        this.f161474d = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o0(this.f161472b, this.f161473c, this.f161474d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((o0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161471a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jm0.b bVar = this.f161472b.f161421i;
        this.f161471a = 1;
        Object objZ = bVar.z(this.f161473c, this.f161474d, this);
        return objZ == aVar ? aVar : objZ;
    }
}
