package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl$updateBenchmark$2", f = "TrainingPlanDelegateImpl.kt", l = {209}, m = "invokeSuspend", v = 2)
public final class s6 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f104363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.b f104364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(i6 i6Var, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, t13.d<? super s6> dVar) {
        super(1, dVar);
        this.f104363b = i6Var;
        this.f104364c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s6(this.f104363b, this.f104364c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((s6) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104362a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        l52.x xVar = this.f104363b.f104122a;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = this.f104364c;
        Long l14 = bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        o53.i0<c83.a0<Unit>> i0VarM = xVar.m(l14 != null ? l14.longValue() : -1L, bVar);
        this.f104362a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
