package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTrailsCandidates$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a5 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f146098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(t tVar, t13.d<? super a5> dVar) {
        super(2, dVar);
        this.f146098a = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a5(this.f146098a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>>> jVar, t13.d<? super Unit> dVar) {
        return ((a5) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r53.p2 p2Var = this.f146098a.f146532k0;
        do {
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
        return Unit.INSTANCE;
    }
}
