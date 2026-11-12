package com.google.typography.font.sfntly.table.core;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends CMap {
    public final int f;
    public final int g;

    public static class b extends CMap.b<h> {
        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.v(j.f.format6Length.f9849a + i)), CMap.CMapFormat.Format6, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public h o(jgj jgjVar) {
            return new h(jgjVar, u());
        }
    }

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9836a;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            int i = this.f9836a;
            this.f9836a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9836a < h.this.f + h.this.g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9836a = h.this.f;
        }
    }

    public h(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format6.value, dVar);
        this.f = this.f39611a.v(j.f.format6FirstCode.f9849a);
        this.g = this.f39611a.v(j.f.format6EntryCount.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        int i2 = this.f;
        if (i < i2 || i >= this.g + i2) {
            return 0;
        }
        return this.f39611a.v(j.f.format6GlyphIdArray.f9849a + ((i - i2) * FontData.DataSize.USHORT.size()));
    }
}
