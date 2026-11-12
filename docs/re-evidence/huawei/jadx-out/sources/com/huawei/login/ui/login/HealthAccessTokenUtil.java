package com.huawei.login.ui.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.common.OpAnalyticsApi;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class HealthAccessTokenUtil {
    private static final long AWAIT_TIMEOUT = 5000;
    public static final String KEY_AT = "healthAccessToken";
    public static final String KEY_AT_EXPIRE = "hwidATokenExpireTime";
    private static final String LOG_TAG = "HiH_HealthTokenUt";
    private static final int MAX_RANDOM = 8;
    private static final long MINUTE_MILL = 60000;
    private static final int MIN_RANDOM = 2;
    public static final long REFRESH_TIME = 3600000;
    private static final String RELEASE_LOG_TAG = "R_HiH_HealthTokenUt";
    private static final String TAG = "HealthTokenUt";
    private Context mContext;
    private BroadcastReceiver mLoginStatusReceiver;
    private String mUserAt;

    private HealthAccessTokenUtil() {
        this.mLoginStatusReceiver = new BroadcastReceiver() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a(HealthAccessTokenUtil.TAG, "enter mLoginStatusReceiver");
                if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                    LogUtil.a(HealthAccessTokenUtil.RELEASE_LOG_TAG, "logout");
                    HealthAccessTokenUtil.this.clearAtAndUid();
                }
            }
        };
        this.mContext = BaseApplication.getContext();
        LogUtil.a(TAG, "enter HealthAccessTokenUtil");
    }

    public void registerReceiver() {
        LogUtil.a(TAG, "enter registerReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.logout");
        BroadcastManagerUtil.d(this.mContext, this.mLoginStatusReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public void registerReceiverToGetAt() {
        registerReceiver();
        String strC = KeyValDbManager.d(this.mContext).c("key_wether_to_auth");
        LogUtil.a(RELEASE_LOG_TAG, "privacy: ", strC);
        if (Boolean.parseBoolean(strC)) {
            getAccessToken();
        }
    }

    public void unregisterReceiverToGetAt() {
        LogUtil.a(TAG, "Unregister receiver");
        this.mContext.unregisterReceiver(this.mLoginStatusReceiver);
    }

    public static HealthAccessTokenUtil getAtInstance() {
        return AtInstance.INSTANCE;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class AtInstance {
        private static final HealthAccessTokenUtil INSTANCE = new HealthAccessTokenUtil();

        private AtInstance() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAtAndUid() {
        KeyValDbManager.d(this.mContext).b(KEY_AT, "", new StorageParams(1));
    }

    private void doInBackground() {
        report("doInBackground");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.2
            @Override // java.lang.Runnable
            public void run() {
                HealthAccessTokenUtil.this.refreshAccessToken();
            }
        });
    }

    private void report(String str) {
        OpAnalyticsApi opAnalyticsApi;
        if (CommonUtil.bu()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (((jCurrentTimeMillis < timeInMillis || jCurrentTimeMillis > timeInMillis + 300000) && (jCurrentTimeMillis < timeInMillis2 || jCurrentTimeMillis > timeInMillis2 + 59999)) || (opAnalyticsApi = LoginInit.getInstance(BaseApplication.getContext()).getOpAnalyticsApi()) == null) {
            return;
        }
        opAnalyticsApi.onReport(str, DfxUtils.d(Thread.currentThread(), null));
    }

    public String refreshAccessToken() {
        LogUtil.a(RELEASE_LOG_TAG, "refreshAccessToken Sync begin");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ReleaseLogUtil.e(RELEASE_LOG_TAG, "refreshAccessToken sync method can't execute in mainThread");
        }
        return GetAccessTokenSyncHelper.getAccessTokenWithDoubleCheck();
    }

    String refreshAccessTokenInner() {
        if (!CommonUtil.bg()) {
            this.mUserAt = ThirdLoginDataStorageUtil.getAccessTokenFromDb();
        } else {
            this.mUserAt = KeyValDbManager.d(this.mContext).b(KEY_AT, new StorageParams(1));
            silentSignSync();
        }
        return this.mUserAt;
    }

    String getCachedUserAt() {
        return this.mUserAt;
    }

    void refreshAccessTokenAsync(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.3
            @Override // java.lang.Runnable
            public void run() {
                if (CommonUtil.bg()) {
                    HealthAccessTokenUtil.this.silentSignAsync(iBaseResponseCallback);
                } else {
                    ThirdPartyLoginManager.getInstance().refreshAtByRt(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.3.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (iBaseResponseCallback != null) {
                                iBaseResponseCallback.a(i, obj);
                            }
                        }
                    });
                }
            }
        });
    }

    protected String getAccessToken() {
        LogUtil.a(TAG, "enter getAccessToken");
        if (!CommonUtil.bg()) {
            return ThirdLoginDataStorageUtil.getAccessTokenFromDb();
        }
        if (GetAccessTokenSyncHelper.isCacheAtValid()) {
            ReleaseLogUtil.d(RELEASE_LOG_TAG, "getAccessToken from mmkv");
            return KeyValDbManager.d(this.mContext).b(KEY_AT, new StorageParams(1));
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return refreshAccessToken();
        }
        ReleaseLogUtil.d(RELEASE_LOG_TAG, "Is main thread, enter doInBackground");
        doInBackground();
        return KeyValDbManager.d(this.mContext).b(KEY_AT, new StorageParams(1));
    }

    private void silentSignSync() {
        LogUtil.a(RELEASE_LOG_TAG, "enter silentSignSync");
        if (!CloudUtils.a() || !LoginInit.getInstance(this.mContext).getIsLogined()) {
            LogUtil.a(TAG, "silentSignSync not login");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        report("silentSignIn");
        HuaweiLoginManager.silentSignIn(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                HealthAccessTokenUtil.this.saveAccessToken(i, obj);
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a(RELEASE_LOG_TAG, "wait silentSignIn countDown result:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e(RELEASE_LOG_TAG, "InterruptedException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void silentSignAsync(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "enter silentSignAsync");
        if (!CloudUtils.a() || !LoginInit.getInstance(this.mContext).getIsLogined()) {
            LogUtil.a(TAG, "silentSignAsync not login");
            iBaseResponseCallback.a(-1, "");
        } else {
            HuaweiLoginManager.silentSignIn(new IBaseResponseCallback() { // from class: com.huawei.login.ui.login.HealthAccessTokenUtil.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    HealthAccessTokenUtil.this.saveAccessToken(i, obj);
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(i, KeyValDbManager.d(HealthAccessTokenUtil.this.mContext).b(HealthAccessTokenUtil.KEY_AT, new StorageParams(1)));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveAccessToken(int i, Object obj) {
        long jCurrentTimeMillis = (System.currentTimeMillis() + 3600000) - getRandomUpdateTime();
        if (i != 0 || !(obj instanceof AuthAccount)) {
            LogUtil.j(RELEASE_LOG_TAG, "sign fail status errorCode: ", Integer.valueOf(i));
        } else {
            AuthAccount authAccount = (AuthAccount) obj;
            if (!TextUtils.isEmpty(authAccount.getUid())) {
                SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setUserID(authAccount.getUid());
            } else {
                ReleaseLogUtil.d(TAG, "saveAccessToken getUid is empty");
            }
            this.mUserAt = authAccount.getAccessToken();
            KeyValDbManager.d(BaseApplication.getContext()).b("server_token", this.mUserAt, new StorageParams(14));
            KeyValDbManager.d(this.mContext).b(KEY_AT, this.mUserAt, new StorageParams(1));
            KeyValDbManager.d(this.mContext).b(KEY_AT_EXPIRE, String.valueOf(jCurrentTimeMillis));
            if (TextUtils.isEmpty(this.mUserAt)) {
                LogUtil.e(RELEASE_LOG_TAG, "success: mUserAT is null");
            } else {
                String str = this.mUserAt;
                LogUtil.a(RELEASE_LOG_TAG, "success: mUserAT:", str.substring(str.length() - 4));
            }
        }
        ThirdPartyLoginManager.getInstance().timedRefreshAt(jCurrentTimeMillis);
    }

    public long getRandomUpdateTime() {
        int iNextInt = new SecureRandom().nextInt(6) + 2;
        LogUtil.a(TAG, "randomMinute:", Integer.valueOf(iNextInt));
        return ((long) (iNextInt * 60)) * 1000;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class GetAccessTokenSyncHelper {
        private static final Object sLock = new Object();

        private GetAccessTokenSyncHelper() {
        }

        static String getAccessTokenWithDoubleCheck() {
            if (!isCacheAtValid()) {
                synchronized (sLock) {
                    if (isCacheAtValid()) {
                        return HealthAccessTokenUtil.getAtInstance().getCachedUserAt();
                    }
                    LogUtil.a(HealthAccessTokenUtil.TAG, "get from the refreshAccessToken, not Cache");
                    return HealthAccessTokenUtil.getAtInstance().refreshAccessTokenInner();
                }
            }
            return HealthAccessTokenUtil.getAtInstance().getCachedUserAt();
        }

        static boolean isCacheAtValid() {
            return System.currentTimeMillis() < CommonUtil.i(KeyValDbManager.d(BaseApplication.getContext()).c(HealthAccessTokenUtil.KEY_AT_EXPIRE));
        }
    }
}
