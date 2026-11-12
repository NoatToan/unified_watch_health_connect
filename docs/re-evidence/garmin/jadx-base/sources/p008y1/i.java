package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1547}, m = "restartable", v = 1)
public final class i<I> extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193269b;

    public i(d<? super i> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193268a = obj;
        this.f193269b |= Integer.MIN_VALUE;
        return e.c(null, null, this);
    }
}
