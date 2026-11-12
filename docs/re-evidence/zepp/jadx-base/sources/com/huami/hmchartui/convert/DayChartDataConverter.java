package com.huami.hmchartui.convert;

import android.content.Context;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.data.XAxisData;
import com.huami.hmchartui.R;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/hmchartui/convert/DayChartDataConverter;", "Lcom/huami/hmchartui/convert/ChartDataConverter;", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "convertData", "", "fixDataIndex", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXData", "", "getBarMaxSize", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", LogUtil.I, "dayBarSize", "<init>", "(Landroid/content/Context;)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class DayChartDataConverter extends ChartDataConverter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int dayBarSize = 24;

    public DayChartDataConverter(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public void fixDataIndex(@NotNull List<ConvertChartData> convertData) {
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public int getBarMaxSize(long time) {
        return this.dayBarSize;
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    @NotNull
    public SparseArray<XAxisData> getXData(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(CommonTimeUtils.INSTANCE.getDayStartTime(time));
        String string = this.context.getString(R.string.time_HHmm_pattern);
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int i = this.dayBarSize;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 % 6 == 0) {
                    sparseArray.put(i2, new XAxisData(i2, TimeUtils.formatDate(string, calendar.getTimeInMillis())));
                    calendar.add(11, 6);
                } else if (i2 == this.dayBarSize - 1) {
                    sparseArray.put(i2, new XAxisData(i2, TimeUtils.formatDate(string, CommonTimeUtils.INSTANCE.getDayEndTime(time))));
                } else {
                    sparseArray.put(i2, new XAxisData(i2, ""));
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return sparseArray;
    }
}
