package com.google.typography.font.sfntly.table.core;

import defpackage.jgj;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends CMap {
    public final int f;

    public static class b extends CMap.b<i> {
        public b(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.u(j.f.format8Length.f9849a + i)), CMap.CMapFormat.Format8, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public i o(jgj jgjVar) {
            return new i(jgjVar, u());
        }
    }

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9839b;
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
            while (this.f9838a < i.this.f) {
                if (this.f9839b < 0) {
                    this.f9839b = i.this.u(this.f9838a);
                    this.c = i.this.t(this.f9838a);
                    this.d = this.f9839b;
                    this.e = true;
                    return true;
                }
                int i = this.d;
                if (i < this.c) {
                    this.d = i + 1;
                    this.e = true;
                    return true;
                }
                this.f9838a++;
                this.f9839b = -1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }

        public c() {
            this.f9838a = 0;
            this.f9839b = -1;
        }
    }

    public i(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format8.value, dVar);
        this.f = this.f39611a.u(j.f.format8nGroups.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new c();
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        jgj jgjVarF = f();
        int i2 = j.f.format8Groups.f9849a;
        int i3 = j.f.format8Group_startCharCode.f9849a + i2;
        int i4 = j.f.format8Group_structLength.f9849a;
        return jgjVarF.w(i3, i4, j.f.format8Group_endCharCode.f9849a + i2, i4, this.f, i);
    }

    public final int t(int i) {
        return f().u(j.f.format8Groups.f9849a + (i * j.f.format8Group_structLength.f9849a) + j.f.format8Group_endCharCode.f9849a);
    }

    public final int u(int i) {
        return f().u(j.f.format8Groups.f9849a + (i * j.f.format8Group_structLength.f9849a) + j.f.format8Group_startCharCode.f9849a);
    }
}
