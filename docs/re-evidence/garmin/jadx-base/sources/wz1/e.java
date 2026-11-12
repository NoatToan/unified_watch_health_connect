package wz1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import kotlin.m3;
import m4.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f188189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f188190b;

    public e(q qVar, m3 m3Var) {
        this.f188189a = qVar;
        this.f188190b = m3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objF = k3.f(h0Var, null, null, new o62.f(this.f188189a, this.f188190b, 2), dVar, 7);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }
}
