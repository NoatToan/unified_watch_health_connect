package l52;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getMyWorkouts$2", f = "WorkoutsRepositoryImpl.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class h1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends WorkoutDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f110276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(z zVar, int i14, int i15, t13.d<? super h1> dVar) {
        super(1, dVar);
        this.f110275b = zVar;
        this.f110276c = i14;
        this.f110277d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h1(this.f110275b, this.f110276c, this.f110277d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends WorkoutDTO>>> dVar) {
        return ((h1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110274a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<WorkoutDTO>>> i0VarI = this.f110275b.f110390a.i(this.f110276c, this.f110277d);
        this.f110274a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
