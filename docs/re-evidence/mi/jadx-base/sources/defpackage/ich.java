package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.s;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ich<T> implements Comparator<T> {
    public static <T> ich<T> a(Comparator<T> comparator) {
        return comparator instanceof ich ? (ich) comparator : new o94(comparator);
    }

    public static <C extends Comparable> ich<C> e() {
        return big.f4251a;
    }

    public <E extends T> ImmutableList<E> b(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E c(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E d(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <T2 extends T> ich<Map.Entry<T2, ?>> f() {
        return (ich<Map.Entry<T2, ?>>) g(s.k());
    }

    public <F> ich<F> g(dua<F, ? extends T> duaVar) {
        return new q63(duaVar, this);
    }

    public <S extends T> ich<S> h() {
        return new xtk(this);
    }
}
