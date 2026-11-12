package com.xiaomi.fitness.health.runningindicator;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IRunningIndicatorRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorBaseWeekMonthFragment;
import com.xiaomi.fitness.health.runningindicator.holder.CurrentRunningIndicatorViewHolder;
import com.xiaomi.fitness.health.runningindicator.holder.TrainingSuggestionViewHolder;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.g7e;
import defpackage.hak;
import defpackage.j9f;
import defpackage.pni;
import defpackage.sde;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.wae;
import defpackage.xcm;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 q*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001qB\u0007¢\u0006\u0004\bp\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010\bJ!\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\bR$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010J\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010j\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010K\u001a\u0004\bk\u0010M\"\u0004\bl\u0010OR\u0014\u0010o\u001a\u00020\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", "initView", "()V", Constants.KEY_REQUEST_DATA, "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "dailyRunningIndicatorReportList", "refreshView", "(Ljava/util/List;)V", "refreshWidgetCard", "reportList", "refreshLineChart", "report", "refreshDataTitleView", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;)V", "initViewHolder", "initUnderstandCard", "initLineChart", "refreshGradePredictionView", "", "timeDuration", "", "getTimeStr", "(Ljava/lang/Integer;)Ljava/lang/String;", "initBundle", "initViewBinding", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getMLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setMLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "Lvfe;", "mLineChartAttrs", "Lvfe;", "Lj9f;", "mLineChartAdapter", "Lj9f;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/view/DataTitleView;", "mDataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getMDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setMDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "dailyRunningIndicatorReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "latestItem", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "understandCard", "Landroid/view/View;", "getUnderstandCard", "()Landroid/view/View;", "setUnderstandCard", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "backBtn", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorViewModel;", "runningIndicatorViewModel", "Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorViewModel;", "getRunningIndicatorViewModel", "()Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorViewModel;", "setRunningIndicatorViewModel", "(Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorViewModel;)V", "Lcom/xiaomi/fitness/health/runningindicator/holder/CurrentRunningIndicatorViewHolder;", "currentRunningIndicatorViewHolder", "Lcom/xiaomi/fitness/health/runningindicator/holder/CurrentRunningIndicatorViewHolder;", "Lcom/xiaomi/fitness/health/runningindicator/holder/TrainingSuggestionViewHolder;", "trainingSuggestionViewHolder", "Lcom/xiaomi/fitness/health/runningindicator/holder/TrainingSuggestionViewHolder;", "Lorg/joda/time/LocalDate;", "mCurrentDate", "Lorg/joda/time/LocalDate;", "Lwae;", "runningIndicatorWidgetBinding", "Lwae;", "getRunningIndicatorWidgetBinding", "()Lwae;", "setRunningIndicatorWidgetBinding", "(Lwae;)V", "runningIndicatorGradePrediction", "getRunningIndicatorGradePrediction", "setRunningIndicatorGradePrediction", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRunningIndicatorBaseWeekMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningIndicatorBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/runningindicator/RunningIndicatorBaseWeekMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,320:1\n1863#2,2:321\n*S KotlinDebug\n*F\n+ 1 RunningIndicatorBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/runningindicator/RunningIndicatorBaseWeekMonthFragment\n*L\n156#1:321,2\n*E\n"})
public abstract class RunningIndicatorBaseWeekMonthFragment<VM extends BasicDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {
    public static final int DEFAULT_YAXIS = 80;

    @NotNull
    public static final String TAG = "RunningIndicatorDetailFragment";
    public static final int Y_AXIS_LINE_COUNT = 4;

    @Nullable
    private ImageView backBtn;

    @Nullable
    private CurrentRunningIndicatorViewHolder currentRunningIndicatorViewHolder;

    @Nullable
    private DailyRunningIndicatorReport dailyRunningIndicatorReport;

    @Nullable
    private RunningIndicatorItem latestItem;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private DataTitleView mDataTitleView;

    @Nullable
    private j9f mLineChartAdapter;

    @Nullable
    private vfe mLineChartAttrs;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerView;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private View runningIndicatorGradePrediction;

    @Nullable
    private RunningIndicatorViewModel runningIndicatorViewModel;

    @Nullable
    private wae runningIndicatorWidgetBinding;

    @Nullable
    private TrainingSuggestionViewHolder trainingSuggestionViewHolder;

    @Nullable
    private View understandCard;

