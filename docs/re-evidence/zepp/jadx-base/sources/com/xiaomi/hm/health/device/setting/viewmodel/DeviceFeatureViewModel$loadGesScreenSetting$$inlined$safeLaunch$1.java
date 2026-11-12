package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.vo.GesScreenVo;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DeviceFeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1(Continuation continuation, DeviceFeatureViewModel deviceFeatureViewModel) {
        super(2, continuation);
        this.c = deviceFeatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1 deviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1(continuation, this.c);
        deviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        boolean zIsLiftWristBrightView = miliConfig.isLiftWristBrightView();
        HMLiftWristConfig hMLiftWristConfigFromLiftWristConfig = this.c.e().fromLiftWristConfig(miliConfig.isLiftWristBrightView(), miliConfig.getLiftWristTime());
        boolean zIsAllDay = hMLiftWristConfigFromLiftWristConfig.isAllDay();
        int startHour = (hMLiftWristConfigFromLiftWristConfig.getStartHour() * 60) + hMLiftWristConfigFromLiftWristConfig.getStartMinutes();
        int stopHour = (hMLiftWristConfigFromLiftWristConfig.getStopHour() * 60) + hMLiftWristConfigFromLiftWristConfig.getStopMinutes();
        boolean z = false;
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PEYTO;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_PEYTO_L;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_PEYTO_WL;
        boolean zContains = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_CHONGQING, HMDeviceSource.MILI_WUHAN, HMDeviceSource.MILI_RIO, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_BEATS_P, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_CINCO_L, HMDeviceSource.MILI_PYH, HMDeviceSource.MILI_PYH_W, HMDeviceSource.MILI_FALCON_DISNEY, HMDeviceSource.MILI_FALCON, HMDeviceSource.MILI_FALCON_W, HMDeviceSource.MILI_FALCON_L, HMDeviceSource.MILI_FALCON_WL, HMDeviceSource.MILI_HAWK, HMDeviceSource.MILI_HAWK_L, HMDeviceSource.MILI_HAWK_W, HMDeviceSource.MILI_HAWK_WL, HMDeviceSource.MILI_HAWK_SWK, HMDeviceSource.MILI_HAWK_SWK_W, HMDeviceSource.MILI_KESTREL, HMDeviceSource.MILI_KESTREL_L, HMDeviceSource.MILI_KESTREL_W, HMDeviceSource.MILI_KESTREL_WL, HMDeviceSource.MILI_ATHENS, HMDeviceSource.MILI_VULTURE, HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL, HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_QINLING, HMDeviceSource.MILI_NFC, hMDeviceSource, HMDeviceSource.MILI_TEMPO, HMDeviceSource.MILI_PRO_I, hMDeviceSource2, hMDeviceSource3).contains(this.c.getDeviceSource());
        boolean zContains2 = CollectionsKt__CollectionsKt.arrayListOf(hMDeviceSource, hMDeviceSource2, hMDeviceSource3).contains(this.c.getDeviceSource());
        if (HMDeviceConfig.hasFeatureG3Device() && zContains) {
            z = true;
        }
        this.c.gesScreenSettingLiveData.postValue(new GesScreenVo(z, zIsLiftWristBrightView, zIsAllDay, startHour, stopHour, zContains2));
        return Unit.INSTANCE;
    }
}
