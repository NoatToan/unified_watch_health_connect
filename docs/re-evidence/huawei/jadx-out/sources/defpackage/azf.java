package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class azf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ayz f835c = ayz.e();
    private static azf d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f836a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f837b = -1;

    public int a() {
        return 13;
    }

    public static azf b() {
        azf azfVar;
        synchronized (azf.class) {
            if (d == null) {
                d = new azf();
            }
            azfVar = d;
        }
        return azfVar;
    }

    public void c(int i) {
        f835c.d("SdkVersionManager", "recordServerVersion serverVersion: " + i);
        this.f837b = i;
    }

    private boolean e() {
        return this.f837b != -1;
    }

    public boolean a(int i, int i2) {
        if (i2 <= 8) {
            return true;
        }
        f835c.d("SdkVersionManager", "bothVersionGreaterThanTargetVersion pid: " + i + ", targetVersion: " + i2);
        if (e()) {
            return Math.min(this.f837b, a()) >= i2;
        }
        return this.f836a.containsKey(Integer.valueOf(i)) && Math.min(this.f836a.get(Integer.valueOf(i)).intValue(), a()) >= i2;
    }
}
