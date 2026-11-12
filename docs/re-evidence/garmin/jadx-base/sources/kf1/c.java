package kf1;

import am.c1;
import am.j1;
import am.l1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<n4.c> f104625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f104626b;

    public c(p1<n4.c> p1Var, p1<Boolean> p1Var2) {
        this.f104625a = p1Var;
        this.f104626b = p1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        p1<n4.c> p1Var = this.f104625a;
        p1<Boolean> p1Var2 = this.f104626b;
        Object objG = m0.g(h0Var, new c1(p1Var, p1Var2, 17), new j1(p1Var, p1Var2, 14), new xh0.d(14), new l1(p1Var, 20, (byte) 0), dVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
