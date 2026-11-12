package l30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "climbs", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchSecondaryClimbs$1", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<List<? extends ClimbDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f109568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1 a1Var, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f109568b = a1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e1 e1Var = new e1(this.f109568b, dVar);
        e1Var.f109567a = obj;
        return e1Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends ClimbDTO> list, t13.d<? super Unit> dVar) {
        return ((e1) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f109567a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f109568b.x4(new n30.j.z(list));
        return Unit.INSTANCE;
    }
}
