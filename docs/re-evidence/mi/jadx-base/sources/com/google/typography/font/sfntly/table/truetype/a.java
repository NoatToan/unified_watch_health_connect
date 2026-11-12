package com.google.typography.font.sfntly.table.truetype;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.jgj;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Glyph {
    public final List<Integer> h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: com.google.typography.font.sfntly.table.truetype.a$a, reason: collision with other inner class name */
    public static class C0266a extends Glyph.a<a> {
        public C0266a(jgj jgjVar, int i, int i2) {
            super(jgjVar.A(i, i2));
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a o(jgj jgjVar) {
            return new a(jgjVar);
        }
    }

    public a(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2, Glyph.GlyphType.Composite);
        this.h = new LinkedList();
        q();
    }

    public int B(int i) {
        int size = (FontData.DataSize.USHORT.size() * 2) + this.h.get(i).intValue();
        return (E(i) & 1) == 1 ? this.f39611a.v(size) : this.f39611a.m(size);
    }

    public int C(int i) {
        FontData.DataSize dataSize = FontData.DataSize.USHORT;
        int size = (dataSize.size() * 2) + this.h.get(i).intValue();
        return (E(i) & 1) == 1 ? this.f39611a.v(size + dataSize.size()) : this.f39611a.m(size + FontData.DataSize.BYTE.size());
    }

    public int E(int i) {
        return this.f39611a.v(this.h.get(i).intValue());
    }

    public int F(int i) {
        return this.f39611a.v(FontData.DataSize.USHORT.size() + this.h.get(i).intValue());
    }

    public int G() {
        return this.h.size();
    }

    public byte[] H(int i) {
        int iIntValue = this.h.get(i).intValue() + (FontData.DataSize.USHORT.size() * 2) + (((E(i) & 1) == 1 ? FontData.DataSize.SHORT.size() : FontData.DataSize.BYTE.size()) * 2);
        int I = I(i);
        byte[] bArr = new byte[I];
        this.f39611a.n(iIntValue, bArr, 0, I);
        return bArr;
    }

    public int I(int i) {
        int iE = E(i);
        if ((iE & 8) == 8) {
            return FontData.DataSize.F2DOT14.size();
        }
        if ((iE & 64) == 64) {
            return FontData.DataSize.F2DOT14.size() * 2;
        }
        if ((iE & 128) == 128) {
            return FontData.DataSize.F2DOT14.size() * 4;
        }
        return 0;
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public void q() {
        int size;
        if (this.d) {
            return;
        }
        synchronized (this.e) {
            try {
                if (this.d) {
                    return;
                }
                int size2 = FontData.DataSize.USHORT.size() * 5;
                int iV = 32;
                while ((iV & 32) == 32) {
                    this.h.add(Integer.valueOf(size2));
                    iV = this.f39611a.v(size2);
                    size2 = size2 + (FontData.DataSize.USHORT.size() * 2) + (((iV & 1) == 1 ? FontData.DataSize.SHORT.size() : FontData.DataSize.BYTE.size()) * 2);
                    if ((iV & 8) == 8) {
                        size = FontData.DataSize.F2DOT14.size();
                    } else if ((iV & 64) == 64) {
                        size = FontData.DataSize.F2DOT14.size() * 2;
                    } else if ((iV & 128) == 128) {
                        size = FontData.DataSize.F2DOT14.size() * 4;
                    }
                    size2 += size;
                }
                if ((iV & 256) == 256) {
                    this.j = this.f39611a.v(size2);
                    int size3 = size2 + FontData.DataSize.USHORT.size();
                    this.i = size3;
                    size2 = size3 + (this.j * FontData.DataSize.BYTE.size());
                }
                j(e() - size2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public int r() {
        return this.j;
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public jgj t() {
        return this.f39611a.A(this.i, r());
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph, defpackage.xz9
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\ncontourOffset.length = ");
        sb.append(this.h.size());
        sb.append("\ninstructionSize = ");
        sb.append(this.j);
        sb.append("\n\tcontour index = [");
        for (int i = 0; i < this.h.size(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.h.get(i));
        }
        sb.append("]\n");
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            sb.append("\t" + i2 + " = [gid = " + F(i2) + ", arg1 = " + B(i2) + ", arg2 = " + C(i2) + "]\n");
        }
        return sb.toString();
    }

    public a(jgj jgjVar) {
        super(jgjVar, Glyph.GlyphType.Composite);
        this.h = new LinkedList();
        q();
    }
}
