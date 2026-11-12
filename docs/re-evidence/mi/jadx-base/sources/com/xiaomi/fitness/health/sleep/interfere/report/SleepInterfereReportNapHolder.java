package com.xiaomi.fitness.health.sleep.interfere.report;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.Report;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartCompareInfoView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.kom;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportNapHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyNapRecord;", "dailyRecords", "", "bindBarChart", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;", "daySleepCountData", "bindCountData", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;)V", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;", "daySleepDuration", "bindDurationData", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "Lkom;", "binding", "Lkom;", "getBinding", "()Lkom;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "<init>", "(Landroid/content/Context;Lkom;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereReportNapHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportNapHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportNapHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1557#2:182\n1628#2,3:183\n*S KotlinDebug\n*F\n+ 1 SleepInterfereReportNapHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportNapHolder\n*L\n171#1:182\n171#1:183,3\n*E\n"})
public final class SleepInterfereReportNapHolder extends RecyclerView.d0 {
    private static final int DEFAULT_AVERAGE = 30;
    private static final int DEFAULT_MAX_DURATION = 90;

    @NotNull
    private static final String TAG = "SleepInterfereReportNapHolder";

    @NotNull
    private final kom binding;

    @NotNull
    private final Context ctx;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNapHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNapHolder$1", f = "SleepInterfereReportNapHolder.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SleepInterfereReportNapHolder.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportNapHolder.this.viewModel.getPlanStateFlow();
                final SleepInterfereReportNapHolder sleepInterfereReportNapHolder = SleepInterfereReportNapHolder.this;
                FlowCollector<? super SleepInterferePlan> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportNapHolder.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepInterferePlan) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                        Report report;
                        SleepData sleep;
                        SleepData.DaytimeSleepDuration daytimeSleepDuration;
                        Report report2;
                        SleepData sleep2;
                        SleepData.DaytimeSleepCount daytimeSleepCount;
                        if (sleepInterferePlan == null || (report2 = sleepInterferePlan.getReport()) == null || (sleep2 = report2.getSleep()) == null || (daytimeSleepCount = sleep2.getDaytimeSleepCount()) == null) {
                            Logger.i(SleepInterfereReportNapHolder.TAG, "can not bind nap with empty count data !!");
                        } else {
                            sleepInterfereReportNapHolder.bindCountData(daytimeSleepCount);
                        }
                        if (sleepInterferePlan == null || (report = sleepInterferePlan.getReport()) == null || (sleep = report.getSleep()) == null || (daytimeSleepDuration = sleep.getDaytimeSleepDuration()) == null) {
                            Logger.i(SleepInterfereReportNapHolder.TAG, "can not bind nap with empty duration data !!");
                        } else {
                            sleepInterfereReportNapHolder.bindDurationData(daytimeSleepDuration);
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
    public SleepInterfereReportNapHolder(@NotNull Context ctx, @NotNull kom binding, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.ctx = ctx;
        this.binding = binding;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void bindBarChart(List<SleepData.DailyNapRecord> dailyRecords) {
        List<SleepData.DailyNapRecord> list = dailyRecords;
        if (list == null || list.isEmpty()) {
            Logger.i(TAG, "bindBarChart with empty data!!");
            return;
        }
        List<SleepData.DailyNapRecord> list2 = dailyRecords;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (SleepData.DailyNapRecord dailyNapRecord : list2) {
            arrayList.add(new SleepData.DailyNapRecord(dailyNapRecord.getDateTimestamp(), dailyNapRecord.getNapMinutes()));
        }
        this.binding.D.setNapData(arrayList, 30);
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void bindCountData(@NotNull SleepData.DaytimeSleepCount daySleepCountData) {
        Intrinsics.checkNotNullParameter(daySleepCountData, "daySleepCountData");
        AppCompatTextView appCompatTextView = this.binding.F;
        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
        Context context = this.ctx;
        int i = qxi.z0;
        int averageCount = daySleepCountData.getAverageCount();
        SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
        appCompatTextView.setText(styledStringUtils.getStyledString(context, i, averageCount, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "380"), TuplesKt.to(SpanPropKey.FONT_SIZE, "40.33%"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Integer.valueOf(daySleepCountData.getAverageCount()), new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "600"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
        SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView = this.binding.B;
        Integer diffCount = daySleepCountData.getDiffCount();
        if (diffCount != null) {
            int iIntValue = diffCount.intValue();
            if (iIntValue > 0) {
                String quantityString = this.ctx.getResources().getQuantityString(qxi.o0, iIntValue, Integer.valueOf(iIntValue));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(quantityString);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(1);
            } else if (iIntValue < 0) {
                String quantityString2 = this.ctx.getResources().getQuantityString(qxi.n0, Math.abs(iIntValue), Integer.valueOf(Math.abs(iIntValue)));
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(quantityString2);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(-1);
            } else {
                String string = this.ctx.getResources().getString(c0j.oe);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(string);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(0);
            }
            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
            ViewExtKt.visible(sleepInterfereReportChartCompareInfoView);
        } else {
            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
            ExtUtilKt.gone(sleepInterfereReportChartCompareInfoView);
        }
        this.binding.C.setCountData(daySleepCountData.getDailyRecords());
    }

    public final void bindDurationData(@NotNull SleepData.DaytimeSleepDuration daySleepDuration) {
        Intrinsics.checkNotNullParameter(daySleepDuration, "daySleepDuration");
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        String string = this.ctx.getString(c0j.hg, timeDateUtil.getZNTimeWithMinute(daySleepDuration.getAverageMinutes(), true));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView = this.binding.A;
        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
        Context context = this.ctx;
        SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
        textView.setText(styledStringUtils.styleSmart(string, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "380"), TuplesKt.to(SpanPropKey.FONT_SIZE, "40.33%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "600"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
        SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView = this.binding.E;
        Integer diffMinutes = daySleepDuration.getDiffMinutes();
        if (diffMinutes != null) {
            int iIntValue = diffMinutes.intValue();
            if (iIntValue > 0) {
                String string2 = this.ctx.getString(c0j.qe, timeDateUtil.getZNTimeWithMinute(iIntValue, true));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(string2);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(1);
            } else if (iIntValue < 0) {
                String string3 = this.ctx.getString(c0j.pe, timeDateUtil.getZNTimeWithMinute(-iIntValue, true));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(string3);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(-1);
            } else {
                String string4 = this.ctx.getString(c0j.re);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                sleepInterfereReportChartCompareInfoView.setDescription(string4);
                sleepInterfereReportChartCompareInfoView.setArrowVisibility(0);
            }
            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
            ViewExtKt.visible(sleepInterfereReportChartCompareInfoView);
        } else {
            Intrinsics.checkNotNull(sleepInterfereReportChartCompareInfoView);
            ExtUtilKt.gone(sleepInterfereReportChartCompareInfoView);
        }
        bindBarChart(daySleepDuration.getDailyRecords());
    }

    @NotNull
    public final kom getBinding() {
        return this.binding;
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }
}
