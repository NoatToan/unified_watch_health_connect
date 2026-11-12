package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.core.CMap;
import com.google.typography.font.sfntly.table.core.j;
import com.google.typography.font.sfntly.table.truetype.Glyph;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;
import com.google.typography.font.sfntly.table.truetype.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class r0b {
    public static CMap a(j jVar) {
        for (CMap cMap : jVar) {
            if (cMap.l() == CMap.CMapFormat.Format12.value()) {
                return cMap;
            }
        }
        for (CMap cMap2 : jVar) {
            if (cMap2.l() == CMap.CMapFormat.Format4.value()) {
                return cMap2;
            }
        }
        return null;
    }

    public static Glyph b(Font font, int i) {
        tie tieVar = (tie) font.h(tzo.m);
        return ((GlyphTable) font.h(tzo.l)).l(tieVar.o(i), tieVar.m(i));
    }

    public static List<Integer> c(Font font, String str) {
        CMap cMapA = a((j) font.h(tzo.f35226b));
        HashSet hashSet = new HashSet();
        hashSet.add(0);
        for (int i = 0; i < str.length(); i++) {
            d(font, hashSet, cMapA.m(str.charAt(i) & CharCompanionObject.MAX_VALUE));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void d(Font font, Set<Integer> set, int i) {
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        set.add(Integer.valueOf(i));
        Glyph glyphB = b(font, i);
        if (glyphB == null || glyphB.m() != Glyph.GlyphType.Composite) {
            return;
        }
        a aVar = (a) glyphB;
        for (int i2 = 0; i2 < aVar.G(); i2++) {
            d(font, set, aVar.F(i2));
        }
    }
}
