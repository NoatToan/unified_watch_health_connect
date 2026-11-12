package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$getAdHocChallengeLeaderboardAsync$2", f = "AdHocChallengesRepository.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends AdHocChallengePlayerDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, String str, String str2, int i14, int i15, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f199504b = aVar;
        this.f199505c = str;
        this.f199506d = str2;
        this.f199507e = i14;
        this.f199508f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f199504b, this.f199505c, this.f199506d, this.f199507e, this.f199508f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends AdHocChallengePlayerDTO>>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199503a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<AdHocChallengePlayerDTO>>> i0VarA = this.f199504b.f199413a.a(this.f199505c, this.f199506d, this.f199507e, this.f199508f);
        this.f199503a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
