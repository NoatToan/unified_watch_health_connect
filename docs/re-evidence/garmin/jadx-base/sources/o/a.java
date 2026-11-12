package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f128466e = new HashMap<>();

    @Override // o.b
    public final b.c<K, V> a(K k14) {
        return this.f128466e.get(k14);
    }

    @Override // o.b
    public final V b(K k14) {
        V v14 = (V) super.b(k14);
        this.f128466e.remove(k14);
        return v14;
    }
}
