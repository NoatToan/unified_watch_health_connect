package com.xiaomi.fitness.share.report;

import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.share.report.SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1", f = "SportReportShareExt.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
public final class SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $outputDirPath;
    final /* synthetic */ List<String> $rectangleBgUrls;
    final /* synthetic */ List<String> $squareBgUrls;
    final /* synthetic */ String $srcUrl;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1(int i, List<String> list, List<String> list2, String str, String str2, Continuation<? super SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$rectangleBgUrls = list;
        this.$squareBgUrls = list2;
        this.$srcUrl = str;
        this.$outputDirPath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1 sportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1 = new SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1(this.$index, this.$rectangleBgUrls, this.$squareBgUrls, this.$srcUrl, this.$outputDirPath, continuation);
        sportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1.L$0 = obj;
        return sportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.ensureActive((CoroutineScope) this.L$0);
            if (this.$index < this.$rectangleBgUrls.size()) {
                str = "rectangle-" + (this.$index + 1) + ".webp";
            } else if (this.$index < this.$rectangleBgUrls.size() + this.$squareBgUrls.size()) {
                str = "square-" + ((this.$index + 1) - this.$rectangleBgUrls.size()) + ".webp";
            } else {
                str = "misanslatin-" + (((this.$index + 1) - this.$rectangleBgUrls.size()) - this.$squareBgUrls.size()) + ".otf";
            }
            boolean zCheckIfResourceExists = SportReportShareExtKt.checkIfResourceExists(str);
            Logger.d(SportReportShareExtKt.TAG, "resourceAlreadyExist fileName=" + str + " exist=" + zCheckIfResourceExists);
            if (!zCheckIfResourceExists) {
                String str2 = this.$srcUrl;
                String absolutePath = new File(this.$outputDirPath, str).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                this.label = 1;
                if (SportReportShareExtKt.downloadFileWithCancelCheck(str2, absolutePath, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportReportShareExtKt$downloadResourcesAndGetIfDoneLiveData$1$1$deferredList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
