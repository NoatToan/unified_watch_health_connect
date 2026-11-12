package com.xiaomi.fitness.stand;

import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.stand.StandDetectComponent;
import com.xiaomi.fitness.stand.export.StandDetectExtKt;
import com.xiaomi.fitness.stand.export.StandDetectManager;
import com.xiaomi.fitness.stand.extensions.StandExtKt;
import defpackage.h1j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/stand/StandDetectComponent;", "", "<init>", "()V", "startStandDetect", "", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "stand-detect")
public final class StandDetectComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair startStandDetect$lambda$0(boolean z, StandDetectInternalManager instance) {
        Intrinsics.checkNotNullParameter(instance, "$instance");
        boolean standReminderEnable = z ? false : instance.getStandReminderEnable();
        Logger.i("addFuncName", "stand-detect: " + standReminderEnable);
        if (standReminderEnable) {
            return new Pair(ResourceExtKt.getString(h1j.m), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStandDetect$lambda$1(StandDetectInternalManager instance, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(instance, "$instance");
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, bool3)) {
            AnyExtKt.io$default(null, new StandDetectComponent$startStandDetect$2$1(instance, null), 1, null);
        } else {
            instance.setStandReminderEnable(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @ComponentTask(notLaterThan = 3)
    public final void startStandDetect() {
        final boolean z;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            z = true;
            if (!wearableDeviceModel.getIsDeviceConnected() || (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SEDENTARY) && !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER) && StandDetectExtKt.getInstance(StandDetectManager.INSTANCE).supportStandDetect())) {
                z = false;
            }
        } else {
            z = false;
        }
        final StandDetectInternalManager standExtKt = StandExtKt.getInstance(StandDetectInternalManager.INSTANCE);
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        notificationPermission.addFuncName(new Function0() { // from class: e9o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandDetectComponent.startStandDetect$lambda$0(z, standExtKt);
            }
        });
        notificationPermission.registerListener(new Function2() { // from class: f9o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StandDetectComponent.startStandDetect$lambda$1(standExtKt, (Boolean) obj, (Boolean) obj2);
            }
        });
    }
}
