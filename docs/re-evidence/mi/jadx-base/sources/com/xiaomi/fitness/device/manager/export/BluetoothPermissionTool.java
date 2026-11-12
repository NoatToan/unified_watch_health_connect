package com.xiaomi.fitness.device.manager.export;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J3\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000eH&J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "", "needRequestBluetoothPermission", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "checkBluetoothPermission", "hasBluetoothConnectPermission", "requestBluetoothIfNeed", "", "finishOnReject", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "showBluetoothPermissionDialog", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lcom/xiaomi/fitness/device/manager/export/SyncDataDialogCallback;", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BluetoothPermissionTool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool$Companion;", "", "<init>", "()V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void requestBluetoothIfNeed$default(BluetoothPermissionTool bluetoothPermissionTool, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestBluetoothIfNeed");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            bluetoothPermissionTool.requestBluetoothIfNeed(fragmentActivity, z, function1);
        }
    }

    boolean checkBluetoothPermission();

    boolean hasBluetoothConnectPermission();

    boolean needRequestBluetoothPermission(@NotNull FragmentActivity activity);

    void requestBluetoothIfNeed(@NotNull FragmentActivity activity, boolean finishOnReject, @NotNull Function1<? super MultiplePermissionsBuilder, Unit> extension);

    void showBluetoothPermissionDialog(@NotNull FragmentManager supportFragmentManager, @NotNull SyncDataDialogCallback callback);
}
