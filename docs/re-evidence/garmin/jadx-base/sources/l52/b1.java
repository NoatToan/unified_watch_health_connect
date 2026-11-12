package l52;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/s;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getMSNWorkoutsAsync$result$6", f = "WorkoutsRepositoryImpl.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(String str, t13.d<? super b1> dVar) {
        super(1, dVar);
        this.f110224b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b1(this.f110224b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> dVar) {
        return ((b1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110223a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> i0VarL = z.a.a(z.f110389c).l(this.f110224b);
        this.f110223a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
