package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$getVivokidChallenge$2", f = "AdHocChallengesRepository.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<VivoKidAdHocChallengeDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, String str, String str2, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f199542b = aVar;
        this.f199543c = str;
        this.f199544d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f199542b, this.f199543c, this.f199544d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<VivoKidAdHocChallengeDTO>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199541a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<VivoKidAdHocChallengeDTO>> i0VarH = this.f199542b.f199413a.h(this.f199543c, this.f199544d);
        this.f199541a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
