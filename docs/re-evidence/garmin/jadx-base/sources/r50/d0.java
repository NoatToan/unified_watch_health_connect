package r50;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk30/u;", "onCourseFeatures", "", "<anonymous>", "(Lk30/u;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$fetchCourseData$2", f = "CoursePointListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<k30.u, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f150414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f150415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f150416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.courses.model.e eVar, g gVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f150415b = eVar;
        this.f150416c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f150415b, this.f150416c, dVar);
        d0Var.f150414a = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(k30.u uVar, t13.d<? super Unit> dVar) {
        return ((d0) create(uVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<fn0.b> listD;
        k30.u uVar = (k30.u) this.f150414a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        w20.a aVar2 = new w20.a(this.f150415b, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        p2 p2Var = this.f150416c.f150432k;
        p2Var.k(null, t50.e.a((t50.e) p2Var.getValue(), false, false, aVar2, null, 27));
        return Unit.INSTANCE;
    }
}
