package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.todayhealth.model.DailyHrHealthReport;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem;
import com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder;
import com.xiaomi.fitness.health.todayhealth.ui.items.HeartChartTitleView;
import com.xiaomi.fitness.health.todayhealth.ui.items.HeartHealthLineChartItemDecoration;
import com.xiaomi.fitness.health.todayhealth.ui.items.HeartHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.todayhealth.utils.HeartReportUtils;
import defpackage.c0j;
import defpackage.d5c;
import defpackage.eri;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.s13;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b;\u0010<J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u0018*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/HeartHealthHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initLineChartRecyclerView", "()V", "requestDailyReport", "updateHrChartViewTitleAndPostAbnormal", "refreshBarChart", "initPointLineColor", "bindData", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Landroid/widget/LinearLayout;", "imageGuide", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartChartTitleView;", "brDayTitleView", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartChartTitleView;", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "mChartEntries", "Ljava/util/List;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Ld5c;", "Lsf2;", "mLineChartAdapter", "Ld5c;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHealthLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHealthLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "dailyHeartReport", "Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHeartHealthHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartHealthHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/HeartHealthHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
public final class HeartHealthHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "HeartHealthHolder";

    @NotNull
    private final HeartChartTitleView brDayTitleView;
    private final Context context;

    @Nullable
    private DailyHrHealthReport dailyHeartReport;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;
    private final LinearLayout imageGuide;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private vfe lineChartAttrs;
    private final LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<BloodGlucoseEntry> mChartEntries;

    @Nullable
    private HeartHealthLineChartItemDecoration mItemDecoration;

    @Nullable
    private d5c<sf2> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private final View view;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder$requestDailyReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder$requestDailyReport$1", f = "HeartHealthHolder.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = HeartHealthHolder.this.new AnonymousClass1(continuation);
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
                HealthCheckViewModel healthCheckViewModel = HeartHealthHolder.this.healthCheckViewModel;
                LocalDate value = HeartHealthHolder.this.healthCheckViewModel.getLocalSelectDay().getValue();
                if (value == null) {
                    value = LocalDate.now();
                }
                Intrinsics.checkNotNull(value);
                StateFlow<DailyHrHealthReport> dailyHrHealthReportByDate = healthCheckViewModel.getDailyHrHealthReportByDate(value);
                final HeartHealthHolder heartHealthHolder = HeartHealthHolder.this;
                FlowCollector<? super DailyHrHealthReport> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder.requestDailyReport.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DailyHrHealthReport) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(DailyHrHealthReport dailyHrHealthReport, Continuation<? super Unit> continuation) {
                        if (dailyHrHealthReport == null) {
                            return Unit.INSTANCE;
                        }
                        heartHealthHolder.dailyHeartReport = dailyHrHealthReport;
                        Logger.i("HeartHealthHolder", "heart day report: " + heartHealthHolder.dailyHeartReport);
                        if (heartHealthHolder.dailyHeartReport != null) {
                            heartHealthHolder.updateHrChartViewTitleAndPostAbnormal();
                        } else {
                            heartHealthHolder.brDayTitleView.bindData(heartHealthHolder.context.getString(c0j.lq));
                        }
                        heartHealthHolder.refreshBarChart();
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (dailyHrHealthReportByDate.collect(flowCollector, this) == coroutine_suspended) {
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
    public HeartHealthHolder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.view = view;
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        Context context = view.getContext();
        this.context = context;
        this.lineChartRecyclerView = (LineChartRecyclerView) this.itemView.findViewById(eri.Aa);
        this.imageGuide = (LinearLayout) this.itemView.findViewById(eri.p7);
        View viewFindViewById = this.itemView.findViewById(eri.a1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        HeartChartTitleView heartChartTitleView = (HeartChartTitleView) viewFindViewById;
        this.brDayTitleView = heartChartTitleView;
        this.mChartEntries = new ArrayList();
        heartChartTitleView.bindData(context.getString(c0j.lq));
        initLineChartRecyclerView();
        requestDailyReport();
    }

    private final void initLineChartRecyclerView() {
        final LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        if (lineChartRecyclerView != null) {
            lineChartRecyclerView.post(new Runnable() { // from class: a5c
                @Override // java.lang.Runnable
                public final void run() {
                    HeartHealthHolder.initLineChartRecyclerView$lambda$1$lambda$0(this.f636a, lineChartRecyclerView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLineChartRecyclerView$lambda$1$lambda$0(final HeartHealthHolder this$0, LineChartRecyclerView chart) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chart, "$chart");
        this$0.lineChartAttrs = (vfe) chart.mAttrs;
        this$0.mChartEntries = new ArrayList();
        RecyclerView.o speedRatioLayoutManager = new SpeedRatioLayoutManager(this$0.context, this$0.lineChartAttrs);
        this$0.mYAxis = new rtr(this$0.lineChartAttrs);
        vfe vfeVar = this$0.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        this$0.mXAxis = new vqr(vfeVar, vfeVar.c);
        rtr rtrVar = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(175.0f);
        rtr rtrVar2 = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        vqr vqrVar = this$0.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new xqr());
        this$0.mItemDecoration = new HeartHealthLineChartItemDecoration(this$0.mYAxis, this$0.mXAxis, this$0.lineChartAttrs, false, 8, null);
        HeartHighLightMarkValueFormatter heartHighLightMarkValueFormatter = new HeartHighLightMarkValueFormatter(0);
        HeartHealthLineChartItemDecoration heartHealthLineChartItemDecoration = this$0.mItemDecoration;
        Intrinsics.checkNotNull(heartHealthLineChartItemDecoration);
        heartHealthLineChartItemDecoration.setHighLightValueFormatter(heartHighLightMarkValueFormatter);
        RecyclerView.n nVar = this$0.mItemDecoration;
        Intrinsics.checkNotNull(nVar);
        chart.addItemDecoration(nVar);
        d5c<sf2> d5cVar = new d5c<>(this$0.context, this$0.mChartEntries, chart, this$0.mXAxis, this$0.lineChartAttrs, heartHighLightMarkValueFormatter);
        this$0.mLineChartAdapter = d5cVar;
        chart.setAdapter(d5cVar);
        chart.setLayoutManager(speedRatioLayoutManager);
        chart.setNestedScrollingEnabled(false);
        chart.addOnItemTouchListener(new s13(this$0.context, chart, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder$initLineChartRecyclerView$1$1$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    HeartChartTitleView heartChartTitleView = this.this$0.brDayTitleView;
                    if (heartChartTitleView != null) {
                        heartChartTitleView.setVisibility(0);
                    }
                    this.this$0.imageGuide.setVisibility(0);
                    return;
                }
                HeartChartTitleView heartChartTitleView2 = this.this$0.brDayTitleView;
                if (heartChartTitleView2 != null) {
                    heartChartTitleView2.setVisibility(4);
                }
                this.this$0.imageGuide.setVisibility(4);
            }
        }));
    }

    private final void initPointLineColor() {
        HeartReportUtils heartReportUtils = HeartReportUtils.INSTANCE;
        HeartHealthLineChartItemDecoration heartHealthLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(heartHealthLineChartItemDecoration);
        heartReportUtils.initLineColor(3.9f, 10.0f, heartHealthLineChartItemDecoration);
        d5c<sf2> d5cVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(d5cVar);
        d5cVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshBarChart() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        if (lineChartRecyclerView != null) {
            lineChartRecyclerView.post(new Runnable() { // from class: b5c
                @Override // java.lang.Runnable
                public final void run() {
                    HeartHealthHolder.refreshBarChart$lambda$4(this.f3816a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    public static final void refreshBarChart$lambda$4(HeartHealthHolder this$0) {
        float fIntValue;
        Integer num;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DailyHrHealthReport dailyHrHealthReport = this$0.dailyHeartReport;
        if (dailyHrHealthReport == null) {
            LocalDate value = this$0.healthCheckViewModel.getLocalSelectDay().getValue();
            if (value == null) {
                value = LocalDate.now();
            }
            Intrinsics.checkNotNull(value);
            dailyHrHealthReport = new DailyHrHealthReport(TimeDateUtil.changZeroOfTheDay(value), "days");
        }
        List<HeartHealthValueItem> hrStatusRecords = dailyHrHealthReport.getHrStatusRecords();
        if (hrStatusRecords != null) {
            Iterator<T> it = hrStatusRecords.iterator();
            if (it.hasNext()) {
                Integer avgHr = ((HeartHealthValueItem) it.next()).getAvgHr();
                Integer numValueOf = Integer.valueOf(avgHr != null ? avgHr.intValue() : 0);
                while (it.hasNext()) {
                    Integer avgHr2 = ((HeartHealthValueItem) it.next()).getAvgHr();
                    Integer numValueOf2 = Integer.valueOf(avgHr2 != null ? avgHr2.intValue() : 0);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                fIntValue = num.intValue();
            } else {
                fIntValue = 0.0f;
            }
        } else {
            fIntValue = 0.0f;
        }
        HeartReportUtils heartReportUtils = HeartReportUtils.INSTANCE;
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vfe vfeVar = this$0.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateDayEntries = heartReportUtils.createDayEntries(context, vfeVar, dailyHrHealthReport, 2);
        List<BloodGlucoseEntry> list = this$0.mChartEntries;
        if (list != null) {
            list.clear();
            list.addAll(listCreateDayEntries);
        }
        float fMax = Math.max(fIntValue, 175.0f);
        rtr rtrVar = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(fMax);
        rtr rtrVar2 = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this$0.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        HeartHealthLineChartItemDecoration heartHealthLineChartItemDecoration = this$0.mItemDecoration;
        Intrinsics.checkNotNull(heartHealthLineChartItemDecoration);
        heartHealthLineChartItemDecoration.setXAxis(this$0.mXAxis);
        HeartHealthLineChartItemDecoration heartHealthLineChartItemDecoration2 = this$0.mItemDecoration;
        Intrinsics.checkNotNull(heartHealthLineChartItemDecoration2);
        heartHealthLineChartItemDecoration2.setYAxis(this$0.mYAxis);
        d5c<sf2> d5cVar = this$0.mLineChartAdapter;
        Intrinsics.checkNotNull(d5cVar);
        d5cVar.setYAxis(this$0.mYAxis);
        d5c<sf2> d5cVar2 = this$0.mLineChartAdapter;
        Intrinsics.checkNotNull(d5cVar2);
        d5cVar2.setXAxis(this$0.mXAxis);
        d5c<sf2> d5cVar3 = this$0.mLineChartAdapter;
        if (d5cVar3 != null) {
            d5cVar3.notifyDataSetChanged();
        }
        this$0.initPointLineColor();
        this$0.lineChartRecyclerView.invalidate();
    }

    private final void requestDailyReport() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHrChartViewTitleAndPostAbnormal() {
        DailyHrHealthReport dailyHrHealthReport = this.dailyHeartReport;
        if (dailyHrHealthReport != null) {
            if ((dailyHrHealthReport != null ? dailyHrHealthReport.getLastHrRecord() : null) != null) {
                DailyHrHealthReport dailyHrHealthReport2 = this.dailyHeartReport;
                Intrinsics.checkNotNull(dailyHrHealthReport2);
                HeartHealthValueItem lastHrRecord = dailyHrHealthReport2.getLastHrRecord();
                Intrinsics.checkNotNull(lastHrRecord);
                lastHrRecord.getTime();
                DailyHrHealthReport dailyHrHealthReport3 = this.dailyHeartReport;
                Intrinsics.checkNotNull(dailyHrHealthReport3);
                HeartHealthValueItem lastHrRecord2 = dailyHrHealthReport3.getLastHrRecord();
                Intrinsics.checkNotNull(lastHrRecord2);
                String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(lastHrRecord2.getTime());
                Resources resources = this.context.getResources();
                int i = qxi.common_unit_heart_rate_desc;
                Integer avgHr = lastHrRecord.getAvgHr();
                Intrinsics.checkNotNull(avgHr);
                String quantityString = resources.getQuantityString(i, avgHr.intValue(), lastHrRecord.getAvgHr());
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                String string = lastHrRecord.getAvgHr().toString();
                Integer statue = lastHrRecord.getStatue();
                if (statue != null && statue.intValue() == 0) {
                    this.brDayTitleView.bindData(this.context, quantityString, string, dateHHmm24Format, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
                    return;
                }
                Integer statue2 = lastHrRecord.getStatue();
                if (statue2 != null && statue2.intValue() == 1) {
                    this.brDayTitleView.bindData(this.context, quantityString, string, dateHHmm24Format, lastHrRecord.getHeartStatusString(1), "");
                    return;
                }
                String string2 = this.context.getString(c0j.W8);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                this.brDayTitleView.bindData(this.context, quantityString, string, dateHHmm24Format, string2, HeartHealthValueItem.getHeartStatusString$default(lastHrRecord, 0, 1, null));
                return;
            }
        }
        this.brDayTitleView.bindData(this.context.getString(c0j.lq));
    }

    public final void bindData() {
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
