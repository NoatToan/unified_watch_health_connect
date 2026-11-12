package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xj4 {
    public static Object a(boolean z) {
        return Boolean.valueOf(z);
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to boolean");
    }

    public static Object c(int i) {
        return Integer.valueOf(i);
    }

    public static int d(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to int");
    }
}
