package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
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
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1", f = "FeatureViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FeatureViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1(Continuation continuation, FeatureViewModel featureViewModel) {
        super(2, continuation);
        this.c = featureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1 featureViewModel$loadReminderLiveData$$inlined$safeLaunch$1 = new FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1(continuation, this.c);
        featureViewModel$loadReminderLiveData$$inlined$safeLaunch$1.b = obj;
        return featureViewModel$loadReminderLiveData$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FeatureViewModel$loadReminderLiveData$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        Boolean boolBoxBoolean;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            HMBaseDevice device = this.c.b().getDevice();
            boolean zBooleanValue = false;
            if (device != null && (boolBoxBoolean = Boxing.boxBoolean(HMDeviceConfig.hasFeatureReminder(device.getMDeviceSource()))) != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
            Deferred deferredB = e.b(coroutineScope, Dispatchers.getIO(), null, new FeatureViewModel.l(zBooleanValue, null), 2, null);
            MutableLiveData mutableLiveData2 = this.c.reminderLiveData;
            this.b = mutableLiveData2;
            this.a = 1;
            obj = deferredB.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.b;
            ResultKt.throwOnFailure(obj);
        }
        mutableLiveData.postValue(obj);
        return Unit.INSTANCE;
    }
}
