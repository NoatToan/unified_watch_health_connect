package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import defpackage.amv;
import java.lang.Comparable;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
@ElementTypesAreNonnullByDefault
public interface RangeSet<C extends Comparable> {
    void add(amv<C> amvVar);

    void addAll(RangeSet<C> rangeSet);

    void addAll(Iterable<amv<C>> iterable);

    Set<amv<C>> asDescendingSetOfRanges();

    Set<amv<C>> asRanges();

    void clear();

    RangeSet<C> complement();

    boolean contains(C c2);

    boolean encloses(amv<C> amvVar);

    boolean enclosesAll(RangeSet<C> rangeSet);

    boolean enclosesAll(Iterable<amv<C>> iterable);

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    boolean intersects(amv<C> amvVar);

    boolean isEmpty();

    @CheckForNull
    amv<C> rangeContaining(C c2);

    void remove(amv<C> amvVar);

    void removeAll(RangeSet<C> rangeSet);

    void removeAll(Iterable<amv<C>> iterable);

    amv<C> span();

    RangeSet<C> subRangeSet(amv<C> amvVar);

    String toString();
}
