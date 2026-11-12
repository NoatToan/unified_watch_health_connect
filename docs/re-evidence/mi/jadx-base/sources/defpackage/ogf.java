package defpackage;

import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.MedalManagerImpl;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;

/* JADX INFO: loaded from: classes9.dex */
public final class ogf {
    public static void a(MedalManagerImpl medalManagerImpl, MedalHelper medalHelper) {
        medalManagerImpl.medalHelper = medalHelper;
    }

    public static void b(MedalManagerImpl medalManagerImpl, MedalRequest medalRequest) {
        medalManagerImpl.medalRequest = medalRequest;
    }

    public static void c(MedalManagerImpl medalManagerImpl, MedalV2Request medalV2Request) {
        medalManagerImpl.medalV2Request = medalV2Request;
    }
}
