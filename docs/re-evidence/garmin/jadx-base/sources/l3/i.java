package l3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {706}, m = "restartable")
public final class i<I> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109269b;

    public i(t13.d<? super i> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f109268a = obj;
        this.f109269b |= Integer.MIN_VALUE;
        return k.c(null, null, this);
    }
}
