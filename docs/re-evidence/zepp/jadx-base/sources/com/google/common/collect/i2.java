package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class i2 extends Ordering<Comparable> implements Serializable {
    public static final i2 c = new i2();
    private static final long serialVersionUID = 0;

    private i2() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E max(E e, E e2) {
        return (E) r1.e.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E max(E e, E e2, E e3, E... eArr) {
        return (E) r1.e.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E max(Iterable<E> iterable) {
        return (E) r1.e.min(iterable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E max(Iterator<E> it2) {
        return (E) r1.e.min(it2);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E min(E e, E e2) {
        return (E) r1.e.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E min(E e, E e2, E e3, E... eArr) {
        return (E) r1.e.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E min(Iterable<E> iterable) {
        return (E) r1.e.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable> E min(Iterator<E> it2) {
        return (E) r1.e.max(it2);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
