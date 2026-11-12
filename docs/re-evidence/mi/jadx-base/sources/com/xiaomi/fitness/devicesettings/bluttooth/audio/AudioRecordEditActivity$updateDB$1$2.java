package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.xiaomi.fitness.common.log.Logger;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity$updateDB$1$2", f = "AudioRecordEditActivity.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class AudioRecordEditActivity$updateDB$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioRecordEntity $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordEditActivity$updateDB$1$2(AudioRecordEntity audioRecordEntity, Continuation<? super AudioRecordEditActivity$updateDB$1$2> continuation) {
        super(2, continuation);
        this.$data = audioRecordEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioRecordEditActivity$updateDB$1$2(this.$data, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
            AudioRecordEntity audioRecordEntity = this.$data;
            this.label = 1;
            obj = audioRecordDao.update(audioRecordEntity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Logger.i("AudiRecord_Edit", "更新结果 " + ((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioRecordEditActivity$updateDB$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
