package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.truetype.Glyph;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class v0b extends jzo {
    public v0b() {
        super(Integer.valueOf(tzo.l), Integer.valueOf(tzo.m), Integer.valueOf(tzo.f));
    }

    @Override // defpackage.izo
    public boolean a(ooo oooVar, Font font, Font.b bVar) throws IOException {
        List<Integer> listB = oooVar.b();
        if (listB == null) {
            return false;
        }
        int i = tzo.l;
        GlyphTable glyphTable = (GlyphTable) font.h(i);
        int i2 = tzo.m;
        tie tieVar = (tie) font.h(i2);
        if (glyphTable == null || tieVar == null) {
            throw new RuntimeException("Font to subset is not valid.");
        }
        GlyphTable.b bVar2 = (GlyphTable.b) bVar.k(i);
        tie.b bVar3 = (tie.b) bVar.k(i2);
        if (bVar2 == null || bVar3 == null) {
            throw new RuntimeException("Builder for subset is not valid.");
        }
        Map<Integer, Integer> mapA = oooVar.a();
        List<Glyph.a<? extends Glyph>> listA = bVar2.A();
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            listA.add(bVar2.z(s0b.d(glyphTable.l(tieVar.o(iIntValue), tieVar.m(iIntValue)).f(), mapA)));
        }
        bVar3.C(bVar2.x());
        ((q9f.b) bVar.f(tzo.f)).A(bVar3.A());
        return true;
    }
}
