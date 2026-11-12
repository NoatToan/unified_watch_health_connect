package p007l6;

import f5.g0;
import f5.v1;
import f5.y0;
import g8.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q6.a;
import q6.h;
import t6.e;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final void a(a0 a0Var, List<? extends y0> list) {
        ArrayList<String> arrayList;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            y0 y0Var = list.get(i14);
            Object objB = g0.b(y0Var);
            if (objB == null && (objB = i.B(y0Var)) == null) {
                objB = new i();
            }
            a aVarC = a0Var.c(objB.toString());
            if (aVarC != null) {
                aVarC.f143030g0 = y0Var;
                e eVar = aVarC.f143032h0;
                if (eVar != null) {
                    eVar.f162621j0 = y0Var;
                }
            }
            Object f81969t = y0Var.getF81969t();
            n nVar = f81969t instanceof n ? (n) f81969t : null;
            String strA = nVar != null ? nVar.a() : null;
            if (strA != null && (objB instanceof String)) {
                String str = (String) objB;
                HashMap<String, ArrayList<String>> map = a0Var.f143088e;
                if (a0Var.c(str) != null) {
                    if (map.containsKey(strA)) {
                        arrayList = map.get(strA);
                    } else {
                        arrayList = new ArrayList<>();
                        map.put(strA, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }

    public static void b(v1.a aVar, v1 v1Var, h hVar) {
        g6.k.f76003b.getClass();
        if (hVar.f143155q == 8) {
            return;
        }
        if (Float.isNaN(hVar.f143146h) && Float.isNaN(hVar.f143147i) && Float.isNaN(hVar.f143148j) && Float.isNaN(hVar.f143149k) && Float.isNaN(hVar.f143150l) && Float.isNaN(hVar.f143151m) && Float.isNaN(hVar.f143152n) && Float.isNaN(hVar.f143153o) && Float.isNaN(hVar.f143154p)) {
            v1.a.y(aVar, v1Var, (((long) (hVar.f143140b - ((int) 0))) << 32) | (((long) (hVar.f143141c - ((int) 0))) & 4294967295L));
        } else {
            aVar.J(v1Var, hVar.f143140b - ((int) 0), hVar.f143141c - ((int) 0), Float.isNaN(hVar.f143151m) ? 0.0f : hVar.f143151m, new j(hVar));
        }
    }
}
