package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class unf {
    public static void a(MedicalIdViewModel medicalIdViewModel, AccountRequest accountRequest) {
        medicalIdViewModel.mAccountRequest = accountRequest;
    }

    public static void b(MedicalIdViewModel medicalIdViewModel, IMedicalIdRepository iMedicalIdRepository) {
        medicalIdViewModel.medicalIdRepository = iMedicalIdRepository;
    }
}
