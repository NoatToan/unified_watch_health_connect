package defpackage;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;

/* JADX INFO: loaded from: classes9.dex */
public final class rif {
    public static void a(MedalViewModel medalViewModel, AccountRequest accountRequest) {
        medalViewModel.mAccountRequest = accountRequest;
    }

    public static void b(MedalViewModel medalViewModel, MedalRequest medalRequest) {
        medalViewModel.mMedalRequest = medalRequest;
    }

    public static void c(MedalViewModel medalViewModel, MedalV2Request medalV2Request) {
        medalViewModel.medalV2Request = medalV2Request;
    }
}
