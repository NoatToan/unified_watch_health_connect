package com.mi.health.course.activity.eco;

import defpackage.fs9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1", f = "EcoCourseInfoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ fs9[] $result;
    int label;
    final /* synthetic */ EcoCourseInfoVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1(EcoCourseInfoVM ecoCourseInfoVM, fs9[] fs9VarArr, Function1<? super Boolean, Unit> function1, Continuation<? super EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1> continuation) {
        super(2, continuation);
        this.this$0 = ecoCourseInfoVM;
        this.$result = fs9VarArr;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1(this.this$0, this.$result, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fs9 fs9VarFindEco;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.mEcoSettingList = this.$result;
        fs9[] fs9VarArr = this.this$0.mEcoSettingList;
        boolean z = false;
        if (fs9VarArr != null && (fs9VarFindEco = this.this$0.findEco(fs9VarArr, 5)) != null && fs9VarFindEco.d == this.this$0.getSWITCH_ON()) {
            z = true;
        }
        this.$callback.invoke2(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
