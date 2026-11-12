package com.xiaomi.fitness.account.manager;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.os.Bundle;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerCallback;
import com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0016H&J\"\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH&J\u0018\u0010\u001c\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001dH&J\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001dH&J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0007H&J\u0018\u0010$\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH&J\u0018\u0010%\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH&J\b\u0010&\u001a\u00020\u0016H&J\b\u0010'\u001a\u00020\u0016H&J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "", "miAccount", "Landroid/accounts/Account;", "getMiAccount", "()Landroid/accounts/Account;", "isUseSystem", "", "()Z", "isUseLocal", "sid", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "userId", "getUserId", "getMiAccountCoreInfoSync", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "forceRefresh", "resetXiaoMiCoreInfo", "", "addXiaomiAccount", "addAccountOptions", "Landroid/os/Bundle;", "callback", "Landroid/accounts/AccountManagerCallback;", "removeXiaomiAccount", "Lcom/xiaomi/passport/accountmanager/XiaomiAccountManagerCallback;", "setSystemAccountVisibility", "Lcom/xiaomi/passport/accountmanager/XiaomiAccountManagerFuture;", "Lcom/xiaomi/passport/servicetoken/data/XmAccountVisibility;", "getServiceToken", "Lcom/xiaomi/passport/servicetoken/ServiceTokenResult;", "refreshToken", "localLogin", "systemLogin", "setUserLocal", "setUserSystem", "getUserData", "key", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IMiAccountManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AccountCoreInfo getMiAccountCoreInfoSync$default(IMiAccountManager iMiAccountManager, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMiAccountCoreInfoSync");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return iMiAccountManager.getMiAccountCoreInfoSync(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ XiaomiAccountManagerFuture setSystemAccountVisibility$default(IMiAccountManager iMiAccountManager, XiaomiAccountManagerCallback xiaomiAccountManagerCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemAccountVisibility");
            }
            if ((i & 1) != 0) {
                xiaomiAccountManagerCallback = null;
            }
            return iMiAccountManager.setSystemAccountVisibility(xiaomiAccountManagerCallback);
        }
    }

    void addXiaomiAccount(@Nullable Bundle addAccountOptions, @Nullable AccountManagerCallback<Bundle> callback);

    @Nullable
    Account getMiAccount();

    @Nullable
    AccountCoreInfo getMiAccountCoreInfoSync(boolean forceRefresh);

    @NotNull
    ServiceTokenResult getServiceToken(@NotNull String sid, boolean refreshToken);

    @NotNull
    String getSid();

    @NotNull
    String getUserData(@NotNull String key);

    @Nullable
    String getUserId();

    boolean isUseLocal();

    boolean isUseSystem();

    void localLogin(@Nullable AccountManagerCallback<Bundle> callback);

    void removeXiaomiAccount(@Nullable XiaomiAccountManagerCallback<Bundle> callback);

    void resetXiaoMiCoreInfo();

    void setSid(@NotNull String str);

    @NotNull
    XiaomiAccountManagerFuture<XmAccountVisibility> setSystemAccountVisibility(@Nullable XiaomiAccountManagerCallback<XmAccountVisibility> callback);

    void setUserLocal();

    void setUserSystem();

    void systemLogin(@Nullable AccountManagerCallback<Bundle> callback);
}
