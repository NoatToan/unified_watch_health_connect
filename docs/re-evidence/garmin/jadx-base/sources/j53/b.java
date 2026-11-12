package j53;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj53/b;", "E", "Li53/f;", "Lp13/c;", "<init>", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<E> extends p13.c<E> implements i53.f<E> {
    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p13.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // p13.c, java.util.List, i53.c
    public final i53.c.a subList(int i14, int i15) {
        return new i53.c.a(this, 0, i15);
    }

    @Override // p13.c, java.util.List, i53.c
    public final List subList(int i14, int i15) {
        return new i53.c.a(this, i14, i15);
    }
}
