package defpackage;

import android.util.LruCache;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class kyc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LruCache<String, kym> f39616c = new LruCache<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<String> f39615b = new HashSet(16);

    public kym b(String str) {
        if (str == null) {
            return null;
        }
        return this.f39616c.get(str);
    }

    public void b(String str, kym kymVar) {
        if (str == null || kymVar == null) {
            return;
        }
        this.f39616c.put(str, kymVar);
    }

    public void d(String str) {
        this.f39615b.add(str);
    }

    public boolean e(String str) {
        return this.f39615b.contains(str);
    }

    public void e() {
        this.f39616c.evictAll();
    }
}
