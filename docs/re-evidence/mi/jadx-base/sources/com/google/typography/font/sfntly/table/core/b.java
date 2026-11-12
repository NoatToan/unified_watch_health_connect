package com.google.typography.font.sfntly.table.core;

import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends CMap {
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: com.google.typography.font.sfntly.table.core.b$b, reason: collision with other inner class name */
    public static class C0264b extends CMap.b<b> {
        public C0264b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.u(j.f.format10Length.f9849a + i)), CMap.CMapFormat.Format10, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(jgj jgjVar) {
            return new b(jgjVar, u());
        }
    }

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9825a;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            int i = this.f9825a;
            this.f9825a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9825a < b.this.f + b.this.g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9825a = b.this.f;
        }
    }

    public b(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format10.value, dVar);
        this.f = this.f39611a.u(j.f.format10StartCharCode.f9849a);
        this.g = this.f39611a.v(j.f.format10NumChars.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        int i2 = this.f;
        if (i < i2 || i >= i2 + this.g) {
            return 0;
        }
        return f().v(i - this.f);
    }
}
