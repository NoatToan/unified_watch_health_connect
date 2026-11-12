package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroidx/lifecycle/q;", "<anonymous>", "(Lo53/b0;)Landroidx/lifecycle/q;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super q>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0<Object> f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0<Object> f7952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w0<Object> w0Var, s0<Object> s0Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f7951a = w0Var;
        this.f7952b = s0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f7951a, this.f7952b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super q> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        w0<Object> w0Var = this.f7951a;
        m.a aVar2 = new m.a(new k(w0Var, 0));
        s0 s0Var = this.f7952b;
        w0Var.n(s0Var, aVar2);
        return new q(s0Var, w0Var);
    }
}
