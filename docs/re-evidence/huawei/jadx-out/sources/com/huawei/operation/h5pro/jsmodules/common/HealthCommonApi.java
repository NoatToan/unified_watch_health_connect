package com.huawei.operation.h5pro.jsmodules.common;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.CommonConstant;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.h5pro.TrustListCheckerImpl;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.operation.utils.Constants;
import com.huawei.trade.datatype.PromotionPolicyInfo;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import defpackage.ezj;
import defpackage.fua;
import defpackage.gcn;
import defpackage.ipc;
import defpackage.irz;
import defpackage.njy;
import defpackage.oet;
import defpackage.oeu;
import defpackage.qqt;
import defpackage.qrh;
import defpackage.qrs;
import defpackage.qsr;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "HealthCommonApi")
public class HealthCommonApi {
    private static final String COMMON_PARAM_BTN_DESC = "btnDesc";
    private static final String COMMON_PARAM_BTN_INDEX = "btnIndex";
    private static final String COMMON_PARAM_CONTENT = "content";
    private static final String COMMON_PARAM_KEY = "key";
    private static final int FAILURE_ERROR_CODE = -1;
    private static final String HEALTHY_CLOVERS_1 = "HEALTHY_CLOVERS_1";
    private static final String IS_STORE_DEMO_PHONE = "isStoreDemoPhone";
    private static final String RESULT_CODE = "code";
    private static final String RESULT_MESSAGE = "message";
    private static final String SMART_TRAIN_PLAN = "intelligentTrainingPlan";
    private static final String SPORT_RECORD_RENAME = "sportRecordRename";
    private static final String SUPPORT_NEW_QUICK_ENTRY_PAGE = "supportNewQuickEntry";
    private static final String TAG = "H5PRO_HealthCommonApi";
    private static final String THIRD_HMS_AUTH_URL = "/healthkit/v1/thirdAuthInfo";
    private static volatile VersionInfo versionInfo;

