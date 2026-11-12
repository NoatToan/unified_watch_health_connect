package defpackage;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.homepage.HealthViewModel;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;

/* JADX INFO: loaded from: classes9.dex */
public final class q3c {
    public static void a(HealthViewModel healthViewModel, AccountRequest accountRequest) {
        healthViewModel.mAccountRequest = accountRequest;
    }

    public static void b(HealthViewModel healthViewModel, IPopMedalListRepo iPopMedalListRepo) {
        healthViewModel.mPopMedalRepo = iPopMedalListRepo;
    }

    public static void c(HealthViewModel healthViewModel, IRepositoryProvider iRepositoryProvider) {
        healthViewModel.repoProvider = iRepositoryProvider;
    }
}
