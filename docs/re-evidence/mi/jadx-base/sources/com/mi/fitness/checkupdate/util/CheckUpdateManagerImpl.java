package com.mi.fitness.checkupdate.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mi.fitness.checkupdate.UpdateHelper;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ota.SilentUpgradeManager;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment;
import com.mi.fitness.checkupdate.util.CheckUpdateManagerImpl;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.av6;
import defpackage.dih;
import defpackage.yyi;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J \u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016J\b\u0010&\u001a\u00020\u0011H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\"\u00102\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0014H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/mi/fitness/checkupdate/util/CheckUpdateManagerImpl;", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "<init>", "()V", "mHasPendingCheckUpdate", "", "getMHasPendingCheckUpdate", "()Z", "setMHasPendingCheckUpdate", "(Z)V", "appManager", "Lcom/xiaomi/fitness/common/app/AppManager;", "getAppManager", "()Lcom/xiaomi/fitness/common/app/AppManager;", "setAppManager", "(Lcom/xiaomi/fitness/common/app/AppManager;)V", "checkUpdate", "", "onResult", "Lkotlin/Function1;", "Ljava/io/Serializable;", "Lkotlin/ParameterName;", "name", "result", "handleCheckUpdateResult", "context", "Landroid/content/Context;", "setHasPendingCheckUpdate", "hasPendingCheckUpdate", "lastCheckUpdateTime", "", "checkHasPendingCheckUpdate", "manualUpgrade", "filePath", "", "isSilentUpgrade", "supportSilentUpgrade", "stopMass", "cancelMass", "setSilentDownloadOnlyWifi", "did", "isOpen", "isCurrentDeviceSupportSilent", "updateDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "getUpdateDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setUpdateDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "showFirmwareUpdateDialog", "force", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckUpdateManagerImpl implements CheckUpdateManager {

    @NotNull
    private static final String TAG = "CheckUpdateManagerImpl";
    public AppManager appManager;
    private long lastCheckUpdateTime = System.currentTimeMillis();
    private boolean mHasPendingCheckUpdate;

    @Nullable
    private CommonDialog<DialogParams> updateDialog;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkHasPendingCheckUpdate$lambda$4(CheckUpdateManagerImpl this$0, Serializable result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        Activity currentActivity = this$0.getAppManager().getCurrentActivity();
        if (currentActivity != null) {
            this$0.handleCheckUpdateResult(currentActivity, result);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$0(Function1 onResult, Serializable result) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(result, "result");
        onResult.invoke2(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "checkUpdate: e " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    private final void showFirmwareUpdateDialog(final Context context, boolean force, final Serializable result) {
        CommonDialog<DialogParams> commonDialog = this.updateDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || context == null || !(context instanceof FragmentActivity)) {
            return;
        }
        DialogParams.DialogDescriptionString dialogDescriptionString = force ? new DialogParams.DialogDescriptionString(((FragmentActivity) context).getString(yyi.V, DeviceModelExtKt.getName(wearableDeviceModel))) : new DialogParams.DialogDescriptionString(((FragmentActivity) context).getString(yyi.U, DeviceModelExtKt.getName(wearableDeviceModel)));
        CommonDialog.c cVar = new CommonDialog.c("commonDialog");
        cVar.setDialogTitle(yyi.W).setDialogDescriptionString(dialogDescriptionString);
        if (force) {
            cVar.setPositiveText(yyi.Y);
            cVar.setCancelable(false);
            cVar.setCanceledOnTouchOutside(false);
            cVar.setCanceledOnBackPressed(false);
        } else {
            cVar.setNegativeText(yyi.m0).setPositiveText(yyi.Z);
        }
        CommonDialog<DialogParams> commonDialogAddDialogCallback = cVar.create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.util.CheckUpdateManagerImpl.showFirmwareUpdateDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -3) {
                    if (which == -2) {
                        if (result instanceof LatestVersion) {
                            CheckUpdatePreferenceSupport.INSTANCE.setIgnoreFirmwareUpdate(wearableDeviceModel.getDid(), ((LatestVersion) result).getVersion());
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                UpdateHelper.INSTANCE.goUpgradeFragment(context, result);
            }
        });
        this.updateDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.show(((FragmentActivity) context).getSupportFragmentManager(), "");
        }
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void cancelMass() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            SilentUpgradeExtKt.cancelMass(wearableDeviceModel);
        }
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void checkHasPendingCheckUpdate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastCheckUpdateTime;
        TimeUnit timeUnit = TimeUnit.HOURS;
        Logger.i(TAG, "checkHasPendingCheckUpdate() called " + j + ", " + timeUnit.toMillis(3L));
        if (this.mHasPendingCheckUpdate || jCurrentTimeMillis - this.lastCheckUpdateTime >= timeUnit.toMillis(3L)) {
            this.mHasPendingCheckUpdate = false;
            checkUpdate(new Function1() { // from class: ou3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CheckUpdateManagerImpl.checkHasPendingCheckUpdate$lambda$4(this.f29679a, (Serializable) obj);
                }
            });
            this.lastCheckUpdateTime = jCurrentTimeMillis;
        }
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void checkUpdate(@NotNull final Function1<? super Serializable, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(TAG, "checkUpdate deviceModel.isBlueTooth " + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isBluetooth(wearableDeviceModel)) : null));
        UpdateHelper.INSTANCE.doUpdateRequest(new Function1() { // from class: pu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckUpdateManagerImpl.checkUpdate$lambda$0(onResult, (Serializable) obj);
            }
        }, new Function1() { // from class: qu3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CheckUpdateManagerImpl.checkUpdate$lambda$1((ApiException) obj);
            }
        });
    }

    @NotNull
    public final AppManager getAppManager() {
        AppManager appManager = this.appManager;
        if (appManager != null) {
            return appManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appManager");
        return null;
    }

    public final boolean getMHasPendingCheckUpdate() {
        return this.mHasPendingCheckUpdate;
    }

    @Nullable
    public final CommonDialog<DialogParams> getUpdateDialog() {
        return this.updateDialog;
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void handleCheckUpdateResult(@Nullable Context context, @NotNull Serializable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if (result instanceof LatestVersion) {
                LatestVersion latestVersion = (LatestVersion) result;
                boolean zIsIgnoreFirmwareUpdate = CheckUpdatePreferenceSupport.INSTANCE.isIgnoreFirmwareUpdate(wearableDeviceModel.getDid(), latestVersion.getVersion());
                if (!latestVersion.getIsNeedUpdate() || zIsIgnoreFirmwareUpdate) {
                    return;
                }
                showFirmwareUpdateDialog(context, latestVersion.getForce(), result);
                return;
            }
            if (result instanceof OtaUpgradeResult) {
                OtaUpgradeResult otaUpgradeResult = (OtaUpgradeResult) result;
                if (otaUpgradeResult.isNeedUpdate()) {
                    showFirmwareUpdateDialog(context, otaUpgradeResult.isForce(), result);
                }
            }
        }
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public boolean isCurrentDeviceSupportSilent() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "CheckUpdateManagerImpl isCurrentDeviceSupportSilent deviceModel is null");
            return false;
        }
        boolean zSupportSilentUpgrade = SilentUpgradeExtKt.supportSilentUpgrade(wearableDeviceModel);
        Logger.i(TAG, "CheckUpdateManagerImpl isCurrentDeviceSupportSilent:" + zSupportSilentUpgrade);
        return zSupportSilentUpgrade;
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void manualUpgrade(@NotNull Context context, @NotNull String filePath, boolean isSilentUpgrade) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Logger.d(TAG, "manualUpgrade() called with: context = " + context + ", filePath = " + filePath + ", isSilentUpgrade = " + isSilentUpgrade);
        if (isSilentUpgrade) {
            SilentUpgradeManager.INSTANCE.upgradeIfNeed(filePath);
            return;
        }
        FragmentParams.b bVarE = new FragmentParams.b().e(BluetoothUpgradeFragment.class);
        Bundle bundle = new Bundle();
        bundle.putString("key_sd_upgrade_path", filePath);
        dih.a().e(context, bVarE.c(bundle).b());
    }

    public final void setAppManager(@NotNull AppManager appManager) {
        Intrinsics.checkNotNullParameter(appManager, "<set-?>");
        this.appManager = appManager;
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void setHasPendingCheckUpdate(boolean hasPendingCheckUpdate) {
        this.mHasPendingCheckUpdate = hasPendingCheckUpdate;
    }

    public final void setMHasPendingCheckUpdate(boolean z) {
        this.mHasPendingCheckUpdate = z;
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void setSilentDownloadOnlyWifi(@NotNull String did, boolean isOpen) {
        Intrinsics.checkNotNullParameter(did, "did");
        CheckUpdatePreferenceSupport.INSTANCE.setSilentUpgradeOpen(did, isOpen);
    }

    public final void setUpdateDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.updateDialog = commonDialog;
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public void stopMass() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            SilentUpgradeExtKt.pauseMass(wearableDeviceModel);
        }
    }

    @Override // com.mi.fitness.checkupdate.export.CheckUpdateManager
    public boolean supportSilentUpgrade() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        return SilentUpgradeExtKt.supportSilentUpgrade(wearableDeviceModel);
    }
}
