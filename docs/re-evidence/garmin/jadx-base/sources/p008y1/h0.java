package p008y1;

import b5.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1023}, m = "awaitLongPressOrCancellation-rnUCldI", v = 1)
public final class h0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f193237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f193238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f193239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f193241e;

    public h0(d<? super h0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193240d = obj;
        this.f193241e |= Integer.MIN_VALUE;
        return m0.c(null, 0L, this);
    }
}
