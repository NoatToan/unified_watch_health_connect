package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.DashboardRefreshNeededListenerUseCase$invoke$1", f = "DashboardRefreshNeededListenerUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f124268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f124268c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f124268c, dVar);
        iVar.f124267b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((i) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f124267b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124266a;
        if (i14 == 0) {
            o13.r.b(obj);
            h hVar = this.f124268c;
            lp.k kVar = new lp.k(hVar, tVar, 1);
            hVar.f124246a.u3(kVar);
            mt0.s1 s1Var = new mt0.s1(5, hVar, kVar);
            this.f124267b = null;
            this.f124266a = 1;
            if (q53.r.a(tVar, s1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
