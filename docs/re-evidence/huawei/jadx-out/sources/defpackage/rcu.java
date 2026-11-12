package defpackage;

import android.os.Build;
import com.huawei.devicepair.api.UpdateDeviceApi;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = UpdateDeviceApi.class)
@Singleton
public class rcu implements UpdateDeviceApi {
    @Override // com.huawei.devicepair.api.UpdateDeviceApi
    public Map<String, Boolean> getUpdatePageContent(String str) {
        boolean zIsOtaUpdate;
        boolean isSupportAutoUpdate;
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null) {
            LogUtil.j("UpdateDeviceApiImpl", "getUpdatePageContent, capability is null");
            isSupportAutoUpdate = false;
            zIsOtaUpdate = false;
        } else {
            zIsOtaUpdate = deviceCapabilityA.isOtaUpdate();
            isSupportAutoUpdate = deviceCapabilityA.getIsSupportAutoUpdate();
        }
        DeviceInfo deviceInfoB = mgg.b(str, "UpdateDeviceApiImpl");
        boolean z = eey.d(deviceInfoB, 108) && !Utils.k();
        int productType = deviceInfoB == null ? -1 : deviceInfoB.getProductType();
        boolean zIsSupportPairCheckedOtaAutoUpdateSwitch = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isSupportPairCheckedOtaAutoUpdateSwitch();
        LogUtil.a("UpdateDeviceApiImpl", "getUpdatePageContent, isOtaUpdate is ", Boolean.valueOf(zIsOtaUpdate), " isSupportAutoUpdate is ", Boolean.valueOf(isSupportAutoUpdate), " mDeviceProductType is ", Integer.valueOf(productType), ", isSupportOtaUpgrade:", Boolean.valueOf(z), " isOverseaNoCloudVersion ", Boolean.valueOf(Utils.k()), ", isCheckedSwitch:", Boolean.valueOf(zIsSupportPairCheckedOtaAutoUpdateSwitch));
        HashMap map = new HashMap(16);
        if (eev.b(productType, zIsOtaUpdate, false) || z) {
            ReleaseLogUtil.d("DEVMGR_UpdateDeviceApiImpl", "support wlan auto update, isCheckedSwitch: " + zIsSupportPairCheckedOtaAutoUpdateSwitch);
            map.put("wlan_auto_update", Boolean.valueOf(zIsSupportPairCheckedOtaAutoUpdateSwitch));
        }
        if (isSupportAutoUpdate) {
            ReleaseLogUtil.d("DEVMGR_UpdateDeviceApiImpl", "support auto update status, isCheckedSwitch: " + zIsSupportPairCheckedOtaAutoUpdateSwitch);
            map.put("auto_update_status", Boolean.valueOf(zIsSupportPairCheckedOtaAutoUpdateSwitch));
        }
        boolean z2 = eey.d(deviceInfoB, 35) || eey.d(deviceInfoB, 76);
        if (Build.VERSION.SDK_INT > 30 && CommonUtil.bg() && z2) {
            ReleaseLogUtil.d("DEVMGR_UpdateDeviceApiImpl", "support auto open wlan status, isCheckedSwitch: " + zIsSupportPairCheckedOtaAutoUpdateSwitch);
            map.put("auto_open_wlan_status", Boolean.valueOf(zIsSupportPairCheckedOtaAutoUpdateSwitch));
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    @Override // com.huawei.devicepair.api.UpdateDeviceApi
    public void setUpdateStatus(Map<String, Boolean> map, String str, IBaseResponseCallback iBaseResponseCallback) {
        byte b2;
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateDeviceApiImpl", "setUpdateStatus callback is null");
            return;
        }
        if (map == null || map.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_UpdateDeviceApiImpl", "setUpdateStatus param is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap map2 = new HashMap(map);
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            int iHashCode = key.hashCode();
            if (iHashCode != 105734552) {
                if (iHashCode != 312087338) {
                    if (iHashCode == 1760488028 && key.equals("wlan_auto_update")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (key.equals("auto_open_wlan_status")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (key.equals("auto_update_status")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                DeviceInfo deviceInfoB = mgg.b(str, "UpdateDeviceApiImpl");
                if (deviceInfoB != null) {
                    mhs.a().setSwitchSetting("auto_update_status", entry.getValue().booleanValue() ? "true" : "false", deviceInfoB.getDeviceUdid(), null);
                    map2.put("auto_update_status", true);
                    LogUtil.a("UpdateDeviceApiImpl", "setUpdateStatus AUTO_UPDATE_STATUS");
                } else {
                    map2.put("auto_update_status", false);
                }
            } else if (b2 == 1) {
                mhs.a().setSwitchSetting("auto_open_wlan_status", entry.getValue().booleanValue() ? "1" : "2", str, null);
                map2.put("auto_open_wlan_status", true);
                LogUtil.a("UpdateDeviceApiImpl", "setUpdateStatus AUTO_OPEN_WLAN_STATUS");
            } else if (b2 == 2) {
                mhs.a().setSwitchSetting("wlan_auto_update", entry.getValue().booleanValue() ? "1" : "2", null);
                map2.put("wlan_auto_update", true);
                LogUtil.a("UpdateDeviceApiImpl", "setUpdateStatus WLAN_AUTO_UPDATE");
            }
        }
        iBaseResponseCallback.a(0, map2);
    }

    @Override // com.huawei.devicepair.api.UpdateDeviceApi
    public boolean isShowOtaPrivacy(String str) {
        boolean zIsOtaUpdate;
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a("UpdateDeviceApiImpl", "initPairResultOtaPrivacyView siteId:", Integer.valueOf(iN));
        if (iN != 7) {
            LogUtil.j("UpdateDeviceApiImpl", "initPairResultOtaPrivacyView is not EUROPE_LOGIN_SITE_ID");
            return false;
        }
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null) {
            LogUtil.j("UpdateDeviceApiImpl", "getUpdatePageContent, capability is null");
            zIsOtaUpdate = false;
        } else {
            zIsOtaUpdate = deviceCapabilityA.isOtaUpdate();
        }
        DeviceInfo deviceInfoB = mgg.b(str, "UpdateDeviceApiImpl");
        boolean zD = eey.d(deviceInfoB, 58);
        boolean zD2 = eey.d(deviceInfoB, 108);
        LogUtil.a("UpdateDeviceApiImpl", "isOtaUpdate is ", Boolean.valueOf(zIsOtaUpdate), "isSupportDetect is ", Boolean.valueOf(zD), "isSupportOtaUpgrade is ", Boolean.valueOf(zD2));
        return zIsOtaUpdate || zD || zD2;
    }
}
