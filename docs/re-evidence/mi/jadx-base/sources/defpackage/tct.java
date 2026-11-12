package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class tct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class, xet> f34580a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> String a(T t) {
        if (t == 0) {
            return null;
        }
        if (t instanceof String) {
            return (String) t;
        }
        Class<?> cls = t.getClass();
        Map<Class, xet> map = f34580a;
        xet xetVar = map.get(cls);
        if (xetVar == null) {
            Iterator<Class> it = map.keySet().iterator();
            while (it.hasNext()) {
                xet xetVar2 = f34580a.get(it.next());
                if (xetVar2.a().isAssignableFrom(cls)) {
                    xetVar = xetVar2;
                    break;
                }
            }
        }
        return xetVar != null ? xetVar.a(t) : t.toString();
    }
}
