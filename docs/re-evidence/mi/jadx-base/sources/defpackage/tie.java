package defpackage;

import com.google.typography.font.sfntly.data.FontData;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tie extends dzo {
    public FontHeaderTable.IndexToLocFormat c;
    public int d;

    public static class b extends dzo.a<tie> {
        public FontHeaderTable.IndexToLocFormat g;
        public int h;
        public List<Integer> i;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.g = FontHeaderTable.IndexToLocFormat.longOffset;
            this.h = -1;
        }

        public static b x(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        private void y(jgj jgjVar) {
            w(false);
            if (this.i == null) {
                this.i = new ArrayList();
            }
            if (jgjVar != null) {
                if (this.h < 0) {
                    throw new IllegalStateException("numglyphs not set on LocaTable Builder.");
                }
                Iterator<Integer> it = new tie(u(), jgjVar, this.g, this.h).iterator();
                while (it.hasNext()) {
                    this.i.add(it.next());
                }
            }
        }

        private int z() {
            List<Integer> list = this.i;
            return list != null ? list.size() - 2 : this.h - 1;
        }

        public int A() {
            return z() + 1;
        }

        public void B(FontHeaderTable.IndexToLocFormat indexToLocFormat) {
            this.g = indexToLocFormat;
        }

        public void C(List<Integer> list) {
            this.i = list;
            m();
        }

        public void D(int i) {
            this.h = i;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public tie o(jgj jgjVar) {
            return new tie(u(), jgjVar, this.g, this.h);
        }

        @Override // xz9.a
        public void p() {
            y(g());
        }

        @Override // xz9.a
        public int q() {
            int size;
            int size2;
            List<Integer> list = this.i;
            if (list == null) {
                return 0;
            }
            if (this.g == FontHeaderTable.IndexToLocFormat.longOffset) {
                size = list.size();
                size2 = FontData.DataSize.ULONG.size();
            } else {
                size = list.size();
                size2 = FontData.DataSize.USHORT.size();
            }
            return size * size2;
        }

        @Override // xz9.a
        public boolean r() {
            return this.i != null;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            Iterator<Integer> it = this.i.iterator();
            int iO = 0;
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                iO += this.g == FontHeaderTable.IndexToLocFormat.longOffset ? aprVar.O(iO, iIntValue) : aprVar.Q(iO, iIntValue / 2);
            }
            this.h = this.i.size() - 1;
            return iO;
        }

        public final void w(boolean z) {
            List<Integer> list = this.i;
            if (list != null) {
                list.clear();
            }
            if (z) {
                this.i = null;
            }
            n(false);
        }
    }

    public final class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34739a;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            tie tieVar = tie.this;
            int i = this.f34739a;
            this.f34739a = i + 1;
            return Integer.valueOf(tieVar.q(i));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34739a <= tie.this.d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c() {
        }
    }

    public Iterator<Integer> iterator() {
        return new c();
    }

    public int m(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException("Glyph ID is out of bounds.");
        }
        return q(i + 1) - q(i);
    }

    public int o(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException("Glyph ID is out of bounds.");
        }
        return q(i);
    }

    public int q(int i) {
        if (i <= this.d) {
            return this.c == FontHeaderTable.IndexToLocFormat.shortOffset ? this.f39611a.v(i * FontData.DataSize.USHORT.size()) * 2 : this.f39611a.u(i * FontData.DataSize.ULONG.size());
        }
        throw new IndexOutOfBoundsException();
    }

    public int r() {
        return this.d;
    }

    public tie(ylb ylbVar, jgj jgjVar, FontHeaderTable.IndexToLocFormat indexToLocFormat, int i) {
        super(ylbVar, jgjVar);
        this.c = indexToLocFormat;
        this.d = i;
    }
}
