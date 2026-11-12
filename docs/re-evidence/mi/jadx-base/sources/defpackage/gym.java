package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;

/* JADX INFO: loaded from: classes9.dex */
public final class gym {
    public static void a(SleepSettingViewModel sleepSettingViewModel, AccountRequest accountRequest) {
        sleepSettingViewModel.mAccountRequest = accountRequest;
    }

    public static void b(SleepSettingViewModel sleepSettingViewModel, UserInfoManager userInfoManager) {
        sleepSettingViewModel.mUserInfoManager = userInfoManager;
    }
}
