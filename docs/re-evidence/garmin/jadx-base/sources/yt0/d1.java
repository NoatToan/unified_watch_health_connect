package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.TeamChallengeRepository$getTeamChallenge$2", f = "TeamChallengeRepository.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.h0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f199461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, String str, String str2, t13.d<? super d1> dVar) {
        super(1, dVar);
        this.f199461b = f1Var;
        this.f199462c = str;
        this.f199463d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d1(this.f199461b, this.f199462c, this.f199463d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> dVar) {
        return ((d1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199460a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        lt0.f fVar = this.f199461b.f199487a;
        String str = this.f199463d;
        str.getClass();
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> i0VarE = fVar.e(this.f199462c, str);
        this.f199460a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
