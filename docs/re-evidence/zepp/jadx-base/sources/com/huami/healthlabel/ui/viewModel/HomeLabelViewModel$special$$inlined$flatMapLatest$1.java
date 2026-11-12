package com.huami.healthlabel.ui.viewModel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.huami.healthlabel.repository.HealthLabelRepo;
import com.huami.healthlabel.utils.ext.DateExtKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$special$$inlined$flatMapLatest$1", f = "HomeLabelViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class HomeLabelViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super HomeLabelViewModel.LoadData>, Unit, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ HomeLabelViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLabelViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, HomeLabelViewModel homeLabelViewModel) {
        super(3, continuation);
        this.d = homeLabelViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super HomeLabelViewModel.LoadData> flowCollector, Unit unit, @Nullable Continuation<? super Unit> continuation) {
        HomeLabelViewModel$special$$inlined$flatMapLatest$1 homeLabelViewModel$special$$inlined$flatMapLatest$1 = new HomeLabelViewModel$special$$inlined$flatMapLatest$1(continuation, this.d);
        homeLabelViewModel$special$$inlined$flatMapLatest$1.b = flowCollector;
        homeLabelViewModel$special$$inlined$flatMapLatest$1.c = unit;
        return homeLabelViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.b;
            Flow flowFlowCombine = FlowKt.flowCombine(FlowLiveDataConversions.asFlow(HealthLabelRepo.DefaultImpls.loadAllManagerLabel$default(this.d.com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment.KEY_REPO java.lang.String, false, 1, null)), FlowLiveDataConversions.asFlow(HealthLabelRepo.DefaultImpls.loadRecordLabel$default(this.d.com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment.KEY_REPO java.lang.String, Integer.MAX_VALUE, DateExtKt.getBeginningTime(new Date()), DateExtKt.getEndToday(new Date()), null, 8, null)), new HomeLabelViewModel$showHomeLabel$1$1(this.d, null));
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
