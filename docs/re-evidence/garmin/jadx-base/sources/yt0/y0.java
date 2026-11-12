package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.LeaderboardRepo$getUserWellnessLeaderboardAsync$2", f = "LeaderboardRepo.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f199636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f199639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f199640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f199641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f199642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(t0 t0Var, String str, int i14, String str2, String str3, int i15, int i16, t13.d<? super y0> dVar) {
        super(1, dVar);
        this.f199636b = t0Var;
        this.f199637c = str;
        this.f199638d = i14;
        this.f199639e = str2;
        this.f199640f = str3;
        this.f199641g = i15;
        this.f199642h = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y0(this.f199636b, this.f199637c, this.f199638d, this.f199639e, this.f199640f, this.f199641g, this.f199642h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>> dVar) {
        return ((y0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199635a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        lt0.e eVar = this.f199636b.f199592a;
        this.f199635a = 1;
        Object objD = eVar.d(this.f199637c, this.f199638d, this.f199639e, this.f199640f, this.f199641g, this.f199642h, this);
        return objD == aVar ? aVar : objD;
    }
}
