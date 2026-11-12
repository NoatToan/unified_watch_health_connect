package com.xiaomi.hm.health.device.setting.viewmodel;

import com.huami.account.HMLoginManager;
import com.xiaomi.hm.health.device.setting.vo.BroadcastVo;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Locale;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceFeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1(Continuation continuation, DeviceFeatureViewModel deviceFeatureViewModel) {
        super(2, continuation);
        this.c = deviceFeatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1 deviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1(continuation, this.c);
        deviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        r8 = true;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        boolean z = true;
        BroadcastVo broadcastVo = new BroadcastVo(true, (miliConfig == null || (boolBoxBoolean = Boxing.boxBoolean(miliConfig.isEnableConnectedBtAdv())) == null) ? false : boolBoxBoolean.booleanValue());
        if (HMLoginManager.isInMainland()) {
            this.c.getBluetoothBroadcastSettingLiveData().postValue(BroadcastVo.copy$default(broadcastVo, true, false, 2, null));
        } else if (HMLoginManager.isUnknown()) {
            String country = Locale.getDefault().getCountry();
            boolean zAreEqual = Intrinsics.areEqual(Locale.SIMPLIFIED_CHINESE.getCountry(), country);
            boolean zAreEqual2 = Intrinsics.areEqual(Locale.US.getCountry(), country);
            int age = HMPersonInfo.getInstance().getUserInfo().getAge();
            if (!zAreEqual) {
                boolean z2 = zAreEqual2 ? false : false;
                if (!z2) {
                    z = false;
                }
            }
            this.c.getBluetoothBroadcastSettingLiveData().postValue(BroadcastVo.copy$default(broadcastVo, z, false, 2, null));
        } else {
            this.c.getBluetoothBroadcastSettingLiveData().postValue(BroadcastVo.copy$default(broadcastVo, HMLoginManager.isAdult(), false, 2, null));
        }
        return Unit.INSTANCE;
    }
}
