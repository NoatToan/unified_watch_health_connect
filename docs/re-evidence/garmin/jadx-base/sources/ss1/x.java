package ss1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$searchTrails$2", f = "GarminTrailsRepoImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs1.o f160769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, qs1.o oVar, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f160768b = zVar;
        this.f160769c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f160768b, this.f160769c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.p>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160767a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160768b.f160774a;
        this.f160767a = 1;
        Object objI = aVar2.i(this.f160769c, this);
        return objI == aVar ? aVar : objI;
    }
}
