package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class tsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, rsk> f34998a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile tsk f34999b;

    public static tsk a() {
        if (f34999b == null) {
            synchronized (tsk.class) {
                try {
                    if (f34999b == null) {
                        f34999b = new tsk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34999b;
    }

    public rsk b(Context context, rsk.a aVar) {
        if (context == null) {
            return null;
        }
        int iHashCode = context.hashCode();
        rsk rskVar = f34998a.get(Integer.valueOf(iHashCode));
        if (rskVar == null) {
            rskVar = new rsk();
            f34998a.put(Integer.valueOf(iHashCode), rskVar);
        }
        rskVar.r(aVar);
        return rskVar;
    }

    public void c(Context context) {
        f34998a.remove(Integer.valueOf(context.hashCode()));
    }
}
