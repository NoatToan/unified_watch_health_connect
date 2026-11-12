package com.xiaomi.hm.health.healthdata.ui.view;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\u00198&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR*\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "", "getValueOffset", "()F", "valueOffset", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "getShowIntersectionPoint", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface BarChartBuilder<T> {
    @NotNull
    HMColor[] getBarColors();

    @Nullable
    Function1<Float, Integer> getBarDataColorGetter();

    @Nullable
    Integer getBarMaxSize();

    @NotNull
    List<BarChartVo<T>> getPoints();

    boolean getShowIntersectionPoint();

    float getValueOffset();

    @NotNull
    SparseArray<XAxisData> getXAxisData();

    @NotNull
    SparseArray<YAxisData> getYAxisData();

    boolean getYScaleLongDash();

    void setPoints(@NotNull List<BarChartVo<T>> list);

    void setShowIntersectionPoint(boolean z);

    void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray);
}
