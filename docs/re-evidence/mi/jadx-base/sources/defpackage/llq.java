package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel;

/* JADX INFO: loaded from: classes8.dex */
public final class llq {
    public static void a(UserinfoSelectViewModel userinfoSelectViewModel, AccountRequest accountRequest) {
        userinfoSelectViewModel.mAccountRequest = accountRequest;
    }

    public static void b(UserinfoSelectViewModel userinfoSelectViewModel, UserInfoManager userInfoManager) {
        userinfoSelectViewModel.mUserInfoManager = userInfoManager;
    }
}
