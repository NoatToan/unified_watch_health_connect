package n23;

import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class p3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.a f122568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3 f122569b;

    public p3(q3.a aVar, q3 q3Var) {
        this.f122568a = aVar;
        this.f122569b = q3Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = q3.a.f122580g;
        q3.a.C2313a c2313a = new q3.a.C2313a(this.f122569b);
        c4.a aVar = this.f122568a.f122582d;
        k23.l<Object> lVar = q3.a.f122580g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        Collection<t23.l> collectionA = i43.o.a.a((i43.l) objInvoke, null, 3);
        ArrayList arrayList = new ArrayList();
        for (t23.l lVar2 : collectionA) {
            p0 p0Var = lVar2 instanceof t23.b ? (p0) lVar2.K(c2313a, Unit.INSTANCE) : null;
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return p13.h0.b1(arrayList);
    }
}
