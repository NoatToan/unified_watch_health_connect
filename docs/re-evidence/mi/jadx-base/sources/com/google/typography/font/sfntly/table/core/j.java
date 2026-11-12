package com.google.typography.font.sfntly.table.core;

import com.google.typography.font.sfntly.Font;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.apr;
import defpackage.jgj;
import defpackage.ono;
import defpackage.ylb;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends ono implements Iterable<CMap> {

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f9840a;

        public a(d dVar) {
            this.f9840a = dVar;
        }

        @Override // com.google.typography.font.sfntly.table.core.j.c
        public boolean a(d dVar) {
            return this.f9840a.equals(dVar);
        }
    }

    public static class b extends ono.a<j> {
        public int g;
        public Map<d, CMap.b<? extends CMap>> h;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.g = 0;
        }

        public static int B(jgj jgjVar) {
            if (jgjVar == null) {
                return 0;
            }
            return jgjVar.v(f.numTables.f9849a);
        }

        public static CMap.b<? extends CMap> w(jgj jgjVar, int i) {
            if (i < 0 || i > B(jgjVar)) {
                throw new IndexOutOfBoundsException("CMap table is outside the bounds of the known tables.");
            }
            return CMap.b.x(jgjVar, jgjVar.u(f.encodingRecordOffset.f9849a + j.w(i)), d.c(jgjVar.v(f.encodingRecordPlatformId.f9849a + j.w(i)), jgjVar.v(f.encodingRecordEncodingId.f9849a + j.w(i))));
        }

        public static b x(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        private void z(jgj jgjVar) {
            this.h = new HashMap();
            int iB = B(jgjVar);
            for (int i = 0; i < iB; i++) {
                CMap.b<? extends CMap> bVarW = w(jgjVar, i);
                this.h.put(bVarW.u(), bVarW);
            }
        }

        public CMap.b<? extends CMap> A(d dVar, CMap.CMapFormat cMapFormat) {
            CMap.b<? extends CMap> bVarY = CMap.b.y(cMapFormat, dVar);
            y().put(dVar, bVarY);
            return bVarY;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public j o(jgj jgjVar) {
            return new j(u(), jgjVar, null);
        }

        public int D() {
            return this.g;
        }

        @Override // xz9.a
        public void p() {
            this.h = null;
            super.n(false);
        }

        @Override // xz9.a
        public int q() {
            Map<d, CMap.b<? extends CMap>> map = this.h;
            if (map == null || map.size() == 0) {
                return 0;
            }
            int size = f.encodingRecordStart.f9849a + (this.h.size() * f.encodingRecordSize.f9849a);
            Iterator<CMap.b<? extends CMap>> it = this.h.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                int iQ = it.next().q();
                size += Math.abs(iQ);
                z |= iQ <= 0;
            }
            return z ? -size : size;
        }

        @Override // xz9.a
        public boolean r() {
            Map<d, CMap.b<? extends CMap>> map = this.h;
            if (map == null) {
                return false;
            }
            Iterator<CMap.b<? extends CMap>> it = map.values().iterator();
            while (it.hasNext()) {
                if (!it.next().r()) {
                    return false;
                }
            }
            return true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            int iQ = aprVar.Q(f.version.f9849a, D()) + aprVar.Q(f.numTables.f9849a, this.h.size());
            int size = (this.h.size() * f.encodingRecordSize.f9849a) + iQ;
            for (CMap.b<? extends CMap> bVar : this.h.values()) {
                int iQ2 = iQ + aprVar.Q(iQ, bVar.A());
                int iQ3 = iQ2 + aprVar.Q(iQ2, bVar.v());
                iQ = iQ3 + aprVar.O(iQ3, size);
                size += bVar.s(aprVar.z(size));
            }
            return size;
        }

        public final Map<d, CMap.b<? extends CMap>> y() {
            Map<d, CMap.b<? extends CMap>> map = this.h;
            if (map != null) {
                return map;
            }
            z(g());
            m();
            return this.h;
        }
    }

    public interface c {
        boolean a(d dVar);
    }

    public static final class d implements Comparable<d> {
        public static final d c;
        public static final d d;
        public static final d e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9843b;

        static {
            Font.PlatformId platformId = Font.PlatformId.Windows;
            c = c(platformId.value(), Font.WindowsEncodingId.UnicodeUCS2.value());
            d = c(platformId.value(), Font.WindowsEncodingId.UnicodeUCS4.value());
            e = c(Font.PlatformId.Macintosh.value(), Font.MacintoshEncodingId.Roman.value());
        }

        public d(int i, int i2) {
            this.f9842a = i;
            this.f9843b = i2;
        }

        public static d c(int i, int i2) {
            return new d(i, i2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return hashCode() - dVar.hashCode();
        }

        public int b() {
            return this.f9843b;
        }

        public int d() {
            return this.f9842a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f9842a == this.f9842a && dVar.f9843b == this.f9843b;
        }

        public int hashCode() {
            return (this.f9842a << 8) | this.f9843b;
        }

        public String toString() {
            return "pid = " + this.f9842a + ", eid = " + this.f9843b;
        }
    }

    public class e implements Iterator<CMap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f9845b;

        public /* synthetic */ e(j jVar, a aVar) {
            this();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CMap next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            try {
                j jVar = j.this;
                int i = this.f9844a;
                this.f9844a = i + 1;
                return jVar.m(i);
            } catch (IOException e) {
                NoSuchElementException noSuchElementException = new NoSuchElementException("Error during the creation of the CMap.");
                noSuchElementException.initCause(e);
                throw noSuchElementException;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9845b == null) {
                return this.f9844a < j.this.u();
            }
            while (this.f9844a < j.this.u()) {
                if (this.f9845b.a(j.this.q(this.f9844a))) {
                    return true;
                }
                this.f9844a++;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove a CMap table from an existing font.");
        }

        public /* synthetic */ e(j jVar, c cVar, a aVar) {
            this(cVar);
        }

        public e() {
            this.f9844a = 0;
        }

        public e(c cVar) {
            this.f9844a = 0;
            this.f9845b = cVar;
        }
    }

    public enum f {
        version(0),
        numTables(2),
        encodingRecordStart(4),
        encodingRecordPlatformId(0),
        encodingRecordEncodingId(2),
        encodingRecordOffset(4),
        encodingRecordSize(8),
        format(0),
        format0Format(0),
        format0Length(2),
        format0Language(4),
        format0GlyphIdArray(6),
        format2Format(0),
        format2Length(2),
        format2Language(4),
        format2SubHeaderKeys(6),
        format2SubHeaders(SportSummary.VERSION_206),
        format2SubHeader_firstCode(0),
        format2SubHeader_entryCount(2),
        format2SubHeader_idDelta(4),
        format2SubHeader_idRangeOffset(6),
        format2SubHeader_structLength(8),
        format4Format(0),
        format4Length(2),
        format4Language(4),
        format4SegCountX2(6),
        format4SearchRange(8),
        format4EntrySelector(10),
        format4RangeShift(12),
        format4EndCount(14),
        format4FixedSize(16),
        format6Format(0),
        format6Length(2),
        format6Language(4),
        format6FirstCode(6),
        format6EntryCount(8),
        format6GlyphIdArray(10),
        format8Format(0),
        format8Length(4),
        format8Language(8),
        format8Is32(12),
        format8nGroups(8204),
        format8Groups(8208),
        format8Group_startCharCode(0),
        format8Group_endCharCode(4),
        format8Group_startGlyphId(8),
        format8Group_structLength(12),
        format10Format(0),
        format10Length(4),
        format10Language(8),
        format10StartCharCode(12),
        format10NumChars(16),
        format10Glyphs(20),
        format12Format(0),
        format12Length(4),
        format12Language(8),
        format12nGroups(12),
        format12Groups(16),
        format12Groups_structLength(12),
        format12_startCharCode(0),
        format12_endCharCode(4),
        format12_startGlyphId(8),
        format13Format(0),
        format13Length(4),
        format13Language(8),
        format13nGroups(12),
        format13Groups(16),
        format13Groups_structLength(12),
        format13_startCharCode(0),
        format13_endCharCode(4),
        format13_glyphId(8),
        format14Format(0),
        format14Length(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9849a;

        f(int i) {
            this.f9849a = i;
        }
    }

    public /* synthetic */ j(ylb ylbVar, jgj jgjVar, a aVar) {
        this(ylbVar, jgjVar);
    }

    public static int w(int i) {
        return f.encodingRecordStart.f9849a + (i * f.encodingRecordSize.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<CMap> iterator() {
        return new e(this, (a) null);
    }

    public CMap m(int i) throws IOException {
        return b.w(f(), i).a();
    }

    public CMap o(d dVar) {
        Iterator<CMap> itT = t(new a(dVar));
        if (itT.hasNext()) {
            return itT.next();
        }
        return null;
    }

    public d q(int i) {
        return d.c(x(i), r(i));
    }

    public int r(int i) {
        return this.f39611a.v(f.encodingRecordEncodingId.f9849a + w(i));
    }

    public Iterator<CMap> t(c cVar) {
        return new e(this, cVar, null);
    }

    @Override // defpackage.dzo, defpackage.xz9
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" = { ");
        for (int i = 0; i < u(); i++) {
            try {
                CMap cMapM = m(i);
                sb.append("[0x");
                sb.append(Integer.toHexString(v(i)));
                sb.append(" = ");
                sb.append(cMapM);
                if (i < u() - 1) {
                    sb.append("], ");
                } else {
                    sb.append("]");
                }
            } catch (IOException unused) {
            }
        }
        sb.append(" }");
        return sb.toString();
    }

    public int u() {
        return this.f39611a.v(f.numTables.f9849a);
    }

    public int v(int i) {
        return this.f39611a.u(f.encodingRecordOffset.f9849a + w(i));
    }

    public int x(int i) {
        return this.f39611a.v(f.encodingRecordPlatformId.f9849a + w(i));
    }

    public j(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
