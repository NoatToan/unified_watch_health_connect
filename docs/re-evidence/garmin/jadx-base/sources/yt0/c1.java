package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.SocialChallengeDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.TeamChallengeRepository$getSocialChallengesFilteredByBadgeV2$2", f = "TeamChallengeRepository.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends SocialChallengeDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f199447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, String str, int i14, int i15, t13.d<? super c1> dVar) {
        super(1, dVar);
        this.f199447b = f1Var;
        this.f199448c = str;
        this.f199449d = i14;
        this.f199450e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c1(this.f199447b, this.f199448c, this.f199449d, this.f199450e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends SocialChallengeDTO>>> dVar) {
        return ((c1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199446a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<SocialChallengeDTO>>> i0VarB = this.f199447b.f199487a.b(this.f199448c, this.f199449d, this.f199450e);
        this.f199446a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
