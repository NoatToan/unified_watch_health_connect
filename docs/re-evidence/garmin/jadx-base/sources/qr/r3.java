package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/devices/model/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSensorsData$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r3 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.devices.model.s>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f146468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(t tVar, t13.d<? super r3> dVar) {
        super(2, dVar);
        this.f146468a = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r3(this.f146468a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.devices.model.s>> jVar, t13.d<? super Unit> dVar) {
        return ((r3) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r53.p2 p2Var = this.f146468a.f146532k0;
        do {
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
        return Unit.INSTANCE;
    }
}
