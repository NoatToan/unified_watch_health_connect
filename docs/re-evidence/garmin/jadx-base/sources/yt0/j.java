package yt0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$getAdHocChallengePendingInviteConnections$2", f = "AdHocChallengesRepository.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, String str, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f199512b = aVar;
        this.f199513c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f199512b, this.f199513c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.d>>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199511a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.leaderboard.model.d>>> i0VarG = this.f199512b.f199413a.g(this.f199513c, 1, 1000);
        this.f199511a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
