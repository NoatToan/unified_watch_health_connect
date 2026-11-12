package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.DayRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.hrm.HrmFragment;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.view.TodayHealthDataTitleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hak;
import defpackage.onq;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.sf2;
import defpackage.ubj;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u001f\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bK\u0010LJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001c\u0010,\u001a\n \u001e*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR \u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/HeartRateHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "hrmReport", "", "getTitleHrValue", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)I", "", "initBarChart", "()V", "report", "refreshBarChart", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)V", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "list1", "list2", "", "areListsEqual", "(Ljava/util/List;Ljava/util/List;)Z", "bindData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Landroid/widget/LinearLayout;", "summaryCard", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/ImageView;", "understandView", "Landroid/widget/ImageView;", "Lr02;", "mBarChartAttrs", "Lr02;", "Ls02;", "mItemDecoration", "Ls02;", "Lubj;", "Lsf2;", "mBarChartAdapter", "Lubj;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "I", "", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "preItem", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeartRateHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "HeartRateHolder";
    private final Context context;

    @NotNull
    private final TodayHealthDataTitleView dataTitleView;
    private int displayNumber;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private ubj<sf2> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private List<SegmentBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private HrItem preItem;

    @NotNull
    private final BarChartRecyclerView recyclerView;

    @NotNull
    private final LinearLayout summaryCard;
    private final ImageView understandView;

    @Nullable
    private onq valueFormatter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder$bindData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder$bindData$2", f = "HeartRateHolder.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeartRateHolder.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthCheckViewModel healthCheckViewModel = HeartRateHolder.this.healthCheckViewModel;
                LocalDate value = HeartRateHolder.this.healthCheckViewModel.getLocalSelectDay().getValue();
                if (value == null) {
                    value = LocalDate.now();
                }
                Intrinsics.checkNotNull(value);
                StateFlow<DailyHrReport> heartRateData = healthCheckViewModel.getHeartRateData(value);
                final HeartRateHolder heartRateHolder = HeartRateHolder.this;
                FlowCollector<? super DailyHrReport> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder.bindData.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DailyHrReport) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(DailyHrReport dailyHrReport, Continuation<? super Unit> continuation) {
                        HrItem latestHrRecord = dailyHrReport != null ? dailyHrReport.getLatestHrRecord() : null;
                        if (latestHrRecord == null) {
                            ExtUtilKt.gone(heartRateHolder.summaryCard);
                            ExtUtilKt.visible(heartRateHolder.emptyView);
                            return Unit.INSTANCE;
                        }
                        HrItem hrItem = heartRateHolder.preItem;
                        if (hrItem != null && hrItem.getTime() == latestHrRecord.getTime()) {
                            return Unit.INSTANCE;
                        }
                        heartRateHolder.preItem = latestHrRecord;
                        ExtUtilKt.visible(heartRateHolder.summaryCard);
                        ExtUtilKt.gone(heartRateHolder.emptyView);
                        List<AbnormalHrItem> abnormalHrRecords = dailyHrReport.getAbnormalHrRecords();
                        Integer numBoxInt = abnormalHrRecords != null ? Boxing.boxInt(abnormalHrRecords.size()) : null;
                        List<AbnormalFibItem> abnormalFibRecords = dailyHrReport.getAbnormalFibRecords();
                        Integer numBoxInt2 = abnormalFibRecords != null ? Boxing.boxInt(abnormalFibRecords.size()) : null;
                        List<SegmentItem> abnormalHrLowRecords = dailyHrReport.getAbnormalHrLowRecords();
                        Integer numBoxInt3 = abnormalHrLowRecords != null ? Boxing.boxInt(abnormalHrLowRecords.size()) : null;
                        List<SegmentItem> abnormalHrHighRecords = dailyHrReport.getAbnormalHrHighRecords();
                        Logger.d(HeartRateHolder.TAG, "abnormalHrRecords=" + numBoxInt + " abnormalFibRecords=" + numBoxInt2 + " abnormalHrLowRecords=" + numBoxInt3 + " abnormalHrHighRecord=" + (abnormalHrHighRecords != null ? Boxing.boxInt(abnormalHrHighRecords.size()) : null) + " ");
                        StringBuilder sb = new StringBuilder();
                        sb.append("dailyReportList.first() latestHrItem=");
                        sb.append(latestHrRecord);
                        Logger.d(HeartRateHolder.TAG, sb.toString());
                        int titleHrValue = heartRateHolder.getTitleHrValue(dailyHrReport);
                        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_heart_rate_desc2, titleHrValue, Boxing.boxInt(titleHrValue));
                        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                        String strValueOf = String.valueOf(titleHrValue);
                        String string = ApplicationExtKt.getApplication().getString(c0j.R);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        heartRateHolder.dataTitleView.a(ApplicationExtKt.getApplication(), quantityString, strValueOf, string);
                        heartRateHolder.itemView.setContentDescription(ResourceExtKt.getString(c0j.k7) + ", " + quantityString + ", " + string);
                        heartRateHolder.initBarChart();
                        heartRateHolder.refreshBarChart(dailyHrReport);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (heartRateData.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateHolder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.context = view.getContext();
        View viewFindViewById = this.itemView.findViewById(eri.H2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.dataTitleView = (TodayHealthDataTitleView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(eri.pd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.recyclerView = (BarChartRecyclerView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(eri.Jh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.summaryCard = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(eri.E4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.emptyView = (LinearLayout) viewFindViewById4;
        this.understandView = (ImageView) this.itemView.findViewById(eri.y3);
    }

    private final boolean areListsEqual(List<? extends SegmentBarEntry> list1, List<? extends SegmentBarEntry> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = list1.get(i);
            if (!Intrinsics.areEqual(segmentBarEntry != null ? Float.valueOf(segmentBarEntry.getY()) : null, list2.get(i).getY())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(HeartRateHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("origin", "today_health");
        bundle.putSerializable("local_date", this$0.healthCheckViewModel.getLocalSelectDay().getValue());
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        UtilsKt.gotoPage$default(context, HrmFragment.class, bundle, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTitleHrValue(DailyHrReport hrmReport) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        if (!TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(hrmReport.getTime()))) {
            hrmReport.getAvgHr();
            return hrmReport.getAvgHr();
        }
        HrItem latestHrRecord = hrmReport.getLatestHrRecord();
        if ((latestHrRecord != null ? Integer.valueOf(latestHrRecord.getHr()) : null) == null) {
            return 0;
        }
        HrItem latestHrRecord2 = hrmReport.getLatestHrRecord();
        Integer numValueOf = latestHrRecord2 != null ? Integer.valueOf(latestHrRecord2.getHr()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initBarChart() {
        r02 r02Var = (r02) this.recyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(context, 0);
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.mBarChartAttrs);
        this.mYAxis = new rtr(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.displayNumber, this.valueFormatter);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(this.valueFormatter);
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        DayRateHighLightMarkValueFormatter dayRateHighLightMarkValueFormatter = new DayRateHighLightMarkValueFormatter(0);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(dayRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView = this.recyclerView;
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView.addItemDecoration(s02Var2);
        ubj<sf2> ubjVar = new ubj<>(this.context, this.mEntries, this.recyclerView, this.mXAxis, this.mBarChartAttrs, dayRateHighLightMarkValueFormatter);
        this.mBarChartAdapter = ubjVar;
        this.recyclerView.setAdapter(ubjVar);
        this.recyclerView.setLayoutManager(speedRatioLayoutManager);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.addOnItemTouchListener(new hak(this.context, this.recyclerView, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder$initBarChart$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    this.this$0.dataTitleView.setVisibility(0);
                } else {
                    this.this$0.dataTitleView.setVisibility(4);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshBarChart(DailyHrReport report) {
        HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<SegmentBarEntry> listFillDaySegmentBarEntry = hrmDataUtil.fillDaySegmentBarEntry(r02Var, report);
        List<SegmentBarEntry> list = this.mEntries;
        if (list != null && !list.isEmpty()) {
            List<SegmentBarEntry> list2 = this.mEntries;
            Intrinsics.checkNotNull(list2);
            List<? extends SegmentBarEntry> list3 = CollectionsKt___CollectionsKt.toList(list2);
            if (listFillDaySegmentBarEntry.isEmpty() || areListsEqual(list3, listFillDaySegmentBarEntry)) {
                return;
            }
        }
        List<SegmentBarEntry> list4 = this.mEntries;
        Intrinsics.checkNotNull(list4);
        list4.clear();
        List<SegmentBarEntry> list5 = this.mEntries;
        Intrinsics.checkNotNull(list5);
        list5.addAll(listFillDaySegmentBarEntry);
        float theMaxNumber = RecyclerBarEntry.INSTANCE.getTheMaxNumber(listFillDaySegmentBarEntry);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.l(this.mYAxis, theMaxNumber);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.mYAxis);
        ubj<sf2> ubjVar = this.mBarChartAdapter;
        Intrinsics.checkNotNull(ubjVar);
        ubjVar.setYAxis(this.mYAxis);
        ubj<sf2> ubjVar2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(ubjVar2);
        ubjVar2.notifyDataSetChanged();
    }

    public final void bindData() {
        this.understandView.setOnClickListener(new View.OnClickListener() { // from class: d6c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateHolder.bindData$lambda$0(this.f15132a, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass2(null), 3, null);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }
}
