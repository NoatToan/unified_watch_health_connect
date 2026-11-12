package com.huawei.operation.h5pro.jsmodules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.json.JsonSanitizer;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.agconnect.apms.Agent;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityCertUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.devicemgr.business.entity.CertChainData;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProActivityResultCallback;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProReverseControlExecutor;
import com.huawei.health.h5pro.core.H5ProWebViewActivity;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.ErrorEnum;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiZipUtil;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudjs.JsClientApi;
import com.huawei.hwcloudjs.a;
import com.huawei.hwcloudjs.api.IAccessToken;
import com.huawei.hwcloudjs.api.TaskCallBack;
import com.huawei.hwcloudjs.service.hms.HmsCoreApi;
import com.huawei.hwcloudjs.service.hms.HmsLiteCoreApi;
import com.huawei.hwcloudjs.service.hms.bean.AccessTokenInfo;
import com.huawei.hwcloudjs.service.hms.bean.Status;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.IntentFailError;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.operation.OperationKey;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.DataTransferInterceptorImpl;
import com.huawei.operation.h5pro.TrustListCheckerImpl;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.HelpCustomerOperate;
import com.huawei.operation.utils.NetworkStatusUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyRequestParam;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.up.utils.Constants;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.ddv;
import defpackage.dmz;
import defpackage.eer;
import defpackage.eey;
import defpackage.fcn;
import defpackage.fdf;
import defpackage.fdy;
import defpackage.fga;
import defpackage.fxl;
import defpackage.fxn;
import defpackage.imx;
import defpackage.imz;
import defpackage.iov;
import defpackage.iox;
import defpackage.irz;
import defpackage.isa;
import defpackage.izo;
import defpackage.lsy;
import defpackage.ltd;
import defpackage.lua;
import defpackage.njy;
import defpackage.nql;
import defpackage.nrw;
import defpackage.nzy;
import defpackage.nzz;
import defpackage.peh;
import defpackage.qhu;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qrk;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.ThirdMobileManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class InnerApi extends JsBaseModule {
    private static final String ALL_DEVICE_LIST_CLASS = "com.huawei.ui.device.activity.adddevice.AllDeviceListActivity";
    private static final String COMMON_PARAM_KEY = "key";
    private static final String COMMON_PARAM_PATH = "path";
    private static final String COMMON_PARAM_VALUE = "value";
    private static final int DEFAULT_SHARED_DATA_MAP_SIZE = 1;
    private static final int FAIL = -1;
    private static final String FUNC_AUTH_FAIL_DESC = "request functionAuth fail.";
    private static final long INIT_CALLBACK_ID = -1;
    private static final String LOGIN_ACTIVITY_PKG = "com.huawei.health.HuaweiLoginActivity";
    private static final int REQUEST_CODE_LOAD_H5 = 10001;
    private static final int REQUEST_CODE_PAY = 10000;
    public static final int REQUEST_CODE_ROUTE_RESULT = 7667713;
    private static final int REQUEST_CODE_VERIFY_GUARDIAN_PASSWORD = 6003;
    private static final int REQUEST_IGNORE_BATTERY_CODE = 10002;
    private static final String RES_AUTH_FAIL_DESC = "request resourceAuth fail.";
    private static final String ROUTE_TO_PARAM_IS_FORE_RESULT = "isForResult";
    private static final String ROUTE_TO_PARAM_PATH = "path";
    private static final Map<String, String> SHARED_DATA_MAP = new ConcurrentHashMap(1);
    private static final String STRATEGY_NAME = "strategyNames";
    private static final int WALLET_RESTORED_CODE = 201010101;
    private H5PhoneStateListener mH5PhoneStateListener;
    private HealthCloudOperate mHealthCloudOperate;
    private List<Integer> mSuccessList;
    private SyncCloudDataListener mSyncCloudDataListener;
    private long mCallbackIdOfLoadH5ProApp = -1;
    private long mCallbackIdOfPhoneListener = 0;
    private long mCallBackRequestIgnore = -1;
    private long mCallBackIdOfRouteToNativePage = -1;
    private long mVerifyAccountCallbackId = -1;

    /* JADX INFO: loaded from: classes41.dex */
    static class SyncParam {

        @SerializedName("dataType")
        int dataType = 20000;

        @SerializedName("action")
        int action = 5;

        private SyncParam() {
        }
    }

    @JavascriptInterface
    public void exportDataToCsv(final long j, String str) {
        LogUtil.a(this.TAG, "readData origin request = ", str);
        nql.d(str, new nrw(), new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1563x58d296b8(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$exportDataToCsv$0$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1563x58d296b8(long j, int i, Object obj) {
        if (i != 0) {
            onFailureCallback(j, "");
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void syncCloud(long j, String str) {
        LogUtil.a(this.TAG, "syncCloudData start");
        try {
            SyncParam syncParam = (SyncParam) new Gson().fromJson(str, SyncParam.class);
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncAction(syncParam.action);
            hiSyncOption.setSyncDataType(syncParam.dataType);
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncMethod(2);
            hiSyncOption.setSyncScope(1);
            HiHealthManager.d(BaseApplication.b()).synCloud(hiSyncOption, null);
            onSuccessCallback(j, "");
            LogUtil.a(this.TAG, "syncCloudData end");
        } catch (JsonSyntaxException e) {
            onFailureCallback(j, e.getMessage());
            LogUtil.e(this.TAG, "syncCloud error ", e.getMessage());
        }
    }

    @JavascriptInterface
    public void syncCloudTypeList(long j, String str) {
        LogUtil.a(this.TAG, "syncCloudTypeList param ", str);
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("syncDataType");
            if (jSONArrayOptJSONArray == null) {
                ReleaseLogUtil.e(this.TAG, "syncCloudTypeList jsonArray is null");
                onFailureCallback(j, "syncCloudTypeList jsonArray is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")));
                }
            }
            if (CollectionUtils.a(arrayList)) {
                String str2 = "syncCloudTypeList syncDataTypeList " + arrayList;
                ReleaseLogUtil.e(this.TAG, str2);
                onFailureCallback(j, str2);
                return;
            }
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setForceSync(true);
            hiSyncOption.setSyncDataTypes(arrayList);
            hiSyncOption.setSyncId(System.currentTimeMillis());
            hiSyncOption.setSyncMethod(2);
            hiSyncOption.setSyncScope(1);
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncAction(0);
            HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
            onSuccessCallback(j, arrayList);
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a(this.TAG, "syncCloudTypeList exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void routeTo(long j, String str) {
        LogUtil.a(this.TAG, "routeTo param = " + str);
        if (!TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            onFailureCallback(j, ErrorEnum.NO_PERMISSION.getMsg());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "routeTo invalid param");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(BleConstants.KEY_PATH);
            boolean zOptBoolean = jSONObject.optBoolean(ROUTE_TO_PARAM_IS_FORE_RESULT, false);
            Bundle bundleAssembleRouterExtra = assembleRouterExtra(jSONObject);
            if (checkRouteToKnownParams(j, strOptString, zOptBoolean)) {
                if (!InnerApiPermissionManager.checkAccessToTargetPage(strOptString)) {
                    onFailureCallback(j, "The target page is not allowed to be accessed.");
                } else {
                    routeToNativePage(j, strOptString, zOptBoolean, bundleAssembleRouterExtra);
                }
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "routeTo fail to parse param");
        }
    }

    private void routeToNativePage(final long j, String str, final boolean z, Bundle bundle) {
        int i = z ? REQUEST_CODE_ROUTE_RESULT : -1;
        Activity activity = z ? (Activity) this.mContext : null;
        this.mCallBackIdOfRouteToNativePage = j;
        AppRouter.c(str).d(bundle).a(activity, i, new NaviCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.1
            @Override // com.huawei.haf.router.NaviCallback
            public void onFound(Guidepost guidepost) {
                LogUtil.a(InnerApi.this.TAG, "routeTo onFound");
            }

            @Override // com.huawei.haf.router.NaviCallback
            public void onLost(Guidepost guidepost) {
                LogUtil.a(InnerApi.this.TAG, "routeTo onLost");
                InnerApi.this.onFailureCallback(j, "onLost");
            }

            @Override // com.huawei.haf.router.NaviCallback
            public void onArrival(Guidepost guidepost) {
                LogUtil.a(InnerApi.this.TAG, "routeTo onArrival");
                if (z) {
                    return;
                }
                InnerApi.this.onSuccessCallback(j, "success");
            }

            @Override // com.huawei.haf.router.NaviCallback
            public void onInterrupt(Guidepost guidepost) {
                LogUtil.a(InnerApi.this.TAG, "routeTo onInterrupt");
            }
        });
    }

    private boolean checkRouteToKnownParams(long j, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "routeTo param invalid");
            return false;
        }
        if (!z || (this.mContext instanceof Activity)) {
            return true;
        }
        onFailureCallback(j, "not support");
        return false;
    }

    private Bundle assembleRouterExtra(JSONObject jSONObject) throws JSONException {
        List listAsList = Arrays.asList(BleConstants.KEY_PATH);
        Bundle bundle = new Bundle();
        if (jSONObject.length() > listAsList.size()) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!listAsList.contains(next)) {
                    putRouterExtraPer(bundle, next, jSONObject.get(next));
                }
            }
        }
        return bundle;
    }

    private void putRouterExtraPer(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JSONArray) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(peh.c(obj.toString(), String[].class));
            bundle.putStringArrayList(str, arrayList);
        } else {
            LogUtil.a(this.TAG, "routeTo putRouterExtraPer: param unknown type -> " + obj);
        }
    }

    @JavascriptInterface
    public void notifyObserver(long j, String str) {
        LogUtil.a(this.TAG, "notifyObserver callbackId ", Long.valueOf(j), " param ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("argumentList");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectOptJSONObject.optString(next));
                        }
                        if (!CollectionUtils.c(map)) {
                            arrayList.add(map);
                        }
                    }
                }
            }
            String strOptString = jSONObject.optString("label");
            if (CollectionUtils.a(arrayList)) {
                ObserverManagerUtil.e(strOptString, new Object[0]);
            } else {
                ObserverManagerUtil.e(strOptString, arrayList.toArray());
            }
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a("R_" + this.TAG, "notifyObserver exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void jumpToHome(long j, String str) {
        LogUtil.a(this.TAG, "jumpToDeviceList param = " + str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "invalid param");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString("value");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                onFailureCallback(j, "param invalid");
                return;
            }
            Context contextB = BaseApplication.b();
            Intent intent = new Intent();
            intent.setClassName(contextB, "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(strOptString, strOptString2);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            iov.d(contextB, intent);
            onSuccessCallback(j, "success");
        } catch (JSONException unused) {
            onFailureCallback(j, "fail to parse param");
        }
    }

    @JavascriptInterface
    public void getUrl(final long j, String str) {
        LogUtil.a(this.TAG, "getUrl start");
        if (this.mContext == null) {
            LogUtil.j(this.TAG, "getUrl context is null");
            return;
        }
        Context contextB = BaseApplication.b();
        if (!LoginInit.getInstance(contextB).getIsLogined()) {
            String noCheckUrl = GRSManager.c(contextB).getNoCheckUrl(str, GRSManager.c(contextB).getCommonCountryCode());
            if (TextUtils.isEmpty(noCheckUrl)) {
                onFailureCallback(j, "no login: URL is empty");
                return;
            } else {
                onSuccessCallback(j, noCheckUrl);
                return;
            }
        }
        GRSManager.c(contextB).d(str, new GrsQueryCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    InnerApi.this.onFailureCallback(j, "login: URL is empty");
                } else {
                    InnerApi.this.onSuccessCallback(j, str2);
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                InnerApi.this.onFailureCallback(j, "login: failed to obtain the URL", i);
            }
        });
    }

    @JavascriptInterface
    public void getCountryCode(long j) {
        LogUtil.a(this.TAG, "getCountryCode start");
        if (this.mContext != null) {
            String commonCountryCode = GRSManager.c(this.mContext).getCommonCountryCode();
            if (TextUtils.isEmpty(commonCountryCode)) {
                onFailureCallback(j, "The country code is empty.");
            } else {
                onSuccessCallback(j, commonCountryCode);
            }
            LogUtil.a(this.TAG, "getCountryCode end");
        }
    }

    @JavascriptInterface
    public void getDeviceInfoSync(long j) {
        LogUtil.a(this.TAG, "getDeviceInfoSync start");
        HashMap map = new HashMap();
        map.put("osVersionName", Build.ID);
        map.put("device", Build.DEVICE);
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("brand", Build.BRAND);
        map.put("isHarmony", String.valueOf(CommonUtil.bc()));
        map.put("isFoldable", String.valueOf(EnvironmentInfo.a()));
        onSuccessCallback(j, map);
        LogUtil.a(this.TAG, "getDeviceInfoSync end");
    }

    @JavascriptInterface
    public void getABTestStrategyNames(long j) {
        LogUtil.a(this.TAG, "getABTestStrategyNames");
        if (this.mContext == null) {
            LogUtil.e(this.TAG, "getABTestStrategyNames mContext == null");
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("[VIP]");
        if (isa.d()) {
            map.put(STRATEGY_NAME, arrayList);
        } else {
            map.put(STRATEGY_NAME, arrayList2);
        }
        LogUtil.a(this.TAG, STRATEGY_NAME, map);
        onSuccessCallback(j, map);
    }

    private List<String> isBlockAbMemberTab(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!"[VIP]".equals(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    @JavascriptInterface
    public void getNetworkStatus(long j) {
        LogUtil.a(this.TAG, "getNetworkStatus start");
        if (this.mContext != null) {
            onSuccessCallback(j, NetworkStatusUtils.getsInstance().getNetworkStatus(this.mContext));
            LogUtil.a(this.TAG, "getNetworkStatus end");
        }
    }

    @JavascriptInterface
    public int getMeteredType() {
        return NetworkStatusUtils.getsInstance().getWifiMeteredType(this.mContext);
    }

    @JavascriptInterface
    public void updateAuthInfo() {
        LogUtil.a(this.TAG, "updateAuthInfo");
        LoginInit.login(this.mContext, new ILoginCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.3
            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginSuccess(Object obj) {
                LogUtil.a(InnerApi.this.TAG, "updateAuthInfo success");
            }

            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginFailed(Object obj) {
                LogUtil.j(InnerApi.this.TAG, "updateAuthInfo fail");
            }
        });
    }

    @JavascriptInterface
    public void browseToLogin(long j) {
        LogUtil.a(this.TAG, "browseToLogin");
        if (LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a(this.TAG, "need login");
            onFailureCallback(j, "unlogin");
        } else {
            LogUtil.a(this.TAG, "logined");
            onSuccessCallback(j, "");
        }
    }

    @JavascriptInterface
    public void getAuthInfo(final long j) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1564x357b15b8(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getAuthInfo$1$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1564x357b15b8(long j) {
        String str;
        if (this.mContext == null) {
            LogUtil.j(this.TAG, "getAuthInfo: mContext is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LoginInit loginInit = LoginInit.getInstance(this.mContext);
            String accountInfo = loginInit.getAccountInfo(1019);
            jSONObject.put("accountTypeHms", accountInfo);
            if (String.valueOf(1).equals(accountInfo)) {
                jSONObject.put(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, "1");
            } else {
                jSONObject.put(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, loginInit.getAccountInfo(1004));
            }
            jSONObject.put("deviceType", loginInit.getDeviceType());
            jSONObject.put("siteId", loginInit.getAccountInfo(1009));
            jSONObject.put("language", LanguageUtil.a());
            jSONObject.put(CardMgrSdkConst.CardInfoDesc.PARAMS_LANGUAGE_TAG, getLanguageTag());
            jSONObject.put("agreementLanguage", iox.b());
            jSONObject.put("appId", BaseApplication.d());
            jSONObject.put("appType", "1");
            jSONObject.put("sysVersion", Build.VERSION.RELEASE);
            jSONObject.put("timeZone", HiDateUtil.c(""));
            jSONObject.put("appVersion", CommonUtil.c(BaseApplication.b()));
            jSONObject.put("countryCode", GRSManager.c(this.mContext).getCommonCountryCode());
            jSONObject.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
            jSONObject.put("phoneDeviceType", PhoneInfoUtils.getDeviceModel());
            jSONObject.put("isMobileAppEngine", EnvironmentInfo.m());
            jSONObject.put(FaqConstants.FAQ_EMUIVERSION, CommonUtil.p());
            jSONObject.put("firmware", Build.DISPLAY);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(QuestionSurveyRequestParam.CVERISON, CommonUtil.e(BaseApplication.b()));
            jSONObject.put("os", Agent.OS_NAME + Build.VERSION.RELEASE);
            jSONObject.put("isHuaweiSystem", CommonUtil.bg());
            if (CommonUtil.ap()) {
                str = "beta";
            } else {
                str = CommonUtil.cl() ? BleConstants.WEIGHT_KEY : "default";
            }
            jSONObject.put(a.d, str);
            putSensitiveData(jSONObject);
            onSuccessCallback(j, jSONObject);
        } catch (Exception e) {
            LogUtil.e(this.TAG, "getAuthInfo: exception -> " + e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    private void putSensitiveData(JSONObject jSONObject) throws JSONException {
        if (TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            LoginInit loginInit = LoginInit.getInstance(this.mContext);
            String accountInfo = loginInit.getAccountInfo(1015);
            if (TextUtils.isEmpty(accountInfo)) {
                jSONObject.put("token", DataTransferInterceptorImpl.TOKEN_PLACEHOLDER);
                jSONObject.put("tokenType", Integer.parseInt("1"));
                LogUtil.a(this.TAG, "putSensitiveData: at is empty");
                JsInteractAddition.getInstance().reportErrorCode(OperationKey.HEALTH_APP_H5_ERROR_CODE_80060003.value(), JsInteractAddition.BI_ERROR_CODE_INVALID_AT);
            } else {
                jSONObject.put("token", accountInfo);
                jSONObject.put("accessToken", accountInfo);
                jSONObject.put("tokenType", Integer.parseInt("2"));
            }
            jSONObject.put("huid", loginInit.getAccountInfo(1011));
            jSONObject.put("accountName", loginInit.getAccountInfo(1001));
            jSONObject.put("deviceSN", "");
            jSONObject.put("deviceId", loginInit.getDeviceId());
        }
    }

    private String getLanguageTag() {
        if (this.mContext == null) {
            LogUtil.j(this.TAG, "getLanguageTag: mContext is null");
            return "";
        }
        return this.mContext.getResources().getConfiguration().locale.toLanguageTag();
    }

    private boolean isInScope(long j) {
        if (TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            return true;
        }
        LogUtil.j(this.TAG, "authentication failed");
        onFailureCallback(j, "authentication failed");
        return false;
    }

    @JavascriptInterface
    public void getUserInfo(long j) {
        LogUtil.a(this.TAG, Constants.METHOD_GET_USER_INFO);
        if (isInScope(j)) {
            LoginInit loginInit = LoginInit.getInstance(this.mContext);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JsbMapKeyNames.H5_USER_ID, loginInit.getAccountInfo(1011));
                jSONObject.put("accountName", loginInit.getAccountInfo(1000));
                jSONObject.put("accountPlaintextName", loginInit.getAccountInfo(1001));
                jSONObject.put(HwPayConstant.KEY_USER_NAME, loginInit.getAccountInfo(1002));
                jSONObject.put("userPic", loginInit.getAccountInfo(1003));
                jSONObject.put(CommonConstant.KEY_GENDER, loginInit.getAccountInfo(1005));
                jSONObject.put("birthDate", loginInit.getAccountInfo(1006));
                onSuccessCallback(j, jSONObject);
            } catch (JSONException e) {
                onFailureCallback(j, e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public void browsingToLogin(final long j) {
        Log.i(this.TAG, "start browsingToLogin");
        LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                InnerApi.this.onSuccessCallback(j, Integer.valueOf(i));
            }
        }, "");
    }

    @JavascriptInterface
    public void getVipInfo(final long j) {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j(this.TAG, "vipApi is null.");
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.5
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    LogUtil.a(InnerApi.this.TAG, "getVipInfo on Success.");
                    InnerApi.this.onSuccessCallback(j, obj);
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    LogUtil.j(InnerApi.this.TAG, "getVipInfo on failure.");
                    InnerApi.this.onFailureCallback(j, str, i);
                }
            });
        }
    }

    @JavascriptInterface
    public void getProductState(final long j, String str) {
        LogUtil.d(this.TAG, "productId:", str);
        LogUtil.a(this.TAG, "getProductState callbackId:", Long.valueOf(j));
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(this.TAG, "getProductState payApi is null.");
            onFailureCallback(j, "payApi is null.");
        } else {
            payApi.getProductState(str, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("R_" + InnerApi.this.TAG, "getProductState onResponse.");
                    if (i == 0) {
                        InnerApi.this.onSuccessCallback(j, obj);
                    } else {
                        InnerApi.this.onFailureCallback(j, "getProductState error.", i);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void buyByProductId(final long j, String str) {
        LogUtil.a(this.TAG, "productId:", str);
        LogUtil.a(this.TAG, "buyByProductId callbackId:", Long.valueOf(j));
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(this.TAG, "buyByProductId payApi is null.");
            onFailureCallback(j, "payApi is null.");
            return;
        }
        Map<String, String> globalParams = Analyzer.getGlobalParams();
        final String trigResType = null;
        if (globalParams != null) {
            ProductInfo productInfo = (ProductInfo) qqt.e(str, ProductInfo.class);
            if (productInfo != null) {
                productInfo.setBiParams(globalParams);
                trigResType = productInfo.getTrigResType();
            }
            ReleaseLogUtil.d(this.TAG, "buyByProductId Analyzer.getGlobalParams() = ", globalParams.toString());
            str = qqt.b(productInfo);
        } else {
            LogUtil.j(this.TAG, "Analyzer.getGlobalParams() is empty");
        }
        H5ProBridgeManager.getInstance().registerActivityResultCallback(10000, new H5ProActivityResultCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.7
            @Override // com.huawei.health.h5pro.core.H5ProActivityResultCallback
            public void onResult(Intent intent) {
                LogUtil.a(InnerApi.this.TAG, "buyByProductId finish callbackId:", Long.valueOf(j));
                int intExtra = -1;
                if (intent == null) {
                    LogUtil.j(InnerApi.this.TAG, "intent is null.");
                } else {
                    intExtra = intent.getIntExtra("shoppingResult", -1);
                }
                LogUtil.a(InnerApi.this.TAG, "shoppingResult:", Integer.valueOf(intExtra));
                InnerApi.this.firstOpenVipShowGuide(intExtra, trigResType);
                InnerApi.this.onSuccessCallback(j, Integer.valueOf(intExtra));
            }
        });
        if (this.mContext instanceof Activity) {
            payApi.buyByProductId((Activity) this.mContext, 10000, str);
        } else {
            LogUtil.j(this.TAG, "context is not activity.");
            payApi.buyByProductId(BaseApplication.j(), 10000, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void firstOpenVipShowGuide(int i, String str) {
        if (i == 0 && TextUtils.equals(str, "1000")) {
            UserMemberInfo userMemberInfoA = irz.a();
            fcn.a(!(userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1));
        }
    }

    @JavascriptInterface
    public void getAccessToken(long j) {
        LogUtil.a(this.TAG, "getAccessToken");
        if (isInScope(j)) {
            String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
            if (!TextUtils.isEmpty(accountInfo)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("at", accountInfo);
                    onSuccessCallback(j, jSONObject);
                    return;
                } catch (JSONException e) {
                    onFailureCallback(j, e.getMessage());
                    return;
                }
            }
            onFailureCallback(j, "AT is empty");
        }
    }

    @JavascriptInterface
    public void loadH5ProApp(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "loadH5ProApp: invalid param");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(SdkCfgSha256Record.PKGNAME);
            String strOptString2 = jSONObject.optString(BleConstants.KEY_PATH);
            boolean zOptBoolean = jSONObject.optBoolean(ROUTE_TO_PARAM_IS_FORE_RESULT, false);
            boolean zOptBoolean2 = jSONObject.optBoolean("isNewSingleInstance", false);
            int iOptInt = jSONObject.optInt("startMode", 0);
            String strOptString3 = jSONObject.optString("customizeArgs", "");
            Map<String, Object> mapJson = !TextUtils.isEmpty(strOptString3) ? GsonUtil.parseMapJson(strOptString3) : null;
            boolean zOptBoolean3 = jSONObject.optBoolean("isExit", false);
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, "pkgName is empty");
                return;
            }
            this.mCallbackIdOfLoadH5ProApp = j;
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath(strOptString2);
            builder.setIsForResult(zOptBoolean);
            if (zOptBoolean) {
                builder.setRequestCode(10001);
            }
            if (zOptBoolean2) {
                builder.setActivityStartFlag(67108864);
            }
            parseCustomizeArgs(mapJson, builder);
            LogUtil.a(this.TAG, "loadH5ProApp pkgName = " + strOptString + ", path=" + strOptString2);
            clearTopActivitiesOnCondition(zOptBoolean3, iOptInt, strOptString);
            if (iOptInt != 2) {
                builder.setStartMode(iOptInt);
            }
            ddv.b().loadH5ProApp(this.mContext, strOptString, builder);
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    private void parseCustomizeArgs(Map<String, Object> map, H5ProLaunchOption.Builder builder) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (!TextUtils.isEmpty(str) && (obj instanceof String)) {
                builder.addCustomizeArg(str, String.valueOf(obj));
            } else {
                LogUtil.a(this.TAG, "Not supported: key = " + str + " value = " + obj);
            }
        }
    }

    private void clearTopActivitiesOnCondition(boolean z, int i, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (z && this.mH5ProInstance != null && this.mH5ProInstance.getAppInfo() != null && StringUtils.j(this.mH5ProInstance.getAppInfo().getPkgName())) {
            arrayList.add(this.mH5ProInstance.getAppInfo().getPkgName());
        }
        if (i == 2) {
            arrayList.add(str);
        }
        if (arrayList.size() > 0) {
            clearTopH5proActivities(arrayList);
        }
    }

    private void clearTopH5proActivities(ArrayList<String> arrayList) {
        Activity[] activityArrE = BaseApplication.e();
        if (activityArrE == null || activityArrE.length == 0) {
            return;
        }
        int length = activityArrE.length;
        int iMin = Math.min(arrayList.size(), length);
        for (int i = 0; i < iMin; i++) {
            final Activity activity = activityArrE[(length - i) - 1];
            if (!(activity instanceof H5ProWebViewActivity) || activity.getIntent() == null) {
                return;
            }
            String stringExtra = activity.getIntent().getStringExtra("h5Flag");
            if (StringUtils.g(stringExtra) || !arrayList.contains(stringExtra)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    activity.finish();
                }
            });
        }
    }

    @JavascriptInterface
    public void loadH5Compact(long j, String str) {
        LogUtil.a(this.TAG, "loadH5Compact");
        Intent intent = new Intent(this.mContext, (Class<?>) WebViewActivity.class);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                intent.putExtra(next, jSONObject.optString(next));
            }
            this.mContext.startActivity(intent);
            onSuccessCallback(j);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "loadH5Compact param invalid:", e.getMessage());
            onFailureCallback(j, "loadH5Compact: invalid param");
        }
    }

    @JavascriptInterface
    public void resourceAuth(final long j, int i, String str) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(this.TAG, "payApi is null in resourceAuth.");
            onFailureCallback(j, RES_AUTH_FAIL_DESC);
        } else {
            payApi.resourceAuth(i, str, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j(InnerApi.this.TAG, "resourceAuth errorCode: ", Integer.valueOf(i2));
                        InnerApi.this.onFailureCallback(j, InnerApi.RES_AUTH_FAIL_DESC, i2);
                    } else {
                        InnerApi.this.onSuccessCallback(j, obj);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void initJsAt(long j) {
        if (CommonUtil.z(BaseApplication.b())) {
            LogUtil.a(this.TAG, "initJsAt registerJsApi HmsLiteCoreApi");
            JsClientApi.registerJsApi(HmsLiteCoreApi.class);
            JsClientApi.registerIAccessTokenClass(new IAccessToken() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.9
                @Override // com.huawei.hwcloudjs.api.IAccessToken
                public void getAccessToken(TaskCallBack taskCallBack) {
                    String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1008);
                    Status status = new Status(0, "success");
                    status.setSuccessFlag(true);
                    taskCallBack.onResult(new AccessTokenInfo(accountInfo, status));
                }
            });
        } else {
            JsClientApi.registerJsApi(HmsCoreApi.class);
            LogUtil.a(this.TAG, "registerJsApi HmsCoreApi");
        }
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void functionAuth(final long j, String str) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(this.TAG, "payApi is null in functionAuth.");
            onFailureCallback(j, FUNC_AUTH_FAIL_DESC);
        } else {
            payApi.functionAuth(str, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        LogUtil.j(InnerApi.this.TAG, "functionAuth errorCode: ", Integer.valueOf(i));
                        InnerApi.this.onFailureCallback(j, InnerApi.FUNC_AUTH_FAIL_DESC, i);
                    } else {
                        InnerApi.this.onSuccessCallback(j, obj);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void isMatchUserLabel(long j, String str) {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            onFailureCallback(j, "isMatchUserLabel get marketingApi fail");
        } else {
            onSuccessCallback(j, Boolean.valueOf(marketingApi.isValidUserLabels(str)));
        }
    }

    @JavascriptInterface
    public void getHelpCustomerUrl(final long j, final String str) {
        LogUtil.a(this.TAG, "getHelpCustomerUrl");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(this.TAG, "param is null");
        } else {
            GRSManager.c(this.mContext).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.11
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    if (TextUtils.isEmpty(str2)) {
                        LogUtil.j(InnerApi.this.TAG, "getHelpCustomerUrl: urlDomain is empty");
                        onCallBackFail(-1);
                        return;
                    }
                    try {
                        InnerApi.this.onSuccessCallback(j, HelpCustomerOperate.getHelpCustomerUrl(str2, new JSONObject(str).optString(BleConstants.KEY_PATH, "")));
                    } catch (JSONException e) {
                        LogUtil.e(InnerApi.this.TAG, "getHelpCustomerUrl: JSONException");
                        InnerApi.this.onFailureCallback(j, e.getMessage());
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.j(InnerApi.this.TAG, "getHelpCustomerUrl: onCallBackFail -> " + i);
                    InnerApi.this.onFailureCallback(j, "Failed to obtain the URL domain", i);
                }
            });
        }
    }

    @JavascriptInterface
    public void writeSampleConfigList(final long j, String str) {
        LogUtil.a(this.TAG, "writeSampleConfigList callbackId ", Long.valueOf(j), " param ", str);
        if (!isInScope(j)) {
            ReleaseLogUtil.e("R_" + this.TAG, "writeSampleConfigList isInScope false");
            return;
        }
        try {
            final List<HiSampleConfig> hiSampleConfigList = getHiSampleConfigList(new JSONArray(str));
            if (CollectionUtils.a(hiSampleConfigList)) {
                String str2 = "writeSampleConfigList hiSampleConfigList " + hiSampleConfigList;
                ReleaseLogUtil.e("R_" + this.TAG, str2);
                onFailureCallback(j, str2);
                return;
            }
            LogUtil.a(this.TAG, "writeSampleConfigList hiSampleConfigList ", hiSampleConfigList);
            HiHealthManager.d(BaseApplication.b()).setSampleConfig(hiSampleConfigList, new HiDataOperateListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda4
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    this.f$0.m1573x94253ed7(hiSampleConfigList, j, i, obj);
                }
            });
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a("R_" + this.TAG, "writeSampleConfigList exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    /* JADX INFO: renamed from: lambda$writeSampleConfigList$3$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1573x94253ed7(List list, long j, int i, Object obj) {
        String str = "writeSampleConfigList onResult errorCode " + i + " object " + obj;
        ReleaseLogUtil.d("R_" + this.TAG, str);
        if (i == 0) {
            checkConfigAction(list);
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(j, str);
        }
    }

    private void checkConfigAction(List<HiSampleConfig> list) {
        WeightApi weightApi;
        if (containsTargetId(list, "900300060")) {
            ((BloodPressureApi) Services.b("Main", BloodPressureApi.class)).registerScheduleNextReminder(true);
        } else {
            if (!containsTargetId(list, "900300062") || (weightApi = (WeightApi) Services.d("Main", WeightApi.class)) == null) {
                return;
            }
            weightApi.scheduleWeightMeasureNextReminder();
        }
    }

    private boolean containsTargetId(List<HiSampleConfig> list, String str) {
        Iterator<HiSampleConfig> it = list.iterator();
        while (it.hasNext()) {
            String configId = it.next().getConfigId();
            if (configId == "") {
                LogUtil.j(this.TAG, "containsTargetId configId null!");
            } else if (str.equals(configId)) {
                return true;
            }
        }
        return false;
    }

    private List<HiSampleConfig> getHiSampleConfigList(JSONArray jSONArray) {
        String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.b());
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                ReleaseLogUtil.e("R_" + this.TAG, "getHiSampleConfigList jsonObject is null");
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("dataType");
                if (jSONObjectOptJSONObject2 == null) {
                    ReleaseLogUtil.e("R_" + this.TAG, "getHiSampleConfigList dataTypeJsonObject is null");
                } else {
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("configSubType");
                    if (jSONObjectOptJSONObject3 == null) {
                        ReleaseLogUtil.e("R_" + this.TAG, "getHiSampleConfigList configSubTypeJsonObject is null");
                    } else {
                        HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
                        builder.h(String.valueOf(jSONObjectOptJSONObject2.optInt("id")));
                        builder.a(String.valueOf(jSONObjectOptJSONObject3.optInt("id")));
                        builder.b(jSONObjectOptJSONObject.optString("configData"));
                        builder.f(jSONObjectOptJSONObject.optString("scopeApp", String.valueOf(0)));
                        builder.i(jSONObjectOptJSONObject.optString("scopeDeviceType", String.valueOf(0)));
                        builder.d(jSONObjectOptJSONObject.optString("configDescription"));
                        builder.e(jSONObjectOptJSONObject.optLong("modifiedTime"));
                        if (jSONObjectOptJSONObject.optString(DeviceInfo.TAG_DEVICE_ID) != "") {
                            androidId = jSONObjectOptJSONObject.optString(DeviceInfo.TAG_DEVICE_ID);
                        }
                        builder.e(androidId);
                        arrayList.add(new HiSampleConfig(builder));
                    }
                }
            }
        }
        return arrayList;
    }

    @JavascriptInterface
    public void readSampleConfigList(final long j, String str) {
        LogUtil.a(this.TAG, "readSampleConfigList callbackId ", Long.valueOf(j), " param ", str);
        if (!isInScope(j)) {
            ReleaseLogUtil.e("R_" + this.TAG, "readSampleConfigList isInScope false");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            List<String> sampleConfigDataTypeList = getSampleConfigDataTypeList(jSONObject);
            if (CollectionUtils.a(sampleConfigDataTypeList)) {
                String str2 = "readSampleConfigList typeList " + sampleConfigDataTypeList;
                ReleaseLogUtil.e("R_" + this.TAG, str2);
                onFailureCallback(j, str2);
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subDataType");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                String str3 = "readSampleConfigList subDataType " + jSONArrayOptJSONArray;
                ReleaseLogUtil.e("R_" + this.TAG, str3);
                onFailureCallback(j, str3);
                return;
            }
            HiSampleConfigProcessOption hiSampleConfigProcessOption = getHiSampleConfigProcessOption(jSONArrayOptJSONArray, sampleConfigDataTypeList);
            LogUtil.a(this.TAG, "readSampleConfigList hiSampleConfigProcessOption ", hiSampleConfigProcessOption);
            HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, new HiDataReadResultListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.12
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    String str4 = "readSampleConfigList onResult errorCode " + i + " anchor " + i2 + " object " + obj;
                    LogUtil.a(InnerApi.this.TAG, str4);
                    if (i == 0) {
                        InnerApi.this.processSampleConfigList(j, obj);
                        return;
                    }
                    ReleaseLogUtil.e("R_" + InnerApi.this.TAG, "readSampleConfigList onResult errorCode ", Integer.valueOf(i));
                    InnerApi.this.onFailureCallback(j, str4);
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a(InnerApi.this.TAG, "readSampleConfigList onResultIntent intentType ", Integer.valueOf(i), " anchor ", Integer.valueOf(i3), " errorCode ", Integer.valueOf(i2), " object ", obj);
                }
            });
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a("R_" + this.TAG, "readSampleConfigList exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    private List<String> getSampleConfigDataTypeList(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sampleConfigDataType");
        if (jSONArrayOptJSONArray == null) {
            ReleaseLogUtil.e("R_" + this.TAG, "getSampleConfigDataTypeList sampleConfigDataType is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(String.valueOf(jSONObjectOptJSONObject.optInt("id")));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSampleConfigList(long j, Object obj) {
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("R_" + this.TAG, "processSampleConfigList object ", obj);
            onSuccessCallback(j, Collections.EMPTY_LIST);
            return;
        }
        List<HiSampleConfig> list = (List) obj;
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e("R_" + this.TAG, "processSampleConfigList list ", list);
            onSuccessCallback(j, list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (HiSampleConfig hiSampleConfig : list) {
            if (hiSampleConfig != null) {
                JsonObject jsonObject = new JsonObject();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("id", Integer.valueOf(CommonUtils.j(hiSampleConfig.getType())));
                jsonObject.add("dataType", jsonObject2);
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("id", Integer.valueOf(CommonUtils.j(hiSampleConfig.getConfigId())));
                jsonObject.add("configSubType", jsonObject3);
                jsonObject.addProperty("scopeApp", hiSampleConfig.getScopeApp());
                jsonObject.addProperty("configData", hiSampleConfig.getConfigData());
                jsonObject.addProperty("modifiedTime", Long.valueOf(hiSampleConfig.getModifiedTime()));
                jsonObject.addProperty("scopeDeviceType", hiSampleConfig.getScopeDeviceType());
                jsonObject.addProperty("configDescription", hiSampleConfig.getConfigDescription());
                arrayList.add(jsonObject);
            }
        }
        LogUtil.a(this.TAG, "processSampleConfigList resultList ", arrayList);
        onSuccessCallback(j, arrayList);
    }

    private HiSampleConfigProcessOption getHiSampleConfigProcessOption(JSONArray jSONArray, List<String> list) {
        HashMap map = new HashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strValueOf = String.valueOf(jSONObjectOptJSONObject.optInt("id"));
                if (!map.containsKey(strValueOf)) {
                    for (String str : list) {
                        if (strValueOf.startsWith(str)) {
                            map.put(strValueOf, str);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
                builder.e((String) entry.getValue());
                builder.a((String) entry.getKey());
                builder.d(String.valueOf(0));
                builder.c(String.valueOf(0));
                arrayList.add(new HiSampleConfigKey(builder));
            }
        }
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        return hiSampleConfigProcessOption;
    }

    @JavascriptInterface
    public void writeSampleConfig(final long j, String str) {
        LogUtil.a(this.TAG, "writeSampleConfig callbackId ", Long.valueOf(j), " param ", str);
        if (!isInScope(j)) {
            ReleaseLogUtil.e(this.TAG, "writeSampleConfig isInScope false");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("configId");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                String str2 = "writeSampleConfig type " + strOptString + " configId " + strOptString2;
                ReleaseLogUtil.e(this.TAG, str2);
                onFailureCallback(j, str2);
                return;
            }
            HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
            builder.h(strOptString);
            builder.a(strOptString2);
            builder.b(jSONObject.optString("configData"));
            long jI = CommonUtils.i(jSONObject.optString("modifiedTime"));
            String strOptString3 = jSONObject.optString("scopeApp");
            String strOptString4 = jSONObject.optString("deviceUniqueId");
            String strOptString5 = jSONObject.optString("scopeDeviceType");
            if (jI <= 0) {
                jI = System.currentTimeMillis();
            }
            builder.e(jI);
            if (TextUtils.isEmpty(strOptString3)) {
                strOptString3 = String.valueOf(0);
            }
            builder.f(strOptString3);
            if (TextUtils.isEmpty(strOptString4)) {
                strOptString4 = String.valueOf(-1);
            }
            builder.e(strOptString4);
            if (TextUtils.isEmpty(strOptString5)) {
                strOptString5 = String.valueOf(0);
            }
            builder.i(strOptString5);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new HiSampleConfig(builder));
            HiHealthManager.d(BaseApplication.b()).setSampleConfig(arrayList, new HiDataOperateListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda9
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    this.f$0.m1572x190a5b5a(j, i, obj);
                }
            });
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a(this.TAG, "writeSampleConfig exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    /* JADX INFO: renamed from: lambda$writeSampleConfig$4$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1572x190a5b5a(long j, int i, Object obj) {
        String str = "writeSampleConfig onResult errorCode " + i + " object " + obj;
        ReleaseLogUtil.d(this.TAG, str);
        if (i == 0) {
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(j, str);
        }
    }

    @JavascriptInterface
    public void readSampleConfig(final long j, String str) {
        LogUtil.a(this.TAG, "readSampleConfig callbackId ", Long.valueOf(j), " param ", str);
        if (!isInScope(j)) {
            ReleaseLogUtil.e(this.TAG, "readSampleConfig isInScope false");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("configId");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                String str2 = "readSampleConfig type " + strOptString + " configId " + strOptString2;
                ReleaseLogUtil.e(this.TAG, str2);
                onFailureCallback(j, str2);
                return;
            }
            HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
            builder.e(strOptString);
            builder.a(strOptString2);
            String strOptString3 = jSONObject.optString("scopeApp");
            String strOptString4 = jSONObject.optString("scopeDeviceType");
            if (TextUtils.isEmpty(strOptString3)) {
                strOptString3 = String.valueOf(0);
            }
            builder.d(strOptString3);
            if (TextUtils.isEmpty(strOptString4)) {
                strOptString4 = String.valueOf(0);
            }
            builder.c(strOptString4);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new HiSampleConfigKey(builder));
            HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
            hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
            HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, new HiDataReadResultListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.13
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    String str3 = "readSampleConfig onResult errorCode " + i + " anchor " + i2 + " object " + obj;
                    LogUtil.a(InnerApi.this.TAG, str3);
                    if (i == 0) {
                        InnerApi.this.onSuccessCallback(j, obj);
                    } else {
                        InnerApi.this.onFailureCallback(j, str3);
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a(InnerApi.this.TAG, "readSampleConfig onResultIntent intentType ", Integer.valueOf(i), " anchor ", Integer.valueOf(i3), " errorCode ", Integer.valueOf(i2), " object ", obj);
                }
            });
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a(this.TAG, "readSampleConfig exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void writeCustomData(long j, String str) {
        LogUtil.a(this.TAG, "writeCustomData");
        if (isInScope(j)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HiHealthManager.d(this.mContext).setUserPreference(new HiUserPreference(jSONObject.getString("key"), jSONObject.getString("value")), true);
                onSuccessCallback(j, "write success");
            } catch (JSONException unused) {
                LogUtil.e(this.TAG, "writeCustomData param invalid");
                onFailureCallback(j, "writeCustomData: invalid param");
            }
        }
    }

    @JavascriptInterface
    public void readCustomData(final long j, String str) {
        LogUtil.a(this.TAG, "readCustomData");
        if (isInScope(j)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String string = jSONObject.getString("key");
                final boolean zOptBoolean = jSONObject.optBoolean("decode", false);
                lsy.a(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.14
                    @Override // java.lang.Runnable
                    public void run() {
                        HiUserPreference userPreference = HiHealthManager.d(InnerApi.this.mContext).getUserPreference(string);
                        if (userPreference != null && userPreference.getValue() != null) {
                            try {
                                InnerApi.this.onSuccessCallback(j, zOptBoolean ? HiZipUtil.d(userPreference.getValue()) : userPreference.getValue());
                                return;
                            } catch (IOException e) {
                                LogUtil.e(InnerApi.this.TAG, "readCustomData result uncompress fail, " + e.getMessage());
                                InnerApi.this.onFailureCallback(j, "readCustomData result uncompress fail");
                                return;
                            }
                        }
                        InnerApi.this.onSuccessCallback(j, "");
                    }
                });
            } catch (JSONException unused) {
                LogUtil.e(this.TAG, "readCustomData param invalid");
                onFailureCallback(j, "readCustomData: invalid param");
            }
        }
    }

    @JavascriptInterface
    public void writeSharedPreference(long j, String str) {
        LogUtil.a(this.TAG, "writeSharedPreference");
        if (isInScope(j)) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(this.TAG, "writeSharedPreference param ", str);
                onFailureCallback(j, "writeSharedPreference param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("module");
                String strOptString2 = jSONObject.optString("key");
                onSuccessCallback(j, Integer.valueOf(SharedPreferenceManager.e(BaseApplication.b(), strOptString, lua.d(strOptString2), jSONObject.optString("value"), null)));
            } catch (JSONException e) {
                LogUtil.e(this.TAG, "writeSharedPreference jsonException ", LogAnonymous.b(e));
                onFailureCallback(j, "writeSharedPreference jsonException");
            }
        }
    }

    @JavascriptInterface
    public void readSharedPreference(long j, String str) {
        LogUtil.a(this.TAG, "readSharedPreference");
        if (isInScope(j)) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(this.TAG, "readSharedPreference param ", str);
                onFailureCallback(j, "readSharedPreference param is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("module");
                String strOptString2 = jSONObject.optString("key");
                boolean zOptBoolean = jSONObject.optBoolean("isEncryptKey", true);
                Context contextB = BaseApplication.b();
                if (zOptBoolean) {
                    strOptString2 = lua.d(strOptString2);
                }
                onSuccessCallback(j, SharedPreferenceManager.e(contextB, strOptString, strOptString2));
            } catch (JSONException e) {
                LogUtil.e(this.TAG, "readSharedPreference jsonException ", LogAnonymous.b(e));
                onFailureCallback(j, "readSharedPreference jsonException");
            }
        }
    }

    @JavascriptInterface
    public void getCertificateChain(long j, String str) {
        LogUtil.a(this.TAG, "getCertificateChain");
        if (isInScope(j)) {
            if (!SecurityCertUtils.e()) {
                onFailureCallback(j, "initKeyStoreProvider failed");
                return;
            }
            try {
                X509Certificate[] x509CertificateArrC = SecurityCertUtils.c(this.mContext, new int[]{-65535}, new JSONObject(str).getString("challenge").getBytes(StandardCharsets.UTF_8));
                if (x509CertificateArrC != null && x509CertificateArrC.length == 4) {
                    byte[] bArrMergeBytes = new byte[0];
                    for (X509Certificate x509Certificate : x509CertificateArrC) {
                        bArrMergeBytes = mergeBytes(bArrMergeBytes, x509Certificate.getEncoded());
                    }
                    onSuccessCallback(j, new Gson().toJson(Base64.b(bArrMergeBytes)));
                    return;
                }
                onFailureCallback(j, "certChain is wrong");
            } catch (NumberFormatException | CertificateEncodingException | JSONException e) {
                onFailureCallback(j, e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public void getDeviceSnFromCert(long j) {
        LogUtil.a(this.TAG, "getDeviceSnFromCert");
        if (isInScope(j)) {
            String strC = qhu.c(BaseApplication.b());
            if (!TextUtils.isEmpty(strC)) {
                onSuccessCallback(j, new Gson().toJson(strC));
            } else {
                onFailureCallback(j, "getDeviceSnFromCert: getSn failed");
            }
        }
    }

    private byte[] mergeBytes(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    @JavascriptInterface
    public void getDeviceBenefits(final long j, final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(this.TAG, "getDeviceBenefits devBenefitQueryParam is empty");
        } else {
            LogUtil.a(this.TAG, "getDeviceBenefits start devBenefitQueryParam = ", str);
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1566x6273ef9(j, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getDeviceBenefits$6$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1566x6273ef9(final long j, String str) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j(this.TAG, "getDeviceBenefits payApi is null");
            onFailureCallback(j, "payApi is null");
            return;
        }
        try {
            DeviceBenefitQueryParam deviceBenefitQueryParam = (DeviceBenefitQueryParam) new Gson().fromJson(JsonSanitizer.sanitize(str), DeviceBenefitQueryParam.class);
            if (deviceBenefitQueryParam == null) {
                LogUtil.j(this.TAG, "getDeviceBenefits queryParam is null");
                onFailureCallback(j, "queryParam is null");
            } else {
                payApi.getDeviceBenefits(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f$0.m1565x90ad18b8(j, i, obj);
                    }
                });
            }
        } catch (JsonSyntaxException unused) {
            onFailureCallback(j, "queryParam error");
            LogUtil.e(this.TAG, "getDeviceBenefits JsonSyntaxException");
        }
    }

    /* JADX INFO: renamed from: lambda$getDeviceBenefits$5$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1565x90ad18b8(long j, int i, Object obj) {
        if (obj instanceof DeviceBenefits) {
            String strD = HiJsonUtil.d((DeviceBenefits) obj);
            LogUtil.a(this.TAG, "getDeviceBenefits resultJson = ", strD);
            onSuccessCallback(j, strD);
        } else {
            LogUtil.a(this.TAG, "getDeviceBenefits objData = ", obj);
            onFailureCallback(j, String.valueOf(obj), i);
        }
    }

    @JavascriptInterface
    public void healthCloudRequest(final long j, String str) {
        LogUtil.a(this.TAG, "healthCloudRequest");
        if (isInScope(j)) {
            if (this.mHealthCloudOperate == null) {
                this.mHealthCloudOperate = new HealthCloudOperate();
            }
            this.mHealthCloudOperate.request(str, new ResultCallback<String>() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.15
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(String str2) {
                    LogUtil.d(InnerApi.this.TAG, "healthCloudRequest onSuccess -> " + str2);
                    InnerApi.this.onSuccessCallback(j, str2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    String message = th == null ? "request failed" : th.getMessage();
                    LogUtil.d(InnerApi.this.TAG, "healthCloudRequest onFailure -> " + message);
                    InnerApi.this.onFailureCallback(j, message);
                }
            });
        }
    }

    @JavascriptInterface
    public void isEmuiFor12Hour(long j) {
        onSuccessCallback(j, Boolean.valueOf(qrk.e(BaseApplication.b())));
    }

    @JavascriptInterface
    public void is12Hour(long j) {
        onSuccessCallback(j, Boolean.valueOf(!DateFormat.is24HourFormat(BaseApplication.b())));
    }

    @JavascriptInterface
    public void getDeviceCertificateChain(final long j, String str) {
        LogUtil.a(this.TAG, "getDeviceCertificateChain");
        if (isInScope(j)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("idTypes");
                String string = jSONObject.getString("challenge");
                com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = (com.huawei.health.devicemgr.business.entity.DeviceInfo) new Gson().fromJson(jSONObject.getString("deviceInfo"), com.huawei.health.devicemgr.business.entity.DeviceInfo.class);
                if (deviceInfo == null) {
                    LogUtil.j(this.TAG, "deviceInfo is null");
                    onFailureCallback(j, "param deviceInfo is null");
                }
                if (!eey.d(deviceInfo, 125)) {
                    LogUtil.j(this.TAG, "device not support certificate chain authentication");
                    onFailureCallback(j, "device not support certificate chain authentication");
                    return;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        iArr[i] = Integer.parseInt((String) obj);
                    }
                }
                eer.c().e(deviceInfo, iArr, string, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda6
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj2) {
                        this.f$0.m1567x2d5bfee8(j, i2, obj2);
                    }
                });
            } catch (NumberFormatException | JSONException e) {
                String message = e.getMessage();
                LogUtil.e(this.TAG, "getDeviceCertificateChain exception : ", message);
                onFailureCallback(j, message);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$getDeviceCertificateChain$7$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1567x2d5bfee8(long j, int i, Object obj) {
        LogUtil.a(this.TAG, "getDeviceCertificateChain errorCode = ", Integer.valueOf(i));
        LogUtil.d(this.TAG, "getDeviceCertificateChain objData = ", new Gson().toJson(obj));
        callBackCertInfo(j, i, obj);
    }

    private void callBackCertInfo(long j, int i, Object obj) {
        boolean z;
        if (i == -1 || (!((z = obj instanceof String)) && !(obj instanceof List))) {
            onFailureCallback(j, "get device cert failure");
            return;
        }
        CertChainData certChainData = new CertChainData();
        if (z) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(this.TAG, "getDeviceCertificateChain cert is null");
                onFailureCallback(j, "get device cert failure, cert is null");
                return;
            } else {
                certChainData.setCertChain(str);
                certChainData.setCertChainType(1);
                onSuccessCallback(j, certChainData);
                return;
            }
        }
        if (obj instanceof List) {
            List<String> list = (List) obj;
            if (CollectionUtils.a(list)) {
                LogUtil.j(this.TAG, "getDeviceCertificateChain cert list is null");
                onFailureCallback(j, "get device certChainList failure, certChainList is null");
            } else {
                certChainData.setCertChainList(list);
                onSuccessCallback(j, certChainData);
            }
        }
    }

    @JavascriptInterface
    public int getShowWeightUnit() {
        return UnitUtil.e();
    }

    @JavascriptInterface
    public void refreshAppRt(final long j) {
        LogUtil.a(this.TAG, "refreshAppRt");
        if (isInScope(j)) {
            if (CommonUtil.z(this.mContext)) {
                ThirdPartyLoginManager.getInstance().thirdPartyPhoneLogin(this.mContext, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f$0.m1569x35589ad5(j, i, obj);
                    }
                });
            } else {
                LogUtil.a(this.TAG, "come to get AT again on hms core");
            }
        }
    }

    /* JADX INFO: renamed from: lambda$refreshAppRt$8$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1569x35589ad5(long j, int i, Object obj) {
        LogUtil.a(this.TAG, "come in to reTradePayfresh RT");
        if (i == -1) {
            onFailureCallback(j, "refresh rt failed", i);
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void changePersonalInfo(long j) {
        LogUtil.a(this.TAG, "changePersonalInfo");
        if (isInScope(j)) {
            if (!(this.mContext instanceof Activity)) {
                onFailureCallback(j, "mContext instanceof Activity failed");
                LogUtil.j(this.TAG, "mContext instanceof Activity failed");
            } else if (imz.a()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo((Activity) this.mContext, null);
            } else {
                imx.a((Activity) this.mContext);
            }
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(this.TAG, "onActivityResult: requestCode=" + i + " resultCode=" + i2);
        super.onActivityResult(i, i, intent);
        if (i == 10001) {
            long j = this.mCallbackIdOfLoadH5ProApp;
            if (j >= 0 && intent != null) {
                returnActivityResult(i2, intent, j);
                this.mCallbackIdOfLoadH5ProApp = -1L;
                return;
            }
        }
        if (i == 10002) {
            long j2 = this.mCallBackRequestIgnore;
            if (j2 >= 0) {
                onSuccessCallback(j2, Boolean.valueOf(isAgreeWhite()));
                this.mCallbackIdOfLoadH5ProApp = -1L;
                return;
            }
        }
        if (i == 7667713) {
            long j3 = this.mCallBackIdOfRouteToNativePage;
            if (j3 >= 0) {
                returnActivityResult(i2, intent, j3);
                this.mCallBackIdOfRouteToNativePage = -1L;
                return;
            }
        }
        if (i == 608) {
            BacklogManagerApi backlogManagerApi = (BacklogManagerApi) Services.d("ToDoCenter", BacklogManagerApi.class);
            if (backlogManagerApi == null) {
                LogUtil.j(this.TAG, "DeviceGeneralSettingApi is null.");
                return;
            } else {
                backlogManagerApi.onActivityResult(i, i2, intent);
                return;
            }
        }
        if (i == WALLET_RESTORED_CODE) {
            DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
            if (deviceGeneralSettingApi == null) {
                LogUtil.j(this.TAG, "DeviceGeneralSettingApi is null.");
                return;
            } else {
                deviceGeneralSettingApi.onActivityResult(i, i2, intent);
                return;
            }
        }
        if (i == 6003) {
            long j4 = this.mVerifyAccountCallbackId;
            if (j4 != -1) {
                if (i2 == -1) {
                    onSuccessCallback(j4, "success");
                } else {
                    onFailureCallback(j4, ParamConstants.CallbackMethod.ON_FAIL);
                }
                this.mVerifyAccountCallbackId = -1L;
            }
        }
    }

    private void returnActivityResult(int i, Intent intent, long j) {
        if (i == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (intent.hasExtra("KEY_SUG_COURSE_IDS_RESULT")) {
                try {
                    onSuccessCallback(j, JsonParser.parseString(stringExtra).getAsJsonObject());
                    return;
                } catch (JsonSyntaxException | IllegalStateException e) {
                    ReleaseLogUtil.a(this.TAG, "returnActivityResult exception ", ExceptionUtils.c(e));
                    onFailureCallback(j, stringExtra);
                    return;
                }
            }
            onSuccessCallback(j, stringExtra);
            return;
        }
        onFailureCallback(j, "no result");
    }

    @JavascriptInterface
    public void registerPhoneStateListener(long j) {
        this.mCallbackIdOfPhoneListener = j;
        if (!PermissionUtil.f()) {
            setPhoneStateListener(this.mContext, true);
        } else {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.PHONE_STATE, new CustomPermissionAction(this.mContext) { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.16
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a(InnerApi.this.TAG, "registerPhoneStateListener: onGranted");
                    InnerApi innerApi = InnerApi.this;
                    innerApi.setPhoneStateListener(innerApi.mContext, true);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    LogUtil.a(InnerApi.this.TAG, "registerPhoneStateListener: onDenied");
                    InnerApi innerApi = InnerApi.this;
                    innerApi.onFailureCallback(innerApi.mCallbackIdOfPhoneListener, "denied");
                    InnerApi innerApi2 = InnerApi.this;
                    innerApi2.onCompleteCallback(innerApi2.mCallbackIdOfPhoneListener, "complete", 0);
                }
            });
        }
    }

    @JavascriptInterface
    public void unRegisterPhoneStateListener(long j) {
        setPhoneStateListener(this.mContext, false);
        onSuccessCallback(j);
    }

    /* JADX INFO: loaded from: classes41.dex */
    class H5PhoneStateListener extends PhoneStateListener {
        private H5PhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            LogUtil.a(InnerApi.this.TAG, "onCallStateChanged state = " + i);
            if (i == 0 || i == 2 || i == 1) {
                InnerApi innerApi = InnerApi.this;
                innerApi.onSuccessCallback(innerApi.mCallbackIdOfPhoneListener, Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneStateListener(Context context, boolean z) {
        if (context == null) {
            LogUtil.j(this.TAG, "setPhoneStateListener context is null");
            return;
        }
        LogUtil.a(this.TAG, "setPhoneStateListener isListen = " + z);
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            if (z) {
                if (this.mH5PhoneStateListener == null) {
                    H5PhoneStateListener h5PhoneStateListener = new H5PhoneStateListener();
                    this.mH5PhoneStateListener = h5PhoneStateListener;
                    telephonyManager.listen(h5PhoneStateListener, 32);
                    return;
                }
                return;
            }
            H5PhoneStateListener h5PhoneStateListener2 = this.mH5PhoneStateListener;
            if (h5PhoneStateListener2 != null) {
                telephonyManager.listen(h5PhoneStateListener2, 0);
                this.mH5PhoneStateListener = null;
            }
            long j = this.mCallbackIdOfPhoneListener;
            if (j > 0) {
                onCompleteCallback(j, "complete", 0);
                this.mCallbackIdOfPhoneListener = 0L;
            }
        }
    }

    @JavascriptInterface
    public void goSettingSelfStart() {
        LogUtil.a(this.TAG, "goSettingSelfStart");
        if (this.mContext instanceof Activity) {
            nzz.d(this.mContext);
        }
    }

    @JavascriptInterface
    public void goSettingBackRun() {
        LogUtil.a(this.TAG, "goSettingBackRun");
        if (this.mContext instanceof Activity) {
            nzz.b(this.mContext);
        }
    }

    @JavascriptInterface
    public boolean isAgreeWhite() {
        boolean zC = nzz.c(this.mContext);
        LogUtil.a(this.TAG, "isAgreeWhite: ", Boolean.valueOf(zC));
        return zC;
    }

    @JavascriptInterface
    public void requestWhiteSet(long j) {
        LogUtil.a(this.TAG, "requestWhiteSet");
        if (this.mContext instanceof Activity) {
            this.mCallBackRequestIgnore = j;
            LogUtil.a(this.TAG, "mCallBackRequestIgnore: ", Long.valueOf(this.mCallBackRequestIgnore));
            nzz.b(this.mContext, 10002);
        }
    }

    @JavascriptInterface
    public void startAssociationStart() {
        nzz.e(this.mContext);
    }

    @JavascriptInterface
    public boolean isSupportBatteryOptimizations() {
        LogUtil.a(this.TAG, "isSupportBatteryOptimizations");
        if (!(this.mContext instanceof Activity)) {
            return false;
        }
        LogUtil.a(this.TAG, "mContext is instanceof Activity");
        boolean zA = nzz.a(this.mContext);
        LogUtil.a(this.TAG, "isSupportBatteryOptimizations,isSupport: ", Boolean.valueOf(zA));
        return zA;
    }

    @JavascriptInterface
    public void writeSharedData(long j, String str) {
        LogUtil.a(this.TAG, "writeSharedData enter: " + str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "param is empty");
            return;
        }
        if (!TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            onFailureCallback(j, ErrorEnum.NO_PERMISSION.getMsg());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                SHARED_DATA_MAP.put(next, jSONObject.getString(next));
            }
            onSuccessCallback(j);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "writeSharedData JSONException: " + e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void readSharedData(long j, String str) {
        LogUtil.a(this.TAG, "readSharedData enter: " + str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, ErrorEnum.REQ_PARAM_EMPTY.getMsg());
            return;
        }
        if (!TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            onFailureCallback(j, ErrorEnum.NO_PERMISSION.getMsg());
            return;
        }
        try {
            String string = new JSONObject(str).getString("key");
            if (TextUtils.isEmpty(string)) {
                onFailureCallback(j, ErrorEnum.REQ_PARAM_EMPTY.getMsg());
                return;
            }
            String str2 = SHARED_DATA_MAP.get(string);
            if (str2 == null) {
                onFailureCallback(j, "no data");
            } else {
                onSuccessCallback(j, str2);
            }
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "readSharedData JSONException: " + e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void clearSharedData(long j) {
        LogUtil.a(this.TAG, "clearSharedData enter");
        if (!TrustListCheckerImpl.isUseSpecialJsApi(this.mH5ProInstance)) {
            onFailureCallback(j, ErrorEnum.NO_PERMISSION.getMsg());
        } else {
            SHARED_DATA_MAP.clear();
            onSuccessCallback(j);
        }
    }

    @JavascriptInterface
    public void registerSyncCloudDataListener(long j) {
        if (this.mSyncCloudDataListener != null) {
            LogUtil.j(this.TAG, "registerSyncCloudDataListener: registered listener");
            return;
        }
        SyncCloudDataListener syncCloudDataListener = new SyncCloudDataListener();
        this.mSyncCloudDataListener = syncCloudDataListener;
        syncCloudDataListener.registerSyncCloudDataListener(this, j);
    }

    @JavascriptInterface
    public void unRegisterSyncCloudDataListener(long j) {
        SyncCloudDataListener syncCloudDataListener = this.mSyncCloudDataListener;
        if (syncCloudDataListener != null) {
            syncCloudDataListener.unRegisterSyncCloudDataListener(this, j);
            this.mSyncCloudDataListener = null;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        SyncCloudDataListener syncCloudDataListener = this.mSyncCloudDataListener;
        if (syncCloudDataListener != null) {
            syncCloudDataListener.unRegisterSyncCloudDataListener();
            this.mSyncCloudDataListener = null;
        }
        unSubscribeHiHealthData();
    }

    @JavascriptInterface
    public void subscribeHiHealthData(long j, String str) {
        JSONObject jSONObject;
        LogUtil.a(this.TAG, "subscribeHiHealthData mSuccessList ", this.mSuccessList, " param ", str);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.a(this.TAG, "subscribeHiHealthData exception ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e(this.TAG, "subscribeHiHealthData jsonObject is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("typeList");
        if (jSONArrayOptJSONArray == null) {
            ReleaseLogUtil.e(this.TAG, "subscribeHiHealthData jsonArray is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
        }
        String strOptString = jSONObject.optString("h5PackageName");
        if (TextUtils.isEmpty(strOptString)) {
            ReleaseLogUtil.e(this.TAG, "subscribeHiHealthData h5PackageName ", strOptString);
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new AnonymousClass17(j, strOptString));
        }
    }

    /* JADX INFO: renamed from: com.huawei.operation.h5pro.jsmodules.InnerApi$17, reason: invalid class name */
    class AnonymousClass17 implements HiSubscribeListener {
        final /* synthetic */ long val$callbackId;
        final /* synthetic */ String val$h5PackageName;

        AnonymousClass17(long j, String str) {
            this.val$callbackId = j;
            this.val$h5PackageName = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            ReleaseLogUtil.d(InnerApi.this.TAG, "subscribeHiHealthData onResult successList ", list);
            if (!CollectionUtils.a(list)) {
                InnerApi.this.mSuccessList = list;
                InnerApi.this.onSuccessCallback(this.val$callbackId, list);
            } else {
                InnerApi.this.onFailureCallback(this.val$callbackId, "");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.d(InnerApi.this.TAG, "subscribeHiHealthData onChange type ", Integer.valueOf(i), " changeKey ", str);
            HashMap map = new HashMap(5);
            map.put("time", Long.valueOf(j));
            map.put("type", Integer.valueOf(i));
            map.put("changeKey", str);
            HashMap map2 = new HashMap(2);
            map2.put("data", map);
            map2.put("commandName", "subscribeHiHealthData");
            String strD = HiJsonUtil.d(map2);
            LogUtil.a(InnerApi.this.TAG, "subscribeHiHealthData onChange json ", strD, " h5PackageName ", this.val$h5PackageName);
            H5ProClient.sendCommandToJs(this.val$h5PackageName, strD, new H5ProReverseControlExecutor.OnReverseControlCallback() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$17$$ExternalSyntheticLambda0
                @Override // com.huawei.health.h5pro.core.H5ProReverseControlExecutor.OnReverseControlCallback
                public final void onCallback(int i2, String str2) {
                    this.f$0.m1574x3d145336(i2, str2);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onChange$0$com-huawei-operation-h5pro-jsmodules-InnerApi$17, reason: not valid java name */
        /* synthetic */ void m1574x3d145336(int i, String str) {
            ReleaseLogUtil.d(InnerApi.this.TAG, "subscribeHiHealthData onChange onCallback  code ", Integer.valueOf(i), " callbackData ", str);
        }
    }

    @JavascriptInterface
    public void unSubscribeHiHealthData() {
        ReleaseLogUtil.d(this.TAG, "unSubscribeHiHealthData mSuccessList ", this.mSuccessList);
        if (CollectionUtils.a(this.mSuccessList)) {
            return;
        }
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.mSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda3
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                this.f$0.m1570xab9dd4ac(z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$unSubscribeHiHealthData$9$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1570xab9dd4ac(boolean z) {
        ReleaseLogUtil.d(this.TAG, "unSubscribeHiHealthData onResult isSuccess ", Boolean.valueOf(z));
    }

    @JavascriptInterface
    public void ifAllowLogin(long j) {
        onSuccessCallback(j, Boolean.valueOf(Utils.h()));
    }

    @JavascriptInterface
    public void setUserData(final long j, String str) {
        if (!LoginInit.getInstance(this.mContext).getIsLogined()) {
            logErrOnFailureCallback(j, "current not login");
        } else {
            final HiUserInfo hiUserInfo = (HiUserInfo) HiJsonUtil.d(str, HiUserInfo.class);
            HiHealthNativeApi.a(this.mContext).fetchUserData(new HiCommonListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.18
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    if (!njy.b(obj, HiUserInfo.class)) {
                        InnerApi.this.logErrOnFailureCallback(j, "fetchUserData failed: receive type error");
                        return;
                    }
                    HiUserInfo hiUserInfo2 = (HiUserInfo) ((List) obj).get(0);
                    InnerApi.this.updateUser(hiUserInfo2, hiUserInfo);
                    HiHealthNativeApi.a(InnerApi.this.mContext).setUserData(hiUserInfo2, new HiCommonListener() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.18.1
                        @Override // com.huawei.hihealth.data.listener.HiCommonListener
                        public void onSuccess(int i2, Object obj2) {
                            LogUtil.a(InnerApi.this.TAG, "setUserData success");
                            InnerApi.this.onSuccessCallback(j);
                        }

                        @Override // com.huawei.hihealth.data.listener.HiCommonListener
                        public void onFailure(int i2, Object obj2) {
                            InnerApi.this.logErrOnFailureCallback(j, "setUserData failed: errCode=" + i2 + ", errMsg=" + obj2);
                        }
                    });
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    InnerApi.this.logErrOnFailureCallback(j, "fetchUserData failed: errCode=" + i + ", errMsg=" + obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logErrOnFailureCallback(long j, String str) {
        LogUtil.e(this.TAG, str);
        onFailureCallback(j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUser(HiUserInfo hiUserInfo, HiUserInfo hiUserInfo2) {
        boolean z;
        boolean z2 = true;
        if (hiUserInfo2.isWeightValid()) {
            LogUtil.a(this.TAG, "updateUser weight");
            hiUserInfo.setWeight(hiUserInfo2.getWeight());
            z = true;
        } else {
            z = false;
        }
        if (hiUserInfo2.isHeightValid()) {
            LogUtil.a(this.TAG, "updateUser height");
            hiUserInfo.setHeight(hiUserInfo2.getHeight());
            z = true;
        }
        if (hiUserInfo2.isGenderValid()) {
            LogUtil.a(this.TAG, "updateUser gender");
            hiUserInfo.setGender(hiUserInfo2.getGender());
        } else {
            z2 = z;
        }
        if (hiUserInfo2.isBirthdayValid()) {
            LogUtil.a(this.TAG, "updateUser birthday");
            hiUserInfo.setBirthday(hiUserInfo2.getBirthday());
        } else {
            if (z2) {
            }
            LogUtil.d(this.TAG, "afterUpdate old=", HiJsonUtil.d(hiUserInfo), ", new=", HiJsonUtil.d(hiUserInfo2));
        }
        hiUserInfo.setModifiedIntent(536870912);
        hiUserInfo.setUser(1073741824);
        LogUtil.d(this.TAG, "afterUpdate old=", HiJsonUtil.d(hiUserInfo), ", new=", HiJsonUtil.d(hiUserInfo2));
    }

    @JavascriptInterface
    public void getHealthCloudConfig(long j, String str) {
        Object obj;
        String str2 = "getHealthCloudConfig param " + str;
        LogUtil.a(this.TAG, str2);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(TrackConstants$Events.FEATURE);
            String strOptString2 = jSONObject.optString("key");
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, str2);
                return;
            }
            fdf fdfVarE = fdy.e();
            String str3 = "getHealthCloudConfig commonFeatureConfig " + fdfVarE;
            LogUtil.a(this.TAG, str3);
            if (fdfVarE == null) {
                onFailureCallback(j, str3);
                return;
            }
            Map<?, ?> mapC = fdy.c(fdfVarE);
            if (mapC != null && (obj = mapC.get(strOptString)) != null) {
                getHealthCloudConfig(j, strOptString2, obj);
                return;
            }
            Map<?, ?> mapE = fdy.e(fdfVarE);
            String str4 = "getHealthCloudConfig defaultFeatureMap " + mapE;
            LogUtil.a(this.TAG, str4);
            if (mapE == null) {
                onFailureCallback(j, str4);
            } else {
                getHealthCloudConfig(j, strOptString2, mapE.get(strOptString));
            }
        } catch (JSONException e) {
            String str5 = "getHealthCloudConfig jsonException " + ExceptionUtils.c(e);
            ReleaseLogUtil.a(this.TAG, str5);
            onFailureCallback(j, str5);
        }
    }

    private void getHealthCloudConfig(long j, String str, Object obj) {
        String str2 = "getHealthCloudConfig key " + str + " object " + obj;
        LogUtil.a(this.TAG, str2);
        if (obj == null) {
            onFailureCallback(j, str2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onSuccessCallback(j, obj);
        } else if (obj instanceof Map) {
            onSuccessCallback(j, ((Map) obj).get(str));
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void getShareConfig(long j) {
        LogUtil.a(this.TAG, "getShareConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isShowUserInfo", ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).isShowUserInfo());
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getShareConfig: exception -> " + e.getMessage());
        }
        onSuccessCallback(j, jSONObject);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ltd.e().e(strArr, iArr);
    }

    @JavascriptInterface
    public void getAppClientInfo(long j) {
        LogUtil.a(this.TAG, "getAppClientInfo");
        JSONObject jSONObject = new JSONObject();
        try {
            LoginInit loginInit = LoginInit.getInstance(this.mContext);
            jSONObject.put("language", LanguageUtil.a());
            jSONObject.put(CardMgrSdkConst.CardInfoDesc.PARAMS_LANGUAGE_TAG, getLanguageTag());
            jSONObject.put("appId", BaseApplication.d());
            jSONObject.put("appType", "1");
            jSONObject.put("sysVersion", Build.VERSION.RELEASE);
            jSONObject.put("timeZone", HiDateUtil.c(""));
            jSONObject.put(FaqConstants.FAQ_EMUIVERSION, CommonUtil.p());
            jSONObject.put("firmware", Build.DISPLAY);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("deviceId", loginInit.getDeviceId());
            jSONObject.put("appVersion", CommonUtil.c(BaseApplication.b()));
            jSONObject.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
            jSONObject.put(QuestionSurveyRequestParam.CVERISON, CommonUtil.e(BaseApplication.b()));
            jSONObject.put("os", Agent.OS_NAME + Build.VERSION.RELEASE);
            jSONObject.put("isMobileAppEngine", EnvironmentInfo.m());
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getAppClientInfo: exception -> " + e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void getNpsInfo(final long j) {
        ReleaseLogUtil.d(this.TAG, "getNpsInfo");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1568xe1ccd019(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getNpsInfo$10$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1568xe1ccd019(long j) {
        Object systemService = null;
        HealthOpenSDK healthOpenSDKE = this.mContext == null ? null : fga.d(this.mContext).e();
        if (healthOpenSDKE == null) {
            onFailureCallback(j, "error healthOpenSDK == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            healthOpenSDKE.d((IExecuteResult) new OpenSdkNotificationCallback(this, countDownLatch, jSONObject));
            jSONObject.put("allow", isAllowPermission(this.mContext));
            jSONObject.put("aliveClickSetting", DaemonServiceSpUtils.a());
            jSONObject.put("aliveClickCancel", DaemonServiceSpUtils.e());
            List<nzy> listG = DaemonServiceSpUtils.g();
            if (!CollectionUtils.a(listG)) {
                jSONObject.put("aliveInfo", qqt.b(listG));
            }
            if (this.mContext != null) {
                systemService = this.mContext.getSystemService("power");
            }
            if (systemService instanceof PowerManager) {
                jSONObject.put("isIgnoring", ((PowerManager) systemService).isIgnoringBatteryOptimizations(this.mContext.getPackageName()));
            }
            List<String> listD = ThirdMobileManager.d(this.mContext);
            if (!CollectionUtils.a(listD)) {
                jSONObject.put("thirdMgr", qqt.b(listD));
            }
            try {
                LogUtil.a(this.TAG, "afterNpsShow isCountDown : ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
            } catch (InterruptedException e) {
                ReleaseLogUtil.d(this.TAG, "opAnalyticsForNps exception happens = ", e.getMessage());
            }
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e2) {
            LogUtil.e(this.TAG, "getNpsInfo: exception -> " + e2.getMessage());
            onFailureCallback(j, e2.getMessage());
        }
    }

    private boolean isAllowPermission(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            return true;
        }
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class OpenSdkNotificationCallback implements IExecuteResult {
        private static final String TAG = "R_OpenSdkNotificationCallback";
        CountDownLatch mCountDownLatch;
        JSONObject mJsonObject;
        WeakReference<InnerApi> mWeakRef;

        protected OpenSdkNotificationCallback(InnerApi innerApi, CountDownLatch countDownLatch, JSONObject jSONObject) {
            this.mWeakRef = new WeakReference<>(innerApi);
            this.mCountDownLatch = countDownLatch;
            this.mJsonObject = jSONObject;
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            boolean z;
            LogUtil.a(TAG, "R_OpenSdkNotificationCallback onSuccess");
            WeakReference<InnerApi> weakReference = this.mWeakRef;
            if (weakReference == null) {
                LogUtil.j(TAG, "mWeakRef == null");
                this.mCountDownLatch.countDown();
                return;
            }
            if (weakReference.get() == null) {
                LogUtil.j(TAG, "innerApi == null");
                this.mCountDownLatch.countDown();
                return;
            }
            if (!(obj instanceof Bundle)) {
                this.mCountDownLatch.countDown();
                return;
            }
            try {
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("stepsNotifiState")) {
                    z = bundle.getBoolean("stepsNotifiState");
                    this.mJsonObject.put("isOpen", String.valueOf(z));
                } else {
                    z = false;
                }
                ReleaseLogUtil.d(TAG, "stepsNotifiState : ", Boolean.valueOf(z));
            } catch (JSONException unused) {
                this.mCountDownLatch.countDown();
            }
            this.mCountDownLatch.countDown();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            this.mCountDownLatch.countDown();
            LogUtil.j(TAG, "OpenSdkAliveOrStepCallbackForOp onFailed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            this.mCountDownLatch.countDown();
            LogUtil.j(TAG, "OpenSdkAliveOrStepCallbackForOp onServiceException");
        }
    }

    @JavascriptInterface
    public void showToast(long j, String str) {
        LogUtil.a(this.TAG, "showToast enter: " + str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, ErrorEnum.REQ_PARAM_EMPTY.getMsg());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("text", "");
            boolean zOptBoolean = jSONObject.optBoolean("isShowLong", false);
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, "text is null");
                return;
            }
            if (zOptBoolean) {
                qpx.b(BaseApplication.b(), strOptString);
            } else {
                qpx.e(BaseApplication.b(), strOptString);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", 0);
                onSuccessCallback(j, jSONObject2);
            } catch (JSONException e) {
                onFailureCallback(j, ExceptionUtils.c(e));
            }
        } catch (JSONException e2) {
            String strC = ExceptionUtils.c(e2);
            ReleaseLogUtil.a(this.TAG, "showToast exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void userVisitLastestTime(long j, String str) {
        LogUtil.a(this.TAG, "userVisitLatestTime enter");
        fxn.i(str);
        onSuccessCallback(j, "success");
    }

    @JavascriptInterface
    public void verifyAccount(final long j) {
        ReleaseLogUtil.d(this.TAG, "verifyAccount enter");
        if (!(this.mContext instanceof Activity)) {
            LogUtil.j(this.TAG, "verifyAccount: context is not an Activity");
            onFailureCallback(j, ParamConstants.CallbackMethod.ON_FAIL);
        } else {
            final Activity activity = (Activity) this.mContext;
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1571xadfb2d29(j, activity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$verifyAccount$11$com-huawei-operation-h5pro-jsmodules-InnerApi, reason: not valid java name */
    /* synthetic */ void m1571xadfb2d29(long j, Activity activity) {
        this.mVerifyAccountCallbackId = j;
        Intent intent = new Intent();
        intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        intent.putExtra(com.huawei.hms.support.hwid.common.constants.CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, "1");
        intent.setClassName(activity, LOGIN_ACTIVITY_PKG);
        activity.startActivityForResult(intent, 6003);
    }

    @JavascriptInterface
    public void getDietPreferenceArea(final long j) {
        ReleaseLogUtil.d(this.TAG, "getDietPreferenceArea");
        if (!PermissionUtil.b(this.mContext, PermissionUtil.c(PermissionUtil.PermissionType.LOCATION))) {
            ReleaseLogUtil.d(this.TAG, IntentFailError.NO_PERMISSION);
            onSuccessCallback(j, "0");
        } else {
            izo.c(new UiCallback<ReverseGeocodeResponse.Address>() { // from class: com.huawei.operation.h5pro.jsmodules.InnerApi.19
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a(InnerApi.this.TAG, "getDietPreferenceArea failed,", str);
                    InnerApi.this.onSuccessCallback(j, "0");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(ReverseGeocodeResponse.Address address) {
                    ReleaseLogUtil.d(InnerApi.this.TAG, "getDietPreferenceArea success,", address);
                    InnerApi innerApi = InnerApi.this;
                    innerApi.onSuccessCallback(j, innerApi.getCityCode(address.getAdminArea()));
                }
            }, "getDietPreferenceArea");
        }
    }

    @JavascriptInterface
    public void jumpToAllDeviceList(long j, String str) {
        LogUtil.a(this.TAG, "Enter jumpToAllDeviceList, kindId: " + str);
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, ALL_DEVICE_LIST_CLASS);
        intent.putExtra("kind_id", str);
        iov.d(this.mContext, intent);
        onSuccessCallback(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCityCode(String str) {
        LogUtil.a(this.TAG, "city is ", str);
        String[] strArr = {"陕西省", "甘肃省", "青海省", "宁夏回族自治区", "新疆维吾尔自治区"};
        String[] strArr2 = {"北京市", "天津市", "河北省", "山西省", "内蒙古自治区"};
        String[] strArr3 = {"山东省", "江苏省", "安徽省", "上海市", "浙江省", "江西省", "福建省"};
        String[] strArr4 = {"河南省", "湖北省", "湖南省"};
        String[] strArr5 = {"重庆市", "四川省", "贵州省", "云南省", "西藏自治区"};
        String[] strArr6 = {"广东省", "广西壮族自治区", "海南省"};
        if (Arrays.asList("黑龙江省", "吉林省", "辽宁省").contains(str)) {
            return "1";
        }
        if (Arrays.asList(strArr).contains(str)) {
            return "2";
        }
        if (Arrays.asList(strArr2).contains(str)) {
            return "3";
        }
        if (Arrays.asList(strArr3).contains(str)) {
            return "4";
        }
        if (Arrays.asList(strArr4).contains(str)) {
            return "5";
        }
        if (Arrays.asList(strArr5).contains(str)) {
            return "6";
        }
        if (Arrays.asList(strArr6).contains(str)) {
            return "7";
        }
        return "0";
    }
}
