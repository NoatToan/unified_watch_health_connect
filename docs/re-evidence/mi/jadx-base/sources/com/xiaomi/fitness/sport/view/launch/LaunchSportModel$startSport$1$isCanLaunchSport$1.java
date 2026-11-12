package com.xiaomi.fitness.sport.view.launch;

import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.LaunchSportModel$startSport$1$isCanLaunchSport$1", f = "LaunchSportModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LaunchSportModel$startSport$1$isCanLaunchSport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public LaunchSportModel$startSport$1$isCanLaunchSport$1(Continuation<? super LaunchSportModel$startSport$1$isCanLaunchSport$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchSportModel$startSport$1$isCanLaunchSport$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).hasOngoingSport());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LaunchSportModel$startSport$1$isCanLaunchSport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
