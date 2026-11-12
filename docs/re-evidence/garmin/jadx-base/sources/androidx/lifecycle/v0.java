package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/u0;", "<anonymous>", "(Lo53/b0;)Lo53/u0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {94}, m = "invokeSuspend", v = 1)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super o53.u0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0<Object> f8051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0<Object> f8052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0<Object> u0Var, s0<Object> s0Var, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f8051b = u0Var;
        this.f8052c = s0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v0(this.f8051b, this.f8052c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o53.u0> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f8050a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        j<Object> jVar = this.f8051b.f8038a;
        this.f8050a = 1;
        Object objQ = jVar.q(this.f8052c, this);
        return objQ == aVar ? aVar : objQ;
    }
}
