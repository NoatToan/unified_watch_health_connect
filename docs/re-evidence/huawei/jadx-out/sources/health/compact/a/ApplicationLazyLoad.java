package health.compact.a;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.lazyload.LazyLoadingMgr;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationLazyLoad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile LazyLoadingMgr f36502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36503b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<? extends LazyLoadingMgr> f36504c;

    private ApplicationLazyLoad() {
    }

    public static void c(Class<? extends LazyLoadingMgr> cls) {
        if (f36504c == null) {
            f36504c = cls;
        }
    }

    public static void a() {
        Class<? extends LazyLoadingMgr> cls;
        synchronized (f36503b) {
            if (f36502a != null) {
                return;
            }
            if (f36502a == null && (cls = f36504c) != null) {
                LogUtil.e("ApplicationLazyLoad", " load with ", cls);
                Object objB = ReflectionUtils.b(f36504c);
                LazyLoadingMgr lazyLoadingMgr = objB instanceof LazyLoadingMgr ? (LazyLoadingMgr) objB : null;
                if (lazyLoadingMgr != null) {
                    f36502a = lazyLoadingMgr;
                    lazyLoadingMgr.load(BaseApplication.b());
                }
            }
        }
    }

    public static boolean b() {
        return f36502a != null;
    }
}
