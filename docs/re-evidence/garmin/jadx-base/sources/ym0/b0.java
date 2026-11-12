package ym0;

import java.util.Date;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupLeaderboardWellnessV2$2", f = "GroupRepo.kt", l = {288}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Date f197907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Date f197908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f197909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f197910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f197911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f197912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f197913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f197914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Date date, Date date2, a aVar, long j8, String str, int i14, int i15, int i16, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f197907b = date;
        this.f197908c = date2;
        this.f197909d = aVar;
        this.f197910e = j8;
        this.f197911f = str;
        this.f197912g = i14;
        this.f197913h = i15;
        this.f197914i = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f197907b, this.f197908c, this.f197909d, this.f197910e, this.f197911f, this.f197912g, this.f197913h, this.f197914i, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.d0>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197906a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String strG = c22.j0.g(this.f197907b, "yyyy-MM-dd", null);
        String strG2 = c22.j0.g(this.f197908c, "yyyy-MM-dd", null);
        zm0.b bVar = this.f197909d.f197890d;
        this.f197906a = 1;
        Object objA = bVar.a(this.f197910e, this.f197911f, this.f197912g, strG, strG2, this.f197913h, this.f197914i, this);
        return objA == aVar ? aVar : objA;
    }
}
