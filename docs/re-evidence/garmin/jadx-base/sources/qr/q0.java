package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityExerciseList$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f146439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.c> f146440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t tVar, List<com.garmin.android.apps.connectmobile.repcounting.model.c> list, t13.d<? super q0> dVar) {
        super(3, dVar);
        this.f146439a = tVar;
        this.f146440b = list;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new q0(this.f146439a, this.f146440b, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = t.A2;
        t tVar = this.f146439a;
        ((r53.z1) tVar.V0.getValue()).setValue(this.f146440b);
        r53.p2 p2Var = tVar.f146532k0;
        do {
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
        return Unit.INSTANCE;
    }
}
