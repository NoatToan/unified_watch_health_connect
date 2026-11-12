package u3;

import f4.r;
import java.util.Collection;
import v3.f;

/* JADX INFO: loaded from: classes.dex */
public interface c<E> extends a<E>, Collection, f23.a {
    c Z(r rVar);

    @Override // java.util.List
    c<E> add(int i14, E e4);

    @Override // java.util.List, java.util.Collection
    c<E> add(E e4);

    @Override // java.util.List, java.util.Collection
    c<E> addAll(Collection<? extends E> collection);

    f builder();

    c<E> r3(int i14);

    @Override // java.util.List, java.util.Collection
    c<E> remove(E e4);

    @Override // java.util.List, java.util.Collection
    c<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    c<E> set(int i14, E e4);
}
