package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00060"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/Spo2DataProvider;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getGoalValue", "Lcom/huami/chart/data/ChartDataList;", "getDataList", "", "shouldDrawGoalLine", "", "", "getFirstValueLabel", "()[Ljava/lang/String;", "getSecondValueLabel", "getThirdValueLabel", "getForthValueLabel", "getMinValue", "getMaxValue", "getNoDataStr", "shouldShow", "getDataUnit", "", "a", LogUtil.I, "mMaxValue", "b", "mMinValue", "Lcom/huami/chart/data/ChartData;", "c", "Landroid/util/SparseArray;", "getDataList$moving_ui_release", "()Landroid/util/SparseArray;", "setDataList$moving_ui_release", "(Landroid/util/SparseArray;)V", "dataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "data", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, TdmillHmFragment.ARG_IS_METRIC, "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;Landroid/content/Context;Z)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2DataProvider extends BaseDataProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mMaxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mMinValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SparseArray<ChartData> dataList;

    public Spo2DataProvider(@NotNull Trackrecord trackrecord, @Nullable ParsedSportDetailData parsedSportDetailData, @NotNull BaseType baseType, @NotNull Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.mMaxValue = 100;
        this.mMinValue = 75;
        this.dataList = new SparseArray<>();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public ChartDataList getDataList() {
        ChartDataConverter.getInstance().convertTo(this.mTrackData.getSpo2List(), this.dataList, this.mTrackData.getCurrentTrackId(), this.mBaseType, this.mContext);
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
        return "(%)";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getFirstValueLabel() {
        String[] strArr = new String[2];
        Trackrecord trackrecord = this.mTrackrecord;
        strArr[0] = String.valueOf(trackrecord == null ? 0 : trackrecord.getSpo2Max());
        strArr[1] = this.mContext.getString(R.string.moving_ui_chart_label_highest);
        return strArr;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return 90.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMaxValue() {
        Trackrecord trackrecord = this.mTrackrecord;
        if (trackrecord == null) {
            return 0.0f;
        }
        return trackrecord.getSpo2Max();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMinValue() {
        Trackrecord trackrecord = this.mTrackrecord;
        if (trackrecord == null) {
            return 0.0f;
        }
        return trackrecord.getSpo2Min();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String getNoDataStr() {
        return this.mContext.getResources().getString(com.huami.moving.R.string.no_spo2_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getSecondValueLabel() {
        String[] strArr = new String[2];
        Trackrecord trackrecord = this.mTrackrecord;
        strArr[0] = String.valueOf(trackrecord == null ? 0 : trackrecord.getSpo2Min());
        strArr[1] = this.mContext.getString(R.string.moving_ui_chart_label_lowest);
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
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        sparseArray.put(0, new YAxisData(75.0f, ""));
        sparseArray.put(1, new YAxisData(80.0f, "80%"));
        sparseArray.put(2, new YAxisData(90.0f, "90%"));
        sparseArray.put(3, new YAxisData(100.0f, "100%"));
        return sparseArray;
    }

    public final void setDataList$moving_ui_release(@NotNull SparseArray<ChartData> sparseArray) {
        this.dataList = sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldDrawGoalLine() {
        return true;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean shouldShow() {
        return true;
    }
}
