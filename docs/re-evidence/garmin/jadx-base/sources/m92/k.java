package m92;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<n4.c> f117386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f117387b;

    public k(p1<n4.c> p1Var, p1<Boolean> p1Var2) {
        this.f117386a = p1Var;
        this.f117387b = p1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        ky0.k kVar = new ky0.k(this.f117386a, 27);
        ky0.k kVar2 = new ky0.k(this.f117387b, 28);
        int i14 = l.f117397a;
        Object objG = p008y1.m0.g(h0Var, new l3.p1(27, kVar, kVar2), new l30.i0(22, kVar, kVar2), new xh0.d(14), new f(kVar, 0), dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objG != aVar) {
            objG = Unit.INSTANCE;
        }
        return objG == aVar ? objG : Unit.INSTANCE;
    }
}
