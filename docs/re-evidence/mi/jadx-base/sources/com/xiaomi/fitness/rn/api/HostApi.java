package com.xiaomi.fitness.rn.api;

import com.miot.provider.inject.bean.UserInfo;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.rn.api.HostApi;
import defpackage.atc;
import defpackage.ya3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/rn/api/HostApi;", "Latc;", "", "getCurrentAccountId", "()Ljava/lang/String;", "getServerName", "uid", "Lya3;", "Lcom/miot/provider/inject/bean/UserInfo;", "callback", "", "getUserInfo", "(Ljava/lang/String;Lya3;)V", "getBusinessType", "url", "", "isInWhiteListHost", "(Ljava/lang/String;)Z", "", "getApiLevel", "()I", "getSdkApiLevel", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HostApi implements atc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfo$lambda$0(UserInfoManager infoManager, UserInfo userInfo, ya3 ya3Var, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(infoManager, "$infoManager");
        Intrinsics.checkNotNullParameter(userInfo, "$userInfo");
        if (accountCoreInfo != null) {
            UserProfile userProfile$default = UserInfoManager.getUserProfile$default(infoManager, false, 1, null);
            userInfo.f10203a = accountCoreInfo.getUserId();
            String userName = accountCoreInfo.getUserName();
            if (userName == null && (userName = accountCoreInfo.getNickName()) == null) {
                userName = "";
            }
            userInfo.f10204b = userName;
            String avatarAddress = accountCoreInfo.getAvatarAddress();
            if (avatarAddress == null) {
                avatarAddress = "";
            }
            userInfo.c = avatarAddress;
            String sex = userProfile$default.getSex();
            userInfo.h = sex != null ? sex : "";
            userInfo.i = userProfile$default.getBirthOrDefault();
        }
        if (ya3Var != null) {
            ya3Var.onSuccess(userInfo);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.atc
    public int getApiLevel() {
        return 111;
    }

    @Override // defpackage.atc
    @NotNull
    public String getBusinessType() {
        return "Wear";
    }

    @Override // defpackage.atc
    @NotNull
    public String getCurrentAccountId() {
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        return userId == null ? "" : userId;
    }

    @Override // defpackage.atc
    public int getSdkApiLevel() {
        return 20003;
    }

    @NotNull
    public String getServerName() {
        return "cn";
    }

    @Override // defpackage.atc
    public void getUserInfo(@Nullable String uid, @Nullable final ya3<UserInfo> callback) {
        final UserInfo userInfo = new UserInfo();
        final UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
        UserInfoManager.getAccountCoreInfo$default(accountManagerExtKt, false, new Function1() { // from class: tac
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HostApi.getUserInfo$lambda$0(accountManagerExtKt, userInfo, callback, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    @Override // defpackage.atc
    public boolean isInWhiteListHost(@Nullable String url) {
        return true;
    }
}
