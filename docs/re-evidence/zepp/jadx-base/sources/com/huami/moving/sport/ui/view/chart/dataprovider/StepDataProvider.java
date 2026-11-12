package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xmlywind.sdk.common.mta.PointType;

/* JADX INFO: loaded from: classes11.dex */
public class StepDataProvider extends BaseDataProvider {
    private static final String f = "StepDataProvider";
    private float a;
    private float b;
    private int c;
    private boolean d;
    public SparseArray<ChartData> e;

    public StepDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.d = false;
        this.e = new SparseArray<>();
        this.a = b((int) this.mTrackData.stepStridePeak.getMaxValue());
        float fB = b((int) this.mTrackData.stepStridePeak.getMinValue());
        this.b = fB;
        if (fB == this.a) {
            this.b = 0.0f;
        }
        HMLog.d(f, "minValue " + this.b + " maxValue " + this.a, new Object[0]);
        this.c = this.mTrackData.getSource();
    }

    private int a(float f2) {
        if (!this.isMetric) {
            f2 *= 0.3937008f;
        }
        return (int) f2;
    }

    private float b(float f2) {
        return f2;
    }

    private float getAvgValue() {
        int iIntValue = this.mTrackrecord.getAvgStrideLength().intValue();
        if (RunUtils.isStepValid(iIntValue)) {
            return a(iIntValue);
        }
        return 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        ChartDataConverter.getInstance().convertTo(this.mTrackData.getAlignedStepStrideList(), this.e, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.e);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        if (this.isMetric) {
            return "(" + this.mContext.getResources().getString(R.string.sport_data_unit_cm) + ")";
        }
        return "(" + this.mContext.getResources().getString(R.string.unit_inch) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        return new String[]{((int) getAvgValue()) + "", this.mContext.getString(R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return this.mTrackrecord.getAvgStrideLength().intValue();
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
        return this.mContext.getResources().getString(R.string.no_step_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        return new String[]{(RunUtils.isStepValid((int) this.a) ? a(this.a) : 0) + "", this.mContext.getString(R.string.moving_ui_chart_label_max)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<YAxisData> getYAxisData() {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        if (this.isMetric) {
            sparseArray.put(0, new YAxisData(0.0f, "0"));
            sparseArray.put(1, new YAxisData(50.0f, "50"));
            sparseArray.put(2, new YAxisData(100.0f, "100"));
            sparseArray.put(3, new YAxisData(150.0f, "150"));
            sparseArray.put(4, new YAxisData(200.0f, "200"));
        } else {
            sparseArray.put(0, new YAxisData(0.0f, "0"));
            sparseArray.put(1, new YAxisData(50.0f, "20"));
            sparseArray.put(2, new YAxisData(100.0f, "40"));
            sparseArray.put(3, new YAxisData(150.0f, PointType.WIND_COMMON));
            sparseArray.put(4, new YAxisData(200.0f, "80"));
        }
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return (this.d || this.mTrackrecord.getAvgStrideLength().intValue() == 0) ? false : true;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return this.c != 2;
    }
}
