package j70;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.h0;
import p13.k0;

/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static final Map<String, Double> a(l lVar) {
        String string;
        if (lVar == null) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        k0 k0Var2 = k0.f134949a;
        k0Var2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0Var2);
        List<String> listB = lVar.b();
        List<List<Object>> listA = lVar.a();
        if (listB != null && listA != null) {
            ArrayList arrayListZ = h0.Z(listA);
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj : arrayListZ) {
                if (((List) obj).size() == listB.size()) {
                    arrayList.add(obj);
                }
            }
            for (List list : arrayList) {
                Object objE0 = h0.e0(0, list);
                if (objE0 != null) {
                    String string2 = objE0.toString();
                    Object objE1 = h0.e0(1, list);
                    linkedHashMap.put(string2, (objE1 == null || (string = objE1.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string)));
                }
            }
        }
        return linkedHashMap;
    }
}
