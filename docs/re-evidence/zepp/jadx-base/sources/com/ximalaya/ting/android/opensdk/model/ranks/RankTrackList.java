package com.ximalaya.ting.android.opensdk.model.ranks;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class RankTrackList extends XimalayaResponse {

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    @SerializedName("tracks")
    private List<Track> trackList;

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public List<Track> getTrackList() {
        return this.trackList;
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

    public void setTrackList(List<Track> list) {
        this.trackList = list;
    }

    public String toString() {
        return "RankTrackList [totalPage=" + this.totalPage + ", totalCount=" + this.totalCount + ", currentPage=" + this.currentPage + ", trackList=" + this.trackList + "]";
    }
}
