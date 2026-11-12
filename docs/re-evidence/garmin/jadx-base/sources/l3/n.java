package l3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {517}, m = "anchoredDrag")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f109364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m<Object> mVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f109364b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f109363a = obj;
        this.f109365c |= Integer.MIN_VALUE;
        return this.f109364b.b(null, null, this);
    }
}
