package ss1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lqs1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$getSavedTrails$2", f = "GarminTrailsRepoImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends qs1.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f160653b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f160653b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends qs1.d>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160652a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160653b.f160774a;
        this.f160652a = 1;
        Object objJ = aVar2.j(this);
        return objJ == aVar ? aVar : objJ;
    }
}
