package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.motiontrack.api.LocationApi;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;

/* JADX INFO: loaded from: classes29.dex */
public class gcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f34888a = new Object();
    private static volatile LocationApi d;

    public static LocationApi a() {
        if (d == null) {
            synchronized (f34888a) {
                if (d == null) {
                    try {
                        d = (LocationApi) ReflectionUtils.d("com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteLocationHelper", BaseApplication.b().getClassLoader());
                    } catch (Exception e) {
                        LogUtil.d("RouteLocationHelperProxy", "create LocationApi fail, ex=", LogUtil.c(e));
                    }
                }
            }
        }
        return d;
    }
}
