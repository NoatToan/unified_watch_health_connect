package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qme extends HwHealthBarDataSet {
    private DataInfos d;

    public qme(List<HwHealthBarEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(list, str, str2, str3);
        if (dataInfos == null) {
            LogUtil.j("HwHealthUnixBarDataSet", "dataType == null");
        } else {
            this.d = dataInfos;
        }
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet, com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireValuePresentRangeMin(int i) {
        DataInfos dataInfos = this.d;
        if (dataInfos == null) {
            LogUtil.j("HwHealthUnixBarDataSet", "acquireValuePresentRangeMin mDataInfos == null");
            return 0;
        }
        if (dataInfos.isDayData()) {
            if (this.d.isActiveHoursData() || this.d == DataInfos.TemperatureDayDetail) {
                return n(i);
            }
            return j(i);
        }
        if (this.d.isWeekData()) {
            return h(i);
        }
        if (this.d.isMonthData()) {
            return h(i);
        }
        if (this.d.isYearData()) {
            return g(i);
        }
        if (this.d.isAllData()) {
            return i(i);
        }
        return 0;
    }

    public DataInfos e() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet, com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireValuePresentRangeMax(int i) {
        DataInfos dataInfos = this.d;
        if (dataInfos == null) {
            LogUtil.j("HwHealthUnixBarDataSet", "acquireValuePresentRangeMax mDataInfos == null");
            return 0;
        }
        if (dataInfos.isDayData()) {
            if (this.d.isActiveHoursData() || this.d == DataInfos.TemperatureDayDetail) {
                return f(i);
            }
            return c(i);
        }
        if (this.d.isWeekData()) {
            return b(i);
        }
        if (this.d.isMonthData()) {
            return b(i);
        }
        if (this.d.isYearData()) {
            return d(i);
        }
        if (this.d.isAllData()) {
            return a(i);
        }
        return 0;
    }

    private int n(int i) {
        return (int) (lsl.i(((long) i) * 60000, 0) / 60000);
    }

    private int f(int i) {
        return (int) (lsl.i(((long) i) * 60000, 59) / 60000);
    }

    protected int j(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        if (calendar.get(12) < 30) {
            calendar.set(12, 0);
        } else {
            calendar.set(12, 29);
        }
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int c(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        if (calendar.get(12) < 30) {
            calendar.set(12, 30);
        } else {
            calendar.set(12, 59);
        }
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int h(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int b(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int g(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int d(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(2, 1);
        calendar.add(14, -1);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int i(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    protected int a(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 60000);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(1, 1);
        calendar.add(14, -1);
        return (int) (calendar.getTimeInMillis() / 60000);
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet
    public boolean c(float f, HwHealthBarEntry hwHealthBarEntry) {
        if (hwHealthBarEntry != null) {
            return f >= ((float) qnh.h(acquireValuePresentRangeMin(qnh.f((int) hwHealthBarEntry.getX())))) && f <= ((float) qnh.h(acquireValuePresentRangeMax(qnh.f((int) hwHealthBarEntry.getX()))));
        }
        LogUtil.j("HwHealthUnixBarDataSet", "entry == null");
        return false;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet, com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet
    public int acquireRangeCenterValue(int i) {
        return (int) ((acquireValuePresentRangeMax(i) + acquireValuePresentRangeMin(i)) / 2.0f);
    }
}
