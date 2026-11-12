package defpackage;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower;
import health.compact.a.UnitUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vpr implements MonthDataShower {
    protected static final String DEFAULT_STRING_EMPTY = "";
    protected static final double DISTANCE_DIGITAL = 0.005d;
    public static final String TAG = "Track_BaseShower";
    protected Context mContext;
    protected HwSportTypeInfo mHwSportTypeInfo;
    protected Double mMainData;
    protected Map<String, Double> mMonthData;

    public double standardization(double d) {
        return d;
    }

    public vpr() {
    }

    public vpr(HwSportTypeInfo hwSportTypeInfo, Map<String, Double> map, Context context) {
        this.mContext = context.getApplicationContext();
        this.mHwSportTypeInfo = hwSportTypeInfo;
        this.mMonthData = map;
    }

    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        return "";
    }

    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        String str = "Track_" + this.mHwSportTypeInfo.getSportTypeId() + this.mHwSportTypeInfo.getHistoryList().mainPositionData(true);
        Map<String, Double> map = this.mMonthData;
        if (map != null && map.containsKey(str)) {
            Double d = this.mMonthData.get(str);
            this.mMainData = d;
            if (d == null) {
                return "--";
            }
            return processDataToString(standardization(d.doubleValue()));
        }
        return UnitUtil.e(0.0d, 1, 2);
    }

    public String processDataToString(double d) {
        LogUtil.a(TAG, "processDataToString", Double.valueOf(d));
        return UnitUtil.e(d, 1, 0);
    }

    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public void setBaseInformation(Map<String, Double> map, HwSportTypeInfo hwSportTypeInfo, Context context) {
        this.mMonthData = map;
        this.mHwSportTypeInfo = hwSportTypeInfo;
        this.mContext = context.getApplicationContext();
    }

    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public int getSportType() {
        return this.mHwSportTypeInfo.getSportTypeId();
    }
}
