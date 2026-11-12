package com.xiaomi.fitness.health.temperature;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.health.temperature.TempTrendSupportDeviceViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/TempTrendSupportDeviceViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "getAllSupportDeviceList", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TempTrendSupportDeviceViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAllSupportDeviceList$lambda$0(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<String> features = it.getFeatures();
        return features != null && features.contains(Feature.MENSTRUATION_INTELLIGENT_PREDICT);
    }

    @NotNull
    public final List<WearableProduct> getAllSupportDeviceList() {
        return DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductList(new Function1() { // from class: c2p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(TempTrendSupportDeviceViewModel.getAllSupportDeviceList$lambda$0((WearableProduct) obj));
            }
        });
    }
}
