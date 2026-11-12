package w43;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements Iterable<T>, f23.a {
    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract int a();

    public abstract void b(int i14, T t7);

    public abstract T get(int i14);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private c() {
    }
}
