package com.ximalaya.ting.android.opensdk.model.ranks;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class RankAlbumList extends XimalayaResponse {

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName(alternate = {"paid_albums"}, value = "albums")
    private List<Album> rankAlbumList;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    public int getCurrentPage() {
        return this.currentPage;
    }

    public List<Album> getRankAlbumList() {
        return this.rankAlbumList;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setRankAlbumList(List<Album> list) {
        this.rankAlbumList = list;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }

    public String toString() {
        return "RankAlbumList [totalPage=" + this.totalPage + ", totalCount=" + this.totalCount + ", currentPage=" + this.currentPage + ", rankAlbumList=" + this.rankAlbumList + "]";
    }
}
