package defpackage;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;

/* JADX INFO: loaded from: classes9.dex */
public final class t9m {
    public static void a(ShareSportTagetViewModel shareSportTagetViewModel, UserInfoManager userInfoManager) {
        shareSportTagetViewModel.mUserInfoManager = userInfoManager;
    }

    public static void b(ShareSportTagetViewModel shareSportTagetViewModel, IRepositoryProvider iRepositoryProvider) {
        shareSportTagetViewModel.repoProvider = iRepositoryProvider;
    }
}
