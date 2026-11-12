package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class StrokeSpeedDataProvider extends BaseDataProvider {
    private static final String e = "StrokeSpeedDataProvider";
    private float a;
    private float b;
    private boolean c;
    public SparseArray<ChartData> d;

    public StrokeSpeedDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.c = false;
        this.d = new SparseArray<>();
        this.a = this.mTrackData.getStrokePeak().getMaxValue() * 60.0f;
        this.b = this.mTrackData.getStrokePeak().getMinValue() * 60.0f;
    }

    public float getAvgValue() {
        return Math.round(this.mTrackrecord.getSwimAvgStrokeSpeed().floatValue() * 60.0f);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        ArrayList arrayList = new ArrayList();
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getAlignedStrokeList()) {
            if (commonTimeValuePoint.getValue() >= 0.0f) {
                arrayList.add(new CommonTimeValuePoint(commonTimeValuePoint.getAbsoluteTime(), commonTimeValuePoint.getValue() * 60.0f));
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
        return "(" + this.mContext.getResources().getString(R.string.unit_bike_ride) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        return new String[]{((int) getAvgValue()) + "", this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        float fFloatValue = this.mTrackrecord.getSwimAvgStrokeSpeed().floatValue() * 60.0f;
        if (fFloatValue > 0.0f) {
            return fFloatValue;
        }
        return 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMaxValue() {
        return Math.round(this.a);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMinValue() {
        return this.b;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getNoDataStr() {
        return this.mContext.getResources().getString(R.string.no_stroke_speed_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        return new String[]{Math.round(this.mTrackrecord.getSwimMaxStrokeSpeed().floatValue() * 60.0f) + "", this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_max)};
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
        return !this.c && this.mTrackrecord.getSwimAvgStrokeSpeed().floatValue() * 60.0f > 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
