package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3", f = "FeatureViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HMDeviceFwUpgradeEvent c;
    public final /* synthetic */ FeatureViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3(Continuation continuation, HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = hMDeviceFwUpgradeEvent;
        this.d = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3 featureViewModel$onEventMainThread$$inlined$safeLaunch$3 = new FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3(continuation, this.c, this.d);
        featureViewModel$onEventMainThread$$inlined$safeLaunch$3.b = obj;
        return featureViewModel$onEventMainThread$$inlined$safeLaunch$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$onEventMainThread$$inlined$safeLaunch$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DeviceConnectedVo deviceConnectedVo;
        int percent;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceConnectedVo deviceConnectedVo2 = new DeviceConnectedVo(this.c.getProgress().getPercent(), ConnectStatus.SYNC_A_GPS, 0, false, null, null, 0, 124, null);
            if (this.c.isStart()) {
                this.d.getSyncStatusLiveData().postValue(deviceConnectedVo2);
            } else if (this.c.isProgress()) {
                MutableLiveData<DeviceConnectedVo> syncStatusLiveData = this.d.getSyncStatusLiveData();
                if (this.c.getProgress().getPercent() >= 100) {
                    percent = 100;
                } else {
                    percent = this.c.getProgress().getPercent() < 1 ? 0 : this.c.getProgress().getPercent();
                }
                syncStatusLiveData.postValue(DeviceConnectedVo.copy$default(deviceConnectedVo2, percent, null, 0, false, null, null, 0, 126, null));
            } else if (this.c.isStop()) {
                if (this.c.getResult()) {
                    this.d.getSyncStatusLiveData().postValue(DeviceConnectedVo.copy$default(deviceConnectedVo2, 0, ConnectStatus.CONNECTED, 0, false, null, null, 0, 125, null));
                    this.d.o();
                } else {
                    this.d.getSyncStatusLiveData().postValue(DeviceConnectedVo.copy$default(deviceConnectedVo2, 0, ConnectStatus.SYNC_A_GPS_FAIL, 0, false, null, null, 0, 125, null));
                    this.b = deviceConnectedVo2;
                    this.a = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deviceConnectedVo = deviceConnectedVo2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DeviceConnectedVo deviceConnectedVo3 = (DeviceConnectedVo) this.b;
        ResultKt.throwOnFailure(obj);
        deviceConnectedVo = deviceConnectedVo3;
        this.d.getSyncStatusLiveData().postValue(DeviceConnectedVo.copy$default(deviceConnectedVo, 0, ConnectStatus.CONNECTED, 0, false, null, null, 0, 125, null));
        this.d.o();
        return Unit.INSTANCE;
    }
}
