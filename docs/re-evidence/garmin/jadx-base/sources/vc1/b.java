package vc1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;
import p3.p1;
import sk0.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<n4.c> f177054a;

    public b(p1<n4.c> p1Var) {
        this.f177054a = p1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        p1<n4.c> p1Var = this.f177054a;
        Object objG = m0.g(h0Var, new n(p1Var, 29), new tn.h(p1Var, 27), new xh0.d(14), new sk0.c(p1Var, 5), dVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
