package com.xiaomi.fitness.homepage.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.chart.entrys.BloodPressureEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.spo2.Spo2Utils;
import com.xiaomi.fitness.util.CalorieDataUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.util.MHIntensityDataUtil;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.util.StandDataUtil;
import com.xiaomi.fitness.util.StepDataUtil;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import defpackage.c0j;
import defpackage.f4c;
import defpackage.hz2;
import defpackage.iji;
import defpackage.k7e;
import defpackage.km5;
import defpackage.l2c;
import defpackage.nf2;
import defpackage.qxi;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\bR\"\u00107\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/BarChartContentViewHolder;", "Lnf2;", "Landroid/content/Context;", "context", "Lkm5;", "dataModel", "", "setBarchartAttr", "(Landroid/content/Context;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "showRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "showEmpty", "(Lkm5;)V", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChart", "bindEmptyEntries", "(Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "record", "showCalorieRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "showStepRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "showHrmRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "showBloodPressureRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "showHearRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "showMHRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "showStandRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "showSpo2Record", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "showTempRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;)V", "initView", "()V", "bindData", "Landroid/widget/ImageView;", "imgType", "Landroid/widget/ImageView;", "getImgType", "()Landroid/widget/ImageView;", "setImgType", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "txtDataTitle", "Landroid/widget/TextView;", "getTxtDataTitle", "()Landroid/widget/TextView;", "setTxtDataTitle", "(Landroid/widget/TextView;)V", "txtSportContent", "getTxtSportContent", "setTxtSportContent", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Lcom/xiaomi/fitness/chart/mpchart/barchart/CustomBarChart;", "", "displayNumber_24", "I", "Lk7e;", "mBinding", "Lk7e;", "Ljava/lang/StringBuffer;", "talkback", "Ljava/lang/StringBuffer;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BarChartContentViewHolder extends nf2 {
    private CustomBarChart<RecyclerBarEntry> barChart;
    private int displayNumber_24;
    public ImageView imgType;

    @NotNull
    private k7e mBinding;

    @Nullable
    private StringBuffer talkback;
    public TextView txtDataTitle;
    public TextView txtSportContent;
    private XAxisView xAxisView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarChartContentViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.mBinding = k7e.A0(itemView);
        initView();
    }

    private final void bindEmptyEntries(CustomBarChart<RecyclerBarEntry> barChart, km5 dataModel) {
        int i = dataModel.f23979b;
        if (i == 2) {
            barChart.setEntryData(CalorieDataUtil.INSTANCE.createDayEntriesHome(new DailyCalorieReport("days", dataModel.f23978a), this.displayNumber_24));
            return;
        }
        if (i == 3) {
            barChart.setEntryData(StepDataUtil.createDayEntriesHome(new DailyStepReport(dataModel.f23978a, "days"), this.displayNumber_24));
            return;
        }
        if (i == 15) {
            barChart.setEntryData(MHIntensityDataUtil.INSTANCE.createDayEntriesHome(new DailyMHStrengthReport(dataModel.f23978a, "days"), this.displayNumber_24));
            return;
        }
        if (i == 17) {
            barChart.setEntryData(f4c.a(new DailyHearingReport(dataModel.f23978a, "days"), this.displayNumber_24));
            return;
        }
        if (i == 4) {
            barChart.e(HrmDataUtil.fillHomeSegmentBarEntry(new DailyHrReport(dataModel.f23978a, "days"), 24), 200.0f, 0.0f);
            return;
        }
        if (i == 16) {
            List<BloodPressureEntry> listD = hz2.d(24, new DailyBloodPressureReport(dataModel.f23978a, "days"));
            Intrinsics.checkNotNullExpressionValue(listD, "fillHomeSegmentBarEntry(...)");
            barChart.e(listD, 200.0f, 0.0f);
        } else if (i == 5) {
            barChart.setEntryData(StandDataUtil.INSTANCE.createDayHomeEntries(new DailyStandReport("days", dataModel.f23978a), this.displayNumber_24));
        } else if (i == 13) {
            barChart.e(SpO2DataUtil.INSTANCE.createDayEntriesHome(new DailySpo2Report(dataModel.f23978a, "days"), this.displayNumber_24), 200.0f, 0.0f);
        } else if (i == 21) {
            barChart.setEntryData(TemperatureDataUtil.INSTANCE.fillHomeSegmentBarEntries(new DailyTempReport(dataModel.f23978a, "days")));
        }
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return (report instanceof DailyCalorieReport) || (report instanceof DailyStepReport) || (report instanceof DailyHrReport) || (report instanceof DailyHearingReport) || (report instanceof DailyMHStrengthReport) || (report instanceof DailyStressReport) || (report instanceof DailyStandReport) || (report instanceof DailySpo2Report) || (report instanceof DailyTempReport);
    }

    private final void setBarchartAttr(Context context, km5 dataModel) {
        int i = dataModel.f23979b;
        CustomBarChart<RecyclerBarEntry> customBarChart = null;
        if (i == 2) {
            CustomBarChart<RecyclerBarEntry> customBarChart2 = this.barChart;
            if (customBarChart2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart2;
            }
            customBarChart.c(context, iji.T, iji.common_transparent);
            return;
        }
        if (i == 3) {
            CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
            if (customBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart3;
            }
            customBarChart.c(context, iji.j2, iji.common_transparent);
            return;
        }
        if (i == 15) {
            CustomBarChart<RecyclerBarEntry> customBarChart4 = this.barChart;
            if (customBarChart4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart4;
            }
            customBarChart.c(context, iji.B0, iji.common_transparent);
            return;
        }
        if (i == 4) {
            CustomBarChart<RecyclerBarEntry> customBarChart5 = this.barChart;
            if (customBarChart5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
                customBarChart5 = null;
            }
            customBarChart5.c(context, iji.A0, iji.Q2);
            CustomBarChart<RecyclerBarEntry> customBarChart6 = this.barChart;
            if (customBarChart6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart6;
            }
            customBarChart.setBarChartType(6);
            return;
        }
        if (i == 16) {
            CustomBarChart<RecyclerBarEntry> customBarChart7 = this.barChart;
            if (customBarChart7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
                customBarChart7 = null;
            }
            customBarChart7.c(context, iji.d, iji.e);
            CustomBarChart<RecyclerBarEntry> customBarChart8 = this.barChart;
            if (customBarChart8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart8;
            }
            customBarChart.setBarChartType(6);
            return;
        }
        if (i == 17) {
            CustomBarChart<RecyclerBarEntry> customBarChart9 = this.barChart;
            if (customBarChart9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart9;
            }
            customBarChart.c(context, iji.B0, iji.common_transparent);
            return;
        }
        if (i == 5) {
            CustomBarChart<RecyclerBarEntry> customBarChart10 = this.barChart;
            if (customBarChart10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart10;
            }
            customBarChart.c(context, iji.m3, iji.l3);
            return;
        }
        if (i == 13) {
            CustomBarChart<RecyclerBarEntry> customBarChart11 = this.barChart;
            if (customBarChart11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
                customBarChart11 = null;
            }
            customBarChart11.c(context, iji.k3, iji.Q2);
            CustomBarChart<RecyclerBarEntry> customBarChart12 = this.barChart;
            if (customBarChart12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart12;
            }
            customBarChart.setBarChartType(6);
            return;
        }
        if (i == 21) {
            CustomBarChart<RecyclerBarEntry> customBarChart13 = this.barChart;
            if (customBarChart13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
                customBarChart13 = null;
            }
            customBarChart13.c(context, iji.o2, iji.p2);
            CustomBarChart<RecyclerBarEntry> customBarChart14 = this.barChart;
            if (customBarChart14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChart");
            } else {
                customBarChart = customBarChart14;
            }
            customBarChart.setBarChartType(6);
        }
    }

    private final void showBloodPressureRecord(km5 dataModel, DailyBloodPressureReport record) {
        String string;
        List<BloodPressureEntry> listD = hz2.d(24, record);
        Intrinsics.checkNotNullExpressionValue(listD, "fillHomeSegmentBarEntry(...)");
        int validEntry = RecyclerBarEntry.INSTANCE.getValidEntry(listD);
        dataModel.f23978a = record.getTime();
        if (validEntry == 0) {
            showEmpty(dataModel);
            return;
        }
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listD);
        CustomBarChart<RecyclerBarEntry> customBarChart2 = this.barChart;
        if (customBarChart2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart2 = null;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
            stringBuffer.append(", ");
        }
        TextView txtDataTitle = getTxtDataTitle();
        if (record.getLatestRecord() != null) {
            BloodPressureItem latestRecord = record.getLatestRecord();
            string = latestRecord != null ? AppUtil.getApp().getString(c0j.u1, String.valueOf(latestRecord.getHighPressure()), String.valueOf(latestRecord.getLowPressure())) : null;
            StringBuffer stringBuffer2 = this.talkback;
            if (stringBuffer2 != null) {
                stringBuffer2.append(string);
            }
        } else {
            string = "";
        }
        txtDataTitle.setText(string);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showCalorieRecord(Context context, km5 dataModel, DailyCalorieReport record) {
        List<RecyclerBarEntry> listCreateDayEntriesHome = CalorieDataUtil.INSTANCE.createDayEntriesHome(record, this.displayNumber_24);
        if (RecyclerBarEntry.INSTANCE.getValidEntry(listCreateDayEntriesHome) <= 0) {
            showEmpty(dataModel);
            return;
        }
        long time = record.getTime();
        int calories = record.getCalories();
        getTxtDataTitle().setText(context.getResources().getQuantityString(qxi.s, calories, Integer.valueOf(calories)));
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(time));
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listCreateDayEntriesHome);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
        stringBuffer.append(", ");
        String quantityString = context.getResources().getQuantityString(qxi.s, calories, Integer.valueOf(calories));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ResourceExtKt.getString(c0j.Dq, quantityString);
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(string);
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showEmpty(km5 dataModel) {
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.getAttribute().h = 1;
        String strB = l2c.b(dataModel.f23979b);
        getTxtDataTitle().setText(strB);
        getTxtSportContent().setText(c0j.kq);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        bindEmptyEntries(customBarChart2, dataModel);
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(false);
        }
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(dataModel.f23978a));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Iq, strB));
        }
    }

    private final void showHearRecord(Context context, km5 dataModel, DailyHearingReport report) {
        List<RecyclerBarEntry> listA = f4c.a(report, this.displayNumber_24);
        RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
        Intrinsics.checkNotNull(listA);
        if (companion.getValidEntry(listA) <= 0) {
            showEmpty(dataModel);
            return;
        }
        String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(report.getTotalDuration() / 60);
        long time = report.getTime();
        getTxtDataTitle().setText(context.getString(c0j.O8, zNTimeWithMin));
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(time));
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listA);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(report.getTime()));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(context.getString(c0j.O8, zNTimeWithMin));
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showHrmRecord(Context context, km5 dataModel, DailyHrReport record) {
        int hr;
        this.talkback = new StringBuffer();
        if (record.getLatestHrRecord() != null) {
            HrItem latestHrRecord = record.getLatestHrRecord();
            Intrinsics.checkNotNull(latestHrRecord);
            hr = latestHrRecord.getHr();
        } else {
            hr = 0;
        }
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(record.getTime());
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(dateMMddFormat);
            stringBuffer.append(", ");
        }
        if (hr <= 0) {
            showEmpty(dataModel);
            return;
        }
        List<SegmentBarEntry> listFillHomeSegmentBarEntry = HrmDataUtil.fillHomeSegmentBarEntry(record, 24);
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listFillHomeSegmentBarEntry);
        String quantityString = context.getResources().getQuantityString(qxi.common_unit_heart_rate_desc, hr, Integer.valueOf(hr));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ResourceExtKt.getString(c0j.R6, quantityString);
        getTxtDataTitle().setText(string);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        dataModel.f23978a = record.getTime();
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Gq, string));
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showMHRecord(Context context, km5 dataModel, DailyMHStrengthReport record) {
        List<RecyclerBarEntry> listCreateDayEntriesHome = MHIntensityDataUtil.INSTANCE.createDayEntriesHome(record, this.displayNumber_24);
        if (RecyclerBarEntry.INSTANCE.getValidEntry(listCreateDayEntriesHome) <= 0) {
            showEmpty(dataModel);
            return;
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
        TextView txtDataTitle = getTxtDataTitle();
        Resources resources = context.getResources();
        txtDataTitle.setText(resources != null ? resources.getQuantityString(qxi.a0, record.getDuration(), Integer.valueOf(record.getDuration())) : null);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listCreateDayEntriesHome);
        CustomBarChart<RecyclerBarEntry> customBarChart2 = this.barChart;
        if (customBarChart2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart2 = null;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            Resources resources2 = context.getResources();
            stringBuffer2.append(resources2 != null ? resources2.getQuantityString(qxi.a0, record.getDuration(), Integer.valueOf(record.getDuration())) : null);
        }
    }

    private final void showRecord(Context context, km5 dataModel, DailyBasicReport report) {
        if (report instanceof DailyCalorieReport) {
            showCalorieRecord(context, dataModel, (DailyCalorieReport) report);
            return;
        }
        if (report instanceof DailyStepReport) {
            showStepRecord(context, dataModel, (DailyStepReport) report);
            return;
        }
        if (report instanceof DailyHrReport) {
            showHrmRecord(context, dataModel, (DailyHrReport) report);
            return;
        }
        if (report instanceof DailyBloodPressureReport) {
            showBloodPressureRecord(dataModel, (DailyBloodPressureReport) report);
            return;
        }
        if (report instanceof DailyHearingReport) {
            showHearRecord(context, dataModel, (DailyHearingReport) report);
            return;
        }
        if (report instanceof DailyMHStrengthReport) {
            showMHRecord(context, dataModel, (DailyMHStrengthReport) report);
            return;
        }
        if (report instanceof DailyStandReport) {
            showStandRecord(context, dataModel, (DailyStandReport) report);
        } else if (report instanceof DailySpo2Report) {
            showSpo2Record(context, dataModel, (DailySpo2Report) report);
        } else if (report instanceof DailyTempReport) {
            showTempRecord(context, dataModel, (DailyTempReport) report);
        }
    }

    private final void showSpo2Record(Context context, km5 dataModel, DailySpo2Report record) {
        List<SegmentBarEntry> listCreateDayEntriesHome = SpO2DataUtil.INSTANCE.createDayEntriesHome(record, this.displayNumber_24);
        if (RecyclerBarEntry.INSTANCE.getValidEntry(listCreateDayEntriesHome) == 0) {
            showEmpty(dataModel);
            return;
        }
        int theSpoMinNumber = Spo2Utils.INSTANCE.getTheSpoMinNumber(listCreateDayEntriesHome);
        float f = 85.0f;
        if (theSpoMinNumber >= 0 && theSpoMinNumber < 85.0f) {
            f = (theSpoMinNumber / 10) * 10;
        }
        Logger.i("HomeSpo2", "showSpo2Record xMin:" + f + ";yMax:100.0");
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.e(listCreateDayEntriesHome, 100.0f, f);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(record.getTime());
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(dateMMddFormat);
        stringBuffer.append(", ");
        Spo2Item latestSpoRecord = record.getLatestSpoRecord();
        if (latestSpoRecord != null) {
            String quantityString = context.getResources().getQuantityString(qxi.X0, latestSpoRecord.getSpo2(), Integer.valueOf(latestSpoRecord.getSpo2()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            getTxtDataTitle().setText(quantityString);
            StringBuffer stringBuffer2 = this.talkback;
            if (stringBuffer2 != null) {
                stringBuffer2.append(quantityString);
            }
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showStandRecord(Context context, km5 dataModel, DailyStandReport record) {
        StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
        List<RecyclerBarEntry> listCreateDayHomeEntries = standDataUtil.createDayHomeEntries(record, this.displayNumber_24);
        if (!standDataUtil.getValidEntry(listCreateDayHomeEntries)) {
            showEmpty(dataModel);
            return;
        }
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listCreateDayHomeEntries);
        String quantityString = context.getResources().getQuantityString(qxi.common_unit_time_desc, record.getStandCount(), Integer.valueOf(record.getStandCount()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        getTxtDataTitle().setText(ResourceExtKt.getString(c0j.Y6, quantityString));
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart3 = null;
        }
        customBarChart3.setEntryData(listCreateDayHomeEntries);
        CustomBarChart<RecyclerBarEntry> customBarChart4 = this.barChart;
        if (customBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart4;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = new StringBuffer();
        this.talkback = stringBuffer;
        stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
        stringBuffer.append(", ");
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(ResourceExtKt.getString(c0j.Y6, quantityString));
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showStepRecord(Context context, km5 dataModel, DailyStepReport record) {
        List<RecyclerBarEntry> listCreateDayEntriesHome = StepDataUtil.createDayEntriesHome(record, this.displayNumber_24);
        if (RecyclerBarEntry.INSTANCE.getValidEntry(listCreateDayEntriesHome) <= 0) {
            showEmpty(dataModel);
            return;
        }
        int steps = record.getSteps();
        long time = record.getTime();
        String quantityString = context.getResources().getQuantityString(qxi.w, steps, Integer.valueOf(steps));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        getTxtDataTitle().setText(quantityString);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(time));
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.setEntryData(listCreateDayEntriesHome);
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        StringBuffer stringBuffer = this.talkback;
        if (stringBuffer != null) {
            stringBuffer.append(TimeDateUtil.getDateMMddFormat(record.getTime()));
            stringBuffer.append(", ");
        }
        StringBuffer stringBuffer2 = this.talkback;
        if (stringBuffer2 != null) {
            stringBuffer2.append(quantityString);
        }
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    private final void showTempRecord(Context context, km5 dataModel, DailyTempReport report) {
        List<TemperatureItem> dailyAllTempDatas = report.getDailyAllTempDatas();
        String string = ExtUtilKt.getString(c0j.Ym);
        if (ArrayUtils.isEmpty(dailyAllTempDatas)) {
            showEmpty(dataModel);
            return;
        }
        Intrinsics.checkNotNull(dailyAllTempDatas);
        Float bodyTemp = dailyAllTempDatas.get(0).getBodyTemp();
        Float skinTemp = dailyAllTempDatas.get(0).getSkinTemp();
        if (skinTemp != null && skinTemp.floatValue() > 0.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            string = String.format("%s %s%s", Arrays.copyOf(new Object[]{ExtUtilKt.getString(c0j.nn), TemperatureDataUtil.INSTANCE.formatTemperature(skinTemp.floatValue()), ExtUtilKt.getString(c0j.hn)}, 3));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        }
        if (bodyTemp != null && bodyTemp.floatValue() > 0.0f) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            string = String.format("%s %s%s", Arrays.copyOf(new Object[]{ExtUtilKt.getString(c0j.dn), TemperatureDataUtil.INSTANCE.formatTemperature(bodyTemp.floatValue()), ExtUtilKt.getString(c0j.hn)}, 3));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        }
        getTxtDataTitle().setText(string);
        getTxtSportContent().setText(TimeDateUtil.getDateMMddFormat(report.getTime()));
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        List<TemperatureEntry> listFillHomeSegmentBarEntries = temperatureDataUtil.fillHomeSegmentBarEntries(report);
        Pair<Float, Float> axisMaxMin = temperatureDataUtil.getAxisMaxMin(report.getBodyTempRecords(), report.getSkinTempRecords(), listFillHomeSegmentBarEntries);
        Logger.i("Temperature", "home pair " + axisMaxMin);
        CustomBarChart<RecyclerBarEntry> customBarChart = this.barChart;
        CustomBarChart<RecyclerBarEntry> customBarChart2 = null;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        customBarChart.e(listFillHomeSegmentBarEntries, axisMaxMin.getFirst().floatValue(), axisMaxMin.getSecond().floatValue());
        CustomBarChart<RecyclerBarEntry> customBarChart3 = this.barChart;
        if (customBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
        } else {
            customBarChart2 = customBarChart3;
        }
        customBarChart2.getAttribute().h = 0;
        OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
        if (onLoadDataListener != null) {
            onLoadDataListener.onLoadData(true);
        }
    }

    public final void bindData(@NotNull Context context, @NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        setBarchartAttr(context, dataModel);
        getImgType().setImageResource(l2c.a(dataModel.f23979b));
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
        } else {
            showRecord(context, dataModel, dailyBasicReport);
        }
        ((nf2) this).itemView.setContentDescription(String.valueOf(this.talkback));
        TalkbackLogger.INSTANCE.d("calories", "calories talkback=" + ((Object) this.talkback), new Object[0]);
    }

    @NotNull
    public final ImageView getImgType() {
        ImageView imageView = this.imgType;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgType");
        return null;
    }

    @NotNull
    public final TextView getTxtDataTitle() {
        TextView textView = this.txtDataTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtDataTitle");
        return null;
    }

    @NotNull
    public final TextView getTxtSportContent() {
        TextView textView = this.txtSportContent;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtSportContent");
        return null;
    }

    public final void initView() {
        setImgType(this.mBinding.D);
        setTxtDataTitle(this.mBinding.F);
        setTxtSportContent(this.mBinding.E);
        k7e k7eVar = this.mBinding;
        CustomBarChart<RecyclerBarEntry> customBarChart = k7eVar.C;
        this.barChart = customBarChart;
        this.xAxisView = k7eVar.B;
        if (customBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChart");
            customBarChart = null;
        }
        setBaseCharView(customBarChart);
        this.displayNumber_24 = 24;
    }

    public final void setImgType(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgType = imageView;
    }

    public final void setTxtDataTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtDataTitle = textView;
    }

    public final void setTxtSportContent(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtSportContent = textView;
    }
}
