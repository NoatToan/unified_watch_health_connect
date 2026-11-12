package defpackage;

import com.example.appupgrade.export.AppUpgradeHelper;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.mine.company.CompanyUserRepository;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class y3g {
    public static void a(MineV4ViewModel mineV4ViewModel, AppUpgradeHelper appUpgradeHelper) {
        mineV4ViewModel.appUpgradeHelper = appUpgradeHelper;
    }

    public static void b(MineV4ViewModel mineV4ViewModel, CompanyUserRepository companyUserRepository) {
        mineV4ViewModel.companyUserRepository = companyUserRepository;
    }

    public static void c(MineV4ViewModel mineV4ViewModel, AccountManager accountManager) {
        mineV4ViewModel.mAccountManager = accountManager;
    }

    public static void d(MineV4ViewModel mineV4ViewModel, UserInfoManager userInfoManager) {
        mineV4ViewModel.mUserInfoManager = userInfoManager;
    }

    public static void e(MineV4ViewModel mineV4ViewModel, WeekReportRequest weekReportRequest) {
        mineV4ViewModel.weekReportRequest = weekReportRequest;
    }
}
