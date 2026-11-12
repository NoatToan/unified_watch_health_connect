package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccount;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccountFuture;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccountResult;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccountType;
import com.xiaomi.accountsdk.guestaccount.data.ServiceArgument;
import com.xiaomi.accountsdk.utils.AccountLogger;

/* JADX INFO: loaded from: classes6.dex */
class GuestAccountManagerImplApp extends GuestAccountManager {
    private static final String TAG = "GuestAccountManagerApp";
    private static volatile GuestAccountManagerImplApp sInstance;
    private GuestAccountBackupUtil backupUtil;
    private final GuestAccountType guestAccountType;
    private final GuestAccountOnlineFetcher onlineFetcher;
    private final GuestAccountStorage storage;

    public abstract class OnlineRunnable implements Runnable {
        private final GuestAccountFuture future = new GuestAccountFuture();

        public OnlineRunnable() {
        }

        public GuestAccountFuture executeOnNonUiThread() {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(this);
            } else {
                run();
            }
            return this.future;
        }

        public abstract GuestAccountResult registerOrLogin();

        @Override // java.lang.Runnable
        public void run() {
            GuestAccountResult guestAccountResultRegisterOrLogin = registerOrLogin();
            GuestAccount guestAccount = guestAccountResultRegisterOrLogin.getGuestAccount();
            if (guestAccount == null) {
                this.future.setServerData(guestAccountResultRegisterOrLogin);
                return;
            }
            if (GuestAccountManagerImplApp.checkPassToken(guestAccount)) {
                GuestAccountManagerImplApp.this.storage.savePassToken(GuestAccountManagerImplApp.this.applicationContext, guestAccount);
            }
            if (GuestAccountManagerImplApp.checkServiceToken(guestAccount)) {
                GuestAccountManagerImplApp.this.storage.saveServiceToken(GuestAccountManagerImplApp.this.applicationContext, guestAccount);
                this.future.setServerData(guestAccountResultRegisterOrLogin);
            } else {
                if (TextUtils.isEmpty(guestAccount.callback)) {
                    this.future.setServerData(guestAccountResultRegisterOrLogin);
                    return;
                }
                GuestAccountResult guestAccountResultVisitSts = GuestAccountManagerImplApp.this.onlineFetcher.visitSts(guestAccount);
                GuestAccount guestAccount2 = guestAccountResultVisitSts.getGuestAccount();
                if (GuestAccountManagerImplApp.checkServiceToken(guestAccount2)) {
                    GuestAccountManagerImplApp.this.storage.saveServiceToken(GuestAccountManagerImplApp.this.applicationContext, guestAccount2);
                }
                this.future.setServerData(guestAccountResultVisitSts);
            }
        }
    }

    private GuestAccountManagerImplApp(Context context, GuestAccountType guestAccountType) {
        this(context, guestAccountType, new GuestAccountOnlineFetcher(context.getApplicationContext()), new GuestAccountStorage());
    }

    public static boolean checkPassToken(GuestAccount guestAccount) {
        return (guestAccount == null || TextUtils.isEmpty(guestAccount.userId) || TextUtils.isEmpty(guestAccount.cUserId) || TextUtils.isEmpty(guestAccount.passToken)) ? false : true;
    }

    public static boolean checkServiceToken(GuestAccount guestAccount) {
        return (guestAccount == null || TextUtils.isEmpty(guestAccount.userId) || TextUtils.isEmpty(guestAccount.cUserId) || TextUtils.isEmpty(guestAccount.serviceToken) || TextUtils.isEmpty(guestAccount.security) || TextUtils.isEmpty(guestAccount.slh) || TextUtils.isEmpty(guestAccount.ph)) ? false : true;
    }

    public static synchronized GuestAccountManagerImplApp getInstance(Context context, GuestAccountType guestAccountType) {
        try {
            if (sInstance == null) {
                sInstance = new GuestAccountManagerImplApp(context, guestAccountType);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    private GuestAccountFuture internalGetGuestAccount(boolean z, final ServiceArgument serviceArgument) {
        if (z) {
            this.storage.removeServiceToken(this.applicationContext, serviceArgument.getSid());
        }
        final GuestAccount guestAccount = this.storage.getGuestAccount(this.applicationContext, serviceArgument.getSid());
        if (checkServiceToken(guestAccount)) {
            GuestAccountFuture guestAccountFuture = new GuestAccountFuture();
            guestAccountFuture.setServerData(new GuestAccountResult().setGuestAccount(guestAccount));
            AccountLogger.log(TAG, "getGuestAccount from cache");
            return guestAccountFuture;
        }
        if (checkPassToken(guestAccount)) {
            AccountLogger.log(TAG, "getGuestAccount from login");
            return new OnlineRunnable() { // from class: com.xiaomi.accountsdk.guestaccount.GuestAccountManagerImplApp.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountManagerImplApp.OnlineRunnable
                public GuestAccountResult registerOrLogin() {
                    GuestAccountResult guestAccountResultLoginByPassToken = GuestAccountManagerImplApp.this.onlineFetcher.loginByPassToken(guestAccount, null);
                    GuestAccount guestAccount2 = guestAccountResultLoginByPassToken.getGuestAccount();
                    if (guestAccount2 != null) {
                        guestAccountResultLoginByPassToken.setGuestAccount(guestAccount2.copyWithNewType(guestAccount.type));
                    }
                    return guestAccountResultLoginByPassToken;
                }
            }.executeOnNonUiThread();
        }
        AccountLogger.log(TAG, "getGuestAccount from register");
        return new OnlineRunnable() { // from class: com.xiaomi.accountsdk.guestaccount.GuestAccountManagerImplApp.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountManagerImplApp.OnlineRunnable
            public GuestAccountResult registerOrLogin() {
                return GuestAccountManagerImplApp.this.onlineFetcher.registerGuestAccount(GuestAccountManagerImplApp.this.guestAccountType, serviceArgument.getSid(), serviceArgument.getCallback(), serviceArgument.getPSid());
            }
        }.executeOnNonUiThread();
    }

    @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountManager
    public GuestAccountFuture getGuestAccountImpl(ServiceArgument serviceArgument, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        return internalGetGuestAccount(false, serviceArgument);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountManager
    public GuestAccountFuture getStoredUserIdImpl(ServiceArgument serviceArgument) {
        GuestAccountFuture guestAccountFuture = new GuestAccountFuture();
        guestAccountFuture.setServerData(new GuestAccountResult().setGuestAccount(this.storage.getGuestAccount(this.applicationContext)));
        return guestAccountFuture;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void injectBackupUtil(GuestAccountBackupUtil guestAccountBackupUtil) {
        this.backupUtil = guestAccountBackupUtil;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void injectHardwareInfoFetcher(GuestAccountHardwareInfoFetcher guestAccountHardwareInfoFetcher) {
        this.onlineFetcher.setHardwareInfoFetcher(guestAccountHardwareInfoFetcher);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void injectHttpRequester(GuestAccountHttpRequester guestAccountHttpRequester) {
        this.onlineFetcher.setRequest(guestAccountHttpRequester);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void onXiaomiAccountCTAAllowed() {
    }

    @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountManager
    public GuestAccountFuture renewServiceTokenImpl(ServiceArgument serviceArgument, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        return internalGetGuestAccount(true, serviceArgument);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void restoreFromBackup() {
        AccountLogger.log(TAG, "restoreFromBackup called.");
        if (this.backupUtil == null) {
            AccountLogger.log(TAG, "null backup util. Bail.");
            return;
        }
        try {
            if (getStoredUserId().get().getGuestAccount() != null) {
                AccountLogger.log(TAG, "already has account. Can not restore. Bail.");
                return;
            }
            GuestAccount guestAccountLoadGuestAccount = this.backupUtil.loadGuestAccount();
            if (checkPassToken(guestAccountLoadGuestAccount)) {
                this.storage.savePassToken(this.applicationContext, guestAccountLoadGuestAccount);
            } else {
                AccountLogger.log(TAG, "fail to checkPassToken. Can not restore from backup. Bail.");
            }
        } catch (InterruptedException e) {
            AccountLogger.log(TAG, e);
        }
    }

    @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountManager
    public void saveToBackup() {
        if (this.backupUtil == null) {
            AccountLogger.log(TAG, "null backup util. Bail.");
            return;
        }
        GuestAccount guestAccount = this.storage.getGuestAccount(this.applicationContext);
        if (checkPassToken(guestAccount)) {
            this.backupUtil.saveGuestAccount(guestAccount);
        } else {
            AccountLogger.log(TAG, "fail to checkPassToken. Can not save to backup. Bail.");
        }
    }

    public GuestAccountManagerImplApp(Context context, GuestAccountType guestAccountType, GuestAccountOnlineFetcher guestAccountOnlineFetcher, GuestAccountStorage guestAccountStorage) {
        super(context);
        if (guestAccountOnlineFetcher == null) {
            throw new IllegalArgumentException("onlineFetcher == null");
        }
        if (guestAccountStorage == null) {
            throw new IllegalArgumentException("storage == null");
        }
        if (guestAccountType != null) {
            this.guestAccountType = guestAccountType;
            this.onlineFetcher = guestAccountOnlineFetcher;
            this.storage = guestAccountStorage;
            return;
        }
        throw new IllegalArgumentException("type == null");
    }
}
