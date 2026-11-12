package mt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeInviteDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsViewModel$sendChallengeInvitation$1", f = "AdHocChallengeDetailsViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f120787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdHocChallengeInviteDTO f120788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, AdHocChallengeInviteDTO adHocChallengeInviteDTO, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f120787b = qVar;
        this.f120788c = adHocChallengeInviteDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f120787b, this.f120788c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120786a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yt0.a aVar2 = this.f120787b.f120814a;
        this.f120786a = 1;
        aVar2.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.p(aVar2, this.f120788c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
