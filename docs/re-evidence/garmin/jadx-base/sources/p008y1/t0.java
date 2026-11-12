package p008y1;

import a2.a;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {649, 652}, m = "processDragStart", v = 1)
public final class t0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0.c f193646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.b f193647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f193649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f193650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p0 p0Var, d<? super t0> dVar) {
        super(dVar);
        this.f193649d = p0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193648c = obj;
        this.f193650e |= Integer.MIN_VALUE;
        return p0.Y1(this.f193649d, null, this);
    }
}
