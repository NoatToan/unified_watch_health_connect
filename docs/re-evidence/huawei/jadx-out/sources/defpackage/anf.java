package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class anf extends Ordering<Comparable<?>> implements Serializable {
    static final anf d = new anf();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return Ordering.natural();
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E min(E e, E e2) {
        return (E) amo.f558b.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E min(E e, E e2, E e3, E... eArr) {
        return (E) amo.f558b.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) amo.f558b.max(it);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) amo.f558b.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E max(E e, E e2) {
        return (E) amo.f558b.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E max(E e, E e2, E e3, E... eArr) {
        return (E) amo.f558b.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) amo.f558b.min(it);
    }

    @Override // com.google.common.collect.Ordering
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) amo.f558b.min(iterable);
    }

    private Object readResolve() {
        return d;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private anf() {
    }
}
