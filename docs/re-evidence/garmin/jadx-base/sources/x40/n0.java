package x40;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "pointsOfInterest", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$fetchPointsOfInterest$1", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<List<? extends PointOfInterestDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l0 l0Var, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f188761b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f188761b, dVar);
        n0Var.f188760a = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends PointOfInterestDTO> list, t13.d<? super Unit> dVar) {
        return ((n0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f188760a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188761b;
        if (list == null || list.isEmpty()) {
            l0Var.D4(a50.e.y.f1381a);
        } else {
            l0Var.D4(new a50.e.r0(list));
        }
        return Unit.INSTANCE;
    }
}
