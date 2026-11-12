package mr;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "rawExerciseSetResult", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;)Lps/s0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$getExerciseSetFlow$1", f = "GetCompactActivityDetailsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.q<v2<? extends ps.s0>, com.garmin.android.apps.connectmobile.repcounting.model.c, t13.d<? super ps.s0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ v2 f120261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.c f120262b;

    public e0(t13.d<? super e0> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(v2<? extends ps.s0> v2Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, t13.d<? super ps.s0> dVar) {
        e0 e0Var = new e0(dVar);
        e0Var.f120261a = v2Var;
        e0Var.f120262b = cVar;
        return e0Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = this.f120261a;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f120262b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (!(v2Var instanceof v2.b) || cVar == null) {
            return null;
        }
        ps.s0 s0Var = (ps.s0) ((v2.b) v2Var).f47386a;
        is.b.f94858a.getClass();
        return is.b.a(s0Var, cVar);
    }
}
