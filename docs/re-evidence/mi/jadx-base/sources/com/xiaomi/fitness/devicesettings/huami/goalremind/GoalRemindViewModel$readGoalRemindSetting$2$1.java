package com.xiaomi.fitness.devicesettings.huami.goalremind;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.GoalRemindSetting;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$readGoalRemindSetting$2$1", f = "GoalRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GoalRemindViewModel$readGoalRemindSetting$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ WearableDeviceModel $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRemindViewModel$readGoalRemindSetting$2$1(WearableDeviceModel wearableDeviceModel, Continuation<? super GoalRemindViewModel$readGoalRemindSetting$2$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoalRemindViewModel$readGoalRemindSetting$2$1(this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(this.$it.getDid(), DeviceSettingConfigKey.KEY_GOAL_REMIND).valueToObject(GoalRemindSetting.class);
        if (objValueToObject != null) {
            return Boxing.boxBoolean(((GoalRemindSetting) objValueToObject).isEnable());
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((GoalRemindViewModel$readGoalRemindSetting$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
