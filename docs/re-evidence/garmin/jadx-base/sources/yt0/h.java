package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$getAdHocChallengeInvitesAsync$2", f = "AdHocChallengesRepository.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends AdHocChallengePlayerDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, String str, int i14, int i15, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f199496b = aVar;
        this.f199497c = str;
        this.f199498d = i14;
        this.f199499e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f199496b, this.f199497c, this.f199498d, this.f199499e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends AdHocChallengePlayerDTO>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199495a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<AdHocChallengePlayerDTO>>> i0VarC = this.f199496b.f199413a.c(this.f199497c, this.f199498d, this.f199499e);
        this.f199495a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
