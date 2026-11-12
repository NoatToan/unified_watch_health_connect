package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.StressEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.DailyFemaleHealthReport;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.spo2.Spo2Utils;
import com.xiaomi.fitness.health.vitality.VitalityUtil;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.util.CurseDataUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.util.PaiDataUtil;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.util.StressDataUtil;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import com.xiaomi.fitness.v2.HealthAdapterV2;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;
import defpackage.c0j;
import defpackage.f4c;
import defpackage.iji;
import defpackage.km5;
import defpackage.kp5;
import defpackage.l2c;
import defpackage.nf2;
import defpackage.o7e;
import defpackage.qxi;
import defpackage.ul5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 P2\u00020\u0001:\u0001PB\u0017\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\bN\u0010OJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\nJ%\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\nR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u00060Jj\u0002`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/BarChartContentViewHolderV2;", "Lnf2;", "Lkm5;", "dataModel", "", "showEmpty", "", "handleBarChart", "(Lkm5;Z)V", "setBarchartAttr", "(Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChart", "bindEmptyChartEntries", "(Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "record", "showHrmRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)V", "showBarChartBg", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "showSpo2Record", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "showTemperatureRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "showStressRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "showHearRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;)V", "Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "showCurseRecord", "(Lkm5;Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "showVitalityRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "showPaiRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;)V", "setDefaultXAxisView", "()V", "bindData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lo7e;", "binding", "Lo7e;", "getBinding", "()Lo7e;", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "cardTitleView", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Landroid/view/View;", "emptySpace", "Landroid/view/View;", "backgroundChart", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "", "displayNumber", "I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "talkback", "Ljava/lang/StringBuilder;", "<init>", "(Landroid/content/Context;Lo7e;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BarChartContentViewHolderV2 extends nf2 {

    @NotNull
    public static final String TAG = "BarChartContentViewHolderV2";

    @NotNull
    private final CustomBarChart<RecyclerBarEntry> backgroundChart;

    @NotNull
    private final CustomBarChart<RecyclerBarEntry> barChart;

    @NotNull
    private final o7e binding;

    @NotNull
    private final HomeCardCommonTitleView cardTitleView;

    @NotNull
    private final Context context;
    private int displayNumber;

    @NotNull
    private final View emptySpace;

    @NotNull
    private final StringBuilder talkback;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarChartContentViewHolderV2(@NotNull Context context, @NotNull o7e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        this.binding = binding;
        HomeCardCommonTitleView cardTitleView = binding.C;
        Intrinsics.checkNotNullExpressionValue(cardTitleView, "cardTitleView");
        this.cardTitleView = cardTitleView;
        XAxisView xAxisView = binding.E;
        Intrinsics.checkNotNullExpressionValue(xAxisView, "xAxisView");
        this.xAxisView = xAxisView;
        View emptySpace = binding.D;
        Intrinsics.checkNotNullExpressionValue(emptySpace, "emptySpace");
        this.emptySpace = emptySpace;
        CustomBarChart<RecyclerBarEntry> bgChart = binding.B;
        Intrinsics.checkNotNullExpressionValue(bgChart, "bgChart");
        this.backgroundChart = bgChart;
        CustomBarChart<RecyclerBarEntry> barChart = binding.A;
        Intrinsics.checkNotNullExpressionValue(barChart, "barChart");
        this.barChart = barChart;
        this.displayNumber = 24;
        this.talkback = new StringBuilder();
        setBaseCharView(barChart);
    }

    private final void bindEmptyChartEntries(CustomBarChart<RecyclerBarEntry> barChart, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 4) {
            barChart.e(HrmDataUtil.fillHomeSegmentBarEntry(new DailyHrReport(dataModel.f23978a, "days"), 24), 200.0f, 0.0f);
            return;
        }
        if (i == 7) {
            barChart.e(StressDataUtil.INSTANCE.createDayEntriesHome(new DailyStressReport(dataModel.f23978a, "days", "default_did"), this.displayNumber), 100.0f, 0.0f);
            return;
        }
        if (i == 13) {
            barChart.e(SpO2DataUtil.INSTANCE.createDayEntriesHome(new DailySpo2Report(dataModel.f23978a, "days"), this.displayNumber), 200.0f, 0.0f);
            return;
        }
        if (i == 17) {
            barChart.setEntryData(f4c.a(new DailyHearingReport(dataModel.f23978a, "days"), this.displayNumber));
            return;
        }
        if (i == 21) {
            barChart.setEntryData(TemperatureDataUtil.INSTANCE.fillHomeSegmentBarEntries(new DailyTempReport(dataModel.f23978a, "days")));
            return;
        }
        if (i == 23) {
            barChart.setEntryData(VitalityUtil.INSTANCE.createHomeEntries(0));
            this.xAxisView.setTxtXAxis1("0");
            this.xAxisView.setTxtXAxis3("100");
            return;
        }
        if (i == 9) {
            LocalDate localDateNow = LocalDate.now();
            XAxisView xAxisView = this.xAxisView;
            LocalDate localDateMinusDays = localDateNow.minusDays(3);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            xAxisView.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays));
            XAxisView xAxisView2 = this.xAxisView;
            LocalDate localDatePlusDays = localDateNow.plusDays(3);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            xAxisView2.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDatePlusDays));
            barChart.setEntryData(CurseDataUtil.INSTANCE.createDayEntriesHome(DailyFemaleHealthReport.INSTANCE.createDailyFemaleHealthReport(System.currentTimeMillis() / ((long) 1000), "home", "")));
            return;
        }
        if (i != 10) {
            return;
        }
        LocalDate localDateNow2 = LocalDate.now();
        PaiDataUtil paiDataUtil = PaiDataUtil.INSTANCE;
        Intrinsics.checkNotNull(localDateNow2);
        barChart.e(paiDataUtil.createEmptyList(localDateNow2), 200.0f, 0.0f);
        XAxisView xAxisView3 = this.xAxisView;
        LocalDate localDateMinusDays2 = localDateNow2.minusDays(6);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
        xAxisView3.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays2));
        this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDateNow2));
    }

    private final void handleBarChart(km5 dataModel, boolean showEmpty) {
        int i = dataModel.f23979b;
        if (i != 4 && i != 7 && i != 13 && i != 21) {
            ViewExtKt.visible(this.barChart);
            ExtUtilKt.gone(this.backgroundChart);
            return;
        }
        showBarChartBg(dataModel.h);
        if (showEmpty) {
            ExtUtilKt.invisible(this.barChart);
        } else {
            ViewExtKt.visible(this.barChart);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return (report instanceof DailyHrReport) || (report instanceof DailySpo2Report) || (report instanceof DailyTempReport) || (report instanceof DailyStressReport) || (report instanceof DailyHearingReport) || (report instanceof DailyFemaleHealthReport) || (report instanceof DailyVitalityReport) || (report instanceof DailyPaiReport);
    }

    private final void setBarchartAttr(km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 4) {
            this.barChart.c(this.context, iji.A0, iji.Q2);
            this.barChart.setBarChartType(6);
            setDefaultXAxisView();
            ViewExtKt.visible(this.backgroundChart);
            this.backgroundChart.c(this.context, iji.J, iji.A3);
            return;
        }
        if (i == 7) {
            this.barChart.c(this.context, iji.n3, iji.o3);
            this.barChart.setBarChartType(6);
            setDefaultXAxisView();
            ViewExtKt.visible(this.backgroundChart);
            this.backgroundChart.c(this.context, iji.J, iji.A3);
            return;
        }
        if (i == 13) {
            this.barChart.c(this.context, iji.k3, iji.Q2);
            this.barChart.setBarChartType(6);
            setDefaultXAxisView();
            ViewExtKt.visible(this.backgroundChart);
            this.backgroundChart.c(this.context, iji.J, iji.A3);
            return;
        }
        if (i == 17) {
            this.barChart.c(this.context, iji.B0, iji.common_transparent);
            this.barChart.setBarChartType(0);
            setDefaultXAxisView();
            return;
        }
        if (i == 21) {
            this.barChart.c(this.context, iji.o2, iji.p2);
            this.barChart.setBarChartType(6);
            setDefaultXAxisView();
            ViewExtKt.visible(this.backgroundChart);
            this.backgroundChart.c(this.context, iji.J, iji.A3);
            return;
        }
        if (i == 23) {
            this.barChart.b(1, 1.0f, 10, 0.95f);
            return;
        }
        if (i == 9) {
            this.barChart.b(6, 1.0f, 3, 0.84f);
        } else {
            if (i != 10) {
                return;
            }
            this.barChart.c(this.context, iji.W2, iji.V2);
            this.barChart.b(6, 10.0f, 1, 0.5f);
        }
    }

    private final void setDefaultXAxisView() {
        this.xAxisView.setTxtXAxis1(this.context.getString(c0j.f));
        this.xAxisView.setTxtXAxis3(this.context.getString(c0j.g));
    }

    private final void showBarChartBg(DailyBasicReport report) {
        this.backgroundChart.setEntryData(HrmDataUtil.INSTANCE.fillBgBarEntryList(report, 24));
        ViewExtKt.visible(this.backgroundChart);
    }

    private final void showCurseRecord(km5 dataModel, DailyFemaleHealthReport report) {
        report.getIsFemale();
        String string = ApplicationExtKt.getApplication().getString(c0j.f5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (report.getMenstrualStartTime() <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener == null || onLoadDataListener == null) {
                return;
            }
            onLoadDataListener.onLoadData(false);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        List<CurseEntry> listCreateDayEntriesHome = CurseDataUtil.INSTANCE.createDayEntriesHome(report);
        long j = 1000;
        String desc$default = CurseManager.getDesc$default(CurseManager.INSTANCE.getInstance(), report.getTodayTime() * j, 0, 0, 6, null);
        Logger.d(TAG, "showCurseRecord bind: " + desc$default);
        String dateStr = TimeDateUtil.getDateStr(report.getTodayTime(), ResourceExtKt.getString(c0j.i));
        String string2 = Intrinsics.areEqual(desc$default, ResourceExtKt.getString(c0j.O5)) ? ResourceExtKt.getString(c0j.B6) : (String) StringsKt__StringsKt.split$default((CharSequence) desc$default, new String[]{string}, false, 0, 6, (Object) null).get(0);
        this.cardTitleView.showValueAndDesc(string2, dateStr);
        this.barChart.setEntryData(listCreateDayEntriesHome);
        this.xAxisView.setTxtXAxis1(DateUtils.formatDateTime(ApplicationExtKt.getApplication(), report.getMenstrualStartTime() * j, 131096));
        this.xAxisView.setTxtXAxis3(DateUtils.formatDateTime(ApplicationExtKt.getApplication(), report.getMenstrualEndTime() * j, 131096));
        this.barChart.getAttribute().v = true;
        this.xAxisView.setEnableRTL(true);
        this.barChart.getAttribute().h = 0;
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(dateStr);
        sbClear.append(", ");
        sbClear.append(string2);
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }

    private final void showEmpty(km5 dataModel) {
        String string;
        ViewExtKt.setVisible(this.emptySpace, true);
        this.barChart.getAttribute().h = 1;
        boolean z = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() == 0;
        String strB = l2c.b(dataModel.f23979b);
        int i = dataModel.f23979b;
        if (i == 4) {
            string = ResourceExtKt.getString(z ? c0j.Rb : c0j.Qb);
        } else if (i == 7) {
            string = z ? ResourceExtKt.getString(c0j.Vb) : ResourceExtKt.getString(c0j.Qb);
        } else if (i == 13) {
            string = ResourceExtKt.getString(z ? c0j.Ub : c0j.Qb);
        } else if (i == 17) {
            string = ResourceExtKt.getString(c0j.Zb);
        } else if (i == 21) {
            string = ResourceExtKt.getString(c0j.Qb);
        } else if (i == 23) {
            string = ResourceExtKt.getString(c0j.Zb);
        } else if (i != 9) {
            string = i != 10 ? "" : ResourceExtKt.getString(c0j.Zb);
        } else {
            string = ResourceExtKt.getString(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).usedCurse() ? c0j.Ob : c0j.Pb);
        }
        HomeCardCommonTitleView.showEmpty$default(this.cardTitleView, string, null, 2, null);
        bindEmptyChartEntries(this.barChart, dataModel);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.Iq, strB));
        sbClear.append(", ");
        sbClear.append(string);
        handleBarChart(dataModel, true);
    }

    private final void showHearRecord(km5 dataModel, DailyHearingReport report) {
        List<RecyclerBarEntry> listA = f4c.a(report, this.displayNumber);
        RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
        Intrinsics.checkNotNull(listA);
        if (companion.getValidEntry(listA) <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener == null || onLoadDataListener == null) {
                return;
            }
            onLoadDataListener.onLoadData(false);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(report.getTotalDuration() / 60);
        long time = report.getTime();
        String string = this.context.getString(c0j.O8, zNTimeWithMin);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.cardTitleView.showValueAndDesc(zNTimeWithMin, TimeDateUtil.getDateMMddFormat(time));
        this.barChart.setEntryData(listA);
        this.barChart.getAttribute().h = 0;
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(TimeDateUtil.getDateMMddFormat(report.getTime()));
        sbClear.append(", ");
        sbClear.append(string);
    }

    private final void showHrmRecord(km5 dataModel, DailyHrReport record) {
        HrItem latestHrRecord = record.getLatestHrRecord();
        int hr = latestHrRecord != null ? latestHrRecord.getHr() : 0;
        if (hr <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener == null || onLoadDataListener == null) {
                return;
            }
            onLoadDataListener.onLoadData(false);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        this.barChart.e(HrmDataUtil.fillHomeSegmentBarEntry(record, 24), record.getMaxHr() + 10, 0.0f);
        String quantityString = this.context.getResources().getQuantityString(qxi.common_unit_heart_rate_desc, hr, Integer.valueOf(hr));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ResourceExtKt.getString(c0j.h);
        HrItem latestHrRecord2 = record.getLatestHrRecord();
        Intrinsics.checkNotNull(latestHrRecord2);
        String date = TimeUtils.formatDate(string, Long.valueOf(latestHrRecord2.getTime() * ((long) 1000)));
        this.cardTitleView.showValueAndDesc(quantityString, date);
        dataModel.f23978a = record.getTime();
        this.barChart.getAttribute().h = 0;
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(ResourceExtKt.getString(c0j.Gq, quantityString));
        sbClear.append(", ");
        sbClear.append(date);
        handleBarChart(dataModel, false);
    }

    private final void showPaiRecord(km5 dataModel, DailyPaiReport record) {
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dataModel.f23978a);
        List<PaiEntry> listCreatePaiOf7Days = PaiDataUtil.INSTANCE.createPaiOf7Days(record, localDateTimestampToLocalDate);
        if (HealthUtil.getTheMaxNumber(listCreatePaiOf7Days) <= 0.05f) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null && onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        ArrayList arrayList = new ArrayList();
        int size = listCreatePaiOf7Days.size();
        for (int i = 0; i < size; i++) {
            PaiEntry paiEntry = listCreatePaiOf7Days.get(i);
            paiEntry.setX(6 - paiEntry.getX());
            arrayList.add(listCreatePaiOf7Days.get(i));
        }
        this.barChart.e(arrayList, 200.0f, 0.0f);
        this.barChart.getAttribute().h = 0;
        RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) arrayList.get(0);
        int y = (int) recyclerBarEntry.getY();
        String strValueOf = String.valueOf(y);
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(recyclerBarEntry.timestamp);
        this.cardTitleView.showValueAndDesc(strValueOf, dateMMddFormat);
        XAxisView xAxisView = this.xAxisView;
        LocalDate localDateMinusDays = localDateTimestampToLocalDate.minusDays(6);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        xAxisView.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays));
        this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDateTimestampToLocalDate));
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(dateMMddFormat);
        sbClear.append(", ");
        sbClear.append(this.context.getString(c0j.Kq, String.valueOf(y)));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }

    private final void showRecord(km5 dataModel, DailyBasicReport report) {
        if (report instanceof DailyHrReport) {
            showHrmRecord(dataModel, (DailyHrReport) report);
            return;
        }
        if (report instanceof DailySpo2Report) {
            showSpo2Record(dataModel, (DailySpo2Report) report);
            return;
        }
        if (report instanceof DailyTempReport) {
            showTemperatureRecord(dataModel, (DailyTempReport) report);
            return;
        }
        if (report instanceof DailyStressReport) {
            showStressRecord(dataModel, (DailyStressReport) report);
            return;
        }
        if (report instanceof DailyHearingReport) {
            showHearRecord(dataModel, (DailyHearingReport) report);
            return;
        }
        if (report instanceof DailyFemaleHealthReport) {
            showCurseRecord(dataModel, (DailyFemaleHealthReport) report);
        } else if (report instanceof DailyVitalityReport) {
            showVitalityRecord(dataModel, (DailyVitalityReport) report);
        } else if (report instanceof DailyPaiReport) {
            showPaiRecord(dataModel, (DailyPaiReport) report);
        }
    }

    private final void showSpo2Record(km5 dataModel, DailySpo2Report record) {
        List<SegmentBarEntry> listCreateDayEntriesHome = SpO2DataUtil.INSTANCE.createDayEntriesHome(record, this.displayNumber);
        Spo2Item latestSpoRecord = record.getLatestSpoRecord();
        int spo2 = latestSpoRecord != null ? latestSpoRecord.getSpo2() : 0;
        if (spo2 <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener == null || onLoadDataListener == null) {
                return;
            }
            onLoadDataListener.onLoadData(false);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        int theSpoMinNumber = Spo2Utils.INSTANCE.getTheSpoMinNumber(listCreateDayEntriesHome);
        float f = 85.0f;
        if (theSpoMinNumber >= 0 && theSpoMinNumber < 85.0f) {
            f = (theSpoMinNumber / 10) * 10;
        }
        Logger.i(TAG, "showSpo2Record xMin:" + f + ";yMax:100.0");
        float f2 = (float) 5;
        this.barChart.e(listCreateDayEntriesHome, 100.0f + f2, f - f2);
        this.barChart.getAttribute().h = 0;
        long time = latestSpoRecord != null ? latestSpoRecord.getTime() : 0L;
        String str = TimeDateUtil.getDateMMddFormat(time) + " " + TimeDateUtil.getDateHHmm24Format(time);
        String quantityString = this.context.getResources().getQuantityString(qxi.z1, spo2, Integer.valueOf(spo2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = this.context.getResources().getQuantityString(qxi.X0, spo2, Integer.valueOf(spo2));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        this.cardTitleView.showValueAndDesc(quantityString, str);
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(str);
        sbClear.append(", ");
        sbClear.append(quantityString2);
        handleBarChart(dataModel, false);
    }

    private final void showStressRecord(km5 dataModel, DailyStressReport record) {
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        List<SegmentBarEntry> listCreateDayEntriesHome = stressDataUtil.createDayEntriesHome(record, this.displayNumber);
        StressItem latestStressRecord = record.getLatestStressRecord();
        int stress = latestStressRecord != null ? latestStressRecord.getStress() : 0;
        if (latestStressRecord == null || stress <= 0) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener == null || onLoadDataListener == null) {
                return;
            }
            onLoadDataListener.onLoadData(false);
            return;
        }
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        this.barChart.e(listCreateDayEntriesHome, 100.0f, 0.0f);
        this.barChart.getAttribute().h = 0;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(latestStressRecord.getStress())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String date = TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Long.valueOf(latestStressRecord.getTime() * ((long) 1000)));
        String stressTypeNameAsValue = StressDataUtil.getStressTypeNameAsValue(stress);
        String string = ApplicationExtKt.getApplication().getString(c0j.common_join_str, str, stressTypeNameAsValue);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, stressTypeNameAsValue, 0, false, 6, (Object) null);
        int length = stressTypeNameAsValue.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new RelativeSizeSpan(0.89f), iIndexOf$default, length, 17);
        this.cardTitleView.showValueAndDesc(spannableString, date);
        this.cardTitleView.updateExpandImg(StressEntry.INSTANCE.getStressTypeFace(stress, stressDataUtil.getDeviceType()));
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(l2c.b(7));
        sbClear.append(date);
        sbClear.append(", ");
        sbClear.append(string);
        dataModel.f23978a = record.getTime();
        dataModel.d = record.getSid();
        handleBarChart(dataModel, false);
    }

    private final void showTemperatureRecord(km5 dataModel, DailyTempReport report) {
        List<TemperatureItem> dailyAllTempDatas = report.getDailyAllTempDatas();
        String string = this.context.getString(c0j.Ym);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List<TemperatureItem> list = dailyAllTempDatas;
        if (list == null || list.isEmpty()) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null && onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
            showEmpty(dataModel);
            return;
        }
        Float bodyTemp = dailyAllTempDatas.get(0).getBodyTemp();
        Float skinTemp = dailyAllTempDatas.get(0).getSkinTemp();
        long time = dailyAllTempDatas.get(0).getTime();
        if (skinTemp != null && skinTemp.floatValue() > 0.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            string = String.format("%s%s", Arrays.copyOf(new Object[]{TemperatureDataUtil.INSTANCE.formatTemperature(skinTemp.floatValue()), ExtUtilKt.getString(c0j.hn)}, 2));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        }
        if (bodyTemp != null && bodyTemp.floatValue() > 0.0f) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            string = String.format("%s %s%s", Arrays.copyOf(new Object[]{ExtUtilKt.getString(c0j.dn), TemperatureDataUtil.INSTANCE.formatTemperature(bodyTemp.floatValue()), ExtUtilKt.getString(c0j.hn)}, 3));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        }
        String date = TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Long.valueOf(time * ((long) 1000)));
        this.cardTitleView.showValueAndDesc(string, date);
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        List<TemperatureEntry> listFillHomeSegmentBarEntries = temperatureDataUtil.fillHomeSegmentBarEntries(report);
        Pair<Float, Float> axisMaxMin = temperatureDataUtil.getAxisMaxMin(report.getBodyTempRecords(), report.getSkinTempRecords(), listFillHomeSegmentBarEntries);
        Logger.i("Temperature", "home pair " + axisMaxMin);
        float f = (float) 2;
        this.barChart.e(listFillHomeSegmentBarEntries, axisMaxMin.getFirst().floatValue() + f, axisMaxMin.getSecond().floatValue() - f);
        this.barChart.getAttribute().h = 0;
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(date);
        sbClear.append(", ");
        sbClear.append(string);
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null && onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
        handleBarChart(dataModel, false);
    }

    private final void showVitalityRecord(km5 dataModel, DailyVitalityReport record) {
        VitalityItem latestVitality = record.getLatestVitality();
        int total7daysVitality = latestVitality != null ? latestVitality.getTotal7daysVitality() : 0;
        if (total7daysVitality <= 0) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null && onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
            showEmpty(dataModel);
            return;
        }
        Logger.i(TAG, "home card vitality report is :" + record);
        String string = this.context.getString(c0j.v, Integer.valueOf(total7daysVitality));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
        this.cardTitleView.showValueAndDesc(string, dateMMddFormat);
        this.barChart.getAttribute().v = true;
        this.xAxisView.setEnableRTL(true);
        this.barChart.getAttribute().h = 0;
        this.barChart.setEntryData(VitalityUtil.INSTANCE.createHomeEntries(total7daysVitality));
        this.xAxisView.setTxtXAxis1("0");
        this.xAxisView.setTxtXAxis3("100");
        StringBuilder sbClear = StringsKt__StringBuilderJVMKt.clear(this.talkback);
        sbClear.append(dateMMddFormat);
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.zo, Integer.valueOf(total7daysVitality)));
        sbClear.append(", ");
        sbClear.append(ResourceExtKt.getString(c0j.vo, dateMMddFormat));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 == null || onLoadDataListener2 == null) {
            return;
        }
        onLoadDataListener2.onLoadData(true);
    }

    public final void bindData(@NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(dataModel);
        kp5 kp5VarA = ul5.c().a(dataModel.f23979b);
        this.cardTitleView.updateCardBgAndTitle(kp5VarA.c, kp5VarA.f24128b);
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
            }
        } else {
            ViewExtKt.setVisible(this.emptySpace, false);
            showRecord(dataModel, dailyBasicReport);
        }
        Logger.d(HealthAdapterV2.TAG, "talkback content:" + ((Object) this.talkback));
        ((nf2) this).itemView.setContentDescription(this.talkback.toString());
    }

    @NotNull
    public final o7e getBinding() {
        return this.binding;
    }
}
