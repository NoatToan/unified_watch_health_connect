package com.huami.hmchartui.convert;

import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.module.ktx.I18nKt;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/hmchartui/convert/YearChartDataConverter;", "Lcom/huami/hmchartui/convert/ChartDataConverter;", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "convertData", "", "fixDataIndex", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXData", "", "getBarMaxSize", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class YearChartDataConverter extends ChartDataConverter {
    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public void fixDataIndex(@NotNull List<ConvertChartData> convertData) {
        Calendar calendar = Calendar.getInstance();
        for (ConvertChartData convertChartData : convertData) {
            calendar.setTimeInMillis(convertChartData.getTime());
            convertChartData.setIndex(calendar.get(2));
        }
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public int getBarMaxSize(long time) {
        return 12;
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    @NotNull
    public SparseArray<XAxisData> getXData(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int actualMaximum = calendar.getActualMaximum(2);
        if (actualMaximum >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                sparseArray.put(i, new XAxisData(i, I18nKt.i18n(i2)));
                if (i == actualMaximum) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }
}
