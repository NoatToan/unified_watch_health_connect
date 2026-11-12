package l30;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ln30/k;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$selectCourse$3", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h1 extends v13.i implements e23.q<r53.j<? super n30.k>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f109582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f109583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(a1 a1Var, boolean z14, t13.d<? super h1> dVar) {
        super(3, dVar);
        this.f109582a = a1Var;
        this.f109583b = z14;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super n30.k> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new h1(this.f109582a, this.f109583b, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a1 a1Var = this.f109582a;
        p2 p2Var = a1Var.f109523i;
        p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, null, null, null, 62));
        if (this.f109583b) {
            a1Var.x4(n30.j.k.f123506a);
        }
        return Unit.INSTANCE;
    }
}
