package com.huami.hmchartui.convert;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.hmchartui.R;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/hmchartui/convert/MonthChartDataConverter;", "Lcom/huami/hmchartui/convert/ChartDataConverter;", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "convertData", "", "fixDataIndex", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXData", "", "getBarMaxSize", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class MonthChartDataConverter extends ChartDataConverter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public MonthChartDataConverter(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public void fixDataIndex(@NotNull List<ConvertChartData> convertData) {
        Calendar calendar = Calendar.getInstance();
        for (ConvertChartData convertChartData : convertData) {
            calendar.setTimeInMillis(convertChartData.getTime());
            convertChartData.setIndex(calendar.get(5) - 1);
        }
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public int getBarMaxSize(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.getActualMaximum(5);
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    @NotNull
    public SparseArray<XAxisData> getXData(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(CommonTimeUtils.INSTANCE.getFirstDayOfMonthTime(time));
        int actualMaximum = calendar.getActualMaximum(5);
        if (actualMaximum > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i % 7 == 0) {
                    sparseArray.put(i, new XAxisData(i, HMDataFormatKt.getFormatTime$default(calendar.getTimeInMillis(), HMPattern.MONTH_DAY_SHORT, (Locale) null, 2, (Object) null)));
                } else {
                    new XAxisData(i, "");
                }
                if (i != actualMaximum - 1) {
                    calendar.add(6, 1);
                }
                if (i2 >= actualMaximum) {
                    break;
                }
                i = i2;
            }
        }
        if (actualMaximum == 28) {
            int i3 = actualMaximum - 1;
            sparseArray.put(i3, new XAxisData(i3, TimeUtils.formatDate(this.context.getString(R.string.date_Md_pattern), calendar.getTimeInMillis())));
        }
        return sparseArray;
    }
}
