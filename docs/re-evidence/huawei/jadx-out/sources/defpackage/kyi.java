package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes10.dex */
public class kyi {
    private LruCache<Integer, Object> e = new LruCache<>(20);

    public Object d(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    public void b(int i, Object obj) {
        if (obj == null) {
            return;
        }
        this.e.put(Integer.valueOf(i), obj);
    }

    public void a() {
        this.e.evictAll();
    }
}
