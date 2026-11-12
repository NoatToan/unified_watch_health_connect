package com.huami.account;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.HMLogoutManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.bean.LogoutResult;
import com.huami.account.bean.LogoutSyncTask;
import com.huami.account.bean.LogoutSyncTaskKt;
import com.huami.account.di.LifecycleModuleKt;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.LogoutStateType;
import com.huami.account.ui.MutexAutoLoginActivity;
import com.huami.account.ui.MutexLoginActivity;
import com.huami.account.utils.TopActivityProvider;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import defpackage.s03;
import defpackage.z03;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HMLogoutManager {
    public static final int LOGOUT_TYPE_BOOT = 6;
    public static final int LOGOUT_TYPE_BY_USER = 1;
    public static final int LOGOUT_TYPE_BY_USER_LOGIN_MI = 6;
    public static final int LOGOUT_TYPE_CANCELLATION = 4;
    public static final int LOGOUT_TYPE_FORCE = 5;
    public static final int LOGOUT_TYPE_MUTEX = 3;
    public static final int LOGOUT_TYPE_TOKEN_EXPIRE = 2;
    public static final String PARAM_LOGIN_TIME = "login_time";
    public static final String TAG = "HMLogoutManager";

    public interface OnLogoutListener {
        void onLogoutSuccess();

        void onStartLogout(LogoutResult logoutResult);

        void onSyncDataWhenLogout();
    }

    public class a implements IAccount.Callback<String, ErrorCode> {
        public final /* synthetic */ OnLogoutListener a;
        public final /* synthetic */ FragmentActivity b;

        public a(OnLogoutListener onLogoutListener, FragmentActivity fragmentActivity) {
            this.a = onLogoutListener;
            this.b = fragmentActivity;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            Objects.requireNonNull(errorCode);
            HMLog.info(HMLogoutManager.TAG, new Function0() { // from class: y03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return errorCode.toString();
                }
            });
            FragmentActivity fragmentActivity = this.b;
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            AccountManager.getDefault(AccountExternalsKt.getAppContext()).offlineLogout(this.b);
            this.a.onLogoutSuccess();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            this.a.onLogoutSuccess();
        }
    }

    public static final class b extends AsyncTask<Void, Integer, LogoutResult> {
        private final WeakReference<FragmentActivity> a;
        private final OnLogoutListener b;

        public class a extends IHMSimpleHttpResponseHandler {
            public final /* synthetic */ WebResponse a;
            public final /* synthetic */ HMPersonInfo b;

            public a(WebResponse webResponse, HMPersonInfo hMPersonInfo) {
                this.a = webResponse;
                this.b = hMPersonInfo;
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(HMHttpResponseData hMHttpResponseData) {
                Objects.requireNonNull(hMHttpResponseData);
                HMLog.info(HMLogoutManager.TAG, new z03(hMHttpResponseData));
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
                if (hMHttpResponseData.isSuccess() && webResponse.success()) {
                    this.a.copy(webResponse);
                    this.b.saveInfoAsync(0);
                }
            }
        }

        /* JADX INFO: renamed from: com.huami.account.HMLogoutManager$b$b, reason: collision with other inner class name */
        public class C0260b extends IHMSimpleHttpResponseHandler {
            public final /* synthetic */ WebResponse a;

            public C0260b(WebResponse webResponse) {
                this.a = webResponse;
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(HMHttpResponseData hMHttpResponseData) {
                Objects.requireNonNull(hMHttpResponseData);
                HMLog.info(HMLogoutManager.TAG, new z03(hMHttpResponseData));
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
                this.a.copy(webResponse);
            }
        }

        private b(FragmentActivity fragmentActivity, OnLogoutListener onLogoutListener) {
            this.a = new WeakReference<>(fragmentActivity);
            this.b = onLogoutListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "Logout Result [start]";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "Logout Result [end]";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(LogoutResult logoutResult) {
            return "退出登录结果：" + logoutResult.getLogMessage();
        }

        private boolean h() {
            WebResponse webResponse = new WebResponse();
            HMAccountWebAPI.logoutSync(new C0260b(webResponse));
            return webResponse.success();
        }

        private boolean j() {
            WebResponse webResponse = new WebResponse();
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            if (hMPersonInfo.getUserInfo().getSynced() == 0) {
                return true;
            }
            HMAccountWebAPI.updateProfile(hMPersonInfo, true, new a(webResponse, hMPersonInfo));
            return webResponse.success();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public LogoutResult doInBackground(Void... voidArr) {
            HMLog.info(HMLogoutManager.TAG, new Function0() { // from class: com.huami.account.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLogoutManager.b.e();
                }
            });
            boolean zJ = j();
            List<LogoutSyncTask.Result.Failed> listFilterFailed = LogoutSyncTaskKt.filterFailed(LogoutSyncTaskKt.executeSyncTasks(AccountExternalsKt.getAccountDelegate().externalSyncDataActionsWhenLogout()));
            if (listFilterFailed.size() > 0) {
                return new LogoutResult.Failed.SyncData(listFilterFailed);
            }
            if (!zJ) {
                return LogoutResult.Failed.PersonInfo.INSTANCE;
            }
            HMLog.info(HMLogoutManager.TAG, new Function0() { // from class: com.huami.account.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLogoutManager.b.f();
                }
            });
            HMAccountWebAPI.uploadUserBirthday();
            if (HMLoginManager.isOldAccount()) {
                return h() ? LogoutResult.Success.INSTANCE : LogoutResult.Failed.OldAccount.INSTANCE;
            }
            return LogoutResult.Success.INSTANCE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final LogoutResult logoutResult) {
            super.onPostExecute(logoutResult);
            HMLog.info(HMLogoutManager.TAG, new Function0() { // from class: com.huami.account.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLogoutManager.b.g(logoutResult);
                }
            });
            FragmentActivity fragmentActivity = this.a.get();
            if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                return;
            }
            this.b.onStartLogout(logoutResult);
            if (logoutResult.isSuccess()) {
                HMLogoutManager.saveLocalData(fragmentActivity, this.b);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.b.onSyncDataWhenLogout();
        }
    }

    public static void dealDataIfAppRestart() {
        HMAccountKeeper.INSTANCE.saveAppRestart(true);
        MutexLoginActivity.clear();
    }

    public static void dealMutexLoginIfAppRestart() {
        final boolean zIsMutexLogin = isMutexLogin();
        HMLog.info(TAG, new Function0() { // from class: u03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMLogoutManager.j(zIsMutexLogin);
            }
        });
        if (zIsMutexLogin) {
            mutex(HMAccountKeeper.INSTANCE.getMutexTime());
        }
    }

    public static void dealWebActivityLoginInvalid(final String str) {
        try {
            HMLog.verbose(TAG, new Function0() { // from class: t03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLogoutManager.k(str);
                }
            });
            WebResponse webResponse = WebResponse.parse(str);
            int i = webResponse.code;
            if (i == 0) {
                logout(2);
            } else if (i == -1) {
                try {
                    mutex(new JSONObject(webResponse.data).getLong(PARAM_LOGIN_TIME) * 1000);
                } catch (Exception unused) {
                    logout(2);
                }
            }
        } catch (Exception unused2) {
            HMLog.info(TAG, new Function0() { // from class: w03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLogoutManager.l();
                }
            });
        }
    }

    private static void g() {
        HMLoginManager.reset();
        AccountExternalsKt.getAccountDelegate().unInitWhenLogout();
        HMDaoManager.getInstance().getDaoSession().getAlarmDao().deleteAll();
        HMDaoManager.getInstance().getDaoSession().getUserInfosDao().deleteAll();
        HMDaoManager.getInstance().getDaoSession().getConfigDao().deleteAll();
        HMDaoManager.getInstance().getDaoSession().getEarbudMusicInfoDao().deleteAll();
        HMDaoManager.getInstance().getManualDataDao().deleteAll();
        AccountExternalsKt.getAccountDelegate().clearDataExternal();
    }

    private static void h() {
        if (HMLoginManager.isOldAccount()) {
            HMAccountWebAPI.logout(null);
        } else {
            huamiAccountLogout();
        }
        p();
    }

    public static void huamiAccountLogout() {
        Activity activeActivity = TopActivityProvider.INSTANCE.getActiveActivity();
        if (activeActivity instanceof FragmentActivity) {
            try {
                AccountManager.getDefault(AccountExternalsKt.getAppContext()).offlineLogout((FragmentActivity) activeActivity);
                return;
            } catch (Exception e) {
                HMLog.verbose(TAG, new s03(e));
            }
        }
        try {
            AccountManager.getDefault(AccountExternalsKt.getAppContext()).offlineLogout();
        } catch (Exception e2) {
            HMLog.verbose(TAG, new s03(e2));
        }
    }

    private static void i() {
        h();
        AccountExternalsKt.getAccountDelegate().forceLogoutAndClearAllData();
    }

    public static boolean isMutexLogin() {
        return HMAccountKeeper.INSTANCE.isMutexLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(boolean z) {
        return "dealMutexLoginIfAppRestart:isMutexLogin=" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(String str) {
        return "dealWebActivityLoginInvalid response:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "dealWebActivityLoginInvalid error";
    }

    public static synchronized void logout(final int i) {
        HMLog.info(TAG, new Function0() { // from class: r03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMLogoutManager.m(i);
            }
        });
        boolean z = true;
        if (i != 1 && i != 6) {
            z = false;
        }
        if (!HMLoginManager.isUnInit() || z) {
            LogoutStateType logoutStateType = LogoutStateType.UNKNOWN;
            switch (i) {
                case 1:
                    p();
                    logoutStateType = LogoutStateType.BY_USER;
                    break;
                case 2:
                    h();
                    Analytics.recordEvent(new CountEventBuilder("Login_Overdue"));
                    logoutStateType = LogoutStateType.TOKEN_EXPIRE;
                    break;
                case 3:
                    h();
                    logoutStateType = LogoutStateType.MUTEX;
                    break;
                case 4:
                    i();
                    logoutStateType = LogoutStateType.CANCELLATION;
                    break;
                case 5:
                    h();
                    logoutStateType = LogoutStateType.FORCE;
                    break;
                case 6:
                    q();
                    logoutStateType = LogoutStateType.BY_USER_LOGIN_MI;
                    break;
            }
            LifecycleModuleKt.getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.Logout(logoutStateType));
            AccountExternalsKt.getAccountDelegate().afterLogoutActions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(int i) {
        return "账号登出：type=" + i + "，登出场景信息：" + Log.getStackTraceString(new Exception("logout info"));
    }

    public static synchronized void mutex(long j) {
        if (HMLoginManager.isUnInit()) {
            return;
        }
        long j2 = (j / 1000) * 1000;
        final boolean zIsForeground = AccountExternalsKt.getCommonDelegate().isForeground();
        final boolean appRestart = HMAccountKeeper.INSTANCE.getAppRestart();
        final boolean zContains = MutexLoginActivity.contains(j2);
        HMLog.info(TAG, new Function0() { // from class: v03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMLogoutManager.n(zIsForeground, appRestart, zContains);
            }
        });
        if (!zContains) {
            setIsMutexLogin(true);
            r(j2);
            AccountExternalsKt.getAccountDelegate().unInitWhenLogout();
        }
        if (zIsForeground && !appRestart && !zContains) {
            navigateToMutexLogin(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(boolean z, boolean z2, boolean z3) {
        return "isForeground:" + z + ",isAppRestart:" + z2 + ",isContains:" + z3;
    }

    public static void navigateToMutexLogin(long j) {
        Intent intent = new Intent();
        if (AccountExternalsKt.getConfigDelegate().isAutoMutexLogin()) {
            intent.setClass(AccountExternalsKt.getAppContext(), MutexAutoLoginActivity.class);
        } else {
            intent.setClass(AccountExternalsKt.getAppContext(), MutexLoginActivity.class);
        }
        intent.putExtra(MutexLoginActivity.MUTEX_TIME, j);
        intent.setFlags(268435456);
        AccountExternalsKt.getAppContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "clear all weight infos";
    }

    private static void p() {
        g();
        HMHttpDnsManager.clear();
        AccountExternalsKt.getAccountDelegate().goStartUpActivityFromLogout();
    }

    public static void processDataWhenLogout(FragmentActivity fragmentActivity, OnLogoutListener onLogoutListener) {
        new b(fragmentActivity, onLogoutListener).executeOnExecutor(Executors.newScheduledThreadPool(1), new Void[0]);
    }

    private static void q() {
        g();
        AccountExternalsKt.getAccountDelegate().goStartUpActivityLoginMi();
    }

    private static void r(long j) {
        HMAccountKeeper.INSTANCE.setMutexTime(j);
    }

    public static void saveLocalData(FragmentActivity fragmentActivity, OnLogoutListener onLogoutListener) {
        HMLog.info(TAG, new Function0() { // from class: x03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMLogoutManager.o();
            }
        });
        if (HMLoginManager.isOldAccount()) {
            onLogoutListener.onLogoutSuccess();
        } else {
            AccountManager.getDefault(AccountExternalsKt.getAppContext()).logout(fragmentActivity, new a(onLogoutListener, fragmentActivity));
        }
    }

    public static void setIsMutexLogin(boolean z) {
        HMAccountKeeper.INSTANCE.setIsMutexLogin(z);
    }
}
