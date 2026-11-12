package com.huawei.login.huaweilogin;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.common.util.Utils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.login.ui.login.util.LoginResult;
import com.huawei.login.ui.login.util.ScopeManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import health.compact.a.UnitUtil;
import health.compact.a.VersionDbManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiLoginManager {
    private static final String ACCOUNT_SDK_API_ERROR_CODE = "80070011";
    private static final int DEFAULT_SCOPES_SIZES = 64;
    private static final Set<Integer> ERROR_CODE_NOT_RETRY_SET;
    private static final String KEY_API_NAME = "apiName";
    private static final String KEY_ERROR_CODE = "errorCode";
    private static final String KEY_HWID_VERSION = "hwid";
    private static final String KEY_IS_LITE = "isHmsLite";
    private static final String PROVIDER_CONTENT = "content://com.huawei.hwid.api.provider/has_login";
    private static final String RELEASE_LOG_TAG = "R_PLGLOGIN_HwLoginMgr";
    private static final long SIGN_IN_INTERVAL = 10000;
    private static final String TAG = "PLGLOGIN_HwLoginMgr";
    private static final int TIME_OUT = 3;
    private static volatile boolean hasLogin;
    private static int lastSiteId;
    private static volatile long sSignInTimestamp;
    private static final AtomicInteger CALLBACK_INDEX = new AtomicInteger(-536870912);
    private static final Map<Integer, ILoginCallback> LOGIN_CALLBACK_MAP = new ConcurrentHashMap();

    static {
        HashSet hashSet = new HashSet();
        ERROR_CODE_NOT_RETRY_SET = hashSet;
        hasLogin = false;
        lastSiteId = -123;
        sSignInTimestamp = 0L;
        hashSet.add(2007);
        hashSet.add(2009);
    }

    private HuaweiLoginManager() {
    }

    public static HuaweiLoginManager getInstance() {
        return Instance.INSTANCE;
    }

    public static void informHiDataLoginSuccess(Context context) {
        LogUtil.a(TAG, "ST timeout but has login success again ");
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
        HiHealthNativeApi.a(context).hiLogin(hiAccountInfo, new HiCommonListener() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(HuaweiLoginManager.TAG, "inform HiData login onSuccess.");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(HuaweiLoginManager.TAG, "hiLogin failed errCode:", Integer.valueOf(i), "errorMsg:", obj);
            }
        });
    }

    public void logout() {
        AccountAuthManager.getService(BaseApplication.getContext(), new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setAuthorizationCode().createParams()).signOut().addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.4
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Void r2) {
                ReleaseLogUtil.c(HuaweiLoginManager.RELEASE_LOG_TAG, "signOut success");
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.3
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                ReleaseLogUtil.c(HuaweiLoginManager.RELEASE_LOG_TAG, "signOut fail");
            }
        }).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.2
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task) {
                ReleaseLogUtil.c(HuaweiLoginManager.RELEASE_LOG_TAG, "signOut complete");
            }
        });
    }

    public static boolean checkIsInstallHuaweiAccount(Context context) {
        LogUtil.a(TAG, "Enter checkIsInstallHuaweiAccount");
        if (CommonUtil.ca()) {
            LogUtil.a(TAG, "StoreDemo no check hms");
            return true;
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(HMSPackageManager.getInstance(context).getHMSPackageName(), 128) != null;
            LogUtil.a(TAG, "checkIsInstallHuaweiAccount: ", Boolean.valueOf(z));
            return z;
        } catch (PackageManager.NameNotFoundException | SecurityException e) {
            LogUtil.j(TAG, "checkIsInstallHuaweiAccount ", e.getClass().getName());
            return false;
        }
    }

    public static boolean isHasLogin() {
        return hasLogin;
    }

    public static void setHasLogin(boolean z) {
        hasLogin = z;
    }

    public static boolean hasLoginAccount(final Context context) {
        LogUtil.a(TAG, "enter hasLoginAccount():");
        if (!checkIsInstallHuaweiAccount(context)) {
            LogUtil.a(TAG, "huid sdk is not exit ,return false.");
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.5
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor = null;
                try {
                    try {
                        try {
                            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(HuaweiLoginManager.PROVIDER_CONTENT), new String[]{"hasLogin"}, null, null, null);
                            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("hasLogin"));
                                LogUtil.a(HuaweiLoginManager.TAG, "result = ", Integer.valueOf(i));
                                if (i == 1) {
                                    HuaweiLoginManager.setHasLogin(true);
                                } else {
                                    HuaweiLoginManager.setHasLogin(false);
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            countDownLatch.countDown();
                        } catch (Throwable th) {
                            if (0 != 0) {
                                cursor.close();
                            }
                            try {
                                countDownLatch.countDown();
                            } catch (Exception unused) {
                                countDownLatch.countDown();
                            }
                            throw th;
                        }
                    } catch (Exception unused2) {
                        LogUtil.e(HuaweiLoginManager.TAG, "hasLoginAccount, Exception");
                        HuaweiLoginManager.setHasLogin(false);
                        if (0 != 0) {
                            cursor.close();
                        }
                        countDownLatch.countDown();
                    }
                } catch (Exception unused3) {
                    countDownLatch.countDown();
                }
            }
        });
        handleTimeout(countDownLatch);
        ReleaseLogUtil.c(RELEASE_LOG_TAG, "hasLoginAccount:", Boolean.valueOf(isHasLogin()));
        return isHasLogin() && !SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
    }

    private static void handleTimeout(CountDownLatch countDownLatch) {
        boolean zAwait;
        try {
            zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "InterruptedException e = ", e.getMessage());
            zAwait = false;
        }
        if (zAwait) {
            return;
        }
        LogUtil.e(TAG, "hasLoginAccount isOutTime:", Boolean.valueOf(zAwait));
        setHasLogin(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loginFailed(int i, ILoginCallback iLoginCallback) {
        ReleaseLogUtil.c(TAG, "loginFailed error, code is:", Integer.valueOf(i));
        if (iLoginCallback != null) {
            iLoginCallback.onLoginFailed(new LoginResult(i));
        }
    }

    public static void updateLoginTypeByCountry(Context context, String str) {
        if (LoginInit.getCloudapi().isOverseaJudgeByCountry(str)) {
            setIsAllowedLoginValueToDB(context, "1");
            LogUtil.a(TAG, "updateLoginTypeByCountry: isAllowedLogin() true");
        } else {
            setIsAllowedLoginValueToDB(context, "0");
            LogUtil.a(TAG, "updateLoginTypeByCountry: isAllowedLogin() false");
        }
    }

    public static void updateAppTypeBySiteID(final int i) {
        LogUtil.a(TAG, "updateAppTypeBySiteID_siteId ");
        LogUtil.d(TAG, "siteId = ", Integer.valueOf(i));
        if (i != 0) {
            LogUtil.a(TAG, "updateAppTypeBySiteID siteId != defaultSiteId");
            LogUtil.d(TAG, "siteId =", Integer.valueOf(i));
            if (lastSiteId == i) {
                LogUtil.a(TAG, "updateAppTypeBySiteID lastSiteId == siteId");
                return;
            }
            if (i == 1 && !CommonUtil.cj()) {
                LogUtil.a(TAG, "updateAppTypeBySiteID: CHINA_SITE");
                setCloudVersion("1", new StorageDataCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.6
                    @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                    public void onProcessed(StorageResult storageResult) {
                        if (storageResult.b() == 0) {
                            int unused = HuaweiLoginManager.lastSiteId = i;
                            LogUtil.a(HuaweiLoginManager.TAG, "setCloudVersion HAVE_CLOUD, onProcessed success");
                            LogUtil.d(HuaweiLoginManager.TAG, "setCloudVersion HAVE_CLOUD, onProcessed ", "success，lastSiteId =", Integer.valueOf(HuaweiLoginManager.lastSiteId));
                            return;
                        }
                        LogUtil.a(HuaweiLoginManager.TAG, "setCloudVersion HAVE_CLOUD,onProcessed fail");
                    }
                });
            } else {
                LogUtil.a(TAG, "updateAppTypeBySiteID: NOT CHINA_SITE");
                setCloudVersion("0", new StorageDataCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.7
                    @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                    public void onProcessed(StorageResult storageResult) {
                        if (storageResult.b() == 0) {
                            int unused = HuaweiLoginManager.lastSiteId = i;
                            LogUtil.a(HuaweiLoginManager.TAG, "setCloudVersion NO_CLOUD,, onProcessed success");
                            LogUtil.d(HuaweiLoginManager.TAG, "lastSiteId =", Integer.valueOf(HuaweiLoginManager.lastSiteId));
                            return;
                        }
                        LogUtil.a(HuaweiLoginManager.TAG, "setCloudVersion NO_CLOUD,, onProcessed fail");
                    }
                });
            }
        }
    }

    public static void setCloudVersion(final String str, final StorageDataCallback storageDataCallback) {
        LogUtil.a(TAG, "Health APP setCloudVersion = ", str);
        VersionDbManager.b(BaseApplication.getContext()).d("have_cloud_or_not", str, new StorageDataCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.8
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult.b() == 0) {
                    UnitUtil.a(str);
                    CommonUtil.ab(str);
                    if (BaseApplication.getContext() != null) {
                        LogConfig.a(BaseApplication.getContext());
                        CommonUtil.j(BaseApplication.getContext(), str);
                    }
                }
                StorageDataCallback storageDataCallback2 = storageDataCallback;
                if (storageDataCallback2 != null) {
                    storageDataCallback2.onProcessed(storageResult);
                }
            }
        });
    }

    public static void setIsAllowedLoginValueToDB(Context context, final String str) {
        VersionDbManager.b(context).d("allow_login_or_not", str, new StorageDataCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.9
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult.b() == 0) {
                    CommonUtil.aa(str);
                    if (BaseApplication.getContext() != null) {
                        if ("0".equals(str)) {
                            HiDataUpdateOption hiDataUpdateOption = new HiDataUpdateOption();
                            hiDataUpdateOption.setType(101);
                            HiHealthManager.d(BaseApplication.getContext()).updateHiHealthData(hiDataUpdateOption, new HiDataOperateListener() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.9.1
                                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                                public void onResult(int i, Object obj) {
                                    LogUtil.a(HuaweiLoginManager.TAG, "setIsAllowedLoginValueToDB: default user ", "onResult errorCode = ", Integer.valueOf(i));
                                }
                            });
                        }
                        CommonUtil.l(BaseApplication.getContext(), str);
                        return;
                    }
                    return;
                }
                LogUtil.a(HuaweiLoginManager.TAG, "setValue KEY_UI_ID_IS_ALLOW_LOGIN_OR_NOT faied!! ", Integer.valueOf(storageResult.b()));
            }
        });
    }

    private void saveTokenInfo(AuthAccount authAccount) {
        LogUtil.a(TAG, "saveTokenInfo enter");
        String accessToken = authAccount.getAccessToken();
        if (TextUtils.isEmpty(accessToken)) {
            ReleaseLogUtil.d(RELEASE_LOG_TAG, "saveTokenInfo accessToken is null!");
            return;
        }
        Context context = BaseApplication.getContext();
        LoginInit.getInstance(context).setAccountInfo(1011, authAccount.getUid(), null);
        if (CommonUtil.cc()) {
            SharedPreferenceUtil.getInstance(context).setCountryCode(authAccount.getServiceCountryCode());
        } else {
            SharedPreferenceUtil.getInstance(context).setCountryCode(authAccount.getCountryCode());
        }
        KeyValDbManager.d(BaseApplication.getContext()).b("server_token", accessToken, new StorageParams(14));
        KeyValDbManager.d(context).b(HealthAccessTokenUtil.KEY_AT, accessToken, new StorageParams(1));
        long jCurrentTimeMillis = (System.currentTimeMillis() + 3600000) - HealthAccessTokenUtil.getAtInstance().getRandomUpdateTime();
        KeyValDbManager.d(context).b(HealthAccessTokenUtil.KEY_AT_EXPIRE, String.valueOf(jCurrentTimeMillis));
        ThirdPartyLoginManager.getInstance().timedRefreshAt(jCurrentTimeMillis);
        SharedPreferenceUtil.getInstance(context).setUpdateState();
    }

    public void hmsHasLogined(final ILoginCallback iLoginCallback, final boolean z) {
        final int andIncrement = CALLBACK_INDEX.getAndIncrement();
        Map<Integer, ILoginCallback> map = LOGIN_CALLBACK_MAP;
        map.put(Integer.valueOf(andIncrement), iLoginCallback);
        LogUtil.a(TAG, "LOGIN_CALLBACK_MAP size:", Integer.valueOf(map.size()));
        silentSignIn(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0 || !(obj instanceof AuthAccount)) {
                    ReleaseLogUtil.d(HuaweiLoginManager.RELEASE_LOG_TAG, "silentSignIn failed. errCode:", Integer.valueOf(i));
                    if (z || (i != 2002 && i != 907135003)) {
                        HuaweiLoginManager.this.loginFailed(i, iLoginCallback);
                        HuaweiLoginManager.LOGIN_CALLBACK_MAP.remove(Integer.valueOf(andIncrement));
                        return;
                    } else {
                        HuaweiLoginManager.this.hmsNotLogined(andIncrement);
                        return;
                    }
                }
                ReleaseLogUtil.c(HuaweiLoginManager.RELEASE_LOG_TAG, "silentSignIn success.");
                HuaweiLoginManager.this.m1457x1ca9b287((AuthAccount) obj, iLoginCallback, andIncrement);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queryAndSaveLoginInfo, reason: merged with bridge method [inline-methods] */
    public void m1457x1ca9b287(AuthAccount authAccount, final ILoginCallback iLoginCallback, final int i) {
        if (CommonUtil.bg()) {
            saveTokenInfo(authAccount);
            Utils.initGrs(Utils.getCountryCode(), BaseApplication.getContext());
            ThirdPartyLoginManager.getInstance().m1459x26edc259(new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        HuaweiLoginManager.this.loginFailed(i2, iLoginCallback);
                    } else {
                        ILoginCallback iLoginCallback2 = iLoginCallback;
                        if (iLoginCallback2 != null) {
                            iLoginCallback2.onLoginSuccess(0);
                        }
                    }
                    HuaweiLoginManager.LOGIN_CALLBACK_MAP.remove(Integer.valueOf(i));
                }
            }, true);
        } else {
            String authorizationCode = authAccount.getAuthorizationCode();
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setAuthCode(authorizationCode);
            ThirdPartyLoginManager.getInstance().getAtByAuthCode(authorizationCode, false, new IBaseResponseCallback() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.12
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        HuaweiLoginManager.this.loginFailed(i2, iLoginCallback);
                    } else {
                        SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setUpdateState();
                        ILoginCallback iLoginCallback2 = iLoginCallback;
                        if (iLoginCallback2 != null) {
                            iLoginCallback2.onLoginSuccess(0);
                        }
                    }
                    HuaweiLoginManager.LOGIN_CALLBACK_MAP.remove(Integer.valueOf(i));
                }
            });
        }
    }

    public static void silentSignIn(final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.c(TAG, "silentSignIn enter.");
        AccountAuthService service = null;
        if (!NetworkUtil.h() || isSignInInterval()) {
            ReleaseLogUtil.d(TAG, "silentSignIn no network or in interval");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        String[] scopeList = ScopeManager.getScopeList();
        ArrayList arrayList = new ArrayList(64);
        for (String str : scopeList) {
            arrayList.add(new Scope(str));
        }
        AccountAuthParams accountAuthParamsCreateParams = new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setScopeList(arrayList).setAuthorizationCode().setAccessToken().setUid().setMobileNumber().setProfile().setEmail().setId().createParams();
        ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
        try {
            service = AccountAuthManager.getService(BaseApplication.getContext(), accountAuthParamsCreateParams);
        } catch (VerifyError e) {
            ReleaseLogUtil.b(TAG, "silentSignIn VerifyError: ", e.getMessage());
        }
        if (service == null) {
            ReleaseLogUtil.d(TAG, "AccountAuthService is null ");
            return;
        }
        if (!CommonUtil.bu()) {
            reportErrorCode("silentSignInTotal", 0);
        }
        service.silentSignIn().addOnSuccessListener(threadPoolManagerC, new OnSuccessListener<AuthAccount>() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.14
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(AuthAccount authAccount) {
                ReleaseLogUtil.c(HuaweiLoginManager.TAG, "silentSignIn success!");
                LogUtil.d(HuaweiLoginManager.TAG, "authAccount:", authAccount);
                iBaseResponseCallback.a(0, authAccount);
            }
        }).addOnFailureListener(threadPoolManagerC, new OnFailureListener() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager.13
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                if (exc instanceof ApiException) {
                    int statusCode = ((ApiException) exc).getStatusCode();
                    ReleaseLogUtil.b(HuaweiLoginManager.TAG, "silentSignIn failed status:", Integer.valueOf(statusCode));
                    if (HuaweiLoginManager.ERROR_CODE_NOT_RETRY_SET.contains(Integer.valueOf(statusCode))) {
                        long unused = HuaweiLoginManager.sSignInTimestamp = SystemClock.elapsedRealtime();
                    }
                    iBaseResponseCallback.a(statusCode, null);
                    HuaweiLoginManager.reportErrorCode("silentSignIn", statusCode);
                }
            }
        });
    }

    public static void reportErrorCode(String str, int i) {
        ReleaseLogUtil.c(TAG, "reportErrorCode apiName=", str, " errorCode:", Integer.valueOf(i));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apiName", str);
        linkedHashMap.put("errorCode", String.valueOf(i));
        int i2 = CommonUtil.i(BaseApplication.getContext());
        boolean z = CommonUtil.z(BaseApplication.getContext());
        linkedHashMap.put(KEY_HWID_VERSION, String.valueOf(i2));
        linkedHashMap.put(KEY_IS_LITE, String.valueOf(z));
        ReleaseLogUtil.c(TAG, "reportErrorCode isInstallHmsPackage packageInfo=", Integer.valueOf(i2), " isHmsLite:", Boolean.valueOf(z));
        OpAnalyticsApi opAnalyticsApi = LoginInit.getInstance(BaseApplication.getContext()).getOpAnalyticsApi();
        if (opAnalyticsApi != null) {
            opAnalyticsApi.reportErrorCode(ACCOUNT_SDK_API_ERROR_CODE, linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hmsNotLogined(int i) {
        Context context = BaseApplication.getContext();
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.putExtra("requestCode", 6009);
        intent.putExtra("callbackIndex", i);
        intent.setClassName(context, "com.huawei.health.HuaweiLoginActivity");
        context.startActivity(intent);
    }

    public void handleLoginRequest(Intent intent, final int i) {
        Map<Integer, ILoginCallback> map = LOGIN_CALLBACK_MAP;
        final ILoginCallback iLoginCallback = map.get(Integer.valueOf(i));
        if (intent == null) {
            ReleaseLogUtil.b(TAG, "handleLoginRequest: data is null!");
            loginFailed(2012, iLoginCallback);
            reportErrorCode("nonSilentSignIn", 2012);
            map.remove(Integer.valueOf(i));
            return;
        }
        Task<AuthAccount> authResultFromIntent = AccountAuthManager.parseAuthResultFromIntent(intent);
        if (authResultFromIntent != null && authResultFromIntent.isSuccessful()) {
            final AuthAccount result = authResultFromIntent.getResult();
            ReleaseLogUtil.c(TAG, "handleLoginRequest success! account: ", result);
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.huaweilogin.HuaweiLoginManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1457x1ca9b287(result, iLoginCallback, i);
                }
            });
            return;
        }
        if (authResultFromIntent != null && (authResultFromIntent.getException() instanceof ApiException)) {
            int statusCode = ((ApiException) authResultFromIntent.getException()).getStatusCode();
            loginFailed(statusCode, iLoginCallback);
            reportErrorCode("nonSilentSignIn", statusCode);
        } else {
            ReleaseLogUtil.b(TAG, "handleLoginRequest: authAccountTask is null!");
            loginFailed(-1, iLoginCallback);
            reportErrorCode("nonSilentSignIn", -1);
        }
        map.remove(Integer.valueOf(i));
    }

    static class Instance {
        private static final HuaweiLoginManager INSTANCE = new HuaweiLoginManager();

        private Instance() {
        }
    }

    private static boolean isSignInInterval() {
        if (SystemClock.elapsedRealtime() - sSignInTimestamp > 10000) {
            return false;
        }
        LogUtil.a(TAG, "signIn in interval");
        return true;
    }
}
