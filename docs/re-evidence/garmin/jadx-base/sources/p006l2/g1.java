package p006l2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import z2.h2;
import z2.o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class g1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f108503a;

    public g1(h2 h2Var) {
        this.f108503a = h2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
        h2 h2Var = this.f108503a;
        Object objC = o0.c(h0Var, h2Var.B, h2Var.A, dVar);
        return objC == a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
