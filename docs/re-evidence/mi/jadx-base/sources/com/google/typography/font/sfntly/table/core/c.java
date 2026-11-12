package com.google.typography.font.sfntly.table.core;

import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends CMap {
    public final int f;

    public static class b extends CMap.b<c> {
        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.u(j.f.format12Length.f9849a + i)), CMap.CMapFormat.Format12, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c o(jgj jgjVar) {
            return new c(jgjVar, u());
        }
    }

    /* JADX INFO: renamed from: com.google.typography.font.sfntly.table.core.c$c, reason: collision with other inner class name */
    public final class C0265c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9828b;
        public boolean c;
        public int d;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!this.c && !hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            this.c = false;
            return Integer.valueOf(this.d);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c) {
                return true;
            }
            if (this.f9827a >= c.this.f) {
                return false;
            }
            int i = this.d;
            if (i < this.f9828b) {
                this.d = i + 1;
                this.c = true;
                return true;
            }
            int i2 = this.f9827a + 1;
            this.f9827a = i2;
            if (i2 >= c.this.f) {
                return false;
            }
            this.c = true;
            this.d = c.this.u(this.f9827a);
            this.f9828b = c.this.t(this.f9827a);
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public C0265c() {
            this.f9827a = 0;
            this.c = false;
            this.d = c.this.u(0);
            this.f9828b = c.this.t(this.f9827a);
            this.c = true;
        }
    }

    public c(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format12.value, dVar);
        this.f = this.f39611a.u(j.f.format12nGroups.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new C0265c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        jgj jgjVar = this.f39611a;
        int i2 = j.f.format12Groups.f9849a;
        int i3 = j.f.format12_startCharCode.f9849a + i2;
        int i4 = j.f.format12Groups_structLength.f9849a;
        int iW = jgjVar.w(i3, i4, j.f.format12_endCharCode.f9849a + i2, i4, this.f, i);
        if (iW == -1) {
            return 0;
        }
        return v(iW) + (i - u(iW));
    }

    public final int t(int i) {
        return this.f39611a.u(j.f.format12Groups.f9849a + (i * j.f.format12Groups_structLength.f9849a) + j.f.format12_endCharCode.f9849a);
    }

    public final int u(int i) {
        return this.f39611a.u(j.f.format12Groups.f9849a + (i * j.f.format12Groups_structLength.f9849a) + j.f.format12_startCharCode.f9849a);
    }

    public final int v(int i) {
        return this.f39611a.u(j.f.format12Groups.f9849a + (i * j.f.format12Groups_structLength.f9849a) + j.f.format12_startGlyphId.f9849a);
    }
}
