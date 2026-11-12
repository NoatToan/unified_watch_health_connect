package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cgu<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<K, V> f1588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1589c;

    public cgu(int i) {
        this.f1589c = i;
        this.f1588b = new LinkedHashMap<K, V>(i, 0.75f, true) { // from class: cgu.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
                return size() > cgu.this.f1589c;
            }
        };
    }

    public V b(String str) {
        return this.f1588b.get(str);
    }

    public void d(K k, V v) {
        this.f1588b.put(k, v);
    }
}
