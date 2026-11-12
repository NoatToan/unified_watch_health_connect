package xe1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<n4.c> f190435a;

    public b(p1<n4.c> p1Var) {
        this.f190435a = p1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        p1<n4.c> p1Var = this.f190435a;
        Object objG = m0.g(h0Var, new vd0.d(p1Var, 28), new x91.d(p1Var, 4), new xh0.d(14), new sk0.c(p1Var, 14), dVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
