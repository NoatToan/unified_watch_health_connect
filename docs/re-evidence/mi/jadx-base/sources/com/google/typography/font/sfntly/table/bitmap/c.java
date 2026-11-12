package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import defpackage.ono;
import defpackage.ylb;
import defpackage.yz9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c extends ono {
    public final Object c;
    public volatile List<com.google.typography.font.sfntly.table.bitmap.b> d;

    public static final class a extends ono.a<c> {
        public final int g;
        public List<com.google.typography.font.sfntly.table.bitmap.b.a> h;

        public a(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.g = 131072;
        }

        public static a w(ylb ylbVar, apr aprVar) {
            return new a(ylbVar, aprVar);
        }

        @Override // xz9.a
        public void p() {
            x();
        }

        @Override // xz9.a
        public int q() {
            List<com.google.typography.font.sfntly.table.bitmap.b.a> list = this.h;
            boolean z = false;
            if (list == null) {
                return 0;
            }
            int iAbs = b.d.f9800a;
            Iterator<com.google.typography.font.sfntly.table.bitmap.b.a> it = list.iterator();
            while (it.hasNext()) {
                int iQ = it.next().q();
                if (iQ <= 0) {
                    z = true;
                }
                iAbs += Math.abs(iQ);
            }
            return z ? -iAbs : iAbs;
        }

        @Override // xz9.a
        public boolean r() {
            List<com.google.typography.font.sfntly.table.bitmap.b.a> list = this.h;
            if (list == null) {
                return false;
            }
            Iterator<com.google.typography.font.sfntly.table.bitmap.b.a> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().r()) {
                    return false;
                }
            }
            return true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            int iJ = aprVar.J(0, 131072);
            int iO = iJ + aprVar.O(iJ, this.h.size());
            int size = (this.h.size() * b.f.f9800a) + iO;
            int iS = iO;
            for (com.google.typography.font.sfntly.table.bitmap.b.a aVar : this.h) {
                aVar.B(size);
                List<e.a<? extends e>> listY = aVar.y();
                int size2 = (listY.size() * b.J.f9800a) + size;
                int iO2 = size;
                for (e.a<? extends e> aVar2 : listY) {
                    int iQ = iO2 + aprVar.Q(iO2, aVar2.v());
                    int iQ2 = iQ + aprVar.Q(iQ, aVar2.z());
                    iO2 = iQ2 + aprVar.O(iQ2, size2 - size);
                    int iS2 = aVar2.s(aprVar.z(size2));
                    int i = size2 + iS2;
                    size2 = i + aprVar.L(i, yz9.b(iS2, FontData.DataSize.ULONG.size()));
                }
                aVar.C(size2 - size);
                iS += aVar.s(aprVar.z(iS));
                size = size2;
            }
            return iO + size;
        }

        public void x() {
            this.h = null;
            n(false);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public c o(jgj jgjVar) {
            return new c(u(), jgjVar);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final b H;
        public static final b I;
        public static final b J;
        public static final b K;
        public static final b L;
        public static final b M;
        public static final b N;
        public static final b O;
        public static final b P;
        public static final b Q;
        public static final b R;
        public static final b S;
        public static final b T;
        public static final b U;
        public static final b V;
        public static final b W;
        public static final b X;
        public static final b Y;
        public static final b Z;
        public static final b a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9797b = new b("version", 0, 0);
        public static final b b0;
        public static final b c;
        public static final b c0;
        public static final b d;
        public static final b d0;
        public static final b e;
        public static final b e0;
        public static final b f;
        public static final b f0;
        public static final b g;
        public static final b g0;
        public static final b h;
        public static final b h0;
        public static final b i;
        public static final b i0;
        public static final b j;
        public static final /* synthetic */ b[] j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f9798k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f9799r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final b y;
        public static final b z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9800a;

        static {
            b bVar = new b("numSizes", 1, 4);
            c = bVar;
            int i2 = bVar.f9800a;
            FontData.DataSize dataSize = FontData.DataSize.ULONG;
            b bVar2 = new b("headerLength", 2, i2 + dataSize.size());
            d = bVar2;
            e = new b("bitmapSizeTableArrayStart", 3, bVar2.f9800a);
            f = new b("bitmapSizeTableLength", 4, 48);
            g = new b("bitmapSizeTable_indexSubTableArrayOffset", 5, 0);
            h = new b("bitmapSizeTable_indexTableSize", 6, 4);
            i = new b("bitmapSizeTable_numberOfIndexSubTables", 7, 8);
            j = new b("bitmapSizeTable_colorRef", 8, 12);
            f9798k = new b("bitmapSizeTable_hori", 9, 16);
            l = new b("bitmapSizeTable_vert", 10, 28);
            m = new b("bitmapSizeTable_startGlyphIndex", 11, 40);
            n = new b("bitmapSizeTable_endGlyphIndex", 12, 42);
            o = new b("bitmapSizeTable_ppemX", 13, 44);
            p = new b("bitmapSizeTable_ppemY", 14, 45);
            q = new b("bitmapSizeTable_bitDepth", 15, 46);
            f9799r = new b("bitmapSizeTable_flags", 16, 47);
            s = new b("sbitLineMetricsLength", 17, 12);
            t = new b("sbitLineMetrics_ascender", 18, 0);
            u = new b("sbitLineMetrics_descender", 19, 1);
            v = new b("sbitLineMetrics_widthMax", 20, 2);
            w = new b("sbitLineMetrics_caretSlopeNumerator", 21, 3);
            x = new b("sbitLineMetrics__caretSlopeDenominator", 22, 4);
            y = new b("sbitLineMetrics_caretOffset", 23, 5);
            z = new b("sbitLineMetrics_minOriginSB", 24, 6);
            A = new b("sbitLineMetrics_minAdvanceSB", 25, 7);
            B = new b("sbitLineMetrics_maxBeforeBL", 26, 8);
            C = new b("sbitLineMetrics_minAfterBL", 27, 9);
            D = new b("sbitLineMetrics_pad1", 28, 10);
            E = new b("sbitLineMetrics_pad2", 29, 11);
            F = new b("indexSubTableEntryLength", 30, 8);
            G = new b("indexSubTableEntry_firstGlyphIndex", 31, 0);
            H = new b("indexSubTableEntry_lastGlyphIndex", 32, 2);
            I = new b("indexSubTableEntry_additionalOffsetToIndexSubtable", 33, 4);
            b bVar3 = new b("indexSubHeaderLength", 34, 8);
            J = bVar3;
            K = new b("indexSubHeader_indexFormat", 35, 0);
            L = new b("indexSubHeader_imageFormat", 36, 2);
            M = new b("indexSubHeader_imageDataOffset", 37, 4);
            N = new b("indexSubTable1_offsetArray", 38, bVar3.f9800a);
            O = new b("indexSubTable1_builderDataSize", 39, bVar3.f9800a);
            int size = bVar3.f9800a + dataSize.size();
            BitmapGlyph$Offset bitmapGlyph$Offset = BitmapGlyph$Offset.bigGlyphMetricsLength;
            P = new b("indexSubTable2Length", 40, size + bitmapGlyph$Offset.offset);
            b bVar4 = new b("indexSubTable2_imageSize", 41, bVar3.f9800a);
            Q = bVar4;
            b bVar5 = new b("indexSubTable2_bigGlyphMetrics", 42, bVar4.f9800a + dataSize.size());
            R = bVar5;
            S = new b("indexSubTable2_builderDataSize", 43, bVar5.f9800a + com.google.typography.font.sfntly.table.bitmap.a.b.metricsLength.f9796a);
            b bVar6 = new b("indexSubTable3_offsetArray", 44, bVar3.f9800a);
            T = bVar6;
            U = new b("indexSubTable3_builderDataSize", 45, bVar6.f9800a);
            b bVar7 = new b("indexSubTable4_numGlyphs", 46, bVar3.f9800a);
            V = bVar7;
            b bVar8 = new b("indexSubTable4_glyphArray", 47, bVar7.f9800a + dataSize.size());
            W = bVar8;
            FontData.DataSize dataSize2 = FontData.DataSize.USHORT;
            X = new b("indexSubTable4_codeOffsetPairLength", 48, dataSize2.size() * 2);
            Y = new b("indexSubTable4_codeOffsetPair_glyphCode", 49, 0);
            Z = new b("indexSubTable4_codeOffsetPair_offset", 50, dataSize2.size());
            a0 = new b("indexSubTable4_builderDataSize", 51, bVar8.f9800a);
            b bVar9 = new b("indexSubTable5_imageSize", 52, bVar3.f9800a);
            b0 = bVar9;
            b bVar10 = new b("indexSubTable5_bigGlyphMetrics", 53, bVar9.f9800a + dataSize.size());
            c0 = bVar10;
            b bVar11 = new b("indexSubTable5_numGlyphs", 54, bVar10.f9800a + bitmapGlyph$Offset.offset);
            d0 = bVar11;
            b bVar12 = new b("indexSubTable5_glyphArray", 55, bVar11.f9800a + dataSize.size());
            e0 = bVar12;
            f0 = new b("indexSubTable5_builderDataSize", 56, bVar12.f9800a);
            g0 = new b("codeOffsetPairLength", 57, dataSize2.size() * 2);
            h0 = new b("codeOffsetPair_glyphCode", 58, 0);
            i0 = new b("codeOffsetPair_offset", 59, dataSize2.size());
            j0 = a();
        }

        public b(String str, int i2, int i3) {
            super(str, i2);
            this.f9800a = i3;
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f9797b, c, d, e, f, g, h, i, j, f9798k, l, m, n, o, p, q, f9799r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) j0.clone();
        }
    }

    public c(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
        this.c = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<com.google.typography.font.sfntly.table.bitmap.b> m(jgj jgjVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = b.e.f9800a;
            int i4 = b.f.f9800a;
            arrayList.add((com.google.typography.font.sfntly.table.bitmap.b) com.google.typography.font.sfntly.table.bitmap.b.a.u(jgjVar.A(i3 + (i2 * i4), i4), jgjVar).a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public com.google.typography.font.sfntly.table.bitmap.b l(int i) {
        if (i < 0 || i > q()) {
            throw new IndexOutOfBoundsException("Size table index is outside of the range of tables.");
        }
        return o().get(i);
    }

    public final List<com.google.typography.font.sfntly.table.bitmap.b> o() {
        if (this.d == null) {
            synchronized (this.c) {
                try {
                    if (this.d == null) {
                        this.d = m(this.f39611a, q());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public int q() {
        return this.f39611a.u(b.c.f9800a);
    }

    @Override // defpackage.dzo, defpackage.xz9
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nnum sizes = ");
        sb.append(q());
        sb.append("\n");
        for (int i = 0; i < q(); i++) {
            sb.append(i);
            sb.append(": ");
            sb.append(l(i).toString());
        }
        return sb.toString();
    }
}
