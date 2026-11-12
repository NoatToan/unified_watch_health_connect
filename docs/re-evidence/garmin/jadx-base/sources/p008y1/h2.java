package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy", v = 1)
public final class h2 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f193251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193253c;

    public h2(d<? super h2> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193252b = obj;
        this.f193253c |= Integer.MIN_VALUE;
        return m2.a(null, 0.0f, null, this);
    }
}
