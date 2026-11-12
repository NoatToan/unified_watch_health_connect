package n63;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0007B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ln63/c;", "Ln63/i;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/util/List;)V", "Companion", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = d.class)
public final class c extends i implements List<i>, f23.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f123896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends i> list) {
        super(null);
        list.getClass();
        this.f123896a = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i14, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f123896a.contains((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.f123896a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return p005kotlin.jvm.internal.s.g(this.f123896a, obj);
    }

    @Override // java.util.List
    public final i get(int i14) {
        return this.f123896a.get(i14);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f123896a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return this.f123896a.indexOf((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f123896a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f123896a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return this.f123896a.lastIndexOf((i) obj);
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator() {
        return this.f123896a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i remove(int i14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<i> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i set(int i14, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f123896a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super i> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<i> subList(int i14, int i15) {
        return this.f123896a.subList(i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return h0.k0(this.f123896a, ",", "[", "]", null, 56);
    }

    /* JADX INFO: renamed from: n63.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln63/c$a;", "", "<init>", "()V", "Li63/c;", "Ln63/c;", "serializer", "()Li63/c;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<c> serializer() {
            return d.f123897a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator(int i14) {
        return this.f123896a.listIterator(i14);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
