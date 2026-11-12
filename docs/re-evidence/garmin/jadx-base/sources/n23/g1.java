package n23;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class g1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f122470a;

    public g1(h1 h1Var) {
        this.f122470a = h1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        h1 h1Var = this.f122470a;
        i3 i3Var = h1Var.f122482h;
        String str = h1Var.f122483i;
        String str2 = h1Var.f122484j;
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        d53.j jVarC = i3.f122506c.c(str2);
        if (jVarC != null) {
            String str3 = new d53.i.a(jVarC).f57690a.a().get(1);
            t23.r0 r0VarJ = i3Var.J(Integer.parseInt(str3));
            if (r0VarJ != null) {
                return r0VarJ;
            }
            StringBuilder sbL = hb.a.l("Local property #", str3, " not found in ");
            sbL.append(i3Var.j());
            throw new w3(sbL.toString());
        }
        Collection<t23.r0> collectionL = i3Var.L(x33.f.e(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionL) {
            m4.f122535a.getClass();
            if (p005kotlin.jvm.internal.s.g(m4.b((t23.r0) obj).getF122414f(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbI = p6.b.i("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbI.append(i3Var);
            throw new w3(sbI.toString());
        }
        if (arrayList.size() == 1) {
            return (t23.r0) p13.h0.I0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            t23.r visibility = ((t23.r0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        TreeMap treeMap = new TreeMap(new f3(e3.f122435a));
        treeMap.putAll(linkedHashMap);
        Collection collectionValues = treeMap.values();
        collectionValues.getClass();
        List list = (List) p13.h0.l0(collectionValues);
        if (list.size() == 1) {
            return (t23.r0) p13.h0.b0(list);
        }
        String strK0 = p13.h0.k0(i3Var.L(x33.f.e(str)), "\n", null, null, g3.f122473a, 30);
        StringBuilder sbI2 = p6.b.i("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
        sbI2.append(i3Var);
        sbI2.append(CoreConstants.COLON_CHAR);
        sbI2.append(strK0.length() == 0 ? " no members found" : "\n".concat(strK0));
        throw new w3(sbI2.toString());
    }
}
