package com.huami.account.api;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.UserLegalInfoExt;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.entity.MinorAuthorizationEntity;
import com.huami.account.api.model.HMBeanWeightGoal;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.bean.AuthDeviceSource;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.UtilsKt;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
public class HMAccountWebAPI {
    public static final String APPS_SETTINGS_AD_AGE = "com.huami.minor.age";
    public static final String APPS_SETTINGS_AUTH_PAGE = "huami.thirdparty.oauth";
    public static final String APPS_SETTINGS_AUTH_STOP = "huami.thirdparty.oauth.stop";
    public static final String APPS_SETTINGS_TRACK_SHARE = "huami.mifit.sport.shareRouter";
    public static final String APPS_S_SETTINGS = "apps/%s/settings";
    public static final String MILI_CONFIG_EXTRA_WEATHER = "weatherSetting";
    public static final String PARAM_BIND_BIRTHDAY = "birthday";
    public static final String PARAM_BIND_GENDER = "gender";
    public static final String PARAM_BIND_HEIGHT = "height";
    public static final String PARAM_BIND_ICON = "icon";
    public static final String PARAM_BIND_ICON_URL = "icon_url";
    public static final String PARAM_BIND_INTRODUCTION = "userIntroduction";
    public static final String PARAM_BIND_LOCATION = "location";
    public static final String PARAM_BIND_MILI_CONFIG = "config";
    public static final String PARAM_BIND_NICK_NAME = "nick_name";
    public static final String PARAM_BIND_PERSON_AGE = "age";
    public static final String PARAM_BIND_PERSON_ALARM_CLOCK = "alarm_clock";
    public static final String PARAM_BIND_PERSON_SH = "person_sh";
    public static final String PARAM_BIND_PERSON_VERSION = "version";
    public static final String PARAM_BIND_SIGNATURE = "person_signature";
    public static final String PARAM_BIND_WEIGHT = "weight";
    public static final String PARAM_DEFAULT_FIELDS = "defaultFields";
    public static final String PARAM_FILE_NAME = "fileName";
    public static final String PARAM_REDIRECT_TYPE = "redirectType";
    public static final String PARAM_URL_FILE_TYPE = "LOGIN_FAIL";
    public static final String STATE_NOTHING = "NOTHING";
    public static final String URL_MINOR_AUTHORIZATION = "t/reconfirmation";
    public static final String URL_MINOR_AUTHORIZATION_IMPROPER = "t/reconfirmation_iron_man";
    public static final String URL_MINOR_AUTHORIZATION_IMPROPER_BAND = "t/reconfirmation_band_four_marvel";
    private static final String a = "HMAccountWebAPI";
    private static final String b = "huami.health.bindProfile.json";
    private static final String c = "huami.health.scale.usergoal.getusergoallist.json";
    private static final String d = "v1/users/authorizations.json";
    private static final String e = "huami.health.loginout.json";
    private static final String f = "huami.health.getUserInfo.json";
    private static final String g = "users/{userId}";
    private static final String h = "users/{userId}/minorAuthorization?noLock=true";
    private static final String i = "users/{userId}/gdpr/state";
    private static final String j = "users/%s/devices/%s/authKey";
    private static final String k = "apps/pageVersions";
    private static final String l = "apps/pageUrl";
    private static final String m = "apps/%s/files/%s/diagnoseFileAccessURIs";
    private static final String n = "apps/%s/files/%s/diagnoseFileUpload";
    private static final String o = "deviceType";
    private static final String p = "deviceSource";
    private static final String q = "authKey";
    private static final int r = 200;

    public interface LegalInfoVersionCallback {
        void onFetchSuccessOrExist();
    }

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;

