package defpackage;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public class nyl {
    public static <T> ServiceLoader<T> a(Class<T> cls) {
        return b(cls, null);
    }

    public static <T> ServiceLoader<T> b(Class<T> cls, ClassLoader classLoader) {
        return ServiceLoader.load(cls, (ClassLoader) g4h.e(classLoader, yz3.b()));
    }
}
