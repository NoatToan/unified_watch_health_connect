package hq;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class h0 extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
    public h0(Object obj) {
        super(1, obj, g0.class, "onItemClicked", "onItemClicked(I)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        g0 g0Var = (g0) this.receiver;
        h hVar = (h) g0Var.f85022d.get(iIntValue);
        androidx.lifecycle.y0<List<h>> y0Var = g0Var.f85020b;
        List<h> listD = y0Var.d();
        if (listD == null) {
            listD = p13.j0.f134944a;
        }
        ArrayList arrayListD1 = p13.h0.d1(listD);
        if (arrayListD1.contains(hVar)) {
            arrayListD1.remove(hVar);
            hVar.f85027b = false;
        } else {
            arrayListD1.add(hVar);
            hVar.f85027b = true;
        }
        y0Var.j(arrayListD1);
        return Unit.INSTANCE;
    }
}
