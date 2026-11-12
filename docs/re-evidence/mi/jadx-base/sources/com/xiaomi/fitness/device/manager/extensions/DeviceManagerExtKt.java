package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000\u001a&\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"filterDeviceList", "", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "setList", "E", "list", "", "isSyncing", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "did", "", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceManagerExtKt {
    public static final void filterDeviceList(@NotNull List<WearableDevice> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Map<String, Product> productDetails = DeviceExtKt.getProductDetails(InstanceExtKt.getInstance(ProductManagerRemoteInternal.INSTANCE));
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("The size of device what will been filter is " + list.size() + ", and products are " + productDetails);
        if (productDetails == null || productDetails.isEmpty()) {
            return;
        }
        Iterator<WearableDevice> it = list.iterator();
        while (it.hasNext()) {
            WearableDevice next = it.next();
            if (!productDetails.containsKey(next.getModel())) {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("remove " + next.getName() + "(" + next.getModel() + ")");
                it.remove();
            }
        }
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("the size of devices is " + list.size() + " after there was filter");
    }

    public static final boolean isSyncing(@NotNull WearableDeviceManager wearableDeviceManager, @NotNull String did) {
        Intrinsics.checkNotNullParameter(wearableDeviceManager, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) wearableDeviceManager.getDeviceModel(did);
        return wearableDeviceModel != null && wearableDeviceModel.getIsCurrent() && wearableDeviceModel.getIsDeviceConnected();
    }

    public static final <E> void setList(@NotNull List<E> list, @NotNull List<? extends E> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "list");
        list.clear();
        list.addAll(list2);
    }
}
