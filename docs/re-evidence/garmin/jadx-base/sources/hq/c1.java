package hq;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$saveSelectedExercise$2", f = "SelectExerciseViewModel.kt", l = {297}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.c f84982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f84983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f84984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar, e23.a<Unit> aVar, Activity activity, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f84982b = cVar;
        this.f84983c = aVar;
        this.f84984d = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c1(this.f84982b, this.f84983c, this.f84984d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84981a;
        if (i14 == 0) {
            o13.r.b(obj);
            r0 r0Var = this.f84982b.f29889f;
            if (r0Var != null) {
                RecentSelectedExercisesDatabase.f29919a.getClass();
                RecentSelectedExercisesDatabase recentSelectedExercisesDatabaseA = RecentSelectedExercisesDatabase.a.a(this.f84984d);
                iq.c cVar = new iq.c(r0Var.f85140a);
                iq.a aVarE = recentSelectedExercisesDatabaseA.e();
                this.f84981a = 1;
                if (aVarE.c(cVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f84983c.invoke();
        return Unit.INSTANCE;
    }
}
