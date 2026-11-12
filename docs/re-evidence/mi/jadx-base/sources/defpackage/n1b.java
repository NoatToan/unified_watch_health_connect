package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.userinfo.goal.GoalGuideViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class n1b {
    public static void a(GoalGuideViewModel goalGuideViewModel, AccountRequest accountRequest) {
        goalGuideViewModel.mAccountRequest = accountRequest;
    }

    public static void b(GoalGuideViewModel goalGuideViewModel, UserInfoManager userInfoManager) {
        goalGuideViewModel.mUserInfoManager = userInfoManager;
    }
}
