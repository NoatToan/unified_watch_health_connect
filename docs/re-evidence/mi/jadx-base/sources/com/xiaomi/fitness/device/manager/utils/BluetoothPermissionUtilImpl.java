package com.xiaomi.fitness.device.manager.utils;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0002\b\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionUtilImpl;", "Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "<init>", "()V", "showBluetoothPermissionDialog", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lcom/xiaomi/fitness/device/manager/export/SyncDataDialogCallback;", "needRequestBluetoothPermission", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "checkBluetoothPermission", "hasBluetoothConnectPermission", "requestBluetoothIfNeed", "finishOnReject", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPermissionUtilImpl implements BluetoothPermissionTool {
    @Override // com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool
    public boolean checkBluetoothPermission() {
        return BluetoothPermissionUtil.INSTANCE.checkBluetoothPermission();
    }

    @Override // com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool
    public boolean hasBluetoothConnectPermission() {
        return BluetoothPermissionUtil.INSTANCE.hasConnectPermission();
    }

    @Override // com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool
    public boolean needRequestBluetoothPermission(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return BluetoothPermissionUtil.INSTANCE.needRequestBluetoothPermission(activity);
    }

    @Override // com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool
    public void requestBluetoothIfNeed(@NotNull FragmentActivity activity, boolean finishOnReject, @NotNull Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        BluetoothPermissionUtil.INSTANCE.requestBluetoothIfNeed(activity, finishOnReject, extension);
    }

    @Override // com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool
    public void showBluetoothPermissionDialog(@NotNull FragmentManager supportFragmentManager, @NotNull SyncDataDialogCallback callback) {
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BluetoothPermissionDialogManager.INSTANCE.getInstance(ApplicationExtKt.getApplication()).showBlueToothPermissionDialog(supportFragmentManager, callback);
    }
}
