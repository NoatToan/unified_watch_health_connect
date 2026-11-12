package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class klq {
    public static void a(UserinfoSelectViewModel userinfoSelectViewModel, AccountRequest accountRequest) {
        userinfoSelectViewModel.mAccountRequest = accountRequest;
    }

    public static void b(UserinfoSelectViewModel userinfoSelectViewModel, UserInfoManager userInfoManager) {
        userinfoSelectViewModel.mUserInfoManager = userInfoManager;
    }

    public static void c(UserinfoSelectViewModel userinfoSelectViewModel, IMedicalIdRepository iMedicalIdRepository) {
        userinfoSelectViewModel.repo = iMedicalIdRepository;
    }
}
