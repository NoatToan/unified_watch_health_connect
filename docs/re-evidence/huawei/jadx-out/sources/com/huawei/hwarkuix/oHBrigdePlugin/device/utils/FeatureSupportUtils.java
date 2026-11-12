package com.huawei.hwarkuix.oHBrigdePlugin.device.utils;

import android.text.TextUtils;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.device.callback.QueryBackLogDataCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi;
import defpackage.dfd;
import defpackage.eei;
import defpackage.eey;
import defpackage.fej;
import defpackage.ipg;
import defpackage.lvi;
import defpackage.lwd;
import defpackage.mbt;
import defpackage.meo;
import defpackage.nzz;
import defpackage.qqt;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class FeatureSupportUtils {
    private static final String TAG = "FeatureSupportUtils";
    private static final String TAG_RELEASE = "R_FeatureSupportUtils";
    private static final Map<String, Boolean> wechatBindMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static int changeResponse(boolean z) {
        return z ? 1 : 0;
    }

    public static void queryBacklogEvents(DeviceInfo deviceInfo, final BaseResponseCallback<JSONObject> baseResponseCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceInfo == null || deviceGeneralSettingApi == null) {
            JSONObject jSONObject = new JSONObject();
            LogUtil.j(TAG, "queryBacklogEvents deviceInfo_isnull: ", Boolean.valueOf(deviceInfo == null), " api_isnull: ", Boolean.valueOf(deviceGeneralSettingApi == null));
            baseResponseCallback.onResponse(0, jSONObject);
            return;
        }
        deviceGeneralSettingApi.queryBacklogEvents(deviceInfo.getDeviceIdentify(), new QueryBackLogDataCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda1
            @Override // com.huawei.health.device.callback.QueryBackLogDataCallback
            public final void onResult(JSONObject jSONObject2) {
                FeatureSupportUtils.lambda$queryBacklogEvents$0(baseResponseCallback, jSONObject2);
            }
        });
    }

    static /* synthetic */ void lambda$queryBacklogEvents$0(BaseResponseCallback baseResponseCallback, JSONObject jSONObject) {
        ReleaseLogUtil.d(TAG_RELEASE, "queryBacklogEvents result:", qqt.b(jSONObject));
        baseResponseCallback.onResponse(0, jSONObject);
    }

    public static void queryBenefitData(DeviceInfo deviceInfo, final BaseResponseCallback<JSONObject> baseResponseCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceInfo == null || deviceGeneralSettingApi == null) {
            JSONObject jSONObject = new JSONObject();
            LogUtil.j(TAG, "queryBenefitData deviceInfo_isnull: ", Boolean.valueOf(deviceInfo == null), " api_isnull: ", Boolean.valueOf(deviceGeneralSettingApi == null));
            baseResponseCallback.onResponse(0, jSONObject);
            return;
        }
        deviceGeneralSettingApi.queryBenefitData(deviceInfo, new QueryBackLogDataCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda2
            @Override // com.huawei.health.device.callback.QueryBackLogDataCallback
            public final void onResult(JSONObject jSONObject2) {
                FeatureSupportUtils.lambda$queryBenefitData$1(baseResponseCallback, jSONObject2);
            }
        });
    }

    static /* synthetic */ void lambda$queryBenefitData$1(BaseResponseCallback baseResponseCallback, JSONObject jSONObject) {
        ReleaseLogUtil.d(TAG_RELEASE, "queryBenefitData result:", qqt.b(jSONObject));
        baseResponseCallback.onResponse(0, jSONObject);
    }

    public static void getWechatBind(final DeviceInfo deviceInfo, final BaseResponseCallback<Integer> baseResponseCallback) {
        LogUtil.a(TAG, "getWechatBind");
        if (deviceInfo == null) {
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(false)));
            return;
        }
        Boolean bool = wechatBindMap.get(deviceInfo.getDeviceIdentify());
        ReleaseLogUtil.d(TAG_RELEASE, "getWechatBind wechatBindMap isSupport: ", bool);
        if (bool != null) {
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(bool.booleanValue())));
            return;
        }
        WechatDeviceProviderApi wechatDeviceProviderApi = (WechatDeviceProviderApi) Services.b("FeatureDataOpen", WechatDeviceProviderApi.class);
        if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
            eei.e(deviceInfo);
        }
        wechatDeviceProviderApi.checkSupportWechatDevice(deviceInfo, new WechatDeviceProviderApi.CheckResultListener<Boolean>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils.1
            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onResult(Boolean bool2) {
                ReleaseLogUtil.d(FeatureSupportUtils.TAG_RELEASE, "getWechatBind checkSupportWechatDevice: ", bool2);
                FeatureSupportUtils.wechatBindMap.put(deviceInfo.getDeviceIdentify(), bool2);
                baseResponseCallback.onResponse(0, Integer.valueOf(FeatureSupportUtils.changeResponse(bool2.booleanValue())));
            }

            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onError(int i, String str) {
                ReleaseLogUtil.d(FeatureSupportUtils.TAG_RELEASE, "getWechatBind checkSupportWechatDevice onError code: ", Integer.valueOf(i), " msg:", str);
                baseResponseCallback.onResponse(0, Integer.valueOf(FeatureSupportUtils.changeResponse(false)));
            }
        });
    }

    public static int checkSupportMyWatchFace(DeviceInfo deviceInfo) {
        boolean z = eey.d(deviceInfo, 224) && !Utils.k();
        ReleaseLogUtil.d(TAG, "checkSupportMyWatchFace is, ", Boolean.valueOf(z));
        return changeResponse(z);
    }

    public static int checkHighMonitoringSupport(DeviceInfo deviceInfo) {
        boolean z = dfd.c(deviceInfo) && ipg.e();
        ReleaseLogUtil.d(TAG_RELEASE, "highMonitoringSupport is, ", Boolean.valueOf(z));
        return changeResponse(z);
    }

    public static int isKeepAlive() {
        boolean zC = nzz.c();
        ReleaseLogUtil.d(TAG, "isKeepAlive is, ", Boolean.valueOf(zC));
        return changeResponse(zC);
    }

    public static void checkSupportWallet(DeviceInfo deviceInfo, final BaseResponseCallback<Integer> baseResponseCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceInfo == null || deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "checkSupportWallet deviceInfo_isnull: ", Boolean.valueOf(deviceInfo == null), " api_isnull: ", Boolean.valueOf(deviceGeneralSettingApi == null));
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(false)));
        } else {
            deviceGeneralSettingApi.querySupportWallet(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda3
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    FeatureSupportUtils.lambda$checkSupportWallet$2(baseResponseCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void lambda$checkSupportWallet$2(BaseResponseCallback baseResponseCallback, boolean z) {
        ReleaseLogUtil.d(TAG_RELEASE, "checkSupportWallet result:", Boolean.valueOf(z));
        baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(z)));
    }

    public static void exclusiveServiceSupport(DeviceInfo deviceInfo, final BaseResponseCallback<Integer> baseResponseCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceInfo == null || deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "exclusiveServiceSupport deviceInfo_isnull: ", Boolean.valueOf(deviceInfo == null), " api_isnull: ", Boolean.valueOf(deviceGeneralSettingApi == null));
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(false)));
        } else {
            deviceGeneralSettingApi.exclusiveServiceSupport(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda5
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    FeatureSupportUtils.lambda$exclusiveServiceSupport$3(baseResponseCallback, z);
                }
            });
        }
    }

    static /* synthetic */ void lambda$exclusiveServiceSupport$3(BaseResponseCallback baseResponseCallback, boolean z) {
        ReleaseLogUtil.d(TAG_RELEASE, "exclusiveServiceSupport result:", Boolean.valueOf(z));
        baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(z)));
    }

    public static void baiduSatelliteSupport(final DeviceInfo deviceInfo, final BaseResponseCallback<Integer> baseResponseCallback) {
        final DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceInfo == null || deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "baiduSatelliteSupport deviceInfo_isnull: ", Boolean.valueOf(deviceInfo == null), " api_isnull: ", Boolean.valueOf(deviceGeneralSettingApi == null));
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(false)));
        } else {
            deviceGeneralSettingApi.querySupportWallet(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda4
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    FeatureSupportUtils.lambda$baiduSatelliteSupport$5(baseResponseCallback, deviceGeneralSettingApi, deviceInfo, z);
                }
            });
        }
    }

    static /* synthetic */ void lambda$baiduSatelliteSupport$5(final BaseResponseCallback baseResponseCallback, DeviceGeneralSettingApi deviceGeneralSettingApi, DeviceInfo deviceInfo, boolean z) {
        ReleaseLogUtil.d(TAG_RELEASE, "checkSupportWallet result:", Boolean.valueOf(z));
        if (!z) {
            baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(false)));
        } else {
            deviceGeneralSettingApi.querySupportSatellite(deviceInfo, new DeviceGeneralSettingCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.utils.FeatureSupportUtils$$ExternalSyntheticLambda0
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z2) {
                    FeatureSupportUtils.lambda$baiduSatelliteSupport$4(baseResponseCallback, z2);
                }
            });
        }
    }

    static /* synthetic */ void lambda$baiduSatelliteSupport$4(BaseResponseCallback baseResponseCallback, boolean z) {
        ReleaseLogUtil.d(TAG_RELEASE, "baiduSatelliteSupport ret:", Boolean.valueOf(z));
        baseResponseCallback.onResponse(0, Integer.valueOf(changeResponse(z)));
    }

    public static int vascularElasticitySupport(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 75);
        boolean z = zD && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.vascular-health");
        ReleaseLogUtil.d(TAG_RELEASE, "setVascularItem isSupportCapability:", Boolean.valueOf(zD), " isSupportVascular:", Boolean.valueOf(z));
        return changeResponse(z);
    }

    public static int hiResearchSupport(DeviceInfo deviceInfo) {
        boolean zIsSupportInnovationResearch;
        if (Utils.o()) {
            LogUtil.j(TAG, "isOversea hide the innovation research  card");
            zIsSupportInnovationResearch = false;
        } else {
            zIsSupportInnovationResearch = isSupportInnovationResearch(deviceInfo);
            ReleaseLogUtil.d(TAG_RELEASE, "isSupportInnovationResearch: ", Boolean.valueOf(zIsSupportInnovationResearch));
        }
        return changeResponse(zIsSupportInnovationResearch);
    }

    private static boolean isSupportInnovationResearch(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        if (!eey.d(deviceInfo, 100) && eey.d(deviceInfo, 59)) {
            return true;
        }
        DeviceCapability negotiationDeviceCapability = CapabilityFactory.getNegotiationDeviceCapability(deviceInfo.getDeviceIdentify());
        if (negotiationDeviceCapability == null) {
            LogUtil.a(TAG, "isSupportInnovationResearch deviceCapability == null");
            return false;
        }
        if ((negotiationDeviceCapability.isSupportAtrialOperator() && !eei.d(deviceInfo)) || negotiationDeviceCapability.isSupportEcgAuth() || eey.d(deviceInfo, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || eey.d(deviceInfo, 95)) {
            return true;
        }
        return negotiationDeviceCapability.isSupportSleepBreathe();
    }

    public static int intelligentHomeLinkageSupport(DeviceInfo deviceInfo) {
        boolean zIsIntelligentHomeShow = IntelligentHomeUtil.isIntelligentHomeShow(deviceInfo);
        ReleaseLogUtil.d(TAG_RELEASE, "intelligentHomeLinkageSupport isIntelligentHomeShow:", Boolean.valueOf(zIsIntelligentHomeShow));
        return changeResponse(zIsIntelligentHomeShow);
    }

    public static int isSupportSleepBreathe(DeviceInfo deviceInfo) {
        boolean zB = mbt.a().b(deviceInfo);
        ReleaseLogUtil.d(TAG_RELEASE, "isSupportSleepBreathe isSupportSleepBreathe:", Boolean.valueOf(zB));
        return changeResponse(zB);
    }

    public static int checkSupportCmccAi(DeviceInfo deviceInfo) {
        boolean z = false;
        if (deviceInfo == null) {
            LogUtil.a(TAG, "checkSupportCmccAi deviceInfo is null");
        } else {
            LogUtil.a(TAG, "checkSupportCmccAi deviceInfo not null:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            boolean zD = lwd.c().d();
            boolean zE = lwd.c().e(deviceInfo, lvi.j(deviceInfo.getProductType()));
            LogUtil.a(TAG, "checkSupportCamera isSupportCmccProduct:", Boolean.valueOf(zE), "isChineseUseAndLanguage:", Boolean.valueOf(zD));
            if (zD && zE) {
                z = true;
            }
            LogUtil.a(TAG, "checkSupportCamera isSupportCmccAi:", Boolean.valueOf(z));
        }
        return changeResponse(z);
    }

    public static int checkSupportCamera(DeviceInfo deviceInfo) {
        boolean zB;
        if (deviceInfo == null) {
            LogUtil.a(TAG, "checkSupportCamera deviceInfo is null");
            zB = false;
        } else {
            LogUtil.a(TAG, "checkSupportCamera deviceInfo not null:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            meo meoVarA = meo.a();
            meoVarA.d(deviceInfo);
            zB = meoVarA.b(deviceInfo);
            LogUtil.a(TAG, "checkSupportCamera isSupport:", Boolean.valueOf(zB));
        }
        return changeResponse(zB);
    }
}
