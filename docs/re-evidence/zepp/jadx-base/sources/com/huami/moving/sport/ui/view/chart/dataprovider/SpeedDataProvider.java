package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class SpeedDataProvider extends BaseDataProvider {
    private static final String e = "SpeedDataProvider";
    private float a;
    private float b;
    private boolean c;
    private SparseArray<ChartData> d;

    public SpeedDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.c = false;
        this.d = new SparseArray<>();
        this.a = a(this.mTrackData.speedPeak.getMaxValue());
        this.b = a(this.mTrackData.speedPeak.getMinValue());
    }

    private float a(float f) {
        float fConvertTokmph = RunDataConversion.convertTokmph(f);
        if (!this.isMetric) {
            fConvertTokmph = (float) (((double) fConvertTokmph) * 0.6213712d);
        }
        return new BigDecimal(String.valueOf(fConvertTokmph)).setScale(2, 4).floatValue();
    }

    private float b(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        HMLog.i(e + "_GetPace", f + "", new Object[0]);
        float f2 = 3600.0f / f;
        if (!this.isMetric) {
            f2 = (float) (((double) f2) * 0.6213712d);
        }
        return new BigDecimal(String.valueOf(f2)).setScale(2, 4).floatValue();
    }

    private float c(Trackrecord trackrecord) {
        float fFloatValue = trackrecord.getMinrtp() == null ? 0.0f : trackrecord.getMinrtp().floatValue();
        float fFloatValue2 = trackrecord.getMaxrtp() == null ? 0.0f : trackrecord.getMaxrtp().floatValue();
        if (fFloatValue <= 0.0f) {
            return fFloatValue2;
        }
        return (fFloatValue2 > 0.0f && fFloatValue >= fFloatValue2) ? fFloatValue2 : fFloatValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        ArrayList arrayList = new ArrayList();
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getAlignedSpeedList()) {
            if (commonTimeValuePoint.getValue() >= 0.0f) {
                arrayList.add(new CommonTimeValuePoint(commonTimeValuePoint.getAbsoluteTime(), a(commonTimeValuePoint.getValue())));
            }
        }
        ChartDataConverter.getInstance().convertTo(arrayList, this.d, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.d);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        if (this.isMetric) {
            return "(" + this.mContext.getResources().getString(R.string.running_detail_speed) + ")";
        }
        return "(" + this.mContext.getResources().getString(R.string.running_detail_speed_br) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        return new String[]{this.mTrackData.getAvgPace() >= 0.0f ? RunDataConversion.paceConvertToSpeed(this.mTrackrecord.getPace().floatValue(), this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        if (this.mTrackData.getAvgPace() > 1.0E-4f) {
            return b(this.mTrackData.getAvgPace() * 1000.0f);
        }
        return 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue */
    public float getMMaxValue() {
        return this.a;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue */
    public float getMMinValue() {
        return this.b;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getNoDataStr() {
        return this.mContext.getResources().getString(R.string.no_speed_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        float fC = c(this.mTrackrecord);
        return new String[]{fC >= 0.0f ? RunDataConversion.paceConvertToSpeed(fC, this.isMetric) : this.mContext.getString(R.string.data_not_supported), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_max)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<YAxisData> getYAxisData() {
        return getBaseYAxisData();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return !this.c && RunUtils.isPaceValid(this.mTrackData.getAvgPace());
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
