package x40;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "climbs", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$fetchSecondaryClimbs$1", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<List<? extends ClimbDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0 l0Var, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f188771b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p0 p0Var = new p0(this.f188771b, dVar);
        p0Var.f188770a = obj;
        return p0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends ClimbDTO> list, t13.d<? super Unit> dVar) {
        return ((p0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f188770a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188771b;
        p2 p2Var = l0Var.F;
        p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, null, ((a50.g) l0Var.F.getValue()).f1399j + 1, false, false, false, false, null, null, 65023));
        l0Var.D4(new a50.e.u0(list));
        return Unit.INSTANCE;
    }
}
