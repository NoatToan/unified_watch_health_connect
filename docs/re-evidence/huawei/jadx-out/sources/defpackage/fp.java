package defpackage;

import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public class fp {
    private static final fp d = new fp();
    private final LruCache<String, cx> e = new LruCache<>(20);

    public static fp d() {
        return d;
    }

    fp() {
    }

    public cx e(String str) {
        if (str == null) {
            return null;
        }
        return this.e.get(str);
    }

    public void d(String str, cx cxVar) {
        if (str == null) {
            return;
        }
        this.e.put(str, cxVar);
    }

    public void e() {
        this.e.evictAll();
    }
}
