package com.xiaomi.fitness.devicesettings;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.export.sleepai.SleepAiExtKt;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.xms.devicecontral.XmsDeviceControlManager;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1", f = "DeviceSettingsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1(Continuation<? super DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        new XmsDeviceControlManager().clearDevices();
        if (DeviceSettingsPreference.INSTANCE.getDEVICE_MICR_PHONE_STATE_CHANGE_MODE() == 0 && SleepAiExtKt.getMiAicrManagerImp().isSupportMIAIPhoneStateListen()) {
            Logger.i("DeviceSettingsComponent", "handlePacket UNREGISTER_PHONE_USAGE");
            SleepAiExtKt.getMiAicrManagerImp().stopMIAIPhoneStateListen();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
