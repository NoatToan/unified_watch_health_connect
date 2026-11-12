package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.core.CMap;
import com.google.typography.font.sfntly.table.core.g;
import com.google.typography.font.sfntly.table.core.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ukk extends jzo {
    public ukk() {
        super(Integer.valueOf(tzo.f35226b));
    }

    public static Map<Integer, Integer> c(ooo oooVar, Font font) {
        g gVarD = d(font);
        if (gVarD == null) {
            throw new RuntimeException("CMap format 4 table in source font not found");
        }
        Map<Integer, Integer> mapA = oooVar.a();
        HashMap map = new HashMap();
        for (Integer num : gVarD) {
            int iM = gVarD.m(num.intValue());
            if (mapA.containsKey(Integer.valueOf(iM))) {
                map.put(num, mapA.get(Integer.valueOf(iM)));
            }
        }
        return map;
    }

    public static g d(Font font) {
        for (CMap cMap : (j) font.h(tzo.f35226b)) {
            if (cMap.l() == CMap.CMapFormat.Format4.value()) {
                return (g) cMap;
            }
        }
        return null;
    }

    @Override // defpackage.izo
    public boolean a(ooo oooVar, Font font, Font.b bVar) throws IOException {
        new x83(bVar, c(oooVar, font)).a();
        return true;
    }
}
