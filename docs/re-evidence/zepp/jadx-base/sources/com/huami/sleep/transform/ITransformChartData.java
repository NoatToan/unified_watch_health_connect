package com.huami.sleep.transform;

import com.huami.chart.data.ChartDataList;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/sleep/transform/ITransformChartData;", "", "", HTTP.CONTENT_RANGE_BYTES, "", "startMin", "endMin", "Lcom/huami/chart/data/ChartDataList;", "transformToChartData", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ITransformChartData {
    @NotNull
    ChartDataList transformToChartData(@NotNull byte[] bytes, int startMin, int endMin);
}
