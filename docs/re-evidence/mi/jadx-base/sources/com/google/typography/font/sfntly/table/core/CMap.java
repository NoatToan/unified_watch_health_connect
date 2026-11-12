package com.google.typography.font.sfntly.table.core;

import defpackage.apr;
import defpackage.jgj;
import defpackage.nno;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CMap extends nno implements Iterable<Integer> {
    public final int d;
    public final j.d e;

    public enum CMapFormat {
        Format0(0),
        Format2(2),
        Format4(4),
        Format6(6),
        Format8(8),
        Format10(10),
        Format12(12),
        Format13(13),
        Format14(14);

        final int value;

        CMapFormat(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static CMapFormat valueOf(int i) {
            for (CMapFormat cMapFormat : values()) {
                if (cMapFormat.equals(i)) {
                    return cMapFormat;
                }
            }
            return null;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9804a;

        static {
            int[] iArr = new int[CMapFormat.values().length];
            f9804a = iArr;
            try {
                iArr[CMapFormat.Format0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9804a[CMapFormat.Format2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9804a[CMapFormat.Format4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9804a[CMapFormat.Format6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9804a[CMapFormat.Format8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9804a[CMapFormat.Format10.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9804a[CMapFormat.Format12.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9804a[CMapFormat.Format13.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9804a[CMapFormat.Format14.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class c implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9806b;

        public c(int i, int i2) {
            this.f9805a = i;
            this.f9806b = i2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more characters to iterate.");
            }
            int i = this.f9805a;
            this.f9805a = i + 1;
            return Integer.valueOf(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9805a < this.f9806b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Unable to remove a character from cmap.");
        }
    }

    public CMap(jgj jgjVar, int i, j.d dVar) {
        super(jgjVar);
        this.d = i;
        this.e = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CMap) {
            return this.e.equals(((CMap) obj).e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public j.d k() {
        return this.e;
    }

    public int l() {
        return this.d;
    }

    public abstract int m(int i);

    @Override // defpackage.xz9
    public String toString() {
        return "cmap: " + k() + ", " + CMapFormat.valueOf(l()) + ", Data Size=0x" + Integer.toHexString(this.f39611a.e());
    }

    public static abstract class b<T extends CMap> extends nno.a<T> {
        public final CMapFormat g;
        public final j.d h;
        public int i;

        public b(jgj jgjVar, CMapFormat cMapFormat, j.d dVar) {
            super(jgjVar);
            this.g = cMapFormat;
            this.h = dVar;
        }

        public static b<? extends CMap> x(jgj jgjVar, int i, j.d dVar) {
            switch (a.f9804a[CMapFormat.valueOf(jgjVar.v(i)).ordinal()]) {
                case 1:
                    return new com.google.typography.font.sfntly.table.core.a.b(jgjVar, i, dVar);
                case 2:
                    return new f.a(jgjVar, i, dVar);
                case 3:
                    return new g.b(jgjVar, i, dVar);
                case 4:
                    return new h.b(jgjVar, i, dVar);
                case 5:
                    return new i.b(jgjVar, i, dVar);
                case 6:
                    return new com.google.typography.font.sfntly.table.core.b.C0264b(jgjVar, i, dVar);
                case 7:
                    return new com.google.typography.font.sfntly.table.core.c.b(jgjVar, i, dVar);
                case 8:
                    return new d.b(jgjVar, i, dVar);
                case 9:
                    return new e.a(jgjVar, i, dVar);
                default:
                    return null;
            }
        }

        public static b<? extends CMap> y(CMapFormat cMapFormat, j.d dVar) {
            int i = a.f9804a[cMapFormat.ordinal()];
            if (i == 1) {
                return new com.google.typography.font.sfntly.table.core.a.b((apr) null, 0, dVar);
            }
            if (i != 3) {
                return null;
            }
            return new g.b((apr) null, 0, dVar);
        }

        public int A() {
            return u().d();
        }

        @Override // xz9.a
        public void p() {
        }

        @Override // xz9.a
        public int q() {
            return g().e();
        }

        @Override // xz9.a
        public boolean r() {
            return true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            return g().j(aprVar);
        }

        public String toString() {
            return String.format("%s, format = %s", u(), w());
        }

        public j.d u() {
            return this.h;
        }

        public int v() {
            return u().b();
        }

        public CMapFormat w() {
            return this.g;
        }

        public int z() {
            return this.i;
        }

        public b(apr aprVar, CMapFormat cMapFormat, j.d dVar) {
            super(aprVar);
            this.g = cMapFormat;
            this.h = dVar;
        }
    }
}
