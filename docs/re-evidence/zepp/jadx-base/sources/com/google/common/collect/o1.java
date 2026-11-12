package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class o1<T> extends Ordering<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<? super T> c;

    public o1(Comparator<? super T> comparator) {
        this.c = comparator;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it2 = iterable.iterator();
        Iterator<T> it3 = iterable2.iterator();
        while (it2.hasNext()) {
            if (!it3.hasNext()) {
                return 1;
            }
            int iCompare = this.c.compare(it2.next(), it3.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it3.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            return this.c.equals(((o1) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.c + ".lexicographical()";
    }
}
