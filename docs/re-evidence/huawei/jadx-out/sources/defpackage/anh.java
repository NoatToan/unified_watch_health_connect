package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class anh<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Ordering<? super T> f601c;

    public anh(Ordering<? super T> ordering) {
        this.f601c = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f601c.compare(t2, t);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f601c;
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2) {
        return (E) this.f601c.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        return (E) this.f601c.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.f601c.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.f601c.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2) {
        return (E) this.f601c.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        return (E) this.f601c.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.f601c.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.f601c.min(iterable);
    }

    public int hashCode() {
        return -this.f601c.hashCode();
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anh) {
            return this.f601c.equals(((anh) obj).f601c);
        }
        return false;
    }

    public String toString() {
        return this.f601c + ".reverse()";
    }
}
