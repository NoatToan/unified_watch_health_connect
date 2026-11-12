package com.huami.bloodoxygen.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenStatistics;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.utils.ChartDataHelper;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodoxygen/ui/view/BloodOxygenStatisticsView;", "Landroid/widget/LinearLayout;", "", "text", "", "setMax", "setMin", "setAvg", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "setTimeMode", "Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenStatistics;", "statisticsInfo", "setStaticsInfo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenStatisticsView extends LinearLayout {

    @NotNull
    public static final String INVALID = "- -";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BloodOxygenStatisticsView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BloodOxygenStatisticsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void setAvg(String text) {
        ((TypefaceTextView) findViewById(R.id.avg_value)).setText(text);
    }

    private final void setMax(String text) {
        ((TypefaceTextView) findViewById(R.id.max_value)).setText(text);
    }

    private final void setMin(String text) {
        ((TypefaceTextView) findViewById(R.id.min_value)).setText(text);
    }

    public final void setStaticsInfo(@NotNull BloodOxygenStatistics statisticsInfo) {
        if (statisticsInfo.getAvgValue() <= 0.0d || statisticsInfo.getMaxValue() <= 0 || statisticsInfo.getMinValue() <= 0) {
            setMax(INVALID);
            setMin(INVALID);
            setAvg(INVALID);
        } else {
            ChartDataHelper chartDataHelper = ChartDataHelper.INSTANCE;
            setMax(chartDataHelper.toValuePerCent$ui_release(statisticsInfo.getMaxValue(), getContext()));
            setMin(chartDataHelper.toValuePerCent$ui_release(statisticsInfo.getMinValue(), getContext()));
            setAvg(chartDataHelper.toValuePerCent$ui_release(c.roundToInt(statisticsInfo.getAvgValue()), getContext()));
        }
    }

    public final void setTimeMode(@NotNull TimeMode timeMode) {
        int i;
        int i2;
        int i3;
        int i4;
        TextView textView = (TextView) findViewById(R.id.statistics_title);
        Context context = getContext();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i5 = iArr[timeMode.ordinal()];
        if (i5 == 1) {
            i = R.string.bo_ui_new_statistics_week_title;
        } else if (i5 != 2) {
            i = i5 != 3 ? R.string.bo_ui_new_statistics_day_title : R.string.bo_ui_new_statistics_year_title;
        } else {
            i = R.string.bo_ui_new_statistics_month_title;
        }
        textView.setText(context.getString(i));
        TextView textView2 = (TextView) findViewById(R.id.avg_title);
        Context context2 = getContext();
        int i6 = iArr[timeMode.ordinal()];
        if (i6 == 1) {
            i2 = R.string.bo_ui_new_statistics_avg_week;
        } else if (i6 != 2) {
            i2 = i6 != 3 ? R.string.bo_ui_new_statistics_avg_day : R.string.bo_ui_new_statistics_avg_year;
        } else {
            i2 = R.string.bo_ui_new_statistics_avg_month;
        }
        textView2.setText(context2.getString(i2));
        TextView textView3 = (TextView) findViewById(R.id.max_title);
        Context context3 = getContext();
        int i7 = iArr[timeMode.ordinal()];
        if (i7 == 1) {
            i3 = R.string.bo_ui_new_statistics_max_week;
        } else if (i7 != 2) {
            i3 = i7 != 3 ? R.string.bo_ui_new_statistics_max_day : R.string.bo_ui_new_statistics_max_year;
        } else {
            i3 = R.string.bo_ui_new_statistics_max_month;
        }
        textView3.setText(context3.getString(i3));
        TextView textView4 = (TextView) findViewById(R.id.min_title);
        Context context4 = getContext();
        int i8 = iArr[timeMode.ordinal()];
        if (i8 == 1) {
            i4 = R.string.bo_ui_new_statistics_min_week;
        } else if (i8 != 2) {
            i4 = i8 != 3 ? R.string.bo_ui_new_statistics_min_day : R.string.bo_ui_new_statistics_min_year;
        } else {
            i4 = R.string.bo_ui_new_statistics_min_month;
        }
        textView4.setText(context4.getString(i4));
    }

    @JvmOverloads
    public BloodOxygenStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), R.layout.bo_ui_statistics_view, this);
    }
}
