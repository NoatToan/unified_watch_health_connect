package com.huawei.hwarkuix.oHBrigdePlugin.device.utils;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.edl;
import defpackage.edz;
import defpackage.lvi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class IntelligentHomeUtil {
    private static final String KEY_INTELLIGENT_HOME_SWITCH_UI = "intelligent_home_switch";
    private static final String TAG = "IntelligentHomeUtil";
    private static final String TAG_RELEASE = "R_IntelligentHomeUtil";

    public static boolean isIntelligentHomeShow(DeviceInfo deviceInfo) {
        boolean z = false;
        if (Utils.o()) {
            LogUtil.a(TAG, "isIntelligentHomeShow version is oversea or googlePlay");
            return false;
        }
        if (deviceInfo == null) {
            LogUtil.a(TAG, "isIntelligentHomeShow deviceInfo == null");
            return false;
        }
        DeviceCapability negotiationDeviceCapability = CapabilityFactory.getNegotiationDeviceCapability(deviceInfo.getDeviceIdentify());
        boolean intelligentHomeSwitchFromCloud = getIntelligentHomeSwitchFromCloud(deviceInfo);
        boolean zIsSupportIntelligentHomeLinkage = negotiationDeviceCapability.isSupportIntelligentHomeLinkage();
        ReleaseLogUtil.d(TAG_RELEASE, "intelligentHomeSwitch:", Boolean.valueOf(intelligentHomeSwitchFromCloud), "; isSupportIntelligentHomeLinkage:", Boolean.valueOf(zIsSupportIntelligentHomeLinkage));
        if (CommonUtil.bu() && zIsSupportIntelligentHomeLinkage && intelligentHomeSwitchFromCloud) {
            return true;
        }
        if (zIsSupportIntelligentHomeLinkage) {
            if (intelligentHomeSwitchFromCloud) {
                z = true;
            } else {
                String strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10008), KEY_INTELLIGENT_HOME_SWITCH_UI);
                LogUtil.a(TAG, "devicePairSwitchFlag:", strE);
                if (strE != null && !TextUtils.isEmpty(strE)) {
                    z = Boolean.parseBoolean(strE);
                }
            }
        }
        LogUtil.a(TAG, "isIntelligentHomeVisible:", Boolean.valueOf(z));
        return z;
    }

    private static boolean getIntelligentHomeSwitchFromCloud(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getProductType() <= 71) {
            LogUtil.a(TAG, "getIntelligentHomeSwitchFromCloud not new product");
            return true;
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (hiLinkDeviceId == null || hiLinkDeviceId.isEmpty()) {
            LogUtil.j(TAG, "getIntelligentHomeSwitchFromCloud HiLinkDeviceId is null");
            return false;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j(TAG, "getIntelligentHomeSwitchFromCloud pluginInfo is null");
            return true;
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI != null) {
            try {
                String string = new JSONObject(edzVarI.e()).getString("ai_tips_product_" + hiLinkDeviceId);
                LogUtil.a(TAG, "hiLinkDeviceInfo is:", string);
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has(KEY_INTELLIGENT_HOME_SWITCH_UI)) {
                    return jSONObject.optBoolean(KEY_INTELLIGENT_HOME_SWITCH_UI);
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "getIntelligentHomeSwitchFromCloud JSONException");
            }
        } else {
            LogUtil.j(TAG, "pluginInfoForWear is null");
        }
        return true;
    }
}
