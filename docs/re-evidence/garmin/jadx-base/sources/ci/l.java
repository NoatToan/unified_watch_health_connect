package ci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p13.d0;
import p13.h0;
import p13.l0;
import vh.f0;
import vh.n0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public static final Set<String> a(Collection<n> collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                d0.v(arrayList, ((n) it.next()).a());
            }
            Set<String> setG1 = h0.g1(arrayList);
            if (setG1 != null) {
                return setG1;
            }
        }
        return l0.f134950a;
    }

    public static final LinkedHashMap b(n0 n0Var, n0.a aVar, z zVar, c cVar) {
        n0Var.getClass();
        aVar.getClass();
        zVar.getClass();
        b.f27594b.getClass();
        String str = b.f27596d.f27597a;
        str.getClass();
        zh.i iVar = new zh.i();
        n0Var.a().a(iVar, zVar, aVar);
        di.e eVar = new di.e(f0.a(n0Var, zVar), str, cVar);
        Object objC = iVar.c();
        objC.getClass();
        List<w> list = n0Var.b().f178375f;
        String str2 = n0Var.b().f178371b.a().f178393a;
        list.getClass();
        str2.getClass();
        eVar.a(eVar.f59701b, (Map) objC, list, str2);
        return eVar.f59703d;
    }
}
