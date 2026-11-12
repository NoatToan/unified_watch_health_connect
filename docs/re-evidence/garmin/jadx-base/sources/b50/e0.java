package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$duplicateCourse$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f15970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p pVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f15970a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f15970a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>> jVar, t13.d<? super Unit> dVar) {
        return ((e0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f15970a.f16041y;
        p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), true, e50.g.OPERATION_DUPLICATE_COURSE, false, null, null, null, null, false, false, false, null, null, 4092));
        return Unit.INSTANCE;
    }
}
