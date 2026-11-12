package uy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.RefreshMoreMenuNeededUseCase$invoke$1", f = "RefreshMoreMenuNeededUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f173224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j1 j1Var, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f173224c = j1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k1 k1Var = new k1(this.f173224c, dVar);
        k1Var.f173223b = obj;
        return k1Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((k1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f173223b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173222a;
        if (i14 == 0) {
            o13.r.b(obj);
            j1 j1Var = this.f173224c;
            tVar.i(Boolean.valueOf(j1Var.f173216a.Y0()));
            lp.k kVar = new lp.k(j1Var, tVar, 8);
            j1Var.f173216a.u3(kVar);
            ug2.h hVar = new ug2.h(9, j1Var, kVar);
            this.f173223b = null;
            this.f173222a = 1;
            if (q53.r.a(tVar, hVar, this) == aVar) {
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
