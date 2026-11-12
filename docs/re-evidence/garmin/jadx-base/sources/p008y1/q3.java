package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {384}, m = "waitForLongPress", v = 1)
public final class q3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f193575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193577c;

    public q3(d<? super q3> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193576b = obj;
        this.f193577c |= Integer.MIN_VALUE;
        return k3.i(null, null, this);
    }
}
