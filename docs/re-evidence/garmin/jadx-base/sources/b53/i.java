package b53;

import java.util.ArrayList;
import java.util.List;
import n23.t3;
import p13.y;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.e f16123a;

    public i(t23.e eVar) {
        this.f16123a = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        p pVar = (p) obj;
        k23.l<Object>[] lVarArr = l.f16126f;
        pVar.getClass();
        List<d1> listQ = this.f16123a.q();
        listQ.getClass();
        ArrayList arrayList = new ArrayList(y.r(listQ, 10));
        for (d1 d1Var : listQ) {
            d1Var.getClass();
            arrayList.add(new t3(pVar, d1Var));
        }
        return arrayList;
    }
}
