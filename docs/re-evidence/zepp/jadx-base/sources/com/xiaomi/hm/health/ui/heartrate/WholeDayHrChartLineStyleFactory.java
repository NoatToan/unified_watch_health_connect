package com.xiaomi.hm.health.ui.heartrate;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.style.LineStyle;
import com.huami.lib.view.ViewUtils;
import com.huami.watch.hmwatchmanager.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes22.dex */
public class WholeDayHrChartLineStyleFactory {
    public static LineStyle create(Context context, ChartDataList chartDataList, boolean amplify) {
        return create(context, chartDataList, amplify, new ArrayList());
    }

    public static LineStyle create(Context context, ChartDataList chartData, boolean amplify, ArrayList<RangeIndex> abnormalRange) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.whole_day_hr_chart_height);
        int[] iArr = {ContextCompat.getColor(context, R.color.hr_chart_bg_start_color), ContextCompat.getColor(context, R.color.hr_chart_bg_end_color)};
        int[] iArr2 = {ContextCompat.getColor(context, R.color.abnormal_hr_line_shadow), 0};
        int i = 6;
        int[] iArr3 = {ContextCompat.getColor(context, R.color.hr_tape_rest), ContextCompat.getColor(context, R.color.hr_whole_day_line_color), ContextCompat.getColor(context, R.color.hr_whole_day_line_color), ContextCompat.getColor(context, R.color.hr_whole_day_line_color), ContextCompat.getColor(context, R.color.hr_whole_day_line_color), ContextCompat.getColor(context, R.color.hr_whole_day_line_color)};
        float maxHeartRate = HRDataManager.getInstance().getMaxHeartRate();
        float f = 0.5f * maxHeartRate;
        float f2 = 0.6f * maxHeartRate;
        float f3 = 0.7f * maxHeartRate;
        float f4 = 0.8f * maxHeartRate;
        float f5 = maxHeartRate * 0.9f;
        float maxValue = chartData.getMaxValue();
        float[] fArr = {0.0f, f / maxValue, f2 / maxValue, f3 / maxValue, f4 / maxValue, f5 / maxValue};
        if (maxValue < f5) {
            if (maxValue >= f4 && maxValue < f5) {
                i = 5;
            } else if (maxValue >= f3 && maxValue < f4) {
                i = 4;
            } else if (maxValue < f2 || maxValue >= f3) {
                i = (maxValue < f || maxValue >= f2) ? 1 : 2;
            } else {
                i = 3;
            }
        }
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr3, 0, i);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i);
        LineStyle.Builder shadowBeforeIndex = new LineStyle.Builder(context).setLineWidth(ViewUtils.dp2px(context, 1.0f)).setHighlightLineWidth(ViewUtils.dp2px(context, 1.0f)).setLineStyle(2).setInteractiveSlide(true).setShadowColors(iArr).setSubIndex(abnormalRange).setSubLinecolor(ContextCompat.getColor(context, R.color.abnormal_hr_line_color)).setSubShadowColors(iArr2).setShadowBeforeIndex(false);
        if (iArrCopyOfRange.length > 1) {
            shadowBeforeIndex.setLineShader(new LinearGradient(0.0f, dimensionPixelOffset, 0.0f, 0.0f, iArrCopyOfRange, fArrCopyOfRange, Shader.TileMode.CLAMP));
        } else {
            shadowBeforeIndex.setLineColor(iArrCopyOfRange[0]).setHighlightLineColor(iArrCopyOfRange[0]);
        }
        return shadowBeforeIndex.create();
    }
}
