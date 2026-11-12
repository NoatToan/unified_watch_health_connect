package defpackage;

import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.region.RegionViewModel;
import com.xiaomi.fitness.login.request.RegionByIpRequest;
import com.xiaomi.fitness.login.request.RegionRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class bdk {
    public static void a(RegionViewModel regionViewModel, RegionByIpRequest regionByIpRequest) {
        regionViewModel.mRegionByIpRequest = regionByIpRequest;
    }

    public static void b(RegionViewModel regionViewModel, RegionManager regionManager) {
        regionViewModel.mRegionManager = regionManager;
    }

    public static void c(RegionViewModel regionViewModel, RegionRequest regionRequest) {
        regionViewModel.mRegionRequest = regionRequest;
    }
}
