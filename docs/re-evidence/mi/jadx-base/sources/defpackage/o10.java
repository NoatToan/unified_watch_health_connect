package defpackage;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o10<C extends Comparable> implements sbj<C> {
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(sbj<C> sbjVar) {
        addAll(sbjVar.asRanges());
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    @Override // defpackage.sbj
    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(sbj<C> sbjVar) {
        return enclosesAll(sbjVar.asRanges());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbj) {
            return asRanges().equals(((sbj) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    @Override // defpackage.sbj
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public abstract Range<C> rangeContaining(C c);

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sbj
    public void removeAll(sbj<C> sbjVar) {
        removeAll(sbjVar.asRanges());
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void addAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
