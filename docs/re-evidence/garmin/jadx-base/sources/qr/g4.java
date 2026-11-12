package qr;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lokhttp3/ResponseBody;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getThirdPartyUploader$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g4 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ResponseBody>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f146219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(String str, t tVar, t13.d<? super g4> dVar) {
        super(2, dVar);
        this.f146219b = str;
        this.f146220c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g4 g4Var = new g4(this.f146219b, this.f146220c, dVar);
        g4Var.f146218a = obj;
        return g4Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ResponseBody> v2Var, t13.d<? super Unit> dVar) {
        return ((g4) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146218a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            to.k kVar = new to.k(this.f146219b, ((ResponseBody) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).string());
            int i14 = t.A2;
            t tVar = this.f146220c;
            r53.z1<nr.v> z1VarH5 = tVar.h5();
            nr.v value = tVar.h5().getValue();
            z1VarH5.setValue(value != null ? nr.v.a(value, kVar, null, 11) : new nr.v(null, null, kVar, null, 11, null));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching third party uploader: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
