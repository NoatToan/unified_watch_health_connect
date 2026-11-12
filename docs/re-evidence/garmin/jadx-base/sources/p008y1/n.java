package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {457, 460}, m = "fling", v = 1)
public final class n extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f193429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<Object> f193431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p<Object> pVar, d<? super n> dVar) {
        super(dVar);
        this.f193431c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193430b = obj;
        this.f193432d |= Integer.MIN_VALUE;
        return p.p2(this.f193431c, 0.0f, this);
    }
}
