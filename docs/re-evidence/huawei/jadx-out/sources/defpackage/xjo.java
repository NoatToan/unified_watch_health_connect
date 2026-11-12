package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.UrlBean;
import com.huawei.operation.beans.WebViewConfig;
import com.huawei.operation.h5pro.jsmodules.device.DevicePairUtils;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.up.model.UserInfomation;
import com.huawei.up.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xjo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53121c = "HWAdapterHelper";

    private static Map<String, String> a() {
        HashMap map = new HashMap();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        String accountInfo = loginInit.getAccountInfo(1008);
        String accountInfo2 = loginInit.getAccountInfo(1015);
        map.put("huid", loginInit.getAccountInfo(1011));
        map.put("severToken", accountInfo);
        map.put("accessToken", accountInfo2);
        return map;
    }

    private static Map<String, String> g() {
        HashMap map = new HashMap();
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            map.put("birthday", userInfo.getBirthday());
            map.put(CommonConstant.KEY_GENDER, String.valueOf(userInfo.getGender()));
            map.put("weight", String.valueOf(userInfo.getWeight()));
            map.put("height", String.valueOf(userInfo.getHeight()));
            map.put("name", userInfo.getName());
            map.put("languageCode", userInfo.getLanguageCode());
            map.put("portraitUrl", userInfo.getPortraitUrl());
            map.put("picPath", userInfo.getPicPath());
        }
        return map;
    }

    private static Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("deviceModel", PhoneInfoUtils.getDeviceModel());
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        String deviceId = loginInit.getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("deviceType", PhoneInfoUtils.getPhoneType());
        map.put("upDeviceType", loginInit.getDeviceType());
        return map;
    }

    private static Map<String, String> e() {
        HashMap map = new HashMap();
        map.put("version", CommonUtil.a(BaseApplication.getContext()));
        map.put("grayVersion", CommonUtil.c(BaseApplication.getContext()));
        map.put("appId", OperationUtils.getAppId(BaseApplication.getContext()));
        map.put("sysVersion", OperationUtils.getSysVersion());
        map.put("environment", String.valueOf(CommonUtil.o(BaseApplication.getContext())));
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iversion", String.valueOf(OperationUtils.getInterfaceVersion()));
        map.put("utc", String.valueOf(OperationUtils.getUtc()));
        return map;
    }

    public static void c(Context context, gxt gxtVar, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        gxtVar.e(z);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
    }

    public static Map<String, String> a(String[] strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            if (str.equals("getLoginInfo")) {
                map.putAll(a());
            } else if (str.equals(Constants.METHOD_GET_USER_INFO)) {
                map.putAll(g());
            } else if (str.equals("getDeviceInfo")) {
                map.putAll(d());
            } else if (str.equals("getPhoneInfo")) {
                map.putAll(c());
            } else if (str.equals("getAppInfo")) {
                map.putAll(e());
            } else {
                LogUtil.j(f53121c, "not match");
            }
        }
        return map;
    }

    public static void c(Context context, String str) {
        PluginOperation.getInstance(context).setAdapter(PluginOperationAdapterImpl.getInstance(context));
        PluginOperation.getInstance(context).startOperationWebPage(str);
    }

    public static String b(Context context) {
        UrlBean urlBean;
        WebViewConfig webViewConfigQueryWebViewConfig = PluginOperationAdapterImpl.getInstance(context).queryWebViewConfig();
        if (webViewConfigQueryWebViewConfig == null || (urlBean = webViewConfigQueryWebViewConfig.getUrlBean()) == null) {
            return null;
        }
        return urlBean.getKakaExchangeUrl();
    }

    public static String b(MessageObject messageObject) {
        if (messageObject == null) {
            LogUtil.d(f53121c, "messageObject == null");
            return "";
        }
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        String msgId = messageObject.getMsgId();
        String module = messageObject.getModule();
        String type = messageObject.getType();
        if (TextUtils.isEmpty(msgId)) {
            LogUtil.d(f53121c, "requestMessageId ");
            msgId = messageCenterApi.getMessageId(module, type);
            messageObject.setMsgId(msgId);
        }
        messageCenterApi.insertMessage(messageObject);
        if (MessageConstant.ACQUIRE_MEDAL_TYPE.equals(messageObject.getType()) || MessageConstant.NEW_MEDAL_TYPE.equals(messageObject.getType()) || "monthReportMessage".equals(messageObject.getType())) {
            c(messageObject);
        }
        LogUtil.a(f53121c, "generateMessage obj=" + messageObject);
        return msgId;
    }

    private static void c(MessageObject messageObject) {
        messageObject.setPosition(3);
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).showNotification(BaseApplication.getContext(), messageObject);
    }

    public static void c(Context context, int i, int i2, float f) {
        LogUtil.a(f53121c, "startGPSMotionTrack in Manager Module with sportType=", Integer.valueOf(i), "", ",targetType=", Integer.valueOf(i2), ",targetValue=", Float.valueOf(f));
        ive.c().e(0, i, i2, f, (ISportDataCallback) null, BaseApplication.getContext());
        PluginOperation.getInstance(context).backToActivityListPage();
    }

    public static void c(Context context, String str, String str2) {
        LogUtil.d(f53121c, "startFitnessPage in Manager Module with[id=", str, ",version=", str2, "]");
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        idy.a((String) null);
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(str2);
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId(str);
        workoutRecord.savePlanId("");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord);
        pcd pcdVar = new pcd(str);
        pcdVar.q(str2);
        pea.b(context, pcdVar, (ArrayList<WorkoutRecord>) arrayList);
        PluginOperation.getInstance(context).backToActivityListPage();
    }

    private static Map<String, String> d() {
        String str = f53121c;
        LogUtil.a(str, "getDeviceInfo");
        HashMap map = new HashMap();
        if (mga.c()) {
            DeviceInfo deviceInfoC = mgg.c(str);
            if (deviceInfoC != null) {
                LogUtil.a(str, "getDeviceInfo ", deviceInfoC.getDeviceName(), "deviceTyp=", String.valueOf(deviceInfoC.getProductType()));
                map.put("deviceName", deviceInfoC.getDeviceName());
                map.put("productType", String.valueOf(deviceInfoC.getProductType()));
                map.put(DevicePairUtils.DEVICE_CONNECT_STATE, String.valueOf(deviceInfoC.getDeviceConnectState()));
                map.put("deviceModel", deviceInfoC.getDeviceModel());
                map.put("deviceModelName", deviceInfoC.getDeviceModel());
                return map;
            }
            LogUtil.a(str, "getDeviceInfo enter else");
        }
        return map;
    }

    public static void e(final Context context) {
        if (context == null) {
            LogUtil.j(f53121c, "skipKaka context = null");
            return;
        }
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, com.huawei.haf.application.BaseApplication.b(), new Consumer<PluginSuggestion>() { // from class: xjo.4
                @Override // com.huawei.framework.servicemgr.Consumer
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void accept(PluginSuggestion pluginSuggestion) {
                    if (pluginSuggestion != null) {
                        pluginSuggestion.init(BaseApplication.getContext());
                    }
                    xjo.e(context);
                }
            }, true);
            return;
        }
        oru oruVarA = oru.a(context);
        if (oruVarA.getAdapter() == null) {
            oru.a(context).setAdapter(new PluginAchieveAdapterImpl());
        }
        oruVarA.d(context);
        oruVarA.r();
        oruVarA.c(context);
    }

    public static void a(final Context context) {
        if (context == null) {
            LogUtil.j(f53121c, "jumpWebview context = null");
        } else {
            c(context);
            GRSManager.c(context).d("healthRecommendUrl", new GrsQueryCallback() { // from class: xjo.3
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j(xjo.f53121c, "geturl is empty");
                        return;
                    }
                    try {
                        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
                        intent.putExtra("url", str + "/miniShop/html/homePage.html");
                        intent.putExtra("type", 3001);
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e(xjo.f53121c, "onCallBackSuccess ActivityNotFoundException e:", e.getMessage());
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.j(xjo.f53121c, "GRSManager onCallBackFail HEALTH_RECOMMEND errorCode = ", Integer.valueOf(i));
                }
            });
        }
    }

    private static void c(Context context) {
        if (oru.a(context).getAdapter() == null) {
            LogUtil.j(f53121c, "PluginAchieveAdapter == null");
            oru.a(context).setAdapter(new PluginAchieveAdapterImpl());
        }
        PluginOperation pluginOperation = PluginOperation.getInstance(context);
        if ((pluginOperation.getAdapter() instanceof PluginOperationAdapter ? (PluginOperationAdapter) pluginOperation.getAdapter() : null) == null) {
            LogUtil.j(f53121c, "pluginOperationAdapter == null");
            d(context);
        }
    }

    private static void d(Context context) {
        PluginOperation pluginOperation = PluginOperation.getInstance(context);
        pluginOperation.setAdapter(PluginOperationAdapterImpl.getInstance(context));
        pluginOperation.init(context);
    }
}
