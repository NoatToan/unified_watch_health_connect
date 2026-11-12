package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1383}, m = "animateToWithDecay", v = 1)
public final class g<T> extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f193206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f193207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193209d;

    public g(d<? super g> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193208c = obj;
        this.f193209d |= Integer.MIN_VALUE;
        return e.e(null, null, 0.0f, null, null, this);
    }
}
