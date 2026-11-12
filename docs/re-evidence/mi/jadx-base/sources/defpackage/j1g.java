package defpackage;

import com.example.appupgrade.export.AppUpgradeHelper;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.mine.MineFragment;

/* JADX INFO: loaded from: classes9.dex */
public final class j1g {
    public static void a(MineFragment mineFragment, AppUpgradeHelper appUpgradeHelper) {
        mineFragment.appUpgradeHelper = appUpgradeHelper;
    }

    public static void b(MineFragment mineFragment, AccountManager accountManager) {
        mineFragment.mAccoutManager = accountManager;
    }

    public static void c(MineFragment mineFragment, IMiAccountManager iMiAccountManager) {
        mineFragment.mMiAccountManager = iMiAccountManager;
    }
}
