package nq;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "", "throwable", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.RoundsViewModel$getExerciseList$1", f = "RoundsViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements q<r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f126897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f126898c;

    public h(t13.d<? super h> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        h hVar = new h(dVar);
        hVar.f126897b = jVar;
        hVar.f126898c = th3;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = this.f126897b;
        Throwable th3 = this.f126898c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126896a;
        if (i14 == 0) {
            r.b(obj);
            String strN = fb1.c.n("Error getting exercise list ", th3.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "RoundsViewModel", strN);
            this.f126897b = null;
            this.f126898c = null;
            this.f126896a = 1;
            if (jVar.emit(null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
