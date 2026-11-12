package defpackage;

import com.google.typography.font.sfntly.Font;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class y4i extends jzo {
    public y4i() {
        super(Integer.valueOf(tzo.i));
    }

    @Override // defpackage.izo
    public boolean a(ooo oooVar, Font font, Font.b bVar) {
        List<Integer> listB = oooVar.b();
        if (listB == null) {
            return false;
        }
        x4i x4iVar = new x4i();
        w4i w4iVar = (w4i) font.h(tzo.i);
        x4iVar.b(w4iVar);
        if (w4iVar.r() == 65536 || w4iVar.r() == 131072) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < listB.size(); i++) {
                arrayList.add(w4iVar.m(listB.get(i).intValue()));
            }
            x4iVar.d(arrayList);
        }
        bVar.l(tzo.i, x4iVar.a());
        return true;
    }
}
