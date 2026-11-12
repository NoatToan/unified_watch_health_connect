package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class cy6<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610417L;

    public class a implements Iterator<E> {
        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(@NotNull E e) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // java.util.Queue
    @Nullable
    public E element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(@NotNull E e) {
        return false;
    }

    @Override // java.util.Queue
    @Nullable
    public E peek() {
        return null;
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        return null;
    }

    @Override // java.util.Queue
    @NotNull
    public E remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return 0;
    }
}
