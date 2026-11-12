package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00065"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/BoatingFreDataProvider;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "Lcom/huami/chart/data/ChartDataList;", "getDataList", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getGoalValue", "", "shouldDrawGoalLine", "", "", "getFirstValueLabel", "()[Ljava/lang/String;", "getSecondValueLabel", "getThirdValueLabel", "getForthValueLabel", "getMaxValue", "getMinValue", "getNoDataStr", "shouldShow", "getDataUnit", "a", "Ljava/lang/String;", "TAG", "b", "F", "mMaxValue", "c", "mMinValue", GoogleApiAvailabilityLight.a, "Z", "isDataEmpty", "Lcom/huami/chart/data/ChartData;", "e", "Landroid/util/SparseArray;", "getDataList$moving_ui_release", "()Landroid/util/SparseArray;", "setDataList$moving_ui_release", "(Landroid/util/SparseArray;)V", "dataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "data", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, TdmillHmFragment.ARG_IS_METRIC, "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;Landroid/content/Context;Z)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BoatingFreDataProvider extends BaseDataProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float mMaxValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mMinValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isDataEmpty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private SparseArray<ChartData> dataList;

    public BoatingFreDataProvider(@NotNull Trackrecord trackrecord, @Nullable ParsedSportDetailData parsedSportDetailData, @Nullable BaseType baseType, @Nullable Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.TAG = BoatingFreDataProvider.class.getSimpleName();
        this.dataList = new SparseArray<>();
        float f = 60;
        this.mMaxValue = this.mTrackData.getStrokePeak().getMaxValue() * f;
        this.mMinValue = this.mTrackData.getStrokePeak().getMinValue() * f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public ChartDataList getDataList() {
        ArrayList arrayList = new ArrayList();
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getAlignedStrokeList()) {
            long absoluteTime = commonTimeValuePoint.getAbsoluteTime();
            float value = commonTimeValuePoint.getValue();
            if (value >= 0.0f) {
                arrayList.add(new CommonTimeValuePoint(absoluteTime, value * 60));
            }
        }
        ChartDataConverter.getInstance().convertTo(arrayList, this.dataList, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.dataList);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.mTrackData.getTotalCostTime().intValue());
        return chartDataList;
    }

    @NotNull
    public final SparseArray<ChartData> getDataList$moving_ui_release() {
        return this.dataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String getDataUnit() {
        return "(" + this.mContext.getResources().getString(R.string.unit_bike_ride) + ")";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getFirstValueLabel() {
        return new String[]{String.valueOf(this.mTrackrecord.getSfreq()), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        float fIntValue = this.mTrackrecord.getSfreq().intValue();
        if (fIntValue > 0.0f) {
            return fIntValue;
        }
        return 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue, reason: from getter */
    public float getMMaxValue() {
        return this.mMaxValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue, reason: from getter */
    public float getMMinValue() {
        return this.mMinValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String getNoDataStr() {
        return this.mContext.getString(R.string.sport_chart_boating_fre_null);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getSecondValueLabel() {
        return new String[]{this.mTrackrecord.getMaxSFreq() <= 0 ? this.mContext.getString(R.string.data_not_supported) : String.valueOf(this.mTrackrecord.getMaxSFreq()), this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_highest)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return getBaseYAxisData();
    }

    public final void setDataList$moving_ui_release(@NotNull SparseArray<ChartData> sparseArray) {
        this.dataList = sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return !this.isDataEmpty && this.mTrackrecord.getSfreq().intValue() > 0;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
