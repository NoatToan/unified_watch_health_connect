package l33;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f109800a;

    public r(a0 a0Var) {
        this.f109800a = a0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        List listE = this.f109800a.f109695o.E();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((o33.m) obj).F()) {
                arrayList.add(obj);
            }
        }
        int iA = p13.t0.a(p13.y.r(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((o33.m) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }
}
