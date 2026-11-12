package com.huami.module.homepage.cards.business.pai;

import androidx.exifinterface.media.ExifInterface;
import com.huami.module.homepage.cards.business.pai.PaiBindingLogic.e;
import com.huami.pai_service.PaiInfo;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.module.homepage.cards.business.pai.PaiBindingLogic$bind$$inlined$flatMapLatest$2", f = "PaiBindingLogic.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
public final class PaiBindingLogic$bind$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3<FlowCollector<? super Triple<? extends Boolean, ? extends PaiInfo, ? extends Map<Long, Float>>>, Unit, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ PaiBindingLogic d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaiBindingLogic$bind$$inlined$flatMapLatest$2(Continuation continuation, PaiBindingLogic paiBindingLogic) {
        super(3, continuation);
        this.d = paiBindingLogic;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Triple<? extends Boolean, ? extends PaiInfo, ? extends Map<Long, Float>>> flowCollector, Unit unit, @Nullable Continuation<? super Unit> continuation) {
        PaiBindingLogic$bind$$inlined$flatMapLatest$2 paiBindingLogic$bind$$inlined$flatMapLatest$2 = new PaiBindingLogic$bind$$inlined$flatMapLatest$2(continuation, this.d);
        paiBindingLogic$bind$$inlined$flatMapLatest$2.b = flowCollector;
        paiBindingLogic$bind$$inlined$flatMapLatest$2.c = unit;
        return paiBindingLogic$bind$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.b;
            Date date = new Date();
            Flow flowFlowCombine = FlowKt.flowCombine(this.d.paiService.loadTodayPaiStatu(this.d.com.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String, 30, date), this.d.paiService.loadRecentPaiList(6, 30, date), this.d.new e(null));
            this.a = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowCombine, this) == coroutine_suspended) {
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
