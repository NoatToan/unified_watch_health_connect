package defpackage;

import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes7.dex */
public class edd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f32775a = new Object();
    private static edd d;

    public static edd a() {
        edd eddVar;
        synchronized (f32775a) {
            if (d == null) {
                d = new edd();
            }
            eddVar = d;
        }
        return eddVar;
    }

    public boolean a(int i) {
        if (i <= 45) {
            return false;
        }
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) {
            return true;
        }
        return pluginInfoByDeviceType.i().ca();
    }
}
