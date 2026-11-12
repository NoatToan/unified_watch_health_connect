package p008y1;

import b5.s;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {84}, m = "awaitAllPointersUp", v = 1)
public final class g1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b5.c f193214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f193215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193217d;

    public g1(d<? super g1> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193216c = obj;
        this.f193217d |= Integer.MIN_VALUE;
        return h1.b(null, null, this);
    }
}
