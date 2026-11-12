package com.xiaomi.fitness.devicesettings.common.extensions;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import defpackage.eu6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt$syncHuamiAlarm$1$1", f = "DeviceModelExt.kt", i = {}, l = {607}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceModelExtKt$syncHuamiAlarm$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlarmSetting $alarmClocks;
    final /* synthetic */ eu6<Boolean> $callback;
    final /* synthetic */ WearableDeviceModel $this_syncHuamiAlarm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceModelExtKt$syncHuamiAlarm$1$1(WearableDeviceModel wearableDeviceModel, AlarmSetting alarmSetting, eu6<Boolean> eu6Var, Continuation<? super DeviceModelExtKt$syncHuamiAlarm$1$1> continuation) {
        super(2, continuation);
        this.$this_syncHuamiAlarm = wearableDeviceModel;
        this.$alarmClocks = alarmSetting;
        this.$callback = eu6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceModelExtKt$syncHuamiAlarm$1$1(this.$this_syncHuamiAlarm, this.$alarmClocks, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DeviceModelExtKt$syncHuamiAlarm$1$1$success$1 deviceModelExtKt$syncHuamiAlarm$1$1$success$1 = new DeviceModelExtKt$syncHuamiAlarm$1$1$success$1(this.$this_syncHuamiAlarm, this.$alarmClocks, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, deviceModelExtKt$syncHuamiAlarm$1$1$success$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(this.$this_syncHuamiAlarm.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, this.$alarmClocks);
        }
        Logger.i(" sync AlarmClock result:" + zBooleanValue, new Object[0]);
        this.$callback.onResult(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceModelExtKt$syncHuamiAlarm$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
