package com.xiaomi.fitness.devicesettings;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1", f = "DeviceSettingsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AlarmSetting>, Object> {
    final /* synthetic */ HuamiApiCaller $apiCaller;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1(HuamiApiCaller huamiApiCaller, Continuation<? super DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1> continuation) {
        super(2, continuation);
        this.$apiCaller = huamiApiCaller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1(this.$apiCaller, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlarmSetting defaultAlarmClocks = HuamiDeviceTool.INSTANCE.getDefaultAlarmClocks();
        HuamiApiCaller huamiApiCaller = this.$apiCaller;
        List<AlarmClockExt> alarms = huamiApiCaller != null ? huamiApiCaller.getAlarms() : null;
        Logger.i("DeviceSettingsComponent", "syncDeviceAlarmsObservable alarm size:" + (alarms != null ? Boxing.boxInt(alarms.size()) : null));
        if (alarms != null && (!alarms.isEmpty())) {
            for (AlarmClockExt alarmClockExt : alarms) {
                HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
                Intrinsics.checkNotNull(alarmClockExt);
                AlarmSettingItem alarmSettingItemClockExtToClockBean = huamiDeviceTool.clockExtToClockBean(alarmClockExt);
                defaultAlarmClocks.replaceItem(alarmSettingItemClockExtToClockBean, alarmSettingItemClockExtToClockBean.getId());
            }
        }
        return defaultAlarmClocks;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AlarmSetting> continuation) {
        return ((DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1$alarmClocks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
