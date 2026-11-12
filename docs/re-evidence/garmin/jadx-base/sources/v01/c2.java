package v01;

import com.garmin.android.apps.connectmobile.nutrition.domain.reminders.NutritionRemindersUpdater;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.SaveNutritionRemindersUseCase$invoke$2", f = "SaveNutritionRemindersUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c2 extends v13.i implements e23.p<kd1.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f174272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, t13.d<? super c2> dVar) {
        super(2, dVar);
        this.f174272b = d2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c2 c2Var = new c2(this.f174272b, dVar);
        c2Var.f174271a = obj;
        return c2Var;
    }

    @Override // e23.p
    public final Object invoke(kd1.g gVar, t13.d<? super Unit> dVar) {
        return ((c2) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        kd1.g gVar = (kd1.g) this.f174271a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (gVar instanceof kd1.g.c) {
            new NutritionRemindersUpdater(this.f174272b.f174310b.f174532a).c(nd1.c.NETWORK);
        }
        return Unit.INSTANCE;
    }
}
