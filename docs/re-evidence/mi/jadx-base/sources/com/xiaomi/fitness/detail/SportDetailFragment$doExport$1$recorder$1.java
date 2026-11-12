package com.xiaomi.fitness.detail;

import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$doExport$1$recorder$1", f = "SportDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailFragment$doExport$1$recorder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Recorder>, Object> {
    final /* synthetic */ String $fileMD5;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $filePath;
    final /* synthetic */ String $fileType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailFragment$doExport$1$recorder$1(String str, String str2, String str3, String str4, Continuation<? super SportDetailFragment$doExport$1$recorder$1> continuation) {
        super(2, continuation);
        this.$fileName = str;
        this.$filePath = str2;
        this.$fileType = str3;
        this.$fileMD5 = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailFragment$doExport$1$recorder$1(this.$fileName, this.$filePath, this.$fileType, this.$fileMD5, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair recorder$default = TrackNet.DefaultImpls.getRecorder$default(TrackNetManagerKt.getInstance(TrackNet.INSTANCE), this.$fileName, this.$filePath, this.$fileType, this.$fileMD5, null, 16, null);
        if (recorder$default != null) {
            return (Recorder) recorder$default.getSecond();
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Recorder> continuation) {
        return ((SportDetailFragment$doExport$1$recorder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
