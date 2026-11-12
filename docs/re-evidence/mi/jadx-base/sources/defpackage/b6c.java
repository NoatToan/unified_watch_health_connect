package defpackage;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.heartrate.ui.HeartRateDetectViewModel;

/* JADX INFO: loaded from: classes9.dex */
public final class b6c {
    public static void a(HeartRateDetectViewModel heartRateDetectViewModel, IRepositoryProvider iRepositoryProvider) {
        heartRateDetectViewModel.mRepository = iRepositoryProvider;
    }

    public static void b(HeartRateDetectViewModel heartRateDetectViewModel, WearableDeviceManager wearableDeviceManager) {
        heartRateDetectViewModel.mWearableDeviceManager = wearableDeviceManager;
    }
}
