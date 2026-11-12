package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {170}, m = "invokeSuspend", v = 1)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e<Object> f7860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f7860c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f7860c, dVar);
        dVar2.f7859b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f7858a;
        e<Object> eVar = this.f7860c;
        if (i14 == 0) {
            o13.r.b(obj);
            u0 u0Var = new u0(eVar.f7864a, ((o53.b0) this.f7859b).getF195311f());
            e23.p<t0<Object>, t13.d<? super Unit>, Object> pVar = eVar.f7865b;
            this.f7858a = 1;
            if (pVar.invoke(u0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        eVar.f7868e.invoke();
        return Unit.INSTANCE;
    }
}
