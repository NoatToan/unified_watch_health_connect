package l30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lfn0/e;", "hazards", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchHazards$1", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<List<? extends fn0.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f109549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a1 a1Var, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f109549b = a1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f109549b, dVar);
        b1Var.f109548a = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends fn0.e> list, t13.d<? super Unit> dVar) {
        return ((b1) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f109548a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f109549b.x4(new n30.j.v(list));
        return Unit.INSTANCE;
    }
}
