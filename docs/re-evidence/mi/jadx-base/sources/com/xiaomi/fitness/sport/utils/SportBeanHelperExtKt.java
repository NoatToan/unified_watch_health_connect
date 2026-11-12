package com.xiaomi.fitness.sport.utils;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import defpackage.av6;
import defpackage.c1j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a$\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\u001a.\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\u001a\u001c\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005\"\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005¨\u0006\u001f"}, d2 = {"TAG", "", "supportsSportBean", "", "getSupportsSportBean", "()Z", "supportsSportBeanAccessoryWithNoPrimaryDevice", "getSupportsSportBeanAccessoryWithNoPrimaryDevice", "supportsSportBeanByDeviceModel", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "supportRunningBeanAsAccessoryDevice", "getSupportRunningBeanAsAccessoryDevice", "supportRunningBeanAsPrimaryAndNoAccessory", "getSupportRunningBeanAsPrimaryAndNoAccessory", "showBandLowBatteryDialog", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "showStatusChangeDialog", "isModeChangeDialog", "callback", "Lkotlin/Function0;", "checkDeviceWearModeAndSwitchToBandModeIfNeed", "fragmentManager", "fallbackFunction", "nextStepCallback", "checkAllConnectedDevicesAndSetWearMode", "wearModeWrapper", "Lcom/xiaomi/fitness/sport/utils/WearModeWrapper;", "function", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportBeanHelperExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportBeanHelperExt.kt\ncom/xiaomi/fitness/sport/utils/SportBeanHelperExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1863#2,2:198\n*S KotlinDebug\n*F\n+ 1 SportBeanHelperExt.kt\ncom/xiaomi/fitness/sport/utils/SportBeanHelperExtKt\n*L\n44#1:198,2\n*E\n"})
public final class SportBeanHelperExtKt {

    @NotNull
    public static final String TAG = "SportBeanHelperExt";

    public static final void checkAllConnectedDevicesAndSetWearMode(@NotNull final WearModeWrapper wearModeWrapper, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(wearModeWrapper, "wearModeWrapper");
        Intrinsics.checkNotNullParameter(function, "function");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            DeviceModelExtKt.getDeviceWearMode(wearableDeviceModel, new Function1() { // from class: fan
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportBeanHelperExtKt.checkAllConnectedDevicesAndSetWearMode$lambda$2(wearModeWrapper, function, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (getSupportRunningBeanAsAccessoryDevice()) {
            wearModeWrapper.setWearMode(1);
        }
        function.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAllConnectedDevicesAndSetWearMode$lambda$2(WearModeWrapper wearModeWrapper, Function0 function, int i) {
        Intrinsics.checkNotNullParameter(wearModeWrapper, "$wearModeWrapper");
        Intrinsics.checkNotNullParameter(function, "$function");
        wearModeWrapper.setWearMode(i);
        if (getSupportRunningBeanAsAccessoryDevice()) {
            wearModeWrapper.setWearMode(1);
        }
        function.invoke();
        return Unit.INSTANCE;
    }

    public static final void checkDeviceWearModeAndSwitchToBandModeIfNeed(@NotNull final FragmentManager fragmentManager, @Nullable final Function0<Unit> function0, @NotNull final Function0<Unit> nextStepCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(nextStepCallback, "nextStepCallback");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null && function0 != null) {
            function0.invoke();
        }
        if (wearableDeviceModel != null) {
            DeviceModelExtKt.getDeviceWearMode(wearableDeviceModel, new Function1() { // from class: gan
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportBeanHelperExtKt.checkDeviceWearModeAndSwitchToBandModeIfNeed$lambda$1(nextStepCallback, fragmentManager, function0, ((Integer) obj).intValue());
                }
            });
        }
    }

    public static /* synthetic */ void checkDeviceWearModeAndSwitchToBandModeIfNeed$default(FragmentManager fragmentManager, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        checkDeviceWearModeAndSwitchToBandModeIfNeed(fragmentManager, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceWearModeAndSwitchToBandModeIfNeed$lambda$1(Function0 nextStepCallback, FragmentManager fragmentManager, Function0 function0, int i) {
        CommonDialog commonDialogAddDialogCallback;
        Intrinsics.checkNotNullParameter(nextStepCallback, "$nextStepCallback");
        Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        Logger.d(TAG, "checkDeviceWearModeAndProceedIfNeed deviceWearMode=" + i);
        if (i == 0) {
            nextStepCallback.invoke();
        } else {
            int i2 = c1j.common_not_support;
            if (i == 1) {
                i2 = c1j.F5;
            } else if (i == 2) {
                i2 = c1j.E5;
            }
            CommonDialog commonDialogCreate = new CommonDialog.c("sport_mode_does_not_match").setDialogTitle(c1j.g0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(ResourceExtKt.getString(c1j.a0, ResourceExtKt.getString(i2), ResourceExtKt.getString(i2)))).setPositiveText(c1j.o1).setNegativeText(c1j.c).create();
            if (commonDialogCreate != null && (commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1(function0, nextStepCallback))) != null) {
                commonDialogAddDialogCallback.showIfNeed(fragmentManager);
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean getSupportRunningBeanAsAccessoryDevice() {
        Iterator<T> it = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels().iterator();
        while (it.hasNext()) {
            if (supportsSportBeanByDeviceModel((WearableDeviceModel) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getSupportRunningBeanAsPrimaryAndNoAccessory() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        return DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels().isEmpty() && supportsSportBeanByDeviceModel((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
    }

    public static final boolean getSupportsSportBean() {
        return getSupportRunningBeanAsAccessoryDevice();
    }

    public static final boolean getSupportsSportBeanAccessoryWithNoPrimaryDevice() {
        WearableDeviceModel wearableDeviceModel;
        return getSupportRunningBeanAsAccessoryDevice() && ((wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || !wearableDeviceModel.getIsDeviceConnected());
    }

    public static final void showBandLowBatteryDialog(@NotNull FragmentManager supportFragmentManager) {
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        final CommonDialog commonDialogCreate = new CommonDialog.c("lowBattery").setDialogTitle(c1j.S).setDialogDescription(c1j.h4).setCancelable(false).setPositiveText(c1j.K).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt.showBandLowBatteryDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    commonDialogCreate.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(supportFragmentManager);
    }

    public static final void showStatusChangeDialog(boolean z, @NotNull FragmentManager supportFragmentManager, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CommonDialog commonDialogCreate = new CommonDialog.c("statusChange").setDialogTitle(z ? c1j.c0 : c1j.g4).setDialogDescription(z ? c1j.i0 : c1j.K2).setPositiveText(c1j.K).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt.showStatusChangeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    callback.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(supportFragmentManager);
    }

    public static final boolean supportsSportBeanByDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        return (wearableDeviceModel == null || (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(wearableDeviceModel.getDid()) & 1024) == 0 || !wearableDeviceModel.getIsDeviceConnected()) ? false : true;
    }
}
