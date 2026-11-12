package mt0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsViewModel$getAdHocChallengePendingInviteConnections$1", f = "AdHocChallengeDetailsViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f120662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f120663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, String str, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f120662b = qVar;
        this.f120663c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f120662b, this.f120663c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.d>>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120661a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f120662b.f120814a;
        this.f120661a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.j(aVar2, this.f120663c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
