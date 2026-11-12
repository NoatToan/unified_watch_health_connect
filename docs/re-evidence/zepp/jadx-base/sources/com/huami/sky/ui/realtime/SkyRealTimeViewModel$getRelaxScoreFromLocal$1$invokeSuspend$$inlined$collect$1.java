package com.huami.sky.ui.realtime;

import com.huami.sky.lib.entity.UserRelaxScore;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1 implements FlowCollector<List<? extends UserRelaxScore>> {
    public final /* synthetic */ SkyRealTimeViewModel a;

    /* JADX INFO: renamed from: com.huami.sky.ui.realtime.SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1", f = "SkyRealTimeViewModel.kt", i = {}, l = {152}, m = "emit", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1(SkyRealTimeViewModel skyRealTimeViewModel) {
        this.a = skyRealTimeViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(List<? extends UserRelaxScore> list, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<? extends UserRelaxScore> list2 = list;
            HMLog.info("SkyRealTimeViewModel", new SkyRealTimeViewModel$getRelaxScoreFromLocal$1.a(list2));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (Boxing.boxBoolean(((UserRelaxScore) obj2).getRelaxInfo().getCreatedAt() > this.a.relaxChartXStartTime).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((UserRelaxScore) it2.next()).getRelaxInfo());
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            if (!mutableList.isEmpty()) {
                mutableList.removeAll(this.a.relaxInfoList);
                this.a.relaxInfoList.addAll(mutableList);
                HMLog.info("SkyRealTimeViewModel", new SkyRealTimeViewModel$getRelaxScoreFromLocal$1.b(mutableList));
                MutableSharedFlow mutableSharedFlow = this.a._relaxInfoListFlow;
                anonymousClass1.b = 1;
                if (mutableSharedFlow.emit(mutableList, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
