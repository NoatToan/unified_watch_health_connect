package com.xiaomi.hm.health.device.headset.viewmodel;

import com.huami.bluetooth.device.MozartDevice;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1", f = "HeadsetHearingHealthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HMBaseDevice c;
    public final /* synthetic */ HeadsetHearingHealthViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1(Continuation continuation, HMBaseDevice hMBaseDevice, HeadsetHearingHealthViewModel headsetHearingHealthViewModel) {
        super(2, continuation);
        this.c = hMBaseDevice;
        this.d = headsetHearingHealthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1 headsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1 = new HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1(continuation, this.c, this.d);
        headsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1.b = obj;
        return headsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadsetHearingHealthViewModel$initHearingHealth$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MozartDevice mozartDevice = (MozartDevice) this.c;
        Boolean hearingHealth = mozartDevice == null ? null : mozartDevice.getHearingHealth();
        this.d._statusHearingHealth.postValue(new HearingHealthStatusVo(hearingHealth, true));
        if (Intrinsics.areEqual(hearingHealth, Boxing.boxBoolean(true))) {
            MozartDevice mozartDevice2 = (MozartDevice) this.c;
            objectRef.element = mozartDevice2 != null ? Boxing.boxBoolean(mozartDevice2.setReportHeadsetInfoSwitch(true)) : 0;
        }
        HMLog.info("HeadsetHearingHealthViewModel", new HeadsetHearingHealthViewModel.c(objectRef, hearingHealth));
        return Unit.INSTANCE;
    }
}
