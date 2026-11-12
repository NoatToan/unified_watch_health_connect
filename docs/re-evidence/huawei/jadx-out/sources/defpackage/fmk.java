package defpackage;

import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes29.dex */
public class fmk {
    private static int c(int i) {
        if (i != -2 && i != 5) {
            if (i == 7) {
                return 4;
            }
            if (i != 0 && i != 1 && i != 18 && i != 19 && i != 23 && i != 24 && i != 44 && i != 45) {
                switch (i) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                        return 4;
                    default:
                        return -1;
                }
            }
        }
        return 1;
    }

    private static int d(int i) {
        if (i != 2 && i != 3 && i != 20 && i != 21) {
            if (i != 32) {
                switch (i) {
                    case 8:
                    case 9:
                        break;
                    case 10:
                        break;
                    default:
                        return -1;
                }
            }
            return 3;
        }
        return 2;
    }

    public static int b(int i) {
        LogUtil.a("DeviceUtil", "getDeviceClassificationForLabel() deviceType :", Integer.valueOf(i));
        int iC = c(i);
        if (iC == -1) {
            iC = d(i);
        }
        if (iC == -1) {
            iC = e(i);
        }
        LogUtil.a("DeviceUtil", "getDeviceClassificationForLabel deviceClassification:", Integer.valueOf(iC));
        return iC;
    }

    private static int e(int i) {
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) {
            return -1;
        }
        if (pluginInfoByDeviceType.i().af() == 1) {
            return (pluginInfoByDeviceType.i().af() == 7 || pluginInfoByDeviceType.i().af() == 16) ? 4 : 1;
        }
        if (pluginInfoByDeviceType.i().af() == 2) {
            return 2;
        }
        return pluginInfoByDeviceType.i().af() == 5 ? 3 : -1;
    }
}
