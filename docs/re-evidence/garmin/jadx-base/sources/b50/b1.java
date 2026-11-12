package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$sendCourseToDevice$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<r53.j<? super v2<? extends Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f15956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p pVar, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f15956a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f15956a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Object>> jVar, t13.d<? super Unit> dVar) {
        return ((b1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f15956a.f16041y;
        p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), true, e50.g.OPERATION_SEND_TO_DEVICE, false, null, null, null, null, false, false, false, null, null, 4092));
        return Unit.INSTANCE;
    }
}
