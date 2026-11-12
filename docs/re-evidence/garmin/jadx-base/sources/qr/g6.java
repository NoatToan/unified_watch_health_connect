package qr;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$sendCourseToDeviceFromActivity$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g6 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f146224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(long j8, t tVar, t13.d<? super g6> dVar) {
        super(2, dVar);
        this.f146224b = j8;
        this.f146225c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g6 g6Var = new g6(this.f146224b, this.f146225c, dVar);
        g6Var.f146223a = obj;
        return g6Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((g6) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        am.x0 x0VarH;
        String displayName;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146223a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String productDisplayName = null;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            ((rd2.f) KoinJavaComponent.get$default(rd2.f.class, null, null, 6, null)).f152045a.getClass();
            sd2.f fVarI = rd2.j.i(this.f146224b, null);
            int i14 = t.A2;
            t tVar = this.f146225c;
            ps.r value = tVar.W4().getValue();
            if (value == null || (x0VarH = value.h()) == null) {
                x0VarH = am.x0.f4346x;
            }
            if (fVarI != null && (displayName = fVarI.getDisplayName()) != null) {
                productDisplayName = displayName;
            } else if (fVarI != null) {
                productDisplayName = fVarI.getProductDisplayName();
            }
            tVar.E4(new nr.w0.y1(x0VarH, productDisplayName));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error sending course to device: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
