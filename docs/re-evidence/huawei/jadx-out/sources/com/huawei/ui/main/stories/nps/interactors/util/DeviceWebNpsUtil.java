package com.huawei.ui.main.stories.nps.interactors.util;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.websurvey.NpsBuilder;
import com.huawei.phoneservice.websurvey.NpsListener;
import com.huawei.phoneservice.websurvey.NpsSdkManager;
import com.huawei.phoneservice.websurvey.NpsSurveyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.DeviceParamProvider;
import com.huawei.ui.main.stories.nps.interactors.mode.DeviceWebNpsConfig;
import com.huawei.ui.main.stories.nps.interactors.mode.DeviceWebSurveyInfo;
import com.huawei.ui.main.stories.nps.interactors.mode.DualDeviceParamProvider;
import com.huawei.ui.main.stories.nps.interactors.mode.SdkCommonParams;
import com.huawei.ui.main.stories.nps.interactors.mode.SingleDeviceParamProvider;
import defpackage.cpl;
import defpackage.cql;
import defpackage.ecu;
import defpackage.lmf;
import defpackage.nio;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceWebNpsUtil {
    private static final int MILLIS_IN_DAY = 86400000;
    private static final String NPS_LAST_REQUEST_TIME_KEY = "nps_last_request_time_key";
    private static final String NPS_RESULT_KEY = "nps_result_key";
    private static final String NPS_SAVE_RESULT_TIME_KEY = "nps_save_result_time_key";
    private static final String NPS_SDK_REQUEST_BI = "1";
    private static final String NPS_SDK_RESPONSE_BI = "2";
    private static final String NPS_SDK_RESPONSE_ERROR_BI = "4";
    private static final String NPS_SDK_RESPONSE_LINK_SUCCESS_BI = "3";
    public static final int NPS_WEAR_DEVICE_TYPE = 1;
    public static final int NPS_WEIGHT_DEVICE_TYPE = 2;
    private static final String RECENT_CONNECT_WEIGHT_DEVICE_KEY = "recent_connect_weight_device_key";
    private static final String TAG = "DeviceWebNpsUtil";
    private static final String TAG_RELEASE = "R_DeviceWebNpsUtil";
    private static final byte TYPE_ACTIVATION_TIME = 2;
    private static final byte TYPE_ODID = 1;

    public static void getWebSurvey(Activity activity, DeviceParamProvider deviceParamProvider, final String str) {
        if (activity == null || deviceParamProvider == null || TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getWebSurvey, params is null");
            return;
        }
        if (isNeedToRequest(str)) {
            HashMap map = new HashMap(SdkCommonParams.getCommonParams());
            map.putAll(deviceParamProvider.getSpecificParams());
            LogUtil.a(TAG, "NPS参数:", map.toString());
            NpsBuilder npsBuilder = new NpsBuilder();
            for (Map.Entry entry : map.entrySet()) {
                npsBuilder.set((String) entry.getKey(), (String) entry.getValue());
            }
            setGetWebSurveyBI("1", "");
            NpsSdkManager.getINSTANCE().getSurvey(npsBuilder, activity, getBaseUrl(), new NpsListener() { // from class: com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil$$ExternalSyntheticLambda0
                @Override // com.huawei.phoneservice.websurvey.NpsListener
                public final void onResult(NpsSurveyResponse npsSurveyResponse, Throwable th) {
                    DeviceWebNpsUtil.lambda$getWebSurvey$0(str, npsSurveyResponse, th);
                }
            }, NpsSurveyResponse.class);
        }
    }

    static /* synthetic */ void lambda$getWebSurvey$0(String str, NpsSurveyResponse npsSurveyResponse, Throwable th) {
        setGetWebSurveyBI("2", "");
        saveLastNpsRequestTime(str);
        ReleaseLogUtil.d(TAG_RELEASE, "NPS SDK返回结果:result = ", Boolean.valueOf(npsSurveyResponse != null), ", error:", ExceptionUtils.c(th));
        if (th instanceof FaqWebServiceException) {
            FaqWebServiceException faqWebServiceException = (FaqWebServiceException) th;
            ReleaseLogUtil.d(TAG_RELEASE, "getWebSurvey, FaqWebServiceException errorMessage:", faqWebServiceException.message, ", errorCode:", Integer.valueOf(faqWebServiceException.errorCode));
            setGetWebSurveyBI("4", String.valueOf(faqWebServiceException.errorCode));
        } else if (th instanceof Exception) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWebSurvey, Exception");
            setGetWebSurveyBI("4", "Exception");
        } else {
            if (npsSurveyResponse != null && !TextUtils.isEmpty(npsSurveyResponse.getNpsLink())) {
                LogUtil.a(TAG, "NpsLink: ", npsSurveyResponse.getNpsLink(), ", PushWindow: ", npsSurveyResponse.getPushWindow(), ", KeepAliveDays: ", npsSurveyResponse.getKeepAliveDays());
                saveNpsResponse(npsSurveyResponse, str);
                saveNpsResponseTime(str);
                setGetWebSurveyBI("3", "");
                return;
            }
            setGetWebSurveyBI("4", "");
        }
    }

    public static void saveLastNpsRequestTime(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "saveLastNpsRequestTime, deviceId is null");
            return;
        }
        SharedPreferenceManager.c(String.valueOf(10004), NPS_LAST_REQUEST_TIME_KEY + nio.c(str), System.currentTimeMillis());
        LogUtil.a(TAG, "saveNpsRequestTime success");
    }

    public static long getLastNpsRequestTime(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getLastNpsRequestTime, deviceId is null");
            return 0L;
        }
        long jD = SharedPreferenceManager.d(String.valueOf(10004), NPS_LAST_REQUEST_TIME_KEY + nio.c(str), 0L);
        LogUtil.a(TAG, "getNpsRequestTime success lastRequestTime：", Long.valueOf(jD));
        return jD;
    }

    public static void saveNpsResponse(NpsSurveyResponse npsSurveyResponse, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "saveNpsResult, deviceId is null");
            return;
        }
        if (npsSurveyResponse == null) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), NPS_RESULT_KEY + nio.c(str), "", new StorageParams());
            return;
        }
        String strD = HiJsonUtil.d(npsSurveyResponse);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), NPS_RESULT_KEY + nio.c(str), strD, new StorageParams());
        LogUtil.a(TAG, "saveNpsResult success result = : ", strD);
    }

    public static NpsSurveyResponse getNpsResponse(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getNpsResponse, deviceId is null");
            return null;
        }
        return (NpsSurveyResponse) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), NPS_RESULT_KEY + nio.c(str)), NpsSurveyResponse.class);
    }

    public static void saveNpsResponseTime(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "saveNpsResponseTime, deviceId is null");
            return;
        }
        SharedPreferenceManager.c(String.valueOf(10004), NPS_SAVE_RESULT_TIME_KEY + nio.c(str), System.currentTimeMillis());
        LogUtil.a(TAG, "saveNpsResponseTime success");
    }

    public static long getSaveNpsResponseTime(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getSaveNpsResultTime, deviceId is null");
            return 0L;
        }
        long jD = SharedPreferenceManager.d(String.valueOf(10004), NPS_SAVE_RESULT_TIME_KEY + nio.c(str), 0L);
        LogUtil.a(TAG, "getSaveNpsResultTime success, saveTime: ", Long.valueOf(jD));
        return jD;
    }

    public static void saveRecentConnectWeightDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "saveRecentConnectWeightDevice, mac is empty");
            return;
        }
        StorageParams storageParams = new StorageParams();
        storageParams.e(1);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), RECENT_CONNECT_WEIGHT_DEVICE_KEY, str, storageParams);
        LogUtil.a(TAG, "saveRecentConnectWeightDevice success for mac: ", CommonUtil.n(str));
    }

    public static String getRecentConnectWeightDevice() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), RECENT_CONNECT_WEIGHT_DEVICE_KEY);
        LogUtil.a(TAG, "getRecentConnectWeightDevice, mac: ", CommonUtil.n(strE));
        return strE;
    }

    public static boolean curDeviceIsSupportWebNps(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        DeviceWebNpsConfig deviceWebNpsConfig = (DeviceWebNpsConfig) ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).getConfig("deviceWebNPS", DeviceWebNpsConfig.class);
        if (deviceWebNpsConfig == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "deviceWebNPS is null");
            return false;
        }
        LogUtil.a(TAG, "deviceWebNPSConfig = ", deviceWebNpsConfig.toString());
        if (deviceWebNpsConfig.isAllOpen()) {
            return true;
        }
        Map<String, List<String>> deviceWhiteList = deviceWebNpsConfig.getDeviceWhiteList();
        if (deviceWhiteList == null || deviceWhiteList.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "deviceWhiteList is null");
            return false;
        }
        String str2 = str.split(Constants.LINK)[0];
        if (!deviceWhiteList.containsKey(str2)) {
            return false;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            return false;
        }
        String strSubstring = accountInfo.substring(accountInfo.length() - 1);
        List<String> list = deviceWhiteList.get(str2);
        return list != null && list.contains(strSubstring);
    }

    public static void stratToGetWearDeviceNpsLink(final Activity activity, final DeviceInfo deviceInfo) {
        LogUtil.a(TAG, "stratToGetNpsLink");
        if (deviceInfo == null) {
            LogUtil.a(TAG, "stratToGetNpsLink deviceInfo is null");
        } else if (deviceInfo.getSportVersion() != 1 || deviceInfo.getSingleFrameDevice() != 1) {
            getWebSurvey(activity, new DualDeviceParamProvider(deviceInfo), deviceInfo.getDeviceIdentify());
        } else {
            DeviceNpsSampleEventUtil.getInstance().requestDeviceNpsData(deviceInfo, new SampleEventCallback() { // from class: com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil.1
                @Override // com.huawei.ui.main.stories.nps.interactors.util.SampleEventCallback
                public void onSuccess(cql.c cVar) {
                    String strE = cVar.e((byte) 1, "");
                    String strE2 = cVar.e((byte) 2, "0");
                    ReleaseLogUtil.d(DeviceWebNpsUtil.TAG_RELEASE, "nps requestDeviceNpsInfo success, odid = ", cpl.e(strE), ", activationTime = ", strE2);
                    if ("0".equals(strE2)) {
                        return;
                    }
                    DeviceWebNpsUtil.getWebSurvey(activity, new SingleDeviceParamProvider(deviceInfo.getSoftVersion(), strE, strE2, deviceInfo.getCertModel()), deviceInfo.getDeviceIdentify());
                }

                @Override // com.huawei.ui.main.stories.nps.interactors.util.SampleEventCallback
                public void onError() {
                    LogUtil.a(DeviceWebNpsUtil.TAG, "nps requestDeviceNpsInfo failed");
                }
            });
        }
    }

    private static boolean isNeedToRequest(String str) {
        if (CommonUtil.ap()) {
            LogUtil.j(TAG, "getWebSurvey isBetaVersion");
            return false;
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWebSurvey is not NetworkConnected");
            return false;
        }
        boolean z = !(Math.abs(System.currentTimeMillis() - getLastNpsRequestTime(str)) < 86400000);
        ReleaseLogUtil.e(TAG_RELEASE, "isNeedToRequest: ", Boolean.valueOf(z));
        return z;
    }

    private static String getBaseUrl() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSgwCcpcHuawei");
        if (SharedPreferenceManager.b(String.valueOf(10004), "device_nps_test_environment_switch", false)) {
            url = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10004), "device_nps_test_site");
        }
        LogUtil.a(TAG, "getBaseUrl:", url);
        return url;
    }

    public static boolean isShowDeviceWebNps() {
        LogUtil.a(TAG, "isShowDeviceWebNps enter");
        DeviceWebSurveyInfo deviceWebSurveyInfo = getDeviceWebSurveyInfo();
        if (deviceWebSurveyInfo.getNpsSurveyResponse() == null || TextUtils.isEmpty(deviceWebSurveyInfo.getNpsSurveyResponse().getNpsLink())) {
            LogUtil.a(TAG, "isShowDeviceWebNps npsLink is empty");
            return false;
        }
        NpsSurveyResponse npsSurveyResponse = deviceWebSurveyInfo.getNpsSurveyResponse();
        String keepAliveDays = npsSurveyResponse.getKeepAliveDays();
        if (TextUtils.isEmpty(keepAliveDays)) {
            keepAliveDays = "15";
        }
        return Math.abs(System.currentTimeMillis() - getSaveNpsResponseTime(deviceWebSurveyInfo.getDeviceId())) < CommonUtil.m(BaseApplication.getContext(), keepAliveDays) * 86400000 && isCurrentTimeInPushWindow(npsSurveyResponse.getPushWindow());
    }

    public static DeviceWebSurveyInfo getDeviceWebSurveyInfo() {
        NpsSurveyResponse npsResponse;
        String recentConnectWeightDevice;
        int i;
        DeviceInfo connectDevice = getConnectDevice();
        if (connectDevice == null) {
            npsResponse = null;
            recentConnectWeightDevice = "";
            i = -1;
        } else {
            recentConnectWeightDevice = connectDevice.getDeviceIdentify();
            npsResponse = getNpsResponse(recentConnectWeightDevice);
            i = 1;
        }
        if (npsResponse == null || TextUtils.isEmpty(npsResponse.getNpsLink())) {
            recentConnectWeightDevice = getRecentConnectWeightDevice();
            npsResponse = getNpsResponse(recentConnectWeightDevice);
            i = 2;
        }
        return new DeviceWebSurveyInfo(npsResponse, recentConnectWeightDevice, i);
    }

    private static boolean isCurrentTimeInPushWindow(String str) {
        LogUtil.a(TAG, "isCurrentTimeInPushWindow pushWindow = ", str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<List> list = (List) HiJsonUtil.d(str, new TypeToken<List<List<Integer>>>() { // from class: com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil.2
        }.getType());
        if (njy.e(list)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(9);
            arrayList.add(23);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(arrayList);
            list = arrayList2;
        }
        int i = Calendar.getInstance().get(11);
        for (List list2 : list) {
            if (list2.size() >= 2) {
                int iIntValue = ((Integer) list2.get(0)).intValue();
                int iIntValue2 = ((Integer) list2.get(1)).intValue();
                if (iIntValue2 <= iIntValue) {
                    if (i >= iIntValue || i < iIntValue2) {
                        return true;
                    }
                } else if (i >= iIntValue && i < iIntValue2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static DeviceInfo getConnectDevice() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, TAG);
        if (njy.e(deviceList)) {
            LogUtil.a(TAG, "currentDeviceInfo is null");
            return null;
        }
        return deviceList.get(0);
    }

    private static void setGetWebSurveyBI(String str, String str2) {
        LogUtil.a(TAG, "nps setRequestServerBI");
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("errorCode", str2);
        }
        LogUtil.a(TAG, "setRequestServerBI map:", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.NPS_GET_QUESTION_1090040.value(), map, 0);
    }
}
