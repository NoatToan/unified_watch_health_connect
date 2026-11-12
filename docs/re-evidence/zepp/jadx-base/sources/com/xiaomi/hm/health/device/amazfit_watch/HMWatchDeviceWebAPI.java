package com.xiaomi.hm.health.device.amazfit_watch;

import android.text.TextUtils;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.amazfit_watch.model.DeviceCloudConfig;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class HMWatchDeviceWebAPI {
    public static final String PARAM_BIND_ENTRY_CONFIG = "huami.preLaunch.bindEntry";
    public static final String PARAM_VULTURE_CONFIG = "huami.preLaunch.vulture";
    public static final String TAG = "HMWatchDeviceWebAPI";
    private static final String a = "v1/watch/binds.json";
    private static final String b = "apps/%s/settings";
    private static final String c = "settingName";
    private static final String d = "mode";
    private static final String e = "adcode";
    private static final long f = 10000;

    public interface CloudDeviceConfigCallback {
        void onFail();

        void onSuccess(String str, String str2);
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public a(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a.copy(hMHttpResponseData);
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public b(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a.copy(hMHttpResponseData);
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ CloudDeviceConfigCallback a;
        public final /* synthetic */ String b;

        public c(CloudDeviceConfigCallback cloudDeviceConfigCallback, String str) {
            this.a = cloudDeviceConfigCallback;
            this.b = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onFail();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onFail();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            String str = hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody()) : "";
            if (TextUtils.isEmpty(str)) {
                this.a.onFail();
            } else {
                this.a.onSuccess(this.b, str);
            }
        }
    }

    public class d implements CloudDeviceConfigCallback {
        public final /* synthetic */ DeviceCloudConfig[] a;
        public final /* synthetic */ CountDownLatch b;

        public d(DeviceCloudConfig[] deviceCloudConfigArr, CountDownLatch countDownLatch) {
            this.a = deviceCloudConfigArr;
            this.b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI.CloudDeviceConfigCallback
        public void onFail() {
            this.b.countDown();
        }

        @Override // com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI.CloudDeviceConfigCallback
        public void onSuccess(String str, String str2) {
            HMLog.i(HMWatchDeviceWebAPI.TAG, "requestParams: " + str + ", responseStr: " + str2, new Object[0]);
            this.a[0] = DeviceCloudConfigUtils.transformCloudDeviceConfig(str, str2);
            this.b.countDown();
        }
    }

    public class e extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public e(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a.copy(hMHttpResponseData);
        }
    }

    private static String a(String str) {
        return HMServerDef.getUrl(str);
    }

    public static void asyncRequestCloudDeviceConfig(String str, CloudDeviceConfigCallback cloudDeviceConfigCallback) {
        String strA = a(String.format("apps/%s/settings", HMAppConfig.getPackageName()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("settingName", str);
        systemParams.put("mode", "SINGLE");
        systemParams.put("adcode", DeviceXFunctionsKt.getWeatherApi().getLocationCode());
        HMWebUtil.doRequest(strA, systemParams, Support.RequestSupport.GET, false, new c(cloudDeviceConfigCallback, str));
    }

    public static void bindWatch(HMWebBindInfo hMWebBindInfo, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, boolean z) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("brand", hMWebBindInfo.getPhoneBrand());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_PHONE_MODEL, hMWebBindInfo.getPhoneModel());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_PHONE_SYSTEM, hMWebBindInfo.getPhoneSystem());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_SOFT_VERSION, hMWebBindInfo.getSoftVersion());
        systemParams.put("device_type", Integer.valueOf(hMWebBindInfo.getDeviceType()));
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_FW_VERSION, hMWebBindInfo.getFwVersion());
        systemParams.put("device_source", Integer.valueOf(hMWebBindInfo.getDeviceSource()));
        systemParams.put("mac", hMWebBindInfo.getMacAddress());
        systemParams.put("deviceid", hMWebBindInfo.getDeviceId());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BIND_TIME, Long.valueOf(hMWebBindInfo.getBindTime() / 1000));
        systemParams.put("code", Integer.valueOf(hMWebBindInfo.getUserIdCode()));
        systemParams.put("sn", hMWebBindInfo.getSN());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY, hMWebBindInfo.getAuthKey());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION, hMWebBindInfo.getHrFwVersion());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_TIME_ZONE, Integer.valueOf(ProfileUtils.getTimezoneKey(Calendar.getInstance().getTimeZone())));
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, Integer.valueOf(hMWebBindInfo.getActiveStatus()));
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, hMWebBindInfo.getDisplayName());
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_ENABLE_MULTI_DEVICE, Boolean.valueOf(hMWebBindInfo.isEnableMultiDevice()));
        HMWebUtil.doRequest(a(a), systemParams, Support.RequestSupport.POST, z, iHMBasicHttpResponseHandler);
    }

    public static DeviceCloudConfig getDeviceConfigSync(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        DeviceCloudConfig[] deviceCloudConfigArr = {null};
        asyncRequestCloudDeviceConfig(str, new d(deviceCloudConfigArr, countDownLatch));
        try {
            HMLog.i(TAG, "start wait~", new Object[0]);
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            HMLog.i(TAG, "getDeviceConfig: " + e2.getMessage(), new Object[0]);
        }
        return deviceCloudConfigArr[0];
    }

    public static String getPreLaunch(String str) {
        String strA = a(String.format("apps/%s/settings", HMAppConfig.getPackageName()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("settingName", str);
        systemParams.put("mode", "SINGLE");
        systemParams.put("adcode", DeviceXFunctionsKt.getWeatherApi().getLocationCode());
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMWebUtil.doRequest(strA, systemParams, Support.RequestSupport.GET, true, new e(hMHttpResponseData));
        return hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody()) : "";
    }

    public static String requestCloudDeviceConfig(String str) {
        String strA = a(String.format("apps/%s/settings", HMAppConfig.getPackageName()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("settingName", str);
        systemParams.put("mode", "SINGLE");
        systemParams.put("adcode", DeviceXFunctionsKt.getWeatherApi().getLocationCode());
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMWebUtil.doRequest(strA, systemParams, Support.RequestSupport.GET, true, new b(hMHttpResponseData));
        return hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody()) : "";
    }

    public static void unbindWatch(String str, String str2, int i, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, boolean z) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device_type", Integer.valueOf(HMDeviceType.WATCH.getValue()));
        systemParams.put("device_source", Integer.valueOf(i));
        systemParams.put("mac", str);
        systemParams.put("deviceid", str2);
        HMWebUtil.doRequest(a(a), systemParams, Support.RequestSupport.DELETE, z, iHMBasicHttpResponseHandler);
    }

    public static boolean unbindWatchSync(String str, String str2, int i) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device_type", Integer.valueOf(HMDeviceType.WATCH.getValue()));
        systemParams.put("device_source", Integer.valueOf(i));
        systemParams.put("mac", str);
        systemParams.put("deviceid", str2);
        String strA = a(a);
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMWebUtil.doRequest(strA, systemParams, Support.RequestSupport.DELETE, true, new a(hMHttpResponseData));
        return hMHttpResponseData.isSuccess();
    }
}