        public a(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
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

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData == null || !hMHttpResponseData.getSuccess() || hMHttpResponseData.getResponseBody() == null) {
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset());
            HMLog.v(HMAccountWebAPI.a, "item: " + hMHttpResponseData.toString(), new Object[0]);
            try {
                if (HMAccountWebAPI.STATE_NOTHING.equals(new JSONObject(str).getString("state"))) {
                    this.a.set(false);
                } else {
                    this.a.set(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements IHMBasicHttpResponseHandler {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(int i) {
            return "uploadUserBirthday onCancel: type=" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(Throwable th) {
            return "uploadUserBirthday onError: " + th.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(HMHttpResponseData hMHttpResponseData) {
            return "uploadUserBirthday onFailure: " + hMHttpResponseData.toString();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(final int i) {
            HMLog.info(HMAccountWebAPI.a, new Function0() { // from class: com.huami.account.api.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebAPI.b.d(i);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(final Throwable th) {
            HMLog.info(HMAccountWebAPI.a, new Function0() { // from class: com.huami.account.api.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebAPI.b.e(th);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(final HMHttpResponseData hMHttpResponseData) {
            HMLog.info(HMAccountWebAPI.a, new Function0() { // from class: com.huami.account.api.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebAPI.b.f(hMHttpResponseData);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.v(HMAccountWebAPI.a, "upload: " + hMHttpResponseData.toString(), new Object[0]);
        }
    }

    public class c implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ IHMBasicHttpResponseHandler a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HMPersonInfo c;

        public c(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, String str, HMPersonInfo hMPersonInfo) {
            this.a = iHMBasicHttpResponseHandler;
            this.b = str;
            this.c = hMPersonInfo;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onCancel(i);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onFailure(hMHttpResponseData);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            this.a.onSuccess(hMHttpResponseData);
            HMAccountKeeper.INSTANCE.setLastSyncPersonInfo(this.b);
            ((LastLoginInfoRepository) KoinJavaComponent.get(LastLoginInfoRepository.class)).updateNickname(this.c.getUserInfo().getNickname());
        }
    }

    public class d extends IHMSimpleHttpResponseHandler {
        private void a(HMBeanWeightGoal hMBeanWeightGoal) {
            if (hMBeanWeightGoal != null) {
                HMLog.v(HMAccountWebAPI.a, "UserWeightGoalList-list:" + hMBeanWeightGoal.toString(), new Object[0]);
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                hMPersonInfo.getUserInfo().setTargetWeight(hMBeanWeightGoal.getGoal());
                hMPersonInfo.saveInfoAsync();
                HMLog.v(HMAccountWebAPI.a, "UserWeightGoalList-save:" + hMPersonInfo.getUserInfo().getTargetWeight(), new Object[0]);
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            List list;
            if (!hMHttpResponseData.isSuccess() || (list = hMHttpResponseData.parseList(HMBeanWeightGoal[].class, new String[]{"data", "list"})) == null || list.size() <= 0) {
                return;
            }
            a((HMBeanWeightGoal) list.get(0));
        }
    }

    public class e extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicReference a;

        public e(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            this.a.set(new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset()));
        }
    }

    public class f extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ File b;

        public f(AtomicBoolean atomicBoolean, File file) {
            this.a = atomicBoolean;
            this.b = file;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess() || hMHttpResponseData.getResponseBody() == null) {
                return;
            }
            this.a.set(new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset()).contains(this.b.getName()));
        }
    }

    public class g extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;

        public g(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                this.a.set(true);
            }
        }
    }

    public class h extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ LegalInfoVersionCallback a;

        public h(LegalInfoVersionCallback legalInfoVersionCallback) {
            this.a = legalInfoVersionCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(HMHttpResponseData hMHttpResponseData) {
            return "getLegalInfoVersion onFailure: " + hMHttpResponseData.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(HMHttpResponseData hMHttpResponseData) {
            return "getLegalInfoVersion not success: " + hMHttpResponseData.toString();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(final HMHttpResponseData hMHttpResponseData) {
            HMLog.info(HMAccountWebAPI.a, new Function0() { // from class: com.huami.account.api.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebAPI.h.c(hMHttpResponseData);
                }
            });
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, final HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.info(HMAccountWebAPI.a, new Function0() { // from class: com.huami.account.api.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMAccountWebAPI.h.d(hMHttpResponseData);
                    }
                });
                return;
            }
            HMAccountWebAPI.l(new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset()));
            LegalInfoVersionCallback legalInfoVersionCallback = this.a;
            if (legalInfoVersionCallback != null) {
                legalInfoVersionCallback.onFetchSuccessOrExist();
            }
        }
    }

    public class i extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;

        public i(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(ArrayList arrayList) {
            AccountExternalsKt.getCommonDelegate().setProperties(arrayList);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                try {
                    String str = new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset());
                    HMLog.v(HMAccountWebAPI.a, "Property string:" + str, new Object[0]);
                    JSONObject jSONObject = new JSONObject(str);
                    final ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        HMLog.v(HMAccountWebAPI.a, next + ":" + jSONObject.getString(next), new Object[0]);
                        arrayList.add(new HmProperty(next, jSONObject.getString(next), Integer.valueOf(AccountExternalsKt.getCommonDelegate().getSyncedStatusProperty())));
                    }
                    if (!arrayList.isEmpty()) {
                        UtilsKt.ioAction(new Runnable() { // from class: com.huami.account.api.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                HMAccountWebAPI.i.b(arrayList);
                            }
                        });
                    }
                    this.a.set(true);
                } catch (JSONException e) {
                    HMLog.v(HMAccountWebAPI.a, "error " + e.getLocalizedMessage(), new Object[0]);
                }
            }
        }
    }

    public class j extends IHMHttpResponseHandler {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(ArrayList arrayList) {
            AccountExternalsKt.getCommonDelegate().setProperties(arrayList);
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
            if (hMHttpResponseData.isSuccess()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset()));
                    final ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        arrayList.add(new HmProperty(next, jSONObject.getString(next), Integer.valueOf(AccountExternalsKt.getCommonDelegate().getSyncedStatusProperty())));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    UtilsKt.ioAction(new Runnable() { // from class: com.huami.account.api.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            HMAccountWebAPI.j.b(arrayList);
                        }
                    });
                } catch (JSONException e) {
                    HMLog.i(HMAccountWebAPI.a, "error " + e.getLocalizedMessage(), new Object[0]);
                }
            }
        }
    }

    public class k implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ MinorAuthorizationEntity a;

        public k(MinorAuthorizationEntity minorAuthorizationEntity) {
            this.a = minorAuthorizationEntity;
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

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData == null || !hMHttpResponseData.getSuccess() || hMHttpResponseData.getResponseBody() == null) {
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset());
            HMLog.v(HMAccountWebAPI.a, "item: " + hMHttpResponseData.toString(), new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a.requireAuthorization = jSONObject.getBoolean("required");
                this.a.remainDays = jSONObject.getInt("day");
                this.a.isReauthorize = jSONObject.getBoolean(com.facebook.login.a.I);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void addAuthKey(AuthDeviceSource authDeviceSource, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        try {
            String restfulUrl = HMServerDef.getRestfulUrl(j, HMLoginManager.getHuamiId(), AccountExternalsKt.getCommonDelegate().getBoundDeviceId(0));
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            HashSet hashSet = new HashSet();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceType", authDeviceSource.getType());
            jSONObject.put("deviceSource", authDeviceSource.getValue());
            jSONObject.put("authKey", HMLoginManager.getThirdId());
            hashSet.add("application/json");
            hashSet.add(jSONObject.toString());
            HMWebUtil.doSeparateRequest(restfulUrl, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.PUT, true, true, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
        } catch (Exception e2) {
            iHMBasicHttpResponseHandler.onError(e2);
            String str = a;
            HMLog.info(str, new Function0() { // from class: hi2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebAPI.h();
                }
            });
            HMLog.info(str, new Function0() { // from class: ei2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.toString();
                }
            });
            for (final StackTraceElement stackTraceElement : e2.getStackTrace()) {
                HMLog.info(a, new Function0() { // from class: fi2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return stackTraceElement.toString();
                    }
                });
            }
        }
    }

    private static boolean g() {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        return (hMAccountKeeper.readUpdateUserAgreement() != null) && (hMAccountKeeper.readUpdateUserPrivacy() != null);
    }

    public static void getHelpPageUrl(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams(false);
        systemParams.put(PARAM_REDIRECT_TYPE, "help");
        systemParams.put("userId", String.valueOf(HMLoginManager.getValidUid()));
        HMWebUtil.doRequest(HMServerDef.getUrl(l), systemParams, Support.RequestSupport.GET, iHMBasicHttpResponseHandler);
    }

    public static String getLoginErrorLogFile(File file) {
        String restfulUrl = HMServerDef.getRestfulUrl(m, HMAppConfig.getPackageName(), PARAM_URL_FILE_TYPE);
        HashMap map = new HashMap();
        map.put("fileName", file.getName());
        AtomicReference atomicReference = new AtomicReference();
        HMWebUtil.doSeparateRequest(restfulUrl, (Map<String, String>) null, (Map<String, Object>) map, Support.RequestSupport.GET, false, true, (IHMBasicHttpResponseHandler) new e(atomicReference), new HMHttpConfig[0]);
        return (String) atomicReference.get();
    }

    public static void getPageVersions(LegalInfoType legalInfoType, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        Area areaBySave = SelectAreaHelper.getAreaBySave();
        Map<String, Object> systemParams = HMWebUtil.getSystemParams(false);
        systemParams.put(PARAM_REDIRECT_TYPE, legalInfoType.getTypeName());
        systemParams.put("userId", Long.valueOf(HMLoginManager.getValidUid()));
        systemParams.put("lang", areaBySave.getValue());
        HMWebUtil.doRequest(HMServerDef.getUrl(k), systemParams, Support.RequestSupport.GET, true, iHMBasicHttpResponseHandler);
    }

    public static void getPageVersionsForRegister(LegalInfoType legalInfoType, String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        Map<String, String> systemHeader;
        try {
            systemHeader = HMWebUtil.getSystemHeader();
        } catch (Exception unused) {
            systemHeader = null;
        }
        Map<String, String> map = systemHeader;
        Map<String, Object> systemParams = HMWebUtil.getSystemParams(false);
        systemParams.put(PARAM_REDIRECT_TYPE, legalInfoType.getTypeName());
        if (!TextUtils.isEmpty(str)) {
            systemParams.put("lang", str);
        }
        HMWebUtil.doSeparateRequest(HMServerDef.getUrl(k), map, systemParams, Support.RequestSupport.GET, false, true, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
    }

    public static boolean getSettingPropertiesByPrefix(String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        HMUserPropertiesAPI.getRangeProperty(new PropertyItem(str), true, new i(atomicBoolean));
        return atomicBoolean.get();
    }

    public static void getSingleAppsettings(String str) {
        String url = HMServerDef.getUrl(String.format("apps/%s/settings", HMAppConfig.getPackageName()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("settingName", str);
        systemParams.put("mode", "SINGLE");
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, false, new j());
    }

    public static void getUserInfo(boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(f), HMWebUtil.getSystemParams(), Support.RequestSupport.GET, z, iHMBasicHttpResponseHandler);
    }

    @Deprecated
    public static void getUserLegalInfoVersion(boolean z, @Nullable LegalInfoVersionCallback legalInfoVersionCallback) {
        getUserLegalInfoVersionInner(z, legalInfoVersionCallback);
    }

    public static void getUserLegalInfoVersionInner(boolean z, @Nullable LegalInfoVersionCallback legalInfoVersionCallback) {
        if (!g() || z) {
            HMUserPropertiesAPI.getRangeProperty(new PropertyItem(AccountExternalsKt.getUserVersionPrefix()), false, new h(legalInfoVersionCallback));
        } else if (legalInfoVersionCallback != null) {
            legalInfoVersionCallback.onFetchSuccessOrExist();
        }
    }

    public static void getUserWeightGoalList() {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("fuid", -1);
        systemParams.put("goal_type", 1);
        systemParams.put("etime", "");
        systemParams.put("stime", "");
        systemParams.put("userid", HMPersonInfo.getInstance().getUserInfo().getUserid());
        HMWebUtil.doRequest(HMServerDef.getUrl(c), systemParams, Support.RequestSupport.POST, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "addAuthKey error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(String str) {
        return "保存用户协议 " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(final String str) {
        HMLog.debug(UserLegalInfoManager.TAG, new Function0() { // from class: gi2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMAccountWebAPI.k(str);
            }
        });
        try {
            JSONObject jSONObject = new JSONObject(str);
            String legalPropKey = UserLegalInfoExt.getLegalPropKey(LegalInfoType.AGREEMENT);
            if (jSONObject.has(legalPropKey)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(legalPropKey));
                    jSONObject2.put(UserLegalInfoManager.KEY_HAD_SAVED, true);
                    HMAccountKeeper.INSTANCE.keepUpdateUserAgreement(jSONObject2.toString());
                } catch (Exception unused) {
                }
            }
            String legalPropKey2 = UserLegalInfoExt.getLegalPropKey(LegalInfoType.PRIVACY);
            if (jSONObject.has(legalPropKey2)) {
                try {
                    JSONObject jSONObject3 = new JSONObject(jSONObject.getString(legalPropKey2));
                    jSONObject3.put(UserLegalInfoManager.KEY_HAD_SAVED, true);
                    HMAccountKeeper.INSTANCE.keepUpdateUserPrivacy(jSONObject3.toString());
                } catch (Exception unused2) {
                }
            }
            UserLegalInfoExt.updateExperienceByUserAgree(jSONObject.optString(UserLegalInfoExt.getLegalPropKey(LegalInfoType.EXPERIENCE)));
        } catch (Exception unused3) {
        }
    }

    public static void logout(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(e), HMWebUtil.getSystemParams(), Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void logoutSync(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(e), HMWebUtil.getSystemParams(), Support.RequestSupport.POST, true, iHMBasicHttpResponseHandler);
    }

    public static MinorAuthorizationEntity queryMinorAuthorization() {
        String url = HMServerDef.getUrl(h.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        MinorAuthorizationEntity minorAuthorizationEntity = new MinorAuthorizationEntity();
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new k(minorAuthorizationEntity));
        return minorAuthorizationEntity;
    }

    public static boolean queryMinorAuthorizationState() {
        String url = HMServerDef.getUrl(i.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new a(atomicBoolean));
        return atomicBoolean.get();
    }

    public static void reLogin(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HashMap map = new HashMap();
        map.put("userid", HMLoginManager.getThirdId());
        HMWebUtil.doRequest(HMServerDef.getUrl(d), map, Support.RequestSupport.POST, true, iHMBasicHttpResponseHandler);
    }

    public static boolean updateLoginErrorLogFileInfo(String str, String str2) {
        String restfulUrl = HMServerDef.getRestfulUrl(n, HMAppConfig.getPackageName(), PARAM_URL_FILE_TYPE);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            jSONObject2.put(ContactSettingItemActivity.KEY_CONTACT, str2);
            jSONObject2.put("content", "");
            jSONObject.put("diagnoseFileInfo", jSONObject2);
            jSONObject.put(SearchCriteria.EXISTS, true);
            jSONObject.put("fileName", str);
            jSONObject.put("fileType", PARAM_URL_FILE_TYPE);
            HashSet hashSet = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hashSet.add(jSONObject.toString());
            hashSet.add("application/json");
            Map<String, String> systemHeader = null;
            try {
                systemHeader = HMWebUtil.getSystemHeader();
            } catch (Exception e2) {
                HMLog.v(a, e2.toString(), new Object[0]);
            }
            HMWebUtil.doSeparateRequest(restfulUrl, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, false, true, (IHMBasicHttpResponseHandler) new g(atomicBoolean), new HMHttpConfig[0]);
            return atomicBoolean.get();
        } catch (JSONException unused) {
            return false;
        }
    }

    public static void updateProfile(HMPersonInfo hMPersonInfo, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        updateProfile(hMPersonInfo, new HashMap(), z, iHMBasicHttpResponseHandler);
    }

    public static boolean uploadLoginErrorLogFile(String str, File file) {
        HashSet hashSet = new HashSet();
        hashSet.add(file);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        HMWebUtil.doSeparateRequest(str, (Map<String, String>) null, (Set<Object>) hashSet, Support.RequestSupport.PUT, false, true, (IHMBasicHttpResponseHandler) new f(atomicBoolean, file), new HMHttpConfig[0]);
        return atomicBoolean.get();
    }

    public static void uploadUserBirthday() {
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("birthday", HMPersonInfo.getInstance().getUserInfo().getBirthday());
                jSONObject.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String string = jSONObject.toString();
            HMLog.v(a, "putBody: " + string, new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(string);
            hashSet.add("application/json");
            HMWebUtil.doSeparateRequest(HMServerDef.getUrl(g).replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()), systemHeader, (Set<Object>) hashSet, Support.RequestSupport.PUT, true, true, (IHMBasicHttpResponseHandler) new b(), new HMHttpConfig[0]);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void updateProfile(HMPersonInfo hMPersonInfo, Map<String, String> map, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> profileDataMap = PersonInfoMapper.toProfileDataMap(hMPersonInfo, map);
        String lastSyncPersonInfo = HMAccountKeeper.INSTANCE.getLastSyncPersonInfo();
        String json = HMHttpUtils.getGson().toJson(profileDataMap);
        if (!Objects.equals(lastSyncPersonInfo, json)) {
            profileDataMap.putAll(HMWebUtil.getSystemParams());
            HMWebUtil.doRequest(url, profileDataMap, Support.RequestSupport.POST, z, new c(iHMBasicHttpResponseHandler, json, hMPersonInfo));
        } else {
            HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
            hMHttpResponseData.setSuccess(true);
            hMHttpResponseData.setStatusCode(200);
            iHMBasicHttpResponseHandler.onSuccess(hMHttpResponseData);
        }
    }
}
