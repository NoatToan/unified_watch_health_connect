package li0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 {
    public static final boolean a(n0 n0Var) {
        n0Var.getClass();
        hi0.e.b bVar = n0Var.f112816a;
        return bVar == hi0.e.b.FOLLOWED || bVar == hi0.e.b.MUTUAL;
    }

    public static final boolean b(d0 d0Var) {
        d0Var.getClass();
        n0 n0Var = d0Var.f112656i;
        if (n0Var == null) {
            return false;
        }
        hi0.e.b bVar = n0Var.f112816a;
        return bVar == hi0.e.b.FOLLOWING || bVar == hi0.e.b.MUTUAL;
    }

    public static final Object c(List list, z1 z1Var, v13.c cVar) {
        Object objEmit;
        if (list == null) {
            return Unit.INSTANCE;
        }
        LinkedHashMap linkedHashMapN = p13.u0.n((Map) z1Var.getValue());
        Iterator it = list.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            String str = d0Var.f112650c;
            if (str == null) {
                return Unit.INSTANCE;
            }
            l0 l0VarE = e(d0Var);
            l0 l0Var = (l0) ((Map) z1Var.getValue()).get(str);
            if (l0Var != null && !l0VarE.equals(l0Var)) {
                linkedHashMapN.put(str, l0VarE);
                z14 = true;
            }
        }
        return (z14 && (objEmit = z1Var.emit(linkedHashMapN, cVar)) == u13.a.COROUTINE_SUSPENDED) ? objEmit : Unit.INSTANCE;
    }

    public static final Object d(d0 d0Var, z1 z1Var, v13.c cVar) {
        String str = d0Var.f112650c;
        if (str == null) {
            return Unit.INSTANCE;
        }
        l0 l0VarE = e(d0Var);
        l0 l0Var = (l0) ((Map) z1Var.getValue()).get(str);
        if (l0Var != null && !l0VarE.equals(l0Var)) {
            LinkedHashMap linkedHashMapN = p13.u0.n((Map) z1Var.getValue());
            linkedHashMapN.put(str, l0VarE);
            Object objEmit = z1Var.emit(linkedHashMapN, cVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final l0 e(d0 d0Var) {
        d0Var.getClass();
        return new l0(d0Var.f112649b, d0Var.f112650c, d0Var.f112654g, d0Var.f112655h, d0Var.f112656i);
    }

    public static final d0 f(d0 d0Var, Map<String, l0> map) {
        d0Var.getClass();
        map.getClass();
        l0 l0Var = map.get(d0Var.f112650c);
        return l0Var != null ? d0.b(d0Var, null, l0Var.f112785a, l0Var.f112786b, null, l0Var.f112787c, l0Var.f112788d, l0Var.f112789e, 57) : d0Var;
    }
}
