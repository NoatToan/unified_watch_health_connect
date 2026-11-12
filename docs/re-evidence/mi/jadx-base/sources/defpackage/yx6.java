package defpackage;

import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class yx6<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.Pool<ArrayList<T>> f40658a = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<T, ArrayList<T>> f40659b = new SimpleArrayMap<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t, T t2) {
        if (!this.f40659b.containsKey(t) || !this.f40659b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f40659b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.f40659b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(T t) {
        if (this.f40659b.containsKey(t)) {
            return;
        }
        this.f40659b.put(t, null);
    }

    public void c() {
        int size = this.f40659b.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f40659b.valueAt(i);
            if (arrayListValueAt != null) {
                k(arrayListValueAt);
            }
        }
        this.f40659b.clear();
    }

    public boolean d(T t) {
        return this.f40659b.containsKey(t);
    }

    public final void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f40659b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    public final ArrayList<T> f() {
        ArrayList<T> arrayListAcquire = this.f40658a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    public List g(T t) {
        return this.f40659b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f40659b.getSize();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f40659b.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f40659b.keyAt(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.f40659b.getSize();
        for (int i = 0; i < size; i++) {
            e(this.f40659b.keyAt(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(T t) {
        int size = this.f40659b.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f40659b.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f40658a.release(arrayList);
    }
}
