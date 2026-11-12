package com.huawei.common.util;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.account.aidl.AccountAidlInfo;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LoginResultCallback;
import com.huawei.hwcommonmodel.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.third.HomeCountryInfo;
import com.huawei.login.third.ThirdPartyLoginInfo;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.login.ui.login.util.LoginResult;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AccountHelper {
    private static final String ALLOW_LOGIN_LOGINED = "1";
    private static final int CANCEL_OPEN_MAIN_PAGE = 3002;
    private static final String CURRENT_IS_NO_CLOUD_KEY = "currentIsNoCloud";
    private static final String CURRENT_IS_NO_CLOUD_VALUE = "1";
    private static final int DIALOG_USE_HWID_ACCOUNT_TYPE = 1;
    private static final int DIALOG_USE_WEAR_ACCOUNT_TYPE = 0;
    private static final int ERROR_CODE = -1;
    private static final String HEALTH_NAME = "com.huawei.health";
    private static final int HMS_LOW_VERSION_ERR = 13;
    private static final int HWID_NOT_LOGINED_TYPE = 1;
    private static final int INVALID_VALUE = -1;
    private static final int MAX_COUNT = 5;
    private static final int NEED_REBOOT = 1;
    private static final String NEED_RELOGIN = "need_relogin";
    private static final String ONE_CONSTANT = "1";
    private static final int SUCCESS_CODE = 0;
    private static final String TAG = "PLGLOGIN_AccountHelper";
    private static final String TIME_EAT_TAG = "TimeEat_MainInteractors";
    private static final int USER_CANCEL = 6;
    private static final int USER_CLOSE = 7;
    private static final int WAIT_TIME = 3;
    private static MainLoginCallBack mLoginCallBack;
    private static volatile AtomicBoolean mIsLogining = new AtomicBoolean(false);
    private static String mOldHuid = "";
    private static int mOldHuidHistory = 0;
    private static int mAccountType = 0;
    private static HiAccountInfo mHiAccountInfo = null;
    private static AccountAidlInfo mAccountAidlInfoWear = null;
    private static boolean mIsLoginnotexit = false;
    private static boolean mIsPackgeNameHuid = false;
    private static boolean mIsCloudlessNeedLogin = false;
    private static boolean mIsCheckLogining = false;
    private static boolean mIsHmsVersionOutDate = false;
    private static int mGuidType = -1;
    private static boolean mIsCloudlessTermsUpdate = false;
    private static boolean isFirstOpenApp = false;
    private static String mInvalidSt = "";

    private AccountHelper() {
    }

    public static MainLoginCallBack getLoginCallBack() {
        return mLoginCallBack;
    }

    public static void setIsFirstOpenApp(boolean z) {
        ReleaseLogUtil.d(TAG, "MigrateUserData setIsFirstOpenApp isFirstOpenApp:", Boolean.valueOf(z));
        isFirstOpenApp = z;
    }

    public static boolean compareAndSetLogining(boolean z, boolean z2) {
        boolean zCompareAndSet = mIsLogining.compareAndSet(z, z2);
        ReleaseLogUtil.d(TAG, "compareAndSetLogining expect:", Boolean.valueOf(z), " update:", Boolean.valueOf(z2), "value :", Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    public static boolean isLogining() {
        return mIsLogining.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handlerMessage(int i) {
        MainLoginCallBack mainLoginCallBack = mLoginCallBack;
        if (mainLoginCallBack == null) {
            LogUtil.e(TAG, "handlerMessage mLoginCallBack is null");
        } else {
            mainLoginCallBack.handlerMessage(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handlerPhase(int i) {
        MainLoginCallBack mainLoginCallBack = mLoginCallBack;
        if (mainLoginCallBack == null) {
            LogUtil.e(TAG, "handlerPhase mLoginCallBack is null");
        } else {
            mainLoginCallBack.handlerPhase(i);
        }
    }

    private static boolean isHmsUsableVersion(Context context) {
        MainLoginCallBack mainLoginCallBack = mLoginCallBack;
        if (mainLoginCallBack == null) {
            LogUtil.e(TAG, "isHmsUsableVersion mLoginCallBack is null");
            return false;
        }
        return mainLoginCallBack.isHmsUsableVersion(context);
    }

    private static boolean isNoAgreePrivacy(int i) {
        MainLoginCallBack mainLoginCallBack = mLoginCallBack;
        if (mainLoginCallBack == null) {
            LogUtil.e(TAG, "isNoAgreePrivacy mLoginCallBack is null");
            return true;
        }
        return mainLoginCallBack.isNoAgreePrivacy(i);
    }

    private static void browseCallback(boolean z) {
        MainLoginCallBack mainLoginCallBack = mLoginCallBack;
        if (mainLoginCallBack == null) {
            LogUtil.e(TAG, "browseCallback mLoginCallBack is null");
        } else {
            mainLoginCallBack.browseCallback(z);
        }
    }

    public static void todoCheckLogin(Context context, boolean z) {
        mOldHuidHistory = 0;
        mOldHuid = "";
        mInvalidSt = "";
        mAccountType = 0;
        mHiAccountInfo = null;
        mAccountAidlInfoWear = null;
        mIsLoginnotexit = false;
        mIsPackgeNameHuid = false;
        if ((SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false) && !z) || isDeregisteredService(context)) {
            ReleaseLogUtil.d(TAG, "todoCheckLogin initForBrowseLogin");
            initForBrowseLogin(context);
            return;
        }
        if (!CloudUtils.a() && !z) {
            ReleaseLogUtil.d(TAG, "todoCheckLogin initForNoCloudLogin");
            initForNoCloudLogin(context);
        } else if (mIsCloudlessNeedLogin || z || HuaweiLoginManager.hasLoginAccount(context) || !ThirdPartyLoginManager.getInstance().getLogoutStatus()) {
            ReleaseLogUtil.d(TAG, "todoCheckLogin initForHasCloudLogin");
            initForHasCloudLogin(context);
        } else {
            ReleaseLogUtil.d(TAG, "todoCheckLogin initForBrowseLogin else");
            initForBrowseLogin(context);
        }
    }

    private static boolean isDeregisteredService(Context context) {
        long j = CommonUtil.j(SharedPreferenceManager.e(context, Integer.toString(10000), "hw_health_start_count_key"));
        String strD = SharedPreferenceManager.d("deregistered_service_and_clean_data", "deregistered_service_and_clean_data");
        SharedPreferenceManager.a("deregistered_service_and_clean_data", "deregistered_service_and_clean_data", "");
        boolean z = j == 0 && "true".equals(strD);
        ReleaseLogUtil.d(TAG, "isDeregisteredService isDeregisteredServiceFlag=", Boolean.valueOf(z), " startCount=", Long.valueOf(j), " deregisteredServiceSp=", strD);
        return z;
    }

    private static void initForBrowseLogin(Context context) {
        LogUtil.a(TAG, "use browse mode.");
        handlerPhase(9002);
    }

    private static void initForHasCloudLogin(Context context) {
        LogUtil.a(TAG, "Utils.ifAllowLogin()：true");
        if (CommonUtil.z(context)) {
            thirdPartyLogin(context);
            return;
        }
        int healthLoginChannel = LoginInit.getInstance(context).getHealthLoginChannel();
        ReleaseLogUtil.d(TAG, "todoCheckLogin logintype = ", Integer.valueOf(healthLoginChannel));
        if (LoginInit.getInstance(context).isBrowseMode() || !getIf1login(context)) {
            ReleaseLogUtil.d(TAG, "todoCheckLogin mLoginManager.getIsLogined() = false and database not login");
            ThirdLoginDataStorageUtil.deleteAccessTokenFromDb();
            branchToLogin(context);
            return;
        }
        ReleaseLogUtil.d(TAG, "todoCheckLogin mLoginManager.getIsLogined() = false and database logined");
        if (!TextUtils.isEmpty(KeyValDbManager.d(context).b("server_token", new StorageParams(14))) && healthLoginChannel != -1 && HuaweiLoginManager.isHasLogin() && LoginInit.getInstance(BaseApplication.getContext()).getIsLogined() && SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getUpdateState()) {
            ReleaseLogUtil.d(TAG, "already logined...goto HomeFragment...");
            hiloginAndPluginInit(context);
        } else {
            branchDatabaseAlreadyLogin(context);
        }
    }

    private static void branchDatabaseAlreadyLogin(Context context) {
        branchKidWatchIsNotExist(context);
    }

    private static void branchKidWatchIsNotExist(Context context) {
        LogUtil.a(TAG, "accountmigrate: branchKidWatchIsNotExist()");
        AccountAidlInfo accountAidlInfoIsWearLogined = AccountInteractors.isWearLogined(context);
        mAccountAidlInfoWear = accountAidlInfoIsWearLogined;
        if (accountAidlInfoIsWearLogined != null) {
            LogUtil.a(TAG, "accountmigrate: branchKidWatchIsNotExist() accountAidlInfoWear != null");
            isSameHuidToHealthAndWearSteps3();
            return;
        }
        LogUtil.a(TAG, "accountmigrate: branchKidWatchIsNotExist() accountAidlInfoWear == null");
        if (!HuaweiLoginManager.hasLoginAccount(context)) {
            LogUtil.a(TAG, "accountmigrate: branchKidWatchIsNotExist() loginManager.isLoginedForHealth(mContext) = false");
            branchHwIdApkNotLogined(context);
        } else {
            LogUtil.a(TAG, "accountmigrate: branchKidWatchIsNotExist() loginManager.isLoginedForHealth(mContext) = true");
            judgeCloudAccountIsNull(context);
        }
    }

    private static void judgeCloudAccountIsNull(Context context) {
        LogUtil.a(TAG, "judgeCloudAccountIsNull to enter");
        LoginInit.login(context, new InnerLoginBaseResponseCallback());
    }

    static class InnerLoginBaseResponseCallback extends InnerHasLoginedLoginLoginCallback {
        InnerLoginBaseResponseCallback() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.d(AccountHelper.TAG, "InnerLoginBaseResponseCallback response success", obj);
            AccountHelper.jugeIsSameHuid(this.mContext, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleLoginErrorCode(Context context, int i) {
        ReleaseLogUtil.d(TAG, "handleLoginErrorCode enter: errcode = ", Integer.valueOf(i));
        if (i != -99) {
            if (i == 8 || i == 13 || i == 2012 || i == 3002) {
                if (HuaweiLoginManager.isHasLogin() || mIsCloudlessNeedLogin) {
                    handlerPhase(9002);
                }
            } else if (i == 100002) {
                handlerMessage(MainLoginCallBack.MSG_HWID_STOPED);
            } else {
                handlerMessage(MainLoginCallBack.MSG_NO_NETWORK);
            }
        }
        mIsCloudlessNeedLogin = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jugeIsSameHuid(Context context, String str, boolean z) {
        LogUtil.a(TAG, "accountmigrate: jugeIsSameHuid() enter, hasLogined = " + z);
        if (mHiAccountInfo != null) {
            LogUtil.a(TAG, "accountmigrate: jugeIsSameHuid response hiAccountInfo != null");
            if (!str.equals(mHiAccountInfo.getHuid())) {
                LogUtil.a(TAG, "accountmigrate: jugeIsSameHuid response !strHuid.equals(oldHuid) judge is kidwatch exist");
                branchNoKidLogin(1);
                return;
            } else {
                LogUtil.a(TAG, "accountmigrate: jugeIsSameHuid response strHuid.equals(oldHuid),login...");
                hmsHasLoginedLogin(context, z);
                return;
            }
        }
        LogUtil.a(TAG, "accountmigrate: jugeIsSameHuid response accountInfo == null hiAccountInfo == null");
        hmsHasLoginedLogin(context, z);
    }

    private static void hmsHasLoginedLogin(Context context, boolean z) {
        LogUtil.a(TAG, "accountmigrate: hmsHasLoginedLogin(),hasLogined = " + z);
        clearAccountForWear(context);
        if (z) {
            processLoginSuc(context);
        } else {
            LoginInit.login(context, new InnerHmsHasLoginCallback());
        }
    }

    static class InnerHmsHasLoginCallback extends InnerHasLoginedLoginLoginCallback {
        InnerHmsHasLoginCallback() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LoginInit.callbackAfterLoginFinish(0);
            super.onLoginSuccess(obj);
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginFailed(Object obj) {
            LoginInit.callbackAfterLoginFinish(-1);
            super.onLoginFailed(obj);
        }
    }

    static class InnerHasLoginedLoginLoginCallback implements ILoginCallback {
        private static final String GRL_PREFIX = "GRL-";
        protected Context mContext = BaseApplication.getContext();

        InnerHasLoginedLoginLoginCallback() {
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "=====login onLoginSuccess=====");
            String str = TextUtils.isEmpty(Build.MODEL) ? "unknown" : Build.MODEL;
            if (SharedPreferenceUtil.isSameAsLastLoginSiteId() && !AccountHelper.isKidAccountNeedReboot()) {
                AccountHelper.processLoginSuc(this.mContext);
                return;
            }
            boolean zD = SystemInfo.d();
            boolean zIsGrlPhoneFullyUnfolded = isGrlPhoneFullyUnfolded(BaseApplication.getContext());
            boolean zStartsWith = str.startsWith("GRL-");
            if (zD && zIsGrlPhoneFullyUnfolded && zStartsWith) {
                ReleaseLogUtil.d(AccountHelper.TAG, "enter rebootDelayMillis");
                CommonLibUtil.c(BaseApplication.getContext());
            } else {
                ReleaseLogUtil.d(AccountHelper.TAG, "enter reboot");
                CommonLibUtil.d(BaseApplication.getContext());
            }
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginFailed(Object obj) {
            if (obj instanceof LoginResult) {
                int errorCode = ((LoginResult) obj).getErrorCode();
                LogUtil.a(AccountHelper.TAG, getClass().getSimpleName() + " login errcode = ", Integer.valueOf(errorCode));
                AccountHelper.handleLoginErrorCode(this.mContext, errorCode);
            }
        }

        private boolean isGrlPhoneFullyUnfolded(Context context) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (windowManager == null) {
                return false;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.heightPixels / displayMetrics.widthPixels;
            LogUtil.a(AccountHelper.TAG, "isGrlPhoneFullyUnfolded: ratio = " + f);
            return f < 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processLoginSuc(final Context context) {
        LogUtil.a(TAG, "enter processLoginSuc():");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.common.util.AccountHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (AccountHelper.mOldHuidHistory == 1 && !AccountHelper.mOldHuid.equals(LoginInit.getInstance(context).getAccountInfo(1011))) {
                    LogUtil.a(AccountHelper.TAG, "accountmigrate: hmsHasLoginedLogin() oldHuid not equals ");
                    AccountHelper.handlerMessage(8000);
                }
                Context context2 = context;
                AccountHelper.loginByAccountType(context2, LoginInit.getInstance(context2).getLoginByHWid());
            }
        });
    }

    public static void loginByAccountType(Context context, int i) {
        LogUtil.a(TAG, "accountmigrate: loginByAccountType accounttype = ", Integer.valueOf(i));
        if (i == LoginInit.getInstance(context).getLoginByVersionTwo()) {
            setAccountInfoForVersionTwo(context);
        } else if (i == LoginInit.getInstance(context).getLoginByWear()) {
            setAccountInfoForWear(context);
        } else if (i == LoginInit.getInstance(context).getLoginByHWid()) {
            SharedPreferenceManager.e(context, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN, "0", new StorageParams(0));
            setNeedNoteRelogin(false);
        }
        LoginInit.getInstance(context).setHealthLoginChannel(i);
        LogUtil.d(TAG, "accountmigrate: loginByAccountType logined and init other and huid is ", LoginInit.getInstance(context).getAccountInfo(1011));
        hiloginAndPluginInit(context);
    }

    private static void setAccountInfoForVersionTwo(Context context) {
        LoginInit.getInstance(context).setAccountInfo(1011, mHiAccountInfo.getHuid(), null);
        LoginInit.getInstance(context).setAccountInfo(1007, mHiAccountInfo.getAccessToken(), null);
        LoginInit.getInstance(context).setAccountInfo(1013, mHiAccountInfo.getServiceToken(), null);
        LoginInit.getInstance(context).setIsLogined(true);
        LoginInit.getInstance(context).setAccountInfo(1009, String.valueOf(mHiAccountInfo.getSiteId()), null);
        LogUtil.d(TAG, "accountmigrate: loginByAccountType hiAccountInfo siteId = " + mHiAccountInfo.getSiteId());
        SharedPreferenceManager.e(context, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN, "1", new StorageParams(0));
        setNeedNoteRelogin(true);
    }

    private static void setAccountInfoForWear(Context context) {
        LogUtil.d(TAG, "accountmigrate: loginByAccountType = 3 accountWear = " + mAccountAidlInfoWear.toString());
        LoginInit.getInstance(context).setAccountInfo(1011, mAccountAidlInfoWear.getHuid(), null);
        LoginInit.getInstance(context).setAccountInfo(1007, mAccountAidlInfoWear.getAccessToken(), null);
        LoginInit.getInstance(context).setAccountInfo(1013, mAccountAidlInfoWear.getServeToken(), null);
        if (mAccountAidlInfoWear.getSitId() != null) {
            try {
                int i = Integer.parseInt(mAccountAidlInfoWear.getSitId());
                LogUtil.d(TAG, "accountmigrate: loginByAccountType = 3 accountWear siteId 1111= ", Integer.valueOf(i));
                setSiteIdByWear(context, i);
            } catch (NumberFormatException unused) {
                LogUtil.e(TAG, "accountmigrate: loginByAccountType error and siteId NumberFormatException");
            }
        } else {
            LogUtil.e(TAG, "accountmigrate: loginByAccountType error and getSitId == null");
        }
        LoginInit.getInstance(context).setIsLogined(true);
        StorageParams storageParams = new StorageParams(0);
        SharedPreferenceManager.e(context, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN, "1", storageParams);
        setNeedNoteRelogin(true);
        SharedPreferenceManager.e(context, Integer.toString(10015), "is_use_wear_login", "1", storageParams);
    }

    private static void setSiteIdByWear(final Context context, int i) {
        LogUtil.a(TAG, "accountmigrate: setSiteIdByWear() enter");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LoginInit.getInstance(context).setAccountInfo(1009, String.valueOf(i), new StorageDataCallback() { // from class: com.huawei.common.util.AccountHelper.2
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                LogUtil.d(AccountHelper.TAG, "accountmigrate: loginByAccountType = 3 accountWear siteId 222 = ", LoginInit.getInstance(context).getAccountInfo(1009));
                Context context2 = context;
                HuaweiLoginManager.updateAppTypeBySiteID(CommonUtil.n(context2, LoginInit.getInstance(context2).getAccountInfo(1009)));
                AccountHelper.countDownInner(countDownLatch);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "accountmigrate: 2.0isLogin InterruptedException e = ", e.getMessage());
        }
        LogUtil.a(TAG, "accountmigrate: setSiteIdByWear() end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void countDownInner(CountDownLatch countDownLatch) {
        try {
            countDownLatch.countDown();
        } catch (UnsupportedOperationException unused) {
            countDownLatch.countDown();
        }
    }

    private static void setNeedNoteRelogin(boolean z) {
        LogUtil.a(TAG, "setNeedNoteRelogin:", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1007), NEED_RELOGIN, String.valueOf(z), null);
    }

    private static void clearAccountForWear(Context context) {
        LogUtil.a(TAG, "accountmigrate: clearAccountForWear()");
        SharedPreferenceManager.e(context, Integer.toString(10015), "wear_is_support", "0", new StorageParams(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void branchNoKidLogin(int i) {
        LogUtil.a(TAG, "accountmigrate: branchNoKidLogin(int type) type = ", Integer.valueOf(i));
        if (i == 0) {
            handlerMessage(8001);
        } else {
            handlerMessage(8002);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void branchHwIdApkNotLogined(Context context) {
        LogUtil.a(TAG, "accountmigrate: branchHwIdApkNotLogined()");
        boolean zIsInstallHwIdApk = AccountInteractors.isInstallHwIdApk(context);
        LogUtil.a(TAG, "accountmigrate: branchHwIdApkNotLogined() isInstallHwIdApk = ", Boolean.valueOf(zIsInstallHwIdApk));
        if (zIsInstallHwIdApk) {
            branchMobileHwid(context, 1);
        } else {
            branchGuidUserDownLoadHms(context, 2);
        }
    }

    public static void branchGuidUserDownLoadHms(Context context, int i) {
        LogUtil.a(TAG, "branchGuidUserDownLoadHMS() type = ", Integer.valueOf(i));
        if (CommonUtil.v(context) || AccountInteractors.isInstallHwIdApk(context)) {
            LogUtil.a(TAG, "googlePlay version = ", false);
            processHmsByChinaRom(context, i);
            return;
        }
        LogUtil.a(TAG, "isChinaRom else");
        mGuidType = i;
        if (getDownloadHmsTryCnt(context) >= 5) {
            startUserSelectForResult(context, true, null);
        } else {
            handlerMessage(MainLoginCallBack.MSG_SHOW_HMS_DIALOG);
        }
    }

    public static void startUserSelectForResult(Context context, boolean z, MainLoginCallBack mainLoginCallBack) {
        LogUtil.a(TAG, "startUserSelectForResult.needShowAgain = " + z);
        if (z) {
            VersionIsCloud.setIfNeedShowAreaAlert(context, "1");
            setDownloadHmsTryCnt(context, 0);
        }
        if (EnvironmentInfo.t() && !EnvironmentInfo.k()) {
            LogUtil.a(TAG, "isTaiwanRom with taiwan sim");
            VersionIsCloud.setIfNeedShowAreaAlert(context, "0");
            if (LoginInit.getCloudapi().isOverseaJudgeByCountry("TW")) {
                HuaweiLoginManager.setIsAllowedLoginValueToDB(context, "1");
                LogUtil.a(TAG, "judgeIfInAccountArea ACCOUNT_AREA!");
            } else {
                HuaweiLoginManager.setCloudVersion("0", null);
                HuaweiLoginManager.setIsAllowedLoginValueToDB(context, "0");
                LogUtil.a(TAG, "judgeIfInAccountArea NO_ACCOUNT_AREA!");
            }
            checkLoginInner(context);
            return;
        }
        if (mainLoginCallBack != null) {
            mLoginCallBack = mainLoginCallBack;
        }
        handlerPhase(9001);
    }

    public static void checkLogin(Context context, MainLoginCallBack mainLoginCallBack) {
        mLoginCallBack = mainLoginCallBack;
        checkLoginInner(context);
    }

    private static void checkLoginInner(Context context) {
        ReleaseLogUtil.d(TIME_EAT_TAG, "Enter checkLogin");
        LogUtil.a(TAG, "accountmigrate: checkLogin()");
        if (CommonUtil.ca()) {
            LogUtil.a(TAG, "StoreDemo init login");
            HuaweiLoginManager.updateAppTypeBySiteID(1);
            ThirdPartyLoginInfo thirdPartyLoginInfo = new ThirdPartyLoginInfo();
            thirdPartyLoginInfo.setUid("420086000103796452");
            thirdPartyLoginInfo.setNationalCode("CN");
            thirdPartyLoginInfo.setAccessToken("0042008600010379645296e4b2457898036aeba1e69875df8d01b9b5b9f456e197d0b67605cc8bd7d1db");
            thirdPartyLoginInfo.setSiteId(1);
            if (CommonUtil.cc()) {
                HomeCountryInfo homeCountryInfo = new HomeCountryInfo();
                homeCountryInfo.setHomeCountryCode("CN");
                homeCountryInfo.setNationalCode("CN");
                homeCountryInfo.setSrvNationalCode("CN");
                homeCountryInfo.setSiteId(1);
                ThirdPartyLoginManager.getInstance().saveHomeCountryInfo(homeCountryInfo, true, null);
                ThirdPartyLoginManager.getInstance().saveUserLoginInfoV2(thirdPartyLoginInfo, true);
            } else {
                ThirdPartyLoginManager.getInstance().saveUserLoginInfo(thirdPartyLoginInfo, true);
            }
            hiloginAndPluginInit(context);
        } else {
            if (!mIsHmsVersionOutDate && !CommonUtil.z(context) && !isHmsUsableVersion(context)) {
                handlerMessage(MainLoginCallBack.MSG_HMS_VERSION_ERROR);
                mIsHmsVersionOutDate = true;
                return;
            }
            judgeIfShowLoginAlert(context);
        }
        ReleaseLogUtil.d(TIME_EAT_TAG, "Leave checkLogin");
    }

    private static void judgeIfShowLoginAlert(Context context) {
        if (!isNoCloudNeedLogin(context)) {
            ReleaseLogUtil.d(TAG, "judgeIfShowLoginAlert: has cloud go to login");
            handlerPhase(9000);
            return;
        }
        ReleaseLogUtil.d(TAG, "judgeIfShowLoginAlert: no cloud go to login");
        mIsCloudlessTermsUpdate = false;
        SharedPreferenceManager.e(context, Integer.toString(10008), CURRENT_IS_NO_CLOUD_KEY, "1", null);
        SharedPreferenceManager.e(context, Integer.toString(10015), "neverMigrateData", String.valueOf(true), null);
        if (isNeedShowHwIdNotLogin(context, VersionIsCloud.getIfAllowLoginByMcc(context))) {
            ReleaseLogUtil.d(TAG, "judgeIfShowLoginAlert: need show hwid account not login");
            handlerMessage(MainLoginCallBack.MSG_HWID_ACCOUNT_NOT_LOGIN);
        } else {
            handlerPhase(9000);
        }
    }

    private static boolean isNeedShowHwIdNotLogin(Context context, String str) {
        boolean zHasLoginAccount;
        if (!"1".equals(str) && !checkServiceAreaSelect(context)) {
            return false;
        }
        if (CommonUtil.z(context)) {
            zHasLoginAccount = !ThirdPartyLoginManager.getInstance().getLogoutStatus();
        } else {
            zHasLoginAccount = HuaweiLoginManager.hasLoginAccount(context);
        }
        LogUtil.a(TAG, "isNeedShowHwIdNotLogin: isHmsHasLogin= ", Boolean.valueOf(zHasLoginAccount));
        return !zHasLoginAccount;
    }

    private static boolean checkServiceAreaSelect(Context context) {
        return LoginInit.getCloudapi().isOverseaJudgeByCountry(SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"));
    }

    private static boolean isNoCloudNeedLogin(Context context) {
        boolean zA = CloudUtils.a();
        ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin isAllowLogin ", Boolean.valueOf(zA));
        if (zA) {
            ReleaseLogUtil.e(TAG, "isNoCloudNeedLogin isAllowLogin");
            return false;
        }
        if (getValueFromSp(context, "if_need_set_account_login_entry")) {
            ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin getValueFromSpk");
            return false;
        }
        if (!mIsCloudlessTermsUpdate && isNoAgreePrivacy(0)) {
            ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin isNoAgreePrivacy");
            return false;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
        int siteIdByCountry = LoginInit.getCloudapi().getSiteIdByCountry(accountInfo);
        ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin countryCode ", accountInfo, " siteId ", Integer.valueOf(siteIdByCountry));
        if (siteIdByCountry == 0) {
            ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin siteId, NO_CLOUD_SITE_ID");
            return false;
        }
        boolean zIsNoAgreePrivacy = isNoAgreePrivacy(siteIdByCountry);
        ReleaseLogUtil.d(TAG, "isNeverAgreePrivacy= ", Boolean.valueOf(zIsNoAgreePrivacy));
        if (!LoginInit.getInstance(context).isKoreaCountry() || zIsNoAgreePrivacy || !isOverseaCountry(context, accountInfo)) {
            return zIsNoAgreePrivacy;
        }
        ReleaseLogUtil.d(TAG, "isNoCloudNeedLogin isKoreaCountry.");
        return true;
    }

    private static boolean isOverseaCountry(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] stringArray = context.getResources().getStringArray(R.array.eu_national_code);
        ReleaseLogUtil.d(TAG, "isOverseaJudgeByCountry paraCountry=", str);
        for (String str2 : stringArray) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getValueFromSp(Context context, String str) {
        return "1".equals(SharedPreferenceManager.e(context, Integer.toString(10015), str));
    }

    public static void setDownloadHmsTryCnt(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_download_hms_try_count", Integer.toString(i), new StorageParams(0));
    }

    public static int getDownloadHmsTryCnt(Context context) {
        return CommonUtil.n(context, SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_download_hms_try_count"));
    }

    private static void processHmsByChinaRom(Context context, int i) {
        LoginInit.login(context, new InnerProcessHmsByChinaRom(context, i));
    }

    static class InnerProcessHmsByChinaRom implements ILoginCallback {
        private final Context mContext;
        private final int mType;

        InnerProcessHmsByChinaRom(Context context, int i) {
            this.mContext = context;
            this.mType = i;
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "branchGuidUserDownLoadHMS() onLoginSuccess");
            int i = this.mType;
            if (i == 1) {
                AccountHelper.branchCheckIsLoginForHealth(this.mContext);
            } else if (i == 2) {
                AccountHelper.branchHwIdApkNotLogined(this.mContext);
            } else {
                LogUtil.j(AccountHelper.TAG, "onLoginSuccess unknow type = ", Integer.valueOf(i));
            }
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginFailed(Object obj) {
            int errorCode = ((LoginResult) obj).getErrorCode();
            LogUtil.a(AccountHelper.TAG, "branchGuidUserDownLoadHMS() errcode = ", Integer.valueOf(errorCode));
            if (errorCode == 3002) {
                LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "branchGuidUserDownLoadHMS() errcode == ERROR_OPER_CANCEL");
            } else if (errorCode == 100002) {
                AccountHelper.handlerMessage(MainLoginCallBack.MSG_HWID_STOPED);
            } else {
                if (CommonUtil.ab(this.mContext)) {
                    return;
                }
                AccountHelper.handlerMessage(MainLoginCallBack.MSG_NO_NETWORK);
            }
        }
    }

    private static void setTypeInSp(Context context, StorageParams storageParams, int i) {
        if (i == 1) {
            SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_login_exit_hms_apk", "1", storageParams);
        } else if (i == 2) {
            SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_login_exit_hms_apk", "2", storageParams);
        }
    }

    public static void branchCheckIsLoginForHealth(Context context) {
        LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth() enter");
        if (HuaweiLoginManager.hasLoginAccount(context)) {
            LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) = true");
            if (!mIsLoginnotexit) {
                LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) not loginnote exit");
                hmsHasLoginedLogin(context, false);
                return;
            } else {
                LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) loginnote exit");
                branchToMobileHwid(context);
                return;
            }
        }
        LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) = false");
        if (HuaweiLoginManager.checkIsInstallHuaweiAccount(context)) {
            LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth checkIsInstallHuaweiAccount = true");
            branchToMobileHwid(context);
        } else {
            LogUtil.a(TAG, "accountmigrate: branchCheckIsLoginForHealth checkIsInstallHuaweiAccount = false");
            branchGuidUserDownLoadHms(context, 1);
        }
    }

    private static void branchToMobileHwid(Context context) {
        LogUtil.a(TAG, "accountmigrate: branchToMobileHwid()");
        clearAccountForWear(context);
        mIsCheckLogining = true;
        LoginInit.login(context, new InnerBranchToMobileHwid());
    }

    static class InnerBranchToMobileHwid extends InnerHasLoginedLoginLoginCallback {
        InnerBranchToMobileHwid() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "=====login onLoginSuccess=====");
            boolean unused = AccountHelper.mIsCheckLogining = false;
            boolean unused2 = AccountHelper.mIsLoginnotexit = false;
            if (AccountHelper.isNeedDoCallBack(0, false)) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.common.util.AccountHelper.InnerBranchToMobileHwid.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AccountHelper.mOldHuidHistory == 1 && !AccountHelper.mOldHuid.equals(LoginInit.getInstance(InnerBranchToMobileHwid.this.mContext).getAccountInfo(1011)) && !"com.huawei.health".equals(AccountHelper.mOldHuid)) {
                            LogUtil.a(AccountHelper.TAG, "accountmigrate: branchToMobileHwid() oldHuid not equals ");
                            AccountHelper.handlerMessage(8000);
                        }
                        AccountHelper.loginByAccountType(InnerBranchToMobileHwid.this.mContext, LoginInit.getInstance(InnerBranchToMobileHwid.this.mContext).getLoginByHWid());
                    }
                });
            }
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginFailed(Object obj) {
            boolean unused = AccountHelper.mIsCheckLogining = false;
            boolean unused2 = AccountHelper.mIsLoginnotexit = false;
            AccountHelper.isNeedDoCallBack(-1, false);
            super.onLoginFailed(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean isNeedDoCallBack(int i, boolean z) {
        if (i == -1) {
            LoginInit.callbackAfterLoginFinish(-1);
            return true;
        }
        IBaseResponseCallback browseCallback = LoginInit.getBrowseCallback();
        if (!z && (browseCallback instanceof LoginResultCallback) && ((LoginResultCallback) browseCallback).isNeedWait()) {
            LogUtil.a(TAG, "doCallBack() needWaitHiLogin.");
            return true;
        }
        handlerPhase(9005);
        ?? r2 = (!SharedPreferenceUtil.isSameAsLastLoginSiteId() || isKidAccountNeedReboot()) ? 1 : 0;
        browseCallback(r2);
        handlerPhase(9006);
        LoginInit.callbackAfterLoginFinish(r2);
        return r2 ^ 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isKidAccountNeedReboot() {
        if (!LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()) {
            LogUtil.a(TAG, "not minor account");
            return false;
        }
        if (SharedPreferenceManager.b(Integer.toString(10000), "kid_account_reboot_before", false)) {
            return false;
        }
        LogUtil.a(TAG, "need reboot.");
        SharedPreferenceManager.a(Integer.toString(10000), "kid_account_reboot_before", true);
        return true;
    }

    public static void branchMobileHwid(Context context, int i) {
        LogUtil.a(TAG, "accountmigrate: branchMobileHwid(final int type) enter type = ", Integer.valueOf(i));
        if (i == 0) {
            LoginInit.login(context, new InnerHwIdLoginedType());
        } else if (i == 1) {
            LoginInit.login(context, new InnerNotHwIdLoginedType());
        } else {
            LogUtil.j(TAG, "branchMobileHwid unknow type = ", Integer.valueOf(i));
        }
    }

    static class InnerNotHwIdLoginedType extends InnerHasLoginedLoginLoginCallback {
        InnerNotHwIdLoginedType() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "accountmigrate: branchMobileHwid(final int type) onLoginSuccess");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.common.util.AccountHelper.InnerNotHwIdLoginedType.1
                @Override // java.lang.Runnable
                public void run() {
                    HiAccountInfo hiAccountInfo = AccountHelper.mHiAccountInfo;
                    if (hiAccountInfo == null) {
                        return;
                    }
                    LogUtil.a(AccountHelper.TAG, "accountmigrate: branchMobileHwid hiAccountInfo != null");
                    String huid = hiAccountInfo.getHuid();
                    LoginInit loginInit = LoginInit.getInstance(InnerNotHwIdLoginedType.this.mContext);
                    if (loginInit != null && huid != null && huid.equals(loginInit.getAccountInfo(1011))) {
                        LogUtil.a(AccountHelper.TAG, "accountmigrate: branchMobileHwid hiAccountInfo huid equals mLoginManager Huid");
                        AccountHelper.loginByAccountType(InnerNotHwIdLoginedType.this.mContext, LoginInit.getInstance(InnerNotHwIdLoginedType.this.mContext).getLoginByHWid());
                    } else {
                        LogUtil.a(AccountHelper.TAG, "accountmigrate: branchMobileHwid hiAccountInfo huid not equals mLoginManager Huid");
                        AccountHelper.branchNoKidLogin(1);
                    }
                }
            });
        }
    }

    static class InnerHwIdLoginedType extends InnerHasLoginedLoginLoginCallback {
        InnerHwIdLoginedType() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "accountmigrate: branchMobileHwid(final int type) hmsHasLoginedLogin onLoginSuccess");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.common.util.AccountHelper.InnerHwIdLoginedType.1
                @Override // java.lang.Runnable
                public void run() {
                    AccountHelper.loginByAccountType(InnerHwIdLoginedType.this.mContext, LoginInit.getInstance(InnerHwIdLoginedType.this.mContext).getLoginByHWid());
                    AccountHelper.handlerPhase(9004);
                }
            });
        }
    }

    private static void isSameHuidToHealthAndWearSteps3() {
        LogUtil.a(TAG, "accountmigrate: isSameHuidToHealthAndWearSteps3()");
        branchNoKidLogin(0);
    }

    private static void branchToLogin(Context context) {
        LogUtil.a(TAG, "accountmigrate: branchToLogin()");
        AccountAidlInfo accountAidlInfoIsWearLogined = AccountInteractors.isWearLogined(context);
        mAccountAidlInfoWear = accountAidlInfoIsWearLogined;
        if (accountAidlInfoIsWearLogined != null) {
            LogUtil.d(TAG, "accountmigrate: branchToLogin() accountAidlInfoWear = ", accountAidlInfoIsWearLogined, "invalidST = ", mInvalidSt);
            LogUtil.d(TAG, "accountmigrate: branchToLogin accountAidlInfoWear != null huid is ", mAccountAidlInfoWear.getHuid());
            LogUtil.a(TAG, "accountmigrate: branchToLogin accountAidlInfoWear != null");
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20008), "migrate_timeout_s_key");
            if (mInvalidSt.equals(mAccountAidlInfoWear.getServeToken()) || (!TextUtils.isEmpty(strE) && strE.equals(mAccountAidlInfoWear.getServeToken()))) {
                LogUtil.a(TAG, "accountmigrate: branchToLogin accountAidlInfoWear != null and invalid st");
                branchCheckIsLoginForHealth(context);
                return;
            }
            LogUtil.a(TAG, "accountmigrate: branchToLogin accountAidlInfoWear != null valid st");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20008), "migrate_timeout_s_key", "", new StorageParams(1));
            if (mOldHuidHistory == 1 && !mOldHuid.equals(mAccountAidlInfoWear.getHuid())) {
                LogUtil.a(TAG, "accountmigrate: branchToLogin accountAidlInfoWear != null oldHuid not equals(accountAidlInfoWear.getHuid())");
                handlerMessage(8000);
            }
            loginByAccountType(context, LoginInit.getInstance(context).getLoginByWear());
            return;
        }
        LogUtil.a(TAG, "accountmigrate: AccountInteractors.isWearLogined() = false");
        branchCheckIsLoginForHealth(context);
    }

    private static boolean getIf1login(Context context) {
        boolean[] zArr = {false};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HiCommonListenerImplThird hiCommonListenerImplThird = new HiCommonListenerImplThird(countDownLatch, zArr);
        CommonUtil.d(TIME_EAT_TAG, "Enter getIf1login, start to fetchAccountInfo");
        HiAccountInfo hiAccountInfoRestoreAccountInfo = AccountInteractors.restoreAccountInfo(context);
        if (hiAccountInfoRestoreAccountInfo != null) {
            hiCommonListenerImplThird.onSuccess(0, hiAccountInfoRestoreAccountInfo);
        } else {
            HiHealthManager.d(context).fetchAccountInfo(hiCommonListenerImplThird);
        }
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "accountmigrate: 2.0isLogin InterruptedException e = ", e.getMessage());
        }
        if (zArr[0]) {
            return true;
        }
        CommonUtil.d(TIME_EAT_TAG, "Leave getIf1login with accountType = " + mAccountType);
        return false;
    }

    static class HiCommonListenerImplThird implements HiCommonListener {
        private boolean[] mIsLogin;
        private CountDownLatch mLatch;

        HiCommonListenerImplThird(CountDownLatch countDownLatch, boolean[] zArr) {
            this.mLatch = countDownLatch;
            this.mIsLogin = zArr;
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success");
            if (AccountHelper.mAccountType == 1) {
                LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success accountType=1");
                if (this.mLatch != null) {
                    LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange", "fetchAccountInfo success accountType=1 mLatch != null");
                    AccountHelper.countDownInner(this.mLatch);
                    return;
                }
                return;
            }
            if (obj instanceof HiAccountInfo) {
                HiAccountInfo unused = AccountHelper.mHiAccountInfo = (HiAccountInfo) obj;
                LogUtil.d(AccountHelper.TAG, "accountmigrate: getIf1login hiAccountInfo huid = ", AccountHelper.mHiAccountInfo.getHuid(), " st = ", AccountHelper.mHiAccountInfo.getServiceToken(), " sitid = ", Integer.valueOf(AccountHelper.mHiAccountInfo.getSiteId()));
                int unused2 = AccountHelper.mAccountType = 2;
                this.mIsLogin[0] = true;
                int unused3 = AccountHelper.mOldHuidHistory = 1;
                String unused4 = AccountHelper.mOldHuid = AccountHelper.mHiAccountInfo.getHuid();
                LogUtil.d(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo huid is : ", AccountHelper.mHiAccountInfo.getHuid(), " oldHuid = ", AccountHelper.mOldHuid);
                if ("com.huawei.health".equals(AccountHelper.mOldHuid)) {
                    LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo else branch");
                    boolean unused5 = AccountHelper.mIsPackgeNameHuid = true;
                    if (BaseApplication.getContext().getDatabasePath("health_cloud.db").exists()) {
                        LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo if branch");
                        this.mIsLogin[0] = false;
                        HiAccountInfo unused6 = AccountHelper.mHiAccountInfo = null;
                        int unused7 = AccountHelper.mOldHuidHistory = 0;
                        String unused8 = AccountHelper.mOldHuid = "";
                    }
                }
                AccountHelper.countDownInner(this.mLatch);
                CommonUtil.d(AccountHelper.TIME_EAT_TAG, "fetchAccountInfo success");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            HiAccountInfo unused = AccountHelper.mHiAccountInfo = null;
            LogUtil.a(AccountHelper.TAG, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo data == null");
            this.mIsLogin[0] = false;
            AccountHelper.countDownInner(this.mLatch);
        }
    }

    private static void thirdPartyLogin(final Context context) {
        LogUtil.a(TAG, "enter thirdPartyLogin");
        if (!CommonUtil.ab(context)) {
            LoginInit.callbackAfterLoginFinish(-1);
            handlerMessage(MainLoginCallBack.MSG_NO_NETWORK);
            return;
        }
        if (LoginInit.getInstance(context).getIsLogined()) {
            getIf1login(context);
        }
        ThirdPartyLoginManager thirdPartyLoginManager = ThirdPartyLoginManager.getInstance();
        String refreshTicket = SharedPreferenceUtil.getInstance(context).getRefreshTicket();
        if (thirdPartyLoginManager.isRefreshTokenOverTime() || TextUtils.isEmpty(refreshTicket)) {
            compareAndSetLogining(true, false);
            LogUtil.a(TAG, "enter isRtOverTime");
            LoginInit.login(context, new ThirdPartyLoginCallBack(context));
        } else if (ThirdLoginDataStorageUtil.isAccessTokenOverTime()) {
            LogUtil.a(TAG, "enter isAtOverTime");
            thirdPartyLoginManager.refreshAtByRt(new IBaseResponseCallback() { // from class: com.huawei.common.util.AccountHelper.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        AccountHelper.hiloginAndPluginInit(context);
                    } else {
                        AccountHelper.handlerMessage(MainLoginCallBack.MSG_NO_NETWORK);
                        LogUtil.j(AccountHelper.TAG, "refreshAtByRt failed");
                    }
                }
            });
        } else {
            hiloginAndPluginInit(context);
        }
    }

    static class ThirdPartyLoginCallBack implements ILoginCallback {
        private Context mContext;

        ThirdPartyLoginCallBack(Context context) {
            this.mContext = context;
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            if (AccountHelper.isNeedDoCallBack(0, false)) {
                AccountHelper.hiloginAndPluginInit(this.mContext);
            }
        }

        @Override // com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginFailed(Object obj) {
            if (obj instanceof LoginResult) {
                int errorCode = ((LoginResult) obj).getErrorCode();
                if (errorCode == 6 || errorCode == 7) {
                    LogUtil.j(AccountHelper.TAG, "thirdPartyPhoneLogin user close");
                    AccountHelper.isNeedDoCallBack(-1, false);
                    boolean unused = AccountHelper.mIsCloudlessNeedLogin = false;
                    AccountHelper.handlerPhase(9002);
                    return;
                }
                LoginInit.callbackAfterLoginFinish(-1);
                HandlerCenter.a().d(new Runnable() { // from class: com.huawei.common.util.AccountHelper$ThirdPartyLoginCallBack$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccountHelper.handlerMessage(MainLoginCallBack.MSG_NO_NETWORK);
                    }
                }, 100L);
                LogUtil.j(AccountHelper.TAG, "thirdPartyPhoneLogin failed");
            }
        }
    }

    private static void initForNoCloudLogin(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(20000), "huawei_account_login_init");
        LogUtil.a(TAG, "loginFlag：", strE);
        if (TextUtils.isEmpty(strE)) {
            handlerPhase(MainLoginCallBack.PHASE_NOCLOUD_NOLOGIN);
        }
        Intent intent = new Intent("com.huawei.plugin.account.login");
        intent.setPackage(BaseApplication.getAppPackage());
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
        if (context != null) {
            context.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
        hiloginAndPluginInit(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hiloginAndPluginInit(Context context) {
        CommonUtil.d(TIME_EAT_TAG, "Enter hiloginAndPluginInit");
        boolean zA = CloudUtils.a();
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        ReleaseLogUtil.d(TAG, "hiloginAndPluginInit isAllowedLogin:", Boolean.valueOf(zA), " isLogined:", Boolean.valueOf(isLogined));
        if (zA && isLogined && !CommonUtil.ca()) {
            LogUtil.a(TAG, "siteId=: ", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
            if (isNeedAuth(context, LoginInit.getInstance(context).getAccountInfo(1004))) {
                handlerPhase(9003);
            } else {
                handlerPhase(9002);
            }
        } else {
            handlerPhase(9002);
        }
        CommonUtil.d(TIME_EAT_TAG, "Leave hiloginAndPluginInit");
    }

    private static boolean isNeedAuth(Context context, String str) {
        LogUtil.a(TAG, "enter isNeedAuth.", str);
        if (!"1".equals(str)) {
            LogUtil.a(TAG, "isNoNeedAuth: adult No need auth");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "hw_health_show_grant_pwd");
        LogUtil.a(TAG, "judgeIsKidAndNeedAuth guardianHasAuth:", strE);
        return !"1".equals(strE);
    }

    public static void updateAccountInfo(Context context) {
        LoginInit.login(context, new InnerUpdateAccountInfo());
    }

    static class InnerUpdateAccountInfo extends InnerHasLoginedLoginLoginCallback {
        InnerUpdateAccountInfo() {
        }

        @Override // com.huawei.common.util.AccountHelper.InnerHasLoginedLoginLoginCallback, com.huawei.login.ui.login.util.ILoginCallback
        public void onLoginSuccess(Object obj) {
            LogUtil.a(AccountHelper.TAG, "updateAccountInfo onLoginSuccess");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.common.util.AccountHelper.InnerUpdateAccountInfo.1
                @Override // java.lang.Runnable
                public void run() {
                    AccountHelper.loginByAccountType(InnerUpdateAccountInfo.this.mContext, LoginInit.getInstance(InnerUpdateAccountInfo.this.mContext).getLoginByHWid());
                }
            });
        }
    }

    public static String getOldHid() {
        return mOldHuid;
    }

    public static int getOldHidHistory() {
        return mOldHuidHistory;
    }

    public static int getAccountType() {
        return mAccountType;
    }

    public static HiAccountInfo getHiAccountInfo() {
        return mHiAccountInfo;
    }

    public static AccountAidlInfo getAccountAidlInfoWear() {
        return mAccountAidlInfoWear;
    }

    public static void setLoginnotexit(boolean z) {
        mIsLoginnotexit = z;
    }

    public static boolean getIsPackgeNameHuid() {
        return mIsPackgeNameHuid;
    }

    public static void setIsNoCloudNeedLogin(boolean z) {
        mIsCloudlessNeedLogin = z;
    }

    public static boolean getIsCheckLogining() {
        return mIsCheckLogining;
    }

    public static void setIsHmsVersionOutDate(boolean z) {
        mIsHmsVersionOutDate = z;
    }

    public static int getGuidType() {
        return mGuidType;
    }

    public static void setIsNoCloudTermsUpdate(boolean z) {
        mIsCloudlessTermsUpdate = z;
    }

    public static boolean isNeedShowMigrateDataDig(String str) {
        ReleaseLogUtil.d(TAG, "isNeedShowMigrateDataDig enter. isFirstOpenApp= ", Boolean.valueOf(isFirstOpenApp));
        Context context = BaseApplication.getContext();
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            ReleaseLogUtil.d(TAG, "isNeedShowMigrateDataDig no login or no cloud.");
            return false;
        }
        if (isFirstOpenApp) {
            isFirstOpenApp = false;
            SharedPreferenceManager.e(context, Integer.toString(10015), "neverMigrateData", String.valueOf(false), null);
            return false;
        }
        boolean z = Boolean.parseBoolean(SharedPreferenceManager.e(context, Integer.toString(10015), "neverMigrateData"));
        ReleaseLogUtil.d(TAG, "isNeedShowMigrateDataDig isNeverMigrateData= ", Boolean.valueOf(z));
        if (!z) {
            return false;
        }
        boolean z2 = Boolean.parseBoolean(SharedPreferenceManager.e(context, Integer.toString(10015), "hasRemindMigrateData"));
        ReleaseLogUtil.d(TAG, "isNeedShowMigrateDataDig hasRemindMigrateData= ", Boolean.valueOf(z2));
        return !z2;
    }
}
