package l30;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "pointsOfInterest", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$fetchPointsOfInterest$1", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<List<? extends PointOfInterestDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z zVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f109547b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f109547b, dVar);
        b0Var.f109546a = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends PointOfInterestDTO> list, t13.d<? super Unit> dVar) {
        return ((b0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f109546a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z zVar = this.f109547b;
        if (list == null || list.isEmpty()) {
            zVar.z4(n30.c.v.f123439a);
        } else {
            zVar.z4(new n30.c.j0(list));
        }
        return Unit.INSTANCE;
    }
}
