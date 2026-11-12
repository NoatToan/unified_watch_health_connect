package com.xiaomi.hm.health.device.headset.viewmodel;

import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrBroadcastType;
import com.xiaomi.hm.health.device.headset.vo.HeadsetSportSettingVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HeadSettingViewModel c;
    public final /* synthetic */ HrBroadcastType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1(Continuation continuation, HeadSettingViewModel headSettingViewModel, HrBroadcastType hrBroadcastType) {
        super(2, continuation);
        this.c = headSettingViewModel;
        this.d = hrBroadcastType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1 headSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1 = new HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1(continuation, this.c, this.d);
        headSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1.b = obj;
        return headSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadSettingViewModel$setHrBroadcast$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HeadsetSportSetting headsetSportSetting;
        HeadsetDevice headsetDevice;
        Boolean boolBoxBoolean;
        HeadsetSportSetting headsetSportSetting2;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HeadsetSportSettingVo headsetSportSettingVo = (HeadsetSportSettingVo) this.c._headsetSportSetting.getValue();
        HeadsetSportSetting headsetSportSettingCopy$default = null;
        headsetSportSettingCopy$default = null;
        HeadsetSportSetting headsetSportSettingCopy$default2 = (headsetSportSettingVo == null || (headsetSportSetting = headsetSportSettingVo.getHeadsetSportSetting()) == null) ? null : HeadsetSportSetting.copy$default(headsetSportSetting, 0, false, false, this.d, 7, null);
        boolean zBooleanValue = (headsetSportSettingCopy$default2 == null || (headsetDevice = (HeadsetDevice) this.c.f()) == null || (boolBoxBoolean = Boxing.boxBoolean(headsetDevice.setHeadsetSport(headsetSportSettingCopy$default2))) == null) ? false : boolBoxBoolean.booleanValue();
        if (zBooleanValue) {
            HeadsetSportSettingVo headsetSportSettingVo2 = (HeadsetSportSettingVo) this.c._headsetSportSetting.getValue();
            if (headsetSportSettingVo2 != null && (headsetSportSetting2 = headsetSportSettingVo2.getHeadsetSportSetting()) != null) {
                headsetSportSettingCopy$default = HeadsetSportSetting.copy$default(headsetSportSetting2, 0, false, false, this.d, 7, null);
            }
            HeadsetSportSettingVo headsetSportSettingVo3 = (HeadsetSportSettingVo) this.c._headsetSportSetting.getValue();
            if (headsetSportSettingVo3 != null) {
                headsetSportSettingVo3.setHeadsetSportSetting(headsetSportSettingCopy$default);
            }
        } else {
            HeadsetSportSettingVo headsetSportSettingVo4 = (HeadsetSportSettingVo) this.c._headsetSportSetting.getValue();
            this.c._headsetSportSetting.postValue(headsetSportSettingVo4 != null ? HeadsetSportSettingVo.copy$default(headsetSportSettingVo4, null, false, 3, null) : null);
        }
        this.c.a(zBooleanValue);
        return Unit.INSTANCE;
    }
}
