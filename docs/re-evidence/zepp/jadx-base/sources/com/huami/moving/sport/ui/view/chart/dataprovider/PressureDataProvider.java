package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PressureDataProvider extends BaseDataProvider {
    private static final String e = "PressureDataProvider";
    private static final int f = 140;
    private static final int g = 20;
    private int a;
    private int b;
    private int c;
    private SparseArray<ChartData> d;

    public PressureDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.c = 5;
        this.d = new SparseArray<>();
        this.a = (int) this.mTrackData.pressurePeak.getMaxValue();
        this.b = (int) this.mTrackData.pressurePeak.getMinValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        List<CommonTimeValuePoint> pressureList = this.mTrackData.getPressureList();
        for (CommonTimeValuePoint commonTimeValuePoint : pressureList) {
            Log.i(e, "pressure time : " + commonTimeValuePoint.getAbsoluteTime() + ",value:" + commonTimeValuePoint.getValue());
        }
        if (pressureList.size() == 1) {
            pressureList.add(new CommonTimeValuePoint(this.mTrackData.getCurrentTrackId(), pressureList.get(0).getValue()));
        }
        ChartDataConverter.getInstance().convertTo(pressureList, this.d, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.d);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        return "";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        int averagePressure = this.mTrackrecord.getAveragePressure();
        String string = this.mContext.getString(R.string.data_not_supported);
        if (averagePressure > 0) {
            string = this.mTrackrecord.getAveragePressure() + "";
        }
        return new String[]{string, this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return this.mTrackrecord.getAveragePressure();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue */
    public float getMMaxValue() {
        HMLog.d(e, "maxValue " + this.a, new Object[0]);
        return this.a;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue */
    public float getMMinValue() {
        HMLog.d(e, "minValue " + this.b, new Object[0]);
        return this.b;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getNoDataStr() {
        return this.mContext.getResources().getString(R.string.no_heart_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        int maximumPressure = this.mTrackrecord.getMaximumPressure();
        String string = this.mContext.getString(R.string.data_not_supported);
        if (maximumPressure > 0) {
            string = this.mTrackrecord.getMaximumPressure() + "";
        } else if (this.a > 0) {
            string = this.a + "";
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
        sparseArray.put(1, new YAxisData(25.0f, Constants.VIA_REPORT_TYPE_CHAT_AUDIO));
        sparseArray.put(2, new YAxisData(50.0f, "50"));
        sparseArray.put(3, new YAxisData(75.0f, "75"));
        sparseArray.put(4, new YAxisData(100.0f, "100"));
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return this.mTrackrecord.getAveragePressure() > 0;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
