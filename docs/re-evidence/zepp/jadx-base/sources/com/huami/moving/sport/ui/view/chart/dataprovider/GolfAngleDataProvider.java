package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B1\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00065"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/GolfAngleDataProvider;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getGoalValue", "Lcom/huami/chart/data/ChartDataList;", "getDataList", "", "shouldDrawGoalLine", "", "", "getFirstValueLabel", "()[Ljava/lang/String;", "getSecondValueLabel", "getThirdValueLabel", "getForthValueLabel", "getMinValue", "getMaxValue", "getNoDataStr", "shouldShow", "getDataUnit", "a", "F", "mMaxValue", "b", "mMinValue", "c", "Z", "isDataEmpty", "Lcom/huami/chart/data/ChartData;", GoogleApiAvailabilityLight.a, "Landroid/util/SparseArray;", "getDataList$moving_ui_release", "()Landroid/util/SparseArray;", "setDataList$moving_ui_release", "(Landroid/util/SparseArray;)V", "dataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "data", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, TdmillHmFragment.ARG_IS_METRIC, "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;Landroid/content/Context;Z)V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GolfAngleDataProvider extends BaseDataProvider {
    public static final int ANGLE_OFFSET = 50;
    public static final int SWINGS_2 = 2;
    public static final int SWINGS_9 = 9;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float mMaxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float mMinValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isDataEmpty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private SparseArray<ChartData> dataList;

    public GolfAngleDataProvider(@NotNull Trackrecord trackrecord, @Nullable ParsedSportDetailData parsedSportDetailData, @NotNull BaseType baseType, @NotNull Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.dataList = new SparseArray<>();
        this.mMaxValue = this.mTrackData.getGolfAnglePeak().getMaxValue();
        this.mMinValue = this.mTrackData.getGolfAnglePeak().getMinValue();
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public ChartDataList getDataList() {
        ArrayList arrayList = new ArrayList();
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getGolfAngleList()) {
            arrayList.add(new CommonTimeValuePoint(commonTimeValuePoint.getAbsoluteTime(), commonTimeValuePoint.getValue() + 50));
        }
        ChartDataConverter.getInstance().convertToByDataSize(arrayList, this.dataList, this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.dataList);
        if (this.mTrackrecord.getTotalSwing() == 1) {
            chartDataList.setStart(0);
            chartDataList.setEnd(2);
        } else {
            chartDataList.setStart(1);
            chartDataList.setEnd(this.mTrackrecord.getTotalSwing());
        }
        return chartDataList;
    }

    @NotNull
    public final SparseArray<ChartData> getDataList$moving_ui_release() {
        return this.dataList;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String getDataUnit() {
        return "";
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getFirstValueLabel() {
        String string;
        Trackrecord trackrecord = this.mTrackrecord;
        float averageAngle = trackrecord == null ? 0.0f : trackrecord.getAverageAngle();
        if (averageAngle >= -50.0f) {
            string = this.mContext.getString(R.string.moving_ui_percent, Integer.valueOf((int) NumberFormatter.format(averageAngle, 0, 4)));
        } else {
            string = this.mContext.getString(com.huami.moving.R.string.data_not_supported);
        }
        return new String[]{string, this.mContext.getString(R.string.moving_ui_chart_label_avg)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getForthValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        Trackrecord trackrecord = this.mTrackrecord;
        if (trackrecord == null) {
            return 0.0f;
        }
        return trackrecord.getAverageAngle();
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
        return this.mContext.getResources().getString(com.huami.moving.R.string.running_history_no_data);
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getSecondValueLabel() {
        String string;
        float f = this.mMaxValue;
        if (f >= -50.0f) {
            string = this.mContext.getString(R.string.moving_ui_percent, Integer.valueOf((int) NumberFormatter.format(f, 0, 4)));
        } else {
            string = this.mContext.getString(com.huami.moving.R.string.data_not_supported);
        }
        return new String[]{string, this.mContext.getString(R.string.moving_ui_chart_label_max)};
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @Nullable
    public String[] getThirdValueLabel() {
        return null;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider, com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int totalSwing = this.mTrackrecord.getTotalSwing();
        boolean z = false;
        if (totalSwing == 1) {
            sparseArray.put(0, new XAxisData(0, ""));
            sparseArray.put(1, new XAxisData(1, "1"));
            sparseArray.put(2, new XAxisData(2, ""));
        } else {
            if (2 <= totalSwing && totalSwing <= 9) {
                z = true;
            }
            if (z) {
                int totalSwing2 = this.mTrackrecord.getTotalSwing();
                sparseArray.put(1, new XAxisData(1, "1"));
                sparseArray.put(totalSwing2, new XAxisData(totalSwing2, String.valueOf(totalSwing2)));
            } else {
                int totalSwing3 = this.mTrackrecord.getTotalSwing();
                int i = ((totalSwing3 - 1) / 2) + 1;
                sparseArray.put(1, new XAxisData(1, "1"));
                sparseArray.put(i, new XAxisData(i, String.valueOf(i)));
                sparseArray.put(totalSwing3, new XAxisData(totalSwing3, String.valueOf(totalSwing3)));
            }
        }
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        float f = 1;
        float f2 = NumberFormatter.format(this.mMaxValue, 0, 4) + f;
        float f3 = NumberFormatter.format(this.mMinValue, 0, 4) - f;
        int i = this.yLabelSize;
        float f4 = (f2 - f3) / (i - 1.0f);
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                float f5 = NumberFormatter.format(i2 == this.yLabelSize - 1 ? f2 : (i2 * f4) + f3, 0, 4);
                sparseArray.put(i2, new YAxisData(f5 + 50, String.valueOf((int) f5)));
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return sparseArray;
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
