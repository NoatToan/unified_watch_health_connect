package defpackage;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface sbj<C extends Comparable> {
    Set<Range<C>> asRanges();

    sbj<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(sbj<C> sbjVar);

    sbj<C> subRangeSet(Range<C> range);
}
