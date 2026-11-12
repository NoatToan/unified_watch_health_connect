package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hc8 {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof rxa) {
            return cls.cast(obj);
        }
        if (obj instanceof sxa) {
            return (T) a(((sxa) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), rxa.class, sxa.class));
    }
}
