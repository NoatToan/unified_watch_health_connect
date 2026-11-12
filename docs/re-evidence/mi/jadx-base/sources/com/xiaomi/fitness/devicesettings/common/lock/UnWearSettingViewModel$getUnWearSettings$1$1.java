package com.xiaomi.fitness.devicesettings.common.lock;

import com.xiaomi.fitness.settingitem.settingitem.UnwearSetting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$getUnWearSettings$1$1", f = "UnWearSettingViewModel.kt", i = {}, l = {61, 70}, m = "invokeSuspend", n = {}, s = {})
public final class UnWearSettingViewModel$getUnWearSettings$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $fail;
    final /* synthetic */ Function1<Boolean, Unit> $success;
    int label;
    final /* synthetic */ UnWearSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnWearSettingViewModel$getUnWearSettings$1$1(Function1<? super Boolean, Unit> function1, Function0<Unit> function0, UnWearSettingViewModel unWearSettingViewModel, Continuation<? super UnWearSettingViewModel$getUnWearSettings$1$1> continuation) {
        super(2, continuation);
        this.$success = function1;
        this.$fail = function0;
        this.this$0 = unWearSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnWearSettingViewModel$getUnWearSettings$1$1(this.$success, this.$fail, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$success.invoke2(Boxing.boxBoolean(((UnwearSetting) obj).isEnable()));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineDispatcher io2 = Dispatchers.getIO();
        UnWearSettingViewModel$getUnWearSettings$1$1$lockStatus$1 unWearSettingViewModel$getUnWearSettings$1$1$lockStatus$1 = new UnWearSettingViewModel$getUnWearSettings$1$1$lockStatus$1(this.this$0, null);
        this.label = 1;
        obj = BuildersKt.withContext(io2, unWearSettingViewModel$getUnWearSettings$1$1$lockStatus$1, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            CoroutineDispatcher io3 = Dispatchers.getIO();
            UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1 unWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1 = new UnWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1(this.this$0, null);
            this.label = 2;
            obj = BuildersKt.withContext(io3, unWearSettingViewModel$getUnWearSettings$1$1$unwearSetting$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.$success.invoke2(Boxing.boxBoolean(((UnwearSetting) obj).isEnable()));
        } else if (iIntValue == 2) {
            this.$success.invoke2(Boxing.boxBoolean(true));
        } else if (iIntValue != 3) {
            this.$fail.invoke();
        } else {
            this.$success.invoke2(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnWearSettingViewModel$getUnWearSettings$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
