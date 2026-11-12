package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class xzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static xzd f39614b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, WeakReference<jkk.a>> f39615a = new HashMap();

    public static xzd c() {
        if (f39614b == null) {
            synchronized (xzd.class) {
                try {
                    if (f39614b == null) {
                        f39614b = new xzd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39614b;
    }

    public void a() {
        this.f39615a.clear();
    }

    public jkk.a b(int i) {
        WeakReference<jkk.a> weakReference = this.f39615a.get(Integer.valueOf(i));
        if (weakReference == null) {
            return null;
        }
        this.f39615a.remove(Integer.valueOf(i));
        return weakReference.get();
    }
}
