package ss1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/v;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl$getTrailReviews$2", f = "GarminTrailsReviewsRepoImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.v>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f160671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us1.e f160673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f160675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v0 v0Var, long j8, us1.e eVar, int i14, int i15, t13.d<? super j0> dVar) {
        super(1, dVar);
        this.f160671b = v0Var;
        this.f160672c = j8;
        this.f160673d = eVar;
        this.f160674e = i14;
        this.f160675f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j0(this.f160671b, this.f160672c, this.f160673d, this.f160674e, this.f160675f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.v>> dVar) {
        return ((j0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160670a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.b bVar = this.f160671b.f160763a;
        String str = this.f160673d.f172387b;
        this.f160670a = 1;
        Object objA = bVar.a(this.f160672c, str, this.f160674e, this.f160675f, this);
        return objA == aVar ? aVar : objA;
    }
}
