package ss1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/y;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl$getTranslatedReview$translationResult$1", f = "GarminTrailsReviewsRepoImpl.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.y>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f160688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f160690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(v0 v0Var, long j8, String str, t13.d<? super l0> dVar) {
        super(1, dVar);
        this.f160688b = v0Var;
        this.f160689c = j8;
        this.f160690d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l0(this.f160688b, this.f160689c, this.f160690d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.y>> dVar) {
        return ((l0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160687a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.b bVar = this.f160688b.f160763a;
        this.f160687a = 1;
        Object objF = bVar.f(this.f160689c, this.f160690d, this);
        return objF == aVar ? aVar : objF;
    }
}
