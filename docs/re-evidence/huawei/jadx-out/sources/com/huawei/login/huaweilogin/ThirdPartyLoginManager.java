package com.huawei.login.huaweilogin;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.common.Constant;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.common.util.Utils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.BuildConfig;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwidauth.api.Result;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.third.HomeCountryInfo;
import com.huawei.login.third.ThirdPartyHttpUtils;
import com.huawei.login.third.ThirdPartyLoginInfo;
import com.huawei.login.third.UserAccountInfo;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ContentProviderUtil;
import com.huawei.login.ui.login.util.LoginCache;
import com.huawei.login.ui.login.util.ScopeManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.lua;
import defpackage.njy;
import defpackage.nmk;
import defpackage.nml;
import defpackage.nmm;
import defpackage.nmn;
import defpackage.nmo;
import defpackage.nmq;
import defpackage.nmr;
import defpackage.nms;
import defpackage.nmt;
import defpackage.nmu;
import defpackage.nmw;
import defpackage.nnb;
import health.compact.a.CloudUtils;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.EzPluginManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ThirdPartyLoginManager {
    private static final int ACCESS_TOKEN_INVALID_RESULT_CODE = 20020002;
    private static final int DEFAULT_QUERY_CODE = -11;
    private static final String DEVICE_UUID = "device_uuid";
    private static final int ERROR_CODE = -1;
    private static final String HEALTH_APP_PROBABILITY_PROBLEM = "85070032";
    private static final String KEY_WORDS = "keyWords";
    private static final Byte[] LOCK = new Byte[1];
    private static final String MESSAGES = "messages";
    private static final String OBTAIN_AT_URL = "/commonAbility/userAccessToken/obtain";
    private static final String OPTIONAL_SCAN_LOGIN = "0";
    private static final String OP_ALARM_PERMISSION_KEY = "opAlarmPermissionKey";
    private static final String QUERY_HOME_COUNTRY_URL = "/sessionService/v1/user/homeCountryInfo";
    private static final String QUERY_INFO_URL = "/commonAbility/userAccessToken/query";
    private static final String QUERY_SYNC_STATUS_URL = "/sessionService/v1/user/homeCountrySyncStatus";
    private static final String QUERY_USER_ACCOUNT_URL = "/commonAbility/userAccessToken/queryUserAccount";
    private static final String REFRESH_AT_URL = "/commonAbility/userAccessToken/refresh";
    private static final int REFRESH_TOKEN_INVALID_RESULT_CODE = 20020003;
    private static final String RELEASE_TAG = "R_UIDV_3rdPtyLoginMgr";
    private static final String REQ_CLIENT_TYPE = "7";
    private static final String SITE_ID = "site_id";
    private static final int SUCCESS = 0;
    private static final String TAG = "UIDV_3rdPtyLoginMgr";
    private static final int TIME_OUT_MILLI = 5000;
    private static volatile ThirdPartyLoginManager sInstance;
    private Context mContext = BaseApplication.getContext();
    private HiUserInfo mUserInfo;

    private ThirdPartyLoginManager() {
    }

    public static ThirdPartyLoginManager getInstance() {
        if (sInstance == null) {
            synchronized (LOCK) {
                if (sInstance == null) {
                    sInstance = new ThirdPartyLoginManager();
                }
            }
        }
        return sInstance;
    }

    public void thirdPartyPhoneLogin(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter thirdPartPhoneLogin");
        if (!(context instanceof Activity)) {
            LogUtil.e(TAG, "thirdPartyPhoneLogin: context is not instanceof Activity");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String strC = nmm.c("", getDeviceUuid(), "", "");
        String[] scopeList = ScopeManager.getScopeList();
        LogUtil.a(TAG, "start hms lite sdk login");
        Utils.initGrsOld(Utils.getCountryCode(), context);
        try {
            new nmo.c((Activity) context).c(String.valueOf(BuildConfig.HMS_APPLICATION_ID)).b("hms://redirect_url").b(scopeList).e(strC).a("").a(new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda6
                @Override // com.huawei.hwidauth.api.ResultCallBack
                public final void onResult(Result result) {
                    this.f$0.m1460x73b294ab(iBaseResponseCallback, (nmu) result);
                }
            }).a().c(AccountConstants.GRS_APP_NAME);
        } catch (nmr unused) {
            LogUtil.e(TAG, "ParmaInvalidException");
        }
    }

    /* JADX INFO: renamed from: lambda$thirdPartyPhoneLogin$0$com-huawei-login-huaweilogin-ThirdPartyLoginManager, reason: not valid java name */
    /* synthetic */ void m1460x73b294ab(IBaseResponseCallback iBaseResponseCallback, nmu nmuVar) {
        int iE;
        if (nmuVar.getStatus().d()) {
            int iE2 = nmuVar.getStatus().e();
            ReleaseLogUtil.d(RELEASE_TAG, "StatusCode:", Integer.valueOf(iE2), ", StatusMessage:", nmuVar.getStatus().a());
            String strA = nmuVar.a();
            saveAuthCode(strA);
            getAtByAuthCode(strA, true, iBaseResponseCallback);
            return;
        }
        if (nmuVar.getStatus() != null) {
            iE = nmuVar.getStatus().e();
            ReleaseLogUtil.e(RELEASE_TAG, "StatusCode:", Integer.valueOf(iE), " StatusMessage:", nmuVar.getStatus().a());
            HuaweiLoginManager.reportErrorCode("thirdPartySignIn", iE);
        } else {
            iE = -1;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(iE, null);
        }
    }

    public void getAtByAuthCode(final String str, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter postToGetAccessToke.");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.1
            @Override // java.lang.Runnable
            public void run() {
                ThirdPartyHttpUtils.postToGetAccessToken(ThirdPartyLoginManager.this.getSyncUrl() + ThirdPartyLoginManager.OBTAIN_AT_URL, str, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.1.1
                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onSuccess(String str2) {
                        ReleaseLogUtil.d(ThirdPartyLoginManager.TAG, "postToGetAT onSuccess:");
                        if (z) {
                            ThirdLoginDataStorageUtil.setLogoutFlag(false);
                        }
                        ThirdPartyLoginManager.this.saveThirdPartyLoginInfo(str2, false, "obtain", iBaseResponseCallback);
                    }

                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onFailed(int i) {
                        iBaseResponseCallback.a(-1, null);
                        ReleaseLogUtil.e(ThirdPartyLoginManager.TAG, "postToGetAT onFailed:", Integer.valueOf(i));
                    }
                });
            }
        });
    }

    private String getDeviceUuid() {
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(20000), DEVICE_UUID);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String strGenerateDeviceUuid = generateDeviceUuid();
        SharedPreferenceManager.e(this.mContext, String.valueOf(20000), DEVICE_UUID, strGenerateDeviceUuid, new StorageParams(0));
        return strGenerateDeviceUuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveThirdPartyLoginInfo(String str, boolean z, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        ThirdPartyLoginInfo thirdPartyLoginInfo;
        LogUtil.a(TAG, "enter saveThirdPartLoginInfo biKey=", str2, " result=", str);
        try {
            thirdPartyLoginInfo = (ThirdPartyLoginInfo) new Gson().fromJson(CommonUtil.ac(str), ThirdPartyLoginInfo.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e(TAG, "JsonSyntaxException:", e.getMessage());
            iBaseResponseCallback.a(-1, null);
            thirdPartyLoginInfo = null;
        }
        if (thirdPartyLoginInfo == null) {
            return;
        }
        int resultCode = thirdPartyLoginInfo.getResultCode();
        LogUtil.a(TAG, "saveThirdPartyLoginInfo resultCode = ", Integer.valueOf(resultCode));
        if (resultCode == 0) {
            if (z) {
                saveFreshTokenData(thirdPartyLoginInfo, iBaseResponseCallback);
                return;
            } else {
                saveFreshTokenData(thirdPartyLoginInfo, null);
                m1459x26edc259(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a(ThirdPartyLoginManager.TAG, "queryUserInfo errorCode = ", Integer.valueOf(i));
                        iBaseResponseCallback.a(i, null);
                    }
                }, true);
                return;
            }
        }
        if (resultCode == REFRESH_TOKEN_INVALID_RESULT_CODE) {
            LogUtil.j(TAG, "resultCode == 20020003");
            gotoStTimeActivity();
            iBaseResponseCallback.a(-1, null);
            HuaweiLoginManager.reportErrorCode(str2, resultCode);
            return;
        }
        LogUtil.j(TAG, "get accessToken failed");
        iBaseResponseCallback.a(-1, null);
        HuaweiLoginManager.reportErrorCode(str2, resultCode);
    }

    private void clearTokenInfo() {
        if (getLogoutStatus() && TextUtils.isEmpty(LoginInit.getInstance(this.mContext).getAccountInfo(1011))) {
            clearToken();
        } else {
            LogUtil.a(TAG, "clear tokeninfo logoutstatus is false");
        }
    }

    private void clearToken() {
        LogUtil.a(TAG, "clearToken");
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
        sharedPreferenceUtil.setRefreshTicket(null);
        sharedPreferenceUtil.setAtExpireTime(null);
        sharedPreferenceUtil.setRtExpireTime(null);
        sharedPreferenceUtil.setUserID("");
        ThirdLoginDataStorageUtil.saveAccessTokenToDb(null);
        ThirdLoginDataStorageUtil.saveRefreshTokenToDb(null);
        ThirdLoginDataStorageUtil.saveAccessTokenExpireTimeToDb(null);
        ThirdLoginDataStorageUtil.saveRefreshTokenExpireTimeToDb(null);
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("hmslite", 0).edit();
        editorEdit.putBoolean("use-status", false);
        editorEdit.commit();
    }

    private void saveAuthCode(String str) {
        LogUtil.a(TAG, "enter saveAuthCode");
        SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setAuthCode(str);
        LogUtil.a(TAG, "end saveAuthCode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSyncUrl() {
        return getSyncUrl(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSyncUrl(boolean z) {
        String countryCode = Utils.getCountryCode();
        GrsClient grsClientInitGrs = Utils.initGrs(countryCode, this.mContext);
        if (grsClientInitGrs == null) {
            LogUtil.j(TAG, "get SyncUrl mContext is null");
            return "";
        }
        if (CommonUtil.cl()) {
            return Utils.getGrsUrl(grsClientInitGrs, countryCode, Utils.SERVICE_HEALTH_CLOUD, "healthCloudUrl");
        }
        return z ? Utils.getGrsUrl(grsClientInitGrs, countryCode, "com.huawei.health", "domainHealthCloudCommon") : Utils.getGrsUrl(grsClientInitGrs, countryCode, "com.huawei.health", "domainHmsLiteHiCloud");
    }

    public void saveUserLoginInfo(ThirdPartyLoginInfo thirdPartyLoginInfo, boolean z) {
        if (!z) {
            if (thirdPartyLoginInfo != null) {
                saveLoginSiteId(this.mContext, String.valueOf(thirdPartyLoginInfo.getSiteId()));
                SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
                setAccountType(thirdPartyLoginInfo, sharedPreferenceUtil);
                sharedPreferenceUtil.setCountryCode(thirdPartyLoginInfo.getNationalCode());
                ContentProviderUtil.getInstance(this.mContext).setCountryCode(thirdPartyLoginInfo.getNationalCode(), null);
                return;
            }
            return;
        }
        LogUtil.a(TAG, "enter saveUserLoginInfo() ProcessName = ", EnvironmentUtils.c());
        SharedPreferenceUtil sharedPreferenceUtil2 = SharedPreferenceUtil.getInstance(this.mContext);
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getUid())) {
            sharedPreferenceUtil2.setUserID(thirdPartyLoginInfo.getUid());
        }
        ifNewSiteId(thirdPartyLoginInfo.getSiteId(), sharedPreferenceUtil2);
        HuaweiLoginManager.updateAppTypeBySiteID(thirdPartyLoginInfo.getSiteId());
        HuaweiLoginManager.updateLoginTypeByCountry(this.mContext, thirdPartyLoginInfo.getNationalCode());
        sharedPreferenceUtil2.setHuaweiAccountLoginFlag("1");
        SharedPreferenceManager.e(this.mContext, Integer.toString(10015), "if_need_set_account_login_entry", "0", new StorageParams(0));
        sharedPreferenceUtil2.setCountryCode(thirdPartyLoginInfo.getNationalCode());
        ContentProviderUtil.getInstance(this.mContext).setCountryCode(thirdPartyLoginInfo.getNationalCode(), null);
        queryUserAccount(null);
        saveLoginSiteId(this.mContext, String.valueOf(thirdPartyLoginInfo.getSiteId()));
        LoginInit.getInstance(this.mContext).setIsBrowseModeToPd(this.mContext, false);
        setAccountType(thirdPartyLoginInfo, sharedPreferenceUtil2);
        sharedPreferenceUtil2.setLoginType(0);
        BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
        if (browsingBiEvent != null) {
            browsingBiEvent.loginSuccessBiEvent();
        }
        LoginInit.getInstance(this.mContext).setIsLogined(true);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1007), "need_relogin", "false", null);
        HuaweiLoginManager.informHiDataLoginSuccess(this.mContext);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction("com.huawei.plugin.account.login");
        intent.putExtra(Constant.KEY_IS_REBOOT, !SharedPreferenceUtil.isSameCountryCode(thirdPartyLoginInfo.getNationalCode()));
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        Context context = this.mContext;
        if (context != null) {
            context.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
        ObserverManagerUtil.e("com.huawei.plugin.account.login", "com.huawei.plugin.account.login");
        EzPluginManager.b().a();
    }

    public void saveUserLoginInfoV2(ThirdPartyLoginInfo thirdPartyLoginInfo, boolean z) {
        if (!z) {
            if (thirdPartyLoginInfo != null) {
                setAccountType(thirdPartyLoginInfo, SharedPreferenceUtil.getInstance(this.mContext));
                return;
            }
            return;
        }
        LogUtil.a(TAG, "enter saveUserLoginInfo() ProcessName = ", EnvironmentUtils.c());
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getUid())) {
            sharedPreferenceUtil.setUserID(thirdPartyLoginInfo.getUid());
        }
        sharedPreferenceUtil.setHuaweiAccountLoginFlag("1");
        SharedPreferenceManager.e(this.mContext, Integer.toString(10015), "if_need_set_account_login_entry", "0", new StorageParams(0));
        queryUserAccount(null);
        LoginInit.getInstance(this.mContext).setIsBrowseModeToPd(this.mContext, false);
        setAccountType(thirdPartyLoginInfo, sharedPreferenceUtil);
        sharedPreferenceUtil.setLoginType(0);
        BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
        if (browsingBiEvent != null) {
            browsingBiEvent.loginSuccessBiEvent();
        }
        LoginInit.getInstance(this.mContext).setIsLogined(true);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1007), "need_relogin", "false", null);
        EzPluginManager.b().a();
    }

    private void saveLoginSiteId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || !CloudUtils.a()) {
            return;
        }
        LoginInit.getInstance(context).setAccountInfo(1009, str, null);
    }

    private void ifNewSiteId(ThirdPartyLoginInfo thirdPartyLoginInfo, SharedPreferenceUtil sharedPreferenceUtil) {
        if (thirdPartyLoginInfo.getSiteId() != lua.c()) {
            LogConfig.c(this.mContext);
            SharedPreferenceManager.b(this.mContext, Integer.toString(10000), "grs_config_last_update_time");
            SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "grs_config_delete", "true", null);
        }
    }

    private void ifNewSiteId(int i, SharedPreferenceUtil sharedPreferenceUtil) {
        if (i != lua.c()) {
            LogConfig.c(this.mContext);
            SharedPreferenceManager.b(this.mContext, Integer.toString(10000), "grs_config_last_update_time");
            SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "grs_config_delete", "true", null);
        }
    }

    private void setAccountType(ThirdPartyLoginInfo thirdPartyLoginInfo, SharedPreferenceUtil sharedPreferenceUtil) {
        int ageGroupFlag = thirdPartyLoginInfo.getAgeGroupFlag();
        int iB = CommonUtil.b(this.mContext, sharedPreferenceUtil.getAccountType(), -1);
        if (ageGroupFlag != iB && (ageGroupFlag == 0 || ageGroupFlag == 1)) {
            LoginInit.getInstance(this.mContext).setAccountInfo(1004, "0", null);
        } else if (ageGroupFlag != iB && ageGroupFlag == 2) {
            LoginInit.getInstance(this.mContext).setAccountInfo(1004, "1", null);
        } else {
            LogUtil.j(TAG, "loginInfo AgeGroupFlag unknown");
            LoginInit.getInstance(this.mContext).setAccountInfo(1004, "0", null);
        }
        LoginInit.getInstance(this.mContext).setAccountInfo(1019, String.valueOf(ageGroupFlag), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiUserInfo assembleUserInfo(ThirdPartyLoginInfo thirdPartyLoginInfo) {
        String srvNationalCode = thirdPartyLoginInfo.getSrvNationalCode();
        ReleaseLogUtil.d(RELEASE_TAG, "thirdPartyInfo siteId:", Integer.valueOf(thirdPartyLoginInfo.getSiteId()), thirdPartyLoginInfo.getNationalCode(), srvNationalCode);
        if (!TextUtils.isEmpty(srvNationalCode) && !srvNationalCode.equalsIgnoreCase(LoginCache.getSrvCountryCode())) {
            LogUtil.a(TAG, "saveUserLoginInfo() srvCountryCode= ", srvNationalCode);
            LoginCache.configSrvCountryCode(srvNationalCode);
            ContentProviderUtil.getInstance(this.mContext).setServiceCountryCode(srvNationalCode, null);
        }
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
        String guardianAccount = sharedPreferenceUtil.getGuardianAccount();
        String guardianAccount2 = thirdPartyLoginInfo.getGuardianAccount();
        if (!TextUtils.isEmpty(guardianAccount2) && !guardianAccount2.equalsIgnoreCase(guardianAccount)) {
            sharedPreferenceUtil.setGuardianAccount(guardianAccount2);
            sharedPreferenceUtil.setGuardianUid(thirdPartyLoginInfo.getGuardianUid());
        }
        HiUserInfo hiUserInfo = new HiUserInfo();
        if (thirdPartyLoginInfo.getGender() == -1) {
            hiUserInfo.setGender(-1);
        } else if (thirdPartyLoginInfo.getGender() == 2) {
            hiUserInfo.setGender(2);
        } else {
            hiUserInfo.setGender(thirdPartyLoginInfo.getGender() == 0 ? 1 : 0);
        }
        sharedPreferenceUtil.setGender(String.valueOf(thirdPartyLoginInfo.getGender()));
        hiUserInfo.setUser(1073741824);
        hiUserInfo.setModifiedIntent(268435456);
        hiUserInfo.setHeadImgUrl(thirdPartyLoginInfo.getHeadPictureUrl());
        hiUserInfo.setHuid(thirdPartyLoginInfo.getUid());
        if (TextUtils.isEmpty(thirdPartyLoginInfo.getNickName())) {
            hiUserInfo.setName(thirdPartyLoginInfo.getLoginUserName());
        } else {
            hiUserInfo.setName(thirdPartyLoginInfo.getNickName());
        }
        String birthDate = thirdPartyLoginInfo.getBirthDate();
        if (!TextUtils.isEmpty(birthDate)) {
            hiUserInfo.setBirthday(CommonUtil.j(birthDate));
            if (LoginInit.isBelowMinAge(birthDate)) {
                SharedPreferenceManager.e(this.mContext, Integer.toString(20000), "key_ui_age_less_minimum", String.valueOf(true), null);
            }
            LoginInit.getInstance(this.mContext).setAccountInfo(1006, thirdPartyLoginInfo.getBirthDate(), null);
        }
        return hiUserInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiUserInfo assembleUserInfoV2(ThirdPartyLoginInfo thirdPartyLoginInfo) {
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
        String guardianAccount = sharedPreferenceUtil.getGuardianAccount();
        String guardianAccount2 = thirdPartyLoginInfo.getGuardianAccount();
        if (!TextUtils.isEmpty(guardianAccount2) && !guardianAccount2.equalsIgnoreCase(guardianAccount)) {
            sharedPreferenceUtil.setGuardianAccount(guardianAccount2);
            sharedPreferenceUtil.setGuardianUid(thirdPartyLoginInfo.getGuardianUid());
        }
        HiUserInfo hiUserInfo = new HiUserInfo();
        if (thirdPartyLoginInfo.getGender() == -1) {
            hiUserInfo.setGender(-1);
        } else if (thirdPartyLoginInfo.getGender() == 2) {
            hiUserInfo.setGender(2);
        } else {
            hiUserInfo.setGender(thirdPartyLoginInfo.getGender() == 0 ? 1 : 0);
        }
        sharedPreferenceUtil.setGender(String.valueOf(thirdPartyLoginInfo.getGender()));
        hiUserInfo.setUser(1073741824);
        hiUserInfo.setModifiedIntent(268435456);
        hiUserInfo.setHeadImgUrl(thirdPartyLoginInfo.getHeadPictureUrl());
        hiUserInfo.setHuid(thirdPartyLoginInfo.getUid());
        if (TextUtils.isEmpty(thirdPartyLoginInfo.getNickName())) {
            hiUserInfo.setName(thirdPartyLoginInfo.getLoginUserName());
        } else {
            hiUserInfo.setName(thirdPartyLoginInfo.getNickName());
        }
        String birthDate = thirdPartyLoginInfo.getBirthDate();
        if (!TextUtils.isEmpty(birthDate)) {
            hiUserInfo.setBirthday(CommonUtil.j(birthDate));
            if (LoginInit.isBelowMinAge(birthDate)) {
                SharedPreferenceManager.e(this.mContext, Integer.toString(20000), "key_ui_age_less_minimum", String.valueOf(true), null);
            }
            LoginInit.getInstance(this.mContext).setAccountInfo(1006, thirdPartyLoginInfo.getBirthDate(), null);
        }
        return hiUserInfo;
    }

    public void saveUserInfo() throws Throwable {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.3
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ThirdPartyLoginManager.this.saveUserInfo();
                }
            });
            return;
        }
        if (this.mUserInfo == null) {
            LogUtil.j(TAG, "saveUserInfo mUserInfo is null");
            return;
        }
        SharedPreferenceUtil.getInstance(this.mContext).setAccountName(this.mUserInfo.getName());
        KeyValDbManager.d(this.mContext).c("key_user_name", this.mUserInfo.getName(), null);
        Bitmap bitmapLoadRemoteImage = ThirdLoginDataStorageUtil.loadRemoteImage(this.mUserInfo.getHeadImgUrl());
        KeyValDbManager.d(this.mContext).b("key_user_pic_path", this.mUserInfo.getHeadImgUrl() == null ? "" : this.mUserInfo.getHeadImgUrl());
        String strSaveProfileImage = ThirdLoginDataStorageUtil.saveProfileImage(this.mContext, this.mUserInfo.getHuid(), bitmapLoadRemoteImage);
        SharedPreferenceManager.e(this.mContext, String.valueOf(PrebakedEffectId.RT_FLY), "key_user_pic_path", strSaveProfileImage, new StorageParams(1));
        if (!"1".equalsIgnoreCase(CommonUtil.w())) {
            setUserInfoNoCloud(this.mUserInfo.getName(), strSaveProfileImage);
            LogUtil.a(TAG, "no cloud, do not use account birthday and gender.");
        } else {
            HiHealthNativeApi.a(this.mContext).setUserData(this.mUserInfo, new HiCommonListener() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.4
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    LogUtil.a(ThirdPartyLoginManager.TAG, "saveUserInfo onSuccess");
                    LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    LogUtil.j(ThirdPartyLoginManager.TAG, "setUserData onFailure:", Integer.valueOf(i), " ", obj);
                }
            });
        }
    }

    private void setUserInfoNoCloud(final String str, final String str2) {
        LogUtil.a(TAG, "setUserNameNoCloud: no cloud, save user info");
        HiHealthNativeApi.a(this.mContext).fetchUserData(new HiCommonListener() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(ThirdPartyLoginManager.TAG, "setUserNameNoCloud: get user data success");
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (njy.e(list)) {
                        return;
                    }
                    LogUtil.a(ThirdPartyLoginManager.TAG, "setUserNameNoCloud: user data not null");
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    hiUserInfo.setName(str);
                    hiUserInfo.setHeadImgUrl(str2);
                    hiUserInfo.setUser(1073741824);
                    hiUserInfo.setModifiedIntent(268435456);
                    HiHealthNativeApi.a(ThirdPartyLoginManager.this.mContext).setUserData(hiUserInfo, new HiCommonListener() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.5.1
                        @Override // com.huawei.hihealth.data.listener.HiCommonListener
                        public void onSuccess(int i2, Object obj2) {
                            LogUtil.a(ThirdPartyLoginManager.TAG, "setUserNameNoCloud: setUserName onSuccess");
                            LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));
                        }

                        @Override // com.huawei.hihealth.data.listener.HiCommonListener
                        public void onFailure(int i2, Object obj2) {
                            LogUtil.j(ThirdPartyLoginManager.TAG, "setUserName onFailure:", Integer.valueOf(i2), " ", obj2);
                        }
                    });
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(ThirdPartyLoginManager.TAG, "get user data errCode = ", Integer.valueOf(i), " errMsg = ", obj);
            }
        });
    }

    public void refreshAtByRt(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter refreshAtByRt");
        final String refreshTokenFromDb = ThirdLoginDataStorageUtil.getRefreshTokenFromDb();
        final String strC = KeyValDbManager.d(this.mContext).c("user_id");
        if (TextUtils.isEmpty(refreshTokenFromDb) || TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG, "refreshAtByRt rt= ", Boolean.valueOf(TextUtils.isEmpty(refreshTokenFromDb)), "uid= ", Boolean.valueOf(TextUtils.isEmpty(strC)));
            iBaseResponseCallback.a(-1, null);
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.6
            @Override // java.lang.Runnable
            public void run() {
                ThirdPartyHttpUtils.refreshRt(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.REFRESH_AT_URL, refreshTokenFromDb, strC, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.6.1
                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onSuccess(String str) {
                        ReleaseLogUtil.d(ThirdPartyLoginManager.TAG, "refreshAtByRT onSuccess");
                        ThirdPartyLoginManager.this.saveThirdPartyLoginInfo(str, true, "refresh", iBaseResponseCallback);
                    }

                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onFailed(int i) {
                        long jI = CommonUtil.i(ThirdLoginDataStorageUtil.getAccessTokenExpireTimeFromDb());
                        long jI2 = CommonUtil.i(ThirdLoginDataStorageUtil.getServerTimestamp());
                        ThirdPartyLoginManager.this.timedRefreshAt(System.currentTimeMillis() + Math.max((jI - jI2) - HealthAccessTokenUtil.getAtInstance().getRandomUpdateTime(), 0L));
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i, null);
                        }
                        ReleaseLogUtil.e(ThirdPartyLoginManager.TAG, "refreshAtByRT onFailed:", Integer.valueOf(i));
                    }
                });
            }
        });
    }

    public void queryUserInfo(final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        final String userID = SharedPreferenceUtil.getInstance(this.mContext).getUserID();
        ReleaseLogUtil.d(TAG, "thirdPartyInfo isFirstStart :", Boolean.valueOf(z), " Value is:", SharedPreferenceUtil.getInstance(this.mContext).maskValue(userID));
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(userID)) {
            ReleaseLogUtil.e(RELEASE_TAG, "queryUserInfo param is empty", Boolean.valueOf(TextUtils.isEmpty(accountInfo)), Boolean.valueOf(TextUtils.isEmpty(userID)));
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.7
            @Override // java.lang.Runnable
            public void run() {
                ThirdPartyHttpUtils.queryUserData(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.QUERY_INFO_URL, accountInfo, userID, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.7.1
                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onSuccess(String str) throws Throwable {
                        ReleaseLogUtil.d(ThirdPartyLoginManager.RELEASE_TAG, "queryUserInfo onSuccess");
                        LogUtil.a(ThirdPartyLoginManager.TAG, "queryUserInfo result:", str);
                        ThirdPartyLoginInfo thirdPartyLoginInfo = new ThirdPartyLoginInfo();
                        try {
                            thirdPartyLoginInfo = (ThirdPartyLoginInfo) new Gson().fromJson(CommonUtil.ac(str), ThirdPartyLoginInfo.class);
                        } catch (JsonSyntaxException e) {
                            LogUtil.e(ThirdPartyLoginManager.TAG, "JsonSyntaxException:", e.getMessage());
                        }
                        if (!ThirdPartyLoginManager.this.isNeedSaveUserInfo(thirdPartyLoginInfo)) {
                            if (iBaseResponseCallback != null) {
                                iBaseResponseCallback.a(-1, null);
                            }
                            ThirdPartyLoginManager.this.refreshAtWhenExpire(thirdPartyLoginInfo);
                            return;
                        }
                        if (CommonUtil.cc()) {
                            ThirdPartyLoginManager.this.saveUserLoginInfoV2(thirdPartyLoginInfo, z);
                            ThirdPartyLoginManager.this.mUserInfo = ThirdPartyLoginManager.this.assembleUserInfoV2(thirdPartyLoginInfo);
                        } else {
                            ThirdPartyLoginManager.this.saveUserLoginInfo(thirdPartyLoginInfo, z);
                            ThirdPartyLoginManager.this.mUserInfo = ThirdPartyLoginManager.this.assembleUserInfo(thirdPartyLoginInfo);
                        }
                        if (!z) {
                            ThirdPartyLoginManager.this.saveUserInfo();
                        }
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(0, ThirdPartyLoginManager.this.mUserInfo);
                        }
                    }

                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onFailed(int i) {
                        ReleaseLogUtil.e(ThirdPartyLoginManager.RELEASE_TAG, "queryUserInfo onFailed");
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i, null);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: queryUserInfoAndHomeCountry, reason: merged with bridge method [inline-methods] */
    public void m1459x26edc259(final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        if (!CommonUtil.cc()) {
            getInstance().queryUserInfo(iBaseResponseCallback, z);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1459x26edc259(iBaseResponseCallback, z);
                }
            });
            return;
        }
        final Integer[] numArr = {-11, -11};
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d(ThirdPartyLoginManager.TAG, "queryUserInfoAndHomeCountry queryUserInfo errorCode:", Integer.valueOf(i));
                numArr[0] = Integer.valueOf(i);
                countDownLatch.countDown();
            }
        }, z);
        getInstance().queryHomeCountryInfo(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d(ThirdPartyLoginManager.TAG, "queryUserInfoAndHomeCountry queryHomeCountryInfo errorCode:", Integer.valueOf(i));
                numArr[1] = Integer.valueOf(i);
                countDownLatch.countDown();
            }
        }, z);
        try {
            ReleaseLogUtil.d(TAG, "queryUserInfoAndHomeCountry isOnTime:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG, "queryUserInfoAndHomeCountry InterruptedException");
        }
        ReleaseLogUtil.d(TAG, "queryUserInfoAndHomeCountry resultCodes[0]:", numArr[0], " resultCodes[1]:", numArr[1]);
        if (numArr[0].intValue() == 0 && numArr[1].intValue() == 0) {
            iBaseResponseCallback.a(0, this.mUserInfo);
        } else {
            iBaseResponseCallback.a(numArr[0].intValue(), this.mUserInfo);
        }
    }

    public void queryHomeCountryInfo(final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        if (!CommonUtil.cc()) {
            LogUtil.j(TAG, "queryHomeCountryInfo only support TestVersion now.");
            return;
        }
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        final String userID = SharedPreferenceUtil.getInstance(this.mContext).getUserID();
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(userID)) {
            iBaseResponseCallback.a(-1, null);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.10
                @Override // java.lang.Runnable
                public void run() {
                    ThirdPartyHttpUtils.queryUserHomeCountry(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.QUERY_HOME_COUNTRY_URL, accountInfo, userID, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.10.1
                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onSuccess(String str) {
                            LogUtil.a(ThirdPartyLoginManager.TAG, "queryUserHomeCountry result:", str);
                            ThirdPartyLoginManager.this.dealUserHomeCountry(str, iBaseResponseCallback, z);
                        }

                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onFailed(int i) {
                            ReleaseLogUtil.a(ThirdPartyLoginManager.RELEASE_TAG, "queryUserHomeCountry onFailed:", Integer.valueOf(i));
                            iBaseResponseCallback.a(i, null);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealUserHomeCountry(String str, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        HomeCountryInfo homeCountry = getHomeCountry(str);
        if (homeCountry.getHomeCountryCode() == null || homeCountry.getResultCode() != 0) {
            ReleaseLogUtil.e(RELEASE_TAG, "queryUserHomeCountry homeCountryCode is null and error code =,", Integer.valueOf(homeCountry.getResultCode()));
            iBaseResponseCallback.a(-1, homeCountry);
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), SITE_ID);
        String countryCode = SharedPreferenceUtil.getInstance(this.mContext).getCountryCode();
        String homeCountryCode = homeCountry.getHomeCountryCode();
        int siteId = homeCountry.getSiteId();
        ReleaseLogUtil.d(TAG, "queryUserHomeCountry oldC:", countryCode, " newC:", homeCountryCode, " oldSd:", strE, " newSId:", Integer.valueOf(siteId), " isFirstStart:", Boolean.valueOf(z), " Value is:", SharedPreferenceUtil.getInstance(this.mContext).maskValue(SharedPreferenceUtil.getInstance(this.mContext).getUserID()));
        if (z || TextUtils.isEmpty(countryCode) || homeCountry.getHomeCountryCode().equals(countryCode)) {
            saveHomeCountryInfo(homeCountry, z, iBaseResponseCallback);
        } else {
            SharedPreferenceUtil.getInstance(this.mContext).setMigrateStatus("true");
            saveHomeCountryInfo(homeCountry, z, new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m1458x60672ab9(i, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$dealUserHomeCountry$2$com-huawei-login-huaweilogin-ThirdPartyLoginManager, reason: not valid java name */
    /* synthetic */ void m1458x60672ab9(int i, Object obj) {
        ReleaseLogUtil.d(TAG, "queryUserHomeCountry need reboot.");
        clearOldUserInfo();
        CommonLibUtil.d(BaseApplication.getContext());
    }

    private void clearOldUserInfo() {
        lua.d(String.valueOf(20006), "FUNCTION_ENTRANCE_INFO_LIST");
        SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "if_first_agr_sign", "", null);
    }

    public void saveHomeCountryInfo(HomeCountryInfo homeCountryInfo, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        String homeCountryCode = homeCountryInfo.getHomeCountryCode();
        ReleaseLogUtil.d(RELEASE_TAG, "saveHomeCountryInfo homeCountryCode:", homeCountryCode, " isFirst:", Boolean.valueOf(z));
        if (!z) {
            saveHomeCountry(homeCountryInfo, iBaseResponseCallback);
            SharedPreferenceUtil.updateLastCountryCode(homeCountryInfo.getHomeCountryCode());
            return;
        }
        SharedPreferenceUtil.getInstance(this.mContext).setHuaweiAccountLoginFlag("1");
        SharedPreferenceManager.e(this.mContext, Integer.toString(10015), "if_need_set_account_login_entry", "0", new StorageParams(0));
        saveHomeCountry(homeCountryInfo, iBaseResponseCallback);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction("com.huawei.plugin.account.login");
        intent.putExtra(Constant.KEY_IS_REBOOT, !SharedPreferenceUtil.isSameCountryCode(homeCountryCode));
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        Context context = this.mContext;
        if (context != null) {
            context.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
        ObserverManagerUtil.e("com.huawei.plugin.account.login", "com.huawei.plugin.account.login");
    }

    private void saveHomeCountry(HomeCountryInfo homeCountryInfo, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(RELEASE_TAG, "saveHomeCountry refresh homeCountryInfo");
        saveLoginSiteId(this.mContext, String.valueOf(homeCountryInfo.getSiteId()));
        SharedPreferenceUtil.getInstance(this.mContext).setCountryCode(homeCountryInfo.getHomeCountryCode());
        ContentProviderUtil.getInstance(this.mContext).setCountryCode(homeCountryInfo.getHomeCountryCode(), null);
        LoginCache.configSrvCountryCode(homeCountryInfo.getSrvNationalCode());
        ContentProviderUtil.getInstance(this.mContext).setServiceCountryCode(homeCountryInfo.getSrvNationalCode(), null);
        ifNewSiteId(homeCountryInfo.getSiteId(), SharedPreferenceUtil.getInstance(this.mContext));
        HuaweiLoginManager.updateAppTypeBySiteID(homeCountryInfo.getSiteId());
        HuaweiLoginManager.updateLoginTypeByCountry(this.mContext, homeCountryInfo.getHomeCountryCode());
        informHiDataLoginSuccess(this.mContext, homeCountryInfo, iBaseResponseCallback);
    }

    private static void informHiDataLoginSuccess(Context context, final HomeCountryInfo homeCountryInfo, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "informHiDataLoginSuccess refresh hiAccountInfo.");
        HiAccountInfo hiAccountInfo = new HiAccountInfo();
        LoginInit loginInit = LoginInit.getInstance(context);
        String accountInfo = loginInit.getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            return;
        }
        hiAccountInfo.setHuid(accountInfo);
        String accountInfo2 = loginInit.getAccountInfo(1015);
        hiAccountInfo.setAccessToken(accountInfo2);
        hiAccountInfo.setServiceToken(accountInfo2);
        hiAccountInfo.setSiteId(CommonUtil.n(context, loginInit.getAccountInfo(1009)));
        HiHealthNativeApi.a(context).hiLogin(hiAccountInfo, new HiCommonListener() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.11
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(ThirdPartyLoginManager.TAG, "informHiDataLoginSuccess inform HiData login onSuccess.");
                ThirdPartyLoginManager.callbackResult(homeCountryInfo, iBaseResponseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(ThirdPartyLoginManager.TAG, "informHiDataLoginSuccess hiLogin failed:", Integer.valueOf(i), "errorMsg:", obj);
                ThirdPartyLoginManager.callbackResult(homeCountryInfo, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callbackResult(HomeCountryInfo homeCountryInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, homeCountryInfo);
        }
    }

    private HomeCountryInfo getHomeCountry(String str) {
        HomeCountryInfo homeCountryInfo = new HomeCountryInfo();
        try {
            HomeCountryInfo homeCountryInfo2 = (HomeCountryInfo) new Gson().fromJson(CommonUtil.ac(str), HomeCountryInfo.class);
            if (homeCountryInfo2.isUseSrvNationalCode()) {
                homeCountryInfo2.setHomeCountryCode(homeCountryInfo2.getSrvNationalCode());
            } else {
                homeCountryInfo2.setHomeCountryCode(homeCountryInfo2.getNationalCode());
            }
            int siteIdByCountry = LoginInit.getCloudapi().getSiteIdByCountry(homeCountryInfo2.getHomeCountryCode());
            ReleaseLogUtil.d(TAG, "getHC grsSiteId=", Integer.valueOf(siteIdByCountry), " cloudSiteId=", Integer.valueOf(homeCountryInfo2.getCurrentSiteId()));
            if (homeCountryInfo2.getCurrentSiteId() == 0) {
                homeCountryInfo2.setSiteId(siteIdByCountry);
            } else {
                homeCountryInfo2.setSiteId(homeCountryInfo2.getCurrentSiteId());
            }
            ReleaseLogUtil.d(TAG, "getHC ", homeCountryInfo2.toString());
            return homeCountryInfo2;
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a(TAG, "queryUserHomeCountry JsonSyntaxException:", e.getMessage());
            return homeCountryInfo;
        }
    }

    public void queryHomeCountrySyncStatus(final IBaseResponseCallback iBaseResponseCallback) {
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        final String userID = SharedPreferenceUtil.getInstance(this.mContext).getUserID();
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(userID)) {
            iBaseResponseCallback.a(-1, null);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.12
                @Override // java.lang.Runnable
                public void run() {
                    ThirdPartyHttpUtils.queryUserHomeCountry(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.QUERY_SYNC_STATUS_URL, accountInfo, userID, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.12.1
                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onSuccess(String str) {
                            ReleaseLogUtil.d(ThirdPartyLoginManager.RELEASE_TAG, "queryHomeCountrySyncStatus result:", str);
                            try {
                                iBaseResponseCallback.a(0, Integer.valueOf(new JSONObject(str).getInt("status")));
                            } catch (JSONException unused) {
                                ReleaseLogUtil.a(ThirdPartyLoginManager.TAG, "queryHomeCountrySyncStatus JSONException");
                            }
                        }

                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onFailed(int i) {
                            ReleaseLogUtil.a(ThirdPartyLoginManager.RELEASE_TAG, "queryHomeCountrySyncStatus onFailed:", Integer.valueOf(i));
                            iBaseResponseCallback.a(-1, null);
                        }
                    });
                }
            });
        }
    }

    public void putUserHomeCountryStatus(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        final String userID = SharedPreferenceUtil.getInstance(this.mContext).getUserID();
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(userID)) {
            iBaseResponseCallback.a(-1, null);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.13
                @Override // java.lang.Runnable
                public void run() {
                    ThirdPartyHttpUtils.putUserHomeCountryStatus(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.QUERY_SYNC_STATUS_URL, accountInfo, userID, str, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.13.1
                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onSuccess(String str2) {
                            ReleaseLogUtil.d(ThirdPartyLoginManager.RELEASE_TAG, "putUserHomeCountryStatus result:", str2);
                            iBaseResponseCallback.a(0, str2);
                        }

                        @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                        public void onFailed(int i) {
                            ReleaseLogUtil.a(ThirdPartyLoginManager.RELEASE_TAG, "putUserHomeCountryStatus onFailed:", Integer.valueOf(i));
                            iBaseResponseCallback.a(-1, null);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshAtWhenExpire(ThirdPartyLoginInfo thirdPartyLoginInfo) {
        if (thirdPartyLoginInfo == null || thirdPartyLoginInfo.getResultCode() != ACCESS_TOKEN_INVALID_RESULT_CODE) {
            return;
        }
        ReleaseLogUtil.d(TAG, "refreshAtWhenExpire refresh at");
        LoginInit.getInstance(BaseApplication.getContext()).refreshAccessToken(null);
    }

    public void queryUserAccount(final IBaseResponseCallback iBaseResponseCallback) {
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        final String userID = SharedPreferenceUtil.getInstance(this.mContext).getUserID();
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(userID)) {
            LogUtil.j(TAG, "queryUserAccount accessToken or uid is empty");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.14
            @Override // java.lang.Runnable
            public void run() {
                ThirdPartyHttpUtils.queryUserAccount(ThirdPartyLoginManager.this.getSyncUrl(true) + ThirdPartyLoginManager.QUERY_USER_ACCOUNT_URL, accountInfo, userID, new ThirdPartyHttpUtils.RequestCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.14.1
                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onSuccess(String str) {
                        ReleaseLogUtil.d(ThirdPartyLoginManager.RELEASE_TAG, "queryUserAccount onSuccess");
                        LogUtil.a(ThirdPartyLoginManager.TAG, "queryUserAccount result：", str);
                        String userAccount = "";
                        try {
                            ThirdPartyLoginInfo thirdPartyLoginInfo = (ThirdPartyLoginInfo) new Gson().fromJson(CommonUtil.ac(str), ThirdPartyLoginInfo.class);
                            userAccount = thirdPartyLoginInfo.getUserAccount();
                            if (!TextUtils.isEmpty(userAccount)) {
                                LogUtil.a(ThirdPartyLoginManager.TAG, "getPlainTextAccountName success");
                                SharedPreferenceUtil.getInstance(ThirdPartyLoginManager.this.mContext).setPlainTextAccountName(userAccount);
                            }
                            if (thirdPartyLoginInfo.getUserAccountInfo() != null) {
                                LogUtil.a(ThirdPartyLoginManager.TAG, "getUserAccountInfo success");
                                UserAccountInfo userAccountInfo = thirdPartyLoginInfo.getUserAccountInfo();
                                SharedPreferenceUtil.getInstance(ThirdPartyLoginManager.this.mContext).setMobile(userAccountInfo.getMobile());
                                SharedPreferenceUtil.getInstance(ThirdPartyLoginManager.this.mContext).setEmail(userAccountInfo.getEmail());
                            }
                            if (thirdPartyLoginInfo.getResultCode() != 0) {
                                HuaweiLoginManager.reportErrorCode("queryUserAccount", thirdPartyLoginInfo.getResultCode());
                            }
                        } catch (JsonSyntaxException e) {
                            LogUtil.e(ThirdPartyLoginManager.TAG, "JsonSyntaxException:", e.getMessage());
                        }
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(0, userAccount);
                        }
                    }

                    @Override // com.huawei.login.third.ThirdPartyHttpUtils.RequestCallBack
                    public void onFailed(int i) {
                        ReleaseLogUtil.e(ThirdPartyLoginManager.RELEASE_TAG, "queryUserAccount failed: ", Integer.valueOf(i));
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i, null);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNeedSaveUserInfo(ThirdPartyLoginInfo thirdPartyLoginInfo) {
        if (thirdPartyLoginInfo == null) {
            LogUtil.j(TAG, "queryUserInfo onFailed: userLoginInfo is null.");
            return false;
        }
        if (thirdPartyLoginInfo.getResultCode() == 0) {
            return true;
        }
        LogUtil.j(TAG, "queryUserInfo onFailed: resultCode is ", Integer.valueOf(thirdPartyLoginInfo.getResultCode()));
        HuaweiLoginManager.reportErrorCode("query", thirdPartyLoginInfo.getResultCode());
        return false;
    }

    public void gotoStTimeActivity() {
        try {
            LogUtil.a(TAG, "gotoStTimeActivity.");
            if (!CommonUtil.x(this.mContext) && SharedPreferenceUtil.getInstance(this.mContext).getIsLogined()) {
                LoginInit.getInstance(this.mContext).logoutWhenTokenInvalid(null);
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setClassName(this.mContext, "com.huawei.health.StTimeoutActivity");
                this.mContext.startActivity(intent);
                return;
            }
            LogUtil.a(TAG, "gotoStTimeActivity onBackground or logout.");
        } catch (ActivityNotFoundException e) {
            LogUtil.e(TAG, "gotoStTimeActivity:", e.getMessage());
        }
    }

    public void openAccountManager(Activity activity) {
        LogUtil.a(TAG, "enter openAccountManager");
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        String strC = nmm.c("", getDeviceUuid(), "", "");
        Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
        nmq.b(activity, AccountConstants.GRS_APP_NAME, accountInfo, strC, "7", new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda5
            @Override // com.huawei.hwidauth.api.ResultCallBack
            public final void onResult(Result result) {
                ThirdPartyLoginManager.lambda$openAccountManager$3((nmt) result);
            }
        });
        LogUtil.a(TAG, "end openAccountManager");
    }

    static /* synthetic */ void lambda$openAccountManager$3(nmt nmtVar) {
        if (nmtVar == null || !nmtVar.getStatus().d()) {
            return;
        }
        LogUtil.a(TAG, "SignOutResult:", nmtVar.getStatus().a());
        ThirdLoginDataStorageUtil.setLogoutFlag(true);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
        BaseApplication.getContext().sendBroadcast(intent, SecurityConstant.e);
    }

    public void openPersonalInfo(Activity activity, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null) {
            LogUtil.j(TAG, "openPersonalInfo activity is null");
            return;
        }
        LogUtil.a(TAG, "enter openPersonalInfo.");
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        String strC = nmm.c("", getDeviceUuid(), "", "");
        Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
        nmq.e(activity, AccountConstants.GRS_APP_NAME, accountInfo, strC, new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwidauth.api.ResultCallBack
            public final void onResult(Result result) {
                ThirdPartyLoginManager.lambda$openPersonalInfo$4(iBaseResponseCallback, (nmw) result);
            }
        });
    }

    static /* synthetic */ void lambda$openPersonalInfo$4(IBaseResponseCallback iBaseResponseCallback, nmw nmwVar) {
        if (nmwVar == null || iBaseResponseCallback == null) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        nms status = nmwVar.getStatus();
        if (status == null) {
            iBaseResponseCallback.a(-1, null);
        } else if (status.d()) {
            iBaseResponseCallback.a(0, null);
        } else {
            LogUtil.a(TAG, "openPersonalInfo:", Integer.valueOf(status.e()));
            iBaseResponseCallback.a(-1, null);
        }
    }

    public void checkUserPassword(Activity activity, String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null) {
            LogUtil.j(TAG, "chkUserPassword activity is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        LogUtil.a(TAG, "enter checkUserPassword");
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        String deviceUuid = getDeviceUuid();
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(deviceUuid)) {
            LogUtil.j(TAG, "chkUserPassword accessToken is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            String strC = nmm.c("", deviceUuid, "", "");
            Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
            nmq.c(activity, AccountConstants.GRS_APP_NAME, accountInfo, str, strC, new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda4
                @Override // com.huawei.hwidauth.api.ResultCallBack
                public final void onResult(Result result) {
                    ThirdPartyLoginManager.lambda$checkUserPassword$5(iBaseResponseCallback, (nmk) result);
                }
            });
        }
    }

    static /* synthetic */ void lambda$checkUserPassword$5(IBaseResponseCallback iBaseResponseCallback, nmk nmkVar) {
        if (nmkVar.getStatus().d()) {
            LogUtil.a(TAG, "check success");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        int iE = nmkVar.getStatus().e();
        LogUtil.j(TAG, "check errorCode:", Integer.valueOf(iE), "StatusMessage:", nmkVar.getStatus().a());
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(iE, null);
        }
    }

    public void signOut() {
        LogUtil.a(TAG, "enter signOut");
        try {
            Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
            nmq.e(this.mContext, new ResultCallBack<nml>() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.15
                @Override // com.huawei.hwidauth.api.ResultCallBack
                public void onResult(nml nmlVar) {
                    if (nmlVar == null || !nmlVar.getStatus().d()) {
                        return;
                    }
                    ReleaseLogUtil.d(ThirdPartyLoginManager.TAG, "SignOutResult:", nmlVar.getStatus().a());
                }
            });
        } catch (nmr unused) {
            ReleaseLogUtil.a(TAG, "signOut ParmaInvalidException ");
        }
    }

    private String generateDeviceUuid() {
        return UUID.randomUUID().toString().replace(Constants.LINK, "");
    }

    public void immediatelyFreshAt() {
        LogUtil.a(TAG, "enter immediatelyFreshAt");
        if (TextUtils.isEmpty(KeyValDbManager.d(this.mContext).c("user_id")) || CommonUtil.bg()) {
            LogUtil.j(TAG, "immediatelyFreshAt isLogout");
        } else {
            refreshAtByRt(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.16
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a(ThirdPartyLoginManager.TAG, "immediatelyFreshAt errorCode = ", Integer.valueOf(i), " objData = ", obj);
                }
            });
        }
    }

    public void timedRefreshAt(final long j) {
        LogUtil.a(TAG, "enter timedRefreshAt");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager.17
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(KeyValDbManager.d(ThirdPartyLoginManager.this.mContext).c("user_id"))) {
                    LogUtil.j(ThirdPartyLoginManager.TAG, "timedRefreshAt isLogout");
                    return;
                }
                Object systemService = BaseApplication.getContext().getSystemService(NotificationCompat.CATEGORY_ALARM);
                if (!(systemService instanceof AlarmManager)) {
                    LogUtil.j(ThirdPartyLoginManager.TAG, "object is not instance of AlarmManager");
                    return;
                }
                AlarmManager alarmManager = (AlarmManager) systemService;
                PendingIntent pendingIntentCreatorPendingIntent = ThirdPartyLoginManager.this.creatorPendingIntent();
                alarmManager.cancel(pendingIntentCreatorPendingIntent);
                try {
                    if (PermissionUtil.c()) {
                        alarmManager.setExactAndAllowWhileIdle(0, j, pendingIntentCreatorPendingIntent);
                    } else {
                        alarmManager.setAndAllowWhileIdle(0, j, pendingIntentCreatorPendingIntent);
                    }
                } catch (IllegalStateException | SecurityException e) {
                    String str = "setExactAndAllowWhileIdle exception " + e.getMessage();
                    ReleaseLogUtil.a(ThirdPartyLoginManager.TAG, "setExactAndAllowWhileIdle exception ", str);
                    ThirdPartyLoginManager.this.reportErrorCode(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportErrorCode(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("keyWords", "opAlarmPermissionKey");
        linkedHashMap.put("messages", str);
        OpAnalyticsApi opAnalyticsApi = LoginInit.getInstance(BaseApplication.getContext()).getOpAnalyticsApi();
        if (opAnalyticsApi != null) {
            opAnalyticsApi.reportErrorCode(HEALTH_APP_PROBABILITY_PROBLEM, linkedHashMap);
        }
    }

    private void saveFreshTokenData(ThirdPartyLoginInfo thirdPartyLoginInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (thirdPartyLoginInfo == null) {
            LogUtil.j(TAG, "saveFreshTokenData loginInfo is null");
            return;
        }
        LogUtil.a(TAG, "saveFreshTokenData accesstoken= ", thirdPartyLoginInfo.getAccessToken());
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.mContext);
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getUid())) {
            sharedPreferenceUtil.setUserID(thirdPartyLoginInfo.getUid());
            ThirdLoginDataStorageUtil.setUserId(thirdPartyLoginInfo.getUid());
        }
        ThirdLoginDataStorageUtil.saveServerTimestamp(String.valueOf(thirdPartyLoginInfo.getTimeStamp()));
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getAccessToken())) {
            ThirdLoginDataStorageUtil.saveAccessTokenToDb(thirdPartyLoginInfo.getAccessToken());
        }
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getAccessTokenExpireTime())) {
            sharedPreferenceUtil.setAtExpireTime(thirdPartyLoginInfo.getAccessTokenExpireTime());
            ThirdLoginDataStorageUtil.saveAccessTokenExpireTimeToDb(thirdPartyLoginInfo.getAccessTokenExpireTime());
        }
        long jI = CommonUtil.i(thirdPartyLoginInfo.getAccessTokenExpireTime());
        long timeStamp = thirdPartyLoginInfo.getTimeStamp();
        timedRefreshAt(System.currentTimeMillis() + Math.max((jI - timeStamp) - HealthAccessTokenUtil.getAtInstance().getRandomUpdateTime(), 0L));
        String refreshTokenFromDb = ThirdLoginDataStorageUtil.getRefreshTokenFromDb();
        LogUtil.a(TAG, "saveFreshTokenData lastRtValue = ", refreshTokenFromDb);
        if (!TextUtils.isEmpty(thirdPartyLoginInfo.getRefreshToken())) {
            sharedPreferenceUtil.setRefreshTicket(thirdPartyLoginInfo.getRefreshToken());
            ThirdLoginDataStorageUtil.saveRefreshTokenToDb(thirdPartyLoginInfo.getRefreshToken());
        }
        if (thirdPartyLoginInfo.getRefreshToken() != null && !thirdPartyLoginInfo.getRefreshToken().equals(refreshTokenFromDb)) {
            long timeStamp2 = thirdPartyLoginInfo.getTimeStamp() + ThirdLoginDataStorageUtil.REFRESH_TOKEN_INTERVAL;
            sharedPreferenceUtil.setRtExpireTime(String.valueOf(timeStamp2));
            ThirdLoginDataStorageUtil.saveRefreshTokenExpireTimeToDb(String.valueOf(timeStamp2));
        }
        clearTokenInfo();
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, thirdPartyLoginInfo.getAccessToken());
        }
        sharedPreferenceUtil.retrySetIsLogined();
    }

    public boolean getLogoutStatus() {
        String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
        if (TextUtils.isEmpty(logoutFlag)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(logoutFlag);
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "getLogoutStatus", ExceptionUtils.c(e));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PendingIntent creatorPendingIntent() {
        LogUtil.a(TAG, "enter creatorPendingIntent");
        Intent intent = new Intent();
        Context context = BaseApplication.getContext();
        String packageName = context.getPackageName();
        intent.setPackage(packageName);
        intent.setClassName(packageName, "com.huawei.health.manager.DaemonService");
        intent.setAction(ThirdLoginDataStorageUtil.START_DAEMON_FOR_REFRESH_TOKEN);
        PowerKitManager.a().e(Collections.singletonList(ThirdLoginDataStorageUtil.START_DAEMON_FOR_REFRESH_TOKEN));
        return PendingIntent.getService(context, 0, intent, 201326592);
    }

    public boolean isRefreshTokenOverTime() {
        String rtExpireTime = SharedPreferenceUtil.getInstance(this.mContext).getRtExpireTime();
        return TextUtils.isEmpty(rtExpireTime) || CommonUtil.i(rtExpireTime) <= System.currentTimeMillis();
    }

    public void qrCodeAuthLogin(Activity activity, String str, int i, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null || iBaseResponseCallback == null) {
            LogUtil.e(TAG, "qrCodeAuthLogin currentActivity or callback is null");
            return;
        }
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1015);
        LogUtil.a(TAG, "qrCodeAuthLogin accessToken is", Boolean.valueOf(TextUtils.isEmpty(accountInfo)));
        nnb nnbVar = new nnb(str, i, str2);
        String strC = nmm.c("", getDeviceUuid(), "", "");
        Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
        nmq.d(activity, AccountConstants.GRS_APP_NAME, accountInfo, nnbVar, strC, new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda3
            @Override // com.huawei.hwidauth.api.ResultCallBack
            public final void onResult(Result result) {
                ThirdPartyLoginManager.lambda$qrCodeAuthLogin$6(iBaseResponseCallback, (nmn) result);
            }
        });
    }

    static /* synthetic */ void lambda$qrCodeAuthLogin$6(IBaseResponseCallback iBaseResponseCallback, nmn nmnVar) {
        if (nmnVar == null || nmnVar.getStatus() == null) {
            LogUtil.j(TAG, "qrCodeAuthLogin result.getStatus() is null");
            iBaseResponseCallback.a(-1, null);
        } else if (nmnVar.getStatus().d()) {
            LogUtil.a(TAG, "qrCodeAuthLogin isSuccess");
            iBaseResponseCallback.a(0, null);
        } else {
            int iE = nmnVar.getStatus().e();
            LogUtil.j(TAG, "qrCodeAuthLogin fail:", Integer.valueOf(iE));
            iBaseResponseCallback.a(iE, null);
        }
    }

    public void qrCodeAuthorize(Activity activity, String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null || iBaseResponseCallback == null) {
            LogUtil.j(TAG, "qrCodeAuthorize currentActivity or callback is null");
        } else {
            Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
            nmq.b(activity, AccountConstants.GRS_APP_NAME, "0", str, new ResultCallBack() { // from class: com.huawei.login.huaweilogin.ThirdPartyLoginManager$$ExternalSyntheticLambda2
                @Override // com.huawei.hwidauth.api.ResultCallBack
                public final void onResult(Result result) {
                    ThirdPartyLoginManager.lambda$qrCodeAuthorize$7(iBaseResponseCallback, (nmw) result);
                }
            });
        }
    }

    static /* synthetic */ void lambda$qrCodeAuthorize$7(IBaseResponseCallback iBaseResponseCallback, nmw nmwVar) {
        if (nmwVar == null || nmwVar.getStatus() == null) {
            LogUtil.j(TAG, "qrCodeAuthorize result.getStatus() is null");
            iBaseResponseCallback.a(-1, null);
        } else if (nmwVar.getStatus().d()) {
            LogUtil.a(TAG, "qrCodeAuthorize isSuccess");
            iBaseResponseCallback.a(0, null);
        } else {
            int iE = nmwVar.getStatus().e();
            LogUtil.j(TAG, "qrCodeAuthorize fail:", Integer.valueOf(iE));
            iBaseResponseCallback.a(iE, null);
        }
    }
}
