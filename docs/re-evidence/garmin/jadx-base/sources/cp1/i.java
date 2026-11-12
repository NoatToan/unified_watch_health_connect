package cp1;

import com.garmin.android.apps.connectmobile.v2;
import e23.q;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyo1/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewViewModel$fetchAwardsForPromotion$3", f = "GroupRideAwardsWhatsNewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements q<r53.j<? super v2<? extends List<? extends yo1.c>>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b f54911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b bVar, t13.d<? super i> dVar) {
        super(3, dVar);
        this.f54911a = bVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super v2<? extends List<? extends yo1.c>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new i(this.f54911a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f54911a.f44751a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, false, null, 2)));
        return Unit.INSTANCE;
    }
}
