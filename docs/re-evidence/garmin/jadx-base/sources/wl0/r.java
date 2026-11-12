package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$loadRealTimeSwings$1", f = "GolfSwingAnalysisViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<t0<v2<? extends List<? extends SwingDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f185988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Long> f185990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, List<Long> list, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f185989c = cVar;
        this.f185990d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f185989c, this.f185990d, dVar);
        rVar.f185988b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends List<? extends SwingDTO>>> t0Var, t13.d<? super Unit> dVar) {
        return ((r) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        t0 t0Var = (t0) this.f185988b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185987a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.golf.truswing.c cVar = this.f185989c;
            cVar.getClass();
            androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new j(this.f185990d, cVar, null), 3);
            List list = (List) jVarA.d();
            if (list == null || list.size() != 2) {
                a2 a2Var = a2.GOLF;
                i2.f36769a.getClass();
                i2.a.e(a2Var, "Real time swing(s) missing");
                aVar = new v2.a(new Exception("Real time swing(s) missing"), null, null, 6, null);
            } else {
                aVar = new v2.b(jVarA.d(), 200, null, null, 12, null);
            }
            this.f185988b = null;
            this.f185987a = 1;
            if (t0Var.emit(aVar, this) == aVar2) {
                return aVar2;
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
