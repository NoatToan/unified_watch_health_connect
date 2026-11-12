package com.xiaomi.fitness.homepage.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.DailyFemaleHealthReport;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDataUtil;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorUtil;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.trainload.TrainingLoadDataUtil;
import com.xiaomi.fitness.health.vitality.VitalityUtil;
import com.xiaomi.fitness.util.CurseDataUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.PaiDataUtil;
import com.xiaomi.fitness.util.VO2MaxDataUtil;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gjm;
import defpackage.hz2;
import defpackage.iji;
import defpackage.km5;
import defpackage.l2c;
import defpackage.nf2;
import defpackage.pz2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001IB\u000f\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b6\u0010\bR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/SpecialBarChartContentViewHolder;", "Lnf2;", "Landroid/content/Context;", "context", "Lkm5;", "dataModel", "", "setBarchartAttr", "(Landroid/content/Context;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "showRunningIndicatorRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;)V", "showEmpty", "(Lkm5;)V", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChart", "bindEmptyEntries", "(Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "record", "showPaiRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "vo2MaxReport", "showVO2MaxRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;)V", "Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "showCurseRecord", "(Lkm5;Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "healthReport", "showTrainingLoadRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "showPhysicalStatusRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "sleepReport", "showSleepRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "showVitalityRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "showBloodPressureRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;)V", "bindData", "Landroid/widget/ImageView;", "typeImg", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "txtDataTitle", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "txtSportContent", "Ljava/lang/StringBuffer;", "talkback", "Ljava/lang/StringBuffer;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SpecialBarChartContentViewHolder extends nf2 {

    @NotNull
    private static final String TAG = "SpecialBarChartContentViewHolder";

    @NotNull
    private final CustomBarChart<RecyclerBarEntry> barChart;

    @Nullable
    private StringBuffer talkback;

    @NotNull
    private final TextView txtDataTitle;

    @NotNull
    private final TextView txtSportContent;

    @NotNull
    private final ImageView typeImg;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialBarChartContentViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.typeImg = (ImageView) itemView.findViewById(eri.O7);
        this.txtDataTitle = (TextView) itemView.findViewById(eri.ao);
        this.barChart = (CustomBarChart) itemView.findViewById(eri.f0);
        this.xAxisView = (XAxisView) itemView.findViewById(eri.c);
        this.txtSportContent = (TextView) itemView.findViewById(eri.Cn);
    }

    private final void bindEmptyEntries(CustomBarChart<RecyclerBarEntry> barChart, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 10) {
            LocalDate localDateNow = LocalDate.now();
            PaiDataUtil paiDataUtil = PaiDataUtil.INSTANCE;
            Intrinsics.checkNotNull(localDateNow);
            barChart.e(paiDataUtil.createEmptyList(localDateNow), 200.0f, 0.0f);
            XAxisView xAxisView = this.xAxisView;
            LocalDate localDateMinusDays = localDateNow.minusDays(6);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            xAxisView.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays));
            this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDateNow));
            return;
        }
        if (i == 12) {
            barChart.setEntryData(VO2MaxDataUtil.createDayEntriesHome(TimeDateUtil.timestampToLocalDate(dataModel.f23978a), 0));
            VO2MaxDataUtil.getMaxMinModel();
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.Lo));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.Jo));
            return;
        }
        if (i == 12) {
            CurseDataUtil curseDataUtil = CurseDataUtil.INSTANCE;
            LocalDate localDateNow2 = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
            barChart.setEntryData(curseDataUtil.createEmptyList(localDateNow2));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.u6));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.R5));
            return;
        }
        if (i == 20) {
            barChart.setEntryData(TrainingLoadDataUtil.INSTANCE.createHomeEntries(0));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.l8));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.n8));
            return;
        }
        if (i == 6) {
            barChart.setSleepEntryData(gjm.c(0, dataModel.f23978a));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.Wh));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.Th));
            return;
        }
        if (i == 22) {
            barChart.getAttribute().h = 0;
            barChart.setEntryData(RunningIndicatorUtil.INSTANCE.createHomeEntries(0));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.zc));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.xc));
            return;
        }
        if (i == 23) {
            barChart.setEntryData(VitalityUtil.INSTANCE.createHomeEntries(0));
            this.xAxisView.setTxtXAxis1("0");
            this.xAxisView.setTxtXAxis3("100");
            return;
        }
        if (i == 16) {
            List listB = hz2.b(-1);
            Intrinsics.checkNotNullExpressionValue(listB, "createHomeLevelEntries(...)");
            barChart.setEntryData(listB);
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.y2));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.x2));
            return;
        }
        if (i == 24) {
            List listB2 = hz2.b(-1);
            Intrinsics.checkNotNullExpressionValue(listB2, "createHomeLevelEntries(...)");
            barChart.setEntryData(listB2);
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.jb));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.ib));
            return;
        }
        if (i == 9) {
            LocalDate localDateNow3 = LocalDate.now();
            XAxisView xAxisView2 = this.xAxisView;
            LocalDate localDateMinusDays2 = localDateNow3.minusDays(3);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
            xAxisView2.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays2));
            XAxisView xAxisView3 = this.xAxisView;
            LocalDate localDatePlusDays = localDateNow3.plusDays(3);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            xAxisView3.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDatePlusDays));
            barChart.setEntryData(CurseDataUtil.INSTANCE.createDayEntriesHome(DailyFemaleHealthReport.INSTANCE.createDailyFemaleHealthReport(System.currentTimeMillis() / ((long) 1000), "home", "")));
        }
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return (report instanceof DailyPaiReport) || (report instanceof DailyVo2MaxReport) || (report instanceof DailyFemaleHealthReport) || (report instanceof DailyTrainingLoadReport) || (report instanceof AllDaySleepReport) || (report instanceof DailyRunningIndicatorReport) || (report instanceof DailyVitalityReport) || (report instanceof DailyBloodPressureReport) || (report instanceof DailyPhysicalStatusReport);
    }

    private final void setBarchartAttr(Context context, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 6) {
            this.barChart.b(3, 1.0f, 5, 0.9f);
        }
        if (i == 12) {
            this.barChart.b(6, 1.0f, 2, 0.84f);
            return;
        }
        if (i == 16) {
            this.barChart.b(3, 1.0f, 9, 0.9f);
            return;
        }
        if (i == 20) {
            this.barChart.b(3, 1.0f, 7, 0.9f);
            return;
        }
        if (i == 9) {
            this.barChart.b(6, 1.0f, 3, 0.84f);
            return;
        }
        if (i == 10) {
            this.barChart.c(context, iji.W2, iji.V2);
            this.barChart.b(6, 10.0f, 1, 0.5f);
            return;
        }
        switch (i) {
            case 22:
                this.barChart.b(4, 1.0f, 8, 0.9f);
                break;
            case 23:
                this.barChart.b(1, 1.0f, 10, 0.95f);
                break;
            case 24:
                this.barChart.b(3, 1.0f, 12, 0.9f);
                break;
        }
    }

    private final void showBloodPressureRecord(km5 dataModel, DailyBloodPressureReport report) {
        String str;
        Logger.i(TAG, "home card showBloodPressureRecord " + report);
        if (report.getLatestRecord() == null) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        BloodPressureItem latestRecord = report.getLatestRecord();
        Intrinsics.checkNotNull(latestRecord);
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(report.getTime()));
        stringBuffer.append(", ");
        TextView textView = this.txtDataTitle;
        if (report.getLatestRecord() != null) {
            BloodPressureItem latestRecord2 = report.getLatestRecord();
            if (latestRecord2 != null) {
                str = AppUtil.getApp().getString(c0j.t1, String.valueOf(latestRecord2.getHighPressure()), String.valueOf(latestRecord2.getLowPressure())) + ExtUtilKt.getString(c0j.D2);
            } else {
                str = null;
            }
            StringBuffer stringBuffer2 = this.talkback;
            if (stringBuffer2 != null) {
                stringBuffer2.append(str);
            }
        } else {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = this.txtSportContent;
        String string = ResourceExtKt.getString(c0j.h);
        BloodPressureItem latestRecord3 = report.getLatestRecord();
        Intrinsics.checkNotNull(latestRecord3);
        textView2.setText(TimeUtils.formatDate(string, Long.valueOf(latestRecord3.getTime() * ((long) 1000))));
        List<RecyclerBarEntry> listB = hz2.b(pz2.a(latestRecord));
        Intrinsics.checkNotNullExpressionValue(listB, "createHomeLevelEntries(...)");
        this.barChart.getAttribute().h = 0;
        this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.y2));
        this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.x2));
        this.barChart.setEntryData(listB);
    }

    private final void showCurseRecord(km5 dataModel, DailyFemaleHealthReport report) {
        boolean isFemale = report.getIsFemale();
        String string = ApplicationExtKt.getApplication().getString(c0j.f5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (report.getMenstrualStartTime() <= 0) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        this.txtDataTitle.setText(isFemale ? c0j.h7 : c0j.b6);
        List<CurseEntry> listCreateDayEntriesHome = CurseDataUtil.INSTANCE.createDayEntriesHome(report);
        long j = 1000;
        String desc$default = CurseManager.getDesc$default(CurseManager.INSTANCE.getInstance(), report.getTodayTime() * j, 0, 0, 6, null);
        Logger.d(TAG, "bind: " + desc$default);
        if (Intrinsics.areEqual(desc$default, ResourceExtKt.getString(c0j.O5))) {
            this.txtDataTitle.setText(ResourceExtKt.getString(c0j.h7));
            this.txtSportContent.setText(ResourceExtKt.getString(c0j.common_today_data_empty));
        } else {
            this.txtDataTitle.setText((CharSequence) StringsKt__StringsKt.split$default((CharSequence) desc$default, new String[]{string}, false, 0, 6, (Object) null).get(0));
            this.txtSportContent.setText(TimeDateUtil.getDateStr(report.getTodayTime(), ResourceExtKt.getString(c0j.i)));
        }
        this.barChart.setEntryData(listCreateDayEntriesHome);
        this.xAxisView.setTxtXAxis1(DateUtils.formatDateTime(ApplicationExtKt.getApplication(), report.getMenstrualStartTime() * j, 131096));
        this.xAxisView.setTxtXAxis3(DateUtils.formatDateTime(ApplicationExtKt.getApplication(), report.getMenstrualEndTime() * j, 131096));
        this.barChart.getAttribute().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(report.getTime()));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append((String) StringsKt__StringsKt.split$default((CharSequence) desc$default, new String[]{string}, false, 0, 6, (Object) null).get(0));
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
    }

    private final void showEmpty(km5 dataModel) {
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(false);
        }
        this.barChart.getAttribute().h = 1;
        String strB = l2c.b(dataModel.f23979b);
        this.txtDataTitle.setText(strB);
        if (dataModel.f23979b == 16) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_pressure")) {
                this.txtSportContent.setText(ResourceExtKt.getString(c0j.T1));
            } else {
                this.txtSportContent.setText(ResourceExtKt.getString(c0j.L1));
            }
        } else {
            this.txtSportContent.setText(ResourceExtKt.getString(c0j.kq));
        }
        bindEmptyEntries(this.barChart, dataModel);
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Iq, strB));
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
    }

    private final void showPaiRecord(Context context, km5 dataModel, DailyPaiReport record) {
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dataModel.f23978a);
        List<PaiEntry> listCreatePaiOf7Days = PaiDataUtil.INSTANCE.createPaiOf7Days(record, localDateTimestampToLocalDate);
        if (HealthUtil.getTheMaxNumber(listCreatePaiOf7Days) <= 0.05f) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
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
        this.txtDataTitle.setText(context.getString(c0j.U6, String.valueOf(y)));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(recyclerBarEntry.timestamp));
        XAxisView xAxisView = this.xAxisView;
        LocalDate localDateMinusDays = localDateTimestampToLocalDate.minusDays(6);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        xAxisView.setTxtXAxis1(TimeDateUtil.getDateMMddNumberFormat(localDateMinusDays));
        this.xAxisView.setTxtXAxis3(TimeDateUtil.getDateMMddNumberFormat(localDateTimestampToLocalDate));
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(recyclerBarEntry.timestamp));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(context.getString(c0j.Kq, String.valueOf(y)));
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
    }

    private final void showPhysicalStatusRecord(Context context, km5 dataModel, DailyPhysicalStatusReport healthReport) {
        int i = 0;
        if (healthReport.getLatestPhysicalStatusItem() != null) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
            Logger.i(TAG, "home card physical status report is :" + healthReport);
            PhysicalStatusItem latestPhysicalStatusItem = healthReport.getLatestPhysicalStatusItem();
            Intrinsics.checkNotNull(latestPhysicalStatusItem);
            if (!TimeDateUtil.isToday(latestPhysicalStatusItem.getTime())) {
                showEmpty(dataModel);
            }
            PhysicalStatusItem latestPhysicalStatusItem2 = healthReport.getLatestPhysicalStatusItem();
            Intrinsics.checkNotNull(latestPhysicalStatusItem2);
            int physicalStatusLevel = latestPhysicalStatusItem2.getPhysicalStatusLevel();
            this.barChart.getAttribute().h = 0;
            String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            TextView textView = this.txtDataTitle;
            PhysicalStatusDataUtil physicalStatusDataUtil = PhysicalStatusDataUtil.INSTANCE;
            textView.setText(physicalStatusDataUtil.getPhysicalStatusTitle(context, physicalStatusLevel));
            this.txtSportContent.setText(dateMMddFormat);
            this.barChart.setEntryData(physicalStatusDataUtil.createHomeEntries(physicalStatusLevel));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.jb));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.ib));
            this.talkback = new StringBuffer();
            String dateMMddFormat2 = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            StringBuffer stringBuffer = this.talkback;
            Intrinsics.checkNotNull(stringBuffer);
            stringBuffer.append(dateMMddFormat2);
            stringBuffer.append(", ");
            StringBuffer stringBuffer2 = this.talkback;
            Intrinsics.checkNotNull(stringBuffer2);
            stringBuffer2.append(physicalStatusDataUtil.getPhysicalStatusTitle(context, physicalStatusLevel));
            ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
            i = 1;
        } else {
            showEmpty(dataModel);
        }
        ((nf2) this).itemView.setTag(HealthTabOneTrackExtKt.buildOneTrackRunningIndexExposeTrackBean(HomeDataType.PHYSICAL_STATUS, getBindingAdapterPosition(), i));
    }

    private final void showRecord(Context context, km5 dataModel, DailyBasicReport report) {
        if (report instanceof DailyPaiReport) {
            showPaiRecord(context, dataModel, (DailyPaiReport) report);
            return;
        }
        if (report instanceof DailyVo2MaxReport) {
            showVO2MaxRecord(dataModel, (DailyVo2MaxReport) report);
            return;
        }
        if (report instanceof DailyFemaleHealthReport) {
            showCurseRecord(dataModel, (DailyFemaleHealthReport) report);
            return;
        }
        if (report instanceof DailyTrainingLoadReport) {
            showTrainingLoadRecord(context, dataModel, (DailyTrainingLoadReport) report);
            return;
        }
        if (report instanceof AllDaySleepReport) {
            showSleepRecord(context, dataModel, (AllDaySleepReport) report);
            return;
        }
        if (report instanceof DailyRunningIndicatorReport) {
            showRunningIndicatorRecord(dataModel, (DailyRunningIndicatorReport) report);
            return;
        }
        if (report instanceof DailyVitalityReport) {
            showVitalityRecord(context, dataModel, (DailyVitalityReport) report);
        } else if (report instanceof DailyBloodPressureReport) {
            showBloodPressureRecord(dataModel, (DailyBloodPressureReport) report);
        } else if (report instanceof DailyPhysicalStatusReport) {
            showPhysicalStatusRecord(context, dataModel, (DailyPhysicalStatusReport) report);
        }
    }

    private final void showRunningIndicatorRecord(km5 dataModel, DailyRunningIndicatorReport report) {
        Integer runningIndicatorLevel;
        int i = 0;
        if (report.getLatestItem() != null) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
            Logger.i(TAG, "home card running indicator report=" + report);
            RunningIndicatorItem latestItem = report.getLatestItem();
            int iIntValue = (latestItem == null || (runningIndicatorLevel = latestItem.getRunningIndicatorLevel()) == null) ? 0 : runningIndicatorLevel.intValue();
            this.barChart.getAttribute().h = 0;
            String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            String string = ResourceExtKt.getString(c0j.o7);
            RunningIndicatorItem latestItem2 = report.getLatestItem();
            Object objValueOf = latestItem2 != null ? Float.valueOf(latestItem2.getRunningIndicator()) : 0;
            String str = string + " " + (Intrinsics.areEqual(objValueOf, (Object) 0) ? "" : String.valueOf(objValueOf));
            this.txtDataTitle.setText(str);
            this.txtSportContent.setText(dateMMddFormat);
            this.barChart.setEntryData(RunningIndicatorUtil.INSTANCE.createHomeEntries(iIntValue));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.zc));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.xc));
            StringBuffer stringBuffer = new StringBuffer();
            this.talkback = stringBuffer;
            Intrinsics.checkNotNull(stringBuffer);
            stringBuffer.append(dateMMddFormat);
            stringBuffer.append(", ");
            StringBuffer stringBuffer2 = this.talkback;
            Intrinsics.checkNotNull(stringBuffer2);
            stringBuffer2.append(str);
            ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
            i = 1;
        } else {
            showEmpty(dataModel);
        }
        ((nf2) this).itemView.setTag(HealthTabOneTrackExtKt.buildOneTrackRunningIndexExposeTrackBean(HomeDataType.RUNNING_INDICATOR, getBindingAdapterPosition(), i));
    }

    private final void showSleepRecord(Context context, km5 dataModel, AllDaySleepReport sleepReport) {
        int i;
        int score = sleepReport.getScore();
        if (score <= 0) {
            i = 0;
        } else if (score < 60) {
            i = 1;
        } else if (score < 80) {
            i = 2;
        } else {
            i = score < 90 ? 3 : 4;
        }
        if (i <= 0) {
            showEmpty(dataModel);
            return;
        }
        this.barChart.getAttribute().h = 0;
        String string = ResourceExtKt.getString(c0j.zk, TimeDateUtil.getZNTimeWithMin(sleepReport.getTotalDuration()));
        this.txtDataTitle.setText(string);
        String sleepShortEvaluation = SleepExtKt.getSleepShortEvaluation(context, score);
        this.txtSportContent.setText(TextUtils.isEmpty(sleepShortEvaluation) ? TimeDateUtil.getDateMMddFormat(sleepReport.getTime()) : ResourceExtKt.getString(c0j.we, TimeDateUtil.getDateMMddFormat(sleepReport.getTime()), sleepShortEvaluation));
        this.barChart.setSleepEntryData(gjm.c(i, dataModel.f23978a));
        this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.Wh));
        this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.Th));
        this.talkback = new StringBuffer();
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(sleepReport.getTime());
        StringBuffer stringBuffer = this.talkback;
        Intrinsics.checkNotNull(stringBuffer);
        stringBuffer.append(dateMMddFormat);
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        Intrinsics.checkNotNull(stringBuffer2);
        stringBuffer2.append(string);
        stringBuffer2.append(", ");
        StringBuffer stringBuffer3 = this.talkback;
        Intrinsics.checkNotNull(stringBuffer3);
        stringBuffer3.append(ResourceExtKt.getString(c0j.Oq, sleepShortEvaluation));
        TalkbackLogger.INSTANCE.d(TAG, "sleep card talkback=" + ((Object) this.talkback), new Object[0]);
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showTrainingLoadRecord(Context context, km5 dataModel, DailyTrainingLoadReport healthReport) {
        int i = 0;
        if (healthReport.getWtlSum() > 0) {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
            Logger.i(TAG, "home card train load report is :" + healthReport);
            int trainingLoadLevel = healthReport.getTrainingLoadLevel();
            this.barChart.getAttribute().h = 0;
            String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            TextView textView = this.txtDataTitle;
            TrainingLoadDataUtil trainingLoadDataUtil = TrainingLoadDataUtil.INSTANCE;
            textView.setText(trainingLoadDataUtil.getTrainingLoadTitle(context, trainingLoadLevel));
            this.txtSportContent.setText(dateMMddFormat);
            this.barChart.setEntryData(trainingLoadDataUtil.createHomeEntries(trainingLoadLevel));
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.l8));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.n8));
            this.talkback = new StringBuffer();
            String dateMMddFormat2 = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            StringBuffer stringBuffer = this.talkback;
            Intrinsics.checkNotNull(stringBuffer);
            stringBuffer.append(dateMMddFormat2);
            stringBuffer.append(", ");
            StringBuffer stringBuffer2 = this.talkback;
            Intrinsics.checkNotNull(stringBuffer2);
            stringBuffer2.append(trainingLoadDataUtil.getTrainingLoadTitle(context, trainingLoadLevel));
            ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
            i = 1;
        } else {
            showEmpty(dataModel);
        }
        ((nf2) this).itemView.setTag(HealthTabOneTrackExtKt.buildOneTrackRunningIndexExposeTrackBean(HomeDataType.TRAINING_LOAD, getBindingAdapterPosition(), i));
    }

    private final void showVO2MaxRecord(km5 dataModel, DailyVo2MaxReport vo2MaxReport) {
        int level;
        int vo2Max;
        int i = 0;
        if (vo2MaxReport.getLatestItem() != null) {
            Vo2MaxItem latestItem = vo2MaxReport.getLatestItem();
            Intrinsics.checkNotNull(latestItem);
            vo2Max = latestItem.getVo2Max();
            Vo2MaxItem latestItem2 = vo2MaxReport.getLatestItem();
            Intrinsics.checkNotNull(latestItem2);
            level = VO2MaxDataUtil.getLevel(latestItem2);
        } else {
            level = 0;
            vo2Max = 0;
        }
        if (level == 0) {
            showEmpty(dataModel);
        } else {
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(true);
            }
            this.barChart.getAttribute().h = 0;
            String str = vo2Max + " " + VO2MaxDataUtil.getLevelString(level);
            String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
            this.txtDataTitle.setText(l2c.b(dataModel.f23979b));
            this.txtSportContent.setText(dateMMddFormat + " " + str);
            this.barChart.setEntryData(VO2MaxDataUtil.createDayEntriesHome(TimeDateUtil.timestampToLocalDate(dataModel.f23978a), level));
            VO2MaxDataUtil.getMaxMinModel();
            this.xAxisView.setTxtXAxis1(ResourceExtKt.getString(c0j.Lo));
            this.xAxisView.setTxtXAxis3(ResourceExtKt.getString(c0j.Jo));
            String string = ResourceExtKt.getString(c0j.Hq, str);
            StringBuffer stringBuffer = new StringBuffer();
            this.talkback = stringBuffer;
            Intrinsics.checkNotNull(stringBuffer);
            stringBuffer.append(dateMMddFormat);
            StringBuffer stringBuffer2 = this.talkback;
            Intrinsics.checkNotNull(stringBuffer2);
            stringBuffer2.append(string);
            ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
            TalkbackLogger.INSTANCE.d(TAG, "vo2 max talkback=" + ((Object) this.talkback), new Object[0]);
            i = 1;
        }
        ((nf2) this).itemView.setTag(HealthTabOneTrackExtKt.buildOneTrackRunningIndexExposeTrackBean(HomeDataType.V02_MAX, getBindingAdapterPosition(), i));
    }

    private final void showVitalityRecord(Context context, km5 dataModel, DailyVitalityReport record) {
        if (record.getLatestVitality() != null) {
            VitalityItem latestVitality = record.getLatestVitality();
            Intrinsics.checkNotNull(latestVitality);
            if (latestVitality.getTotal7daysVitality() > 0) {
                OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
                if (onLoadDataListener != null) {
                    onLoadDataListener.onLoadData(true);
                }
                Logger.i(TAG, "home card vitality report is :" + record);
                int i = c0j.zo;
                VitalityItem latestVitality2 = record.getLatestVitality();
                Intrinsics.checkNotNull(latestVitality2);
                String string = ResourceExtKt.getString(i, Integer.valueOf(latestVitality2.getTotal7daysVitality()));
                String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dataModel.f23978a);
                this.txtDataTitle.setText(string);
                this.txtSportContent.setText(ResourceExtKt.getString(c0j.vo, dateMMddFormat));
                this.barChart.getAttribute().h = 0;
                VitalityUtil vitalityUtil = VitalityUtil.INSTANCE;
                VitalityItem latestVitality3 = record.getLatestVitality();
                Intrinsics.checkNotNull(latestVitality3);
                this.barChart.setEntryData(vitalityUtil.createHomeEntries(latestVitality3.getTotal7daysVitality()));
                this.xAxisView.setTxtXAxis1("0");
                this.xAxisView.setTxtXAxis3("100");
                StringBuffer stringBuffer = new StringBuffer();
                this.talkback = stringBuffer;
                Intrinsics.checkNotNull(stringBuffer);
                stringBuffer.append(dateMMddFormat);
                stringBuffer.append(", ");
                StringBuffer stringBuffer2 = this.talkback;
                Intrinsics.checkNotNull(stringBuffer2);
                stringBuffer2.append(string);
                stringBuffer2.append(", ");
                StringBuffer stringBuffer3 = this.talkback;
                Intrinsics.checkNotNull(stringBuffer3);
                stringBuffer3.append(ResourceExtKt.getString(c0j.vo, dateMMddFormat));
                TalkbackLogger.INSTANCE.d(TAG, "sleep card talkback=" + ((Object) this.talkback), new Object[0]);
                ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
                return;
            }
        }
        showEmpty(dataModel);
    }

    public final void bindData(@NotNull Context context, @NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(context, dataModel);
        this.typeImg.setImageResource(HealthUtil.getSportTypeImageHomePage(dataModel.f23979b));
        DailyBasicReport dailyBasicReport = dataModel.h;
        Logger.i("dataModel.mHealthReport" + dailyBasicReport, new Object[0]);
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
        } else {
            showRecord(context, dataModel, dailyBasicReport);
        }
        TalkbackLogger.INSTANCE.d("Pai", "pai talkback=" + ((Object) this.talkback), new Object[0]);
    }
}
