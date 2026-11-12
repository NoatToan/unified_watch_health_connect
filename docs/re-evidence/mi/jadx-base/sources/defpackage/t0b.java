package defpackage;

import com.google.typography.font.sfntly.data.FontData;
import com.google.typography.font.sfntly.table.truetype.Glyph;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;
import com.google.typography.font.sfntly.table.truetype.b;

/* JADX INFO: loaded from: classes5.dex */
public class t0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphTable.b f34166a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34167a;

        static {
            int[] iArr = new int[Glyph.GlyphType.values().length];
            f34167a = iArr;
            try {
                iArr[Glyph.GlyphType.Simple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34167a[Glyph.GlyphType.Composite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public t0b(GlyphTable.b bVar) {
        this.f34166a = bVar;
    }

    public final int a(Glyph glyph) {
        com.google.typography.font.sfntly.table.truetype.a aVar = (com.google.typography.font.sfntly.table.truetype.a) glyph;
        int iR = aVar.r();
        int iE = aVar.e() - aVar.i();
        return iR > 0 ? (iE - (iR * FontData.DataSize.BYTE.size())) - FontData.DataSize.USHORT.size() : iE;
    }

    public final int b(b bVar) {
        return bVar.r() * FontData.DataSize.BYTE.size();
    }

    public final int c(Glyph glyph) {
        b bVar = (b) glyph;
        int iR = bVar.r();
        int iE = bVar.e() - bVar.i();
        return iR > 0 ? iE - b(bVar) : iE;
    }

    public final void d(apr aprVar, int i) {
        int size;
        int size2 = FontData.DataSize.USHORT.size() * 5;
        int i2 = 32;
        while ((i2 & 32) != 0) {
            int iV = aprVar.v(size2);
            int i3 = iV & (-257);
            aprVar.Q(size2, i3);
            size2 = size2 + (FontData.DataSize.USHORT.size() * 2) + (((iV & 1) != 0 ? FontData.DataSize.SHORT.size() : FontData.DataSize.BYTE.size()) * 2);
            if ((iV & 8) != 0) {
                size = FontData.DataSize.F2DOT14.size();
            } else if ((iV & 64) != 0) {
                size = FontData.DataSize.F2DOT14.size() * 2;
            } else {
                if ((iV & 128) != 0) {
                    size = FontData.DataSize.F2DOT14.size() * 4;
                }
                i2 = i3;
            }
            size2 += size;
            i2 = i3;
        }
    }

    public final apr e(Glyph glyph) {
        int iA = a(glyph);
        apr aprVarC = apr.C(iA);
        com.google.typography.font.sfntly.table.truetype.a aVar = (com.google.typography.font.sfntly.table.truetype.a) glyph;
        glyph.f().A(0, iA).j(aprVarC);
        if (aVar.r() > 0) {
            d(aprVarC, iA);
        }
        return aprVarC;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public Glyph.a<? extends Glyph> f(Glyph glyph) {
        apr aprVarC;
        if (glyph == null || glyph.f().e() <= 0) {
            aprVarC = null;
        } else {
            int i = a.f34167a[glyph.m().ordinal()];
            if (i == 1) {
                aprVarC = g(glyph);
            } else if (i != 2) {
                aprVarC = null;
            } else {
                aprVarC = e(glyph);
            }
        }
        if (aprVarC == null) {
            aprVarC = apr.C(0);
        }
        return this.f34166a.z(aprVarC);
    }

    public final apr g(Glyph glyph) {
        int iC = c(glyph);
        apr aprVarC = apr.C((iC + 1) & (-2));
        b bVar = (b) glyph;
        jgj jgjVarF = glyph.f();
        int i = i(aprVarC, 0, jgjVarF, 0, bVar);
        int iJ = i + j(aprVarC, i);
        h(aprVarC, iJ, jgjVarF, iJ + (bVar.r() * FontData.DataSize.BYTE.size()), iC - iJ);
        return aprVarC;
    }

    public final int h(apr aprVar, int i, jgj jgjVar, int i2, int i3) {
        jgjVar.A(i2, i3).j(aprVar.A(i, i3));
        return i3;
    }

    public final int i(apr aprVar, int i, jgj jgjVar, int i2, b bVar) {
        int size = (FontData.DataSize.SHORT.size() * 5) + (bVar.u() * FontData.DataSize.USHORT.size());
        jgjVar.A(i2, size).j(aprVar.A(i, size));
        return size;
    }

    public final int j(apr aprVar, int i) {
        aprVar.Q(i, 0);
        return FontData.DataSize.USHORT.size();
    }
}
