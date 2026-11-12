package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class amo extends Ordering<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final amo f558b = new amo();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient Ordering<Comparable<?>> f559a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient Ordering<Comparable<?>> f560c;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsFirst() {
        Ordering<S> ordering = (Ordering<S>) this.f560c;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingNullsFirst = super.nullsFirst();
        this.f560c = orderingNullsFirst;
        return orderingNullsFirst;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsLast() {
        Ordering<S> ordering = (Ordering<S>) this.f559a;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingNullsLast = super.nullsLast();
        this.f559a = orderingNullsLast;
        return orderingNullsLast;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return anf.d;
    }

    private Object readResolve() {
        return f558b;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private amo() {
    }
}
