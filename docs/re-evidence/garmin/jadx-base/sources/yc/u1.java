package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/j0;", "previous", "next", "<anonymous>", "(Lyc/j0;Lyc/j0;)Lyc/j0;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
public final class u1 extends v13.i implements e23.q<j0, j0, t13.d<? super j0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j0 f196507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j0 f196508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f196509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(c1 c1Var, t13.d<? super u1> dVar) {
        super(3, dVar);
        this.f196509c = c1Var;
    }

    @Override // e23.q
    public final Object invoke(j0 j0Var, j0 j0Var2, t13.d<? super j0> dVar) {
        u1 u1Var = new u1(this.f196509c, dVar);
        u1Var.f196507a = j0Var;
        u1Var.f196508b = j0Var2;
        return u1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zF;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        j0 j0Var = this.f196507a;
        j0 j0Var2 = this.f196508b;
        j0Var2.getClass();
        j0Var.getClass();
        c1 c1Var = this.f196509c;
        c1Var.getClass();
        int i14 = j0Var2.f196087a;
        int i15 = j0Var.f196087a;
        if (i14 > i15) {
            zF = true;
        } else {
            zF = i14 < i15 ? false : i0.f(j0Var2.f196088b, j0Var.f196088b, c1Var);
        }
        return zF ? j0Var2 : j0Var;
    }
}
