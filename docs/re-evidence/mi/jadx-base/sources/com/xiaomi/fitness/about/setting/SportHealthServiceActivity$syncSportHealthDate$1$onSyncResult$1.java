package com.xiaomi.fitness.about.setting;

import defpackage.lzi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.about.setting.SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1", f = "SportHealthServiceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $success;
    int label;
    final /* synthetic */ SportHealthServiceActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1(boolean z, SportHealthServiceActivity sportHealthServiceActivity, Continuation<? super SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1> continuation) {
        super(2, continuation);
        this.$success = z;
        this.this$0 = sportHealthServiceActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1(this.$success, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$success) {
            SportHealthServiceActivity.access$getMBinding(this.this$0).H.setText(this.this$0.formatLastTime(System.currentTimeMillis()));
            SportHealthServiceActivity.access$getMBinding(this.this$0).G.setVisibility(0);
            SportHealthServiceActivity.access$getMBinding(this.this$0).C.setVisibility(8);
            SportHealthServiceActivity.access$getMBinding(this.this$0).C.clearAnimation();
        } else {
            SportHealthServiceActivity.access$getMBinding(this.this$0).H.setText(this.this$0.getString(lzi.P));
            SportHealthServiceActivity.access$getMBinding(this.this$0).G.setVisibility(0);
            SportHealthServiceActivity.access$getMBinding(this.this$0).C.setVisibility(8);
            SportHealthServiceActivity.access$getMBinding(this.this$0).C.clearAnimation();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
