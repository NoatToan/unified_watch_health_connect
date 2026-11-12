package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.electronic.scale.data.RecordResult;
import com.xiaomi.fitness.electronic.scale.export.PullWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import defpackage.qal;
import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainViewModel$requestRecordResult$1$2", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/xiaomi/fitness/electronic/scale/MainViewModel$requestRecordResult$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1019#2,2:412\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/xiaomi/fitness/electronic/scale/MainViewModel$requestRecordResult$1$2\n*L\n318#1:412,2\n*E\n"})
public final class MainViewModel$requestRecordResult$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RecordResult> $it;
    final /* synthetic */ SoftReference<PullWeightRecordCallback> $pullWeightRecordCallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$requestRecordResult$1$2(List<RecordResult> list, SoftReference<PullWeightRecordCallback> softReference, Continuation<? super MainViewModel$requestRecordResult$1$2> continuation) {
        super(2, continuation);
        this.$it = list;
        this.$pullWeightRecordCallback = softReference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$requestRecordResult$1$2(this.$it, this.$pullWeightRecordCallback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SoftReference<PullWeightRecordCallback> softReference;
        PullWeightRecordCallback pullWeightRecordCallback;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        qal.c("requestRecordResult() sendDataChangedBroadcast");
        ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
        List<RecordResult> list = this.$it;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.MainViewModel$requestRecordResult$1$2$invokeSuspend$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((RecordResult) t2).getCreateTime()), Long.valueOf(((RecordResult) t).getCreateTime()));
                }
            });
        }
        if (this.$it.size() > 0 && (softReference = this.$pullWeightRecordCallback) != null && (pullWeightRecordCallback = softReference.get()) != null) {
            List<RecordResult> list2 = this.$it;
            pullWeightRecordCallback.onPullWeightRecordSuccess(list2.get(list2.size() - 1).getCreateTime(), this.$it.get(0).getCreateTime());
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$requestRecordResult$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
