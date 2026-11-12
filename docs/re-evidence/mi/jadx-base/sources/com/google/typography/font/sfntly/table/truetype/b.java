package com.google.typography.font.sfntly.table.truetype;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.jgj;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Glyph {
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9852k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f9853r;
    public boolean[] s;
    public int[] t;

    public static class a extends Glyph.a<b> {
        public a(jgj jgjVar, int i, int i2) {
            super(jgjVar.A(i, i2));
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b o(jgj jgjVar) {
            return new b(jgjVar, 0, jgjVar.e());
        }
    }

    public b(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2, Glyph.GlyphType.Simple);
    }

    public int B(int i) {
        return this.f39611a.v((i * FontData.DataSize.USHORT.size()) + GlyphTable.Offset.simpleEndPtsOfCountours.offset);
    }

    public final int C(int i) {
        return this.f39611a.s(this.f9852k + (i * FontData.DataSize.BYTE.size()));
    }

    public int E(int i) {
        q();
        if (i >= u()) {
            return 0;
        }
        int[] iArr = this.t;
        return iArr[i + 1] - iArr[i];
    }

    public boolean F(int i, int i2) {
        q();
        return this.s[this.t[i] + i2];
    }

    public final void G(boolean z) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iC = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.i; i5++) {
            if (iC == 0) {
                int i6 = i + 1;
                int iC2 = C(i);
                if ((iC2 & 8) == 8) {
                    i += 2;
                    iC = C(i6);
                } else {
                    i = i6;
                }
                i4 = iC2;
            } else {
                iC--;
            }
            if (z) {
                this.s[i5] = (i4 & 1) == 1;
            }
            if ((i4 & 2) == 2) {
                if (z) {
                    this.q[i5] = this.f39611a.s(this.l + i2);
                    int[] iArr = this.q;
                    iArr[i5] = iArr[i5] * ((i4 & 16) == 16 ? 1 : -1);
                }
                i2++;
            } else if ((i4 & 16) != 16) {
                if (z) {
                    this.q[i5] = this.f39611a.r(this.l + i2);
                }
                i2 += 2;
            }
            if (z && i5 > 0) {
                int[] iArr2 = this.q;
                iArr2[i5] = iArr2[i5] + iArr2[i5 - 1];
            }
            if ((i4 & 4) == 4) {
                if (z) {
                    this.f9853r[i5] = this.f39611a.s(this.m + i3);
                    int[] iArr3 = this.f9853r;
                    iArr3[i5] = iArr3[i5] * ((i4 & 32) != 32 ? -1 : 1);
                }
                i3++;
            } else if ((i4 & 32) != 32) {
                if (z) {
                    this.f9853r[i5] = this.f39611a.r(this.m + i3);
                }
                i3 += 2;
            }
            if (z && i5 > 0) {
                int[] iArr4 = this.f9853r;
                iArr4[i5] = iArr4[i5] + iArr4[i5 - 1];
            }
        }
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    public int H(int i, int i2) {
        q();
        return this.q[this.t[i] + i2];
    }

    public int I(int i, int i2) {
        q();
        return this.f9853r[this.t[i] + i2];
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public void q() {
        if (this.d) {
            return;
        }
        synchronized (this.e) {
            try {
                if (this.d) {
                    return;
                }
                int i = 0;
                if (f().e() == 0) {
                    this.h = 0;
                    this.i = 0;
                    this.j = 0;
                    this.f9852k = 0;
                    this.l = 0;
                    this.m = 0;
                    return;
                }
                jgj jgjVar = this.f39611a;
                GlyphTable.Offset offset = GlyphTable.Offset.simpleEndPtsOfCountours;
                int i2 = offset.offset;
                int iU = u();
                FontData.DataSize dataSize = FontData.DataSize.USHORT;
                this.h = jgjVar.v(i2 + (iU * dataSize.size()));
                int iU2 = offset.offset + ((u() + 1) * dataSize.size());
                this.j = iU2;
                int i3 = this.h;
                FontData.DataSize dataSize2 = FontData.DataSize.BYTE;
                this.f9852k = iU2 + (i3 * dataSize2.size());
                int iB = B(u() - 1) + 1;
                this.i = iB;
                this.q = new int[iB];
                this.f9853r = new int[iB];
                this.s = new boolean[iB];
                G(false);
                int size = this.f9852k + (this.n * dataSize2.size());
                this.l = size;
                this.m = size + (this.o * dataSize2.size());
                int[] iArr = new int[u() + 1];
                this.t = iArr;
                iArr[0] = 0;
                while (true) {
                    int[] iArr2 = this.t;
                    if (i >= iArr2.length - 1) {
                        G(true);
                        int size2 = FontData.DataSize.SHORT.size() * 5;
                        int iU3 = u();
                        FontData.DataSize dataSize3 = FontData.DataSize.USHORT;
                        int size3 = size2 + (iU3 * dataSize3.size()) + dataSize3.size();
                        int i4 = this.h;
                        FontData.DataSize dataSize4 = FontData.DataSize.BYTE;
                        j(e() - ((((size3 + (i4 * dataSize4.size())) + (this.n * dataSize4.size())) + (this.o * dataSize4.size())) + (this.p * dataSize4.size())));
                        this.d = true;
                        return;
                    }
                    int i5 = i + 1;
                    iArr2[i5] = B(i) + 1;
                    i = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public int r() {
        q();
        return this.h;
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph
    public jgj t() {
        q();
        return this.f39611a.A(this.j, r());
    }

    @Override // com.google.typography.font.sfntly.table.truetype.Glyph, defpackage.xz9
    public String toString() {
        q();
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\tinstruction bytes = " + r() + "\n");
        for (int i = 0; i < u(); i++) {
            for (int i2 = 0; i2 < E(i); i2++) {
                sb.append("\t" + i + ":" + i2 + " = [" + H(i, i2) + ", " + I(i, i2) + ", " + F(i, i2) + "]\n");
            }
        }
        return sb.toString();
    }
}
