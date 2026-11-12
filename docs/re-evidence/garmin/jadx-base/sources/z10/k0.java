package z10;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentAppDelegateImpl$revokeConsentPostActions$2", f = "ConsentAppDelegateImpl.kt", l = {145}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f201089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g0 g0Var, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f201089c = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f201089c, dVar);
        k0Var.f201088b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f201088b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201087a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f201088b = null;
            this.f201087a = 1;
            int i15 = g0.f201003b;
            this.f201089c.getClass();
            t13.i iVar = new t13.i(u13.f.b(this));
            wd2.m.c((wd2.l) KoinJavaComponent.get$default(wd2.l.class, null, null, 6, null), new j0(iVar, b0Var));
            if (iVar.a() == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        GarminConnectMobileApp.f28685g.getClass();
        wd2.m.f(GarminConnectMobileApp.a.a(), null);
        wd2.m.g(GarminConnectMobileApp.a.a(), null);
        return Unit.INSTANCE;
    }
}
