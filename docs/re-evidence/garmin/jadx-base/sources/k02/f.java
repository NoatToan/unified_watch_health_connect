package k02;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f102119a;

    public f(d dVar) {
        this.f102119a = dVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        final d dVar2 = this.f102119a;
        final int i14 = 0;
        final int i15 = 1;
        Object objG = m0.g(h0Var, new a(dVar2, 2), new e23.a() { // from class: k02.e
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        dVar2.d();
                        break;
                    default:
                        dVar2.d();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new e23.a() { // from class: k02.e
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        dVar2.d();
                        break;
                    default:
                        dVar2.d();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new ik1.c(dVar2, 17), dVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
