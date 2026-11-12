package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.truetype.Glyph;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class u0b extends jzo {
    public u0b() {
        super(Integer.valueOf(tzo.l), Integer.valueOf(tzo.m));
    }

    @Override // defpackage.izo
    public boolean a(ooo oooVar, Font font, Font.b bVar) throws IOException {
        int i = tzo.l;
        GlyphTable glyphTable = (GlyphTable) font.h(i);
        int i2 = tzo.m;
        tie tieVar = (tie) font.h(i2);
        if (glyphTable == null || tieVar == null) {
            throw new RuntimeException("Font to subset is not valid.");
        }
        glyphTable.f();
        GlyphTable.b bVar2 = (GlyphTable.b) bVar.k(i);
        tie.b bVar3 = (tie.b) bVar.k(i2);
        List<Glyph.a<? extends Glyph>> listA = bVar2.A();
        t0b t0bVar = new t0b(bVar2);
        for (int i3 = 0; i3 < tieVar.r(); i3++) {
            listA.add(t0bVar.f(glyphTable.l(tieVar.o(i3), tieVar.m(i3))));
        }
        bVar3.C(bVar2.x());
        return true;
    }
}
