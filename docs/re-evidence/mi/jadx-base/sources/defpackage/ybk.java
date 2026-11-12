package defpackage;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.login.request.RegionRequest;
import com.xiaomi.fitness.login.request.SetUserDataRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class ybk {
    public static void a(RegionManagerImpl regionManagerImpl, RegionRequest regionRequest) {
        regionManagerImpl.mRegionRequest = regionRequest;
    }

    public static void b(RegionManagerImpl regionManagerImpl, SetUserDataRequest setUserDataRequest) {
        regionManagerImpl.mSetUserDataRequest = setUserDataRequest;
    }
}
