package j53;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj53/a;", "E", "", "", FirebaseAnalytics.Param.INDEX, "size", "<init>", "(II)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<E> implements ListIterator<E>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97111b;

    public a(int i14, int i15) {
        this.f97110a = i14;
        this.f97111b = i15;
    }

    @Override // java.util.ListIterator
    public void add(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f97110a < this.f97111b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f97110a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f97110a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f97110a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
