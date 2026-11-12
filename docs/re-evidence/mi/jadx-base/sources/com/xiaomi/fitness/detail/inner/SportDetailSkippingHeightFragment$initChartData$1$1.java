package com.xiaomi.fitness.detail.inner;

import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailSkippingHeightFragment$initChartData$1$1", f = "SportDetailSkippingHeightFragment.kt", i = {0}, l = {88, 95}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SportDetailSkippingHeightFragment$initChartData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SportRecordItem> $skipHeightList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SportDetailSkippingHeightFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailSkippingHeightFragment$initChartData$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailSkippingHeightFragment$initChartData$1$1$1", f = "SportDetailSkippingHeightFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
        Object L$0;
        int label;
        final /* synthetic */ SportDetailSkippingHeightFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SportDetailSkippingHeightFragment sportDetailSkippingHeightFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sportDetailSkippingHeightFragment;
            this.$valueListTask = deferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$valueListTask, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportDetailSkippingHeightFragment sportDetailSkippingHeightFragment;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportDetailSkippingHeightFragment sportDetailSkippingHeightFragment2 = this.this$0;
                Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                this.L$0 = sportDetailSkippingHeightFragment2;
                this.label = 1;
                Object objAwait = deferred.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportDetailSkippingHeightFragment = sportDetailSkippingHeightFragment2;
                obj = objAwait;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportDetailSkippingHeightFragment = (SportDetailSkippingHeightFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            sportDetailSkippingHeightFragment.setValueList((ArrayList) obj);
            SportDetailSkippingHeightFragment sportDetailSkippingHeightFragment3 = this.this$0;
            sportDetailSkippingHeightFragment3.printChartFloat(SportDetailSkippingHeightFragment.TAG, sportDetailSkippingHeightFragment3.getValueList());
            this.this$0.bindData();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailSkippingHeightFragment$initChartData$1$1(List<SportRecordItem> list, SportDetailSkippingHeightFragment sportDetailSkippingHeightFragment, Continuation<? super SportDetailSkippingHeightFragment$initChartData$1$1> continuation) {
        super(2, continuation);
        this.$skipHeightList = list;
        this.this$0 = sportDetailSkippingHeightFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SportDetailSkippingHeightFragment$initChartData$1$1 sportDetailSkippingHeightFragment$initChartData$1$1 = new SportDetailSkippingHeightFragment$initChartData$1$1(this.$skipHeightList, this.this$0, continuation);
        sportDetailSkippingHeightFragment$initChartData$1$1.L$0 = obj;
        return sportDetailSkippingHeightFragment$initChartData$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        coroutineScope = (CoroutineScope) this.L$0;
        List<SportRecordItem> list = this.$skipHeightList;
        this.L$0 = coroutineScope;
        this.label = 1;
        if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailSkippingHeightFragment$initChartData$1$1$valueListTask$1(this.$skipHeightList, this.this$0, null), 2, null);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, deferredAsync$default, null);
        this.L$0 = null;
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportDetailSkippingHeightFragment$initChartData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
