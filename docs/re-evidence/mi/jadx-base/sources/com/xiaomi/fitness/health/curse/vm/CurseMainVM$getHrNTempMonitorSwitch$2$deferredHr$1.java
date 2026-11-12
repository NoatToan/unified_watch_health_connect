package com.xiaomi.fitness.health.curse.vm;

import defpackage.ls9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lls9;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lls9;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1", f = "CurseMainVM.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ls9>, Object> {
    int label;
    final /* synthetic */ CurseMainVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1(CurseMainVM curseMainVM, Continuation<? super CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1> continuation) {
        super(2, continuation);
        this.this$0 = curseMainVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CurseMainVM curseMainVM = this.this$0;
            this.label = 1;
            obj = curseMainVM.getHrMonitor(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ls9> continuation) {
        return ((CurseMainVM$getHrNTempMonitorSwitch$2$deferredHr$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
