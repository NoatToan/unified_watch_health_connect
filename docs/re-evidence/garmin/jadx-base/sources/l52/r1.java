package l52;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$saveBenchmarkExerciseAsync$2", f = "WorkoutsRepositoryImpl.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.l<t13.d<? super c83.a0<Integer>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f110349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(z zVar, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super r1> dVar) {
        super(1, dVar);
        this.f110348b = zVar;
        this.f110349c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r1(this.f110348b, this.f110349c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Integer>> dVar) {
        return ((r1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110347a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Integer>> i0VarF = this.f110348b.f110390a.f(this.f110349c);
        this.f110347a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
