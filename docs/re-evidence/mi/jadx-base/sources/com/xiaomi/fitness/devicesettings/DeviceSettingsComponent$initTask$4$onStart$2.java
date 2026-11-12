package com.xiaomi.fitness.devicesettings;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSyncHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$initTask$4$onStart$2", f = "DeviceSettingsComponent.kt", i = {}, l = {694}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSettingsComponent$initTask$4$onStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $deviceModel;
    final /* synthetic */ String $did;
    int label;
    final /* synthetic */ DeviceSettingsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsComponent$initTask$4$onStart$2(WearableDeviceModel wearableDeviceModel, String str, DeviceSettingsComponent deviceSettingsComponent, Continuation<? super DeviceSettingsComponent$initTask$4$onStart$2> continuation) {
        super(2, continuation);
        this.$deviceModel = wearableDeviceModel;
        this.$did = str;
        this.this$0 = deviceSettingsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingsComponent$initTask$4$onStart$2(this.$deviceModel, this.$did, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceSettingsSyncer deviceSettingsSyncer = DeviceSettingsSyncer.INSTANCE;
            deviceSettingsSyncer.syncBluetoothLanguage(this.$deviceModel);
            String str = this.$did;
            this.label = 1;
            if (deviceSettingsSyncer.syncZenModeMode(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.syncMiuiTodoIfNeed();
        BloodPressureRemindDeviceHelper.INSTANCE.updateBloodPressureMeasureRemindDataToDevice(null);
        ECGMeasureRemindSyncHelper.INSTANCE.updateRemindDataToDevice();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceSettingsComponent$initTask$4$onStart$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
