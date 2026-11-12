package defpackage;

import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.mine.MineViewModel;
import com.xiaomi.fitness.mine.company.CompanyUserRepository;

/* JADX INFO: loaded from: classes9.dex */
public final class m4g {
    public static void a(MineViewModel mineViewModel, CompanyUserRepository companyUserRepository) {
        mineViewModel.companyUserRepository = companyUserRepository;
    }

    public static void b(MineViewModel mineViewModel, IPopMedalListRepo iPopMedalListRepo) {
        mineViewModel.mPopMedalRepo = iPopMedalListRepo;
    }

    public static void c(MineViewModel mineViewModel, UserInfoManager userInfoManager) {
        mineViewModel.mUserInfoManager = userInfoManager;
    }
}
