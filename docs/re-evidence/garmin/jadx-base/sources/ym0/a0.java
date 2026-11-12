package ym0;

import java.util.Date;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupLeaderboardActivityV2$2", f = "GroupRepo.kt", l = {264}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Date f197893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Date f197894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f197895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f197896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f197897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f197898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f197899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f197900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f197901j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Date date, Date date2, a aVar, long j8, String str, int i14, int i15, int i16, int i17, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f197893b = date;
        this.f197894c = date2;
        this.f197895d = aVar;
        this.f197896e = j8;
        this.f197897f = str;
        this.f197898g = i14;
        this.f197899h = i15;
        this.f197900i = i16;
        this.f197901j = i17;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f197893b, this.f197894c, this.f197895d, this.f197896e, this.f197897f, this.f197898g, this.f197899h, this.f197900i, this.f197901j, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197892a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String strG = c22.j0.g(this.f197893b, "yyyy-MM-dd", null);
        String strG2 = c22.j0.g(this.f197894c, "yyyy-MM-dd", null);
        zm0.b bVar = this.f197895d.f197890d;
        this.f197892a = 1;
        Object objB = bVar.b(this.f197896e, this.f197897f, this.f197898g, this.f197899h, strG, strG2, this.f197900i, this.f197901j, this);
        return objB == aVar ? aVar : objB;
    }
}
