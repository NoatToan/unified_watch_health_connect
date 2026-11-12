package u3;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface e<E> extends b<E>, Collection, f23.a {
    @Override // java.util.Set, java.util.Collection
    x3.b add(Object obj);

    @Override // java.util.Set, java.util.Collection
    e<E> addAll(Collection<? extends E> collection);

    x3.c builder();

    @Override // java.util.Set, java.util.Collection
    x3.b remove(Object obj);

    @Override // java.util.Set, java.util.Collection
    e<E> removeAll(Collection<? extends E> collection);
}
