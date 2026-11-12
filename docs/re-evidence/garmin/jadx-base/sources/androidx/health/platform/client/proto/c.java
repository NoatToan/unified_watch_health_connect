package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<E> extends AbstractList<E> implements l0.d<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7561a;

    public c(boolean z14) {
        this.f7561a = z14;
    }

    public final void a() {
        if (this.f7561a) {
            return;
        }
        com.google.protobuf.a.m();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        a();
        return super.add(e4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i14 = 0; i14 < size; i14++) {
            if (!get(i14).equals(list.get(i14))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode = (iHashCode * 31) + get(i14).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final boolean isModifiable() {
        return this.f7561a;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final void makeImmutable() {
        if (this.f7561a) {
            this.f7561a = false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i14, E e4) {
        a();
        return (E) super.set(i14, e4);
    }

    public c() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i14, E e4) {
        a();
        super.add(i14, e4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        a();
        return super.addAll(i14, collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i14) {
        a();
        return (E) super.remove(i14);
    }
}
