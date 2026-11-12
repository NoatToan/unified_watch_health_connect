package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public class vh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<Class<?>, LinkedHashSet<Class<?>>> f36891a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<Class<?>, HashMap<String, String>> f36892b = new HashMap<>();

    static {
        a(Object.class, fu5.class);
        a(Object.class, zj4.class);
    }

    public static void a(Class<?> cls, Class<?> cls2) {
        synchronized (f36891a) {
            try {
                LinkedHashSet<Class<?>> linkedHashSet = f36891a.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    f36891a.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
