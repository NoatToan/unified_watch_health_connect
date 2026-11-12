package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {208}, m = "invokeSuspend", v = 1)
public final class g1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f201589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(o1 o1Var, t13.d<? super g1> dVar) {
        super(1, dVar);
        this.f201589b = o1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g1(this.f201589b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((g1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201588a;
        if (i14 == 0) {
            o13.r.b(obj);
            o1 o1Var = this.f201589b;
            o13.p<s5.c, s5.w0> pVarE = o1Var.e();
            if (pVarE != null) {
                s5.c cVar = pVarE.f128594a;
                long j8 = pVarE.f128595b.f157317a;
                q qVar = o1Var.f201733x;
                if (qVar != null) {
                    this.f201588a = 1;
                    if (qVar.a(cVar, j8, this) == aVar) {
                        return aVar;
                    }
                }
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
