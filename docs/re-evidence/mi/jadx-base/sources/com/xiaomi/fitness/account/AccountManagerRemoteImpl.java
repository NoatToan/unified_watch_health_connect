package com.xiaomi.fitness.account;

import android.content.Intent;
import com.xiaomi.fitness.account.AccountManagerRemoteImpl;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.BroadcastsKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/account/AccountManagerRemoteImpl;", "Lcom/xiaomi/fitness/account/a$a;", "", "isLogin", "()Z", "", "login", "()V", "Lcom/xiaomi/fitness/account/MiAccountCoreInfo;", "getMiAccountCoreInfo", "()Lcom/xiaomi/fitness/account/MiAccountCoreInfo;", "", "getUserId", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "<init>", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AccountManagerRemoteImpl extends a.AbstractBinderC0377a {
    public static final int KEY_ACCOUNT_MANAGER_BINDER_CODE = 15;

    @NotNull
    public static final String TAG = "AccountManagerRemoteImpl";
    public AccountManager mAccountManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit login$lambda$0(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("origin", 1);
        return Unit.INSTANCE;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @Override // com.xiaomi.fitness.account.a
    @NotNull
    public MiAccountCoreInfo getMiAccountCoreInfo() {
        AccountCoreInfo miAccountCoreInfoSync = getMAccountManager().getMiAccountCoreInfoSync(true);
        String userId = miAccountCoreInfoSync != null ? miAccountCoreInfoSync.getUserId() : null;
        String userName = miAccountCoreInfoSync != null ? miAccountCoreInfoSync.getUserName() : null;
        String avatarAddress = miAccountCoreInfoSync != null ? miAccountCoreInfoSync.getAvatarAddress() : null;
        boolean z = !(userId == null || userId.length() == 0);
        boolean z2 = !(userName == null || userName.length() == 0);
        boolean z3 = avatarAddress == null || avatarAddress.length() == 0;
        StringBuilder sb = new StringBuilder();
        sb.append("getMiAccountCoreInfo.. hasId:");
        sb.append(z);
        sb.append(";hasName:");
        sb.append(z2);
        sb.append(";hasAvatar:");
        sb.append(!z3);
        Logger.i(TAG, sb.toString());
        return new MiAccountCoreInfo(userId, userName, avatarAddress);
    }

    @Override // com.xiaomi.fitness.account.a
    @Nullable
    public String getUserId() {
        return getMAccountManager().getUserId();
    }

    @Override // com.xiaomi.fitness.account.a
    public boolean isLogin() {
        return getMAccountManager().isLogin();
    }

    @Override // com.xiaomi.fitness.account.a
    public void login() {
        BroadcastsKt.broadcastLogin(null, new Function1() { // from class: d90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountManagerRemoteImpl.login$lambda$0((Intent) obj);
            }
        });
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }
}
