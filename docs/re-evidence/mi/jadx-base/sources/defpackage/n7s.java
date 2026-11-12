package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class n7s {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
