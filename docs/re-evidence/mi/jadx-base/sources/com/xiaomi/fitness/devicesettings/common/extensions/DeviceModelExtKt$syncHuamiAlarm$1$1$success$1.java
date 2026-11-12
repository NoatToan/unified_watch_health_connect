package com.xiaomi.fitness.devicesettings.common.extensions;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt$syncHuamiAlarm$1$1$success$1", f = "DeviceModelExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceModelExtKt$syncHuamiAlarm$1$1$success$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AlarmSetting $alarmClocks;
    final /* synthetic */ WearableDeviceModel $this_syncHuamiAlarm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceModelExtKt$syncHuamiAlarm$1$1$success$1(WearableDeviceModel wearableDeviceModel, AlarmSetting alarmSetting, Continuation<? super DeviceModelExtKt$syncHuamiAlarm$1$1$success$1> continuation) {
        super(2, continuation);
        this.$this_syncHuamiAlarm = wearableDeviceModel;
        this.$alarmClocks = alarmSetting;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceModelExtKt$syncHuamiAlarm$1$1$success$1(this.$this_syncHuamiAlarm, this.$alarmClocks, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this.$this_syncHuamiAlarm));
        return Boxing.boxBoolean(huaMiApiCaller != null ? huaMiApiCaller.setAlarmSync(HuamiDeviceTool.INSTANCE.getAlarmClockExt(this.$alarmClocks)) : false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DeviceModelExtKt$syncHuamiAlarm$1$1$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
