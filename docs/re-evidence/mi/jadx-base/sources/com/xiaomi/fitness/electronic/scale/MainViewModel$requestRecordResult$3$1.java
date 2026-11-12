package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.electronic.scale.data.RecordResult;
import defpackage.qal;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainViewModel$requestRecordResult$3$1", f = "MainViewModel.kt", i = {}, l = {379}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/xiaomi/fitness/electronic/scale/MainViewModel$requestRecordResult$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1010#2,2:412\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/xiaomi/fitness/electronic/scale/MainViewModel$requestRecordResult$3$1\n*L\n383#1:412,2\n*E\n"})
public final class MainViewModel$requestRecordResult$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $did;
    final /* synthetic */ boolean $needMore;
    final /* synthetic */ Function1<List<RecordResult>, Unit> $onSuccess;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ Ref.LongRef $realTime;
    final /* synthetic */ long $uid;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$requestRecordResult$3$1(MainViewModel mainViewModel, long j, int i, int i2, Ref.LongRef longRef, boolean z, Function1<? super List<RecordResult>, Unit> function1, Continuation<? super MainViewModel$requestRecordResult$3$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$uid = j;
        this.$did = i;
        this.$pageSize = i2;
        this.$realTime = longRef;
        this.$needMore = z;
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$requestRecordResult$3$1(this.this$0, this.$uid, this.$did, this.$pageSize, this.$realTime, this.$needMore, this.$onSuccess, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Function1<List<RecordResult>, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainViewModel mainViewModel = this.this$0;
            long j = this.$uid;
            String strValueOf = String.valueOf(this.$did);
            int i2 = this.$pageSize;
            long j2 = this.$realTime.element;
            this.label = 1;
            obj = mainViewModel.pullRecord(j, strValueOf, i2, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<RecordResult> list = (List) obj;
        qal.c("requestRecordResult success dataList : " + list.size() + " ");
        if (list.size() <= 0) {
            MainViewModel.INSTANCE.setPullRecord(false);
        } else {
            if (!this.$needMore) {
                MainViewModel.INSTANCE.setPullRecord(false);
            }
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.MainViewModel$requestRecordResult$3$1$invokeSuspend$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((RecordResult) t).getCreateTime()), Long.valueOf(((RecordResult) t2).getCreateTime()));
                    }
                });
            }
            this.$realTime.element = list.get(0).getCreateTime();
            function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke2(list);
            }
        }
        Thread.sleep(500L);
        if ((!list.isEmpty()) || !this.$needMore) {
            return Unit.INSTANCE;
        }
        MainViewModel mainViewModel2 = this.this$0;
        long j3 = this.$uid;
        String strValueOf2 = String.valueOf(this.$did);
        int i3 = this.$pageSize;
        long j4 = this.$realTime.element;
        this.label = 1;
        obj = mainViewModel2.pullRecord(j3, strValueOf2, i3, j4, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<RecordResult> list2 = (List) obj;
        qal.c("requestRecordResult success dataList : " + list2.size() + " ");
        if (list2.size() <= 0) {
            MainViewModel.INSTANCE.setPullRecord(false);
        } else {
            if (!this.$needMore) {
                MainViewModel.INSTANCE.setPullRecord(false);
            }
            if (list2.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list2, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.MainViewModel$requestRecordResult$3$1$invokeSuspend$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((RecordResult) t).getCreateTime()), Long.valueOf(((RecordResult) t2).getCreateTime()));
                    }
                });
            }
            this.$realTime.element = list2.get(0).getCreateTime();
            function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke2(list2);
            }
        }
        Thread.sleep(500L);
        if (!list2.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainViewModel$requestRecordResult$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
