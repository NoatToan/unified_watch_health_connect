package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.vo.OfflineVoiceCmdVo;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"isSupport"}, s = {"I$0"})
public final class FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FeatureViewModel c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1(Continuation continuation, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1 featureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1 = new FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1(continuation, this.c);
        featureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$loadOfflineVoiceCmd$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = (ConfigHelperKt.hasFeature(this.c.findDeviceSource(), Feature.SUPPORT_OFFLINE_VOICE) && (Language.isSimplifiedChinese() || Language.isEnglish())) ? 1 : 0;
            this.d = i3;
            this.a = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.d;
            ResultKt.throwOnFailure(obj);
        }
        this.c.getOfflineVoiceCmd().postValue(new OfflineVoiceCmdVo(i != 0, FeatureViewModel.INSTANCE.getURL_OFFLINE_VOICE()));
        return Unit.INSTANCE;
    }
}
