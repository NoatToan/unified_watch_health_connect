package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1103}, m = "awaitDragOrCancellation-rnUCldI", v = 1)
public final class g0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f193210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f193211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193213d;

    public g0(d<? super g0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193212c = obj;
        this.f193213d |= Integer.MIN_VALUE;
        return m0.b(null, 0L, this);
    }
}
