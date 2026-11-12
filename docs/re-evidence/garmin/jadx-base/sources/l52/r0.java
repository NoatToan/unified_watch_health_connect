package l52;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getMSNWorkoutDetailsAsync$result$5", f = "WorkoutsRepositoryImpl.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.l<t13.d<? super c83.a0<WorkoutDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, String str2, t13.d<? super r0> dVar) {
        super(1, dVar);
        this.f110345b = str;
        this.f110346c = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r0(this.f110345b, this.f110346c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<WorkoutDetailsDTO>> dVar) {
        return ((r0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110344a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<WorkoutDetailsDTO>> i0VarM = z.a.a(z.f110389c).M(this.f110345b, this.f110346c);
        this.f110344a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
