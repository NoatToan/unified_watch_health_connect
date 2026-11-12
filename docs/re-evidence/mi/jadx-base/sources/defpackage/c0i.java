package defpackage;

import com.google.common.base.Optional;
import java.lang.ref.WeakReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class c0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f4792a = Logger.getLogger(c0i.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hmh f4793b = c();

    public static final class b implements hmh {
        public b() {
        }
    }

    public static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    public static <T extends Enum<T>> Optional<T> b(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = sc8.a(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.of(cls.cast(weakReference.get()));
    }

    public static hmh c() {
        return new b();
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
