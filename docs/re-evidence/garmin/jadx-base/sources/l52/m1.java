package l52;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getWorkoutsAsync$2", f = "WorkoutsRepositoryImpl.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends WorkoutDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(z zVar, t13.d<? super m1> dVar) {
        super(1, dVar);
        this.f110311b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m1(this.f110311b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends WorkoutDTO>>> dVar) {
        return ((m1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110310a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<WorkoutDTO>>> i0VarD = this.f110311b.f110390a.D();
        this.f110310a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
