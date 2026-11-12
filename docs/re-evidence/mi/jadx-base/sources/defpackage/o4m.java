package defpackage;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel;

/* JADX INFO: loaded from: classes9.dex */
public final class o4m {
    public static void a(ShareCaloConsumViewModel shareCaloConsumViewModel, UserInfoManager userInfoManager) {
        shareCaloConsumViewModel.mUserInfoManager = userInfoManager;
    }

    public static void b(ShareCaloConsumViewModel shareCaloConsumViewModel, IRepositoryProvider iRepositoryProvider) {
        shareCaloConsumViewModel.repoProvider = iRepositoryProvider;
    }
}
