package com.google.typography.font.sfntly.table.opentype.component;

import defpackage.w4i;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public class GlyphGroup extends BitSet implements Iterable<Integer> {
    private static final long serialVersionUID = 1;
    private boolean inverse = false;

    public class a implements Iterator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9850a = 0;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            int iNextSetBit = GlyphGroup.this.nextSetBit(this.f9850a);
            this.f9850a = iNextSetBit + 1;
            return Integer.valueOf(iNextSetBit);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return GlyphGroup.this.nextSetBit(this.f9850a) >= 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public GlyphGroup() {
    }

    public static GlyphGroup inverseGlyphGroup(Collection<GlyphGroup> collection) {
        GlyphGroup glyphGroup = new GlyphGroup();
        Iterator<GlyphGroup> it = collection.iterator();
        while (it.hasNext()) {
            glyphGroup.or(it.next());
        }
        glyphGroup.inverse = true;
        return glyphGroup;
    }

    public void add(int i) {
        set(i);
    }

    public void addAll(Collection<Integer> collection) {
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            super.set(it.next().intValue());
        }
    }

    public boolean contains(int i) {
        return get(i) ^ this.inverse;
    }

    public void copyTo(Collection<Integer> collection) {
        new LinkedList();
        int i = 0;
        while (true) {
            int iNextSetBit = nextSetBit(i);
            if (iNextSetBit < 0) {
                return;
            }
            collection.add(Integer.valueOf(iNextSetBit));
            i = iNextSetBit + 1;
        }
    }

    public GlyphGroup intersection(GlyphGroup glyphGroup) {
        GlyphGroup glyphGroup2 = new GlyphGroup();
        boolean z = this.inverse;
        if (!z || glyphGroup.inverse) {
            boolean z2 = glyphGroup.inverse;
            if (z2 && !z) {
                glyphGroup2.or(this);
                glyphGroup2.andNot(glyphGroup);
            } else if (z2 && z) {
                glyphGroup2.inverse = true;
                glyphGroup2.or(this);
                glyphGroup2.or(glyphGroup);
            } else {
                glyphGroup2.or(this);
                glyphGroup2.and(glyphGroup);
            }
        } else {
            glyphGroup2.or(glyphGroup);
            glyphGroup2.andNot(this);
        }
        return glyphGroup2;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new a();
    }

    @Override // java.util.BitSet
    public int size() {
        return cardinality();
    }

    @Override // java.util.BitSet
    public String toString() {
        return toString(null);
    }

    public String toString(w4i w4iVar) {
        String strM;
        StringBuilder sb = new StringBuilder();
        if (this.inverse) {
            sb.append("not-");
        }
        int size = size();
        if (size > 1) {
            sb.append("[ ");
        }
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            sb.append(iIntValue);
            if (w4iVar != null && (strM = w4iVar.m(iIntValue)) != null) {
                sb.append("-");
                sb.append(strM);
            }
            sb.append(" ");
        }
        if (size > 1) {
            sb.append("] ");
        }
        return sb.toString();
    }

    public GlyphGroup(int i) {
        super.set(i);
    }

    public void addAll(GlyphGroup glyphGroup) {
        or(glyphGroup);
    }

    public GlyphGroup(Collection<Integer> collection) {
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            super.set(it.next().intValue());
        }
    }
}
