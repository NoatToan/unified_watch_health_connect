package health.compact.a;

import android.content.Context;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.framework.servicemgr.Lazy;
import com.huawei.framework.servicemgr.ServiceManager;
import defpackage.czy;

/* JADX INFO: loaded from: classes.dex */
public final class Services {
    private Services() {
    }

    public static <T> Lazy<T> b(String str, Class<T> cls, Context context, Consumer<T> consumer) {
        return c(str, cls, context, consumer, false);
    }

    public static <T> Lazy<T> c(String str, Class<T> cls, Context context, Consumer<T> consumer, boolean z) {
        Lazy<T> lazy = ServiceManager.getSingleton().get(str, cls);
        if (lazy.isPresent()) {
            if (consumer != null) {
                consumer.accept(lazy.get());
                return lazy;
            }
        } else if (context != null) {
            lazy.load(context, consumer, z);
        }
        return lazy;
    }

    public static <T> T d(String str, Class<T> cls) {
        return (T) c(str, cls, null);
    }

    public static <T> T c(String str, Class<T> cls, String str2) {
        return (T) ServiceManager.getSingleton().getInstance(str, cls, str2);
    }

    public static <T> T b(String str, Class<T> cls) {
        return (T) b(str, cls, null);
    }

    public static <T> T b(String str, Class<T> cls, String str2) {
        T t = (T) ServiceManager.getSingleton().getInstance(str, cls, str2);
        return t == null ? (T) czy.a(cls) : t;
    }
}
