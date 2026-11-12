package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.LeaderboardRepo$getUserActivityLeaderboardAsync$2", f = "LeaderboardRepo.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f199622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f199627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f199628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f199629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f199630j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t0 t0Var, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, t13.d<? super x0> dVar) {
        super(1, dVar);
        this.f199622b = t0Var;
        this.f199623c = str;
        this.f199624d = str2;
        this.f199625e = i14;
        this.f199626f = i15;
        this.f199627g = str3;
        this.f199628h = str4;
        this.f199629i = i16;
        this.f199630j = i17;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x0(this.f199622b, this.f199623c, this.f199624d, this.f199625e, this.f199626f, this.f199627g, this.f199628h, this.f199629i, this.f199630j, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>> dVar) {
        return ((x0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199621a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        lt0.e eVar = this.f199622b.f199592a;
        this.f199621a = 1;
        Object objC = eVar.c(this.f199623c, this.f199624d, this.f199625e, this.f199626f, this.f199627g, this.f199628h, this.f199629i, this.f199630j, this);
        return objC == aVar ? aVar : objC;
    }
}
