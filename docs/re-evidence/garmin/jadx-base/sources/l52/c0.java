package l52;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$copyWorkout$2", f = "WorkoutsRepositoryImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super c83.a0<WorkoutDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RequestBody f110231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z zVar, long j8, RequestBody requestBody, t13.d<? super c0> dVar) {
        super(1, dVar);
        this.f110229b = zVar;
        this.f110230c = j8;
        this.f110231d = requestBody;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f110229b, this.f110230c, this.f110231d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<WorkoutDetailsDTO>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110228a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<WorkoutDetailsDTO>> i0VarH = this.f110229b.f110390a.h(this.f110230c, this.f110231d);
        this.f110228a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
