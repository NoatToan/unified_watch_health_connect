package com.google.typography.font.sfntly.table.core;

import defpackage.apr;
import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends CMap {

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9823a;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            int i = this.f9823a;
            this.f9823a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9823a <= 255;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9823a = 0;
        }
    }

    public a(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format0.value, dVar);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        if (i < 0 || i > 255) {
            return 0;
        }
        return this.f39611a.s(i + j.f.format0GlyphIdArray.f9849a);
    }

    public static class b extends CMap.b<a> {
        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.v(j.f.format0Length.f9849a + i)), CMap.CMapFormat.Format0, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public a o(jgj jgjVar) {
            return new a(jgjVar, u());
        }

        public b(apr aprVar, int i, j.d dVar) {
            super(aprVar == null ? null : aprVar.A(i, aprVar.v(j.f.format0Length.f9849a + i)), CMap.CMapFormat.Format0, dVar);
        }
    }
}
