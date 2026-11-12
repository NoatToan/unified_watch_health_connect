package com.xiaomi.fitness.detail.viewmodel;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {778}, m = "invokeSuspend", n = {}, s = {})
public final class SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SwitchSongItem>>, Object> {
    final /* synthetic */ long $timeStamp;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1(long j, Continuation<? super SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1> continuation) {
        super(2, continuation);
        this.$timeStamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1(this.$timeStamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SwitchSongItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SwitchSongItem>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            long j = this.$timeStamp;
            this.label = 1;
            obj = fitnessDataExtKt.getSwitchSong(j, this);
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SwitchSongItem>> continuation) {
        return ((SportRecordDetailViewModel$getSwitchDanceSongs$1$itemList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
