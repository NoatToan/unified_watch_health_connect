package com.ximalaya.ting.android.opensdk.model.column;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ColumnList extends XimalayaResponse {
    private List<Column> columns;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    public List<Column> getColumns() {
        return this.columns;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setColumns(List<Column> list) {
        this.columns = list;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }

    public String toString() {
        return "ColumnList [totalPage=" + this.totalPage + ", totalCount=" + this.totalCount + ", currentPage=" + this.currentPage + ", columns=" + this.columns + "]";
    }
}
