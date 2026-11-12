package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lps/c0;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConnectIqDisplayInfo$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n2 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends List<? extends ps.c0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(t tVar, t13.d<? super n2> dVar) {
        super(2, dVar);
        this.f146357b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n2 n2Var = new n2(this.f146357b, dVar);
        n2Var.f146356a = obj;
        return n2Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends List<? extends ps.c0>> v2Var, t13.d<? super Unit> dVar) {
        return ((n2) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146356a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            int i14 = t.A2;
            t tVar = this.f146357b;
            r53.z1<nr.v> z1VarH5 = tVar.h5();
            nr.v value = tVar.h5().getValue();
            List<r80.b> list2 = value != null ? value.f127378a : null;
            List list3 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            nr.v value2 = tVar.h5().getValue();
            to.k kVar = value2 != null ? value2.f127380c : null;
            nr.v value3 = tVar.h5().getValue();
            if (value3 == null || (list = value3.f127381d) == null) {
                list = p13.j0.f134944a;
            }
            z1VarH5.setValue(new nr.v(list2, list3, kVar, list));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching connectIQ app display info: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
