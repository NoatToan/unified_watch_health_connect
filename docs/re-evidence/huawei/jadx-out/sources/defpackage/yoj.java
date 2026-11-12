package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class yoj {
    private static final Map<Class<?>, yqa<?>> d = new ConcurrentHashMap();

    private static yqa<?> b(Class<?> cls) throws yny {
        Map<Class<?>, yqa<?>> map = d;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        yqa<?> yqaVar = new yqa<>(cls);
        map.put(cls, yqaVar);
        return yqaVar;
    }

    public static <T> void d(T t) throws yny {
        if (t == null) {
            throw new yny("validate bean is null");
        }
        yqa<?> yqaVarB = b(t.getClass());
        if (yqaVarB.c()) {
            yqaVarB.d(t);
        }
    }
}
