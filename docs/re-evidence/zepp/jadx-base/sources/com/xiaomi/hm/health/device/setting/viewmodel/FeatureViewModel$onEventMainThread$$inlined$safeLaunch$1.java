package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HMDeviceBatteryEvent c;
    public final /* synthetic */ FeatureViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1(Continuation continuation, HMDeviceBatteryEvent hMDeviceBatteryEvent, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = hMDeviceBatteryEvent;
        this.d = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1 featureViewModel$onEventMainThread$$inlined$safeLaunch$1 = new FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1(continuation, this.c, this.d);
        featureViewModel$onEventMainThread$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$onEventMainThread$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$onEventMainThread$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BatteryInfo batteryInfo = this.c.getBatteryInfo();
        ConnectStatus connectStatus = ConnectStatus.CONNECTED;
        int level = batteryInfo.getLevel();
        boolean z = 1 == batteryInfo.getDcStatus();
        Calendar lastCharge = batteryInfo.getLastCharge();
        FeatureViewModel featureViewModel = this.d;
        this.d.getSyncStatusLiveData().postValue(new DeviceConnectedVo(0, connectStatus, level, z, lastCharge, featureViewModel.j(featureViewModel.findMacAddress()), TimeUtils.getDeltaDayCount(batteryInfo.getLastCharge(), Calendar.getInstance())));
        return Unit.INSTANCE;
    }
}
