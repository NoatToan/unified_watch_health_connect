package com.xiaomi.fitness.eco.device.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceConfigManagerImpl;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoScannedDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportEcoExt;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceConfigManagerImpl;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager;", "<init>", "()V", "isEcoDevice", "", "model", "", "isNotShowDisconnectTipDevices", "isEightScaleDevice", "launchEcoBindActivity", "context", "Landroid/content/Context;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoScannedDeviceInfo;", "from", "", "ecoWeightActivityPath", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceConfigManagerImpl implements EcoDeviceConfigManager {

    @NotNull
    private static final String TAG = "EcoDeviceConfigManagerImpl";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchEcoBindActivity$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager
    @NotNull
    public String ecoWeightActivityPath(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[ORIG_RETURN, RETURN] */
    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager
    public boolean isEcoDevice(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        switch (model) {
            case "yesoul.exbike.jsc01y":
                return true;
            case "runmi.exbike.jscrm1":
                return true;
            case "hmpace.scales.miscale2":
                return true;
            case "hmpace.scales.mibfs":
                return true;
            case "yunmai.jmprope.sr803":
                return true;
            case "yunmai.jmprope.sr804":
                return true;
            case "yunmai.jmprope.sr805":
                return true;
            case "yunmai.scales.ms3001":
                return true;
            default:
                return false;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager
    public boolean isEightScaleDevice(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return Intrinsics.areEqual(model, "yunmai.scales.ms3001");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[ORIG_RETURN, RETURN] */
    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager
    public boolean isNotShowDisconnectTipDevices(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        switch (model) {
            case "yesoul.exbike.jsc01y":
                return true;
            case "runmi.exbike.jscrm1":
                return true;
            case "ksmb.treadmill.m2":
                return true;
            case "hmpace.scales.miscale2":
                return true;
            case "hmpace.scales.mibfs":
                return true;
            case "yunmai.jmprope.sr803":
                return true;
            case "yunmai.jmprope.sr804":
                return true;
            case "yunmai.jmprope.sr805":
                return true;
            case "yunmai.scales.ms3001":
                return true;
            default:
                return false;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager
    public boolean launchEcoBindActivity(@NotNull Context context, @NotNull EcoScannedDeviceInfo deviceInfo, int from) {
        RNProduct productByModel;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (EcoDeviceModelExtKt.isEightScale(deviceInfo.getModel())) {
            EcoBindDeviceActivity.INSTANCE.launch$eco_device_manager_chinaProductRelease(context, false, deviceInfo, from);
            return true;
        }
        try {
            productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(deviceInfo.getModel());
        } catch (Exception e) {
            LogExtKt.logi(TAG, "launchEcoBindActivity getProductByModel error: " + e.getMessage());
            productByModel = null;
        }
        if (productByModel != null) {
            EcoBindDeviceActivity.INSTANCE.launch$eco_device_manager_chinaProductRelease(context, true, deviceInfo, from);
            return true;
        }
        if (!isEcoDevice(deviceInfo.getModel()) || !deviceInfo.isSportMachine()) {
            return false;
        }
        final Bundle bundle = new Bundle();
        SportEcoExt sportEcoExt = SportEcoExt.INSTANCE;
        String fromUri = sportEcoExt.getFromUri();
        if (fromUri == null || fromUri.length() == 0) {
            deviceInfo.setTo(SportRouterKt.GYM_LAUNCH);
        } else {
            if (StringsKt__StringsJVMKt.equals$default(sportEcoExt.getFromUri(), SportRouterKt.GYM_COURSE_INFO, false, 2, null)) {
                deviceInfo.setTo("");
            } else {
                deviceInfo.setTo(sportEcoExt.getFromUri());
            }
            sportEcoExt.setFromUri("");
        }
        bundle.putParcelable("key_device_info", deviceInfo);
        LaunchExtensionKt.startActivity(context, (Class<?>) BindLocalDeviceActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: xq7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcoDeviceConfigManagerImpl.launchEcoBindActivity$lambda$0(bundle, (Intent) obj);
            }
        });
        return true;
    }
}
