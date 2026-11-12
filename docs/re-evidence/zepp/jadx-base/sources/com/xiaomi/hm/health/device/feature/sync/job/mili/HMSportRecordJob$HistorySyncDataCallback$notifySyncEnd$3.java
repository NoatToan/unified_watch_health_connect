package com.xiaomi.hm.health.device.feature.sync.job.mili;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3", f = "HMSportRecordJob.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HMSportRecordJob.HistorySyncDataCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3(HMSportRecordJob.HistorySyncDataCallback historySyncDataCallback, Continuation<? super HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3> continuation) {
        super(2, continuation);
        this.this$0 = historySyncDataCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.this$0.channel;
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            this.label = 1;
            if (channel.send(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
