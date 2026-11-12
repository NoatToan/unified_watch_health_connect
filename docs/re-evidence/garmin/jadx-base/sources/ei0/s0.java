package ei0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lhi0/c;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowViewModelDelegateImpl$declineFollowRequest$1", f = "FollowViewModelDelegateImpl.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.l<t13.d<? super v2<? extends hi0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f64313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f64314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, long j8, t13.d<? super s0> dVar) {
        super(1, dVar);
        this.f64313b = t0Var;
        this.f64314c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s0(this.f64313b, this.f64314c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends hi0.c>> dVar) {
        return ((s0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64312a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        d dVar = this.f64313b.f64320a;
        Long l14 = new Long(this.f64314c);
        this.f64312a = 1;
        Object objB3 = dVar.B3(l14, false, this);
        return objB3 == aVar ? aVar : objB3;
    }
}