    @H5ProMethod
    public static void getVersionInfo(ServiceApiCallback<VersionInfo> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getVersionInfo: callback is null");
            return;
        }
        if (versionInfo == null) {
            versionInfo = new VersionInfo();
        }
        Objects.requireNonNull(versionInfo);
        LogUtil.a(TAG, "getApiLevel:", 9);
        serviceApiCallback.onSuccess(versionInfo);
    }

    @H5ProMethod
    public static void getAbilities(ServiceApiCallback<JSONObject> serviceApiCallback) {
        LogUtil.a(TAG, "getAbilities start");
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getAbilities: callback is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("abilities", new JSONArray((Collection) AbilitiesConfig.getAbilities()));
            serviceApiCallback.onSuccess(jSONObject);
        } catch (JSONException e) {
            LogUtil.e(TAG, "getAbilities: JSONException");
            serviceApiCallback.onFailure(-1, e.getMessage());
        }
    }

    @H5ProMethod(name = "isImperialUnit")
    public static void isImperialUnit(ServiceApiCallback<Boolean> serviceApiCallback) {
        LogUtil.a(TAG, "isImperialUnit start");
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "isImperialUnit callback is null");
        } else {
            serviceApiCallback.onSuccess(Boolean.valueOf(UnitUtil.f()));
        }
    }

    @H5ProMethod(name = "isCelsiusUnit")
    public static void isCelsiusUnit(ServiceApiCallback<Boolean> serviceApiCallback) {
        LogUtil.a(TAG, "isCelsiusUnit start");
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "isCelsiusUnit callback is null");
        } else {
            serviceApiCallback.onSuccess(Boolean.valueOf(UnitUtil.a()));
        }
    }

    @H5ProMethod(name = "getThirdAuthInfo")
    public static void getThirdAuthInfo(String str, ServiceApiCallback<String> serviceApiCallback) {
        Log.i(TAG, "getThirdAuthInfo");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "getThirdAuthInfo: x-thirdApp-AT is null.");
            serviceApiCallback.onFailure(-1, "x-thirdApp-AT is null.");
            return;
        }
        Context context = BaseApplication.getContext();
        String url = GRSManager.c(context).getUrl(HealthEngineRequestManager.GRS_KEY);
        if (TextUtils.isEmpty(url)) {
            LogUtil.e(TAG, "getThirdAuthInfo: failed to get hms auth domain.");
            serviceApiCallback.onFailure(-1, "failed to get hms auth domain.");
            return;
        }
        request(url + THIRD_HMS_AUTH_URL, LoginInit.getInstance(context).getAccountInfo(1015), str, true, serviceApiCallback);
    }

    @H5ProMethod(name = "getClientType")
    public static void getClientType(ServiceApiCallback<Integer> serviceApiCallback) {
        int iD = qrs.d();
        ReleaseLogUtil.d(TAG, "getClientType:", Integer.valueOf(iD));
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "isCelsiusUnit callback is null");
        } else {
            serviceApiCallback.onSuccess(Integer.valueOf(iD));
        }
    }

    @H5ProMethod(name = "isSysNotifySettingEnable")
    public static void isSysNotifySettingEnable(ServiceApiCallback<Boolean> serviceApiCallback) {
        LogUtil.a(TAG, "enter isSysNotifySettingEnable");
        Object systemService = BaseApplication.getContext().getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService instanceof NotificationManager) {
            serviceApiCallback.onSuccess(Boolean.valueOf(((NotificationManager) systemService).areNotificationsEnabled()));
        } else {
            serviceApiCallback.onFailure(-1, "NotificationManager is null");
        }
    }

    @H5ProMethod(name = "jumpToSysNotifySetting")
    public static void jumpToSysNotifySetting(ServiceApiCallback<Boolean> serviceApiCallback) {
        LogUtil.a(TAG, "enter jumpToSysNotifySetting");
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", BaseApplication.getAppPackage());
        intent.setFlags(268435456);
        BaseApplication.getContext().startActivity(intent);
        serviceApiCallback.onSuccess(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void request(final String str, String str2, final String str3, final boolean z, final ServiceApiCallback<String> serviceApiCallback) {
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str2);
        map.put("x-thirdApp-AT", str3);
        oet.d().e(str, map, new HashMap(), String.class, new ResultCallback<String>() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str4) {
                serviceApiCallback.onSuccess(str4);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                Log.e(HealthCommonApi.TAG, "getThirdAuthInfo: " + th.getMessage());
                if (th instanceof oeu) {
                    oeu oeuVar = (oeu) th;
                    if (oeuVar.e() == 401 && z) {
                        Log.i(HealthCommonApi.TAG, "getThirdAuthInfo: refreshAccessToken");
                        HealthCommonApi.request(str, HealthAccessTokenUtil.getAtInstance().refreshAccessToken(), str3, false, serviceApiCallback);
                        return;
                    }
                    serviceApiCallback.onFailure(oeuVar.e(), oeuVar.getMessage());
                    return;
                }
                serviceApiCallback.onFailure(-1, th.getMessage());
            }
        });
    }

    @H5ProMethod
    public static void getAppFeatureCapability(ArrayList<String> arrayList, ServiceApiCallback<Map<String, Boolean>> serviceApiCallback) {
        byte b2;
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getAppFeatureCapability callback is null");
            return;
        }
        if (CollectionUtils.a(arrayList)) {
            LogUtil.j(TAG, "appFeatureKeyList is empty");
            serviceApiCallback.onFailure(-1, "appFeatureKeyList is empty");
            return;
        }
        HashMap map = new HashMap();
        for (String str : arrayList) {
            str.hashCode();
            switch (str) {
                case "healthInsights":
                    b2 = 0;
                    break;
                case "intelligentTrainingPlan":
                    b2 = 1;
                    break;
                case "isStoreDemoPhone":
                    b2 = 2;
                    break;
                case "promotionPolicyDialogEvent":
                    b2 = 3;
                    break;
                case "supportNewQuickEntry":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                map.put(Constants.HEALTH_INSIGHTS, Boolean.valueOf(ipc.c()));
            } else if (b2 == 1) {
                map.put(str, Boolean.valueOf(ipc.d()));
            } else if (b2 == 2) {
                map.put(str, Boolean.valueOf(Utils.n()));
            } else if (b2 == 3) {
                map.put(Constants.PROMOTION_POLICY_DIALOG_KEY, Boolean.valueOf(ezj.d()));
            } else if (b2 == 4) {
                map.put(str, Boolean.valueOf(fua.q()));
            } else {
                map.put(str, false);
            }
        }
        LogUtil.a(TAG, "get appFeatureCapability:", map);
        serviceApiCallback.onSuccess(map);
    }

    @H5ProMethod(name = "setCalendarTimeStamp")
    public static void setCalendarTimeStamp(long j, int i, ServiceApiCallback<Integer> serviceApiCallback) {
        LogUtil.a(TAG, "setCalendarTimeStamp timeStamp: " + new Date(j) + ", selectType: " + i);
        String[] strArr = CommonConstant.e;
        if (i == 10002) {
            strArr = new String[]{"KnitHealthData_Edit_" + DataInfos.BloodPressureDayDetail, "KnitHealthData_Edit_" + DataInfos.BloodPressureWeekDetail, "KnitHealthData_Edit_" + DataInfos.BloodPressureMonthDetail};
        }
        for (String str : strArr) {
            ObserverManagerUtil.e(str, Long.valueOf(j));
        }
        serviceApiCallback.onSuccess(0);
    }

    @H5ProMethod(name = "showDialog")
    public static void showDialog(Map<String, String> map, final ServiceApiCallback<JSONObject> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "showDialog callback is null");
            return;
        }
        if (CollectionUtils.c(map)) {
            LogUtil.j(TAG, "showDialog map is empty");
            serviceApiCallback.onFailure(-1, "map is empty");
            return;
        }
        String orDefault = map.getOrDefault("key", "");
        String orDefault2 = map.getOrDefault("content", "");
        LogUtil.a(TAG, "showDialog key:", orDefault, " content:", orDefault2);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthCommonApi.lambda$showDialog$0(serviceApiCallback, dialogInterface, i);
            }
        };
        if (TextUtils.equals("trainingPlanPrivacy", orDefault)) {
            qrh.e(BaseApplication.getActivity(), onClickListener);
            return;
        }
        if (TextUtils.equals("competitionPrivacy", orDefault)) {
            qrh.d(BaseApplication.getActivity(), onClickListener);
            return;
        }
        if (TextUtils.equals(SPORT_RECORD_RENAME, orDefault)) {
            showEditRecordNameDialog((RecordRenameInfo) HiJsonUtil.d(orDefault2, RecordRenameInfo.class), serviceApiCallback);
            return;
        }
        if (TextUtils.equals("benefitHalfModel", orDefault)) {
            showBenefitHalfModel(serviceApiCallback, orDefault2);
            return;
        }
        if (TextUtils.equals(Constants.PROMOTION_POLICY_DIALOG_KEY, orDefault)) {
            handlePromotionPolicyDialog(serviceApiCallback, orDefault2);
        } else if (TextUtils.equals(Constants.SMART_RECOMM_DIALOG_EVENT, orDefault)) {
            handleSmartRecommendDialog(serviceApiCallback, orDefault2);
        } else {
            serviceApiCallback.onFailure(-1, "key is not exit");
        }
    }

    static /* synthetic */ void lambda$showDialog$0(ServiceApiCallback serviceApiCallback, DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(COMMON_PARAM_BTN_INDEX, -1 == i ? 1 : 0);
            jSONObject.put(COMMON_PARAM_BTN_DESC, "");
        } catch (JSONException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
        }
        serviceApiCallback.onSuccess(jSONObject);
    }

    private static void showBenefitHalfModel(ServiceApiCallback<JSONObject> serviceApiCallback, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("fromPage", -1);
            int iOptInt2 = jSONObject.optInt("benefitType", -1);
            LogUtil.a(TAG, "showDialog go benefit half model fromPage is", Integer.valueOf(iOptInt), "benefitType is ", Integer.valueOf(iOptInt2));
            if (iOptInt != -1 && iOptInt2 != -1) {
                irz.b(BaseApplication.getContext(), iOptInt, iOptInt2);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                } catch (JSONException e) {
                    LogUtil.e(TAG, LogAnonymous.b(e));
                }
                serviceApiCallback.onSuccess(jSONObject2);
                return;
            }
            ReleaseLogUtil.a(TAG, "showBenefitHalfModel failed fromPage or benefitType read error");
            serviceApiCallback.onFailure(-1, "showBenefitHalfModel failed ");
        } catch (JSONException e2) {
            ReleaseLogUtil.a(TAG, "showDialog go benefit half model exception ", ExceptionUtils.c(e2));
            serviceApiCallback.onFailure(-1, "content params is error");
        }
    }

    public static void handlePromotionPolicyDialog(ServiceApiCallback<JSONObject> serviceApiCallback, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("showPage", "");
            String strOptString2 = jSONObject.optString("promotionPolicyInfo", "");
            LogUtil.a(TAG, "handlePromotionPolicyDialog fromPage is ", strOptString, " promotionPolicyInfoStr is ", strOptString2, " productInfo is ", jSONObject.optString("productInfo", ""));
            if (TextUtils.isEmpty(strOptString2)) {
                serviceApiCallback.onFailure(-1, "Invalid Parameter");
            }
            Activity activity = BaseApplication.getActivity();
            if (activity == null) {
                LogUtil.j(TAG, "handlePromotionPolicyDialog activity is null");
                serviceApiCallback.onFailure(-1, "activity is null");
                return;
            }
            PromotionPolicyInfo promotionPolicyInfo = (PromotionPolicyInfo) qqt.e(strOptString2, PromotionPolicyInfo.class);
            if (promotionPolicyInfo == null) {
                LogUtil.j(TAG, "handlePromotionPolicyDialog promotionInfo is null");
                serviceApiCallback.onFailure(-1, "promotionInfo is null");
            } else {
                ezj.b(promotionPolicyInfo, activity, strOptString);
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
            serviceApiCallback.onFailure(-1, "handlePromotionPolicyDialog content not json");
        }
    }

    public static void handleSmartRecommendDialog(ServiceApiCallback<JSONObject> serviceApiCallback, String str) {
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j(TAG, "handleSmartRecommendDialog activity is null");
            serviceApiCallback.onFailure(-1, "activity is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "handleSmartRecommendDialog content is empty");
            serviceApiCallback.onFailure(-1, "content is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("positionId", 0);
            List list = (List) qqt.c(jSONObject.optString("resources", ""), new TypeToken<List<ResourceBriefInfo>>() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi.2
            }.getType());
            ResourceBriefInfo resourceBriefInfo = njy.b(list) ? (ResourceBriefInfo) list.get(0) : null;
            if (resourceBriefInfo != null && resourceBriefInfo.getContent() != null && !TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
                showSmartRecommendPopup(serviceApiCallback, activity, iOptInt, resourceBriefInfo);
                serviceApiCallback.onSuccess(new JSONObject());
                return;
            }
            LogUtil.j(TAG, "handleSmartRecommendDialog resourceBriefInfo is invalid");
            serviceApiCallback.onFailure(-1, "resourceBriefInfo is invalid");
        } catch (JSONException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
            serviceApiCallback.onFailure(-1, "content parse error");
        }
    }

    public static void showSmartRecommendPopup(ServiceApiCallback<JSONObject> serviceApiCallback, final Activity activity, final int i, final ResourceBriefInfo resourceBriefInfo) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j(TAG, "handleSmartRecommendDialog marketingApi is null");
            serviceApiCallback.onFailure(-1, "marketingApi is null");
        } else if (!marketingApi.isResourceValid(i, resourceBriefInfo)) {
            LogUtil.a(TAG, "showSmartRecommendPopup isShowStandardDialog is false");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    marketingApi.showStandardDialog(activity, i, resourceBriefInfo);
                }
            });
            marketingApi.recordResourcePresent(i, 1, resourceBriefInfo);
        }
    }

    private static void showEditRecordNameDialog(RecordRenameInfo recordRenameInfo, final ServiceApiCallback<JSONObject> serviceApiCallback) {
        gcn.c().showEditRecordNameDialog(BaseApplication.getActivity(), recordRenameInfo.getStartTime(), recordRenameInfo.getEndTime(), recordRenameInfo.getSportType(), new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (!(obj instanceof String)) {
                    serviceApiCallback.onFailure(i, "type error");
                    return;
                }
                String str = (String) obj;
                LogUtil.a(HealthCommonApi.TAG, "recordName ", str);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(HealthCommonApi.COMMON_PARAM_BTN_INDEX, 0);
                    jSONObject.put(HealthCommonApi.COMMON_PARAM_BTN_DESC, str);
                } catch (JSONException e) {
                    LogUtil.e(HealthCommonApi.TAG, LogAnonymous.b(e));
                }
                serviceApiCallback.onSuccess(jSONObject);
            }
        });
    }

    @H5ProMethod(name = "getConfigInfo")
    public static void getConfigInfo(List<String> list, ServiceApiCallback<JSONObject> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getConfigInfo callback is null");
            return;
        }
        if (CollectionUtils.a(list)) {
            LogUtil.j(TAG, "moduleIDs is empty");
            serviceApiCallback.onFailure(-1, "moduleIDs is empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (list.contains(HEALTHY_CLOVERS_1)) {
                List<String> listE = qsr.c().e();
                if (CollectionUtils.a(listE)) {
                    listE = new ArrayList<>();
                }
                jSONObject.putOpt(HEALTHY_CLOVERS_1, new JSONArray((Collection) listE));
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
        }
        LogUtil.a(TAG, "getConfigInfo:", jSONObject);
        serviceApiCallback.onSuccess(jSONObject);
    }

    @H5ProMethod(name = "routeToUri")
    public static void routeToUri(String str, final ServiceApiCallback<Integer> serviceApiCallback) {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            serviceApiCallback.onFailure(-1, "param is empty");
            return;
        }
        try {
            strOptString = new JSONObject(str).optString("uri", "");
        } catch (JSONException e) {
            LogUtil.e(TAG, e.getMessage());
            strOptString = null;
        }
        if (!TrustListCheckerImpl.isTrustedToLoadUri(strOptString)) {
            LogUtil.j(TAG, "routeToUri: untrusted -> " + strOptString);
            serviceApiCallback.onFailure(-1, "untrusted -> " + strOptString);
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            serviceApiCallback.onFailure(-1, "routerApi error");
        } else {
            marketRouterApi.router(strOptString, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    HealthCommonApi.lambda$routeToUri$2(serviceApiCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$routeToUri$2(ServiceApiCallback serviceApiCallback, int i, Object obj) {
        LogUtil.a(TAG, "routeToUri: router code -> " + i);
        if (i == 0) {
            serviceApiCallback.onSuccess(Integer.valueOf(i));
        } else if (i == 1) {
            serviceApiCallback.onSuccess(Integer.valueOf(i));
        } else {
            serviceApiCallback.onFailure(i, String.valueOf(obj));
        }
    }
}
