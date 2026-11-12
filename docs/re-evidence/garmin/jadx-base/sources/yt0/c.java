package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$createAdHocChallenge$2", f = "AdHocChallengesRepository.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super c83.a0<AdHocChallengeDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdHocChallengeDTO f199438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, AdHocChallengeDTO adHocChallengeDTO, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f199437b = aVar;
        this.f199438c = adHocChallengeDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f199437b, this.f199438c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<AdHocChallengeDTO>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199436a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<AdHocChallengeDTO>> i0VarR = this.f199437b.f199413a.r(this.f199438c);
        this.f199436a = 1;
        Object objAwait = i0VarR.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
