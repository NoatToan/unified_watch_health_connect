package defpackage;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yjv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LruCache<String, Map<String, yjr>> f53532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f53533c = 300000;

    public yjv(int i) {
        this.f53532b = new LruCache<>(i);
    }

    public void c(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        Map<String, yjr> map = this.f53532b.get(str);
        if (map == null) {
            map = new HashMap<>(16);
            this.f53532b.put(str, map);
        }
        map.put(str2, new yjr(str, str2, str3, SystemClock.elapsedRealtime()));
    }
}
