package com.xiaomi.fitness.nfc.ui.issued.auth;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.o0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment$handleMessage$1$1", f = "ReturnCardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReturnCardFragment$handleMessage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $it;
    int label;
    final /* synthetic */ ReturnCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCardFragment$handleMessage$1$1(Boolean bool, ReturnCardFragment returnCardFragment, Continuation<? super ReturnCardFragment$handleMessage$1$1> continuation) {
        super(2, continuation);
        this.$it = bool;
        this.this$0 = returnCardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReturnCardFragment$handleMessage$1$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(this.$it, Boxing.boxBoolean(true))) {
            ReturnCardFragment.access$getMBinding(this.this$0).A.setText(ApplicationExtKt.getApplication().getString(o0j.U3));
            ReturnCardFragment.access$getMBinding(this.this$0).H.setText(ApplicationExtKt.getApplication().getString(o0j.Q6));
            ReturnCardFragment.access$getMBinding(this.this$0).B.setEnabled(true);
        } else {
            ReturnCardFragment.access$getMBinding(this.this$0).A.setText(ApplicationExtKt.getApplication().getString(o0j.V3));
            ReturnCardFragment.access$getMBinding(this.this$0).H.setText(ApplicationExtKt.getApplication().getString(o0j.P6));
            ReturnCardFragment.access$getMBinding(this.this$0).B.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReturnCardFragment$handleMessage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
