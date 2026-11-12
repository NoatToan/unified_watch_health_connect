package com.huami.hmchartui.convert;

import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.hmchartui.model.BarChartData;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.module.ktx.I18nKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/huami/hmchartui/convert/ChartDataConverter;", "", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "convertData", "Lcom/huami/hmchartui/model/BarChartData;", "convertChartData", "", "fixDataIndex", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXData", "", "getBarMaxSize", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public abstract class ChartDataConverter {
    @NotNull
    public final BarChartData convertChartData(@NotNull List<ConvertChartData> convertData) {
        fixDataIndex(convertData);
        long jCurrentTimeMillis = convertData.isEmpty() ? System.currentTimeMillis() : ((ConvertChartData) CollectionsKt.first((List) convertData)).getTime();
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        SparseArray<ChartData> sparseArray2 = new SparseArray<>();
        int i = 0;
        int value = 0;
        int i2 = 0;
        for (Object obj : convertData) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ConvertChartData convertChartData = (ConvertChartData) obj;
            if (convertChartData.getValue() > 0) {
                ChartData chartData = new ChartData(convertChartData.getIndex(), new float[]{convertChartData.getValue()});
                sparseArray2.put(chartData.getIndex(), chartData);
                if (convertChartData.getValue() > value) {
                    value = convertChartData.getValue();
                }
            }
            i2 = i3;
        }
        if (value != 0) {
            int iMax = value + Math.max(100, value / 4);
            if (iMax % 10 != 0) {
                iMax = ((iMax / 10) + 1) * 10;
            }
            int i4 = iMax % 3 == 0 ? iMax / 3 : iMax / 2;
            int i5 = 0;
            for (float f = 0.0f; f <= iMax; f += i4) {
                sparseArray.put(i5, new YAxisData(f, I18nKt.i18n((int) f)));
                i5++;
            }
        }
        BarChartData barChartData = new BarChartData();
        if (!convertData.isEmpty()) {
            Iterator<T> it2 = convertData.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                if ((((ConvertChartData) it2.next()).getValue() > 0) && (i6 = i6 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            i = i6;
        }
        barChartData.setXData(i == 0 ? new SparseArray<>() : getXData(jCurrentTimeMillis));
        barChartData.setYData(sparseArray);
        barChartData.setChartData(sparseArray2);
        barChartData.setBarMaxSize(getBarMaxSize(jCurrentTimeMillis));
        return barChartData;
    }

    public abstract void fixDataIndex(@NotNull List<ConvertChartData> convertData);

    public abstract int getBarMaxSize(long time);

    @NotNull
    public abstract SparseArray<XAxisData> getXData(long time);
}
