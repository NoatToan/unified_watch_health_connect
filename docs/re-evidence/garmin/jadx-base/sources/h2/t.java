package h2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {551}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f81017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j0 j0Var, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f81017b = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f81017b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81016a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f81016a = 1;
            float f14 = o0.f80983a;
            j0 j0Var = this.f81017b;
            if (j0Var.l() + 1 >= j0Var.o() || (objG = j0.g(j0Var, j0Var.l() + 1, null, this, 6)) != obj2) {
                objG = Unit.INSTANCE;
            }
            if (objG == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
