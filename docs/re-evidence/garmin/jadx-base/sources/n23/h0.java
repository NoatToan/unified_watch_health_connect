package n23;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122480a;

    public h0(p0 p0Var) {
        this.f122480a = p0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        p0 p0Var = this.f122480a;
        t23.b bVarE = p0Var.e();
        ArrayList arrayList = new ArrayList();
        if (!gg.b.H(p0Var)) {
            arrayList.addAll(p0Var.v());
        }
        int size = bVarE.f().size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new e1(p0Var, arrayList.size(), k23.k.a.VALUE, new e0(bVarE, i14)));
        }
        if (p0Var.C() && (bVarE instanceof j33.a) && arrayList.size() > 1) {
            p13.c0.u(arrayList, new p0.a());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
