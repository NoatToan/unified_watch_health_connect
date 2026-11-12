package p008y1;

import b5.s;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {352, 366}, m = "waitForUpOrCancellation", v = 1)
public final class s3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f193639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f193640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193642d;

    public s3(d<? super s3> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193641c = obj;
        this.f193642d |= Integer.MIN_VALUE;
        return k3.j(null, null, this);
    }
}
