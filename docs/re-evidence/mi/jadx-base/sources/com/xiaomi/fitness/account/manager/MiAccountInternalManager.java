package com.xiaomi.fitness.account.manager;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.account.manager.MiAccountInternalManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerCallback;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture;
import com.xiaomi.passport.data.XMPassportInfo;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import com.xiaomi.passport.ui.page.AccountLoginActivity;
import com.xiaomi.passport.utils.AccountHelper;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&H\u0016J \u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010&H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0011H\u0016J\u0018\u0010-\u001a\u00020\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$H\u0016J\u0018\u0010.\u001a\u00020\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$H\u0002J\u0016\u0010/\u001a\u0004\u0018\u00010\"2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\"H\u0002J\u0018\u00101\u001a\u00020\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$H\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\b\u00103\u001a\u00020\u001dH\u0016J\u0010\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/account/manager/MiAccountInternalManager;", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mMiAccountManager", "Lcom/xiaomi/passport/accountmanager/XiaomiAccountManager;", "getMMiAccountManager", "()Lcom/xiaomi/passport/accountmanager/XiaomiAccountManager;", "mAccountCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "miAccount", "Landroid/accounts/Account;", "getMiAccount", "()Landroid/accounts/Account;", "isUseSystem", "", "()Z", "isUseLocal", "sid", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "getMiAccountCoreInfoSync", "forceRefresh", "resetXiaoMiCoreInfo", "", "userId", "getUserId", "addXiaomiAccount", "addAccountOptions", "Landroid/os/Bundle;", "callback", "Landroid/accounts/AccountManagerCallback;", "removeXiaomiAccount", "Lcom/xiaomi/passport/accountmanager/XiaomiAccountManagerCallback;", "setSystemAccountVisibility", "Lcom/xiaomi/passport/accountmanager/XiaomiAccountManagerFuture;", "Lcom/xiaomi/passport/servicetoken/data/XmAccountVisibility;", "getServiceToken", "Lcom/xiaomi/passport/servicetoken/ServiceTokenResult;", "refreshToken", "localLogin", "addLocalAccount", "addGoogleLoginParamsIfNeed", "originBundle", "systemLogin", "setUserLocal", "setUserSystem", "getUserData", "key", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiAccountInternalManager implements IMiAccountManager {

    @NotNull
    public static final String SERVICE_ID = "passportapi";

    @NotNull
    private final Context context;

    @Nullable
    private AccountCoreInfo mAccountCoreInfo;
    public volatile String sid;

    public MiAccountInternalManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Bundle addGoogleLoginParamsIfNeed(Bundle originBundle) {
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            return originBundle;
        }
        if (originBundle == null) {
            originBundle = new Bundle();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("google");
        originBundle.putStringArrayList(AccountLoginActivity.EXTRA_STRING_LIST_SNS_ENTRANCE, arrayList);
        return originBundle;
    }

    public static /* synthetic */ Bundle addGoogleLoginParamsIfNeed$default(MiAccountInternalManager miAccountInternalManager, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        return miAccountInternalManager.addGoogleLoginParamsIfNeed(bundle);
    }

    private final void addLocalAccount(AccountManagerCallback<Bundle> callback) {
        Bundle bundle = new Bundle();
        bundle.putString(AccountLoginActivity.EXTRA_STRING_INIT_PAGE, AppUtil.INSTANCE.isPlayChannel() ? AccountLoginActivity.VAL_STRING_INIT_PAGE_USER_ID_LOGIN : AccountLoginActivity.VAL_STRING_INIT_PAGE_PHONE_ACCOUNT_LOGIN);
        addGoogleLoginParamsIfNeed(bundle);
        addXiaomiAccount(bundle, callback);
    }

    private final XiaomiAccountManager getMMiAccountManager() {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(this.context);
        Intrinsics.checkNotNullExpressionValue(xiaomiAccountManager, "get(...)");
        return xiaomiAccountManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void localLogin$lambda$0(MiAccountInternalManager this$0, AccountManagerCallback accountManagerCallback, XiaomiAccountManagerFuture xiaomiAccountManagerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            xiaomiAccountManagerFuture.getResult();
        } catch (AuthenticatorException e) {
            LogExtKt.logi("localLogin: throw " + e + " when remove xiaomi account");
        } catch (OperationCanceledException e2) {
            LogExtKt.logi("localLogin: throw " + e2 + " when remove xiaomi account");
        } catch (IOException e3) {
            LogExtKt.logi("localLogin: throw " + e3 + " when remove xiaomi account");
        }
        this$0.addLocalAccount(accountManagerCallback);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void addXiaomiAccount(@Nullable Bundle addAccountOptions, @Nullable AccountManagerCallback<Bundle> callback) {
        if (getMiAccount() != null) {
            LogExtKt.logi("Xiaomi account already exists");
        }
        LogExtKt.logi("Add xiaomi account，sid=" + getSid());
        getMMiAccountManager().addXiaomiAccount(getSid(), addAccountOptions, callback, null);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @Nullable
    public Account getMiAccount() {
        Account xiaomiAccount = null;
        try {
            if (RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
                xiaomiAccount = getMMiAccountManager().getXiaomiAccount();
            } else {
                Logger.e("has not agree privacy", new Object[0]);
            }
        } catch (Exception e) {
            Logger.e("Can't get xiaomi account, because throw " + e, new Object[0]);
        }
        return xiaomiAccount;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @Nullable
    public AccountCoreInfo getMiAccountCoreInfoSync(boolean forceRefresh) {
        XiaomiUserCoreInfo xiaomiUserCoreInfo;
        AccountCoreInfo accountCoreInfo;
        if (!forceRefresh && (accountCoreInfo = this.mAccountCoreInfo) != null) {
            return accountCoreInfo;
        }
        XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(this.context, "passportapi");
        if (xMPassportInfoBuild != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(XiaomiUserCoreInfo.Flag.BASE_INFO);
            arrayList.add(XiaomiUserCoreInfo.Flag.SETTING_INFO);
            try {
                xiaomiUserCoreInfo = AccountHelper.getXiaomiUserCoreInfo(xMPassportInfoBuild, "passportapi", arrayList);
            } catch (Exception e) {
                Logger.e("MiAccountInternalManager", "getXiaomiUserCoreInfo error " + e);
                return null;
            }
        } else {
            xiaomiUserCoreInfo = null;
        }
        AccountCoreInfo accountCoreInfo2 = xiaomiUserCoreInfo != null ? AccountManagerExtKt.toAccountCoreInfo(xiaomiUserCoreInfo) : null;
        this.mAccountCoreInfo = accountCoreInfo2;
        return accountCoreInfo2;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @NotNull
    public ServiceTokenResult getServiceToken(@NotNull String sid, boolean refreshToken) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        ServiceTokenResult serviceTokenResult = getMMiAccountManager().getServiceToken(getMiAccount(), sid, null).get();
        if (refreshToken && serviceTokenResult.errorCode == ServiceTokenResult.ErrorCode.ERROR_NONE) {
            serviceTokenResult = getMMiAccountManager().refreshServiceToken(getMiAccount(), sid, serviceTokenResult, null).get();
        }
        Intrinsics.checkNotNull(serviceTokenResult);
        return serviceTokenResult;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @NotNull
    public String getSid() {
        String str = this.sid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sid");
        return null;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @NotNull
    public String getUserData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String userData = getMMiAccountManager().getUserData(getMiAccount(), key);
        Intrinsics.checkNotNullExpressionValue(userData, "getUserData(...)");
        return userData;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @Nullable
    public String getUserId() {
        Account miAccount = getMiAccount();
        if (miAccount != null) {
            return miAccount.name;
        }
        return null;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public boolean isUseLocal() {
        return !AccountPreference.INSTANCE.getACCOUNT_USER_SYSTEM();
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public boolean isUseSystem() {
        return AccountPreference.INSTANCE.getACCOUNT_USER_SYSTEM();
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void localLogin(@Nullable final AccountManagerCallback<Bundle> callback) {
        setUserLocal();
        if (getMiAccount() == null) {
            LogExtKt.logi("localLogin: xiaomiAccount = null");
            addLocalAccount(callback);
            return;
        }
        LogExtKt.logi("removeXiaomiAccount: localLogin," + Log.getStackTraceString(new Throwable()));
        getMMiAccountManager().removeXiaomiAccount(new XiaomiAccountManagerCallback() { // from class: juf
            @Override // com.xiaomi.passport.accountmanager.XiaomiAccountManagerCallback
            public final void run(XiaomiAccountManagerFuture xiaomiAccountManagerFuture) {
                MiAccountInternalManager.localLogin$lambda$0(this.f23140a, callback, xiaomiAccountManagerFuture);
            }
        }, null);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void removeXiaomiAccount(@Nullable XiaomiAccountManagerCallback<Bundle> callback) {
        LogExtKt.logi("removeXiaomiAccount," + Log.getStackTraceString(new Throwable()));
        getMMiAccountManager().removeXiaomiAccount(callback, null);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void resetXiaoMiCoreInfo() {
        this.mAccountCoreInfo = null;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void setSid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sid = str;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    @NotNull
    public XiaomiAccountManagerFuture<XmAccountVisibility> setSystemAccountVisibility(@Nullable XiaomiAccountManagerCallback<XmAccountVisibility> callback) {
        XiaomiAccountManagerFuture<XmAccountVisibility> xiaomiAccountManagerFutureMakeAccountVisible = getMMiAccountManager().makeAccountVisible(callback, null);
        Intrinsics.checkNotNullExpressionValue(xiaomiAccountManagerFutureMakeAccountVisible, "makeAccountVisible(...)");
        return xiaomiAccountManagerFutureMakeAccountVisible;
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void setUserLocal() {
        LogExtKt.logi("setUserLocal...");
        AccountPreference.INSTANCE.setACCOUNT_USER_SYSTEM(false);
        XiaomiAccountManager.setup(this.context, false);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void setUserSystem() {
        LogExtKt.logi("setUserSystem...");
        AccountPreference.INSTANCE.setACCOUNT_USER_SYSTEM(true);
        XiaomiAccountManager.setup(this.context, true);
    }

    @Override // com.xiaomi.fitness.account.manager.IMiAccountManager
    public void systemLogin(@Nullable AccountManagerCallback<Bundle> callback) {
        if (!XiaomiAccountManager.isSystemAccountInstalled(this.context)) {
            LogExtKt.logi("Cannot use system login");
        }
        setUserSystem();
        addXiaomiAccount(null, callback);
    }
}
