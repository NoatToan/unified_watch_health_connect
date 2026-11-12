package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lr80/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getApplicationDeviceInfo$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends r80.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f146852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(t tVar, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f146852a = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f146852a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends r80.b>>> jVar, t13.d<? super Unit> dVar) {
        return ((y1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r53.p2 p2Var = this.f146852a.f146532k0;
        do {
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
        return Unit.INSTANCE;
    }
}
