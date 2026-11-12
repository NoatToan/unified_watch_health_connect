package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {860}, m = "withTimeoutOrNull", v = 1)
public final class y0<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.b<Object> f15944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(v0.b<Object> bVar, t13.d<? super y0> dVar) {
        super(dVar);
        this.f15944b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15943a = obj;
        this.f15945c |= Integer.MIN_VALUE;
        return this.f15944b.t0(0L, null, this);
    }
}
