package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {209}, m = "consumeUntilUp", v = 1)
public final class n3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f193448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193450c;

    public n3(d<? super n3> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193449b = obj;
        this.f193450c |= Integer.MIN_VALUE;
        return k3.a(null, this);
    }
}
