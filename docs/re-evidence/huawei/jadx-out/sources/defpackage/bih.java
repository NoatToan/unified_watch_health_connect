package defpackage;

/* JADX INFO: loaded from: classes23.dex */
public class bih {
    public static <T> T c(Class<T> cls) {
        T t = (T) bii.a(cls);
        if (t == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }
}
