package com.xiaomi.fitness.sport.utils;

import android.content.DialogInterface;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1;
import defpackage.av6;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport/utils/SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1 extends av6 {
    final /* synthetic */ Function0<Unit> $fallbackFunction;
    final /* synthetic */ Function0<Unit> $nextStepCallback;

    public SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1(Function0<Unit> function0, Function0<Unit> function1) {
        this.$fallbackFunction = function0;
        this.$nextStepCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(Function0 nextStepCallback, Function0 function0, int i) {
        Intrinsics.checkNotNullParameter(nextStepCallback, "$nextStepCallback");
        if (i == 0) {
            Logger.d(SportBeanHelperExtKt.TAG, "setDeviceWearMode result=" + i);
            nextStepCallback.invoke();
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.Y4);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        super.onDialogClick(dialogName, dialog, which);
        if (which != -1) {
            Function0<Unit> function0 = this.$fallbackFunction;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            final Function0<Unit> function1 = this.$nextStepCallback;
            final Function0<Unit> function2 = this.$fallbackFunction;
            DeviceModelExtKt.setDeviceWearMode(wearableDeviceModel, 0, new Function1() { // from class: han
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportBeanHelperExtKt$checkDeviceWearModeAndSwitchToBandModeIfNeed$1$1.onDialogClick$lambda$0(function1, function2, ((Integer) obj).intValue());
                }
            });
        }
    }
}
