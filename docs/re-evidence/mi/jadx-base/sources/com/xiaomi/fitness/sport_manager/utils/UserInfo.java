package com.xiaomi.fitness.sport_manager.utils;

import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/utils/UserInfo;", "", "<init>", "()V", "UserProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getUserProfile", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setUserProfile", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfo {

    @NotNull
    public static final UserInfo INSTANCE = new UserInfo();

    @NotNull
    private static UserProfile UserProfile = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);

    private UserInfo() {
    }

    @NotNull
    public final UserProfile getUserProfile() {
        return UserProfile;
    }

    public final void setUserProfile(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<set-?>");
        UserProfile = userProfile;
    }
}
