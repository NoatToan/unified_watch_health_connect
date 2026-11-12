package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.ConnectionLeaderBoardDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/ConnectionLeaderBoardDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.LeaderboardRepo$getStepsLeaderboard$2", f = "LeaderboardRepo.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.l<t13.d<? super c83.a0<ConnectionLeaderBoardDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f199614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f199617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f199618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(t0 t0Var, String str, String str2, String str3, String str4, t13.d<? super w0> dVar) {
        super(1, dVar);
        this.f199614b = t0Var;
        this.f199615c = str;
        this.f199616d = str2;
        this.f199617e = str3;
        this.f199618f = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w0(this.f199614b, this.f199615c, this.f199616d, this.f199617e, this.f199618f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ConnectionLeaderBoardDTO>> dVar) {
        return ((w0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199613a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ConnectionLeaderBoardDTO>> i0VarE = this.f199614b.f199592a.e(this.f199615c, this.f199616d, this.f199617e, this.f199618f);
        this.f199613a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
