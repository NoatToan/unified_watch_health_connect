package defpackage;

import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanManager;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;

/* JADX INFO: loaded from: classes8.dex */
public final class rdl {
    public static void a(ScanDeviceViewModel scanDeviceViewModel, ProductManagerInternal productManagerInternal) {
        scanDeviceViewModel.mProductManager = productManagerInternal;
    }

    public static void b(ScanDeviceViewModel scanDeviceViewModel, ScanManager scanManager) {
        scanDeviceViewModel.mScanManager = scanManager;
    }
}
