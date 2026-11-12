package com.huami.hmchartui.convert;

import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.hmchartui.utils.CommonTimeUtils;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/hmchartui/convert/WeekChartDataConverter;", "Lcom/huami/hmchartui/convert/ChartDataConverter;", "", "dayOfWeek", "a", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "convertData", "", "fixDataIndex", "", "time", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXData", "getBarMaxSize", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekChartDataConverter extends ChartDataConverter {
    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0023 A[RETURN, SYNTHETIC] */
    private final int a(int dayOfWeek) {
        boolean zStartsWith$default = m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
        switch (dayOfWeek) {
            case 1:
                if (zStartsWith$default) {
                    return 0;
                }
                return 6;
            case 2:
                if (zStartsWith$default) {
                    return 1;
                }
                return 0;
            case 3:
                if (zStartsWith$default) {
                    return 2;
                }
                return 1;
            case 4:
                if (zStartsWith$default) {
                    return 3;
                }
                return 2;
            case 5:
                if (zStartsWith$default) {
                    return 4;
                }
                return 3;
            case 6:
                if (zStartsWith$default) {
                    return 5;
                }
                return 4;
            case 7:
                if (zStartsWith$default) {
                    return 6;
                }
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public void fixDataIndex(@NotNull List<ConvertChartData> convertData) {
        Calendar calendar = Calendar.getInstance();
        for (ConvertChartData convertChartData : convertData) {
            calendar.setTimeInMillis(convertChartData.getTime());
            convertChartData.setIndex(a(calendar.get(7)));
        }
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    public int getBarMaxSize(long time) {
        return 7;
    }

    @Override // com.huami.hmchartui.convert.ChartDataConverter
    @NotNull
    public SparseArray<XAxisData> getXData(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(CommonTimeUtils.INSTANCE.getFirstDayOfWeekTime(time));
        int barMaxSize = getBarMaxSize(time);
        if (barMaxSize > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                sparseArray.put(i, new XAxisData(i, calendar.getDisplayName(7, 1, Locale.getDefault())));
                calendar.add(6, 1);
                if (i2 >= barMaxSize) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }
}
