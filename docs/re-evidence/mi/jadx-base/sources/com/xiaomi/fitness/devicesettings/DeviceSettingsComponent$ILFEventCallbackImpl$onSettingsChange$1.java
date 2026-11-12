package com.xiaomi.fitness.devicesettings;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import defpackage.ld8;
import defpackage.y08;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1", f = "DeviceSettingsComponent.kt", i = {0}, l = {847}, m = "invokeSuspend", n = {"currentDeviceModel"}, s = {"L$0"})
public final class DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1(Continuation<? super DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WearableDeviceModel wearableDeviceModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 == null) {
                Logger.e("DeviceSettingsComponent", "onSettingsChange currentDeviceModel is null");
                return Unit.INSTANCE;
            }
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel2));
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1 deviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1 = new DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1(huaMiApiCaller, null);
            this.L$0 = wearableDeviceModel2;
            this.label = 1;
            obj = BuildersKt.withContext(io2, deviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            wearableDeviceModel = wearableDeviceModel2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wearableDeviceModel = (WearableDeviceModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AlarmSetting alarmSetting = (AlarmSetting) obj;
        List<AlarmSettingItem> alarmItems = alarmSetting.getAlarmItems();
        Intrinsics.checkNotNullExpressionValue(alarmItems, "getAlarmItems(...)");
        if (true ^ alarmItems.isEmpty()) {
            Logger.i("DeviceSettingsComponent", "syncDeviceAlarms result:true");
            DeviceSettingsSyncer.INSTANCE.setDeviceAlarmSyncSrc(wearableDeviceModel.getDid(), 2);
            DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, alarmSetting);
            ld8.c().l(new y08(HuamiDeviceTool.INSTANCE.getVisibleAlarmClock(alarmItems)));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
