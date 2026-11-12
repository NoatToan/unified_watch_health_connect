package com.xiaomi.fitness.device.manager.utils;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback;
import defpackage.av6;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionDialogManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "alertDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "showBlueToothPermissionDialog", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lcom/xiaomi/fitness/device/manager/export/SyncDataDialogCallback;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPermissionDialogManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile BluetoothPermissionDialogManager instance;

    @Nullable
    private CommonDialog<?> alertDialog;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionDialogManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionDialogManager;", "getInstance", "context", "Landroid/content/Context;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBluetoothPermissionDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothPermissionDialogManager.kt\ncom/xiaomi/fitness/device/manager/utils/BluetoothPermissionDialogManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BluetoothPermissionDialogManager getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BluetoothPermissionDialogManager bluetoothPermissionDialogManager = BluetoothPermissionDialogManager.instance;
            if (bluetoothPermissionDialogManager == null) {
                synchronized (this) {
                    bluetoothPermissionDialogManager = BluetoothPermissionDialogManager.instance;
                    if (bluetoothPermissionDialogManager == null) {
                        bluetoothPermissionDialogManager = new BluetoothPermissionDialogManager(context, null);
                        BluetoothPermissionDialogManager.instance = bluetoothPermissionDialogManager;
                    }
                }
            }
            return bluetoothPermissionDialogManager;
        }
    }

    public /* synthetic */ BluetoothPermissionDialogManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void showBlueToothPermissionDialog(@NotNull FragmentManager supportFragmentManager, @NotNull final SyncDataDialogCallback callback) {
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CommonDialog<?> commonDialog = this.alertDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialog2 = this.alertDialog;
            if (commonDialog2 != null && commonDialog2.isAdded()) {
                Logger.i("showBlueToothPermissionDialog() added", new Object[0]);
                try {
                    CommonDialog<?> commonDialog3 = this.alertDialog;
                    if (commonDialog3 != null) {
                        commonDialog3.dismiss();
                    }
                    this.alertDialog = null;
                } catch (Exception e) {
                    Logger.i("showBlueToothPermissionDialog() dismiss exception " + e.getMessage(), new Object[0]);
                }
            }
            if (this.alertDialog == null) {
                this.alertDialog = new CommonDialog.c("ble_data_desc").setDialogTitle(uzi.K).setDialogDescription(uzi.J).setPositiveText(uzi.f36320a).setNegativeText(uzi.o2).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
            }
            CommonDialog<?> commonDialog4 = this.alertDialog;
            if (commonDialog4 != null) {
                commonDialog4.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.utils.BluetoothPermissionDialogManager.showBlueToothPermissionDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            callback.onRejectButtonClicked();
                            this.alertDialog = null;
                        } else {
                            if (which != -1) {
                                return;
                            }
                            callback.onAgreeButtonClicked();
                            this.alertDialog = null;
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog5 = this.alertDialog;
            if (commonDialog5 != null) {
                commonDialog5.showIfNeed(supportFragmentManager);
            }
        }
    }

    private BluetoothPermissionDialogManager(Context context) {
    }
}
