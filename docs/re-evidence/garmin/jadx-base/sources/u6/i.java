package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(t6.e eVar, int i14, ArrayList<o> arrayList, o oVar) {
        int i15;
        int i16 = i14 == 0 ? eVar.f162643u0 : eVar.f162645v0;
        if (i16 != -1 && (oVar == null || i16 != oVar.f168835b)) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                o oVar2 = arrayList.get(i17);
                if (oVar2.f168835b == i16) {
                    if (oVar != null) {
                        oVar.c(i14, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i16 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof t6.i) {
                t6.i iVar = (t6.i) eVar;
                int i18 = 0;
                while (true) {
                    if (i18 >= iVar.f162691x0) {
                        i15 = -1;
                        break;
                    }
                    t6.e eVar2 = iVar.f162690w0[i18];
                    if ((i14 == 0 && (i15 = eVar2.f162643u0) != -1) || (i14 == 1 && (i15 = eVar2.f162645v0) != -1)) {
                        break;
                    }
                    i18++;
                }
                if (i15 != -1) {
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        o oVar3 = arrayList.get(i19);
                        if (oVar3.f168835b == i15) {
                            oVar = oVar3;
                            break;
                        }
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i14);
            }
            arrayList.add(oVar);
        }
        ArrayList<t6.e> arrayList2 = oVar.f168834a;
        if (arrayList2.contains(eVar)) {
            return oVar;
        }
        arrayList2.add(eVar);
        if (eVar instanceof t6.h) {
            t6.h hVar = (t6.h) eVar;
            hVar.f162688z0.c(hVar.A0 == 0 ? 1 : 0, arrayList, oVar);
        }
        int i24 = oVar.f168835b;
        if (i14 == 0) {
            eVar.f162643u0 = i24;
            eVar.L.c(i14, arrayList, oVar);
            eVar.N.c(i14, arrayList, oVar);
        } else {
            eVar.f162645v0 = i24;
            eVar.M.c(i14, arrayList, oVar);
            eVar.P.c(i14, arrayList, oVar);
            eVar.O.c(i14, arrayList, oVar);
        }
        eVar.S.c(i14, arrayList, oVar);
        return oVar;
    }

    public static boolean b(t6.e.b bVar, t6.e.b bVar2, t6.e.b bVar3, t6.e.b bVar4) {
        t6.e.b bVar5;
        t6.e.b bVar6;
        t6.e.b bVar7 = t6.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = t6.e.b.WRAP_CONTENT) || (bVar3 == t6.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = t6.e.b.WRAP_CONTENT) || (bVar4 == t6.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
