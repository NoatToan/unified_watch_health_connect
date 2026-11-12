package com.xiaomi.fitness.repo.summary;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOnline$1$categoryTask$1", f = "SportSummaryRepo.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSportSummaryRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo$syncOnline$1$categoryTask$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,506:1\n1#2:507\n*E\n"})
public final class SportSummaryRepo$syncOnline$1$categoryTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    int label;
    final /* synthetic */ SportSummaryRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportSummaryRepo$syncOnline$1$categoryTask$1(SportSummaryRepo sportSummaryRepo, Continuation<? super SportSummaryRepo$syncOnline$1$categoryTask$1> continuation) {
        super(2, continuation);
        this.this$0 = sportSummaryRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportSummaryRepo$syncOnline$1$categoryTask$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportSummaryRepo sportSummaryRepo = this.this$0;
            this.label = 1;
            obj = sportSummaryRepo.reqCategory(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SummaryPrefer.INSTANCE.setSPORT_CATEGORY(this.this$0.category2Str((List) obj));
        return obj;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((SportSummaryRepo$syncOnline$1$categoryTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
