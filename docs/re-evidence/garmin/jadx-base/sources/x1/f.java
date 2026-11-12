package x1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<n4.c, Unit> f188342a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e23.l<? super n4.c, Unit> lVar) {
        this.f188342a = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objC = h1.c(h0Var, new p2.b(this.f188342a, null), dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objC != aVar) {
            objC = Unit.INSTANCE;
        }
        return objC == aVar ? objC : Unit.INSTANCE;
    }
}
