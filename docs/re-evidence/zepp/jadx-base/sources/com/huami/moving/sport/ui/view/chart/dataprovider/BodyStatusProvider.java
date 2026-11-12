package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.content.Context;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u00104\u001a\u000203\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010!R(\u00102\u001a\b\u0012\u0004\u0012\u00020+0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006>"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/dataprovider/BodyStatusProvider;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "", "getGoalValue", "", "isEmpty", "Lcom/huami/chart/data/ChartDataList;", "getDataList", "shouldDrawGoalLine", "", "", "getFirstValueLabel", "()[Ljava/lang/String;", "getSecondValueLabel", "getThirdValueLabel", "getForthValueLabel", "getMinValue", "getMaxValue", "getNoDataStr", "shouldShow", "getDataUnit", "", "a", LogUtil.I, "mMaxValue", "b", "mMinValue", "c", "Z", "dailyKm", "", GoogleApiAvailabilityLight.a, "[F", "valueArrayX", "e", "disCount", "f", "isDataEmpty", "Lcom/huami/chart/data/ChartData;", "g", "Landroid/util/SparseArray;", "getDataList$moving_ui_release", "()Landroid/util/SparseArray;", "setDataList$moving_ui_release", "(Landroid/util/SparseArray;)V", "dataList", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "data", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, TdmillHmFragment.ARG_IS_METRIC, "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;Landroid/content/Context;Z)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BodyStatusProvider extends BaseDataProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mMaxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mMinValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean dailyKm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float[] valueArrayX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int disCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDataEmpty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private SparseArray<ChartData> dataList;

    public BodyStatusProvider(@NotNull Trackrecord trackrecord, @Nullable ParsedSportDetailData parsedSportDetailData, @NotNull BaseType baseType, @NotNull Context context, boolean z) {
        super(trackrecord, parsedSportDetailData, baseType, context, z);
        this.mMaxValue = 20;
        this.mMinValue = -20;
        this.dailyKm = true;
        this.dataList = new SparseArray<>();
        int i = 0;
        if (this.mTrackData.getDailyPerformanceList().size() > 0) {
            CommonTimeValuePoint commonTimeValuePoint = this.mTrackData.getDailyPerformanceList().get(0);
            if (commonTimeValuePoint.getAbsoluteTime() == 100) {
                this.dailyKm = true;
            } else {
                long absoluteTime = commonTimeValuePoint.getAbsoluteTime();
                if (155 <= absoluteTime && absoluteTime <= 165) {
                    this.dailyKm = false;
                }
            }
        }
        Trackrecord trackrecord2 = this.mTrackrecord;
        if (trackrecord2 == null) {
            return;
        }
        Integer distance = this.dailyKm ? trackrecord2.getDistance() : Integer.valueOf((int) (((double) trackrecord2.getDistance().intValue()) * 0.6213712d));
        int iIntValue = distance.intValue() % 1000 == 0 ? distance.intValue() / 1000 : 1 + (distance.intValue() / 1000);
        this.disCount = iIntValue;
        this.valueArrayX = new float[5];
        float f = iIntValue / (5 - 1.0f);
        while (true) {
            int i2 = i + 1;
            float f2 = i == 4 ? this.disCount : i * f;
            float[] fArr = this.valueArrayX;
            Objects.requireNonNull(fArr);
            fArr[i] = new BigDecimal(f2).setScale(2, 4).floatValue();
            if (i2 >= 5) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public ChartDataList getDataList() {
        ArrayList arrayList = new ArrayList();
        for (CommonTimeValuePoint commonTimeValuePoint : this.mTrackData.getDailyPerformanceList()) {
            arrayList.add(new CommonTimeValuePoint(!this.dailyKm ? new BigDecimal(String.valueOf(commonTimeValuePoint.getAbsoluteTime() * 0.6213712d)).setScale(0, 4).longValue() : commonTimeValuePoint.getAbsoluteTime(), commonTimeValuePoint.getValue()));
        }
        ChartDataConverter.getInstance().convertTo(arrayList, this.dataList, 0L, this.mBaseType, this.mContext);
        ChartDataList chartDataList = new ChartDataList(this.dataList);
        chartDataList.setStart(0);
        chartDataList.setEnd(this.disCount * 100);
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
        return new String[0];
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getForthValueLabel() {
        return new String[0];
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    public float getGoalValue() {
        return 0.0f;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMaxValue() {
        return this.mMaxValue;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public float getMinValue() {
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
        return new String[0];
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    @NotNull
    public String[] getThirdValueLabel() {
        return new String[0];
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider, com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        float[] fArr = this.valueArrayX;
        Objects.requireNonNull(fArr);
        int length = fArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                float[] fArr2 = this.valueArrayX;
                Objects.requireNonNull(fArr2);
                float f = fArr2[i];
                String strValueOf = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? "0" : String.valueOf(f);
                int i3 = (int) (f * 100);
                sparseArray.put(i3, new XAxisData(i3, strValueOf));
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.IDataProvider
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        sparseArray.put(0, new YAxisData(-20.0f, "-20"));
        sparseArray.put(1, new YAxisData(-10.0f, "-10"));
        sparseArray.put(2, new YAxisData(-5.0f, "-5"));
        sparseArray.put(3, new YAxisData(5.0f, "+5"));
        sparseArray.put(4, new YAxisData(10.0f, "+10"));
        sparseArray.put(5, new YAxisData(20.0f, "+20"));
        this.isDataEmpty = this.dataList.size() == 0;
        return sparseArray;
    }

    @Override // com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider
    public boolean isEmpty() {
        return false;
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
