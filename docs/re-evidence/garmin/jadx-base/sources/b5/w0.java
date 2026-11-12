package b5;

import o53.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {890}, m = "withTimeout", v = 1)
public final class w0<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f15933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0.b<Object> f15935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v0.b<Object> bVar, t13.d<? super w0> dVar) {
        super(dVar);
        this.f15935c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15934b = obj;
        this.f15936d |= Integer.MIN_VALUE;
        return this.f15935c.h1(0L, null, this);
    }
}
