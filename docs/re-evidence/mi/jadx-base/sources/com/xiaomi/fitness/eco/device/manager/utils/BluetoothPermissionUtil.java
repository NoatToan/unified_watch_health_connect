package com.xiaomi.fitness.eco.device.manager.utils;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/utils/BluetoothPermissionUtil;", "", "<init>", "()V", "showBluetoothSyncDataDialogIfNeed", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "resultCallback", "Lkotlin/Function1;", "", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPermissionUtil {

    @NotNull
    public static final BluetoothPermissionUtil INSTANCE = new BluetoothPermissionUtil();

    private BluetoothPermissionUtil() {
    }

    public final void showBluetoothSyncDataDialogIfNeed(@NotNull FragmentActivity activity, @NotNull final Function1<? super Boolean, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        BluetoothPermissionTool.Companion companion = BluetoothPermissionTool.INSTANCE;
        if (!DeviceManagerExtKt.getInstance(companion).needRequestBluetoothPermission(activity)) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        if (ecoDevicePreference.getAGREE_BLUE_DATA_ENABLE()) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        BluetoothPermissionTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        deviceManagerExtKt.showBluetoothPermissionDialog(supportFragmentManager, new SyncDataDialogCallback() { // from class: com.xiaomi.fitness.eco.device.manager.utils.BluetoothPermissionUtil.showBluetoothSyncDataDialogIfNeed.1
            @Override // com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback
            public void onAgreeButtonClicked() {
                EcoDevicePreference.INSTANCE.setAGREE_BLUE_DATA_ENABLE(true);
                resultCallback.invoke2(Boolean.TRUE);
            }

            @Override // com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback
            public void onRejectButtonClicked() {
                resultCallback.invoke2(Boolean.FALSE);
            }
        });
        ecoDevicePreference.setLAST_SHOW_BLUE_DATA_DIALOG_TIME(System.currentTimeMillis());
    }
}
