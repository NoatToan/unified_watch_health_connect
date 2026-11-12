package com.xiaomi.fitness.nfc.service;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.service.NfcServiceUtils;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.vqg;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/nfc/service/NfcServiceUtils;", "", "<init>", "()V", "getCurAndDeviceModels", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcServiceUtils {

    @NotNull
    public static final NfcServiceUtils INSTANCE = new NfcServiceUtils();

    private NfcServiceUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCurAndDeviceModels$lambda$0(CountDownLatch countDownLatch, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0064  */
    @NotNull
    public final Pair<String, List<WearableDeviceModel>> getCurAndDeviceModels() throws InterruptedException {
        String did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (deviceManagerExtKt.getDeviceModels().isEmpty()) {
            vqg.d("addDeviceChangeListener when devicesModels is empty");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            Function1 function1 = new Function1() { // from class: usg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NfcServiceUtils.getCurAndDeviceModels$lambda$0(countDownLatch, (WearableDeviceModel) obj);
                }
            };
            deviceManagerExtKt.addDeviceChangeListener(function1);
            countDownLatch.await(30L, TimeUnit.SECONDS);
            deviceManagerExtKt.removeDeviceChangeListener(function1);
        }
        Collection deviceModels = deviceManagerExtKt.getDeviceModels();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            boolean zIsSupportNfc = NfcUtils.isSupportNfc(wearableDeviceModel);
            vqg.d("NfcMierService currentDeviceMode did:" + wearableDeviceModel.getDid() + " isSupportNFC: " + zIsSupportNfc);
            if (zIsSupportNfc) {
                did = wearableDeviceModel.getDid();
            } else {
                did = null;
            }
        } else {
            did = null;
        }
        return new Pair<>(did, deviceModels);
    }
}
