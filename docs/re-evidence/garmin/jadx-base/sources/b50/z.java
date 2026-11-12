package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "newCourseDetails", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$deleteCoursePoint$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.courses.model.e, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p pVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f16102b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f16102b, dVar);
        zVar.f16101a = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super Unit> dVar) {
        return ((z) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) this.f16101a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f16102b;
        if (eVar != null) {
            p2 p2Var = pVar.f16041y;
            e50.d dVar = (e50.d) p2Var.getValue();
            w20.a aVar2 = ((e50.d) pVar.f16041y.getValue()).f62992d;
            p2Var.k(null, e50.d.a(dVar, false, null, false, aVar2 != null ? w20.a.b(aVar2, eVar, null, null, null, null, 62) : null, null, null, null, false, false, false, null, null, 4087));
        } else {
            pVar.z4(e50.b.v.f62973a);
        }
        return Unit.INSTANCE;
    }
}
