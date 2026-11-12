package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.SwipeableV2State$snapTo$2", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
public final class v0 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<Object> f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r0<Object> r0Var, Object obj, t13.d<? super v0> dVar) {
        super(1, dVar);
        this.f222a = r0Var;
        this.f223b = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v0(this.f222a, this.f223b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((v0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = r0.f169q;
        this.f222a.g(this.f223b);
        return Unit.INSTANCE;
    }
}
