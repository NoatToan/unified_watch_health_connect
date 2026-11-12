package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;

/* JADX INFO: loaded from: classes11.dex */
public class AltiDataProvider extends BaseDataProvider {
    private static final String e = "AltiDataProvider";
    private static final int f = 1000;
    private static final int g = -2000000;
    private boolean a;
    private int b;
    private int c;
    public SparseArray<ChartData> d;

    public AltiDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.a = true;
        this.d = new SparseArray<>();
        if (this.mTrackData.getAlignedTimeDeltaAltitudeList().size() > 0) {
            this.b = (int) this.mTrackData.timeDeltaAltiPeak.getMaxValue();
            this.c = (int) this.mTrackData.timeDeltaAltiPeak.getMinValue();
        } else {
            this.b = (int) this.mTrackData.altiPeak.getMaxValue();
            this.c = (int) this.mTrackData.altiPeak.getMinValue();
        }
    }

    private double a(float f2) {
        if (!this.isMetric) {
            f2 *= 3.28084f;
        }
        return f2;
    }

    private boolean b(float f2) {
        return (f2 == 0.0f || f2 == -1.0f || f2 == -2000000.0f) ? false : true;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        ChartDataConverter.getInstance().convertTo(this.mTrackData.getAlignedTimeDeltaAltitudeList().size() > 0 ? this.mTrackData.getAlignedTimeDeltaAltitudeList() : this.mTrackData.getAlignedAltiList(), this.d, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.d);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        if (this.isMetric) {
            return "(" + this.mContext.getResources().getString(R.string.unit_m) + ")";
        }
        return "(" + this.mContext.getResources().getString(R.string.unit_foot) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        return new String[]{RunUtils.isAltiMeterValid(this.mTrackrecord.getAvgAltitude().intValue()) ? RunDataConversion.parseAltitude(this.mTrackrecord.getAvgAltitude().floatValue(), this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return new String[]{RunUtils.isAltiMeterValid(this.mTrackrecord.getMaxAltitude()) ? RunDataConversion.parseAltitude(this.mTrackrecord.getMaxAltitude(), this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_highest)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return this.mTrackrecord.getAvgAltitude().floatValue() * 100.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue */
    public float getMMaxValue() {
        return this.b;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue */
    public float getMMinValue() {
        return this.c;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getNoDataStr() {
        return (this.a || this.mTrackData.getDetailVersion() < 11) ? this.mContext.getResources().getString(R.string.no_alti_data) : this.mContext.getResources().getString(R.string.not_support_alti_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        return new String[]{RunUtils.isAltiTotalValid(this.mTrackrecord.getAltitudeAscend().intValue()) ? RunDataConversion.parseAltitude(this.mTrackrecord.getAltitudeAscend().intValue(), this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(R.string.cumulative_rising_altitude)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getThirdValueLabel() {
        return new String[]{RunUtils.isAltiMeterValid(this.mTrackrecord.getMinAltitude()) ? RunDataConversion.parseAltitude(this.mTrackrecord.getMinAltitude(), this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_lowest)};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<YAxisData> getYAxisData() {
        int i;
        double dFloor;
        float f2;
        int iFloor = this.c / 100;
        int iCeil = this.b / 100;
        if (!this.isMetric) {
            iCeil = (int) Math.ceil(a(iCeil));
            iFloor = (int) Math.floor(a(iFloor));
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i2 = iCeil - iFloor < 1000 ? 10 : 100;
        int i3 = ((iCeil / i2) + 1) * i2;
        int i4 = (iFloor < 0 ? (iFloor / i2) - 1 : iFloor / i2) * i2;
        float f3 = ((i3 - i4) * 1.0f) / (this.yLabelSize - 1);
        int i5 = 0;
        while (true) {
            int i6 = this.yLabelSize;
            if (i5 >= i6) {
                return sparseArray;
            }
            float f4 = i4 + (i5 * f3);
            if (i5 == 1) {
                dFloor = Math.ceil(f4);
            } else {
                if (i5 <= 1 || i5 >= i6 - 1) {
                    i = i5 == i6 + (-1) ? i3 : i4;
                } else {
                    dFloor = Math.floor(f4);
                }
                HMLog.d(e, "getYAxisData label: " + i, new Object[0]);
                if (this.isMetric) {
                    f2 = i * 100;
                } else {
                    f2 = (i * 100) / 3.28084f;
                }
                sparseArray.put(i5, new YAxisData(f2, i + ""));
                i5++;
            }
            i = (int) dFloor;
            HMLog.d(e, "getYAxisData label: " + i, new Object[0]);
            if (this.isMetric) {
                f2 = i * 100;
            } else {
                f2 = (i * 100) / 3.28084f;
            }
            sparseArray.put(i5, new YAxisData(f2, i + ""));
            i5++;
        }
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return true;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        int i = this.b;
        if (i != this.c) {
            return true;
        }
        return b(i);
    }
}
