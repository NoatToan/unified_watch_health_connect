package com.xiaomi.fitness.health.sleep.interfere.report;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartCompareInfoView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.qxi;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0012*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u0012*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportNightAwakeCountHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "sleepInterfereReportSleepNightAwakeCountTextView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartCompareInfoView;", "sleepChartCompareInfoView", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartCompareInfoView;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView;", "sleepRegularityChartView", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView;", "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"StringFormatInvalid"})
public final class SleepInterfereReportNightAwakeCountHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "SleepInterfereReportNightAwakeCountHolder";
    private final Context context;

    @NotNull
    private final LifecycleOwner lifecycleOwner;
    private final SleepInterfereReportChartCompareInfoView sleepChartCompareInfoView;
    private final TextView sleepInterfereReportSleepNightAwakeCountTextView;
    private final SleepInterfereLineChartView sleepRegularityChartView;

    @NotNull
    private final View view;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNightAwakeCountHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNightAwakeCountHolder$1", f = "SleepInterfereReportNightAwakeCountHolder.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportNightAwakeCountHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportNightAwakeCountHolder.this.getViewModel().getPlanStateFlow();
                final SleepInterfereReportNightAwakeCountHolder sleepInterfereReportNightAwakeCountHolder = SleepInterfereReportNightAwakeCountHolder.this;
                FlowCollector<? super SleepInterferePlan> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNightAwakeCountHolder.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepInterferePlan) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                        SleepData.NightAwakeCount nightAwakeCount;
                        SleepData.NightAwakeCount nightAwakeCount2;
                        Integer diffCount;
                        SleepData.NightAwakeCount nightAwakeCount3;
                        if (sleepInterferePlan == null) {
                            return Unit.INSTANCE;
                        }
                        SleepData sleep = sleepInterferePlan.getReport().getSleep();
                        int averageCount = (sleep == null || (nightAwakeCount3 = sleep.getNightAwakeCount()) == null) ? 0 : nightAwakeCount3.getAverageCount();
                        TextView textView = sleepInterfereReportNightAwakeCountHolder.sleepInterfereReportSleepNightAwakeCountTextView;
                        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
                        Context context = sleepInterfereReportNightAwakeCountHolder.context;
                        Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                        int i2 = qxi.W0;
                        SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
                        textView.setText(styledStringUtils.getStyledString(context, i2, averageCount, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "500"), TuplesKt.to(SpanPropKey.FONT_SIZE, "40.3%"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Boxing.boxInt(averageCount), new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "600"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
                        SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView = sleepInterfereReportNightAwakeCountHolder.sleepChartCompareInfoView;
                        SleepData sleep2 = sleepInterferePlan.getReport().getSleep();
                        if (sleep2 == null || (nightAwakeCount2 = sleep2.getNightAwakeCount()) == null || (diffCount = nightAwakeCount2.getDiffCount()) == null) {
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
                            ExtUtilKt.gone(sleepInterfereReportChartCompareInfoView);
                        } else {
                            int iIntValue = diffCount.intValue();
                            if (iIntValue > 0) {
                                String quantityString = sleepInterfereReportChartCompareInfoView.getContext().getResources().getQuantityString(qxi.m0, Math.abs(iIntValue), Boxing.boxInt(Math.abs(iIntValue)));
                                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(quantityString);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(-1);
                            } else if (iIntValue < 0) {
                                String quantityString2 = sleepInterfereReportChartCompareInfoView.getContext().getResources().getQuantityString(qxi.l0, Math.abs(iIntValue), Boxing.boxInt(Math.abs(iIntValue)));
                                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(quantityString2);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(1);
                            } else {
                                String string = sleepInterfereReportChartCompareInfoView.getContext().getResources().getString(c0j.he);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(string);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(0);
                            }
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
                            ExtUtilKt.visible(sleepInterfereReportChartCompareInfoView);
                        }
                        SleepInterfereLineChartView sleepInterfereLineChartView = sleepInterfereReportNightAwakeCountHolder.sleepRegularityChartView;
                        SleepData sleep3 = sleepInterferePlan.getReport().getSleep();
                        sleepInterfereLineChartView.setCountData((sleep3 == null || (nightAwakeCount = sleep3.getNightAwakeCount()) == null) ? null : nightAwakeCount.getDailyRecords());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (planStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepInterfereReportNightAwakeCountHolder(@NotNull View view, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        this.context = view.getContext();
        this.sleepInterfereReportSleepNightAwakeCountTextView = (TextView) view.findViewById(eri.qf);
        this.sleepChartCompareInfoView = (SleepInterfereReportChartCompareInfoView) view.findViewById(eri.ef);
        this.sleepRegularityChartView = (SleepInterfereLineChartView) view.findViewById(eri.uf);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final SleepInterfereReportViewModel getViewModel() {
        return this.viewModel;
    }
}
