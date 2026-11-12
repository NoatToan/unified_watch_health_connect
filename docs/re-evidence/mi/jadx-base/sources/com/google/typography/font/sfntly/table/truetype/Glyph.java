package com.google.typography.font.sfntly.table.truetype;

import defpackage.apr;
import defpackage.jgj;
import defpackage.nno;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Glyph extends nno {
    public volatile boolean d;
    public final Object e;
    public final GlyphType f;
    public final int g;

    public enum GlyphType {
        Simple,
        Composite
    }

    public static abstract class a<T extends Glyph> extends nno.a<T> {
        public a(jgj jgjVar) {
            super(jgjVar);
        }

        public static a<? extends Glyph> u(GlyphTable.b bVar, jgj jgjVar) {
            return v(bVar, jgjVar, 0, jgjVar.e());
        }

        public static a<? extends Glyph> v(GlyphTable.b bVar, jgj jgjVar, int i, int i2) {
            return Glyph.o(jgjVar, i, i2) == GlyphType.Simple ? new b.a(jgjVar, i, i2) : new com.google.typography.font.sfntly.table.truetype.a.C0266a(jgjVar, i, i2);
        }

        @Override // xz9.a
        public void p() {
        }

        @Override // xz9.a
        public int q() {
            return g().e();
        }

        @Override // xz9.a
        public boolean r() {
            return true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            return g().j(aprVar);
        }
    }

    public Glyph(jgj jgjVar, GlyphType glyphType) {
        super(jgjVar);
        this.d = false;
        this.e = new Object();
        this.f = glyphType;
        if (this.f39611a.e() == 0) {
            this.g = 0;
        } else {
            this.g = this.f39611a.r(GlyphTable.Offset.numberOfContours.offset);
        }
    }

    public static Glyph l(GlyphTable glyphTable, jgj jgjVar, int i, int i2) {
        return o(jgjVar, i, i2) == GlyphType.Simple ? new b(jgjVar, i, i2) : new com.google.typography.font.sfntly.table.truetype.a(jgjVar, i, i2);
    }

    public static GlyphType o(jgj jgjVar, int i, int i2) {
        if (i > jgjVar.e()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 != 0 && jgjVar.r(i) < 0) {
            return GlyphType.Composite;
        }
        return GlyphType.Simple;
    }

    public int A() {
        return this.f39611a.r(GlyphTable.Offset.yMin.offset);
    }

    @Override // defpackage.nno
    public int i() {
        q();
        return super.i();
    }

    public GlyphType m() {
        return this.f;
    }

    public abstract void q();

    public abstract int r();

    public abstract jgj t();

    @Override // defpackage.xz9
    public String toString() {
        return v(0);
    }

    public int u() {
        return this.g;
    }

    public String v(int i) {
        return m() + ", contours=" + u() + ", [xmin=" + x() + ", ymin=" + A() + ", xmax=" + w() + ", ymax=" + z() + "]\n";
    }

    public int w() {
        return this.f39611a.r(GlyphTable.Offset.xMax.offset);
    }

    public int x() {
        return this.f39611a.r(GlyphTable.Offset.xMin.offset);
    }

    public int z() {
        return this.f39611a.r(GlyphTable.Offset.yMax.offset);
    }

    public Glyph(jgj jgjVar, int i, int i2, GlyphType glyphType) {
        super(jgjVar, i, i2);
        this.d = false;
        this.e = new Object();
        this.f = glyphType;
        if (this.f39611a.e() == 0) {
            this.g = 0;
        } else {
            this.g = this.f39611a.r(GlyphTable.Offset.numberOfContours.offset);
        }
    }
}
