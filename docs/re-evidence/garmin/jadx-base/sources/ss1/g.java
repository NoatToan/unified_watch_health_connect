package ss1;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/u;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$getReviewForTrailAndOwnerActivity$2", f = "GarminTrailsRepoImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f160648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z zVar, long j8, long j14, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f160646b = zVar;
        this.f160647c = j8;
        this.f160648d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f160646b, this.f160647c, this.f160648d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.u>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160645a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160646b.f160774a;
        this.f160645a = 1;
        Object objB = aVar2.b(this.f160647c, this.f160648d, this);
        return objB == aVar ? aVar : objB;
    }
}