    private final String getTimeStr(Integer timeDuration) {
        return (timeDuration == null || timeDuration.intValue() == 0) ? "--" : TimeDateUtil.getTimeStrWithSecDef(timeDuration.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void initBundle() {
        int fragmentPosition;
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int fragmentPosition2 = getFragmentPosition();
            if (fragmentPosition2 != 0) {
                localDateNow = fragmentPosition2 != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            } else {
                localDateNow = LocalDate.now().minusDays(iIntValue);
            }
            if (localDateNow == null) {
                fragmentPosition = getFragmentPosition();
                if (fragmentPosition != 0) {
                    localDateNow = LocalDate.now();
                } else if (fragmentPosition != 1) {
                    localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else {
            fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateNow = LocalDate.now();
            } else if (fragmentPosition != 1) {
                localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
            } else {
                localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
            }
        }
        this.mCurrentDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentDate = LocalDate.now();
        }
    }

    private final void initLineChart() {
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mLineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        int i = vfeVar.c;
        this.mChartEntries = new ArrayList();
        this.mYAxis = vnq.p(this.mLineChartAttrs, 80.0f, 5);
        this.mXAxis = new vqr(this.mLineChartAttrs, i, new RunningIndicatorAxisFormatter());
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mLineChartAttrs);
        yfe yfeVar = new yfe(this.mYAxis, this.mXAxis, this.mLineChartAttrs);
        yfeVar.setHighLightValueFormatter(new RunningIndicatorHighlightMarkValueFormatter());
        yfeVar.setBreakPointLine(Boolean.TRUE);
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.addItemDecoration(yfeVar);
        this.mLineChartAdapter = new j9f(getActivity(), this.mChartEntries, this.mLineChartRecyclerView, this.mXAxis, this.mLineChartAttrs, new RunningIndicatorHighlightMarkValueFormatter());
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.mLineChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.runningindicator.RunningIndicatorBaseWeekMonthFragment$initLineChart$itemGestureListener$1
            final /* synthetic */ RunningIndicatorBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView mDataTitleView = this.this$0.getMDataTitleView();
                    if (mDataTitleView != null) {
                        mDataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView mDataTitleView2 = this.this$0.getMDataTitleView();
                if (mDataTitleView2 != null) {
                    mDataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: x1l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RunningIndicatorBaseWeekMonthFragment.initUnderstandCard$lambda$2(this.f38584a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$2(RunningIndicatorBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, RunningIndicatorUnderstandFragment.class, null);
    }

    private final void initView() {
        initUnderstandCard();
        initLineChart();
        initViewHolder();
    }

    private final void initViewHolder() {
        wae waeVar = this.runningIndicatorWidgetBinding;
        Intrinsics.checkNotNull(waeVar);
        g7e currentRunningIndicator = waeVar.A;
        Intrinsics.checkNotNullExpressionValue(currentRunningIndicator, "currentRunningIndicator");
        this.currentRunningIndicatorViewHolder = new CurrentRunningIndicatorViewHolder(this, currentRunningIndicator);
        wae waeVar2 = this.runningIndicatorWidgetBinding;
        Intrinsics.checkNotNull(waeVar2);
        sde trainingFrequencySuggestion = waeVar2.B;
        Intrinsics.checkNotNullExpressionValue(trainingFrequencySuggestion, "trainingFrequencySuggestion");
        this.trainingSuggestionViewHolder = new TrainingSuggestionViewHolder(this, trainingFrequencySuggestion);
    }

    private final void refreshDataTitleView(DailyRunningIndicatorReport report) {
        RunningIndicatorItem latestItem = report.getLatestItem();
        this.latestItem = latestItem;
        if (latestItem == null) {
            DataTitleView dataTitleView = this.mDataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(latestItem);
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(latestItem.getTime() * ((long) 1000));
        RunningIndicatorItem runningIndicatorItem = this.latestItem;
        Intrinsics.checkNotNull(runningIndicatorItem);
        float runningIndicator = runningIndicatorItem.getRunningIndicator();
        RunningIndicatorItem runningIndicatorItem2 = this.latestItem;
        Intrinsics.checkNotNull(runningIndicatorItem2);
        Integer runningIndicatorLevel = runningIndicatorItem2.getRunningIndicatorLevel();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{String.valueOf(runningIndicator), RunningIndicatorUtil.INSTANCE.getRunningAbilityLevelName(runningIndicatorLevel)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        DataTitleView dataTitleView2 = this.mDataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str, String.valueOf(runningIndicator), dateYYYYMMddLocalFormat);
        }
    }

    private final void refreshGradePredictionView(DailyRunningIndicatorReport report) {
        GradePredictionItem gradePredictionItem = report != null ? report.getGradePredictionItem() : null;
        if (gradePredictionItem == null) {
            View view = this.runningIndicatorGradePrediction;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        GradePredictionItem gradePredictionItem2 = report.getGradePredictionItem();
        Intrinsics.checkNotNull(gradePredictionItem2);
        if (!gradePredictionItem2.getGradePredictionValid()) {
            View view2 = this.runningIndicatorGradePrediction;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = this.runningIndicatorGradePrediction;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.runningIndicatorGradePrediction;
        View viewFindViewById = view4 != null ? view4.findViewById(eri.Ce) : null;
        TextView textView = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(eri.Kn) : null;
        ImageView imageView = viewFindViewById != null ? (ImageView) viewFindViewById.findViewById(eri.C7) : null;
        if (textView != null) {
            textView.setText(getString(c0j.p7));
        }
        if (imageView != null) {
            imageView.setBackground(BaseFragmentExtKt.getDrawable(this, pni.T0));
        }
        View view5 = this.runningIndicatorGradePrediction;
        TextView textView2 = view5 != null ? (TextView) view5.findViewById(eri.xe) : null;
        View view6 = this.runningIndicatorGradePrediction;
        TextView textView3 = view6 != null ? (TextView) view6.findViewById(eri.Be) : null;
        View view7 = this.runningIndicatorGradePrediction;
        TextView textView4 = view7 != null ? (TextView) view7.findViewById(eri.Ae) : null;
        View view8 = this.runningIndicatorGradePrediction;
        TextView textView5 = view8 != null ? (TextView) view8.findViewById(eri.ye) : null;
        if (textView2 != null) {
            textView2.setText(getTimeStr(gradePredictionItem.getFiveKilometreGradePrediction()));
        }
        if (textView3 != null) {
            textView3.setText(getTimeStr(gradePredictionItem.getTenKilometreGradePrediction()));
        }
        if (textView4 != null) {
            textView4.setText(getTimeStr(gradePredictionItem.getHalfMarathonGradePrediction()));
        }
        if (textView5 != null) {
            textView5.setText(getTimeStr(gradePredictionItem.getFullMarathonGradePrediction()));
        }
    }

    private final void refreshLineChart(List<DailyRunningIndicatorReport> reportList) {
        Logger.d(TAG, "refreshLineChart mCurrentDate=" + this.mCurrentDate);
        DailyRunningIndicatorReport dailyRunningIndicatorReport = this.dailyRunningIndicatorReport;
        if (dailyRunningIndicatorReport == null) {
            LocalDate localDate = this.mCurrentDate;
            Intrinsics.checkNotNull(localDate);
            dailyRunningIndicatorReport = new DailyRunningIndicatorReport(TimeDateUtil.changZeroOfTheDay(localDate), "days", null, null, null, 28, null);
        }
        if (reportList == null) {
            return;
        }
        Logger.d(TAG, "refreshTopLineChart report=" + dailyRunningIndicatorReport);
        ArrayList arrayList = new ArrayList();
        for (DailyRunningIndicatorReport dailyRunningIndicatorReport2 : reportList) {
            RunningIndicatorUtil runningIndicatorUtil = RunningIndicatorUtil.INSTANCE;
            boolean z = true;
            if (getFragmentPosition() != 1) {
                z = false;
            }
            vfe vfeVar = this.mLineChartAttrs;
            Intrinsics.checkNotNull(vfeVar);
            ListExtKt.addAll(arrayList, runningIndicatorUtil.getLineChartEntries(dailyRunningIndicatorReport, z, vfeVar));
        }
        Logger.d(TAG, "refreshLineChart entryList=" + arrayList);
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = arrayList.size();
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(arrayList);
        float theMaxNumber = HealthUtil.getTheMaxNumber(arrayList);
        int i = theMaxNumber > 80.0f ? ((((int) (theMaxNumber - 80)) / 100) * 100) + 180 : 80;
        vnq<?> vnqVar = this.mYAxis;
        Intrinsics.checkNotNull(vnqVar);
        this.mYAxis = vnqVar.s(this.mYAxis, i, 4);
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        lineChartRecyclerView.setYAxis(this.mYAxis);
        j9f j9fVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(j9fVar);
        j9fVar.notifyDataSetChanged();
        refreshDataTitleView(dailyRunningIndicatorReport);
    }

    private final void refreshView(List<DailyRunningIndicatorReport> dailyRunningIndicatorReportList) {
        DailyRunningIndicatorReport dailyRunningIndicatorReport = this.dailyRunningIndicatorReport;
        if ((dailyRunningIndicatorReport != null ? dailyRunningIndicatorReport.getLatestItem() : null) != null) {
            DailyRunningIndicatorReport dailyRunningIndicatorReport2 = this.dailyRunningIndicatorReport;
            this.latestItem = dailyRunningIndicatorReport2 != null ? dailyRunningIndicatorReport2.getLatestItem() : null;
        }
        Logger.i(TAG, "current dailyRunningIndicatorReport is " + this.dailyRunningIndicatorReport);
        refreshLineChart(dailyRunningIndicatorReportList);
        refreshWidgetCard();
    }

    private final void refreshWidgetCard() {
        CurrentRunningIndicatorViewHolder currentRunningIndicatorViewHolder = this.currentRunningIndicatorViewHolder;
        if (currentRunningIndicatorViewHolder != null) {
            currentRunningIndicatorViewHolder.bindData(this.latestItem);
        }
        TrainingSuggestionViewHolder trainingSuggestionViewHolder = this.trainingSuggestionViewHolder;
        if (trainingSuggestionViewHolder != null) {
            trainingSuggestionViewHolder.bindData(this.latestItem);
        }
    }

    private final void requestData() {
        RunningIndicatorViewModel runningIndicatorViewModel = this.runningIndicatorViewModel;
        Intrinsics.checkNotNull(runningIndicatorViewModel);
        String viewTag = BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition());
        LocalDate localDate = this.mCurrentDate;
        Intrinsics.checkNotNull(localDate);
        runningIndicatorViewModel.triggerFetchFitnessReport(IRunningIndicatorRepository.class, viewTag, TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new RunningIndicatorBaseWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningIndicatorBaseWeekMonthFragment.requestData$lambda$0(this.f37449a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(RunningIndicatorBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        if (ArrayUtils.isEmpty(list)) {
            this$0.dailyRunningIndicatorReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            Logger.d(TAG, "reportLiveData report=" + dailyBasicReport);
            if (dailyBasicReport instanceof DailyRunningIndicatorReport) {
                this$0.dailyRunningIndicatorReport = (DailyRunningIndicatorReport) dailyBasicReport;
                arrayList.add(dailyBasicReport);
            }
        }
        DailyRunningIndicatorReport dailyRunningIndicatorReport = this$0.dailyRunningIndicatorReport;
        Logger.i(TAG, "dailyRunningIndicatorReport:" + (dailyRunningIndicatorReport != null ? dailyRunningIndicatorReport.toString() : null));
        this$0.refreshView(arrayList);
        this$0.refreshGradePredictionView(this$0.dailyRunningIndicatorReport);
        return Unit.INSTANCE;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final DataTitleView getMDataTitleView() {
        return this.mDataTitleView;
    }

    @Nullable
    public final LineChartRecyclerView getMLineChartRecyclerView() {
        return this.mLineChartRecyclerView;
    }

    @Nullable
    public final View getRunningIndicatorGradePrediction() {
        return this.runningIndicatorGradePrediction;
    }

    @Nullable
    public final RunningIndicatorViewModel getRunningIndicatorViewModel() {
        return this.runningIndicatorViewModel;
    }

    @Nullable
    public final wae getRunningIndicatorWidgetBinding() {
        return this.runningIndicatorWidgetBinding;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requestData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.runningIndicatorViewModel = (RunningIndicatorViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(RunningIndicatorViewModel.class);
        initViewBinding();
        initView();
    }

    public final void setMDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.mDataTitleView = dataTitleView;
    }

    public final void setMLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.mLineChartRecyclerView = lineChartRecyclerView;
    }

    public final void setRunningIndicatorGradePrediction(@Nullable View view) {
        this.runningIndicatorGradePrediction = view;
    }

    public final void setRunningIndicatorViewModel(@Nullable RunningIndicatorViewModel runningIndicatorViewModel) {
        this.runningIndicatorViewModel = runningIndicatorViewModel;
    }

    public final void setRunningIndicatorWidgetBinding(@Nullable wae waeVar) {
        this.runningIndicatorWidgetBinding = waeVar;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
