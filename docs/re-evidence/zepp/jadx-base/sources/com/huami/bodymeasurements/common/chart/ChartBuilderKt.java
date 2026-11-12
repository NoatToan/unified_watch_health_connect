package com.huami.bodymeasurements.common.chart;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000*\"\u0010\u0005\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00032\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u0003*\"\u0010\t\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\"\u0010\u000b\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006*\"\u0010\f\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00032\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u0003*,\u0010\u000f\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0000`\r0\u00062\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\u000ej\b\u0012\u0004\u0012\u00020\u0000`\r0\u0006*\"\u0010\u0012\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0006¨\u0006\u0013"}, d2 = {"", "alpha", "changeAlpha", "Lkotlin/Function1;", "", "BarDataColorGetter", "Lkotlin/Function0;", "", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "BarPointsGetter", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "PointsGetter", "SubPointColorGetter", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "SubPointIndexListGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "XAxisDataGetter", "common_release"}, k = 2, mv = {1, 5, 1})
public final class ChartBuilderKt {
    public static final int changeAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
