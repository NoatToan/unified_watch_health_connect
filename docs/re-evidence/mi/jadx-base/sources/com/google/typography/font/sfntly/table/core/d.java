package com.google.typography.font.sfntly.table.core;

import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends CMap {
    public final int f;

    public static class b extends CMap.b<d> {
        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.u(j.f.format13Length.f9849a + i)), CMap.CMapFormat.Format13, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public d o(jgj jgjVar) {
            return new d(jgjVar, u());
        }
    }

    public final class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9830b;
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
            if (this.f9829a >= d.this.f) {
                return false;
            }
            int i = this.d;
            if (i < this.f9830b) {
                this.d = i + 1;
                this.c = true;
                return true;
            }
            int i2 = this.f9829a + 1;
            this.f9829a = i2;
            if (i2 >= d.this.f) {
                return false;
            }
            this.c = true;
            this.d = d.this.v(this.f9829a);
            this.f9830b = d.this.t(this.f9829a);
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9829a = 0;
            this.c = false;
            this.d = d.this.v(0);
            this.f9830b = d.this.t(this.f9829a);
            this.c = true;
        }
    }

    public d(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format12.value, dVar);
        this.f = this.f39611a.u(j.f.format12nGroups.f9849a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i) {
        return this.f39611a.u(j.f.format13Groups.f9849a + (i * j.f.format13Groups_structLength.f9849a) + j.f.format13_endCharCode.f9849a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v(int i) {
        return this.f39611a.u(j.f.format13Groups.f9849a + (i * j.f.format13Groups_structLength.f9849a) + j.f.format13_startCharCode.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        jgj jgjVar = this.f39611a;
        int i2 = j.f.format13Groups.f9849a;
        int i3 = j.f.format13_startCharCode.f9849a + i2;
        int i4 = j.f.format13Groups_structLength.f9849a;
        int iW = jgjVar.w(i3, i4, j.f.format13_endCharCode.f9849a + i2, i4, this.f, i);
        if (iW == -1) {
            return 0;
        }
        return u(iW);
    }

    public final int u(int i) {
        return this.f39611a.u(j.f.format13Groups.f9849a + (i * j.f.format13Groups_structLength.f9849a) + j.f.format13_glyphId.f9849a);
    }
}
