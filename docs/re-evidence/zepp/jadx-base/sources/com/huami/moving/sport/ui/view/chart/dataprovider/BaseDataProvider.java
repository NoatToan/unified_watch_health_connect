package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.sport.ui.utils.DataFormatter;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import defpackage.fc4;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseDataProvider implements IDataProvider {
    public boolean isMetric;
    public BaseType mBaseType;
    public Context mContext;
    public ParsedSportDetailData mTrackData;
    public Trackrecord mTrackrecord;
    public int yLabelSize = 5;

    public BaseDataProvider(Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, BaseType baseType, Context context, boolean z) {
        this.mBaseType = baseType;
        this.mTrackData = parsedSportDetailData;
        this.mContext = context;
        this.isMetric = z;
        this.mTrackrecord = trackrecord;
    }

    public SparseArray<YAxisData> getBaseYAxisData() {
        return getYAxisListByMinMax((((int) getMinValue()) / 10) * 10, ((((int) getMaxValue()) / 10) + 1) * 10);
    }

    public int getBgId() {
        return this.mBaseType.getBgId();
    }

    public abstract String getDataUnit();

    public abstract String[] getFirstValueLabel();

    public abstract String[] getForthValueLabel();

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public /* synthetic */ float[] getGoalValues() {
        return fc4.a(this);
    }

    public abstract float getMaxValue();

    public abstract float getMinValue();

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public /* synthetic */ List getMultiDataList() {
        return fc4.b(this);
    }

    public abstract String getNoDataStr();

    public abstract String[] getSecondValueLabel();

    public abstract String[] getThirdValueLabel();

    public String getTitle() {
        return this.mBaseType.getName(this.mContext);
    }

    public ParsedSportDetailData getTrackData() {
        return this.mTrackData;
    }

    public BaseType getType() {
        return this.mBaseType;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public SparseArray<XAxisData> getXAxisData() {
        int iIntValue = this.mTrackData.getTotalCostTime().intValue();
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int i = iIntValue / 4;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = i2 * i;
            if (i2 == 4) {
                i3 = iIntValue;
            }
            sparseArray.put(i3, new XAxisData(i3, DataFormatter.getMMSSTimeBySecond(this.mContext, i3) + "", ""));
        }
        return sparseArray;
    }

    public SparseArray<YAxisData> getYAxisListByMinMax(int i, int i2) {
        int i3;
        double dFloor;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        float f = ((i2 - i) * 1.0f) / (this.yLabelSize - 1);
        int i4 = 0;
        while (true) {
            int i5 = this.yLabelSize;
            if (i4 >= i5) {
                return sparseArray;
            }
            float f2 = i + (i4 * f);
            if (i4 == 1) {
                dFloor = Math.ceil(f2);
            } else {
                if (i4 <= 1 || i4 >= i5 - 1) {
                    i3 = i4 == i5 + (-1) ? i2 : i;
                } else {
                    dFloor = Math.floor(f2);
                }
                sparseArray.put(i4, new YAxisData(i3, i3 + ""));
                i4++;
            }
            i3 = (int) dFloor;
            sparseArray.put(i4, new YAxisData(i3, i3 + ""));
            i4++;
        }
    }

    public boolean isEmpty() {
        return getDataList() == null || getDataList().getCount() == 0;
    }

    public boolean isMetric() {
        return this.isMetric;
    }

    public abstract boolean shouldDrawGoalLine();

    public abstract boolean shouldShow();
}
