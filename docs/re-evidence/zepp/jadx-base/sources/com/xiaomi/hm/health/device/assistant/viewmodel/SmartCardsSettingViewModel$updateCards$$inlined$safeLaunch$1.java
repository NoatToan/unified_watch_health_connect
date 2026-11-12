package com.xiaomi.hm.health.device.assistant.viewmodel;

import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardStruct;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import com.xiaomi.hm.health.device.assistant.viewmodel.adapter.SmartCardAdapter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1", f = "SmartCardsSettingViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SmartCardsSettingViewModel c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1(Continuation continuation, SmartCardsSettingViewModel smartCardsSettingViewModel, List list) {
        super(2, continuation);
        this.c = smartCardsSettingViewModel;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1 smartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1 = new SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1(continuation, this.c, this.d);
        smartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1.b = obj;
        return smartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object next;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDeviceFindDevice = this.c.findDevice();
                if ((hMBaseDeviceFindDevice == null || hMBaseDeviceFindDevice.isConnected()) ? false : true) {
                    this.c.getStatueLiveData().postValue(UpdateStatus.SAVE_FAIL);
                } else {
                    this.c.getStatueLiveData().postValue(UpdateStatus.SAVING);
                    List list = this.d;
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Boxing.boxBoolean(((ItemVo) next).getType() == -1).booleanValue());
                    int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) list), (Object) next);
                    int i2 = 0;
                    for (Object obj2 : this.d) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        ((ItemVo) obj2).setEnable(Boxing.boxInt(i2).intValue() <= iIndexOf);
                        i2 = i3;
                    }
                    List<QuickCardStruct.QueryCardsResponseItem> listConvertRequestListV2 = this.c.e().convertRequestListV2(this.d);
                    SmartCardAdapter smartCardAdapterG = this.c.g();
                    this.a = 1;
                    obj = smartCardAdapterG.updateCardsSetting(listConvertRequestListV2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                this.c.getStatueLiveData().postValue(UpdateStatus.SAVE_SUCCESS);
            } else {
                this.c.getStatueLiveData().postValue(UpdateStatus.SAVE_FAIL);
            }
        } catch (Exception e) {
            this.c.getStatueLiveData().postValue(UpdateStatus.FAIL);
            HMLog.error$default("SmartCardsSettingViewModel", null, e, SmartCardsSettingViewModel.f.a, 2, null);
        }
        return Unit.INSTANCE;
    }
}
