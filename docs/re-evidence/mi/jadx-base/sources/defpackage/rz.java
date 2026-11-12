package defpackage;

import com.xiaomi.fitness.about.AboutViewModel;
import com.xiaomi.fitness.about.request.AboutRequest;
import com.xiaomi.fitness.account.manager.AccountManager;

/* JADX INFO: loaded from: classes7.dex */
public final class rz {
    public static void a(AboutViewModel aboutViewModel, AboutRequest aboutRequest) {
        aboutViewModel.mAboutRequest = aboutRequest;
    }

    public static void b(AboutViewModel aboutViewModel, AccountManager accountManager) {
        aboutViewModel.mAccountManager = accountManager;
    }
}
