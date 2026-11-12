package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ajx extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ajx f493c = new ajx();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public <S> Ordering<S> reverse() {
        return this;
    }

    ajx() {
    }

    @Override // com.google.common.collect.Ordering
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return aml.a(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.copyOf(iterable);
    }

    private Object readResolve() {
        return f493c;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
