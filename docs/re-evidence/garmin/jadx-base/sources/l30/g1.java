package l30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/k;", "updatedEntry", "", "<anonymous>", "(Ln30/k;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$selectCourse$2", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<n30.k, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f109577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<n30.k> f109578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(a1 a1Var, List<n30.k> list, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f109577b = a1Var;
        this.f109578c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f109577b, this.f109578c, dVar);
        g1Var.f109576a = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(n30.k kVar, t13.d<? super Unit> dVar) {
        return ((g1) create(kVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n30.k kVar = (n30.k) this.f109576a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f109577b.f109523i;
        p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, p13.h0.D0(p13.h0.V(1, this.f109578c), kVar), null, null, 55));
        return Unit.INSTANCE;
    }
}
