package aq1;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f2.o0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupViewModel$checkAppStartupAsync$1", f = "StartupViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<q53.t<? super Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12406b;

    public k0(t13.d<? super k0> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(dVar);
        k0Var.f12406b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Unit> tVar, t13.d<? super Unit> dVar) {
        return ((k0) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f12406b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12405a;
        if (i14 == 0) {
            o13.r.b(obj);
            GarminConnectMobileApp.f28685g.getClass();
            GarminConnectMobileApp garminConnectMobileAppB = GarminConnectMobileApp.a.b();
            a03.e eVar = new a03.e(tVar, 19);
            fq1.i iVar = (fq1.i) garminConnectMobileAppB.f28693e.getValue();
            c32.k kVar = new c32.k(eVar, 20);
            iVar.getClass();
            c2 c2Var = iVar.f73252c;
            if (c2Var != null) {
                c2Var.J(new o0(kVar, 20));
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GCMStartupAsync", "No async initializers job to complete");
                kVar.invoke();
            }
            this.f12406b = null;
            this.f12405a = 1;
            if (q53.r.a(tVar, new q53.q(0), this) == aVar) {
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
