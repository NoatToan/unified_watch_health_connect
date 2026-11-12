package com.mi.health.course.eco.activity;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.course.eco.activity.EcoCourseAudioActivity$addObserver$6$1", f = "EcoCourseAudioActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EcoCourseAudioActivity$addObserver$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $it;
    int label;
    final /* synthetic */ EcoCourseAudioActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoCourseAudioActivity$addObserver$6$1(EcoCourseAudioActivity ecoCourseAudioActivity, int i, Continuation<? super EcoCourseAudioActivity$addObserver$6$1> continuation) {
        super(2, continuation);
        this.this$0 = ecoCourseAudioActivity;
        this.$it = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcoCourseAudioActivity$addObserver$6$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        View view = (View) this.this$0.concernedConfig.get("frequency_hopping");
        if (view != null) {
            EcoCourseAudioActivity ecoCourseAudioActivity = this.this$0;
            int i = this.$it;
            if (view instanceof LinearLayout) {
                ecoCourseAudioActivity.setJumpRopRecommendCount(view, i);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EcoCourseAudioActivity$addObserver$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
