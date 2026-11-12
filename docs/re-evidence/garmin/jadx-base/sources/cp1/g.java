package cp1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyo1/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewViewModel$fetchAwardsForPromotion$1", f = "GroupRideAwardsWhatsNewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<r53.j<? super v2<? extends List<? extends yo1.c>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b f54908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f54908a = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f54908a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends yo1.c>>> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f54908a.f44751a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, true, null, 2)));
        return Unit.INSTANCE;
    }
}
