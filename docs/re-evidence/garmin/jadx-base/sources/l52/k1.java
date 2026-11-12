package l52;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getPowerCurveTargetsAsync$2", f = "WorkoutsRepositoryImpl.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.v>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(z zVar, t13.d<? super k1> dVar) {
        super(1, dVar);
        this.f110301b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k1(this.f110301b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.v>>> dVar) {
        return ((k1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110300a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.v>>> i0VarA = this.f110301b.f110390a.A();
        this.f110300a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
