package com.huami.chart.data;

import android.util.SparseArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/chart/data/PieDataList;", "Lcom/huami/chart/data/BaseDataList;", "Lcom/huami/chart/data/ArcChartData;", "", "getSize", "", "calculateMinMax", "notifyDataMinMaxChanged", "Landroid/util/SparseArray;", "e", "Landroid/util/SparseArray;", "getList", "()Landroid/util/SparseArray;", "list", "<init>", "(Landroid/util/SparseArray;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class PieDataList extends BaseDataList<ArcChartData> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<ArcChartData> list;

    public PieDataList(@NotNull SparseArray<ArcChartData> sparseArray) {
        super(sparseArray);
        this.list = sparseArray;
    }

    @Override // com.huami.chart.data.BaseDataList
    public void calculateMinMax() {
        if (this.mDatas.size() == 0) {
            return;
        }
        SparseArray<T> sparseArray = this.mDatas;
        this.lastData = (T) sparseArray.valueAt(sparseArray.size() - 1);
        this.firstData = (T) this.mDatas.valueAt(0);
    }

    @NotNull
    public final SparseArray<ArcChartData> getList() {
        return this.list;
    }

    public final int getSize() {
        return this.mDatas.size();
    }

    @Override // com.huami.chart.data.BaseDataList
    public void notifyDataMinMaxChanged() {
    }
}
