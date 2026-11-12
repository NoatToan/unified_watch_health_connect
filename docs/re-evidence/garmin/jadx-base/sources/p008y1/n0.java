package p008y1;

import e23.l;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {110}, m = "drag-jO51t88", v = 1)
public final class n0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f193433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f193434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193436d;

    public n0(d<? super n0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193435c = obj;
        this.f193436d |= Integer.MIN_VALUE;
        return m0.i(null, 0L, null, this);
    }
}
