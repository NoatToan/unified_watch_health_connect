package e2;

import g2.g1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {583}, m = "invokeSuspend", v = 1)
public final class j0 extends v13.i implements e23.p<o2, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f62474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f62475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f62476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i0 i0Var, int i14, int i15, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f62474c = i0Var;
        this.f62475d = i14;
        this.f62476e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f62474c, this.f62475d, this.f62476e, dVar);
        j0Var.f62473b = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, t13.d<? super Unit> dVar) {
        return ((j0) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62472a;
        if (i14 == 0) {
            o13.r.b(obj);
            o2 o2Var = (o2) this.f62473b;
            i0 i0Var = this.f62474c;
            h0 h0Var = new h0(o2Var, i0Var);
            g6.c cVar = ((x) i0Var.f62439f.getF182175a()).f62549i;
            this.f62472a = 1;
            if (g1.a(h0Var, this.f62475d, this.f62476e, 100, cVar, this) == aVar) {
                return aVar;
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
