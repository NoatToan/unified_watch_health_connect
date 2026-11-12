package k50;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.u;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p13.y;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk30/u;", "onCourseFeatures", "", "<anonymous>", "(Lk30/u;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapViewModel$fetchCourseData$2", f = "CourseMapViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<u, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f102922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f102923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.android.apps.connectmobile.courses.model.e eVar, f fVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f102922b = eVar;
        this.f102923c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f102922b, this.f102923c, dVar);
        dVar2.f102921a = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(u uVar, t13.d<? super Unit> dVar) {
        return ((d) create(uVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<fn0.b> listD;
        u uVar = (u) this.f102921a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        w20.a aVar2 = new w20.a(this.f102922b, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        p2 p2Var = this.f102923c.f102925a;
        p2Var.k(null, m50.c.a((m50.c) p2Var.getValue(), false, w.c(aVar2), null, 5));
        return Unit.INSTANCE;
    }
}
