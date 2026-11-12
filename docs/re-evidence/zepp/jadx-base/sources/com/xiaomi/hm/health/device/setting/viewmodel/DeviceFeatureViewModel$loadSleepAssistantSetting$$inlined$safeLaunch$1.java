package com.xiaomi.hm.health.device.setting.viewmodel;

import com.huami.device.feature.health.HealthDetect;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.vo.SleepAssistantVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceFeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1(Continuation continuation, DeviceFeatureViewModel deviceFeatureViewModel) {
        super(2, continuation);
        this.c = deviceFeatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1 deviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1(continuation, this.c);
        deviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.c.sleepAssistantLiveData.postValue(new SleepAssistantVo(CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_QINLING).contains(this.c.getDeviceSource()), HealthDetect.INSTANCE.getUserConfig().getSleepAssistEnable()));
        return Unit.INSTANCE;
    }
}
