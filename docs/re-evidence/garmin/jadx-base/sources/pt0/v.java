package pt0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$updateBadgeRewardsUnredeemedCodeShown$1", f = "BadgeChallengesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f140790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f140790a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f140790a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ((kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null)).h(this.f140790a);
        return Unit.INSTANCE;
    }
}
