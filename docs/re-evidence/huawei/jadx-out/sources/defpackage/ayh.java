package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ayh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ayh f793a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f794c = new Object();
    private Map<String, ayb> d = new ConcurrentHashMap();

    public void d(ayb aybVar) {
        if (aybVar == null) {
            return;
        }
        aybVar.c();
    }

    public void a() {
        for (Map.Entry<String, ayb> entry : this.d.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().a()) {
                this.d.remove(key);
            }
        }
    }

    public ayb e(Context context, String str) {
        ayb aybVar = this.d.get(str);
        if (aybVar == null) {
            synchronized (f794c) {
                aybVar = this.d.get(str);
                if (aybVar == null) {
                    aybVar = new ayb(context, str, 60000L);
                    this.d.put(str, aybVar);
                }
            }
        }
        aybVar.d();
        return aybVar;
    }

    public static ayh c() {
        if (f793a == null) {
            synchronized (f794c) {
                if (f793a == null) {
                    f793a = new ayh();
                }
            }
        }
        return f793a;
    }

    private ayh() {
    }
}
