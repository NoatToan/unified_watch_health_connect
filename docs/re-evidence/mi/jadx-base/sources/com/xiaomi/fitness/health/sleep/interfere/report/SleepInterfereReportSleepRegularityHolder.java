package com.xiaomi.fitness.health.sleep.interfere.report;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartCompareInfoView;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartInfo2ColumnView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import java.time.ZoneId;
import java.util.List;
import java.util.TimeZone;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0012*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u0012*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n \u0012*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001c\u0010\u001f\u001a\n \u0012*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSleepRegularityHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartInfo2ColumnView;", "sleepChartInfo2ColumnView", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartInfo2ColumnView;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartCompareInfoView;", "sleepChartCompareInfoView", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartCompareInfoView;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView;", "sleepChart", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView;", "awakeChartInfo2ColumnView", "awakeChartCompareInfoView", "awakeChart", "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepInterfereReportSleepRegularityHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "SleepInterfereReportSleepRegularityHolder";
    private final SleepInterfereLineChartView awakeChart;
    private final SleepInterfereReportChartCompareInfoView awakeChartCompareInfoView;
    private final SleepInterfereReportChartInfo2ColumnView awakeChartInfo2ColumnView;
    private final Context context;

    @NotNull
    private final LifecycleOwner lifecycleOwner;
    private final SleepInterfereLineChartView sleepChart;
    private final SleepInterfereReportChartCompareInfoView sleepChartCompareInfoView;
    private final SleepInterfereReportChartInfo2ColumnView sleepChartInfo2ColumnView;

    @NotNull
    private final View view;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepRegularityHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepRegularityHolder$1", f = "SleepInterfereReportSleepRegularityHolder.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportSleepRegularityHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportSleepRegularityHolder.this.getViewModel().getPlanStateFlow();
                final SleepInterfereReportSleepRegularityHolder sleepInterfereReportSleepRegularityHolder = SleepInterfereReportSleepRegularityHolder.this;
                FlowCollector<? super SleepInterferePlan> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepRegularityHolder.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepInterferePlan) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
                    public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                        String strMinutesToLocalizedTime;
                        SleepData.WakeUpTime wakeUpTime;
                        List<SleepData.DailyRecords> dailyRecords;
                        SleepData.WakeUpTime wakeUpTime2;
                        Integer diffMinutes;
                        SleepData.WakeUpTime wakeUpTime3;
                        SleepData.WakeUpTime wakeUpTime4;
                        SleepData.Bedtime bedtime;
                        List<SleepData.DailyRecords> dailyRecords2;
                        SleepData.Bedtime bedtime2;
                        Integer diffMinutes2;
                        SleepData.Bedtime bedtime3;
                        SleepData.Bedtime bedtime4;
                        if (sleepInterferePlan == null) {
                            return Unit.INSTANCE;
                        }
                        SleepInterfereReportChartInfo2ColumnView sleepInterfereReportChartInfo2ColumnView = sleepInterfereReportSleepRegularityHolder.sleepChartInfo2ColumnView;
                        SleepInterfereReportSleepRegularityHolder sleepInterfereReportSleepRegularityHolder2 = sleepInterfereReportSleepRegularityHolder;
                        SleepData sleep = sleepInterferePlan.getReport().getSleep();
                        String str = "--:--";
                        if (sleep == null || (bedtime4 = sleep.getBedtime()) == null) {
                            strMinutesToLocalizedTime = "--:--";
                        } else {
                            int averageMinutes = bedtime4.getAverageMinutes();
                            Context context = sleepInterfereReportSleepRegularityHolder2.getView().getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("UTC"));
                            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
                            strMinutesToLocalizedTime = TimeDateUtil.minutesToLocalizedTime(context, averageMinutes, timeZone);
                            if (strMinutesToLocalizedTime == null) {
                                strMinutesToLocalizedTime = "--:--";
                            }
                        }
                        sleepInterfereReportChartInfo2ColumnView.setStartInfo(strMinutesToLocalizedTime, ExtUtilKt.getString(c0j.Ed));
                        SleepData sleep2 = sleepInterferePlan.getReport().getSleep();
                        sleepInterfereReportChartInfo2ColumnView.setEndInfo((sleep2 == null || (bedtime3 = sleep2.getBedtime()) == null || !bedtime3.isRegular()) ? ExtUtilKt.getString(c0j.ng) : ExtUtilKt.getString(c0j.pg), ExtUtilKt.getString(c0j.Vd));
                        SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView = sleepInterfereReportSleepRegularityHolder.sleepChartCompareInfoView;
                        SleepData sleep3 = sleepInterferePlan.getReport().getSleep();
                        if (sleep3 == null || (bedtime2 = sleep3.getBedtime()) == null || (diffMinutes2 = bedtime2.getDiffMinutes()) == null) {
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
                            ExtUtilKt.gone(sleepInterfereReportChartCompareInfoView);
                        } else {
                            int iIntValue = diffMinutes2.intValue();
                            if (iIntValue > 0) {
                                String string = sleepInterfereReportChartCompareInfoView.getContext().getString(c0j.te, TimeDateUtil.INSTANCE.getZNTimeWithMinute(Math.abs(iIntValue), true));
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(string);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(-1);
                            } else if (iIntValue < 0) {
                                String string2 = sleepInterfereReportChartCompareInfoView.getContext().getString(c0j.se, TimeDateUtil.INSTANCE.getZNTimeWithMinute(Math.abs(iIntValue), true));
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(string2);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(1);
                            } else {
                                String string3 = sleepInterfereReportChartCompareInfoView.getContext().getString(c0j.ue);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                sleepInterfereReportChartCompareInfoView.setDescription(string3);
                                sleepInterfereReportChartCompareInfoView.setArrowVisibility(0);
                            }
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
                            ExtUtilKt.visible(sleepInterfereReportChartCompareInfoView);
                        }
                        SleepData sleep4 = sleepInterferePlan.getReport().getSleep();
                        if (sleep4 != null && (bedtime = sleep4.getBedtime()) != null && (dailyRecords2 = bedtime.getDailyRecords()) != null) {
                            sleepInterfereReportSleepRegularityHolder.sleepChart.setBedtimeData(dailyRecords2);
                        }
                        SleepInterfereReportChartInfo2ColumnView sleepInterfereReportChartInfo2ColumnView2 = sleepInterfereReportSleepRegularityHolder.awakeChartInfo2ColumnView;
                        SleepInterfereReportSleepRegularityHolder sleepInterfereReportSleepRegularityHolder3 = sleepInterfereReportSleepRegularityHolder;
                        SleepData sleep5 = sleepInterferePlan.getReport().getSleep();
                        if (sleep5 != null && (wakeUpTime4 = sleep5.getWakeUpTime()) != null) {
                            int averageMinutes2 = wakeUpTime4.getAverageMinutes();
                            Context context2 = sleepInterfereReportSleepRegularityHolder3.getView().getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            TimeZone timeZone2 = TimeZone.getTimeZone(ZoneId.of("UTC"));
                            Intrinsics.checkNotNullExpressionValue(timeZone2, "getTimeZone(...)");
                            String strMinutesToLocalizedTime2 = TimeDateUtil.minutesToLocalizedTime(context2, averageMinutes2, timeZone2);
                            if (strMinutesToLocalizedTime2 != null) {
                                str = strMinutesToLocalizedTime2;
                            }
                        }
                        sleepInterfereReportChartInfo2ColumnView2.setStartInfo(str, ExtUtilKt.getString(c0j.Nd));
                        SleepData sleep6 = sleepInterferePlan.getReport().getSleep();
                        sleepInterfereReportChartInfo2ColumnView2.setEndInfo((sleep6 == null || (wakeUpTime3 = sleep6.getWakeUpTime()) == null || !wakeUpTime3.isRegular()) ? ExtUtilKt.getString(c0j.ng) : ExtUtilKt.getString(c0j.pg), ExtUtilKt.getString(c0j.Kf));
                        SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView2 = sleepInterfereReportSleepRegularityHolder.awakeChartCompareInfoView;
                        SleepData sleep7 = sleepInterferePlan.getReport().getSleep();
                        if (sleep7 == null || (wakeUpTime2 = sleep7.getWakeUpTime()) == null || (diffMinutes = wakeUpTime2.getDiffMinutes()) == null) {
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView2);
                            ExtUtilKt.gone(sleepInterfereReportChartCompareInfoView2);
                        } else {
                            int iIntValue2 = diffMinutes.intValue();
                            if (iIntValue2 > 0) {
                                String string4 = sleepInterfereReportChartCompareInfoView2.getContext().getString(c0j.je, TimeDateUtil.INSTANCE.getZNTimeWithMinute(Math.abs(iIntValue2), true));
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                sleepInterfereReportChartCompareInfoView2.setDescription(string4);
                                sleepInterfereReportChartCompareInfoView2.setArrowVisibility(-1);
                            } else if (iIntValue2 < 0) {
                                String string5 = sleepInterfereReportChartCompareInfoView2.getContext().getString(c0j.ie, TimeDateUtil.INSTANCE.getZNTimeWithMinute(Math.abs(iIntValue2), true));
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                sleepInterfereReportChartCompareInfoView2.setDescription(string5);
                                sleepInterfereReportChartCompareInfoView2.setArrowVisibility(1);
                            } else {
                                String string6 = sleepInterfereReportChartCompareInfoView2.getContext().getString(c0j.ke);
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                sleepInterfereReportChartCompareInfoView2.setDescription(string6);
                                sleepInterfereReportChartCompareInfoView2.setArrowVisibility(0);
                            }
                            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView2);
                            ExtUtilKt.visible(sleepInterfereReportChartCompareInfoView2);
                        }
                        SleepData sleep8 = sleepInterferePlan.getReport().getSleep();
                        if (sleep8 != null && (wakeUpTime = sleep8.getWakeUpTime()) != null && (dailyRecords = wakeUpTime.getDailyRecords()) != null) {
                            sleepInterfereReportSleepRegularityHolder.awakeChart.setBedtimeData(dailyRecords);
                        }
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
    public SleepInterfereReportSleepRegularityHolder(@NotNull View view, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        this.context = view.getContext();
        this.sleepChartInfo2ColumnView = (SleepInterfereReportChartInfo2ColumnView) view.findViewById(eri.ff);
        this.sleepChartCompareInfoView = (SleepInterfereReportChartCompareInfoView) view.findViewById(eri.ef);
        this.sleepChart = (SleepInterfereLineChartView) view.findViewById(eri.uf);
        this.awakeChartInfo2ColumnView = (SleepInterfereReportChartInfo2ColumnView) view.findViewById(eri.T);
        this.awakeChartCompareInfoView = (SleepInterfereReportChartCompareInfoView) view.findViewById(eri.S);
        this.awakeChart = (SleepInterfereLineChartView) view.findViewById(eri.U);
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
