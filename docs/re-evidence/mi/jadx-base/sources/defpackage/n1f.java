package defpackage;

import com.example.appupgrade.export.AppUpgradeHelper;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.push.export.PushManager;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n1f {
    public static void a(MainActivity mainActivity, AppUpgradeHelper appUpgradeHelper) {
        mainActivity.appUpgradeHelper = appUpgradeHelper;
    }

    public static void b(MainActivity mainActivity, CheckUpdateManager checkUpdateManager) {
        mainActivity.checkUpdate = checkUpdateManager;
    }

    public static void c(MainActivity mainActivity, Set<MainTab> set) {
        mainActivity.mMainTabs = set;
    }

    public static void d(MainActivity mainActivity, UserInfoManager userInfoManager) {
        mainActivity.mUserInfoManager = userInfoManager;
    }

    public static void e(MainActivity mainActivity, PushManager pushManager) {
        mainActivity.pushManager = pushManager;
    }
}
