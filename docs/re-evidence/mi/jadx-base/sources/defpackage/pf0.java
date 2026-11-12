package defpackage;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.ActivePkRepository;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class pf0 {
    public static void a(ActivePkViewModel activePkViewModel, ActivePkRepository activePkRepository) {
        activePkViewModel.activePkRepository = activePkRepository;
    }

    public static void b(ActivePkViewModel activePkViewModel, UserInfoManager userInfoManager) {
        activePkViewModel.mUserInfoManager = userInfoManager;
    }

    public static void c(ActivePkViewModel activePkViewModel, IRepositoryProvider iRepositoryProvider) {
        activePkViewModel.repoProvider = iRepositoryProvider;
    }
}
