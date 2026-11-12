package n43;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f123624a;

    public e(n nVar) {
        this.f123624a = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        n nVar = this.f123624a;
        l43.p pVar = nVar.f123661m;
        List<s33.e> list = nVar.f123654f.f156537p;
        ArrayList<s33.e> arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (u33.b.f168308n.d(((s33.e) obj).f156591d).booleanValue()) {
                arrayListL.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListL, 10));
        for (s33.e eVar : arrayListL) {
            l43.l0 l0Var = pVar.f110093i;
            eVar.getClass();
            arrayList.add(l0Var.e(eVar, false));
        }
        return p13.h0.C0(p13.h0.C0(arrayList, p13.x.l(nVar.s())), pVar.f110085a.f110064n.d(nVar));
    }
}
