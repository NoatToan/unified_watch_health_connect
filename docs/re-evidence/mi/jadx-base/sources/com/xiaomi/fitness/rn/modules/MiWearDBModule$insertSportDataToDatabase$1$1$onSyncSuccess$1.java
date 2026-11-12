package com.xiaomi.fitness.rn.modules;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import defpackage.fw7;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.rn.modules.MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1", f = "MiWearDBModule.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
public final class MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callback $callback;
    final /* synthetic */ String $did;
    final /* synthetic */ int $sportType;
    final /* synthetic */ int $startTimestamp;
    int label;
    final /* synthetic */ MiWearDBModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1(MiWearDBModule miWearDBModule, String str, int i, int i2, Callback callback, Continuation<? super MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = miWearDBModule;
        this.$did = str;
        this.$startTimestamp = i;
        this.$sportType = i2;
        this.$callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Callback callback, Object[] objArr) {
        callback.invoke(objArr[0]);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1(this.this$0, this.$did, this.$startTimestamp, this.$sportType, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        EcoSportManager instance = EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE);
        Activity currentActivity = this.this$0.getReactApplicationContext().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        String str = this.$did;
        long j = this.$startTimestamp;
        int i2 = this.$sportType;
        final Callback callback = this.$callback;
        instance.openSportReport(currentActivity, str, j, i2, new fw7() { // from class: com.xiaomi.fitness.rn.modules.a
            @Override // defpackage.fw7
            public final void invoke(Object[] objArr) {
                MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1.invokeSuspend$lambda$0(callback, objArr);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
