package com.xiaomi.fit.fitness.di;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager;
import com.xiaomi.fit.fitness.device.cgm.receiver.WearThirdPartyDataHandler;
import com.xiaomi.fit.fitness.device.cgm.utils.CGMDeviceUtils;
import com.xiaomi.fit.fitness.device.mi.receive.FitnessReceiverHandler;
import com.xiaomi.fit.fitness.di.FitnessSyncComponent;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/di/FitnessSyncComponent;", "", "<init>", "()V", "deviceSync", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceSync", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "deviceSync$delegate", "Lkotlin/Lazy;", "fitnessDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "getFitnessDataHandler", "()Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "fitnessDataHandler$delegate", "thirdPartyDataHandler", "Lcom/xiaomi/fit/fitness/device/cgm/receiver/WearThirdPartyDataHandler;", "getThirdPartyDataHandler", "()Lcom/xiaomi/fit/fitness/device/cgm/receiver/WearThirdPartyDataHandler;", "thirdPartyDataHandler$delegate", "addDataHandler", "", "addDataReceiverHandler", "listenDeviceChangedEvent", "addDataChangedListenerIfNeed", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "FitnessSyncManager")
public final class FitnessSyncComponent {

    @NotNull
    public static final String TAG = "FitnessSyncComponent";

    /* JADX INFO: renamed from: deviceSync$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSync = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncComponent.deviceSync_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: fitnessDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ew9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncComponent.fitnessDataHandler_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: thirdPartyDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy thirdPartyDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncComponent.thirdPartyDataHandler_delegate$lambda$2();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDataChangedListenerIfNeed() {
        WearableDeviceModel cGMDevice = CGMDeviceUtils.INSTANCE.getCGMDevice();
        if (cGMDevice == null) {
            return;
        }
        CgmBloodSugarManager.INSTANCE.getInstance().addGlucoseDataListener(cGMDevice);
    }

    private final void addDataReceiverHandler() {
        FitnessLogUtils.i(TAG, "addDataReceiverHandler");
        getDeviceSync().removeDataHandler(102, getFitnessDataHandler());
        getDeviceSync().addDataHandler(102, getFitnessDataHandler());
        getDeviceSync().removeDataHandler(20, getThirdPartyDataHandler());
        getDeviceSync().addDataHandler(20, getThirdPartyDataHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceContact deviceSync_delegate$lambda$0() {
        return DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessReceiverHandler fitnessDataHandler_delegate$lambda$1() {
        return new FitnessReceiverHandler();
    }

    private final DeviceContact getDeviceSync() {
        return (DeviceContact) this.deviceSync.getValue();
    }

    private final DataHandlerWrapper getFitnessDataHandler() {
        return (DataHandlerWrapper) this.fitnessDataHandler.getValue();
    }

    private final WearThirdPartyDataHandler getThirdPartyDataHandler() {
        return (WearThirdPartyDataHandler) this.thirdPartyDataHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenDeviceChangedEvent$lambda$3(FitnessSyncComponent this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "listenDeviceChangedEvent: onDeviceChange " + wearableDeviceModel);
        this$0.addDataChangedListenerIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearThirdPartyDataHandler thirdPartyDataHandler_delegate$lambda$2() {
        return new WearThirdPartyDataHandler();
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void addDataHandler() {
        FitnessLogUtils.i("fitness-sync", "addDataHandler");
        addDataReceiverHandler();
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void listenDeviceChangedEvent() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fit.fitness.di.FitnessSyncComponent.listenDeviceChangedEvent.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onBind(String did, boolean isRebind) {
                FitnessSyncComponent.this.addDataChangedListenerIfNeed();
            }
        });
        DeviceManagerExtKt.getInstance(companion).addDeviceChangeListener(new Function1() { // from class: cw9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FitnessSyncComponent.listenDeviceChangedEvent$lambda$3(this.f14799a, (WearableDeviceModel) obj);
            }
        });
    }
}
