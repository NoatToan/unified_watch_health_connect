package com.huami.sky.ui.realtime;

import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initObserve$3", f = "SkyRealTimeDataActivity.kt", i = {}, l = {429}, m = "invokeSuspend", n = {}, s = {})
public final class SkyRealTimeDataActivity$initObserve$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyRealTimeDataActivity b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RelaxInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<RelaxInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "放松指数图表更新，返回放松得分值: " + this.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyRealTimeDataActivity$initObserve$3(SkyRealTimeDataActivity skyRealTimeDataActivity, Continuation<? super SkyRealTimeDataActivity$initObserve$3> continuation) {
        super(2, continuation);
        this.b = skyRealTimeDataActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyRealTimeDataActivity$initObserve$3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyRealTimeDataActivity$initObserve$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<List<RelaxInfo>> relaxInfoListFlow = this.b.l().getRelaxInfoListFlow();
            final SkyRealTimeDataActivity skyRealTimeDataActivity = this.b;
            FlowCollector<List<RelaxInfo>> flowCollector = new FlowCollector<List<RelaxInfo>>() { // from class: com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initObserve$3$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<RelaxInfo> list, @NotNull Continuation<? super Unit> continuation) {
                    List<RelaxInfo> list2 = list;
                    HMLog.info("SkyRealTimeDataActivity", new SkyRealTimeDataActivity$initObserve$3.a(list2));
                    if (!list2.isEmpty()) {
                        skyRealTimeDataActivity.B((RelaxInfo) CollectionsKt.last((List) list2));
                        skyRealTimeDataActivity.C(list2);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (relaxInfoListFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
