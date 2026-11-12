package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {266}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", v = 1)
public final class r1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f193607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f193608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f193609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h3 f193610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f193611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f193612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f193613g;

    public r1(d<? super r1> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193612f = obj;
        this.f193613g |= Integer.MIN_VALUE;
        return n1.b(null, null, null, null, null, 0L, this);
    }
}
