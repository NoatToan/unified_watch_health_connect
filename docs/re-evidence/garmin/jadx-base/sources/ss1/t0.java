package ss1;

import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl$submitTrailReviewImage$2", f = "GarminTrailsReviewsRepoImpl.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f160749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f160752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, long j8, int i14, MultipartBody.Part part, t13.d<? super t0> dVar) {
        super(1, dVar);
        this.f160749b = v0Var;
        this.f160750c = j8;
        this.f160751d = i14;
        this.f160752e = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t0(this.f160749b, this.f160750c, this.f160751d, this.f160752e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.b>> dVar) {
        return ((t0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160748a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.b bVar = this.f160749b.f160763a;
        this.f160748a = 1;
        Object objH = bVar.h(this.f160750c, this.f160751d, this.f160752e, this);
        return objH == aVar ? aVar : objH;
    }
}
