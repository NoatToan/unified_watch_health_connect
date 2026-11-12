package defpackage;

import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes46.dex */
public final class yxz {
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T e(Class<T> cls, Object obj, String str) {
        b(cls, "Type to check against must not be null");
        if (!cls.isInstance(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("Object of class [");
            sb.append(obj != null ? obj.getClass().getName() : Constants.NULL);
            sb.append("] must be an instance of ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
        return cls.cast(obj);
    }

    public static <T> T d(Class<T> cls, Object obj, String str) {
        b(cls, "Type to check cannot be null.");
        if (!cls.isInstance(obj)) {
            throw new IllegalStateException(str + "Object of class [" + yxy.e(obj) + "] must be an instance of " + cls);
        }
        return cls.cast(obj);
    }
}
