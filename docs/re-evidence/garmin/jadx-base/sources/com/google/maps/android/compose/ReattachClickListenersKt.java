package com.google.maps.android.compose;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "", "rememberReattachClickListenersHandle", "(Lp3/m;I)Le23/a;", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReattachClickListenersKt {
    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    public static final e23.a<Unit> rememberReattachClickListenersHandle(p3.m mVar, int i14) {
        mVar.C(1516905133);
        x1 x1Var = p3.n.f135158a;
        p3.c<?> cVarF = mVar.F();
        cVarF.getClass();
        MapApplier mapApplier = (MapApplier) cVarF;
        mVar.C(1901233450);
        boolean zB = mVar.B(mapApplier);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new c32.k(mapApplier, 27);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new c32.k(mapApplier, 27);
                mVar.K(objQ);
            }
        }
        e23.a<Unit> aVar = (e23.a) objQ;
        mVar.f();
        mVar.f();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberReattachClickListenersHandle$lambda$1$lambda$0(MapApplier mapApplier) {
        mapApplier.attachClickListeners$maps_compose_release();
        return Unit.INSTANCE;
    }
}
