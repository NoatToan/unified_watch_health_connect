package com.xiaomi.fitness.devicesettings.huami.goalremind;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$syncGoalRemindConfig$2$1", f = "GoalRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGoalRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/goalremind/GoalRemindViewModel$syncGoalRemindConfig$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class GoalRemindViewModel$syncGoalRemindConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $enable;
    final /* synthetic */ WearableDeviceModel $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRemindViewModel$syncGoalRemindConfig$2$1(WearableDeviceModel wearableDeviceModel, boolean z, Continuation<? super GoalRemindViewModel$syncGoalRemindConfig$2$1> continuation) {
        super(2, continuation);
        this.$it = wearableDeviceModel;
        this.$enable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoalRemindViewModel$syncGoalRemindConfig$2$1(this.$it, this.$enable, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int rainbowItemGoal = UserProfileExtKt.getRainbowItemGoal(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false), 1);
        boolean zEnableGoalRemind = DeviceModelExtKt.enableGoalRemind(this.$it, this.$enable, rainbowItemGoal);
        Logger.i(GoalRemindViewModel.TAG, "setGoalRemindSwitch step: " + rainbowItemGoal + " success:" + zEnableGoalRemind);
        GoalRemindSetting goalRemindSetting = new GoalRemindSetting();
        goalRemindSetting.setEnable(this.$enable);
        DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(this.$it.getDid(), DeviceSettingConfigKey.KEY_GOAL_REMIND, goalRemindSetting);
        return Boxing.boxBoolean(zEnableGoalRemind);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((GoalRemindViewModel$syncGoalRemindConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
