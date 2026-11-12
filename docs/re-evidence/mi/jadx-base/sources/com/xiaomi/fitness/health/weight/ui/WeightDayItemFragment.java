package com.xiaomi.fitness.health.weight.ui;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.valueformatter.DayWeightHighLightMarkValueFormatter;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.holder.WeightBodyCompositionHolder;
import com.xiaomi.fitness.health.weight.holder.WeightBodyScoreHolder;
import com.xiaomi.fitness.health.weight.holder.WeightControlSuggestHolder;
import com.xiaomi.fitness.health.weight.holder.WeightFocusIndexHolder;
import com.xiaomi.fitness.health.weight.holder.WeightIndexEvaluationHolder;
import com.xiaomi.fitness.health.weight.holder.WeightSegmentalHolder;
import com.xiaomi.fitness.health.weight.ui.WeightDayItemFragment;
import com.xiaomi.fitness.health.weight.view.SEGMENTAL;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.a0c;
import defpackage.c0j;
import defpackage.ffr;
import defpackage.hak;
import defpackage.jui;
import defpackage.ozb;
import defpackage.pna;
import defpackage.qxi;
import defpackage.qzb;
import defpackage.rtr;
import defpackage.szb;
import defpackage.ufe;
import defpackage.uzb;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.vx5;
import defpackage.wzb;
import defpackage.xcm;
import defpackage.xqr;
import defpackage.yfe;
import defpackage.yzb;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u0000 j2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001jB\u0007¢\u0006\u0004\bi\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J!\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010\u0006R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020/\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010]R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/WeightDayItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lpna;", "", "initView", "()V", "initViewHolder", "initLineChartRecyclerView", "", "noSelected", "", "position", "dealOnChartItemSelected", "(ZI)V", Constants.KEY_REQUEST_DATA, "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "refreshReport", "(Ljava/util/List;)V", "refreshBottomView", "refreshCardHolder", "testRefreshHolder", "refreshLineChart", "refreshDataTitleView", "", "yAxisMaximum", "formatWeightYMaxValue", "(F)I", "initBundle", "refreshDownloadView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onInvisible", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "weightReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "latestWeightRecord", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "selectWeightItem", "preDayWeightItem", "Lcom/xiaomi/fitness/health/weight/holder/WeightBodyScoreHolder;", "weightBodyScoreHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightBodyScoreHolder;", "Lcom/xiaomi/fitness/health/weight/holder/WeightFocusIndexHolder;", "weightFocusIndexHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightFocusIndexHolder;", "Lcom/xiaomi/fitness/health/weight/holder/WeightBodyCompositionHolder;", "weightBodyCompositionHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightBodyCompositionHolder;", "Lcom/xiaomi/fitness/health/weight/holder/WeightControlSuggestHolder;", "weightControlSuggestHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightControlSuggestHolder;", "Lcom/xiaomi/fitness/health/weight/holder/WeightIndexEvaluationHolder;", "weightIndexEvaluationHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightIndexEvaluationHolder;", "Lcom/xiaomi/fitness/health/weight/holder/WeightSegmentalHolder;", "weightSegmentalFatHolder", "Lcom/xiaomi/fitness/health/weight/holder/WeightSegmentalHolder;", "weightSegmentalMuscleHolder", "", "reportData", "Ljava/lang/String;", "getReportData", "()Ljava/lang/String;", "setReportData", "(Ljava/lang/String;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class WeightDayItemFragment extends Hilt_WeightDayItemFragment<BasicDataViewModel, pna> {

    @NotNull
    public static final String TAG = "MiHealth:WeightDay";

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private WeightItem latestWeightRecord;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private WeightItem preDayWeightItem;

    @NotNull
    private String reportData = "0";

    @Nullable
    private WeightItem selectWeightItem;
    private WeightBodyCompositionHolder weightBodyCompositionHolder;
    private WeightBodyScoreHolder weightBodyScoreHolder;
    private WeightControlSuggestHolder weightControlSuggestHolder;
    private WeightFocusIndexHolder weightFocusIndexHolder;
    private WeightIndexEvaluationHolder weightIndexEvaluationHolder;

    @Nullable
    private DailyWeightReport weightReport;
    private WeightSegmentalHolder weightSegmentalFatHolder;
    private WeightSegmentalHolder weightSegmentalMuscleHolder;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.weight.ui.WeightDayItemFragment$requestData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<List<? extends DailyBasicReport>, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, WeightDayItemFragment.class, "refreshReport", "refreshReport(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(List<? extends DailyBasicReport> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends DailyBasicReport> list) {
            ((WeightDayItemFragment) this.receiver).refreshReport(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    public final void dealOnChartItemSelected(boolean noSelected, int position) {
        WeightItem weightItem;
        if (noSelected) {
            weightItem = this.latestWeightRecord;
        } else {
            DailyWeightReport dailyWeightReport = this.weightReport;
            if (dailyWeightReport == null) {
                weightItem = null;
            } else {
                if ((dailyWeightReport != null ? dailyWeightReport.getWeightRecordList() : null) == null) {
                    weightItem = null;
                } else {
                    DailyWeightReport dailyWeightReport2 = this.weightReport;
                    List<WeightItem> weightRecordList = dailyWeightReport2 != null ? dailyWeightReport2.getWeightRecordList() : null;
                    Intrinsics.checkNotNull(weightRecordList);
                    if (weightRecordList.isEmpty()) {
                        weightItem = null;
                    } else if (position >= 0) {
                        DailyWeightReport dailyWeightReport3 = this.weightReport;
                        Intrinsics.checkNotNull(dailyWeightReport3);
                        List<WeightItem> weightRecordList2 = dailyWeightReport3.getWeightRecordList();
                        Intrinsics.checkNotNull(weightRecordList2);
                        if (position < weightRecordList2.size()) {
                            DailyWeightReport dailyWeightReport4 = this.weightReport;
                            Intrinsics.checkNotNull(dailyWeightReport4);
                            List<WeightItem> weightRecordList3 = dailyWeightReport4.getWeightRecordList();
                            Intrinsics.checkNotNull(weightRecordList3);
                            weightItem = weightRecordList3.get(position);
                        } else {
                            weightItem = this.latestWeightRecord;
                        }
                    } else {
                        weightItem = this.latestWeightRecord;
                    }
                }
            }
        }
        this.selectWeightItem = weightItem;
        Logger.i("MiHealth:WeightDay", "dealOnChartItemSelected onSelected: " + noSelected + ";pos:" + position + ";selectItem " + weightItem);
        refreshCardHolder();
        refreshBottomView();
        refreshDownloadView();
    }

    private final int formatWeightYMaxValue(float yAxisMaximum) {
        if (yAxisMaximum < 60) {
            return 60;
        }
        return ((((int) yAxisMaximum) / 10) * 10) + 10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void initBundle() {
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            localDateNow = LocalDate.now().minusDays(numValueOf.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.mCurrentLocalDate = localDateNow;
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        rtr rtrVar = new rtr(this.lineChartAttrs);
        this.mYAxis = rtrVar;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setValueFormatter(new vx5(1));
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c, new xqr());
        this.mXAxis = vqrVar;
        this.mItemDecoration = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        DayWeightHighLightMarkValueFormatter dayWeightHighLightMarkValueFormatter = new DayWeightHighLightMarkValueFormatter(getMActivity());
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(dayWeightHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, dayWeightHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.lineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.weight.ui.WeightDayItemFragment$initLineChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                boolean z = barEntry == null || !barEntry.isSelected();
                if (z) {
                    DataTitleView dataTitleView = this.this$0.dataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                    }
                } else {
                    DataTitleView dataTitleView2 = this.this$0.dataTitleView;
                    if (dataTitleView2 != null) {
                        dataTitleView2.setVisibility(4);
                    }
                }
                this.this$0.dealOnChartItemSelected(z, position);
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        this.lineChartRecyclerView = ((pna) getMBinding()).D;
        this.dataTitleView = ((pna) getMBinding()).B;
        initLineChartRecyclerView();
        initViewHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewHolder() {
        uzb layoutWeightDayDetail = ((pna) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(layoutWeightDayDetail, "layoutWeightDayDetail");
        qzb healthLayoutWeightBodyScore = layoutWeightDayDetail.B;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightBodyScore, "healthLayoutWeightBodyScore");
        this.weightBodyScoreHolder = new WeightBodyScoreHolder(this, healthLayoutWeightBodyScore);
        wzb healthLayoutWeightFocusIndex = layoutWeightDayDetail.D;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightFocusIndex, "healthLayoutWeightFocusIndex");
        this.weightFocusIndexHolder = new WeightFocusIndexHolder(this, healthLayoutWeightFocusIndex);
        ozb healthLayoutWeightBodyComposition = layoutWeightDayDetail.A;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightBodyComposition, "healthLayoutWeightBodyComposition");
        this.weightBodyCompositionHolder = new WeightBodyCompositionHolder(this, healthLayoutWeightBodyComposition);
        szb healthLayoutWeightControlSuggest = layoutWeightDayDetail.C;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightControlSuggest, "healthLayoutWeightControlSuggest");
        this.weightControlSuggestHolder = new WeightControlSuggestHolder(this, healthLayoutWeightControlSuggest);
        yzb healthLayoutWeightIndexEvaluation = layoutWeightDayDetail.E;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightIndexEvaluation, "healthLayoutWeightIndexEvaluation");
        this.weightIndexEvaluationHolder = new WeightIndexEvaluationHolder(this, healthLayoutWeightIndexEvaluation);
        a0c healthLayoutWeightSegmentalFat = layoutWeightDayDetail.F;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightSegmentalFat, "healthLayoutWeightSegmentalFat");
        this.weightSegmentalFatHolder = new WeightSegmentalHolder(this, healthLayoutWeightSegmentalFat, SEGMENTAL.FAT);
        a0c healthLayoutWeightSegmentalMuscle = layoutWeightDayDetail.G;
        Intrinsics.checkNotNullExpressionValue(healthLayoutWeightSegmentalMuscle, "healthLayoutWeightSegmentalMuscle");
        this.weightSegmentalMuscleHolder = new WeightSegmentalHolder(this, healthLayoutWeightSegmentalMuscle, SEGMENTAL.MUSCLE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBottomView() {
        boolean z;
        WeightItem weightItem = this.selectWeightItem;
        if (weightItem == null) {
            z = false;
        } else {
            if (Intrinsics.areEqual("xiaomiwear_app_manually", weightItem != null ? weightItem.getSid() : null)) {
                z = false;
            } else {
                z = true;
            }
        }
        TextView tvStatement = ((pna) getMBinding()).C.I;
        Intrinsics.checkNotNullExpressionValue(tvStatement, "tvStatement");
        ViewExtKt.setVisible(tvStatement, z);
    }

    private final void refreshCardHolder() {
        WeightBodyScoreHolder weightBodyScoreHolder = this.weightBodyScoreHolder;
        WeightSegmentalHolder weightSegmentalHolder = null;
        if (weightBodyScoreHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyScoreHolder");
            weightBodyScoreHolder = null;
        }
        weightBodyScoreHolder.bindData(this.selectWeightItem, this.preDayWeightItem);
        WeightFocusIndexHolder weightFocusIndexHolder = this.weightFocusIndexHolder;
        if (weightFocusIndexHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightFocusIndexHolder");
            weightFocusIndexHolder = null;
        }
        weightFocusIndexHolder.bindData(this.selectWeightItem);
        WeightBodyCompositionHolder weightBodyCompositionHolder = this.weightBodyCompositionHolder;
        if (weightBodyCompositionHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyCompositionHolder");
            weightBodyCompositionHolder = null;
        }
        weightBodyCompositionHolder.bindData(this.selectWeightItem);
        WeightControlSuggestHolder weightControlSuggestHolder = this.weightControlSuggestHolder;
        if (weightControlSuggestHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightControlSuggestHolder");
            weightControlSuggestHolder = null;
        }
        weightControlSuggestHolder.bindData(this.selectWeightItem);
        WeightIndexEvaluationHolder weightIndexEvaluationHolder = this.weightIndexEvaluationHolder;
        if (weightIndexEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightIndexEvaluationHolder");
            weightIndexEvaluationHolder = null;
        }
        weightIndexEvaluationHolder.bindData(this.selectWeightItem);
        WeightSegmentalHolder weightSegmentalHolder2 = this.weightSegmentalFatHolder;
        if (weightSegmentalHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalFatHolder");
            weightSegmentalHolder2 = null;
        }
        weightSegmentalHolder2.bindData(this.selectWeightItem);
        WeightSegmentalHolder weightSegmentalHolder3 = this.weightSegmentalMuscleHolder;
        if (weightSegmentalHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalMuscleHolder");
        } else {
            weightSegmentalHolder = weightSegmentalHolder3;
        }
        weightSegmentalHolder.bindData(this.selectWeightItem);
    }

    private final void refreshDataTitleView() {
        String str;
        if (this.latestWeightRecord == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView);
            dataTitleView.c(getString(c0j.L6));
            return;
        }
        DailyWeightReport dailyWeightReport = this.weightReport;
        WeightItem preDayWeightItem = dailyWeightReport != null ? dailyWeightReport.getPreDayWeightItem() : null;
        WeightItem weightItem = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem);
        if (TimeDateUtil.isToday(TimeDateUtil.timestampToLocalDate(weightItem.getTime()))) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            String string = getString(c0j.v5);
            WeightItem weightItem2 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem2);
            str = String.format(locale, "%s %s", Arrays.copyOf(new Object[]{string, TimeDateUtil.getDateStr(weightItem2.getTime(), TimeUtils.FORMAT_H_M)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            WeightItem weightItem3 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem3);
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(weightItem3.getTime() * ((long) 1000));
            WeightItem weightItem4 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem4);
            str = dateYYYYMMddLocalFormat + " " + TimeDateUtil.getDateStr(weightItem4.getTime(), TimeUtils.FORMAT_H_M);
        }
        if (preDayWeightItem == null) {
            this.reportData = "0";
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale2 = Locale.getDefault();
            WeightItem weightItem5 = this.latestWeightRecord;
            Intrinsics.checkNotNull(weightItem5);
            String str2 = String.format(locale2, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(weightItem5.getWeight())}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            DataTitleView dataTitleView2 = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView2);
            dataTitleView2.a(requireContext(), getString(c0j.u4, str2), str2, str);
            return;
        }
        this.reportData = "1";
        long time = preDayWeightItem.getTime();
        float weight = preDayWeightItem.getWeight();
        WeightItem weightItem6 = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem6);
        float weight2 = weightItem6.getWeight();
        WeightItem weightItem7 = this.latestWeightRecord;
        Intrinsics.checkNotNull(weightItem7);
        int iAbs = Math.abs(Days.daysBetween(TimeDateUtil.timestampToLocalDate(weightItem7.getTime()), TimeDateUtil.timestampToLocalDate(time)).getDays());
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(weight2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        int iCompare = Float.compare(weight2, weight);
        if (iCompare == -1) {
            BigDecimal bigDecimalSubtract = new BigDecimal(weight).subtract(new BigDecimal(weight2));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            String str4 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{bigDecimalSubtract.setScale(2, RoundingMode.HALF_UP)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            DataTitleView dataTitleView3 = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView3);
            dataTitleView3.a(requireContext(), getResources().getQuantityString(qxi.I1, iAbs, str3, Integer.valueOf(iAbs), str4), str3, str);
            return;
        }
        if (iCompare != 1) {
            DataTitleView dataTitleView4 = this.dataTitleView;
            Intrinsics.checkNotNull(dataTitleView4);
            dataTitleView4.a(requireContext(), getString(c0j.u4, str3), str3, str);
            return;
        }
        BigDecimal bigDecimalSubtract2 = new BigDecimal(weight2).subtract(new BigDecimal(weight));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        String str5 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{bigDecimalSubtract2.setScale(2, RoundingMode.HALF_UP)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        DataTitleView dataTitleView5 = this.dataTitleView;
        Intrinsics.checkNotNull(dataTitleView5);
        dataTitleView5.a(requireContext(), getResources().getQuantityString(qxi.H1, iAbs, str3, Integer.valueOf(iAbs), str5), str3, str);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshDownloadView() {
        boolean z;
        WeightItem weightItem;
        Object objValueOf;
        Object objValueOf2;
        Logger.i("MiHealth:WeightDay", "refreshDownloadView selectWeightItem : " + this.selectWeightItem);
        WeightItem weightItem2 = this.selectWeightItem;
        if ((weightItem2 != null ? weightItem2.getBodyFatRate() : null) != null) {
            WeightItem weightItem3 = this.selectWeightItem;
            if (!Intrinsics.areEqual(weightItem3 != null ? weightItem3.getBodyFatRate() : null, 0.0f) && (weightItem = this.selectWeightItem) != null) {
                if (!Intrinsics.areEqual("xiaomiwear_app_manually", weightItem != null ? weightItem.getSid() : null)) {
                    WeightItem weightItem4 = this.selectWeightItem;
                    Intrinsics.checkNotNull(weightItem4);
                    if (weightItem4.getBmp() != null) {
                        WeightItem weightItem5 = this.selectWeightItem;
                        if (weightItem5 == null || (objValueOf = weightItem5.getScoreStandardType()) == null) {
                            objValueOf = Float.valueOf(0.0f);
                        }
                        if (!Intrinsics.areEqual(objValueOf, (Object) 1)) {
                            WeightItem weightItem6 = this.selectWeightItem;
                            if (weightItem6 == null || (objValueOf2 = weightItem6.getScoreStandardType()) == null) {
                                objValueOf2 = Float.valueOf(0.0f);
                            }
                            z = Intrinsics.areEqual(objValueOf2, (Object) 3) ? false : true;
                        }
                    }
                }
            }
        }
        TextView tvDownload = ((pna) getMBinding()).C.H;
        Intrinsics.checkNotNullExpressionValue(tvDownload, "tvDownload");
        ViewExtKt.setVisible(tvDownload, z);
        if (z) {
            ((pna) getMBinding()).C.H.setOnClickListener(new View.OnClickListener() { // from class: jfr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightDayItemFragment.refreshDownloadView$lambda$2(this.f22749a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshDownloadView$lambda$2(WeightDayItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Application application = ApplicationExtKt.getApplication();
        Context applicationContext = ApplicationExtKt.getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        WeightItem weightItem = this$0.selectWeightItem;
        Intrinsics.checkNotNull(weightItem);
        ElectronicScaleManagerExtKt.launchToDataReportActivity(application, applicationContext, weightItem);
    }

    private final void refreshLineChart() {
        List<MaxMinEntry> listC;
        DailyWeightReport dailyWeightReport = this.weightReport;
        if (dailyWeightReport == null) {
            vfe vfeVar = this.lineChartAttrs;
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            listC = ffr.c(vfeVar, new DailyWeightReport(TimeDateUtil.changZeroOfTheDay(localDate), "days"));
        } else {
            vfe vfeVar2 = this.lineChartAttrs;
            Intrinsics.checkNotNull(dailyWeightReport);
            listC = ffr.c(vfeVar2, dailyWeightReport);
        }
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listC);
            list2.addAll(listC);
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(listC);
        float theMinNumber = ChartUtil.getTheMinNumber(listC);
        if (theMaxNumber > 0.0f || theMinNumber > 0.0f) {
            float f = theMaxNumber + 1;
            float f2 = theMinNumber - ((f - theMinNumber) / 3);
            vfe vfeVar3 = this.lineChartAttrs;
            Intrinsics.checkNotNull(vfeVar3);
            vfeVar3.E = f;
            vfe vfeVar4 = this.lineChartAttrs;
            Intrinsics.checkNotNull(vfeVar4);
            vfeVar4.F = f2;
            rtr rtrVar = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar);
            rtrVar.setAxisMaximum(f);
            rtr rtrVar2 = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar2);
            rtrVar2.setAxisMinimum(f2);
            rtr rtrVar3 = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar3);
            rtrVar3.d(4, 10);
            rtr rtrVar4 = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar4);
            rtrVar4.f = 4;
        } else {
            rtr rtrVar5 = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar5);
            rtr rtrVarL = rtrVar5.l(this.mYAxis, 60.0f);
            this.mYAxis = rtrVarL;
            Intrinsics.checkNotNull(rtrVarL);
            rtrVarL.d(4, 10);
            rtr rtrVar6 = this.mYAxis;
            Intrinsics.checkNotNull(rtrVar6);
            rtrVar6.f = 4;
        }
        int size = listC.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.setYAxis(this.mYAxis);
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar2);
        ufeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    public final void refreshReport(List<? extends DailyBasicReport> result) {
        WeightItem weightItem;
        if (ArrayUtils.isEmpty(result)) {
            this.weightReport = null;
        } else {
            Intrinsics.checkNotNull(result);
            for (DailyBasicReport dailyBasicReport : result) {
                if (dailyBasicReport instanceof DailyWeightReport) {
                    this.weightReport = (DailyWeightReport) dailyBasicReport;
                }
            }
        }
        DailyWeightReport dailyWeightReport = this.weightReport;
        if (dailyWeightReport == null) {
            weightItem = null;
        } else if ((dailyWeightReport != null ? dailyWeightReport.getWeightRecordList() : null) == null) {
            weightItem = null;
        } else {
            DailyWeightReport dailyWeightReport2 = this.weightReport;
            Intrinsics.checkNotNull(dailyWeightReport2);
            List<WeightItem> weightRecordList = dailyWeightReport2.getWeightRecordList();
            Intrinsics.checkNotNull(weightRecordList);
            weightItem = weightRecordList.get(0);
        }
        this.latestWeightRecord = weightItem;
        this.selectWeightItem = weightItem;
        DailyWeightReport dailyWeightReport3 = this.weightReport;
        this.preDayWeightItem = dailyWeightReport3 != null ? dailyWeightReport3.getPreDayWeightItem() : null;
        DailyWeightReport dailyWeightReport4 = this.weightReport;
        Logger.i("MiHealth:WeightDay", "refreshReport,weight report is " + (dailyWeightReport4 != null ? dailyWeightReport4.toString() : null));
        refreshLineChart();
        refreshDataTitleView();
        refreshCardHolder();
        refreshBottomView();
        refreshDownloadView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        BasicDataViewModel basicDataViewModel = (BasicDataViewModel) getMViewModel();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        basicDataViewModel.triggerFetchFitnessReport(IWeightRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new WeightDayItemFragment$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
    }

    private final void testRefreshHolder() {
        WeightItem weightItem = this.selectWeightItem;
        long time = weightItem != null ? weightItem.getTime() : 0L;
        WeightItem weightItem2 = this.selectWeightItem;
        float weight = weightItem2 != null ? weightItem2.getWeight() : 55.0f;
        WeightItem weightItem3 = this.selectWeightItem;
        WeightSegmentalHolder weightSegmentalHolder = null;
        WeightItem weightItem4 = new WeightItem(time, weight, weightItem3 != null ? weightItem3.getBmi() : null);
        weightItem4.setFatMass(Float.valueOf(11.0f));
        weightItem4.setBodyFatRate(Float.valueOf(41.3f));
        weightItem4.setMuscleRate(Float.valueOf(30.0f));
        weightItem4.setMuscleMass(Float.valueOf(40.0f));
        weightItem4.setMoistureRate(Float.valueOf(55.0f));
        weightItem4.setBoneSaltRate(Float.valueOf(2.0f));
        weightItem4.setProteinRate(Float.valueOf(20.0f));
        weightItem4.setProteinMass(Float.valueOf(35.0f));
        weightItem4.setVisceralFat(Float.valueOf(40.0f));
        weightItem4.setBasalMetabolism(1300);
        weightItem4.setLeftUpperLimbMuscleMass(Float.valueOf(10.0f));
        weightItem4.setRightUpperLimbMuscleMass(Float.valueOf(11.0f));
        weightItem4.setTrunkMuscleMass(Float.valueOf(12.0f));
        weightItem4.setLeftLowerLimbMuscleMass(Float.valueOf(13.0f));
        weightItem4.setRightLowerLimbMuscleMass(Float.valueOf(14.0f));
        weightItem4.setUpperLimbMuscleBalance(2);
        weightItem4.setLowerLimbMuscleBalance(0);
        weightItem4.setLimbsMuscleBalance(1);
        weightItem4.setLeftUpperLimbMuscleLevel(1);
        weightItem4.setRightUpperLimbMuscleLevel(1);
        weightItem4.setTrunkMuscleLevel(1);
        weightItem4.setLeftLowerLimbMuscleLevel(1);
        weightItem4.setRightLowerLimbMuscleLevel(0);
        weightItem4.setLeftUpperLimbFatMass(Float.valueOf(25.0f));
        weightItem4.setRightUpperLimbFatMass(Float.valueOf(30.0f));
        weightItem4.setTrunkFatMass(Float.valueOf(35.0f));
        weightItem4.setLeftLowerLimbFatMass(Float.valueOf(15.0f));
        weightItem4.setRightLowerLimbFatMass(Float.valueOf(18.0f));
        weightItem4.setUpperLimbFatBalance(0);
        weightItem4.setLowerLimbFatBalance(1);
        weightItem4.setLimbsFatBalance(2);
        weightItem4.setLeftUpperLimbFatLevel(-1);
        weightItem4.setRightUpperLimbFatLevel(-1);
        weightItem4.setTrunkFatLevel(-1);
        weightItem4.setLeftLowerLimbFatLevel(-1);
        weightItem4.setRightLowerLimbFatLevel(-1);
        weightItem4.setBodyScore(95);
        weightItem4.setBodyShape(1);
        weightItem4.setSomatotype(-2);
        weightItem4.setBmi(Float.valueOf(21.7f));
        weightItem4.setBodyFatRate(Float.valueOf(37.4f));
        weightItem4.setWeightControl(Float.valueOf(10.0f));
        weightItem4.setMuscleControl(Float.valueOf(-5.0f));
        weightItem4.setFatControl(Float.valueOf(15.0f));
        weightItem4.setWhr(Float.valueOf(0.8f));
        weightItem4.setBodyAge(25);
        weightItem4.setLimbsSkeletalMuscleIndex(Float.valueOf(5.6f));
        weightItem4.setRecommendedCaloriesIntake(25);
        weightItem4.setSkeletalMuscleMass(Float.valueOf(34.6f));
        weightItem4.setScoreStandardType(1);
        WeightItem weightItem5 = new WeightItem(12345L, 59.0f, Float.valueOf(25.1f));
        this.preDayWeightItem = weightItem5;
        weightItem5.setBodyFatRate(Float.valueOf(30.0f));
        WeightBodyScoreHolder weightBodyScoreHolder = this.weightBodyScoreHolder;
        if (weightBodyScoreHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyScoreHolder");
            weightBodyScoreHolder = null;
        }
        weightBodyScoreHolder.bindData(weightItem4, this.preDayWeightItem);
        WeightFocusIndexHolder weightFocusIndexHolder = this.weightFocusIndexHolder;
        if (weightFocusIndexHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightFocusIndexHolder");
            weightFocusIndexHolder = null;
        }
        weightFocusIndexHolder.bindData(weightItem4);
        WeightBodyCompositionHolder weightBodyCompositionHolder = this.weightBodyCompositionHolder;
        if (weightBodyCompositionHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightBodyCompositionHolder");
            weightBodyCompositionHolder = null;
        }
        weightBodyCompositionHolder.bindData(weightItem4);
        WeightControlSuggestHolder weightControlSuggestHolder = this.weightControlSuggestHolder;
        if (weightControlSuggestHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightControlSuggestHolder");
            weightControlSuggestHolder = null;
        }
        weightControlSuggestHolder.bindData(weightItem4);
        WeightIndexEvaluationHolder weightIndexEvaluationHolder = this.weightIndexEvaluationHolder;
        if (weightIndexEvaluationHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightIndexEvaluationHolder");
            weightIndexEvaluationHolder = null;
        }
        weightIndexEvaluationHolder.bindData(weightItem4);
        WeightSegmentalHolder weightSegmentalHolder2 = this.weightSegmentalFatHolder;
        if (weightSegmentalHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalFatHolder");
            weightSegmentalHolder2 = null;
        }
        weightSegmentalHolder2.bindData(weightItem4);
        WeightSegmentalHolder weightSegmentalHolder3 = this.weightSegmentalMuscleHolder;
        if (weightSegmentalHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weightSegmentalMuscleHolder");
        } else {
            weightSegmentalHolder = weightSegmentalHolder3;
        }
        weightSegmentalHolder.bindData(weightItem4);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.w2;
    }

    @NotNull
    public final String getReportData() {
        return this.reportData;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "weight_detail_page", "page_fragment", "day", "title", "体重", "data", this.reportData);
        super.onInvisible();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((pna) getMBinding()).A.requestLayout();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i("MiHealth:WeightDay", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initView();
        requestData();
    }

    public final void setReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reportData = str;
    }
}
