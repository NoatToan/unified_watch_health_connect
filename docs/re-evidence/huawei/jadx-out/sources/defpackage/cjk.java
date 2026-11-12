package defpackage;

import com.huawei.devicepair.api.BasePairManagerApi;
import com.huawei.devicepair.api.MessageNotificationApi;
import com.huawei.devicepair.api.PermissionsApi;
import com.huawei.devicepair.api.UpdateDeviceApi;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes4.dex */
public class cjk {
    public static BasePairManagerApi d() {
        LogUtil.a("PairApiManager", "getConnectApi");
        return (BasePairManagerApi) Services.d("DevicePairJs", BasePairManagerApi.class);
    }

    public static MessageNotificationApi c() {
        LogUtil.a("PairApiManager", "getMessageNotificationApi");
        return (MessageNotificationApi) Services.d("DevicePairJs", MessageNotificationApi.class);
    }

    public static PermissionsApi a() {
        LogUtil.a("PairApiManager", "getPermissionsApi");
        return (PermissionsApi) Services.d("DevicePairPermissionsJs", PermissionsApi.class);
    }

    public static UpdateDeviceApi e() {
        LogUtil.a("PairApiManager", "getUpdateDeviceApi");
        return (UpdateDeviceApi) Services.d("DevicePairJs", UpdateDeviceApi.class);
    }

    public static DownloadManagerApi b() {
        LogUtil.a("PairApiManager", "getDownloadManagerApi");
        return (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
    }
}
