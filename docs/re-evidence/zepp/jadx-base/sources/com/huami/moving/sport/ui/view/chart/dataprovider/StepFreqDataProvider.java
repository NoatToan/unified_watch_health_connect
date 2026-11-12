package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;

/* JADX INFO: loaded from: classes11.dex */
public class StepFreqDataProvider extends BaseDataProvider {
    private static final String f = "StepFreqDataProvider";
    private float a;
    private float b;
    private int c;
    private boolean d;
    public SparseArray<ChartData> e;

    public StepFreqDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.d = false;
        this.e = new SparseArray<>();
        this.a = a((int) this.mTrackData.getStepFreqPeak().getMaxValue());
        this.b = a((int) this.mTrackData.getStepFreqPeak().getMinValue());
        HMLog.d(f, "minValue " + this.b + " maxValue " + this.a, new Object[0]);
        this.c = this.mTrackData.getSource();
    }

    private float a(int i) {
        return i;
    }

    public float getAvgValue() {
        return this.mTrackrecord.getSfreq().intValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        ChartDataConverter.getInstance().convertTo(this.mTrackData.getAlignedStepFreqList(), this.e, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.e);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        return "(" + this.mContext.getResources().getString(R.string.unit_pace_freq).trim() + ")";
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
        return this.mTrackrecord.getSfreq().intValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue */
    public float getMMaxValue() {
        return (int) this.mTrackData.getStepFreqPeak().getMaxValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue */
    public float getMMinValue() {
        return this.b;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getNoDataStr() {
        return this.mContext.getResources().getString(R.string.no_step_freq_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        String string;
        if (this.mTrackrecord.getMaxSFreq() <= 0) {
            string = this.mContext.getString(R.string.data_not_supported);
        } else {
            string = this.mTrackrecord.getMaxSFreq() + "";
        }
        return new String[]{string, this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_highest)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<YAxisData> getYAxisData() {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        sparseArray.put(0, new YAxisData(0.0f, "0"));
        sparseArray.put(1, new YAxisData(55.0f, "55"));
        sparseArray.put(2, new YAxisData(110.0f, "110"));
        sparseArray.put(3, new YAxisData(165.0f, "165"));
        sparseArray.put(4, new YAxisData(220.0f, "220"));
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return !this.d && RunUtils.isPaceValid((float) this.mTrackrecord.getSfreq().intValue());
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return this.c != 2;
    }
}
