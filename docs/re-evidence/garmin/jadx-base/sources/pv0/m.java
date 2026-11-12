package pv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final ArrayList a(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            b63.o oVarB = null;
            Integer num = lVar != null ? lVar.f141390c : null;
            Integer num2 = lVar != null ? lVar.f141389b : null;
            if (num != null && num2 != null && num.intValue() != 0 && num2.intValue() != 0 && num.intValue() >= num2.intValue()) {
                lVar.getClass();
                String str = lVar.f141388a;
                if (str != null) {
                    oVarB = b63.o.Companion.b(b63.o.INSTANCE, str);
                }
            }
            if (oVarB != null) {
                arrayListL.add(oVarB);
            }
        }
        return arrayListL;
    }
}
