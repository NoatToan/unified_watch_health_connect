package r50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "newCourseDetails", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$deleteCoursePointProperty$2", f = "CoursePointListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.courses.model.e, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f150461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f150462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f150462b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f150462b, dVar);
        rVar.f150461a = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super Unit> dVar) {
        return ((r) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) this.f150461a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g gVar = this.f150462b;
        if (eVar != null) {
            p2 p2Var = gVar.f150432k;
            t50.e eVar2 = (t50.e) p2Var.getValue();
            w20.a aVar2 = ((t50.e) gVar.f150432k.getValue()).f162543c;
            p2Var.k(null, t50.e.a(eVar2, false, false, aVar2 != null ? w20.a.b(aVar2, eVar, null, null, null, null, 62) : null, null, 19));
        } else {
            gVar.y4(t50.c.o.f162531a);
        }
        return Unit.INSTANCE;
    }
}
