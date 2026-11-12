package defpackage;

import com.huawei.health.device.util.EventBus;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dya {
    private static final Map<String, EventBus.d> d = new ConcurrentHashMap();

    public static void b(EventBus.d dVar) {
        if (dVar == null) {
            return;
        }
        d.put(dVar.e(), dVar);
        EventBus.a(dVar);
    }

    public static EventBus.d d(String str) {
        return d.get(str);
    }

    public static EventBus.d b(String str) {
        return d.remove(str);
    }

    public static void b(EventBus.ICallback iCallback, int i, String... strArr) {
        EventBus.b(iCallback, i, strArr);
    }

    public static void c(EventBus.ICallback iCallback, String... strArr) {
        EventBus.a(iCallback, strArr);
    }
}
