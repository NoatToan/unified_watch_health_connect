package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class xl4<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnq<V> f39228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<K, V> f39229b = new LinkedHashMap<>();
    public int c = 0;

    public xl4(nnq<V> nnqVar) {
        this.f39228a = nnqVar;
    }

    public synchronized V a(K k2) {
        return this.f39229b.get(k2);
    }

    public synchronized int b() {
        return this.f39229b.size();
    }

    public synchronized K c() {
        return this.f39229b.isEmpty() ? null : this.f39229b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> d(j6i<K> j6iVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        try {
            arrayList = new ArrayList<>(this.f39229b.entrySet().size());
            for (Map.Entry<K, V> entry : this.f39229b.entrySet()) {
                if (j6iVar == null || j6iVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int e() {
        return this.c;
    }

    public final int f(V v) {
        if (v == null) {
            return 0;
        }
        return this.f39228a.a(v);
    }

    public synchronized V g(K k2, V v) {
        V vRemove;
        vRemove = this.f39229b.remove(k2);
        this.c -= f(vRemove);
        this.f39229b.put(k2, v);
        this.c += f(v);
        return vRemove;
    }

    public synchronized V h(K k2) {
        V vRemove;
        vRemove = this.f39229b.remove(k2);
        this.c -= f(vRemove);
        return vRemove;
    }

    public synchronized ArrayList<V> i(j6i<K> j6iVar) {
        ArrayList<V> arrayList;
        try {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.f39229b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (j6iVar == null || j6iVar.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.c -= f(next.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
