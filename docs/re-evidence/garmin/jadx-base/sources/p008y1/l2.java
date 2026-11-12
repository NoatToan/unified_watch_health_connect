package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
public final class l2 extends i implements p<o2, d<? super Unit>, Object> {
    public l2(d<? super l2> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new l2(dVar);
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, d<? super Unit> dVar) {
        return new l2(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        r.b(obj);
        return Unit.INSTANCE;
    }
}
