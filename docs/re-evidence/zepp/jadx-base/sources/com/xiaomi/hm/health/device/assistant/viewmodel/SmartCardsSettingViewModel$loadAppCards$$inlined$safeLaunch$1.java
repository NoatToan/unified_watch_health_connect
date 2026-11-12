package com.xiaomi.hm.health.device.assistant.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import com.xiaomi.hm.health.device.assistant.viewmodel.adapter.SmartCardAdapter;
import java.util.List;
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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1", f = "SmartCardsSettingViewModel.kt", i = {}, l = {66, 67}, m = "invokeSuspend", n = {}, s = {})
public final class SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SmartCardsSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1(Continuation continuation, SmartCardsSettingViewModel smartCardsSettingViewModel) {
        super(2, continuation);
        this.c = smartCardsSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1 smartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1 = new SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1(continuation, this.c);
        smartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1.b = obj;
        return smartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveData limitLiveData;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    limitLiveData = (MutableLiveData) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List<ItemVo> list = (List) obj;
                this.c.resortValues = list;
                this.c.getAppCardsLiveData().postValue(list);
                this.c.getStatueLiveData().postValue(UpdateStatus.SUCCESS);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.c.getStatueLiveData().postValue(UpdateStatus.LOADING);
            limitLiveData = this.c.getLimitLiveData();
            SmartCardsSettingViewModel smartCardsSettingViewModel = this.c;
            this.b = limitLiveData;
            this.a = 1;
            obj = smartCardsSettingViewModel.f(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            limitLiveData.postValue(obj);
            SmartCardAdapter smartCardAdapterG = this.c.g();
            this.b = null;
            this.a = 2;
            obj = smartCardAdapterG.queryCardSetting(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List<ItemVo> list2 = (List) obj;
            this.c.resortValues = list2;
            this.c.getAppCardsLiveData().postValue(list2);
            this.c.getStatueLiveData().postValue(UpdateStatus.SUCCESS);
        } catch (Exception e) {
            this.c.getStatueLiveData().postValue(UpdateStatus.FAIL);
            HMLog.error$default("SmartCardsSettingViewModel", null, e, SmartCardsSettingViewModel.b.a, 2, null);
        }
        return Unit.INSTANCE;
    }
}
