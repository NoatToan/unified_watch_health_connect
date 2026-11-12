package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HeartDataProvider extends BaseDataProvider {
    private static final String e = "HeartDataProvider";
    private static final int f = 140;
    private static final int g = 20;
    private int a;
    private int b;
    private int c;
    private SparseArray<ChartData> d;

    public HeartDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.c = 0;
        this.d = new SparseArray<>();
        this.a = (int) this.mTrackData.heartPeak.getMaxValue();
        this.b = (int) this.mTrackData.heartPeak.getMinValue();
        this.c = this.mTrackrecord.getAvghr() != null ? this.mTrackrecord.getAvghr().intValue() : 0;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public ChartDataList getDataList() {
        List<CommonTimeValuePoint> alignedHeartList = this.mTrackData.getAlignedHeartList();
        for (CommonTimeValuePoint commonTimeValuePoint : alignedHeartList) {
            Log.i(e, "heart time : " + commonTimeValuePoint.getAbsoluteTime() + ",value:" + commonTimeValuePoint.getValue());
        }
        if (alignedHeartList.size() == 1) {
            alignedHeartList.add(new CommonTimeValuePoint(this.mTrackData.getCurrentTrackId(), alignedHeartList.get(0).getValue()));
        }
        ChartDataConverter.getInstance().convertTo(alignedHeartList, this.d, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.d);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        return "(" + this.mContext.getResources().getString(R.string.hr_unit).trim() + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        return new String[]{this.c + "", this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return this.c;
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
        String string;
        if (this.mTrackrecord.getMaxHR() == null || !HeartRateConstant.isHRValueValid(this.mTrackrecord.getMaxHR().intValue())) {
            string = this.mContext.getString(R.string.data_not_supported);
        } else {
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
        int i;
        int i2;
        int i3 = this.a;
        int i4 = this.b;
        if (i3 - i4 > 20) {
            return getBaseYAxisData();
        }
        if (i3 > 140) {
            i = ((i3 / 10) + 1) * 10;
            i2 = i - 40;
        } else {
            i = (((i3 / 10) + 1) * 10) + 40;
            i2 = (i4 / 10) * 10;
        }
        return getYAxisListByMinMax(i2, i);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return HeartRateConstant.isHRValueValid(this.c);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
