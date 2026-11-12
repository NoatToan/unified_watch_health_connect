package com.google.typography.font.sfntly.table.core;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import defpackage.yz9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends CMap {
    public final int f;
    public final int g;

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9835b;
        public int c;
        public int d;
        public boolean e;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!this.e && !hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            this.e = false;
            return Integer.valueOf(this.d);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.e) {
                return true;
            }
            while (this.f9834a < g.this.f) {
                if (this.f9835b < 0) {
                    this.f9835b = g.this.E(this.f9834a);
                    this.c = g.this.q(this.f9834a);
                    this.d = this.f9835b;
                    this.e = true;
                    return true;
                }
                int i = this.d;
                if (i < this.c) {
                    this.d = i + 1;
                    this.e = true;
                    return true;
                }
                this.f9834a++;
                this.f9835b = -1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9834a = 0;
            this.f9835b = -1;
        }
    }

    public g(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format4.value, dVar);
        int iV = this.f39611a.v(j.f.format4SegCountX2.f9849a) / 2;
        this.f = iV;
        this.g = t(iV);
    }

    public static int A(int i) {
        return j.f.format4EndCount.f9849a + (((i * 2) + 1) * FontData.DataSize.USHORT.size()) + (i * FontData.DataSize.SHORT.size());
    }

    public static int F(jgj jgjVar, int i, int i2) {
        return jgjVar.v(G(i) + (i2 * FontData.DataSize.USHORT.size()));
    }

    public static int G(int i) {
        int i2 = j.f.format4EndCount.f9849a;
        FontData.DataSize dataSize = FontData.DataSize.USHORT;
        return i2 + dataSize.size() + (i * dataSize.size());
    }

    public static int r(jgj jgjVar, int i, int i2) {
        return jgjVar.v(j.f.format4EndCount.f9849a + (i2 * FontData.DataSize.USHORT.size()));
    }

    public static int t(int i) {
        return j.f.format4EndCount.f9849a + (((i * 3) + 1) * FontData.DataSize.USHORT.size()) + (i * FontData.DataSize.SHORT.size());
    }

    public static int v(jgj jgjVar, int i, int i2) {
        return jgjVar.r(w(i) + (i2 * FontData.DataSize.SHORT.size()));
    }

    public static int w(int i) {
        return j.f.format4EndCount.f9849a + (((i * 2) + 1) * FontData.DataSize.USHORT.size());
    }

    public final void B(int i) {
        if (i < 0 || i >= this.f) {
            throw new IllegalArgumentException();
        }
    }

    public int C(int i, int i2, int i3) {
        if (i3 < i2) {
            return 0;
        }
        int iX = x(i);
        if (iX == 0) {
            return (i3 + u(i)) % 65536;
        }
        int iV = this.f39611a.v(iX + z(i) + ((i3 - i2) * 2));
        return iV != 0 ? (iV + u(i)) % 65536 : iV;
    }

    public int E(int i) {
        B(i);
        return F(this.f39611a, this.f, i);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        jgj jgjVar = this.f39611a;
        int iG = G(this.f);
        FontData.DataSize dataSize = FontData.DataSize.USHORT;
        int iX = jgjVar.x(iG, dataSize.size(), j.f.format4EndCount.f9849a, dataSize.size(), this.f, i);
        if (iX == -1) {
            return 0;
        }
        return C(iX, E(iX), i);
    }

    public int q(int i) {
        B(i);
        return r(this.f39611a, this.f, i);
    }

    public int u(int i) {
        B(i);
        return v(this.f39611a, this.f, i);
    }

    public int x(int i) {
        B(i);
        return this.f39611a.v(z(i));
    }

    public int z(int i) {
        B(i);
        return A(this.f) + (i * FontData.DataSize.USHORT.size());
    }

    public static class b extends CMap.b<g> {
        public List<a> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Integer> f9831k;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f9833b;
            public int c;
            public int d;

            public a() {
            }

            public static List<a> a(List<a> list) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new a(it.next()));
                }
                return arrayList;
            }

            public int b() {
                return this.f9833b;
            }

            public int c() {
                return this.c;
            }

            public int d() {
                return this.d;
            }

            public int e() {
                return this.f9832a;
            }

            public String toString() {
                return String.format("[0x%04x - 0x%04x, delta = 0x%04x, rangeOffset = 0x%04x]", Integer.valueOf(this.f9832a), Integer.valueOf(this.f9833b), Integer.valueOf(this.c), Integer.valueOf(this.d));
            }

            public a(a aVar) {
                this(aVar.f9832a, aVar.f9833b, aVar.c, aVar.d);
            }

            public a(int i, int i2, int i3, int i4) {
                this.f9832a = i;
                this.f9833b = i2;
                this.c = i3;
                this.d = i4;
            }
        }

        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.v(j.f.format4Length.f9849a + i)), CMap.CMapFormat.Format4, dVar);
        }

        public void B(List<Integer> list) {
            this.f9831k = new ArrayList(list);
            m();
        }

        public void C(List<a> list) {
            this.j = a.a(list);
            m();
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public g o(jgj jgjVar) {
            return new g(jgjVar, u());
        }

        @Override // com.google.typography.font.sfntly.table.core.CMap.b, xz9.a
        public void p() {
            this.j = null;
            this.f9831k = null;
            super.n(false);
        }

        @Override // com.google.typography.font.sfntly.table.core.CMap.b, xz9.a
        public int q() {
            if (!j()) {
                return super.q();
            }
            int i = j.f.format4FixedSize.f9849a;
            int size = this.j.size();
            FontData.DataSize dataSize = FontData.DataSize.USHORT;
            return i + (size * ((dataSize.size() * 3) + FontData.DataSize.SHORT.size())) + (this.f9831k.size() * dataSize.size());
        }

        @Override // com.google.typography.font.sfntly.table.core.CMap.b, xz9.a
        public boolean r() {
            if (j()) {
                return this.j != null;
            }
            return super.r();
        }

        @Override // com.google.typography.font.sfntly.table.core.CMap.b, xz9.a
        public int s(apr aprVar) {
            if (!j()) {
                return super.s(aprVar);
            }
            int iQ = aprVar.Q(0, CMap.CMapFormat.Format4.value()) + FontData.DataSize.USHORT.size();
            int iQ2 = iQ + aprVar.Q(iQ, z());
            int size = this.j.size();
            int i = size * 2;
            int iQ3 = iQ2 + aprVar.Q(iQ2, i);
            int iA = yz9.a(this.j.size());
            int i2 = 1 << (iA + 1);
            int iQ4 = iQ3 + aprVar.Q(iQ3, i2);
            int iQ5 = iQ4 + aprVar.Q(iQ4, iA);
            int iQ6 = iQ5 + aprVar.Q(iQ5, i - i2);
            for (int i3 = 0; i3 < size; i3++) {
                iQ6 += aprVar.Q(iQ6, this.j.get(i3).b());
            }
            int size2 = iQ6 + FontData.DataSize.USHORT.size();
            for (int i4 = 0; i4 < size; i4++) {
                size2 += aprVar.Q(size2, this.j.get(i4).e());
            }
            for (int i5 = 0; i5 < size; i5++) {
                size2 += aprVar.N(size2, this.j.get(i5).c());
            }
            for (int i6 = 0; i6 < size; i6++) {
                size2 += aprVar.Q(size2, this.j.get(i6).d());
            }
            for (int i7 = 0; i7 < this.f9831k.size(); i7++) {
                size2 += aprVar.Q(size2, this.f9831k.get(i7).intValue());
            }
            aprVar.Q(j.f.format4Length.f9849a, size2);
            return size2;
        }

        public b(apr aprVar, int i, j.d dVar) {
            super(aprVar == null ? null : aprVar.A(i, aprVar.v(j.f.format4Length.f9849a + i)), CMap.CMapFormat.Format4, dVar);
        }
    }
}
