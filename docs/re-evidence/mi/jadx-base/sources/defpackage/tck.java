package defpackage;

import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.region.RegionSelectListViewModel;
import com.xiaomi.fitness.login.request.RegionRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class tck {
    public static void a(RegionSelectListViewModel regionSelectListViewModel, RegionManager regionManager) {
        regionSelectListViewModel.mRegionManager = regionManager;
    }

    public static void b(RegionSelectListViewModel regionSelectListViewModel, RegionRequest regionRequest) {
        regionSelectListViewModel.mRegionRequest = regionRequest;
    }
}
