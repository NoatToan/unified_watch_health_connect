package com.xiaomi.fitness.sport.view.justdance.control;

import android.view.View;
import android.widget.TextView;
import defpackage.clb;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity$connectSwitch$1$1", f = "JustDanceControlActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class JustDanceControlActivity$connectSwitch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ JustDanceControlActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceControlActivity$connectSwitch$1$1(JustDanceControlActivity justDanceControlActivity, Continuation<? super JustDanceControlActivity$connectSwitch$1$1> continuation) {
        super(2, continuation);
        this.this$0 = justDanceControlActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(final JustDanceControlActivity justDanceControlActivity, View view) {
        JustDanceControlActivity.access$getMViewModel(justDanceControlActivity).handleTrigger(new Function0() { // from class: com.xiaomi.fitness.sport.view.justdance.control.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlActivity$connectSwitch$1$1.invokeSuspend$lambda$1$lambda$0(justDanceControlActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(JustDanceControlActivity justDanceControlActivity) {
        justDanceControlActivity.showHasOngoingSportDialog();
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JustDanceControlActivity$connectSwitch$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        clb.a(this.this$0);
        TextView textView = (TextView) JustDanceControlActivity.access$getMBinding(this.this$0).D.findViewById(xri.k0);
        if (textView != null) {
            final JustDanceControlActivity justDanceControlActivity = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.justdance.control.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JustDanceControlActivity$connectSwitch$1$1.invokeSuspend$lambda$1(justDanceControlActivity, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JustDanceControlActivity$connectSwitch$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
