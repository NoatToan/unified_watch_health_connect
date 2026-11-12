package r50;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "newCourseDetails", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$editCoursePoint$2", f = "CoursePointListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.courses.model.e, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f150465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f150466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g gVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f150466b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f150466b, dVar);
        uVar.f150465a = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super Unit> dVar) {
        return ((u) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        t50.e eVar;
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) this.f150465a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g gVar = this.f150466b;
        if (eVar2 != null) {
            p2 p2Var = gVar.f150432k;
            do {
                value = p2Var.getValue();
                eVar = (t50.e) value;
                aVar = eVar.f162543c;
            } while (!p2Var.b(value, t50.e.a(eVar, false, false, aVar != null ? w20.a.b(aVar, eVar2, null, null, null, null, 62) : null, null, 19)));
        } else {
            gVar.y4(t50.c.o.f162531a);
        }
        return Unit.INSTANCE;
    }
}
