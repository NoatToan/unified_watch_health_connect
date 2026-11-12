package ak0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import n70.h7;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$setHomeScreenInsights$1", f = "GCPlusHomeViewModel.kt", l = {517}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f3609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, boolean z14, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f3609c = eVar;
        this.f3610d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f3609c, this.f3610d, dVar);
        e0Var.f3608b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f3608b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3607a;
        boolean z14 = this.f3610d;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = this.f3609c;
            h7 h7Var = eVar.f35409c;
            o70.f fVar = eVar.f35423q;
            this.f3608b = b0Var;
            this.f3607a = 1;
            obj = h7Var.a(fVar, z14, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        g3 g3Var = (g3) obj;
        i2.f36769a.getClass();
        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", "Set home screen insights to " + z14 + ": " + g3Var);
        if (g3Var.f35300a == fw.p.SUCCESS) {
            sn.a.o(f12.l.f68084a, true);
        }
        return Unit.INSTANCE;
    }
}
