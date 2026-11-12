package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class a0<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<? super T>[] c;

    public a0(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.c = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.c;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return Arrays.equals(this.c, ((a0) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.c) + ")";
    }

    public a0(Iterable<? extends Comparator<? super T>> iterable) {
        this.c = (Comparator[]) Iterables.g(iterable, new Comparator[0]);
    }
}
