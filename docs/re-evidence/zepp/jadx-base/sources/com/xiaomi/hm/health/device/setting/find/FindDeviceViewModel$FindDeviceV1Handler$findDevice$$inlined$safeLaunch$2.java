package com.xiaomi.hm.health.device.setting.find;

import com.xiaomi.hm.health.device.setting.vo.ShowFindingVo;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2", f = "FindDeviceViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
public final class FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FindDeviceViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2(Continuation continuation, FindDeviceViewModel findDeviceViewModel) {
        super(2, continuation);
        this.c = findDeviceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2 findDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2 = new FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2(continuation, this.c);
        findDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2.b = obj;
        return findDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.c.getShowFindingTipLiveData().postValue(new ShowFindingVo(true, this.c.f()));
            this.a = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.c.getShowFindingTipLiveData().postValue(new ShowFindingVo(false, this.c.f()));
        return Unit.INSTANCE;
    }
}
