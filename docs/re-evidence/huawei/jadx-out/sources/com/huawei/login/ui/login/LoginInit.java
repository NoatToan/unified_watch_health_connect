package com.huawei.login.ui.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.browse.Cloudapi;
import com.huawei.common.Constant;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.common.util.AccountHelper;
import com.huawei.common.util.Utils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.util.ContentProviderUtil;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.login.ui.login.util.LoginCache;
import com.huawei.login.ui.login.util.LoginResult;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.pluginaccountlogin.R;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.up.model.UserInfomation;
import defpackage.lua;
import defpackage.nio;
import defpackage.njy;
import health.compact.a.CloudUtils;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.EzPluginManager;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class LoginInit {
    public static final int APP_ALLOW_USE_AGE_18 = 18;
    private static final int APP_ALLOW_USE_MIN_AGE = 16;
    private static final String CANADA = "CA";
    private static final long CHECK_ACCOUNT_TIME_OUT = 5000;
    private static final String DEFAULT_PATH = "default";
    private static final String DEVICE_TYPE_IS_IMEI = "0";
    private static final String DEVICE_TYPE_IS_UNKNOWN = "-1";
    private static final int ERROR_RES_CODE = -1;
    private static final String JAPAN = "JP";
    public static final String KOREA = "KR";
    private static final String LAST_COUNTRY_CODE = "last_country_code";
    private static final int LOGIN_BY_HW_ID = 4;
    private static final int LOGIN_BY_VERSION_TWO = 2;
    private static final int LOGIN_BY_WEAR = 3;
    private static final int NEED_REBOOT = 1;
    private static final long ONE_DAY_TIME = 86400000;
    private static final String QUERY_ACCOUNT_TIME = "queryAccountTime";
    private static final String RUSSIA = "RU";
    private static final String SELECT_COUNTRY = "select_country";
    private static final long SERVICE_COUNTRY_REFRESH_INTERVAL = 10000;
    private static final String TAG = "PLGLOGIN_LoginInit";
    private static final long TIME_OUT_MILLISECONDS = 2000;
    private static final String USER_PROFILE_HEAD_IMAGE_LOCAL_PREFIX = "user_profile_head_image_local_prefix_";
    private static AtomicBoolean hasReport = new AtomicBoolean(false);
    private static volatile IBaseResponseCallback mBrowseCallback;
    private static BrowsingBiEvent mBrowsingBiEvent;
    private static Context mContext;
    private static volatile LoginInit mLogin;
    private static volatile Cloudapi sCloudapi;
    private static long sRefreshTime;
    private OpAnalyticsApi mOpAnalyticsInstance;
    private BroadcastReceiver mAdShowStatusReceiver = new BroadcastReceiver() { // from class: com.huawei.login.ui.login.LoginInit.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a(LoginInit.TAG, "enter mAdShowStatusReceiver");
            if (!"com.huawei.health.action.MAIN_AD_FINISH".equals(intent.getAction())) {
                LogUtil.j(LoginInit.TAG, "ad show not match action");
            } else {
                LogUtil.a(LoginInit.TAG, "ad show finish");
                LoginInit.getInstance(LoginInit.mContext).silentLogin(new ILoginCallback() { // from class: com.huawei.login.ui.login.LoginInit.1.1
                    @Override // com.huawei.login.ui.login.util.ILoginCallback
                    public void onLoginSuccess(Object obj) {
                        LogUtil.a(LoginInit.TAG, "adBroadcast login success");
                    }

                    @Override // com.huawei.login.ui.login.util.ILoginCallback
                    public void onLoginFailed(Object obj) {
                        LogUtil.a(LoginInit.TAG, "adBroadcast login fail");
                        if ((obj instanceof LoginResult) && ((LoginResult) obj).getErrorCode() == 907135003) {
                            ThirdPartyLoginManager.getInstance().gotoStTimeActivity();
                        }
                    }
                }, true);
            }
        }
    };
    private int mSiteId = 0;
    private String signOutCountry = "";

    public int getLoginByHWid() {
        return 4;
    }

    public int getLoginByVersionTwo() {
        return 2;
    }

    public int getLoginByWear() {
        return 3;
    }

    private LoginInit() {
        if (!getIsLogined()) {
            LogUtil.a(TAG, "not login");
            return;
        }
        if (CommonUtil.bg() || CommonUtil.z(mContext) || SharedPreferenceUtil.getInstance(mContext).getUpdateState() || !CloudUtils.a()) {
            LogUtil.a(TAG, "huawei system or login by lite or login by new account sdk or no cloud");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.MAIN_AD_FINISH");
        LocalBroadcastManager.getInstance().registerReceiver(this.mAdShowStatusReceiver, intentFilter);
    }

    public static Cloudapi getCloudapi() {
        return sCloudapi;
    }

    public static void setCloudapi(Cloudapi cloudapi) {
        sCloudapi = cloudapi;
    }

    public static AtomicBoolean getHasReport() {
        return hasReport;
    }

    public static IBaseResponseCallback getBrowseCallback() {
        return mBrowseCallback;
    }

    private static void setBrowseCallback(IBaseResponseCallback iBaseResponseCallback) {
        mBrowseCallback = iBaseResponseCallback;
    }

    public static LoginInit getInstance(Context context) {
        if (mLogin != null) {
            return mLogin;
        }
        synchronized (LoginInit.class) {
            try {
                if (context != null) {
                    mContext = context.getApplicationContext();
                } else {
                    mContext = BaseApplication.getContext();
                }
                if (mLogin == null) {
                    mLogin = new LoginInit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mLogin;
    }

    private void unifiedLogin(Context context, ILoginCallback iLoginCallback) {
        ReleaseLogUtil.d(TAG, "Enter unifiedLogin.");
        if (CommonUtil.ca()) {
            ReleaseLogUtil.a(TAG, "unifiedLogin() isStoreDemoVersion or Context not is activity");
            iLoginCallback.onLoginFailed(new LoginResult(-1));
            return;
        }
        if (!CommonUtil.ab(mContext)) {
            ReleaseLogUtil.a(TAG, "unifiedLogin() isNetworkConnected false");
            iLoginCallback.onLoginFailed(new LoginResult(-1));
            return;
        }
        if (!CommonUtil.cl() && Utils.getHmsVersionName().contains("mirror")) {
            ReleaseLogUtil.a(TAG, "is error hms core version");
            iLoginCallback.onLoginFailed(new LoginResult(-1));
            return;
        }
        if (!AccountHelper.compareAndSetLogining(false, true)) {
            ReleaseLogUtil.a(TAG, "unifiedLogin() is logining");
            iLoginCallback.onLoginFailed(new LoginResult(-99));
        } else if (getIsLogined() && CloudUtils.a()) {
            ReleaseLogUtil.d(TAG, "unifiedLogin silentLogin");
            silentLogin(iLoginCallback, false);
        } else {
            ReleaseLogUtil.d(TAG, "unifiedLogin nonSilentLogin");
            nonSilentLogin(context, iLoginCallback);
        }
    }

    public static void login(Context context, ILoginCallback iLoginCallback) {
        getInstance(mContext).unifiedLogin(context, iLoginCallback);
    }

    private void nonSilentLogin(Context context, final ILoginCallback iLoginCallback) {
        LogUtil.a(TAG, "Enter nonSilentLogin.");
        if (CommonUtil.z(mContext)) {
            ThirdPartyLoginManager.getInstance().thirdPartyPhoneLogin(context, new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LoginInit.lambda$nonSilentLogin$0(iLoginCallback, i, obj);
                }
            });
        } else {
            loginByHmsCore(iLoginCallback, false);
        }
    }

    static /* synthetic */ void lambda$nonSilentLogin$0(ILoginCallback iLoginCallback, int i, Object obj) {
        AccountHelper.compareAndSetLogining(true, false);
        if (iLoginCallback == null) {
            return;
        }
        if (i == 0) {
            iLoginCallback.onLoginSuccess(new LoginResult(i));
        } else {
            iLoginCallback.onLoginFailed(new LoginResult(i));
        }
    }

    public static void tryLoginWhenTokenInvalid() {
        if ("1".equalsIgnoreCase(CommonUtil.w())) {
            if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
                LogUtil.j(TAG, "tryLoginWhenTokenInvalid isBasicService");
            } else if (!AccountHelper.compareAndSetLogining(false, true)) {
                LogUtil.j(TAG, "tryLoginWhenTokenInvalid logining turn true");
            } else {
                ReleaseLogUtil.d(TAG, "tryLoginWhenTokenInvalid");
                getInstance(mContext).silentLogin(null, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void silentLogin(final ILoginCallback iLoginCallback, boolean z) {
        if ((!CommonUtil.bg() && SharedPreferenceUtil.getInstance(mContext).getUpdateState()) || CommonUtil.z(mContext)) {
            ThirdPartyLoginManager.getInstance().refreshAtByRt(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    AccountHelper.compareAndSetLogining(true, false);
                    ILoginCallback iLoginCallback2 = iLoginCallback;
                    if (iLoginCallback2 == null) {
                        return;
                    }
                    if (i == 0) {
                        iLoginCallback2.onLoginSuccess(new LoginResult(i));
                    } else {
                        iLoginCallback2.onLoginFailed(new LoginResult(i));
                    }
                }
            });
        } else {
            loginByHmsCore(iLoginCallback, true);
        }
    }

    private void loginByHmsCore(final ILoginCallback iLoginCallback, boolean z) {
        HuaweiLoginManager.getInstance().hmsHasLogined(new ILoginCallback() { // from class: com.huawei.login.ui.login.LoginInit.3
            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginSuccess(Object obj) {
                AccountHelper.compareAndSetLogining(true, false);
                ILoginCallback iLoginCallback2 = iLoginCallback;
                if (iLoginCallback2 != null) {
                    iLoginCallback2.onLoginSuccess(obj);
                }
            }

            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginFailed(Object obj) {
                AccountHelper.compareAndSetLogining(true, false);
                ILoginCallback iLoginCallback2 = iLoginCallback;
                if (iLoginCallback2 != null) {
                    iLoginCallback2.onLoginFailed(obj);
                }
            }
        }, z);
    }

    public void loginHms(Context context, ILoginCallback iLoginCallback) {
        if (context == null || iLoginCallback == null) {
            LogUtil.j(TAG, "loginHms failed!");
            return;
        }
        if (HuaweiLoginManager.checkIsInstallHuaweiAccount(context)) {
            LogUtil.a(TAG, "goto HMS login");
            unifiedLogin(context, iLoginCallback);
        } else if (CommonUtil.v(BaseApplication.getContext())) {
            LogUtil.a(TAG, "use app to install HMS");
            login(context, iLoginCallback);
        } else {
            CommonUtil.b(context, CommonUtil.x());
        }
    }

    public int getLoginType() {
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getLoginType();
    }

    public int getHealthLoginChannel() {
        if (BaseApplication.getContext() == null) {
            LogUtil.e(TAG, "BaseApplication.getContext() is null !");
            return -1;
        }
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getHealthLoginChannel();
    }

    public void setHealthLoginChannel(int i) {
        if (BaseApplication.getContext() == null) {
            LogUtil.e(TAG, "mContext is null!");
        } else {
            SharedPreferenceUtil.getInstance(mContext).setHealthLoginChannel(i);
        }
    }

    public String getAccountInfo(int i) {
        LogUtil.d(TAG, "getAccountInfo item = " + i);
        if (i != 1019) {
            switch (i) {
                case 1000:
                case 1001:
                    return getAccountNameInner();
                case 1002:
                    return KeyValDbManager.d(mContext).c("key_user_name");
                case 1003:
                    return KeyValDbManager.d(mContext).c("key_user_pic_path");
                case 1004:
                    return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getAccountType();
                case 1005:
                    return SharedPreferenceUtil.getInstance(mContext).getGender();
                case 1006:
                    return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getBirthDate();
                case 1007:
                    if (LoginCache.fetchAccessToken() != null) {
                        return LoginCache.fetchAccessToken();
                    }
                    return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getAccessToken();
                default:
                    return continueGetAccountInfo(i);
            }
        }
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getAccountTypeHms();
    }

    private String continueGetAccountInfo(int i) {
        switch (i) {
            case 1008:
            case 1015:
                return HealthAccessTokenUtil.getAtInstance().getAccessToken();
            case 1009:
                return String.valueOf(getSiteIdInner());
            case 1010:
                return getCountryCodeInner();
            case 1011:
                return SharedPreferenceUtil.getInstance(mContext).getUserID();
            case 1012:
                return "2";
            case 1013:
            default:
                LogUtil.a(TAG, "getAccountInfo UnSupported item = ", Integer.valueOf(i));
                return "";
            case 1014:
                return getServiceCountryCodeInner();
            case 1016:
                return getAccessTokenExpireTime();
            case 1017:
                return SharedPreferenceUtil.getInstance(mContext).getMobile();
            case 1018:
                return SharedPreferenceUtil.getInstance(mContext).getEmail();
        }
    }

    private String getAccessTokenExpireTime() {
        if (CommonUtil.bg()) {
            return KeyValDbManager.d(BaseApplication.getContext()).c(HealthAccessTokenUtil.KEY_AT_EXPIRE);
        }
        return ThirdLoginDataStorageUtil.getAccessTokenExpireTimeFromDb();
    }

    public void getAccountInfo(int i, StorageDataCallback storageDataCallback) {
        LogUtil.a(TAG, "getAccountInfo callback item = " + i);
        if (i == 1001) {
            getPlainTextAccountNameInner(storageDataCallback);
        }
    }

    public void setAccountInfo(int i, String str, StorageDataCallback storageDataCallback) throws NumberFormatException {
        LogUtil.a(TAG, "setAccountInfo item = " + i + " value = " + str);
        if (i == 1009) {
            setSiteIdInner(Integer.parseInt(str), storageDataCallback);
            return;
        }
        if (i == 1011) {
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setUserID(str);
            return;
        }
        if (i == 1013) {
            LoginCache.configServerToken(str);
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setSeverToken(str, storageDataCallback);
            return;
        }
        if (i != 1019) {
            switch (i) {
                case 1002:
                    KeyValDbManager.d(mContext).c("key_user_name", str, storageDataCallback);
                    break;
                case 1003:
                    KeyValDbManager.d(mContext).c("key_user_pic_path", str, storageDataCallback);
                    break;
                case 1004:
                    SharedPreferenceUtil.getInstance(mContext).setAccountType(str);
                    break;
                case 1005:
                    SharedPreferenceUtil.getInstance(mContext).setGender(str);
                    break;
                case 1006:
                    SharedPreferenceUtil.getInstance(mContext).setBirthDate(str);
                    break;
                case 1007:
                    LoginCache.configAccessToken(str);
                    SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setAccessToken(str, storageDataCallback);
                    break;
            }
            return;
        }
        SharedPreferenceUtil.getInstance(mContext).setAccountTypeHms(str);
    }

    public void refreshAccessToken(final ILoginCallback iLoginCallback) {
        HealthAccessTokenUtil.getAtInstance().refreshAccessTokenAsync(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LoginInit.lambda$refreshAccessToken$1(iLoginCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$refreshAccessToken$1(ILoginCallback iLoginCallback, int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            if (iLoginCallback != null) {
                iLoginCallback.onLoginSuccess(obj);
            }
        } else if (iLoginCallback != null) {
            iLoginCallback.onLoginFailed(obj);
        }
    }

    @Deprecated
    public String getUsetId() {
        if (BaseApplication.getContext() == null) {
            LogUtil.e(TAG, "mContext is null !");
            return "";
        }
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getUserID();
    }

    public boolean getIsLogined() {
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getIsLogined();
    }

    public void setIsLogined(boolean z) {
        SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setIsLogined(z);
    }

    @Deprecated
    public int getSiteId() {
        return getSiteIdInner();
    }

    private int getSiteIdInner() {
        int i = this.mSiteId;
        if (i > 0 && EnvironmentUtils.d()) {
            return i;
        }
        int iC = lua.c();
        if (iC > 0) {
            this.mSiteId = iC;
        }
        return iC;
    }

    private void setSiteIdInner(int i, StorageDataCallback storageDataCallback) {
        this.mSiteId = i;
        SharedPreferenceUtil.getInstance(mContext).setSiteID(i, storageDataCallback);
    }

    private String getServiceCountryCodeInner() {
        String srvCountryCode = LoginCache.getSrvCountryCode();
        if (TextUtils.isEmpty(srvCountryCode)) {
            srvCountryCode = ContentProviderUtil.getInstance(mContext).getServiceCountryCode();
        }
        refreshServiceCountry();
        if (TextUtils.isEmpty(srvCountryCode)) {
            ReleaseLogUtil.d(TAG, "getServiceCountryCodeInner srvCountryCode isEmpty");
            return srvCountryCode;
        }
        LogUtil.d(TAG, "getServiceCountryCodeInner srvCountryCode= ", srvCountryCode);
        return srvCountryCode;
    }

    private void refreshServiceCountry() {
        if (CommonUtil.z(mContext) || isFastRefresh()) {
            ReleaseLogUtil.e(TAG, "refreshServiceCountry isHmsLite or fastRefresh");
            return;
        }
        if (System.currentTimeMillis() <= SharedPreferenceUtil.getInstance(mContext).getServerCountryTime() + 86400000) {
            LogUtil.a(TAG, "not update in one day");
        } else {
            refreshCountryInfo();
        }
    }

    private void refreshCountryInfo() {
        if (CommonUtil.cc()) {
            ThirdPartyLoginManager.getInstance().queryHomeCountryInfo(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LoginInit.lambda$refreshCountryInfo$2(i, obj);
                }
            }, false);
        } else {
            ThirdPartyLoginManager.getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LoginInit.lambda$refreshCountryInfo$3(i, obj);
                }
            }, false);
        }
    }

    static /* synthetic */ void lambda$refreshCountryInfo$2(int i, Object obj) {
        LogUtil.a(TAG, "refreshServiceCountry queryHomeCountryInfo onFinish");
        if (i == 0) {
            SharedPreferenceUtil.getInstance(mContext).setServerCountryTime(System.currentTimeMillis());
        }
    }

    static /* synthetic */ void lambda$refreshCountryInfo$3(int i, Object obj) {
        LogUtil.a(TAG, "refreshServiceCountry queryUserInfo onFinish");
        if (i == 0) {
            SharedPreferenceUtil.getInstance(mContext).setServerCountryTime(System.currentTimeMillis());
        }
    }

    @Deprecated
    public String getCountryCode(StorageDataCallback storageDataCallback) {
        return getCountryCodeInner();
    }

    private String getCountryCodeInner() {
        if (!EnvironmentUtils.d()) {
            LogUtil.d(TAG, "get countryCode not in MainProcess");
            return ContentProviderUtil.getInstance(BaseApplication.getContext()).getCountryCode();
        }
        String countryCode = getCountryCode();
        if (TextUtils.isEmpty(countryCode)) {
            LogUtil.d(TAG, "get countryCode from CP");
            countryCode = ContentProviderUtil.getInstance(BaseApplication.getContext()).getCountryCode();
            if (TextUtils.isEmpty(countryCode)) {
                countryCode = getSelectCountryCode();
            }
            if (!TextUtils.isEmpty(countryCode)) {
                SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setCountryCode(countryCode);
                LogUtil.a(TAG, "save country code from cp to sp");
            }
        }
        return countryCode;
    }

    public void cleanLoginData() {
        LogUtil.a(TAG, "Enter cleanLoginData");
        if (CommonUtil.ca()) {
            LogUtil.a(TAG, "StoreDemo no clearlogin");
            return;
        }
        setAccountInfo(1011, "", null);
        SharedPreferenceUtil.updateLastCountryCode(getAccountInfo(1010));
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(BaseApplication.getContext());
        sharedPreferenceUtil.saveAccountInfo(null);
        sharedPreferenceUtil.deleteAllHealthData();
        HuaweiLoginManager.getInstance().logout();
        SharedPreferenceManager.e(mContext, Integer.toString(10015), "hasRemindMigrateData", String.valueOf(false), null);
        HuaweiLoginManager.setIsAllowedLoginValueToDB(mContext, "1");
        setIsLogined(false);
        setIsBrowseModeToPd(mContext, true);
        CommonUtil.aa((String) null);
        sharedPreferenceUtil.setHuaweiAccountLoginFlag("");
        sharedPreferenceUtil.setAccessToken(null, null);
        sharedPreferenceUtil.setSeverToken(null, null);
        sharedPreferenceUtil.setMobile("");
        sharedPreferenceUtil.setEmail("");
        sharedPreferenceUtil.setAccountName("");
        sharedPreferenceUtil.setPlainTextAccountName("");
        KeyValDbManager.d(mContext).a("server_token", "", new StorageParams(14), null);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10016), "health_first_login", "true", null);
        SharedPreferenceManager.e(mContext, Integer.toString(20000), "key_ui_if_show_no_cloud_account_alert", String.valueOf(false), new StorageParams());
        SharedPreferenceManager.e(mContext, Integer.toString(20000), "key_ui_if_show_age_less_minimum_alert", String.valueOf(false), new StorageParams());
        SharedPreferenceManager.e(mContext, Integer.toString(20000), "key_ui_age_less_minimum", String.valueOf(false), new StorageParams());
        LoginCache.configSrvCountryCode("");
        ContentProviderUtil.getInstance(mContext).setServiceCountryCode("", null);
        LoginCache.configServerToken(null);
        LoginCache.configAccessToken(null);
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "hw_health_show_grant_pwd", Integer.toString(0), new StorageParams());
        setAccountInfo(1004, null, null);
        setAccountInfo(1019, "", null);
        if (CommonUtil.bg()) {
            return;
        }
        clearHmsLiteInfo();
    }

    private void clearHmsLiteInfo() {
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(mContext);
        sharedPreferenceUtil.setAuthCode("");
        sharedPreferenceUtil.setRefreshTicket("");
        sharedPreferenceUtil.setAtExpireTime("");
        sharedPreferenceUtil.setUserID("");
        sharedPreferenceUtil.setRtExpireTime("");
        ThirdLoginDataStorageUtil.setLogoutFlag(true);
        ThirdLoginDataStorageUtil.setUserId("");
        ThirdLoginDataStorageUtil.saveServerTimestamp("");
        ThirdLoginDataStorageUtil.saveAccessTokenToDb("");
        ThirdLoginDataStorageUtil.saveAccessTokenExpireTimeToDb("");
        ThirdLoginDataStorageUtil.saveRefreshTokenToDb("");
        ThirdLoginDataStorageUtil.saveRefreshTokenExpireTimeToDb("");
        if (CommonUtil.z(mContext)) {
            ThirdPartyLoginManager.getInstance().signOut();
            SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("hmslite", 0).edit();
            editorEdit.putBoolean("use-status", false);
            editorEdit.commit();
        }
    }

    public void logout() {
        if (CommonUtil.ca()) {
            LogUtil.e(TAG, "IS_BETA_PAY_VERSION or store no logout");
        } else {
            LogUtil.a(TAG, "Enter logout");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.LoginInit.4
                @Override // java.lang.Runnable
                public void run() {
                    EzPluginManager.b().a();
                    LoginInit loginInit = LoginInit.this;
                    loginInit.signOutCountry = loginInit.getAccountInfo(1010);
                    LoginInit.this.cleanLoginData();
                    KeyValDbManager.d(LoginInit.mContext).a("cloud_st_invalid_flag", "0", new StorageParams(1), null);
                    SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_GUIDE_SET_USER_INFO_SUCCESS_FLAG", "false", null);
                    SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10015), "is_exist_kid_watch", "", null);
                    SharedPreferenceManager.e(LoginInit.mContext, Integer.toString(10015), "is_cloud_push_receiver", "", null);
                    LoginInit.this.toSendLogoutBroadcast();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toSendLogoutBroadcast() {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setAction("com.huawei.plugin.account.logout");
            localBroadcastManager.sendBroadcast(intent);
            ObserverManagerUtil.e("com.huawei.plugin.account.logout", "com.huawei.plugin.account.logout");
            if (BaseApplication.getContext() != null) {
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            } else {
                LogUtil.e(TAG, "logout mContext is null");
            }
            LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "Enter ", "logout -->close, account logout()");
        }
        BrowsingBiEvent browsingBiEvent = mBrowsingBiEvent;
        if (browsingBiEvent != null) {
            browsingBiEvent.updateCountryCodeAndUserId();
        }
        versionSwitchDetection();
    }

    private void versionSwitchDetection() {
        String countryBeforeLogin = Utils.getCountryBeforeLogin();
        if (this.signOutCountry.equals(countryBeforeLogin)) {
            return;
        }
        if (countryBeforeLogin.equalsIgnoreCase("CN")) {
            HuaweiLoginManager.setCloudVersion("1", null);
        } else {
            HuaweiLoginManager.setCloudVersion("0", null);
        }
        setAccountInfo(1009, String.valueOf(getCloudapi().getSiteIdByCountry(countryBeforeLogin)), null);
        SharedPreferenceUtil.updateLastCountryCode(countryBeforeLogin);
        SharedPreferenceUtil.getInstance(mContext).setCountryCode(countryBeforeLogin);
        ContentProviderUtil.getInstance(mContext).setCountryCode(countryBeforeLogin, new StorageDataCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda3
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public final void onProcessed(StorageResult storageResult) {
                LoginInit.lambda$versionSwitchDetection$4(storageResult);
            }
        });
    }

    static /* synthetic */ void lambda$versionSwitchDetection$4(StorageResult storageResult) {
        if (com.huawei.haf.application.BaseApplication.h()) {
            CommonLibUtil.d(BaseApplication.getContext());
        } else {
            Process.killProcess(Process.myPid());
        }
    }

    public void logoutWhenStTimeout(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "Enter logoutWhenStTimeout");
        if (BaseApplication.getContext() == null) {
            LogUtil.e(TAG, "mContext is null !!!");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "");
                return;
            }
            return;
        }
        if (CommonUtil.ca() || CommonUtil.z(mContext)) {
            LogUtil.j(TAG, "no st timeout");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "");
                return;
            }
            return;
        }
        logoutWhenTokenInvalid(iBaseResponseCallback);
    }

    public void logoutWhenTokenInvalid(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1461x731c3686(iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$logoutWhenTokenInvalid$5$com-huawei-login-ui-login-LoginInit, reason: not valid java name */
    /* synthetic */ void m1461x731c3686(IBaseResponseCallback iBaseResponseCallback) {
        String strE;
        String accountInfo = getAccountInfo(1008);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20008), "migrate_timeout_s_key", accountInfo, new StorageParams(1));
        HiHealthNativeApi.a(BaseApplication.getContext()).hiLogout(new HiCommonListener() { // from class: com.huawei.login.ui.login.LoginInit.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(LoginInit.TAG, "logoutWhenTokenInvalid hiLogout onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(LoginInit.TAG, "logoutWhenTokenInvalid hiLogout onFailure");
            }
        });
        cleanLoginData();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setAction("com.huawei.plugin.account.logout");
            intent.putExtra("logoutNotExit", true);
            try {
                strE = HwEncryptUtil.b(mContext).e(2, accountInfo);
            } catch (Exception unused) {
                LogUtil.e(TAG, "encryptData exception");
                strE = "";
            }
            intent.putExtra("invalidst", strE);
            localBroadcastManager.sendBroadcast(intent);
            if (BaseApplication.getContext() == null) {
                LogUtil.j(TAG, "BaseApplication.getContext() is null");
            } else {
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            }
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, "");
        }
    }

    public boolean isLoginedByWear() {
        int healthLoginChannel = getInstance(BaseApplication.getContext()).getHealthLoginChannel();
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("health_login_channel");
        if (strC != null && !strC.isEmpty()) {
            try {
                healthLoginChannel = Integer.parseInt(strC);
            } catch (NumberFormatException unused) {
                LogUtil.a(TAG, "isLoginedByWear NumberFormatException");
            }
        }
        return healthLoginChannel == 3;
    }

    public void moveInfoFromSPTODB() {
        LogUtil.a(TAG, "use keydbvalue, do not need moveInfoFromSPTODB");
    }

    private String getAccountNameInner() {
        final String[] strArr = {SharedPreferenceUtil.getInstance(mContext).getPlainTextAccountName()};
        if (!TextUtils.isEmpty(strArr[0])) {
            return strArr[0];
        }
        if (System.currentTimeMillis() - SharedPreferenceManager.d(Integer.toString(20000), QUERY_ACCOUNT_TIME, 0L) < 86400000) {
            return strArr[0];
        }
        SharedPreferenceManager.c(Integer.toString(20000), QUERY_ACCOUNT_TIME, System.currentTimeMillis());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThirdPartyLoginManager.getInstance().queryUserAccount(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof String)) {
                    strArr[0] = (String) obj;
                }
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a(TAG, "getAccountNameInner isOnTime:", Boolean.valueOf(countDownLatch.await(2000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "getAccountNameInner InterruptedException");
        }
        return strArr[0];
    }

    private void getPlainTextAccountNameInner(final StorageDataCallback storageDataCallback) {
        String plainTextAccountName = SharedPreferenceUtil.getInstance(mContext).getPlainTextAccountName();
        if (!TextUtils.isEmpty(plainTextAccountName)) {
            storageDataCallback.onProcessed(new StorageResult(0, plainTextAccountName));
        } else {
            ThirdPartyLoginManager.getInstance().queryUserAccount(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        storageDataCallback.onProcessed(new StorageResult(0, obj));
                    } else {
                        storageDataCallback.onProcessed(new StorageResult(-1, null));
                    }
                }
            });
        }
    }

    public boolean isKidAccount() {
        return "1".equals(getAccountInfo(1004));
    }

    public boolean isMinorAccount() {
        int iJ = CommonUtil.j(getAccountInfo(1019));
        LogUtil.a(TAG, "isMinorAccount accountTypeHms:", Integer.valueOf(iJ));
        return iJ == 1 || iJ == 2;
    }

    @Deprecated
    public String getGender() {
        return SharedPreferenceUtil.getInstance(mContext).getGender();
    }

    @Deprecated
    public String getBirthDate() {
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getBirthDate();
    }

    public String getDeviceId() {
        if ("true".equals(KeyValDbManager.d(mContext).c("key_wether_to_auth"))) {
            return CommonUtil.k(BaseApplication.getContext());
        }
        return "";
    }

    public String getDeviceType() {
        if (LoginCache.fetchDeviceType() != null) {
            return LoginCache.fetchDeviceType();
        }
        String deviceType = ContentProviderUtil.getInstance(mContext).getDeviceType();
        if (deviceType != null) {
            return deviceType;
        }
        if (getAccountInfo(1011) != null) {
            return "0";
        }
        return "-1";
    }

    public static boolean isBelowMinAge(String str) {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd").parse(str);
            Calendar calendar = Calendar.getInstance();
            if (calendar.before(date)) {
                return false;
            }
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.setTime(date);
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar.get(5);
            int i7 = i - i4;
            if (i2 <= i5 && (i2 != i5 || i3 < i6)) {
                i7--;
            }
            return i7 < getAppAllowAge();
        } catch (ParseException unused) {
            LogUtil.e(TAG, "PaseDate Exception");
            return false;
        }
    }

    public static int getAppAllowAge() {
        try {
            return Arrays.asList(BaseApplication.getContext().getResources().getStringArray(R.array.app_allow_age_18_country_code)).contains(getInstance(BaseApplication.getContext()).getAccountInfo(1010)) ? 18 : 16;
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e(TAG, "getStringArray exception ", ExceptionUtils.c(e));
            return 16;
        }
    }

    public boolean isBrowseMode() {
        return !getIsLogined();
    }

    public String getHuidOrDefault() {
        return getHuidInner();
    }

    private String getHuidInner() {
        if (isBrowseMode()) {
            return Constant.BROWSE_HUID;
        }
        return SharedPreferenceUtil.getInstance(mContext).getUserID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void browsingToLogin(String str) {
        LogUtil.a(TAG, "LoginInit.browsingToLogin to login");
        Intent intent = new Intent();
        intent.setAction("com.huawei.plugin.trigger.checklogin");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
        BrowsingBiEvent browsingBiEvent = mBrowsingBiEvent;
        if (browsingBiEvent != null) {
            browsingBiEvent.loginBeforeBiEvent(str);
        }
    }

    public void browsingToLogin(IBaseResponseCallback iBaseResponseCallback, String str) {
        ReleaseLogUtil.d(TAG, "browsingToLogin triggerKey:", str);
        if (checkBaseServiceModel()) {
            ReleaseLogUtil.d(TAG, "browsingToLogin IS_BASE_SERVICE_MODEL.");
            return;
        }
        if (!isBrowseMode()) {
            ReleaseLogUtil.d(TAG, "browsingToLogin isLogined.");
            iBaseResponseCallback.a(0, null);
        } else if (mBrowseCallback != null) {
            ReleaseLogUtil.e(TAG, "LoginInit.browsingToLogin is logging");
            iBaseResponseCallback.a(-1, null);
        } else {
            setBrowseCallback(iBaseResponseCallback);
            browsingToLogin(str);
        }
    }

    public void browsingToLoginForBaseService(IBaseResponseCallback iBaseResponseCallback, String str) {
        ReleaseLogUtil.d(TAG, "browsingToLogin triggerKey:", str);
        if (checkBaseServiceModel(iBaseResponseCallback)) {
            ReleaseLogUtil.d(TAG, "browsingToLogin IS_BASE_SERVICE_MODEL.");
            return;
        }
        if (!isBrowseMode()) {
            ReleaseLogUtil.d(TAG, "browsingToLogin isLogined.");
            iBaseResponseCallback.a(0, null);
        } else if (mBrowseCallback != null) {
            ReleaseLogUtil.e(TAG, "LoginInit.browsingToLogin is logging");
            iBaseResponseCallback.a(-1, null);
        } else {
            setBrowseCallback(iBaseResponseCallback);
            browsingToLogin(str);
        }
    }

    public static boolean checkBaseServiceModel() {
        if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            return false;
        }
        BrowsingBiEvent browsingBiEvent = mBrowsingBiEvent;
        if (browsingBiEvent != null) {
            browsingBiEvent.showFullServiceDialog(mContext);
        }
        ReleaseLogUtil.d(TAG, "checkBaseServiceModel IS_BASE_SERVICE_MODEL.");
        return true;
    }

    private static boolean checkBaseServiceModel(final IBaseResponseCallback iBaseResponseCallback) {
        if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            return false;
        }
        BrowsingBiEvent browsingBiEvent = mBrowsingBiEvent;
        if (browsingBiEvent != null) {
            browsingBiEvent.showFullServiceDialog(com.huawei.haf.application.BaseApplication.j(), new View.OnClickListener() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
        ReleaseLogUtil.d(TAG, "checkBaseServiceModel IS_BASE_SERVICE_MODEL.");
        return true;
    }

    public static void callbackAfterLoginFinish(final int i) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.login.ui.login.LoginInit.8
                @Override // java.lang.Runnable
                public void run() {
                    LoginInit.callbackAfterLoginFinish(i);
                }
            });
            return;
        }
        if (i == 1) {
            LogUtil.a(TAG, "callbackAfterLoginFinish need Reboot ");
            CommonLibUtil.d(BaseApplication.getContext());
        }
        if (mBrowseCallback != null) {
            LogUtil.a(TAG, "callbackAfterLoginFinish rescode = ", Integer.valueOf(i));
            if (getInstance(BaseApplication.getContext()).isKidAccount()) {
                mBrowseCallback.a(-1, null);
            } else {
                mBrowseCallback.a(i, null);
            }
            mBrowseCallback = null;
        }
    }

    public void setIsBrowseModeToPd(Context context, boolean z) {
        LogUtil.a(TAG, "setIsBrowseModeToPd: ", Boolean.valueOf(z));
        CommonUtil.d(z);
        KeyValDbManager.d(context).c("is_browse_mode_or_not", String.valueOf(z), null);
    }

    public static void setBrowsingBiEvent(BrowsingBiEvent browsingBiEvent) {
        mBrowsingBiEvent = browsingBiEvent;
    }

    public static BrowsingBiEvent getBrowsingBiEvent() {
        return mBrowsingBiEvent;
    }

    public static void checkHmsHasLogin() {
        LogUtil.a(TAG, "enter checkHmsHasLogin");
        checkAndTriggerLogoutIfNecessary();
        if (AccountHelper.isLogining() || !getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.LoginInit.9
            @Override // java.lang.Runnable
            public void run() {
                Context context = BaseApplication.getContext();
                if (Boolean.parseBoolean(KeyValDbManager.d(context).c("key_wether_to_auth"))) {
                    boolean zHasLoginAccount = HuaweiLoginManager.hasLoginAccount(context);
                    ReleaseLogUtil.d(LoginInit.TAG, "checkHmsHasLogin() isHmsHasLogin: ", Boolean.valueOf(zHasLoginAccount));
                    if (!zHasLoginAccount || LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
                        return;
                    }
                    LoginInit.browsingToLogin("");
                }
            }
        });
    }

    private static void checkAndTriggerLogoutIfNecessary() {
        if (CommonUtil.z(BaseApplication.getContext())) {
            ReleaseLogUtil.d(TAG, "checkHmsHasLogin isHmsLite true, return!");
            return;
        }
        final boolean isLogined = getInstance(BaseApplication.getContext()).getIsLogined();
        if (!isLogined) {
            ReleaseLogUtil.d(TAG, "checkHmsHasLogin isLogouted, return!");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.LoginInit.10
                @Override // java.lang.Runnable
                public void run() {
                    boolean zHasLoginAccount = HuaweiLoginManager.hasLoginAccount(BaseApplication.getContext());
                    ReleaseLogUtil.d(LoginInit.TAG, "checkHmsHasLogin isHmsHasLogin: ", Boolean.valueOf(zHasLoginAccount), " isLogined:", Boolean.valueOf(isLogined));
                    if (zHasLoginAccount) {
                        return;
                    }
                    HuaweiLoginManager.reportErrorCode("logoutIfNecessary", 0);
                }
            });
        }
    }

    public void setOpAnalyticsApi(OpAnalyticsApi opAnalyticsApi) {
        this.mOpAnalyticsInstance = opAnalyticsApi;
    }

    public OpAnalyticsApi getOpAnalyticsApi() {
        return this.mOpAnalyticsInstance;
    }

    public static boolean shouldLogin() {
        return CloudUtils.a() || !TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "huawei_account_login_init"));
    }

    public void getUserInfo(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter getUserInfo");
        ThirdPartyLoginManager.getInstance().m1459x26edc259(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof HiUserInfo)) {
                    iBaseResponseCallback.a(0, (HiUserInfo) obj);
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        }, false);
    }

    private static boolean isFastRefresh() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - sRefreshTime < 10000) {
            return true;
        }
        sRefreshTime = jElapsedRealtime;
        return false;
    }

    public void getUserInfoFromDb(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter getUserInfoFromDb");
        HiHealthNativeApi.a(mContext).fetchUserData(new HiCommonListener() { // from class: com.huawei.login.ui.login.LoginInit.12
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (!njy.b(obj, HiUserInfo.class)) {
                    LogUtil.j(LoginInit.TAG, "getUserInfo isListTypeMatch = false");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    LogUtil.j(LoginInit.TAG, "getUserInfo userList is null or empty");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (hiUserInfo == null) {
                    LogUtil.j(LoginInit.TAG, "getUserInfo hiUserInfo is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ReleaseLogUtil.d(LoginInit.TAG, "verify userInfo, isGenderValid: ", Boolean.valueOf(hiUserInfo.isGenderValid()), " isBirthdayValid: ", Boolean.valueOf(hiUserInfo.isBirthdayValid()), " isHeightValid: ", Boolean.valueOf(hiUserInfo.isHeightValid()), " isWeightValid: ", Boolean.valueOf(hiUserInfo.isWeightValid()));
                UserInfomation userInfomation = new UserInfomation(0);
                userInfomation.loadAccountData(hiUserInfo);
                userInfomation.loadAccountExtData(hiUserInfo);
                if (TextUtils.isEmpty(userInfomation.getPicPath()) || "default".equals(userInfomation.getPicPath())) {
                    userInfomation.setPicPath(LoginInit.this.getHeadImagePath());
                }
                iBaseResponseCallback.a(0, userInfomation);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a(LoginInit.TAG, "getUserInfo fetchUserData errorCode = ", Integer.valueOf(i), " errorMessage = ", obj);
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public UserInfomation getUserInfoFromDbSync() {
        final UserInfomation[] userInfomationArr = new UserInfomation[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        getUserInfoFromDb(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof UserInfomation)) {
                    userInfomationArr[0] = (UserInfomation) obj;
                }
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a(TAG, "getUserInfoFromDbSync isOnTime:", Boolean.valueOf(countDownLatch.await(2000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "getUserInfoFromDbSync InterruptedException");
        }
        LogUtil.a(TAG, "getUserInfoFromDbSync return userInfomation");
        if (userInfomationArr[0] == null) {
            userInfomationArr[0] = new UserInfomation(0);
            LogUtil.a(TAG, "getUserInfoFromDbSync new userInfomation");
        }
        return userInfomationArr[0];
    }

    public String getHeadImagePath() {
        String strC;
        Context context = BaseApplication.getContext();
        if (CommonUtil.z(context)) {
            strC = SharedPreferenceManager.e(context, String.valueOf(PrebakedEffectId.RT_FLY), "key_user_pic_path");
            if (TextUtils.isEmpty(strC)) {
                strC = KeyValDbManager.d(context).c("key_user_pic_path");
            }
        } else {
            String str = USER_PROFILE_HEAD_IMAGE_LOCAL_PREFIX + nio.e(getAccountInfo(1011));
            String strE = SharedPreferenceManager.e(context, String.valueOf(PrebakedEffectId.RT_FLY), str);
            strC = !TextUtils.isEmpty(strE) ? strE : KeyValDbManager.d(context).c(str);
        }
        return TextUtils.isEmpty(strC) ? "default" : strC;
    }

    public boolean isAccountConsistent() {
        if (!getIsLogined()) {
            LogUtil.a(TAG, "isAccountConsistent not login");
            return true;
        }
        if (!CommonUtil.z(mContext)) {
            LogUtil.a(TAG, "isAccountConsistent login by hms core");
            return true;
        }
        if (CommonUtil.i(mContext) == 0) {
            LogUtil.a(TAG, "isAccountConsistent not install hms core");
            return true;
        }
        LogUtil.a(TAG, "isAccountConsistent check huid start");
        final String[] strArr = {""};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HuaweiLoginManager.silentSignIn(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.LoginInit$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LoginInit.lambda$isAccountConsistent$7(strArr, countDownLatch, i, obj);
            }
        });
        try {
            LogUtil.a(TAG, "isAccountConsistent isOnTime:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "isAccountConsistent InterruptedException");
        }
        return TextUtils.isEmpty(strArr[0]) || strArr[0].equals(getAccountInfo(1011));
    }

    static /* synthetic */ void lambda$isAccountConsistent$7(String[] strArr, CountDownLatch countDownLatch, int i, Object obj) {
        if (i == 0 && (obj instanceof AuthAccount)) {
            strArr[0] = ((AuthAccount) obj).getUid();
        }
        countDownLatch.countDown();
    }

    public boolean isKoreaCountry() {
        return KOREA.equals(getAccountInfo(1010));
    }

    public boolean isJapanCountry() {
        return JAPAN.equals(getAccountInfo(1010));
    }

    public boolean isRussiaCountry() {
        return RUSSIA.equals(getAccountInfo(1010));
    }

    public String getCountryCode() {
        return SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getCountryCode();
    }

    public boolean isCanadaCountry() {
        return CANADA.equals(getAccountInfo(1010));
    }

    public String getSelectCountryCode() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_SNIPER_RIFLE), SELECT_COUNTRY);
    }

    public void setLastCountryCode() {
        lua.h(String.valueOf(20000), LAST_COUNTRY_CODE, getAccountInfo(1010));
    }

    public String getLastCountryCode() {
        return lua.d(String.valueOf(20000), LAST_COUNTRY_CODE, "");
    }
}
