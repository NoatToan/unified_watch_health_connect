package com.xiaomi.fitness.eco.device.manager;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoScannedDeviceInfo;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b!\u0010\"Je\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J9\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoBindDeviceManagerImpl;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoBindDeviceManager;", "Landroid/content/Context;", "context", "", "bleMac", "model", "bleName", "oob", HabitShareActivity.KEY_BIG_ICON, "deviceName", "", "isSportMachine", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "packet", "", "from", "shouldEcoDeviceBindActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;I)Z", "isNotShowDisconnectTipDevices", "(Ljava/lang/String;)Z", "isEightScaleDevice", "Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "product", "Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;", "action", "Lwc0;", "actionBar", "removeContentView", "", "showResetGuideView", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;Lcom/xiaomi/fitness/eco/device/manager/export/IBindGuideAction;Lwc0;Z)V", "<init>", "()V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoBindDeviceManagerImpl implements EcoBindDeviceManager {
    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager
    public boolean isEightScaleDevice(@Nullable String model) {
        if (model == null) {
            return false;
        }
        return EcoDeviceConfigManagerExtKt.getInstance(EcoDeviceConfigManager.INSTANCE).isEightScaleDevice(model);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager
    public boolean isNotShowDisconnectTipDevices(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return EcoDeviceConfigManagerExtKt.getInstance(EcoDeviceConfigManager.INSTANCE).isNotShowDisconnectTipDevices(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager
    public boolean shouldEcoDeviceBindActivity(@NotNull Context context, @NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String oob, @Nullable String bigIcon, @NotNull String deviceName, boolean isSportMachine, @Nullable AdvPacket packet, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        EcoAddDeviceInfo ecoAddDeviceInfo = new EcoAddDeviceInfo(0, null, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, 0, 0, 0, false, null, 2097151, null);
        ecoAddDeviceInfo.setModel(model);
        if (SportDeviceModel.INSTANCE.isJump(model)) {
            EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(model);
            if (ecoProduct != null) {
                String productName = ecoProduct.getProductName();
                if (productName == null) {
                    productName = "";
                }
                ecoAddDeviceInfo.setName(productName);
                ecoAddDeviceInfo.setBigIcon(ecoProduct.getBigIcon());
            }
        } else {
            ecoAddDeviceInfo.setName(deviceName);
            ecoAddDeviceInfo.setBigIcon(bigIcon);
        }
        ecoAddDeviceInfo.setSportMachine(isSportMachine);
        if (isSportMachine) {
            EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice("");
            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE(model);
        }
        return EcoDeviceConfigManagerExtKt.getInstance(EcoDeviceConfigManager.INSTANCE).launchEcoBindActivity(context, new EcoScannedDeviceInfo(bleMac, model, bleName, oob, null, null, null, null, ecoAddDeviceInfo, null, packet, 752, null), from);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager
    public void showResetGuideView(@NotNull FragmentActivity context, @NotNull EcoProduct product, @NotNull IBindGuideAction action, @Nullable wc0 actionBar, boolean removeContentView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(action, "action");
        ResetGuideHelper.INSTANCE.showResetGuideView(context, product, action, actionBar, removeContentView);
    }
}
