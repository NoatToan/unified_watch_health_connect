package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1", f = "BtPhoneSettingViewModel.kt", i = {0}, l = {23}, m = "invokeSuspend", n = {"$this$queryBtPhoneStatus_u24lambda_u2d8"}, s = {"L$0"})
public final class BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1(Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1 btPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1 = new BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1(continuation, this.c);
        btPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingViewModel$queryBtPhoneStatus$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            this.b = coroutineScope2;
            this.a = 1;
            Object objIsBtPhoneEnabled = btPhoneDevice.isBtPhoneEnabled(this);
            if (objIsBtPhoneEnabled == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = objIsBtPhoneEnabled;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        e.f(coroutineScope, Dispatchers.getMain(), null, new BtPhoneSettingViewModel.p(this.c, ((Boolean) obj).booleanValue(), null), 2, null);
        return Unit.INSTANCE;
    }
}
