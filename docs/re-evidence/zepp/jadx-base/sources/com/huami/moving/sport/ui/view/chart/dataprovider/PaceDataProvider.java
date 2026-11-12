package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.mifit.sportlib.utils.SportDataVerificationKt;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class PaceDataProvider extends BaseDataProvider {
    private static final String k = "PaceDataProvider";
    private static float l = 1.8f;
    private static final float m = 0.6f;
    private float a;
    private float b;
    private int c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private SparseArray<ChartData> j;

    public PaceDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.c = 5;
        this.e = false;
        this.f = -1.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = false;
        this.j = new SparseArray<>();
        this.g = this.mTrackData.pacePeak.getMaxValue();
        this.h = this.mTrackData.pacePeak.getMinValue();
        String str = k;
        HMLog.d(str, "maxPace: " + this.g + ",minPace:" + this.h, new Object[0]);
        boolean zIsSwimSport = DataTypeSource.isSwimSport(this.mTrackData.getSportType().intValue());
        this.d = zIsSwimSport;
        if (zIsSwimSport) {
            l = 6.0f;
        }
        float f = this.g;
        if (f == Constants.PEAK_MINEST_VALUE && this.h > f) {
            HMLog.i(str, "invalid Peak-Pace Value !!!  ", new Object[0]);
            this.g = l;
            this.h = 0.6f;
        }
        this.a = this.d ? RunDataConversion.paceMultiplyHund(this.g, z) : (float) RunDataConversion.paceMultiplyKilo(this.g, z);
        this.b = this.d ? RunDataConversion.paceMultiplyHund(this.h, z) : (float) RunDataConversion.paceMultiplyKilo(this.h, z);
    }

    private float a() {
        if (b(this.g)) {
            return this.d ? RunDataConversion.paceMultiplyHund(this.g, this.isMetric) : (float) RunDataConversion.paceMultiplyKilo(this.g, this.isMetric);
        }
        int i = ((int) ((this.a / 60.0f) + 1.0f)) * 60;
        float f = i + ((i - (((int) (this.b / 60.0f)) * 60)) / (this.c - 1));
        float f2 = l;
        return f > f2 * 1000.0f ? f2 * 1000.0f : f;
    }

    private boolean b(float f) {
        return f >= l;
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
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getAlignedPaceList()) {
            if (commonTimeValuePoint.getValue() >= 0.0f) {
                double dPaceMultiplyHund = this.d ? RunDataConversion.paceMultiplyHund(commonTimeValuePoint.getValue(), this.isMetric) : RunDataConversion.paceMultiplyKilo(commonTimeValuePoint.getValue(), this.isMetric);
                if (b(commonTimeValuePoint.getValue())) {
                    this.e = true;
                    float fA = a();
                    this.f = fA;
                    if (dPaceMultiplyHund > fA) {
                        dPaceMultiplyHund = fA;
                    }
                }
                arrayList.add(new CommonTimeValuePoint(commonTimeValuePoint.getAbsoluteTime(), (float) dPaceMultiplyHund));
            }
        }
        ChartDataConverter.getInstance().convertTo(arrayList, this.j, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.j);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String getDataUnit() {
        if (this.isMetric) {
            if (this.d) {
                return "(" + this.mContext.getResources().getString(R.string.sport_data_unit_pace_hundred_m) + ")";
            }
            return "(" + this.mContext.getResources().getString(R.string.sport_data_unit_pace_km) + ")";
        }
        if (this.d) {
            return "(" + this.mContext.getResources().getString(R.string.sport_data_unit_pace_hundred_yd) + ")";
        }
        return "(" + this.mContext.getResources().getString(R.string.sport_data_unit_pace_mile) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getFirstValueLabel() {
        String string;
        if (SportDataVerificationKt.isValidPace(this.mTrackData.getAvgPace(), this.mTrackrecord.getType().intValue())) {
            string = DataFormatter.formatTimeInSportFormForPace((long) (this.d ? RunDataConversion.paceMultiplyHund(this.mTrackData.getAvgPace(), this.isMetric) : (float) RunDataConversion.paceMultiplyKilo(this.mTrackData.getAvgPace(), this.isMetric)));
        } else {
            string = this.mContext.getString(R.string.data_not_supported);
        }
        return new String[]{string, this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        float avgPace = this.mTrackData.getAvgPace();
        if (!SportDataVerificationKt.isValidPace(avgPace, this.mTrackrecord.getType().intValue())) {
            return 0.0f;
        }
        double dPaceMultiplyHund = this.d ? RunDataConversion.paceMultiplyHund(avgPace, this.isMetric) : RunDataConversion.paceMultiplyKilo(avgPace, this.isMetric);
        float f = this.f;
        if (dPaceMultiplyHund > f && f > 0.0f) {
            dPaceMultiplyHund = f;
        }
        return (float) dPaceMultiplyHund;
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
        return this.mContext.getResources().getString(R.string.no_pace_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getSecondValueLabel() {
        String string;
        float fC = c(this.mTrackrecord);
        if (SportDataVerificationKt.isValidPace(fC, this.mTrackrecord.getType().intValue())) {
            string = DataFormatter.formatTimeInSportFormForPace((long) (this.d ? RunDataConversion.paceMultiplyHund(fC, this.isMetric) : (float) RunDataConversion.paceMultiplyKilo(fC, this.isMetric)));
        } else {
            string = this.mContext.getString(R.string.data_not_supported);
        }
        return new String[]{string, this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_best)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<YAxisData> getYAxisData() {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        float f = this.a;
        int i = ((int) ((f / 60.0f) + 1.0f)) * 60;
        int i2 = ((int) (this.b / 60.0f)) * 60;
        int i3 = (i - i2) / (this.c - 1);
        float f2 = this.f;
        int i4 = 0;
        if (f2 <= 0.0f || f2 <= f) {
            this.e = false;
        } else {
            HMLog.d(k, "getYAxisData slowest pace: " + this.f, new Object[0]);
            sparseArray.put(0, new YAxisData(this.f, this.mContext.getString(R.string.data_not_supported)));
        }
        while (true) {
            int i5 = this.c;
            if (i4 >= i5) {
                return sparseArray;
            }
            float f3 = i - (i4 * i3);
            if (i4 == i5 - 1) {
                f3 = i2 > 0 ? i2 : 1.0f;
            }
            Log.i(k, "getYAxisData pace: " + f3);
            String timeInSportFormForPace = DataFormatter.formatTimeInSportFormForPace((long) f3);
            int i6 = this.e ? i4 + 1 : i4;
            if (b(this.g) && f3 == i) {
                timeInSportFormForPace = DataFormatter.formatTimeInSportFormForPace((long) this.a);
            }
            sparseArray.put(i6, new YAxisData(f3, timeInSportFormForPace));
            i4++;
        }
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return !this.i && RunUtils.isPaceValid(this.mTrackData.getAvgPace());
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
