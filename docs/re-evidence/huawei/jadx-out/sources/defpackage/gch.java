package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.motiontrack.api.RunningRouteApi;
import health.compact.a.ReflectionUtils;

/* JADX INFO: loaded from: classes7.dex */
public class gch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f34889b = new Object();
    private static volatile RunningRouteApi d;

    public static RunningRouteApi b() {
        if (d == null) {
            synchronized (f34889b) {
                if (d == null) {
                    d = (RunningRouteApi) ReflectionUtils.d("com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteImpl", BaseApplication.b().getClassLoader());
                }
            }
        }
        return d;
    }
}
