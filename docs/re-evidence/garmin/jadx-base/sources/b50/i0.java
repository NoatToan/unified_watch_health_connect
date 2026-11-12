package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "newCourseDetails", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$editCoursePoint$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.courses.model.e, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p pVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f15989b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f15989b, dVar);
        i0Var.f15988a = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super Unit> dVar) {
        return ((i0) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        e50.d dVar;
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) this.f15988a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f15989b;
        if (eVar != null) {
            p2 p2Var = pVar.f16041y;
            do {
                value = p2Var.getValue();
                dVar = (e50.d) value;
                aVar = dVar.f62992d;
            } while (!p2Var.b(value, e50.d.a(dVar, false, null, false, aVar != null ? w20.a.b(aVar, eVar, null, null, null, null, 62) : null, null, null, null, false, false, false, null, null, 4087)));
        } else {
            pVar.z4(e50.b.v.f62973a);
        }
        return Unit.INSTANCE;
    }
}
