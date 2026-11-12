package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1118}, m = "semanticsScrollBy-d-4ec7I", v = 1)
public final class u2 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3 f193674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f193675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193677d;

    public u2(d<? super u2> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193676c = obj;
        this.f193677d |= Integer.MIN_VALUE;
        return t2.a(null, 0L, this);
    }
}
