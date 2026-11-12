package wl0;

import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$loadMixedSwings$1", f = "GolfSwingAnalysisViewModel.kt", l = {119, 125, 129, 117}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<t0<v2<? extends List<? extends SwingDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f185978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f185979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f185980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f185981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f185982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f185983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<Long> f185985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List<Long> f185986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, List<Long> list, List<Long> list2, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f185984g = cVar;
        this.f185985h = list;
        this.f185986i = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f185984g, this.f185985h, this.f185986i, dVar);
        qVar.f185983f = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends List<? extends SwingDTO>>> t0Var, t13.d<? super Unit> dVar) {
        return ((q) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r1.emit(r12, r19) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        r1 = r3;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        if (r1.emit(r11, r19) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0154, code lost:
    
        if (r1.emit(r10, r19) == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        Object objJ;
        s0 s0Var;
        t0 t0Var;
        t0 t0Var2 = (t0) this.f185983f;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185982e;
        com.garmin.android.apps.connectmobile.golf.truswing.c cVar = this.f185984g;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    t0Var2 = this.f185981d;
                } else if (i14 == 3) {
                    t0Var2 = this.f185980c;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                s0 s0Var2 = this.f185978a;
                o13.r.b(obj);
                aVar = new v2.b(s0Var2.d(), 200, null, null, 12, null);
                this.f185983f = null;
                this.f185978a = null;
                this.f185979b = null;
                this.f185980c = null;
                this.f185981d = null;
                this.f185982e = 4;
            } else {
                t0Var = this.f185979b;
                s0 s0Var3 = this.f185978a;
                o13.r.b(obj);
                s0Var = s0Var3;
                objJ = obj;
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        cVar.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new j(this.f185985h, cVar, null), 3);
        List list = (List) jVarA.d();
        if (list != null && list.size() == 1) {
            List<Long> list2 = this.f185986i;
            if ((list2 != null ? list2.get(0) : null) != null) {
                ql0.b bVar = cVar.f35814a;
                String strValueOf = String.valueOf(list2.get(0));
                this.f185983f = t0Var2;
                this.f185978a = jVarA;
                this.f185979b = t0Var2;
                this.f185982e = 1;
                bVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.e(bVar, strValueOf, null), this);
                if (objJ != aVar2) {
                    s0Var = jVarA;
                    t0Var = t0Var2;
                }
            }
            return aVar2;
        }
        a2 a2Var = a2.GOLF;
        i2.f36769a.getClass();
        i2.a.e(a2Var, "Real time swing(s) missing");
        aVar = new v2.a(new Exception("Real time swing(s) missing"), null, null, 6, null);
        this.f185983f = null;
        this.f185978a = null;
        this.f185979b = null;
        this.f185980c = null;
        this.f185981d = null;
        this.f185982e = 4;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ArrayList arrayList = new ArrayList();
            T t7 = ((v2.b) v2Var).f47386a;
            com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t7);
            Collection collection = (List) s0Var.d();
            if (collection == null) {
                collection = j0.f134944a;
            }
            arrayList.addAll(collection);
            arrayList.add(t7);
            v2.b bVar2 = new v2.b(arrayList, 200, null, null, 12, null);
            this.f185983f = null;
            this.f185978a = s0Var;
            this.f185979b = null;
            this.f185980c = null;
            this.f185981d = t0Var;
            this.f185982e = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.e(a2Var2, "Historical swing load failed in compare mix mode!");
            v2.a aVar3 = new v2.a(new Exception("Historical swing load failed in compare mix mode!"), null, null, 6, null);
            this.f185983f = null;
            this.f185978a = s0Var;
            this.f185979b = null;
            this.f185980c = t0Var;
            this.f185982e = 3;
        }
        return aVar2;
    }
}
