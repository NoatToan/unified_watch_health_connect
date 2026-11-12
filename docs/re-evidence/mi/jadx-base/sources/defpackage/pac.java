package defpackage;

import com.google.typography.font.sfntly.Font;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class pac extends jzo {
    public pac() {
        super(Integer.valueOf(tzo.e), Integer.valueOf(tzo.d));
    }

    @Override // defpackage.izo
    public boolean a(ooo oooVar, Font font, Font.b bVar) {
        List<Integer> listB = oooVar.b();
        if (listB == null) {
            return false;
        }
        nac nacVar = (nac) font.h(tzo.e);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listB.size(); i++) {
            int iIntValue = listB.get(i).intValue();
            arrayList.add(new oac.a(nacVar.o(iIntValue), nacVar.t(iIntValue)));
        }
        new oac(bVar, arrayList).a();
        return true;
    }
}
