package uy0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetBottomNavigationItemsUseCase$invoke$1", f = "GetBottomNavigationItemsUseCase.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<q53.t<? super List<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f173219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f173219c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f173219c, dVar);
        kVar.f173218b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super List<? extends String>> tVar, t13.d<? super Unit> dVar) {
        return ((k) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f173218b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173217a;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar = this.f173219c;
            tVar.i(p13.u.i0(jVar.f173212a.t1()));
            lp.k kVar = new lp.k(jVar, tVar, 7);
            jVar.f173212a.u3(kVar);
            ug2.h hVar = new ug2.h(8, jVar, kVar);
            this.f173218b = null;
            this.f173217a = 1;
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
