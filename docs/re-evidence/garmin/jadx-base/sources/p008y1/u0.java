package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {659}, m = "processDragStop", v = 1)
public final class u0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0.d f193666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f193668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p0 p0Var, d<? super u0> dVar) {
        super(dVar);
        this.f193668c = p0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193667b = obj;
        this.f193669d |= Integer.MIN_VALUE;
        return p0.Z1(this.f193668c, null, this);
    }
}
