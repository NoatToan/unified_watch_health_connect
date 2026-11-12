package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class tw3<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public transient E[] f35119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f35120b = 0;
    public transient int c = 0;
    public transient boolean d = false;
    public final int e;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35122b = -1;
        public boolean c;

        public a() {
            this.f35121a = tw3.this.f35120b;
            this.c = tw3.this.d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c || this.f35121a != tw3.this.c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.c = false;
            int i = this.f35121a;
            this.f35122b = i;
            this.f35121a = tw3.this.r(i);
            return (E) tw3.this.f35119a[this.f35122b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f35122b;
            if (i == -1) {
                throw new IllegalStateException();
            }
            if (i == tw3.this.f35120b) {
                tw3.this.remove();
                this.f35122b = -1;
                return;
            }
            int iR = this.f35122b + 1;
            if (tw3.this.f35120b >= this.f35122b || iR >= tw3.this.c) {
                while (iR != tw3.this.c) {
                    if (iR >= tw3.this.e) {
                        tw3.this.f35119a[iR - 1] = tw3.this.f35119a[0];
                        iR = 0;
                    } else {
                        tw3.this.f35119a[tw3.this.q(iR)] = tw3.this.f35119a[iR];
                        iR = tw3.this.r(iR);
                    }
                }
            } else {
                System.arraycopy(tw3.this.f35119a, iR, tw3.this.f35119a, this.f35122b, tw3.this.c - iR);
            }
            this.f35122b = -1;
            tw3 tw3Var = tw3.this;
            tw3Var.c = tw3Var.q(tw3Var.c);
            tw3.this.f35119a[tw3.this.c] = null;
            tw3.this.d = false;
            this.f35121a = tw3.this.q(this.f35121a);
        }
    }

    public tw3(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i];
        this.f35119a = eArr;
        this.e = eArr.length;
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f35119a = (E[]) new Object[this.e];
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            ((E[]) this.f35119a)[i2] = objectInputStream.readObject();
        }
        this.f35120b = 0;
        boolean z = i == this.e;
        this.d = z;
        if (z) {
            this.c = 0;
        } else {
            this.c = i;
        }
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(@NotNull E e) {
        if (e == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (t()) {
            remove();
        }
        E[] eArr = this.f35119a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        eArr[i] = e;
        if (i2 >= this.e) {
            this.c = 0;
        }
        if (this.c == this.f35120b) {
            this.d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.d = false;
        this.f35120b = 0;
        this.c = 0;
        Arrays.fill(this.f35119a, (Object) null);
    }

    @Override // java.util.Queue
    @Nullable
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(@NotNull E e) {
        return add(e);
    }

    @Override // java.util.Queue
    @Nullable
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f35119a[this.f35120b];
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public final int q(int i) {
        int i2 = i - 1;
        return i2 < 0 ? this.e - 1 : i2;
    }

    public final int r(int i) {
        int i2 = i + 1;
        if (i2 >= this.e) {
            return 0;
        }
        return i2;
    }

    @Override // java.util.Queue
    @NotNull
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f35119a;
        int i = this.f35120b;
        E e = eArr[i];
        if (e != null) {
            int i2 = i + 1;
            this.f35120b = i2;
            eArr[i] = null;
            if (i2 >= this.e) {
                this.f35120b = 0;
            }
            this.d = false;
        }
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i = this.c;
        int i2 = this.f35120b;
        if (i < i2) {
            return (this.e - i2) + i;
        }
        if (i == i2) {
            return this.d ? this.e : 0;
        }
        return i - i2;
    }

    public boolean t() {
        return size() == this.e;
    }
}
