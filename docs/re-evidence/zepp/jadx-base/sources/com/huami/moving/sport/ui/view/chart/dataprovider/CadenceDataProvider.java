package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0017\u0012\u0006\u00103\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00066"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/CadenceDataProvider;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getGoalValue", "Lcom/huami/chart/data/ChartDataList;", "getDataList", "", "shouldDrawGoalLine", "", "", "getFirstValueLabel", "()[Ljava/lang/String;", "getSecondValueLabel", "getThirdValueLabel", "getForthValueLabel", "getMinValue", "getMaxValue", "getNoDataStr", "shouldShow", "getDataUnit", "", "a", LogUtil.I, "mMaxValue", "b", "mMinValue", "c", "Z", "isDataEmpty", "Lcom/huami/chart/data/ChartData;", GoogleApiAvailabilityLight.a, "Landroid/util/SparseArray;", "getDataList$moving_ui_release", "()Landroid/util/SparseArray;", "setDataList$moving_ui_release", "(Landroid/util/SparseArray;)V", "dataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "data", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "deviceSource", TdmillHmFragment.ARG_IS_METRIC, "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;Landroid/content/Context;JIZ)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CadenceDataProvider extends BaseDataProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mMaxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mMinValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isDataEmpty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private SparseArray<ChartData> dataList;

    public CadenceDataProvider(@NotNull Trackrecord trackrecord, @Nullable ParsedSportDetailData parsedSportDetailData, @NotNull BaseType baseType, @NotNull Context context, long j, int i, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.dataList = new SparseArray<>();
        this.mMaxValue = (int) this.mTrackData.getCadencePeak().getMaxValue();
        this.mMinValue = (int) this.mTrackData.getCadencePeak().getMinValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public ChartDataList getDataList() {
        ChartDataConverter.getInstance().convertTo(this.mTrackData.getAlignedCadenceList(), this.dataList, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
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
        Integer avgCadence;
        String[] strArr = new String[2];
        Trackrecord trackrecord = this.mTrackrecord;
        strArr[0] = String.valueOf((trackrecord == null || (avgCadence = trackrecord.getAvgCadence()) == null) ? 0 : avgCadence.intValue());
        strArr[1] = this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_avg);
        return strArr;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        Integer avgCadence;
        Trackrecord trackrecord = this.mTrackrecord;
        if (trackrecord == null || (avgCadence = trackrecord.getAvgCadence()) == null) {
            return 0.0f;
        }
        return avgCadence.intValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMaxValue */
    public float getMMaxValue() {
        return this.mMaxValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    /* JADX INFO: renamed from: getMinValue */
    public float getMMinValue() {
        return this.mMinValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String getNoDataStr() {
        return this.mContext.getResources().getString(R.string.running_history_no_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getSecondValueLabel() {
        Integer maxCadence;
        String[] strArr = new String[2];
        Trackrecord trackrecord = this.mTrackrecord;
        strArr[0] = String.valueOf((trackrecord == null || (maxCadence = trackrecord.getMaxCadence()) == null) ? 0 : maxCadence.intValue());
        strArr[1] = this.mContext.getString(com.huami.moving.sport.ui.R.string.moving_ui_chart_label_fast);
        return strArr;
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
        return !this.isDataEmpty;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
