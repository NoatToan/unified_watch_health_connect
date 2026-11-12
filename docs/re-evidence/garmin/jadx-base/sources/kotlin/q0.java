package kotlin;

import android.view.Choreographer;
import e23.p;
import o13.r;
import o53.b0;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Landroid/view/Choreographer;"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class q0 extends i implements p<b0, d<? super Choreographer>, Object> {
    public q0(d<? super q0> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new q0(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Choreographer> dVar) {
        return new q0(dVar).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        r.b(obj);
        return Choreographer.getInstance();
    }
}
