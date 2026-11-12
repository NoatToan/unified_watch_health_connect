package com.xiaomi.fitness.homepage.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.DailyFemaleHealthReport;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.util.SleepHomeDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.km5;
import defpackage.l2c;
import defpackage.qxi;
import defpackage.xr5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bS\u0010>J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\"\u0010P\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010L¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/RelativeItemContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "isValidReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Z", "Landroid/content/Context;", "context", "Lkm5;", "dataModel", "", "showRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "showEmpty", "(Lkm5;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "record", "showCalorieRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "showStepRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "showHrmRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "showBloodPressureRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "showMHRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "showStandRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "showSpo2Record", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)V", "Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "showCurseRecord", "(Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "sleepReport", "showSleepRecord", "(Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "showWeightRecord", "(Landroid/content/Context;Lkm5;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;)V", "bindData", "(Landroid/content/Context;Lkm5;)V", "isExceptionTvVisible", "()Z", "", "visibility", "setExceptionTvVisibility", "(I)V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "setItemView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "imgType", "Landroid/widget/ImageView;", "getImgType", "()Landroid/widget/ImageView;", "setImgType", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "txtDataTitle", "Landroid/widget/TextView;", "getTxtDataTitle", "()Landroid/widget/TextView;", "setTxtDataTitle", "(Landroid/widget/TextView;)V", "txtSportContent", "getTxtSportContent", "setTxtSportContent", "dataExceptionTv", "getDataExceptionTv", "setDataExceptionTv", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeItemContentViewHolder extends RecyclerView.d0 {

    @NotNull
    private static final String TAG = "RelativeItemContentViewHolder";

    @NotNull
    private TextView dataExceptionTv;

    @NotNull
    private ImageView imgType;

    @NotNull
    private View itemView;

    @NotNull
    private TextView txtDataTitle;

    @NotNull
    private TextView txtSportContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeItemContentViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
        this.imgType = (ImageView) itemView.findViewById(eri.O7);
        this.txtDataTitle = (TextView) this.itemView.findViewById(eri.ao);
        this.txtSportContent = (TextView) this.itemView.findViewById(eri.Cn);
        this.dataExceptionTv = (TextView) this.itemView.findViewById(eri.M2);
    }

    private final boolean isValidReport(DailyBasicReport report) {
        return (report instanceof DailyCalorieReport) || (report instanceof DailyStepReport) || (report instanceof DailyHrReport) || (report instanceof DailyBloodPressureReport) || (report instanceof DailyMHStrengthReport) || (report instanceof DailyStandReport) || (report instanceof DailySpo2Report) || (report instanceof DailyFemaleHealthReport) || (report instanceof AllDaySleepReport) || (report instanceof DailyWeightReport);
    }

    private final void showBloodPressureRecord(km5 dataModel, DailyBloodPressureReport record) {
        String strB;
        if (record.getLatestRecord() == null) {
            showEmpty(dataModel);
            return;
        }
        dataModel.f23978a = record.getTime();
        TextView textView = this.txtDataTitle;
        if (record.getLatestRecord() != null) {
            BloodPressureItem latestRecord = record.getLatestRecord();
            strB = latestRecord != null ? AppUtil.getApp().getString(c0j.u1, String.valueOf(latestRecord.getHighPressure()), String.valueOf(latestRecord.getLowPressure())) : null;
        } else {
            strB = l2c.b(dataModel.f23979b);
        }
        textView.setText(strB);
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
    }

    private final void showCalorieRecord(Context context, km5 dataModel, DailyCalorieReport record) {
        if (record.getCalories() <= 0) {
            showEmpty(dataModel);
            return;
        }
        long time = record.getTime();
        int calories = record.getCalories();
        this.txtDataTitle.setText(context.getResources().getQuantityString(qxi.s, calories, Integer.valueOf(calories)));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(time));
    }

    private final void showCurseRecord(DailyFemaleHealthReport report) {
        boolean isFemale = report.getIsFemale();
        String string = ApplicationExtKt.getApplication().getString(c0j.f5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (report.getMenstrualStartTime() <= 0) {
            return;
        }
        this.txtDataTitle.setText(isFemale ? c0j.h7 : c0j.b6);
        String desc$default = CurseManager.getDesc$default(CurseManager.INSTANCE.getInstance(), TimeDateUtil.changZeroOfTheDay(report.getTodayTime()) * ((long) 1000), 0, 0, 6, null);
        Logger.d(TAG, "bind: " + desc$default);
        this.txtDataTitle.setText((CharSequence) StringsKt__StringsKt.split$default((CharSequence) desc$default, new String[]{string}, false, 0, 6, (Object) null).get(0));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(report.getTodayTime()));
    }

    private final void showEmpty(km5 dataModel) {
        this.txtDataTitle.setText(l2c.b(dataModel.f23979b));
        this.txtSportContent.setText(c0j.kq);
    }

    private final void showHrmRecord(Context context, km5 dataModel, DailyHrReport record) {
        Logger.d(TAG, " relative DailyHrReport: " + record);
        HrItem latestHrRecord = record.getLatestHrRecord();
        if (latestHrRecord != null) {
            int hr = latestHrRecord.getHr();
            String quantityString = context.getResources().getQuantityString(qxi.common_unit_heart_rate_desc, hr, Integer.valueOf(hr));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.txtDataTitle.setText(ResourceExtKt.getString(c0j.R6, quantityString));
            this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
            dataModel.f23978a = record.getTime();
        }
        if (record.getLatestHrRecord() == null) {
            showEmpty(dataModel);
        }
        if (record.getHasNewAbnormalRecord()) {
            this.dataExceptionTv.setVisibility(0);
            Long latestAbnormalRecordTime = record.getLatestAbnormalRecordTime();
            dataModel.f23978a = latestAbnormalRecordTime != null ? latestAbnormalRecordTime.longValue() : record.getTime();
        }
    }

    private final void showMHRecord(Context context, km5 dataModel, DailyMHStrengthReport record) {
        if (record.getDuration() <= 0) {
            showEmpty(dataModel);
            return;
        }
        TextView textView = this.txtDataTitle;
        Resources resources = context.getResources();
        textView.setText(resources != null ? resources.getQuantityString(qxi.a0, record.getDuration(), Integer.valueOf(record.getDuration())) : null);
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
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
        if (report instanceof DailyMHStrengthReport) {
            showMHRecord(context, dataModel, (DailyMHStrengthReport) report);
            return;
        }
        if (report instanceof DailyStandReport) {
            showStandRecord(context, dataModel, (DailyStandReport) report);
            return;
        }
        if (report instanceof DailySpo2Report) {
            showSpo2Record(context, dataModel, (DailySpo2Report) report);
            return;
        }
        if (report instanceof DailyFemaleHealthReport) {
            showCurseRecord((DailyFemaleHealthReport) report);
        } else if (report instanceof AllDaySleepReport) {
            showSleepRecord(dataModel, (AllDaySleepReport) report);
        } else if (report instanceof DailyWeightReport) {
            showWeightRecord(context, dataModel, (DailyWeightReport) report);
        }
    }

    private final void showSleepRecord(km5 dataModel, AllDaySleepReport sleepReport) {
        int i;
        Logger.d(TAG, " relative AllDaySleepReport: " + sleepReport);
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
        this.txtDataTitle.setText(ResourceExtKt.getString(c0j.zk, TimeDateUtil.getZNTimeWithMin(sleepReport.getTotalDuration())));
        String sleepQuality = SleepHomeDataUtil.INSTANCE.getSleepQuality(i);
        this.txtSportContent.setText(TextUtils.isEmpty(sleepQuality) ? TimeDateUtil.getDateMMddFormat(sleepReport.getTime()) : ResourceExtKt.getString(c0j.we, TimeDateUtil.getDateMMddFormat(sleepReport.getTime()), sleepQuality));
    }

    private final void showSpo2Record(Context context, km5 dataModel, DailySpo2Report record) {
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
        Spo2Item latestSpoRecord = record.getLatestSpoRecord();
        if (latestSpoRecord != null) {
            String quantityString = context.getResources().getQuantityString(qxi.X0, latestSpoRecord.getSpo2(), Integer.valueOf(latestSpoRecord.getSpo2()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.txtDataTitle.setText(quantityString);
        }
        if (record.getLatestSpoRecord() == null) {
            showEmpty(dataModel);
        }
        if (record.getHasNewAbnormalRecord()) {
            this.dataExceptionTv.setVisibility(0);
            Long latestAbnormalRecordTime = record.getLatestAbnormalRecordTime();
            dataModel.f23978a = latestAbnormalRecordTime != null ? latestAbnormalRecordTime.longValue() : record.getTime();
        }
    }

    private final void showStandRecord(Context context, km5 dataModel, DailyStandReport record) {
        if (record.getStandCount() <= 0) {
            showEmpty(dataModel);
            return;
        }
        String quantityString = context.getResources().getQuantityString(qxi.common_unit_time_desc, record.getStandCount(), Integer.valueOf(record.getStandCount()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.txtDataTitle.setText(ResourceExtKt.getString(c0j.Y6, quantityString));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
    }

    private final void showStepRecord(Context context, km5 dataModel, DailyStepReport record) {
        if (record.getSteps() <= 0) {
            showEmpty(dataModel);
            return;
        }
        int steps = record.getSteps();
        long time = record.getTime();
        String quantityString = context.getResources().getQuantityString(qxi.w, steps, Integer.valueOf(steps));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.txtDataTitle.setText(quantityString);
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(time));
    }

    private final void showWeightRecord(Context context, km5 dataModel, DailyWeightReport record) {
        Logger.d(TAG, " relative DailyWeightReport: " + record);
        List<WeightItem> weightRecordList = record.getWeightRecordList();
        if (weightRecordList == null || weightRecordList.isEmpty()) {
            showEmpty(dataModel);
            return;
        }
        List<WeightItem> weightRecordList2 = record.getWeightRecordList();
        Intrinsics.checkNotNull(weightRecordList2);
        float weight = weightRecordList2.get(0).getWeight();
        this.txtDataTitle.setText(context.getResources().getQuantityString(qxi.J1, xr5.j(weight), WeightEvaluationHelper.INSTANCE.formatFloatValue(2, weight)));
        this.txtSportContent.setText(TimeDateUtil.getDateMMddFormat(record.getTime()));
    }

    public final void bindData(@NotNull Context context, @NotNull km5 dataModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.imgType.setImageResource(l2c.a(dataModel.f23979b));
        DailyBasicReport dailyBasicReport = dataModel.h;
        if (dailyBasicReport == null || !isValidReport(dailyBasicReport)) {
            showEmpty(dataModel);
        } else {
            showRecord(context, dataModel, dailyBasicReport);
        }
    }

    @NotNull
    public final TextView getDataExceptionTv() {
        return this.dataExceptionTv;
    }

    @NotNull
    public final ImageView getImgType() {
        return this.imgType;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final TextView getTxtDataTitle() {
        return this.txtDataTitle;
    }

    @NotNull
    public final TextView getTxtSportContent() {
        return this.txtSportContent;
    }

    public final boolean isExceptionTvVisible() {
        return this.dataExceptionTv.getVisibility() == 0;
    }

    public final void setDataExceptionTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dataExceptionTv = textView;
    }

    public final void setExceptionTvVisibility(int visibility) {
        this.dataExceptionTv.setVisibility(visibility);
    }

    public final void setImgType(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgType = imageView;
    }

    public final void setItemView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.itemView = view;
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
