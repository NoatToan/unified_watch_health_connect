package com.huawei.health.ecologydevice.manager;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.networkclient.BindStatusCheckResponse;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.networkclient.OnRequestCallBack;
import com.huawei.health.ecologydevice.networkclient.ResponseResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.dmv;
import defpackage.elh;
import defpackage.era;
import defpackage.etg;
import defpackage.etn;
import defpackage.lon;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class GprsDeviceHelper {
    private static final String e = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + HealthEngineRequestManager.SERVICE_SUFFIX, "");

    public interface CheckAndBindCallback {
        void onBindException();

        void onBindFinish();
    }

    public static void e(final String str, final String str2, final CheckAndBindCallback checkAndBindCallback) {
        String strB = era.b(str);
        LogUtil.a("GprsDeviceHelper", "deviceCheckAndBind request.");
        d(strB, str2, new OnRequestCallBack<BindStatusCheckResponse>() { // from class: com.huawei.health.ecologydevice.manager.GprsDeviceHelper.4
            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(BindStatusCheckResponse bindStatusCheckResponse) {
                if (bindStatusCheckResponse.getBindStatusCode() != 3) {
                    ReleaseLogUtil.e("DEVMGR_GprsDeviceHelper", "Check device bind state bindStatusCode:", Integer.valueOf(bindStatusCheckResponse.getBindStatusCode()));
                    checkAndBindCallback.onBindException();
                } else {
                    long deviceCode = bindStatusCheckResponse.getDeviceBindResp().getDeviceCode();
                    LogUtil.a("GprsDeviceHelper", "deviceCode:", Long.valueOf(deviceCode));
                    SharedPreferenceManager.c("thirdDeviceToApp", "deviceCode", deviceCode);
                    GprsDeviceHelper.a(str, str2, checkAndBindCallback);
                }
            }

            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("DEVMGR_GprsDeviceHelper", "Check device bind state error code:", Integer.valueOf(i), ",message:", th.getMessage());
                checkAndBindCallback.onBindException();
            }
        });
    }

    public static void c(OnRequestCallBack<BindStatusCheckResponse.DeviceBindResp> onRequestCallBack) {
        long jD = SharedPreferenceManager.d("thirdDeviceToApp", "deviceCode", 0L);
        ReleaseLogUtil.d("DEVMGR_GprsDeviceHelper", "deviceCode:", Long.valueOf(jD));
        HealthEngineRequestManager.RequestParamsBuilder requestParamsBuilder = new HealthEngineRequestManager.RequestParamsBuilder();
        requestParamsBuilder.setUrl(e + HealthEngineRequestManager.URI_UN_BIND);
        HashMap map = new HashMap(10);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + e());
        map.put("Content-type", HealthEngineRequestManager.CONTENT_TYPE);
        HashMap map2 = new HashMap(10);
        map2.put("deviceCode", Long.valueOf(jD));
        requestParamsBuilder.setRequestCallBack(onRequestCallBack);
        requestParamsBuilder.setTag("GprsDeviceHelper").setHeaderParam(map).setMethod("POST").setBodyParam(map2).create().request();
    }

    private static void d(String str, String str2, OnRequestCallBack<BindStatusCheckResponse> onRequestCallBack) {
        ReleaseLogUtil.d("DEVMGR_GprsDeviceHelper", "prodId:", str, "; code:", CommonUtil.n(str2));
        HealthEngineRequestManager.RequestParamsBuilder requestParamsBuilder = new HealthEngineRequestManager.RequestParamsBuilder();
        requestParamsBuilder.setUrl(e + HealthEngineRequestManager.URI_CHECK_BIND_STATUS);
        HashMap map = new HashMap(10);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + e());
        map.put("Content-type", HealthEngineRequestManager.CONTENT_TYPE);
        HashMap map2 = new HashMap(10);
        map2.put("prodId", str);
        map2.put("uniqueId", str2);
        requestParamsBuilder.setRequestCallBack(onRequestCallBack);
        requestParamsBuilder.setTag("GprsDeviceHelper").setHeaderParam(map).setMethod("POST").setBodyParam(map2).create().request();
    }

    private static String e() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        return TextUtils.isEmpty(accountInfo) ? HealthAccessTokenUtil.getAtInstance().refreshAccessToken() : accountInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final String str, final String str2, final CheckAndBindCallback checkAndBindCallback) {
        if (((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).isBondedDevice(str2)) {
            LogUtil.a("GprsDeviceHelper", "Device is bonded");
            checkAndBindCallback.onBindFinish();
        } else {
            ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice(str, new dmv("", str, str2, str2), new IDeviceEventHandler() { // from class: com.huawei.health.ecologydevice.manager.GprsDeviceHelper.5
                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onDeviceFound(HealthDevice healthDevice) {
                    LogUtil.d("GprsDeviceHelper", "onDeviceFound");
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onScanFailed(int i) {
                    LogUtil.d("GprsDeviceHelper", "onScanFailed code:", Integer.valueOf(i));
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onStateChanged(int i) {
                    LogUtil.a("GprsDeviceHelper", "onStateChanged code :", Integer.valueOf(i));
                    if (i == 7) {
                        String str3 = str;
                        String str4 = str2;
                        etg.d(str3, str4, str4);
                        checkAndBindCallback.onBindFinish();
                        LogUtil.a("GprsDeviceHelper", "Bind Success");
                        return;
                    }
                    checkAndBindCallback.onBindException();
                    LogUtil.a("GprsDeviceHelper", "Local Bind Error");
                }
            });
        }
    }

    public static void a(Activity activity, final String str, final OnRequestCallBack<ResponseResult> onRequestCallBack) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            etn.b(activity, activity.getString(R.string.nps_user_survey_no_net), false);
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("GprsDeviceHelper", "getSinoAt getAccessToken null");
            accountInfo = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
        }
        final String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(accountInfo2)) {
            LogUtil.a("GprsDeviceHelper", "getSinoAt getAccessToken null");
            etn.b(activity, activity.getString(R.string.IDS_watchface_pay_failed), false);
            return;
        }
        LogUtil.a("GprsDeviceHelper", "getSinoAt request.");
        OnRequestCallBack<ResponseResult> onRequestCallBack2 = new OnRequestCallBack<ResponseResult>() { // from class: com.huawei.health.ecologydevice.manager.GprsDeviceHelper.1
            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ResponseResult responseResult) {
                LogUtil.a("GprsDeviceHelper", "getSinoAt onSuccess");
                GprsDeviceHelper.e(accountInfo2, str, responseResult.getAccessToken(), onRequestCallBack);
            }

            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("DEVMGR_GprsDeviceHelper", "getSinoAt onFail errorCode:", Integer.valueOf(i), ",throwable:", th.toString());
            }
        };
        String str2 = GRSManager.c(BaseApplication.getContext()).getUrl(HealthEngineRequestManager.GRS_KEY) + HealthEngineRequestManager.URL_THIRDACCESSTOKENS_SINOCARE;
        HashMap map = new HashMap(10);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        new HealthEngineRequestManager.RequestParamsBuilder().setTag("GprsDeviceHelper").setUrl(str2).setHeaderParam(map).setMethod("GET").setRequestCallBack(onRequestCallBack2).create().request();
    }

    public static void e(String str, String str2, String str3, OnRequestCallBack<ResponseResult> onRequestCallBack) {
        String str4 = lon.c().d("domain_ecs_tmqyt_sino") + HealthEngineRequestManager.URL_BLOODSUGAR_UNBINDDEVICE;
        HashMap map = new HashMap(10);
        map.put(HealthEngineRequestManager.PARAMS_NAME_USER_ID, str);
        map.put(HealthEngineRequestManager.PARAMS_DEVICE_SN, str2);
        HashMap map2 = new HashMap(10);
        map2.put(HealthEngineRequestManager.PARAMS_SINO_AUTH, str3);
        new HealthEngineRequestManager.RequestParamsBuilder().setTag("GprsDeviceHelper").setUrl(str4).setHeaderParam(map2).setBodyParam(map).setMethod("POST").setRequestCallBack(onRequestCallBack).create().request();
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("GprsDeviceHelper", "isGprsNative productId is null");
            return false;
        }
        elh elhVarB = ResourceManager.c().b(str);
        return elhVarB != null && "PRO_GPRS".equals(elhVarB.u()) && "1".equals(elhVarB.g());
    }
}
