package tv0;

import com.garmin.android.apps.connectmobile.logging.domain.reminders.LifestyleLoggingRemindersUpdater;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveLifestyleLoggingRemindersUseCase$invoke$1", f = "SaveLifestyleLoggingRemindersUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<kd1.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f166641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f166641b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f166641b, dVar);
        rVar.f166640a = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(kd1.g gVar, t13.d<? super Unit> dVar) {
        return ((r) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        kd1.g gVar = (kd1.g) this.f166640a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (gVar instanceof kd1.g.c) {
            new LifestyleLoggingRemindersUpdater(this.f166641b.f166642a.f166544a).c(nd1.c.NETWORK);
        }
        return Unit.INSTANCE;
    }
}
