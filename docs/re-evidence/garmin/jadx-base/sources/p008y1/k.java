package p008y1;

import e23.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Ly1/a;", "Ly1/w0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
public final class k extends i implements r<a, w0<Object>, Object, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ a f193342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ w0 f193343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193344c;

    public k(d<? super k> dVar) {
        super(4, dVar);
    }

    @Override // e23.r
    public final Object invoke(a aVar, w0<Object> w0Var, Object obj, d<? super Unit> dVar) {
        k kVar = new k(dVar);
        kVar.f193342a = aVar;
        kVar.f193343b = w0Var;
        kVar.f193344c = obj;
        return kVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a aVar2 = this.f193342a;
        float fC = this.f193343b.c(this.f193344c);
        if (!Float.isNaN(fC)) {
            aVar2.a(fC, 0.0f);
        }
        return Unit.INSTANCE;
    }
}
