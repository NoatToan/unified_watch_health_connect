package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {182}, m = "invokeSuspend", v = 1)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e<Object> f7844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e<Object> eVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f7844b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f7844b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f7843a;
        e<Object> eVar = this.f7844b;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = eVar.f7866c;
            this.f7843a = 1;
            if (o53.m0.b(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (!eVar.f7864a.e()) {
            o53.c2 c2Var = eVar.f7869f;
            if (c2Var != null) {
                c2Var.c(null);
            }
            eVar.f7869f = null;
        }
        return Unit.INSTANCE;
    }
}
