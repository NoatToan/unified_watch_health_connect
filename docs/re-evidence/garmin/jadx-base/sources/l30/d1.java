package l30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lk30/g;", "climbs", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchPrimaryClimbs$1", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<List<? extends k30.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f109561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a1 a1Var, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f109561b = a1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d1 d1Var = new d1(this.f109561b, dVar);
        d1Var.f109560a = obj;
        return d1Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends k30.g> list, t13.d<? super Unit> dVar) {
        return ((d1) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f109560a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a1 a1Var = this.f109561b;
        if (list == null || list.isEmpty()) {
            a1Var.x4(n30.j.l.f123507a);
        } else {
            a1Var.x4(new n30.j.u(list));
        }
        return Unit.INSTANCE;
    }
}
