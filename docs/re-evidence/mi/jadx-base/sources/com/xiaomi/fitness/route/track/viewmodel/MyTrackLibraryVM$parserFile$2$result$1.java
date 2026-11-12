package com.xiaomi.fitness.route.track.viewmodel;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$parserFile$2$result$1", f = "MyTrackLibraryVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MyTrackLibraryVM$parserFile$2$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends byte[], ? extends Recorder>>, Object> {
    final /* synthetic */ String $fileExtension;
    final /* synthetic */ String $fileMD5;
    final /* synthetic */ String $filePath;
    final /* synthetic */ String $trackName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTrackLibraryVM$parserFile$2$result$1(String str, String str2, String str3, String str4, Continuation<? super MyTrackLibraryVM$parserFile$2$result$1> continuation) {
        super(2, continuation);
        this.$trackName = str;
        this.$filePath = str2;
        this.$fileExtension = str3;
        this.$fileMD5 = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyTrackLibraryVM$parserFile$2$result$1(this.$trackName, this.$filePath, this.$fileExtension, this.$fileMD5, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends byte[], ? extends Recorder>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<byte[], Recorder>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
        String str = this.$trackName;
        String str2 = this.$filePath;
        String str3 = this.$fileExtension;
        String str4 = this.$fileMD5;
        if (str4 == null) {
            str4 = "";
        }
        return TrackNet.DefaultImpls.getRecorder$default(trackNetManagerKt, str, str2, str3, str4, null, 16, null);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<byte[], Recorder>> continuation) {
        return ((MyTrackLibraryVM$parserFile$2$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
