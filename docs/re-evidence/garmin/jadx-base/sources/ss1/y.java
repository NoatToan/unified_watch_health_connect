package ss1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$selectSearchResultItem$2", f = "GarminTrailsRepoImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs1.r f160772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, qs1.r rVar, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f160771b = zVar;
        this.f160772c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f160771b, this.f160772c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160770a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160771b.f160774a;
        this.f160770a = 1;
        Object objQ = aVar2.q(this.f160772c, this);
        return objQ == aVar ? aVar : objQ;
    }
}
