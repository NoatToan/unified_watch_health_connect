package defpackage;

import android.util.LruCache;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kye {
    private LruCache<String, List<Integer>> d = new LruCache<>(10);

    public List<Integer> d(String str) {
        if (str == null) {
            return null;
        }
        return this.d.get(str);
    }

    public void d(String str, List<Integer> list) {
        if (str == null || list == null) {
            return;
        }
        this.d.put(str, list);
    }

    public void e() {
        this.d.evictAll();
    }
}
