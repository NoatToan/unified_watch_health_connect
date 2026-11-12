package com.google.common.collect;

import defpackage.amv;
import java.lang.Comparable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    @Override // com.google.common.collect.RangeSet
    public abstract boolean encloses(amv<C> amvVar);

    @Override // com.google.common.collect.RangeSet
    @CheckForNull
    public abstract amv<C> rangeContaining(C c2);

    @Override // com.google.common.collect.RangeSet
    public boolean contains(C c2) {
        return rangeContaining(c2) != null;
    }

    @Override // com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // com.google.common.collect.RangeSet
    public void add(amv<C> amvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public void remove(amv<C> amvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public void clear() {
        remove(amv.d());
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(RangeSet<C> rangeSet) {
        return enclosesAll(rangeSet.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(Iterable<amv<C>> iterable) {
        Iterator<amv<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(RangeSet<C> rangeSet) {
        addAll(rangeSet.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(Iterable<amv<C>> iterable) {
        Iterator<amv<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(RangeSet<C> rangeSet) {
        removeAll(rangeSet.asRanges());
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(Iterable<amv<C>> iterable) {
        Iterator<amv<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public boolean intersects(amv<C> amvVar) {
        return !subRangeSet(amvVar).isEmpty();
    }

    @Override // com.google.common.collect.RangeSet
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return asRanges().equals(((RangeSet) obj).asRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeSet
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeSet
    public final String toString() {
        return asRanges().toString();
    }
}
