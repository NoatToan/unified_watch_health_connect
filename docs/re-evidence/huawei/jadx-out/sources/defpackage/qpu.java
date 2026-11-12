package defpackage;

import androidx.collection.SparseArrayCompat;
import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes16.dex */
public class qpu<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArrayCompat<SparseArrayCompat<T>> f46626b = new SparseArrayCompat<>();

    public void b(int i, int i2, T t) {
        SparseArrayCompat<T> sparseArrayCompat = this.f46626b.get(i);
        if (sparseArrayCompat == null) {
            SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>();
            sparseArrayCompat2.put(i2, t);
            this.f46626b.put(i, sparseArrayCompat2);
            return;
        }
        sparseArrayCompat.put(i2, t);
    }

    public T b(int i, int i2) {
        SparseArrayCompat<T> sparseArrayCompat = this.f46626b.get(i);
        if (sparseArrayCompat == null) {
            return null;
        }
        return sparseArrayCompat.get(i2);
    }

    public Collection<T> a(int i) {
        LinkedList linkedList = new LinkedList();
        SparseArrayCompat<T> sparseArrayCompat = this.f46626b.get(i);
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = sparseArrayCompat.get(sparseArrayCompat.keyAt(i2));
            if (t != null) {
                linkedList.add(t);
            }
        }
        return linkedList;
    }

    public Collection<T> e(int i) {
        LinkedList linkedList = new LinkedList();
        int size = this.f46626b.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = this.f46626b.get(this.f46626b.keyAt(i2)).get(i);
            if (t != null) {
                linkedList.add(t);
            }
        }
        return linkedList;
    }

    public Collection<T> b() {
        LinkedList linkedList = new LinkedList();
        int size = this.f46626b.size();
        for (int i = 0; i < size; i++) {
            SparseArrayCompat<T> sparseArrayCompat = this.f46626b.get(this.f46626b.keyAt(i));
            int size2 = sparseArrayCompat.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(sparseArrayCompat.get(sparseArrayCompat.keyAt(i2)));
            }
        }
        return linkedList;
    }

    public void a(int i, int i2) {
        SparseArrayCompat<T> sparseArrayCompat = this.f46626b.get(i);
        if (sparseArrayCompat != null) {
            sparseArrayCompat.remove(i2);
        }
    }

    public void a() {
        this.f46626b.clear();
    }
}
