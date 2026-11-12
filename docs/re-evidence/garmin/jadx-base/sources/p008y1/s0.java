package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {667}, m = "processDragCancel", v = 1)
public final class s0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f193627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 p0Var, d<? super s0> dVar) {
        super(dVar);
        this.f193627b = p0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193626a = obj;
        this.f193628c |= Integer.MIN_VALUE;
        return p0.X1(this.f193627b, this);
    }
}
