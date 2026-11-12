package com.google.typography.font.sfntly.table.truetype;

import defpackage.apr;
import defpackage.jgj;
import defpackage.ono;
import defpackage.ylb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class GlyphTable extends ono {

    public enum Offset {
        numberOfContours(0),
        xMin(2),
        yMin(4),
        xMax(6),
        yMax(8),
        simpleEndPtsOfCountours(10),
        simpleInstructionLength(0),
        simpleInstructions(2),
        compositeFlags(0),
        compositeGyphIndexWithoutFlag(0),
        compositeGlyphIndexWithFlag(2);

        final int offset;

        Offset(int i) {
            this.offset = i;
        }
    }

    public static class b extends ono.a<GlyphTable> {
        public List<Glyph.a<? extends Glyph>> g;
        public List<Integer> h;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b w(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        public List<Glyph.a<? extends Glyph>> A() {
            return y();
        }

        public final void B(jgj jgjVar, List<Integer> list) {
            this.g = new ArrayList();
            if (jgjVar != null) {
                int iIntValue = list.get(0).intValue();
                int i = 1;
                while (i < list.size()) {
                    int iIntValue2 = list.get(i).intValue();
                    this.g.add(Glyph.a.v(this, jgjVar, iIntValue, iIntValue2 - iIntValue));
                    i++;
                    iIntValue = iIntValue2;
                }
            }
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public GlyphTable o(jgj jgjVar) {
            return new GlyphTable(u(), jgjVar);
        }

        @Override // xz9.a
        public void p() {
            this.g = null;
            super.n(false);
        }

        @Override // xz9.a
        public int q() {
            List<Glyph.a<? extends Glyph>> list = this.g;
            if (list == null || list.size() == 0) {
                return 0;
            }
            Iterator<Glyph.a<? extends Glyph>> it = this.g.iterator();
            boolean z = false;
            int iAbs = 0;
            while (it.hasNext()) {
                int iQ = it.next().q();
                iAbs += Math.abs(iQ);
                z |= iQ <= 0;
            }
            return z ? -iAbs : iAbs;
        }

        @Override // xz9.a
        public boolean r() {
            return this.g != null;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            Iterator<Glyph.a<? extends Glyph>> it = this.g.iterator();
            int iS = 0;
            while (it.hasNext()) {
                iS += it.next().s(aprVar.z(iS));
            }
            return iS;
        }

        public List<Integer> x() {
            ArrayList arrayList = new ArrayList(y().size());
            int iQ = 0;
            arrayList.add(0);
            if (y().size() == 0) {
                arrayList.add(0);
            } else {
                Iterator<Glyph.a<? extends Glyph>> it = y().iterator();
                while (it.hasNext()) {
                    iQ += it.next().q();
                    arrayList.add(Integer.valueOf(iQ));
                }
            }
            return arrayList;
        }

        public final List<Glyph.a<? extends Glyph>> y() {
            if (this.g == null) {
                if (g() != null && this.h == null) {
                    throw new IllegalStateException("Loca values not set - unable to parse glyph data.");
                }
                B(g(), this.h);
                m();
            }
            return this.g;
        }

        public Glyph.a<? extends Glyph> z(jgj jgjVar) {
            return Glyph.a.u(this, jgjVar);
        }
    }

    public Glyph l(int i, int i2) {
        return Glyph.l(this, this.f39611a, i, i2);
    }

    public GlyphTable(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
