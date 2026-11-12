package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1", f = "BaseHuamiHealthMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HRDetect>, Object> {
    int label;
    final /* synthetic */ BaseHuamiHealthMonitorViewModel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1(BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel, Continuation<? super BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1> continuation) {
        super(2, continuation);
        this.this$0 = baseHuamiHealthMonitorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        if (deviceModel == null) {
            return null;
        }
        SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT);
        Object objValueToObject = settingItemValue != null ? settingItemValue.valueToObject(HRDetect.class) : null;
        if (objValueToObject instanceof HRDetect) {
            return (HRDetect) objValueToObject;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HRDetect> continuation) {
        return ((BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
