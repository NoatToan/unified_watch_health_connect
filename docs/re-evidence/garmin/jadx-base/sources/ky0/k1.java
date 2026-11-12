package ky0;

import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$7", f = "MultiDayActivitiesDetailViewModel.kt", l = {446}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f107404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f107405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(w0 w0Var, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f107405c = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k1 k1Var = new k1(this.f107405c, dVar);
        k1Var.f107404b = obj;
        return k1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        sy0.l lVar;
        o53.b0 b0Var = (o53.b0) this.f107404b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107403a;
        w0 w0Var = this.f107405c;
        if (i14 == 0) {
            o13.r.b(obj);
            gy0.v0 v0Var = (gy0.v0) w0Var.f107593i.getValue();
            String str = w0Var.f107579b;
            this.f107404b = b0Var;
            this.f107403a = 1;
            obj = v0Var.a(str, this);
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
        cy0.m mVar = (cy0.m) obj;
        p2 p2Var = w0Var.K0;
        do {
            value = p2Var.getValue();
            lVar = null;
            if (mVar != null) {
                List<cy0.f> listB = mVar.b();
                i53.c cVarE = listB != null ? i53.a.e(listB) : null;
                List<cy0.g> listD = mVar.d();
                lVar = new sy0.l(cVarE, listD != null ? i53.a.e(listD) : null);
            }
        } while (!p2Var.b(value, lVar));
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "Epic Details - loaded Elevation Data");
        return Unit.INSTANCE;
    }
}
