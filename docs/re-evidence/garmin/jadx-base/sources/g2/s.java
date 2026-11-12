package g2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final List<Integer> a(i0 i0Var, y0 y0Var, n nVar) {
        j23.l lVar;
        q3.c<n.a> cVar = nVar.f75177a;
        if (!(cVar.f142358c != 0) && y0Var.f75308a.isEmpty()) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        if (nVar.f75177a.f142358c != 0) {
            int i14 = cVar.f142358c;
            if (i14 == 0) {
                n23.j.s("MutableVector is empty.");
                return null;
            }
            n.a[] aVarArr = cVar.f142356a;
            int i15 = aVarArr[0].f75178a;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = aVarArr[i16].f75178a;
                if (i17 < i15) {
                    i15 = i17;
                }
            }
            if (i15 < 0) {
                b2.e.a("negative minIndex");
            }
            int i18 = cVar.f142358c;
            if (i18 == 0) {
                n23.j.s("MutableVector is empty.");
                return null;
            }
            n.a[] aVarArr2 = cVar.f142356a;
            int i19 = aVarArr2[0].f75179b;
            for (int i24 = 0; i24 < i18; i24++) {
                int i25 = aVarArr2[i24].f75179b;
                if (i25 > i19) {
                    i19 = i25;
                }
            }
            lVar = new j23.l(i15, Math.min(i19, i0Var.getItemCount() - 1));
        } else {
            j23.l.f96803e.getClass();
            lVar = j23.l.f96804f;
        }
        int size = y0Var.f75308a.size();
        for (int i26 = 0; i26 < size; i26++) {
            y0.a aVar = (y0.a) y0Var.get(i26);
            int iE = p.e(aVar.getF75293c(), i0Var, aVar.getF75291a());
            int i27 = lVar.f96796a;
            if ((iE > lVar.f96797b || i27 > iE) && iE >= 0 && iE < i0Var.getItemCount()) {
                arrayList.add(Integer.valueOf(iE));
            }
        }
        int i28 = lVar.f96796a;
        int i29 = lVar.f96797b;
        if (i28 <= i29) {
            while (true) {
                arrayList.add(Integer.valueOf(i28));
                if (i28 == i29) {
                    break;
                }
                i28++;
            }
        }
        return arrayList;
    }
}
