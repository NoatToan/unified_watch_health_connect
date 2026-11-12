package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.userinfo.ui.UserGuideViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class cgq {
    public static void a(UserGuideViewModel userGuideViewModel, AccountRequest accountRequest) {
        userGuideViewModel.mAccountRequest = accountRequest;
    }

    public static void b(UserGuideViewModel userGuideViewModel, UserInfoManager userInfoManager) {
        userGuideViewModel.mUserInfoManager = userInfoManager;
    }
}
