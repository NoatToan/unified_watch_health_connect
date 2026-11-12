package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.adapterhealthmgr.api.AdapterHealthMgrApi;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.main.stories.soical.interactor.OperationDetailActivityStartCallback;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.ui.main.stories.soical.operationactivity.ActivityInfoFactory;
import com.huawei.ui.main.stories.soical.operationactivity.UserActivityInfoReq;
import com.huawei.ui.main.stories.soical.operationactivity.UserActivityInfoRsp;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = OperationInteractorsApi.class)
@Singleton
public class wop implements OperationInteractorsApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OperationWebActivityIntentBuilderApi f52273a = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    private final ActivityHtmlPathApi d = (ActivityHtmlPathApi) Services.d("PluginOperation", ActivityHtmlPathApi.class);
    private final AdapterHealthMgrApi e = (AdapterHealthMgrApi) Services.d("HwAdpaterHealthMgr", AdapterHealthMgrApi.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OperationUtilsApi f52274b = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public void getOperationList(Context context, int i, List<Integer> list, final HttpResCallback httpResCallback) {
        if (CommonUtil.ca()) {
            LogUtil.a("UIDV_OperationInteractors", "isStoreDemoVersion getOperationList return.");
            return;
        }
        final HashMap<String, String> mapD = d(i, list, context);
        final HashMap map = new HashMap();
        if (!TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008))) {
            map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
        }
        map.put("x-version", CommonUtil.c(context));
        GRSManager.c(context).d("activityUrl", new GrsQueryCallback() { // from class: wop.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("UIDV_OperationInteractors", "GRS url = ", str, " params:", mapD.toString(), " headers:", map.toString());
                ltg.c(str + "/activity/getActivities", mapD, map, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.d("UIDV_OperationInteractors", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i2));
            }
        });
    }

    private HashMap<String, String> d(int i, List<Integer> list, Context context) {
        HashMap<String, String> map = new HashMap<>();
        if (i >= 0) {
            map.put("joinStatus", String.valueOf(i));
        }
        if (njy.b(list)) {
            map.put(SyncDataConstant.BI_KEY_ACTIVITY_TYPE, String.valueOf(list));
        }
        map.put("pageNo", "0");
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, "500");
        if (CommonUtil.ap() || CommonUtil.cl()) {
            map.put("isBeta", "1");
        }
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", String.valueOf(CommonUtil.h(context)));
        map.put("wearType", "");
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", String.valueOf(1));
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(ltb.h()));
        map.put("token", a());
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("upDeviceType", LoginInit.getInstance(context).getDeviceType());
        if (LoginInit.getInstance(context).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        map.put("countryCode", LoginInit.getInstance(context).getAccountInfo(1010));
        map.put("siteId", LoginInit.getInstance(context).getAccountInfo(1009));
        map.put("currentManufacturer", Build.MANUFACTURER);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        return map;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public dlp expoundOperationActivity(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dlp dlpVar = new dlp();
        try {
            if (!jSONObject.isNull("activityName")) {
                dlpVar.a(jSONObject.getString("activityName"));
            }
            if (!jSONObject.isNull("activityId")) {
                dlpVar.e(jSONObject.getString("activityId"));
            }
            if (!jSONObject.isNull("imgUrl")) {
                dlpVar.c(jSONObject.getString("imgUrl"));
            }
            if (!jSONObject.isNull(ParsedFieldTag.BEGIN_DATE)) {
                dlpVar.f(jSONObject.getString(ParsedFieldTag.BEGIN_DATE));
            }
            if (!jSONObject.isNull("endDate")) {
                dlpVar.h(jSONObject.getString("endDate"));
            }
            if (!jSONObject.isNull("numberOfPeople")) {
                dlpVar.i(jSONObject.getString("numberOfPeople"));
            }
            if (!jSONObject.isNull("activityStatus")) {
                dlpVar.b(jSONObject.getInt("activityStatus"));
            }
            if (!jSONObject.isNull(SyncDataConstant.BI_KEY_ACTIVITY_TYPE)) {
                dlpVar.d(jSONObject.getInt(SyncDataConstant.BI_KEY_ACTIVITY_TYPE));
            }
            if (!jSONObject.isNull("teamFlag")) {
                dlpVar.l(jSONObject.getInt("teamFlag"));
            }
            if (!jSONObject.isNull("timeZone")) {
                dlpVar.k(jSONObject.getString("timeZone"));
            }
            c(jSONObject, dlpVar);
            return dlpVar;
        } catch (JSONException e) {
            LogUtil.e("UIDV_OperationInteractors", "expoundOperationActivity parse json meet exception: ", e.getMessage());
            return null;
        }
    }

    private static void c(JSONObject jSONObject, dlp dlpVar) throws JSONException {
        if (jSONObject == null || dlpVar == null) {
            return;
        }
        if (!jSONObject.isNull("templateType")) {
            dlpVar.i(jSONObject.getInt("templateType"));
        }
        if (!jSONObject.isNull("activityLink")) {
            dlpVar.b(jSONObject.getString("activityLink"));
        }
        if (!jSONObject.isNull("rotinePosition")) {
            dlpVar.h(jSONObject.getInt("rotinePosition"));
        }
        if (!jSONObject.isNull("activityPosition")) {
            dlpVar.c(jSONObject.getInt("activityPosition"));
        }
        if (!jSONObject.isNull("matchBeginDate")) {
            dlpVar.j(jSONObject.getString("matchBeginDate"));
        }
        if (!jSONObject.isNull("activityContext")) {
            dlpVar.d(jSONObject.getString("activityContext"));
        }
        if (!jSONObject.isNull("haveHistoryTodo")) {
            dlpVar.g(jSONObject.getInt("haveHistoryTodo"));
        }
        if (!jSONObject.isNull("activityTargetTodo")) {
            dlpVar.a(jSONObject.getInt("activityTargetTodo"));
        }
        if (!jSONObject.isNull("continuityTodo")) {
            dlpVar.j(jSONObject.getInt("continuityTodo"));
        }
        if (!jSONObject.isNull("targetDaysTodo")) {
            dlpVar.f(jSONObject.getInt("targetDaysTodo"));
        }
        if (!jSONObject.isNull("completeFlagTodo")) {
            dlpVar.e(jSONObject.getInt("completeFlagTodo"));
        }
        if (!jSONObject.isNull("appVersion")) {
            dlpVar.g(jSONObject.getString("appVersion"));
        }
        if (!jSONObject.isNull(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE)) {
            dlpVar.n(jSONObject.getString(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE));
        }
        if (!jSONObject.isNull("workoutUserLable ")) {
            dlpVar.m(jSONObject.getString("workoutUserLable "));
        }
        if (jSONObject.isNull(com.huawei.health.messagecenter.model.CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH)) {
            return;
        }
        dlpVar.k(jSONObject.getInt(com.huawei.health.messagecenter.model.CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH));
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public JSONObject activityBeanToJSONObject(dlp dlpVar) {
        JSONObject jSONObject = new JSONObject();
        if (dlpVar == null) {
            LogUtil.j("UIDV_OperationInteractors", "activityBeanToJSONObject:activity == null");
            return jSONObject;
        }
        try {
            jSONObject.put("activityName", dlpVar.c());
            jSONObject.put("activityId", dlpVar.d());
            jSONObject.put("imgUrl", dlpVar.b());
            jSONObject.put(ParsedFieldTag.BEGIN_DATE, dlpVar.s());
            jSONObject.put("endDate", dlpVar.o());
            jSONObject.put("timeZone", dlpVar.v());
            jSONObject.put("numberOfPeople", dlpVar.l());
            jSONObject.put("activityStatus", dlpVar.i());
            jSONObject.put(SyncDataConstant.BI_KEY_ACTIVITY_TYPE, dlpVar.h());
            jSONObject.put("templateType", dlpVar.q());
            jSONObject.put("activityLink", dlpVar.e());
            jSONObject.put("rotinePosition", dlpVar.p());
            jSONObject.put("activityPosition", dlpVar.j());
            jSONObject.put("matchBeginDate", dlpVar.r());
            jSONObject.put("activityContext", dlpVar.a());
            jSONObject.put("haveHistoryTodo", dlpVar.n());
            jSONObject.put("activityTargetTodo", dlpVar.g());
            jSONObject.put("continuityTodo", dlpVar.k());
            jSONObject.put("targetDaysTodo", dlpVar.t());
            jSONObject.put("completeFlagTodo", dlpVar.m());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("UIDV_OperationInteractors", "Json data error! JSONException:", e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public String getGMTtoLocal(String str) {
        LogUtil.d("UIDV_OperationInteractors", "getGMTtoLocal");
        String strA = null;
        if (str == null) {
            LogUtil.a("UIDV_OperationInteractors", "date is null");
            return null;
        }
        LogUtil.a("UIDV_OperationInteractors", "before GMTtoLocal ", str);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            strA = UnitUtil.a(simpleDateFormat.parse(str), ARImageMetadata.CONTROL_SCENE_MODE);
            LogUtil.a("UIDV_OperationInteractors", "after GMTtoLocal ", strA);
            return strA;
        } catch (ParseException e) {
            LogUtil.e("UIDV_OperationInteractors", "getGMTtoLocal(),Exception exception = ", e.getMessage());
            return strA;
        }
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public ArrayList getActivityPageType(dlp dlpVar) {
        String strY = dlpVar.y();
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        String[] strArrSplit = strY.split(",");
        ArrayList arrayList = new ArrayList(2);
        for (String str : strArrSplit) {
            arrayList.add(Integer.valueOf(qrs.a(str)));
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public boolean isMatchPage(int i, ArrayList<Integer> arrayList) {
        return njy.b(arrayList) && arrayList.contains(Integer.valueOf(i));
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public boolean isUserLabelActivity(dlp dlpVar, List<String> list) {
        if (dlpVar == null || njy.e(list)) {
            LogUtil.j("UIDV_OperationInteractors", "isUserLableActivity is null or userLables is empty.");
            return true;
        }
        String strW = dlpVar.w();
        if (TextUtils.isEmpty(strW)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(strW);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (TextUtils.isEmpty(next)) {
                    return false;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!list.contains((String) jSONArray.get(i))) {
                    }
                }
                return false;
            }
        } catch (JSONException unused) {
            LogUtil.e("UIDV_OperationInteractors", "isUserLableActivity JSONException");
        }
        return true;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public int getActivityStatus(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("UIDV_OperationInteractors", "curDate or startDate or endDate is empty");
            return 2;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat.parse(str3);
            Date date3 = simpleDateFormat.parse(str2);
            if (date.getTime() < date3.getTime()) {
                return 0;
            }
            if (date3.getTime() <= date.getTime() && date.getTime() <= date2.getTime()) {
                return 1;
            }
            if (date2.getTime() < date.getTime()) {
                return -1;
            }
            LogUtil.j("UIDV_OperationInteractors", "no branch!");
            return 1;
        } catch (ParseException e) {
            LogUtil.e("UIDV_OperationInteractors", "getGMTtoLocal(),Exception exception = ", e.getMessage());
            return 2;
        }
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public boolean isHuaweiNoTemplateActivity(dlp dlpVar) {
        return dlpVar.h() == 400;
    }

    private boolean e(dlp dlpVar) {
        OperationUtilsApi operationUtilsApi = this.f52274b;
        if (operationUtilsApi == null) {
            return false;
        }
        return operationUtilsApi.isChallengeActivity(dlpVar.h());
    }

    private String a(String str, dlp dlpVar) {
        String str2;
        String str3 = str + this.d.getActivityHtmlPath(dlpVar);
        if (dlpVar.i() == -1) {
            str2 = str3 + "activityShare";
        } else if (e(dlpVar)) {
            str2 = str3 + "rankList";
        } else if (dlpVar.aa()) {
            str2 = str3 + "groupChallenge/dist/index";
        } else {
            str2 = str3 + "calendar";
        }
        if (dlpVar.q() == 5 && !dlpVar.aa()) {
            str2 = str2 + "New";
        }
        String str4 = str2 + ".html?activityId=" + dlpVar.d();
        if (dlpVar.aa()) {
            str4 = str4 + "#/score";
        }
        if (dlpVar.i() == -1 || dlpVar.aa()) {
            return str4;
        }
        return str4 + "&activityName=" + dlpVar.c();
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public String getOperationActivityUrl(String str, dlp dlpVar) {
        LogUtil.d("UIDV_OperationInteractors", "getOperationActivityUrl activityUrl = ", str);
        if (dlpVar.q() == 4) {
            LogUtil.a("UIDV_OperationInteractors", "Enter ACTIVITY_TEMPLATETYPE_NO_DETAIL");
            return dlpVar.e();
        }
        return a(str, dlpVar);
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public String getMaxActivityId(JSONArray jSONArray) {
        int i = 0;
        int i2 = 0;
        String strD = "";
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject != null) {
                    dlp dlpVarExpoundOperationActivity = expoundOperationActivity(jSONObject);
                    if (dlpVarExpoundOperationActivity != null && dlpVarExpoundOperationActivity.d() != null && !"".equals(dlpVarExpoundOperationActivity.d())) {
                        try {
                            i = Integer.parseInt(dlpVarExpoundOperationActivity.d());
                        } catch (NumberFormatException e) {
                            LogUtil.e("UIDV_OperationInteractors", "NumberFormatException exception = ", e.getMessage());
                        }
                    }
                    if (i > i2) {
                        if (dlpVarExpoundOperationActivity != null) {
                            strD = dlpVarExpoundOperationActivity.d();
                        }
                        i2 = i;
                    }
                }
            } catch (JSONException e2) {
                LogUtil.e("UIDV_OperationInteractors", "Json data error! JSONException:", e2.getMessage());
            }
        }
        return strD;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public boolean judgeVersionSupport(String str) {
        LogUtil.a("UIDV_OperationInteractors", "judgeVersionSupport enter!");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UIDV_OperationInteractors", "judgeVersionSupport cloudVersion is empty");
            return true;
        }
        String strA = CommonUtil.a(BaseApplication.getContext());
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("UIDV_OperationInteractors", "judgeVersionSupport version is empty");
            return true;
        }
        LogUtil.d("UIDV_OperationInteractors", "version from app = ", strA, " cloud = ", str);
        int iIndexOf = strA.indexOf(Constants.LINK);
        LogUtil.d("UIDV_OperationInteractors", "index: ", Integer.valueOf(iIndexOf));
        if (iIndexOf >= 0) {
            strA = strA.substring(0, iIndexOf);
        }
        while (!"".equals(strA)) {
            int iIndexOf2 = strA.indexOf(".");
            int iA = qrs.a(strA.substring(0, iIndexOf2 > -1 ? iIndexOf2 : strA.length()));
            if (iIndexOf2 < 0) {
                strA = "";
            } else {
                strA = strA.substring(iIndexOf2 + 1);
            }
            int iIndexOf3 = str.indexOf(".");
            int iA2 = qrs.a(str.substring(0, iIndexOf3 > -1 ? iIndexOf3 : str.length()));
            str = str.substring(iIndexOf3 + 1);
            if (iA > iA2) {
                return true;
            }
            if (iA < iA2) {
                return false;
            }
            LogUtil.j("UIDV_OperationInteractors", "no branch!");
        }
        return true;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public void setNeedUpdateActivity(Context context, boolean z) {
        String str;
        StorageParams storageParams = new StorageParams();
        if (z) {
            str = "TRUE_VALUE";
        } else {
            str = "FALSE_VALUE";
        }
        SharedPreferenceManager.e(context, Integer.toString(10011), "SOCIAL_FRAGMENT_IS_NEED_UPDATE_ACTIVITY", str, storageParams);
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public boolean getNeedUpdateActivity(Context context) {
        return "TRUE_VALUE".equals(SharedPreferenceManager.e(context, Integer.toString(10011), "SOCIAL_FRAGMENT_IS_NEED_UPDATE_ACTIVITY"));
    }

    private String a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                return URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("UIDV_OperationInteractors", "token encode Exception ", e.toString());
            }
        }
        return accountInfo;
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public void gotoOperationActivityDetail(final Context context, String str, final dlp dlpVar, final OperationDetailActivityStartCallback operationDetailActivityStartCallback) {
        final String operationActivityUrl = getOperationActivityUrl(str, dlpVar);
        setNeedUpdateActivity(context, true);
        HandlerExecutor.b(new Runnable() { // from class: wor
            @Override // java.lang.Runnable
            public final void run() {
                this.f52279c.c(operationDetailActivityStartCallback, dlpVar, context, operationActivityUrl);
            }
        });
    }

    /* synthetic */ void c(OperationDetailActivityStartCallback operationDetailActivityStartCallback, dlp dlpVar, Context context, String str) {
        if (operationDetailActivityStartCallback != null) {
            operationDetailActivityStartCallback.beforeDetailStart(dlpVar);
        }
        iov.d(context, this.f52273a.builder(context, str).build());
        if (operationDetailActivityStartCallback != null) {
            operationDetailActivityStartCallback.afterDetailStart(dlpVar);
        }
    }

    @Override // com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi
    public void getUserActivityInfo(int i, String str, List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        UserActivityInfoReq userActivityInfoReq = new UserActivityInfoReq();
        if (i == 1) {
            if (njy.e(list)) {
                return;
            }
            userActivityInfoReq.setQueryType(1);
            userActivityInfoReq.setActivityList(list);
        } else {
            userActivityInfoReq.setQueryType(0);
            userActivityInfoReq.setActivityId(str);
        }
        ActivityInfoFactory activityInfoFactory = new ActivityInfoFactory(BaseApplication.getContext());
        UserActivityInfoRsp userActivityInfoRsp = (UserActivityInfoRsp) oet.d().e(userActivityInfoReq.getUrl(), activityInfoFactory.getHeaders(), ofe.c(activityInfoFactory.getBody(userActivityInfoReq)), UserActivityInfoRsp.class);
        if (userActivityInfoRsp == null) {
            LogUtil.j("UIDV_OperationInteractors", "getUserActivityInfo, userActivityInfoRsp is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String resultCode = userActivityInfoRsp.getResultCode();
        LogUtil.a("UIDV_OperationInteractors", "getUserActivityInfo, resultCode = ", resultCode);
        List<wog> userActivityInfoList = userActivityInfoRsp.getUserActivityInfoList();
        if (userActivityInfoList == null) {
            LogUtil.j("UIDV_OperationInteractors", "getUserActivityInfo, infoList is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(CommonUtil.n(BaseApplication.getContext(), resultCode), userActivityInfoList);
        }
    }
}
