package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.vo.LongSitAlertItemVo;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1(Continuation continuation, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1 featureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1 = new FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1(continuation, this.c);
        featureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$loadLongSitAlertSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        boolean zBooleanValue;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        boolean zBooleanValue2 = false;
        if (miliConfig != null) {
            String sedentaryRemind = miliConfig.getSedentaryRemind();
            if (sedentaryRemind != null) {
                HMSedentaryConfig hMSedentaryConfigFromSedentaryConfig = this.c.e().fromSedentaryConfig(sedentaryRemind);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean((hMSedentaryConfigFromSedentaryConfig == null || (boolBoxBoolean = Boxing.boxBoolean(hMSedentaryConfigFromSedentaryConfig.isEnable())) == null) ? false : boolBoxBoolean.booleanValue());
                if (boolBoxBoolean2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolBoxBoolean2.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(zBooleanValue);
            if (boolBoxBoolean3 != null) {
                zBooleanValue2 = boolBoxBoolean3.booleanValue();
            }
        }
        this.c.longSitAlertSettingLiveData.postValue(new LongSitAlertItemVo(HMDeviceConfig.hasFeatureProDevice(), zBooleanValue2));
        return Unit.INSTANCE;
    }
}
