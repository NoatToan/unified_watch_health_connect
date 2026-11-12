package com.xiaomi.fitness.access;

import com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity;
import com.xiaomi.fitness.access.health_connect.HealthConnectIntroductionActivity;
import com.xiaomi.fitness.access.health_connect.HealthConnectUtils;
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
@DebugMetadata(c = "com.xiaomi.fitness.access.GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1", f = "GoogleFitAccessActivity.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GoogleFitAccessActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1(GoogleFitAccessActivity googleFitAccessActivity, Continuation<? super GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = googleFitAccessActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            GoogleFitAccessActivity googleFitAccessActivity = this.this$0;
            this.label = 1;
            obj = healthConnectUtils.hasHealthConnectAuthed(googleFitAccessActivity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            HealthConnectAuthedPermissionsActivity.INSTANCE.launch(this.this$0);
        } else {
            HealthConnectIntroductionActivity.INSTANCE.launch(this.this$0);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
