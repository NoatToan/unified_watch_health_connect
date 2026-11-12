package c22;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.ViewModelUtil$simpleNetworkOperation$2", f = "ViewModelExtensions.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class x3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<Object>> f23752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, Object> f23753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x3(androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<Object>> y0Var, e23.l<? super t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, ? extends Object> lVar, t13.d<? super x3> dVar) {
        super(2, dVar);
        this.f23752b = y0Var;
        this.f23753c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x3(this.f23752b, this.f23753c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23751a;
        androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<Object>> y0Var = this.f23752b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
            this.f23751a = 1;
            obj = this.f23753c.invoke(this);
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
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            u62.z.h(com.garmin.android.apps.connectmobile.g3.f35298f, ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a, y0Var);
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.v2.a aVar2 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
            y0Var.j(com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
